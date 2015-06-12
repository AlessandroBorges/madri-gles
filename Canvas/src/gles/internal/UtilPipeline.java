/**
 * 
 */
package gles.internal;

import java.nio.Buffer;

/**
 * 
 * This class implements native methods from:<br>
 * <pre>
 * android.opengl.Visibility
 *    * computeBoundingSphere()
 *    * frustumCullSpheres()
 *    * visibilityTest()
 *        
 *  android.opengl.ETC1
 *      * encodeBlock()
 *      * decodeBlock()
 *      * getEncodedDataSize()
 *      * encodeImage()
 *      * decodeImage()
 *      * formatHeader()
 *      * isValid()
 *      * getWidth()
 *      * getHeigh()
 * </pre>
 * @author Alessandro Borges
 *
 */
public class UtilPipeline implements Pipeline {
    //@off
    /*JNI
      
      #include <math.h>
      #include <stdio.h>
      #include <stdlib.h>
      #include <string.h>
      #include <assert.h>
      
      #include <ETC1/etc1.h>
      #include "poly.h"      
      
static inline
void mx4transform(float x, float y, float z, float w, const float* pM, float* pDest) {
    pDest[0] = pM[0 + 4 * 0] * x + pM[0 + 4 * 1] * y + pM[0 + 4 * 2] * z + pM[0 + 4 * 3] * w;
    pDest[1] = pM[1 + 4 * 0] * x + pM[1 + 4 * 1] * y + pM[1 + 4 * 2] * z + pM[1 + 4 * 3] * w;
    pDest[2] = pM[2 + 4 * 0] * x + pM[2 + 4 * 1] * y + pM[2 + 4 * 2] * z + pM[2 + 4 * 3] * w;
    pDest[3] = pM[3 + 4 * 0] * x + pM[3 + 4 * 1] * y + pM[3 + 4 * 2] * z + pM[3 + 4 * 3] * w;
}

class MallocHelper {
public:
    MallocHelper() {
        mData = 0;
    }

    ~MallocHelper() {
        if (mData != 0) {
            free(mData);
        }
    }

    void* alloc(size_t size) {
        mData = malloc(size);
        return mData;
    }

private:
    void* mData;
};


static
int visibilityTest(float* pWS, float* pPositions, int positionsLength,
        unsigned short* pIndices, int indexCount) {
    MallocHelper mallocHelper;
    int result = POLY_CLIP_OUT;
    float* pTransformed = 0;
    int transformedIndexCount = 0;

    if ( indexCount < 3 ) {
        return POLY_CLIP_OUT;
    }

    // Find out how many vertices we need to transform
    // We transform every vertex between the min and max indices, inclusive.
    // This is OK for the data sets we expect to use with this function, but
    // for other loads it might be better to use a more sophisticated vertex
    // cache of some sort.

    int minIndex = 65536;
    int maxIndex = -1;
    for(int i = 0; i < indexCount; i++) {
        int index = pIndices[i];
        if ( index < minIndex ) {
            minIndex = index;
        }
        if ( index > maxIndex ) {
            maxIndex = index;
        }
    }

    if ( maxIndex * 3 > positionsLength) {
        return -1;
    }

    transformedIndexCount = maxIndex - minIndex + 1;
    pTransformed = (float*) mallocHelper.alloc(transformedIndexCount * 4 * sizeof(float));

    if (pTransformed == 0 ) {
        return -2;
    }

    // Transform the vertices
    {
        const float* pSrc = pPositions + 3 * minIndex;
        float* pDst = pTransformed;
        for (int i = 0; i < transformedIndexCount; i++, pSrc += 3, pDst += 4) {
            mx4transform(pSrc[0], pSrc[1], pSrc[2], 1.0f, pWS,  pDst);
        }
    }

    // Clip the triangles

    Poly poly;
    float* pDest = & poly.vert[0].sx;
    for (int i = 0; i < indexCount; i += 3) {
        poly.n = 3;
        memcpy(pDest    , pTransformed + 4 * (pIndices[i    ] - minIndex), 4 * sizeof(float));
        memcpy(pDest + 4, pTransformed + 4 * (pIndices[i + 1] - minIndex), 4 * sizeof(float));
        memcpy(pDest + 8, pTransformed + 4 * (pIndices[i + 2] - minIndex), 4 * sizeof(float));
        result = poly_clip_to_frustum(&poly);
        if ( result != POLY_CLIP_OUT) {
            return result;
        }
    }

    return result;
}

static void doThrowIAE(JNIEnv* env, const char* msg) {
    jniThrowException(env, "java/lang/IllegalArgumentException", msg);
}

template<class JArray, class T>
class ArrayHelper {
public:
    ArrayHelper(JNIEnv* env, JArray ref, jint offset, jint minSize) {
        mEnv = env;
        mRef = ref;
        mOffset = offset;
        mMinSize = minSize;
        mBase = 0;
        mReleaseParam = JNI_ABORT;
    }

    ~ArrayHelper() {
        if (mBase) {
            mEnv->ReleasePrimitiveArrayCritical(mRef, mBase, mReleaseParam);
        }
    }

    // We seperate the bounds check from the initialization because we want to
    // be able to bounds-check multiple arrays, and we can't throw an exception
    // after we've called GetPrimitiveArrayCritical.

    // Return true if the bounds check succeeded
    // Else instruct the runtime to throw an exception

    bool check() {
        if ( ! mRef) {
            doThrowIAE(mEnv, "array == null");
            return false;
        }
        if ( mOffset < 0) {
            doThrowIAE(mEnv, "offset < 0");
            return false;
        }
        mLength = mEnv->GetArrayLength(mRef) - mOffset;
        if (mLength < mMinSize ) {
            doThrowIAE(mEnv, "length - offset < n");
            return false;
        }
        return true;
    }

    // Bind the array.

    void bind() {
        mBase = (T*) mEnv->GetPrimitiveArrayCritical(mRef, (jboolean *) 0);
        mData = mBase + mOffset;
    }

    void commitChanges() {
        mReleaseParam = 0;
    }

    T* mData;
    int mLength;

private:
    T* mBase;
    JNIEnv* mEnv;
    JArray mRef;
    jint mOffset;
    jint mMinSize;
    int mReleaseParam;
};

typedef ArrayHelper<jfloatArray, float> FloatArrayHelper;
typedef ArrayHelper<jcharArray, unsigned short> UnsignedShortArrayHelper;
typedef ArrayHelper<jintArray, int> IntArrayHelper;
typedef ArrayHelper<jbyteArray, unsigned char> ByteArrayHelper;

inline float distance2(float x, float y, float z) {
    return x * x + y * y + z * z;
}

inline float distance(float x, float y, float z) {
    return sqrtf(distance2(x, y, z));
}

static
void util_computeBoundingSphere(JNIEnv *env, jclass clazz,
        jfloatArray positions_ref, jint positionsOffset, jint positionsCount,
        jfloatArray sphere_ref, jint sphereOffset) {
    FloatArrayHelper positions(env, positions_ref, positionsOffset, 0);
    FloatArrayHelper sphere(env, sphere_ref, sphereOffset, 4);

    bool checkOK = positions.check() && sphere.check();
        if (! checkOK) {
        return;
    }

    positions.bind();
    sphere.bind();

    if ( positionsCount < 1 ) {
        doThrowIAE(env, "positionsCount < 1");
        return;
    }

    const float* pSrc = positions.mData;

    // find bounding box
    float x0 = *pSrc++;
    float x1 = x0;
    float y0 = *pSrc++;
    float y1 = y0;
    float z0 = *pSrc++;
    float z1 = z0;

    for(int i = 1; i < positionsCount; i++) {
        {
            float x = *pSrc++;
            if (x < x0) {
                x0 = x;
            }
            else if (x > x1) {
                x1 = x;
            }
        }
        {
            float y = *pSrc++;
            if (y < y0) {
                y0 = y;
            }
            else if (y > y1) {
                y1 = y;
            }
        }
        {
            float z = *pSrc++;
            if (z < z0) {
                z0 = z;
            }
            else if (z > z1) {
                z1 = z;
            }
        }
    }

    // Because we know our input meshes fit pretty well into bounding boxes,
    // just take the diagonal of the box as defining our sphere.
    float* pSphere = sphere.mData;
    float dx = x1 - x0;
    float dy = y1 - y0;
    float dz = z1 - z0;
    *pSphere++ = x0 + dx * 0.5f;
    *pSphere++ = y0 + dy * 0.5f;
    *pSphere++ = z0 + dz * 0.5f;
    *pSphere++ = distance(dx, dy, dz) * 0.5f;

    sphere.commitChanges();
}

static void normalizePlane(float* p) {
    float rdist = 1.0f / distance(p[0], p[1], p[2]);
    for(int i = 0; i < 4; i++) {
        p[i] *= rdist;
    }
}

static inline float dot3(float x0, float y0, float z0, float x1, float y1, float z1) {
    return x0 * x1 + y0 * y1 + z0 * z1;
}

static inline float signedDistance(const float* pPlane, float x, float y, float z) {
    return dot3(pPlane[0], pPlane[1], pPlane[2], x, y, z) + pPlane[3];
}

// Return true if the sphere intersects or is inside the frustum

static bool sphereHitsFrustum(const float* pFrustum, const float* pSphere) {
    float x = pSphere[0];
    float y = pSphere[1];
    float z = pSphere[2];
    float negRadius = -pSphere[3];
    for (int i = 0; i < 6; i++, pFrustum += 4) {
        if (signedDistance(pFrustum, x, y, z) <= negRadius) {
            return false;
        }
    }
    return true;
}

static void computeFrustum(const float* m, float* f) {
    float m3 = m[3];
    float m7 = m[7];
    float m11 = m[11];
    float m15 = m[15];
    // right
    f[0] = m3  - m[0];
    f[1] = m7  - m[4];
    f[2] = m11 - m[8];
    f[3] = m15 - m[12];
    normalizePlane(f);
    f+= 4;

    // left
    f[0] = m3  + m[0];
    f[1] = m7  + m[4];
    f[2] = m11 + m[8];
    f[3] = m15 + m[12];
    normalizePlane(f);
    f+= 4;

    // top
    f[0] = m3  - m[1];
    f[1] = m7  - m[5];
    f[2] = m11 - m[9];
    f[3] = m15 - m[13];
    normalizePlane(f);
    f+= 4;

    // bottom
    f[0] = m3  + m[1];
    f[1] = m7  + m[5];
    f[2] = m11 + m[9];
    f[3] = m15 + m[13];
    normalizePlane(f);
    f+= 4;

    // far
    f[0] = m3  - m[2];
    f[1] = m7  - m[6];
    f[2] = m11 - m[10];
    f[3] = m15 - m[14];
    normalizePlane(f);
    f+= 4;

    // near
    f[0] = m3  + m[2];
    f[1] = m7  + m[6];
    f[2] = m11 + m[10];
    f[3] = m15 + m[14];
    normalizePlane(f);
}

static
jint util_frustumCullSpheres(JNIEnv *env, jclass clazz,
        jfloatArray mvp_ref, jint mvpOffset,
        jfloatArray spheres_ref, jint spheresOffset, jint spheresCount,
        jintArray results_ref, jint resultsOffset, jint resultsCapacity) {
    float frustum[6*4];
    int outputCount;
    int* pResults;
    float* pSphere;
    FloatArrayHelper mvp(env, mvp_ref, mvpOffset, 16);
    FloatArrayHelper spheres(env, spheres_ref, spheresOffset, spheresCount * 4);
    IntArrayHelper results(env, results_ref, resultsOffset, resultsCapacity);

    bool initializedOK = mvp.check() && spheres.check() && results.check();
        if (! initializedOK) {
        return -1;
    }

    mvp.bind();
    spheres.bind();
    results.bind();

    computeFrustum(mvp.mData, frustum);

    // Cull the spheres

    pSphere = spheres.mData;
    pResults = results.mData;
    outputCount = 0;
    for(int i = 0; i < spheresCount; i++, pSphere += 4) {
        if (sphereHitsFrustum(frustum, pSphere)) {
            if (outputCount < resultsCapacity) {
                *pResults++ = i;
            }
            outputCount++;
        }
    }
    results.commitChanges();
    return outputCount;
}

//
// public native int visibilityTest(float[] ws, int wsOffset,
//                                  float[] positions, int positionsOffset,
//                                  char [] indices, int indicesOffset, int indexCount);


static
jint util_visibilityTest(JNIEnv *env, jclass clazz,
        jfloatArray ws_ref, jint wsOffset,
        jfloatArray positions_ref, jint positionsOffset,
        jcharArray indices_ref, jint indicesOffset, jint indexCount) {

    FloatArrayHelper ws(env, ws_ref, wsOffset, 16);
    FloatArrayHelper positions(env, positions_ref, positionsOffset, 0);
    UnsignedShortArrayHelper indices(env, indices_ref, indicesOffset, 0);

    bool checkOK = ws.check() && positions.check() && indices.check();
    if (! checkOK) {
        // Return value will be ignored, because an exception has been thrown.
        return -1;
    }

    if (indices.mLength < indexCount) {
        doThrowIAE(env, "length < offset + indexCount");
        return -1;
    }

    ws.bind();
    positions.bind();
    indices.bind();

    return visibilityTest(ws.mData,
            positions.mData, positions.mLength,
            indices.mData, indexCount);
}

#define I(_i, _j) ((_j)+ 4*(_i))

static
void multiplyMM(float* r, const float* lhs, const float* rhs)
{
    for (int i=0 ; i<4 ; i++) {
        register const float rhs_i0 = rhs[ I(i,0) ];
        register float ri0 = lhs[ I(0,0) ] * rhs_i0;
        register float ri1 = lhs[ I(0,1) ] * rhs_i0;
        register float ri2 = lhs[ I(0,2) ] * rhs_i0;
        register float ri3 = lhs[ I(0,3) ] * rhs_i0;
        for (int j=1 ; j<4 ; j++) {
            register const float rhs_ij = rhs[ I(i,j) ];
            ri0 += lhs[ I(j,0) ] * rhs_ij;
            ri1 += lhs[ I(j,1) ] * rhs_ij;
            ri2 += lhs[ I(j,2) ] * rhs_ij;
            ri3 += lhs[ I(j,3) ] * rhs_ij;
        }
        r[ I(i,0) ] = ri0;
        r[ I(i,1) ] = ri1;
        r[ I(i,2) ] = ri2;
        r[ I(i,3) ] = ri3;
    }
}

static
void util_multiplyMM(JNIEnv *env, jclass clazz,
    jfloatArray result_ref, jint resultOffset,
    jfloatArray lhs_ref, jint lhsOffset,
    jfloatArray rhs_ref, jint rhsOffset) {

    FloatArrayHelper resultMat(env, result_ref, resultOffset, 16);
    FloatArrayHelper lhs(env, lhs_ref, lhsOffset, 16);
    FloatArrayHelper rhs(env, rhs_ref, rhsOffset, 16);

    bool checkOK = resultMat.check() && lhs.check() && rhs.check();

    if ( !checkOK ) {
        return;
    }

    resultMat.bind();
    lhs.bind();
    rhs.bind();

    multiplyMM(resultMat.mData, lhs.mData, rhs.mData);

    resultMat.commitChanges();
}

static
void multiplyMV(float* r, const float* lhs, const float* rhs)
{
    mx4transform(rhs[0], rhs[1], rhs[2], rhs[3], lhs, r);
}

static
void util_multiplyMV(JNIEnv *env, jclass clazz,
    jfloatArray result_ref, jint resultOffset,
    jfloatArray lhs_ref, jint lhsOffset,
    jfloatArray rhs_ref, jint rhsOffset) {

    FloatArrayHelper resultV(env, result_ref, resultOffset, 4);
    FloatArrayHelper lhs(env, lhs_ref, lhsOffset, 16);
    FloatArrayHelper rhs(env, rhs_ref, rhsOffset, 4);

    bool checkOK = resultV.check() && lhs.check() && rhs.check();

    if ( !checkOK ) {
        return;
    }

    resultV.bind();
    lhs.bind();
    rhs.bind();

    multiplyMV(resultV.mData, lhs.mData, rhs.mData);

    resultV.commitChanges();
}

     */

    /* (non-Javadoc)
     * @see gles.internal.Pipeline#getPipelineInstance()
     */
    @Override
    public Pipeline getPipelineInstance() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Test whether a given triangle mesh is visible on the screen. The mesh
     * is specified as an indexed triangle list.
     *
     * @param ws the world space to screen space transform matrix, as an OpenGL
     * column matrix.
     * @param wsOffset an index into the ws array where the data starts.
     * @param positions the vertex positions (x, y, z).
     * @param positionsOffset the index in the positions array where the data
     *        starts.
     * @param indices the indices of the triangle list. The indices are
     * expressed as chars because they are unsigned 16-bit values.
     * @param indicesOffset the index in the indices array where the index data
     *        starts.
     * @param indexCount the number of indices in use. Typically a multiple of
     * three. If not a multiple of three, the remaining one or two indices will
     * be ignored.
     * @return 2 if all of the mesh is visible, 1 if some part of the mesh is
     *         visible, 0 if no part is visible.
     *
     * @throws IllegalArgumentException if ws is null, wsOffset < 0,
     * positions is null, positionsOffset < 0, indices is null,
     * indicesOffset < 0, indicesOffset > indices.length - indexCount
     */
    public static native int visibilityTest(float[] ws, int wsOffset,
                                           float[] positions, int positionsOffset, 
                                           char[] indices, int indicesOffset, 
                                           int indexCount);/*MANUAL
            return util_visibilityTest(env, clazz,
                                       ws, wsOffset,
                                       positions, positionsOffset,
                                       indices, indicesOffset, 
                                       indexCount);            
            */

    /**
     * Given an OpenGL ES ModelView-Projection matrix (which implicitly
     * describes a frustum) and a list of spheres, determine which spheres
     * intersect the frustum.
     * <p>
     * A ModelView-Projection matrix can be computed by multiplying the
     * a Projection matrix by the a ModelView matrix (in that order.). There
     * are several possible ways to obtain the current ModelView and
     * Projection matrices. The most generally applicable way is to keep
     * track of the current matrices in application code. If that is not
     * convenient, there are two optional OpenGL ES extensions which may
     * be used to read the current matrices from OpenGL ES:
     * <ul>
     * <li>GL10Ext.glQueryMatrixxOES
     * <li>GL11.GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES and
     * GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES
     * </ul>
     * The problem with reading back the matrices is that your application
     * will only work with devices that support the extension(s) that
     * it uses.
     * <p>
     * A frustum is a six-sided truncated pyramid that defines the portion of
     * world space that is visible in the view.
     * <p>
     * Spheres are described as four floating point values: x, y, z, and r, in
     * world-space coordinates. R is the radius of the sphere.
     * <p>
     * @param mvp a float array containing the mode-view-projection matrix
     * @param mvpOffset The offset of the mvp data within the mvp array.
     * @param spheres a float array containing the sphere data.
     * @param spheresOffset an offset into the sphere array where the sphere
     *        data starts
     * @param spheresCount the number of spheres to cull.
     * @param results an integer array containing the indices of the spheres
     * that are either contained entirely within or intersect the frustum.
     * @param resultsOffset an offset into the results array where the results
     *        start.
     * @param resultsCapacity the number of array elements available for storing
     *        results.
     * @return the number of spheres that intersected the frustum. Can be
     * larger than resultsCapacity, in which case only the first resultsCapacity
     * results are written into the results array.
     *
     * @throws IllegalArgumentException if mvp is null, mvpOffset < 0,
     * mvpOffset > mvp.length - 16, spheres is null, spheresOffset < 0,
     * spheresOffset > spheres.length - sphereCount,
     * results is null, resultsOffset < 0, resultsOffset > results.length -
     * resultsCapacity.
     */
    public static native int frustumCullSpheres(float[] mvp, int mvpOffset,
            float[] spheres, int spheresOffset, int spheresCount,
            int[] results, int resultsOffset, int resultsCapacity);/*MANUAL
            
            return util_frustumCullSpheres(env, clazz,
                                           mvp, mvpOffset,
                                           spheres, spheresOffset, spheresCount,
                                           results, resultsOffset, resultsCapacity);            
            */

    /**
     * Compute a bounding sphere for a set of points. It is approximately the
     * minimal bounding sphere of an axis-aligned box that bounds the points.
     *
     * @param positions positions in x, y, z triples
     * @param positionsOffset offset into positions array
     * @param positionsCount number of position triples to process
     * @param sphere array containing the output as (x, y, z, r)
     * @param sphereOffset offset where the sphere data will be written
     *
     * @throws IllegalArgumentException if positions is null,
     * positionsOffset < 0, positionsOffset > positions.length - positionsCount,
     * sphere is null, sphereOffset < 0, sphereOffset > sphere.length - 4.
     */
    public static native void computeBoundingSphere(float[] positions, int positionsOffset, 
                                                    int positionsCount, 
                                                    float[] sphere, int sphereOffset);/*MANUAL
            
            util_computeBoundingSphere(env, clazz,
                                       positions, positionsOffset, 
                                       positionsCount,
                                       sphere, sphereOffset); 
            
            */

    /**
     * Encode a block of pixels.
     *
     * @param in a native order direct buffer of size DECODED_BLOCK_SIZE that represent a
     * 4 x 4 square of 3-byte pixels in form R, G, B. Byte (3 * (x + 4 * y) is the R
     * value of pixel (x, y).
     *
     * @param validPixelMask is a 16-bit mask where bit (1 << (x + y * 4)) indicates whether
     * the corresponding (x,y) pixel is valid. Invalid pixel color values are ignored when compressing.
     *
     * @param out a native order direct buffer of size ENCODED_BLOCK_SIZE that receives the
     * ETC1 compressed version of the data.
     *
     */
    public static native void encodeBlock(Buffer in, int inOffset, 
                                          int validPixelMask, 
                                          Buffer out, int outOffset);/*
                                          
            etc1_encode_block((etc1_byte*) (in + inOffset), 
                              validPixelMask,
                              (etc1_byte*) (out + outOffset));
       */

