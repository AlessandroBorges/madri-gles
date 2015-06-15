/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class gles_internal_UtilPipeline */

#ifndef _Included_gles_internal_UtilPipeline
#define _Included_gles_internal_UtilPipeline
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     gles_internal_UtilPipeline
 * Method:    visibilityTest
 * Signature: ([FI[FI[CII)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_visibilityTest
  (JNIEnv *, jclass, jfloatArray, jint, jfloatArray, jint, jcharArray, jint, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    frustumCullSpheres
 * Signature: ([FI[FII[III)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_frustumCullSpheres
  (JNIEnv *, jclass, jfloatArray, jint, jfloatArray, jint, jint, jintArray, jint, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    computeBoundingSphere
 * Signature: ([FII[FI)V
 */
JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_computeBoundingSphere
  (JNIEnv *, jclass, jfloatArray, jint, jint, jfloatArray, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    encodeBlock
 * Signature: (Ljava/nio/Buffer;IILjava/nio/Buffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_encodeBlock
  (JNIEnv *, jclass, jobject, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    decodeBlock
 * Signature: (Ljava/nio/Buffer;ILjava/nio/Buffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_decodeBlock
  (JNIEnv *, jclass, jobject, jint, jobject, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    getEncodedDataSize
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getEncodedDataSize
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    encodeImage
 * Signature: (Ljava/nio/Buffer;IIIIILjava/nio/Buffer;I)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_encodeImage
  (JNIEnv *, jclass, jobject, jint, jint, jint, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    decodeImage
 * Signature: (Ljava/nio/Buffer;ILjava/nio/Buffer;IIIII)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_decodeImage
  (JNIEnv *, jclass, jobject, jint, jobject, jint, jint, jint, jint, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    formatHeader
 * Signature: (Ljava/nio/Buffer;III)V
 */
JNIEXPORT void JNICALL Java_gles_internal_UtilPipeline_formatHeader
  (JNIEnv *, jclass, jobject, jint, jint, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    isValid
 * Signature: (Ljava/nio/Buffer;I)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_UtilPipeline_isValid
  (JNIEnv *, jclass, jobject, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    getWidth
 * Signature: (Ljava/nio/Buffer;I)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getWidth
  (JNIEnv *, jclass, jobject, jint);

/*
 * Class:     gles_internal_UtilPipeline
 * Method:    getHeight
 * Signature: (Ljava/nio/Buffer;I)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_UtilPipeline_getHeight
  (JNIEnv *, jclass, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif
