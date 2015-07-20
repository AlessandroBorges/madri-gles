#include <gles.internal.GLES10ExtPipeline.h>

//@line:16

      #define GL_GLEXT_PROTOTYPES
      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES10ExtPipeline_nGLES10ExtClassInit(JNIEnv* env, jclass clazz) {


//@line:77

     // no op
    

}

static inline jint wrapped_Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES___3II_3II
(JNIEnv* env, jclass clazz, jintArray obj_mantissa, jint mantissaOffset, jintArray obj_exponent, jint exponentOffset, int* mantissa, int* exponent) {

//@line:101
 
     PFNGLQUERYMATRIXXOESPROC glQueryMatrixxOES = 
     reinterpret_cast<PFNGLQUERYMATRIXXOESPROC>(eglGetProcAddress("glQueryMatrixxOES"));

    if (!glQueryMatrixxOES){
        //throw Exception::CreateException(E_FAIL, L"Failed to get function eglGetPlatformDisplayEXT");
        printf(" glQueryMatrixxOES - Failed to get function glQueryMatrixxOES");
        return (jlong) 0;
    }
         
     jint val = 0;
     val = (jint) glQueryMatrixxOES((GLfixed *)(mantissa + mantissaOffset), 
                                    (GLint *)(exponent + exponentOffset));
    
     return val;
      
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES___3II_3II(JNIEnv* env, jclass clazz, jintArray obj_mantissa, jint mantissaOffset, jintArray obj_exponent, jint exponentOffset) {
	int* mantissa = (int*)env->GetPrimitiveArrayCritical(obj_mantissa, 0);
	int* exponent = (int*)env->GetPrimitiveArrayCritical(obj_exponent, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES___3II_3II(env, clazz, obj_mantissa, mantissaOffset, obj_exponent, exponentOffset, mantissa, exponent);

	env->ReleasePrimitiveArrayCritical(obj_mantissa, mantissa, 0);
	env->ReleasePrimitiveArrayCritical(obj_exponent, exponent, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES__Ljava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jobject obj_mantissa, jint mantissaOffset, jobject obj_exponent, jint exponentOffset, int* mantissa, int* exponent) {

//@line:146

        PFNGLQUERYMATRIXXOESPROC glQueryMatrixxOES = 
        reinterpret_cast<PFNGLQUERYMATRIXXOESPROC>(eglGetProcAddress("glQueryMatrixxOES"));

    if (!glQueryMatrixxOES){
        //throw Exception::CreateException(E_FAIL, L"Failed to get function eglGetPlatformDisplayEXT");
        printf(" glQueryMatrixxOES - Failed to get function glQueryMatrixxOES");
        return (jlong) 0;
    }
       jint val = 0;
       val = (jint) glQueryMatrixxOES((GLfixed *)(mantissa + mantissaOffset), 
                                    (GLint *)(exponent + exponentOffset));    
       return val;
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES__Ljava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_mantissa, jint mantissaOffset, jobject obj_exponent, jint exponentOffset) {
	int* mantissa = (int*)(obj_mantissa?env->GetDirectBufferAddress(obj_mantissa):0);
	int* exponent = (int*)(obj_exponent?env->GetDirectBufferAddress(obj_exponent):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES10ExtPipeline_nGLQueryMatrixxOES__Ljava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, obj_mantissa, mantissaOffset, obj_exponent, exponentOffset, mantissa, exponent);


	return JNI_returnValue;
}