    /**
     * Decode a block of pixels.
     *
     * @param in a native order direct buffer of size ENCODED_BLOCK_SIZE that contains the
     * ETC1 compressed version of the data.
     *
     * @param out a native order direct buffer of size DECODED_BLOCK_SIZE that will receive
     * the decoded data. The data represents a
     * 4 x 4 square of 3-byte pixels in form R, G, B. Byte (3 * (x + 4 * y) is the R
     * value of pixel (x, y).
     */
    public static native void decodeBlock(Buffer in, int inOffset,  Buffer out, int outOffset);/*
        etc1_decode_block((etc1_byte*) (in + inOffset), 
                          (etc1_byte*) (out + outOffset));
    
    */

    /**
     * Return the size of the encoded image data (does not include size of PKM header).
     */
    public static native int getEncodedDataSize(int width, int height);/*
        return (jint) etc1_get_encoded_data_size(width, height);
    */

    /**
     * Encode an entire image.
     * @param in a native order direct buffer of the image data. Formatted such that
     *           pixel (x,y) is at pIn + pixelSize * x + stride * y;
     * @param out a native order direct buffer of the encoded data.
     * Must be large enough to store entire encoded image.
     * @param pixelSize must be 2 or 3. 2 is an GL_UNSIGNED_SHORT_5_6_5 image,
     * 3 is a GL_BYTE RGB image.
     */
    public static native int encodeImage(Buffer in, int inOffset, 
                                          int width, int height,
                                          int pixelSize, int stride, 
                                          Buffer out, int outOffset);/*
           int result = etc1_encode_image((etc1_byte*) (in + inOffset),
                                          width, height, 
                                          pixelSize, stride,
                                          (etc1_byte*) (out + outOffset));
            return (jint) result;                               
                                          
      */

