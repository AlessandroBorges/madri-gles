#include <gles.internal.UtilPipeline.h>

//@line:33

      
      #include <math.h>
      #include <stdio.h>
      #include <stdlib.h>
      #include <string.h>
      #include <assert.h>
      
      #include <ETC1/etc1.h>
      #include "poly.h"      
      
      using namespace std;
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
    //jniThrowException(env, "java/lang/IllegalArgumentException", msg);
    jclass exClass;
    const char *className = "java/lang/IllegalArgumentException" ;

    exClass = env->FindClass(className );
    if ( exClass == NULL ) {
         
        //return throwNoClassDefError( env, className );
        printf("Exception class not found: %s ", className);
        return;
    }

    env->ThrowNew(exClass, msg );
    return;
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

//static
//void multiplyMM(float* r, const float* lhs, const float* rhs)
//{
//    for (int i=0 ; i<4 ; i++) {
//        register const float rhs_i0 = rhs[ I(i,0) ];
//        register float ri0 = lhs[ I(0,0) ] * rhs_i0;
//        register float ri1 = lhs[ I(0,1) ] * rhs_i0;
//        register float ri2 = lhs[ I(0,2) ] * rhs_i0;
//        register float ri3 = lhs[ I(0,3) ] * rhs_i0;
//        for (int j=1 ; j<4 ; j++) {
//            register const float rhs_ij = rhs[ I(i,j) ];
//            ri0 += lhs[ I(j,0) ] * rhs_ij;
//            ri1 += lhs[ I(j,1) ] * rhs_ij;
//            ri2 += lhs[ I(j,2) ] * rhs_ij;
//            ri3 += lhs[ I(j,3) ] * rhs_ij;
//        }
//        r[ I(i,0) ] = ri0;
//        r[ I(i,1) ] = ri1;
//        r[ I(i,2) ] = ri2;
//        r[ I(i,3) ] = ri3;
//    }
//}

//static
//void util_multiplyMM(JNIEnv *env, jclass clazz,
//    jfloatArray result_ref, jint resultOffset,
//    jfloatArray lhs_ref, jint lhsOffset,
//    jfloatArray rhs_ref, jint rhsOffset) {
//
//    FloatArrayHelper resultMat(env, result_ref, resultOffset, 16);
//    FloatArrayHelper lhs(env, lhs_ref, lhsOffset, 16);
//    FloatArrayHelper rhs(env, rhs_ref, rhsOffset, 16);
//
//    bool checkOK = resultMat.check() && lhs.check() && rhs.check();
//
//    if ( !checkOK ) {
//        return;
//    }
//
//    resultMat.bind();
//    lhs.bind();
//    rhs.bind();
//
//    multiplyMM(resultMat.mData, lhs.mData, rhs.mData);
//
//    resultMat.commitChanges();
//}

//static
//void multiplyMV(float* r, const float* lhs, const float* rhs)
//{
//    mx4transform(rhs[0], rhs[1], rhs[2], rhs[3], lhs, r);
//}

//static
//void util_multiplyMV(JNIEnv *env, jclass clazz,
//    jfloatArray result_ref, jint resultOffset,
//    jfloatArray lhs_ref, jint lhsOffset,
//    jfloatArray rhs_ref, jint rhsOffset) {
//
//    FloatArrayHelper resultV(env, result_ref, resultOffset, 4);
//    FloatArrayHelper lhs(env, lhs_ref, lhsOffset, 16);
//    FloatArrayHelper rhs(env, rhs_ref, rhsOffset, 4);
//
//    bool checkOK = resultV.check() && lhs.check() && rhs.check();
//
//    if ( !checkOK ) {
//        return;
//    }
//
//    resultV.bind();
//    lhs.bind();
//    rhs.bind();
//
//    multiplyMV(resultV.mData, lhs.mData, rhs.mData);
//
//    resultV.commitChanges();
//}

     JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_visibilityTest(JNIEnv* env, jclass clazz, jfloatArray ws, jint wsOffset, jfloatArray positions, jint positionsOffset, jcharArray indices, jint indicesOffset, jint indexCount) {

//@line:591

            return util_visibilityTest(env, clazz,
                                       ws, wsOffset,
                                       positions, positionsOffset,
                                       indices, indicesOffset, 
                                       indexCount);            
            
}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_frustumCullSpheres(JNIEnv* env, jclass clazz, jfloatArray mvp, jint mvpOffset, jfloatArray spheres, jint spheresOffset, jint spheresCount, jintArray results, jint resultsOffset, jint resultsCapacity) {

//@line:650

            
            return util_frustumCullSpheres(env, clazz,
                                           mvp, mvpOffset,
                                           spheres, spheresOffset, spheresCount,
                                           results, resultsOffset, resultsCapacity);            
            
}

JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_computeBoundingSphere(JNIEnv* env, jclass clazz, jfloatArray obj_positions, jint positionsOffset, jint positionsCount, jfloatArray obj_sphere, jint sphereOffset) {

//@line:674

            
            util_computeBoundingSphere(env, clazz,
                                       obj_positions, positionsOffset, 
                                       positionsCount,
                                       obj_sphere, sphereOffset); 
            
            
}

JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_encodeBlock(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jint validPixelMask, jobject obj_out, jint outOffset) {
	unsigned char* in = (unsigned char*)(obj_in?env->GetDirectBufferAddress(obj_in):0);
	unsigned char* out = (unsigned char*)(obj_out?env->GetDirectBufferAddress(obj_out):0);


//@line:699

                                          
            etc1_encode_block((etc1_byte*) (in + inOffset), 
                              validPixelMask,
                              (etc1_byte*) (out + outOffset));
       

}

JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_decodeBlock(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jobject obj_out, jint outOffset) {
	unsigned char* in = (unsigned char*)(obj_in?env->GetDirectBufferAddress(obj_in):0);
	unsigned char* out = (unsigned char*)(obj_out?env->GetDirectBufferAddress(obj_out):0);


//@line:717

        etc1_decode_block((etc1_byte*) (in + inOffset), 
                          (etc1_byte*) (out + outOffset));
    
    

}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getEncodedDataSize(JNIEnv* env, jclass clazz, jint width, jint height) {


//@line:726

        return (jint) etc1_get_encoded_data_size(width, height);
    

}

static inline jint wrapped_Java_gles_internal_UtilPipeline_encodeImage
(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jint width, jint height, jint pixelSize, jint stride, jobject obj_out, jint outOffset, unsigned char* in, unsigned char* out) {

//@line:742

           int result = etc1_encode_image((etc1_byte*) (in + inOffset),
                                          width, height, 
                                          pixelSize, stride,
                                          (etc1_byte*) (out + outOffset));
            return (jint) result;                               
                                          
      
}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_encodeImage(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jint width, jint height, jint pixelSize, jint stride, jobject obj_out, jint outOffset) {
	unsigned char* in = (unsigned char*)(obj_in?env->GetDirectBufferAddress(obj_in):0);
	unsigned char* out = (unsigned char*)(obj_out?env->GetDirectBufferAddress(obj_out):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_UtilPipeline_encodeImage(env, clazz, obj_in, inOffset, width, height, pixelSize, stride, obj_out, outOffset, in, out);


	return JNI_returnValue;
}

static inline jint wrapped_Java_gles_internal_UtilPipeline_decodeImage
(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jobject obj_out, jint outOffset, jint width, jint height, jint pixelSize, jint stride, unsigned char* in, unsigned char* out) {

//@line:763

              int result = etc1_decode_image((etc1_byte*) (in + inOffset),
                                             (etc1_byte*) (out + outOffset),
                                             width, height, 
                                             pixelSize, stride);  
             return (jint) result;                          
      
}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_decodeImage(JNIEnv* env, jclass clazz, jobject obj_in, jint inOffset, jobject obj_out, jint outOffset, jint width, jint height, jint pixelSize, jint stride) {
	unsigned char* in = (unsigned char*)(obj_in?env->GetDirectBufferAddress(obj_in):0);
	unsigned char* out = (unsigned char*)(obj_out?env->GetDirectBufferAddress(obj_out):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_UtilPipeline_decodeImage(env, clazz, obj_in, inOffset, obj_out, outOffset, width, height, pixelSize, stride, in, out);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_formatHeader(JNIEnv* env, jclass clazz, jobject obj_header, jint offset, jint width, jint height) {
	unsigned char* header = (unsigned char*)(obj_header?env->GetDirectBufferAddress(obj_header):0);


//@line:777

               etc1_pkm_format_header((etc1_byte*) (header + offset), width, height);
    

}

static inline jboolean wrapped_Java_gles_internal_UtilPipeline_isValid
(JNIEnv* env, jclass clazz, jobject obj_header, jint offset, unsigned char* header) {

//@line:785

       jboolean result = etc1_pkm_is_valid((etc1_byte*) (header + offset));       
       return result ? JNI_TRUE : JNI_FALSE;    
    
}

JNIEXPORT jboolean JNICALL Java_gles_internal_UtilPipeline_isValid(JNIEnv* env, jclass clazz, jobject obj_header, jint offset) {
	unsigned char* header = (unsigned char*)(obj_header?env->GetDirectBufferAddress(obj_header):0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_UtilPipeline_isValid(env, clazz, obj_header, offset, header);


	return JNI_returnValue;
}

static inline jint wrapped_Java_gles_internal_UtilPipeline_getWidth
(JNIEnv* env, jclass clazz, jobject obj_header, jint offset, unsigned char* header) {

//@line:794

        int  result = etc1_pkm_get_width((etc1_byte*) (header + offset));
        return (jint) result;
    
}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getWidth(JNIEnv* env, jclass clazz, jobject obj_header, jint offset) {
	unsigned char* header = (unsigned char*)(obj_header?env->GetDirectBufferAddress(obj_header):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_UtilPipeline_getWidth(env, clazz, obj_header, offset, header);


	return JNI_returnValue;
}

static inline jint wrapped_Java_gles_internal_UtilPipeline_getHeight
(JNIEnv* env, jclass clazz, jobject obj_header, jint offset, unsigned char* header) {

//@line:803

       jint result = etc1_pkm_get_height((etc1_byte*) (header + offset));
       return result;    
    
}

JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getHeight(JNIEnv* env, jclass clazz, jobject obj_header, jint offset) {
	unsigned char* header = (unsigned char*)(obj_header?env->GetDirectBufferAddress(obj_header):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_UtilPipeline_getHeight(env, clazz, obj_header, offset, header);


	return JNI_returnValue;
}

