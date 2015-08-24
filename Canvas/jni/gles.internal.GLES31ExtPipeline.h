/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class gles_internal_GLES31ExtPipeline */

#ifndef _Included_gles_internal_GLES31ExtPipeline
#define _Included_gles_internal_GLES31ExtPipeline
#ifdef __cplusplus
extern "C" {
#endif
#undef gles_internal_GLES31ExtPipeline_GL_MAX_DEBUG_MESSAGE_LENGTH
#define gles_internal_GLES31ExtPipeline_GL_MAX_DEBUG_MESSAGE_LENGTH 37187L
/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLES31ExtClassInit
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLES31ExtClassInit
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLBlendBarrierKHR
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendBarrierKHR
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLDebugMessageControlKHR
 * Signature: (IIII[IIZ)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageControlKHR__IIII_3IIZ
  (JNIEnv *, jclass, jint, jint, jint, jint, jintArray, jint, jboolean);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLDebugMessageControlKHR
 * Signature: (IIIILjava/nio/IntBuffer;IZ)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageControlKHR__IIIILjava_nio_IntBuffer_2IZ
  (JNIEnv *, jclass, jint, jint, jint, jint, jobject, jint, jboolean);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLDebugMessageInsertKHR
 * Signature: (IIIILjava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageInsertKHR
  (JNIEnv *, jclass, jint, jint, jint, jint, jstring, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLDebugMessageCallbackKHR
 * Signature: (Landroid/opengl/GLES31Ext/DebugProcKHR;)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageCallbackKHR
  (JNIEnv *, jclass, jobject);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetDebugMessageLogKHR
 * Signature: (II[II[II[II[II[II[BI)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II_3II_3BI
  (JNIEnv *, jclass, jint, jint, jintArray, jint, jintArray, jint, jintArray, jint, jintArray, jint, jintArray, jint, jbyteArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetDebugMessageLogKHR
 * Signature: (ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/ByteBuffer;II)I
 */
JNIEXPORT jint JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_ByteBuffer_2II
  (JNIEnv *, jclass, jint, jobject, jint, jobject, jint, jobject, jint, jobject, jint, jobject, jint, jobject, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetDebugMessageLogKHR
 * Signature: (II[II[II[II[II)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint, jintArray, jint, jintArray, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetDebugMessageLogKHR
 * Signature: (IILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;ILjava/nio/IntBuffer;I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint, jobject, jint, jobject, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLPushDebugGroupKHR
 * Signature: (IIILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPushDebugGroupKHR
  (JNIEnv *, jclass, jint, jint, jint, jstring);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLPopDebugGroupKHR
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPopDebugGroupKHR
  (JNIEnv *, jclass);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLObjectLabelKHR
 * Signature: (IIILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLObjectLabelKHR
  (JNIEnv *, jclass, jint, jint, jint, jstring);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetObjectLabelKHR
 * Signature: (II)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetObjectLabelKHR
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLObjectPtrLabelKHR
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLObjectPtrLabelKHR
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetObjectPtrLabelKHR
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetObjectPtrLabelKHR
  (JNIEnv *, jclass, jlong);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetDebugMessageCallbackKHR
 * Signature: (I[J)Landroid/opengl/GLES31Ext/DebugProcKHR;
 */
JNIEXPORT jobject JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageCallbackKHR
  (JNIEnv *, jclass, jint, jlongArray);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLMinSampleShadingOES
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLMinSampleShadingOES
  (JNIEnv *, jclass, jfloat);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexStorage3DMultisampleOES
 * Signature: (IIIIIIZ)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexStorage3DMultisampleOES
  (JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jboolean);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLCopyImageSubDataEXT
 * Signature: (IIIIIIIIIIIIIII)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLCopyImageSubDataEXT
  (JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLEnableiEXT
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLEnableiEXT
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLDisableiEXT
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDisableiEXT
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLBlendEquationiEXT
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendEquationiEXT
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLBlendEquationSeparateiEXT
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendEquationSeparateiEXT
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLBlendFunciEXT
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendFunciEXT
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLBlendFuncSeparateiEXT
 * Signature: (IIIII)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendFuncSeparateiEXT
  (JNIEnv *, jclass, jint, jint, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLColorMaskiEXT
 * Signature: (IZZZZ)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLColorMaskiEXT
  (JNIEnv *, jclass, jint, jboolean, jboolean, jboolean, jboolean);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLIsEnablediEXT
 * Signature: (II)Z
 */
JNIEXPORT jboolean JNICALL Java_gles_internal_GLES31ExtPipeline_nGLIsEnablediEXT
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLFramebufferTextureEXT
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLFramebufferTextureEXT
  (JNIEnv *, jclass, jint, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLPrimitiveBoundingBoxEXT
 * Signature: (FFFFFFFF)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPrimitiveBoundingBoxEXT
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLPatchParameteriEXT
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPatchParameteriEXT
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexParameterIivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexParameterIivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexParameterIuivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIuivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexParameterIuivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIuivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetTexParameterIivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetTexParameterIivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetTexParameterIuivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIuivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetTexParameterIuivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIuivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLSamplerParameterIivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLSamplerParameterIivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLSamplerParameterIuivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIuivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLSamplerParameterIuivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIuivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetSamplerParameterIivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetSamplerParameterIivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetSamplerParameterIuivEXT
 * Signature: (II[II)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIuivEXT__II_3II
  (JNIEnv *, jclass, jint, jint, jintArray, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLGetSamplerParameterIuivEXT
 * Signature: (IILjava/nio/IntBuffer;I)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIuivEXT__IILjava_nio_IntBuffer_2I
  (JNIEnv *, jclass, jint, jint, jobject, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexBufferEXT
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexBufferEXT
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     gles_internal_GLES31ExtPipeline
 * Method:    nGLTexBufferRangeEXT
 * Signature: (IIIII)V
 */
JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexBufferRangeEXT
  (JNIEnv *, jclass, jint, jint, jint, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