    /**
     * Decode an entire image.
     * @param in native order direct buffer of the encoded data.
     * @param out native order direct buffer of the image data. Will be written such that
     * pixel (x,y) is at pIn + pixelSize * x + stride * y. Must be
     * large enough to store entire image.
     * @param pixelSize must be 2 or 3. 2 is an GL_UNSIGNED_SHORT_5_6_5 image,
     * 3 is a GL_BYTE RGB image.
     */
    public static native int decodeImage(Buffer in, int inOffset, 
                                          Buffer out, int outOffset,
                                          int width, int height, 
                                          int pixelSize, int stride);/*
              int result = etc1_decode_image((etc1_byte*) (in + inOffset),
                                             (etc1_byte*) (out + outOffset),
                                             width, height, 
                                             pixelSize, stride);  
             return (jint) result;                          
      */

    /**
     * Format a PKM header
     * @param header native order direct buffer of the header.
     * @param width the width of the image in pixels.
     * @param height the height of the image in pixels.
     */
    public static native void formatHeader(Buffer header, int offset, int width, int height);/*
               etc1_pkm_format_header((etc1_byte*) (header + offset), width, height);
    */

    /**
     * Check if a PKM header is correctly formatted.
     * @param header native order direct buffer of the header.
     */
    public static native boolean isValid(Buffer header, int offset);/*
       jboolean result = etc1_pkm_is_valid((etc1_byte*) headerB.getData());       
       return result ? JNI_TRUE : JNI_FALSE;    
    */

    /**
     * Read the image width from a PKM header
     * @param header native order direct buffer of the header.
     */
    public static native int getWidth(Buffer header, int offset);/*
        int  result = etc1_pkm_get_width((etc1_byte*) headerB.getData());
        return (jint) result;
    */

    /**
     * Read the image height from a PKM header
     * @param header native order direct buffer of the header.
     */
    public static native int getHeight(Buffer header, int offset);/*
       jint result = etc1_pkm_get_height((etc1_byte*) headerB.getData());
       result result;    
    */

    
    
}
