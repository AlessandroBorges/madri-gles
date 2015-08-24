#include <gles.internal.GLES31ExtPipeline.h>

//@line:16

      #define GL_GLEXT_PROTOTYPES 
     
      #include <GLES3/gl31.h>
      #include <GLES2/gl2ext.h>
 
      
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLES31ExtClassInit(JNIEnv* env, jclass clazz) {


//@line:86

    // no op
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendBarrierKHR(JNIEnv* env, jclass clazz) {


//@line:108

            glBlendBarrierKHR();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageControlKHR__IIII_3IIZ(JNIEnv* env, jclass clazz, jint source, jint type, jint severity, jint count, jintArray obj_ids, jint offset, jboolean enabled) {
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);


//@line:142

           glDebugMessageControlKHR ( (GLenum) source, 
                                      (GLenum) type, 
                                      (GLenum) severity, 
                                      (GLsizei) count, 
                                      (GLuint *)(ids + offset), 
                                      (GLboolean) enabled );                                               
      
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageControlKHR__IIIILjava_nio_IntBuffer_2IZ(JNIEnv* env, jclass clazz, jint source, jint type, jint severity, jint count, jobject obj_ids, jint offset, jboolean enabled) {
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);


//@line:184

        glDebugMessageControlKHR ( (GLenum) source, 
                                      (GLenum) type, 
                                      (GLenum) severity, 
                                      (GLsizei) count, 
                                      (GLuint *)(ids + offset), 
                                      (GLboolean) enabled );     
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageInsertKHR(JNIEnv* env, jclass clazz, jint source, jint type, jint id, jint severity, jstring obj_buf, jint length) {
	char* buf = (char*)env->GetStringUTFChars(obj_buf, 0);


//@line:227
      
      glDebugMessageInsertKHR ( (GLenum) source, 
                                (GLenum) type, 
                                (GLuint) id, 
                                (GLenum) severity, 
                                (GLsizei) length, 
                                (GLchar *) buf );
    
	env->ReleaseStringUTFChars(obj_buf, buf);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDebugMessageCallbackKHR(JNIEnv* env, jclass clazz, jobject callback) {


//@line:257

       // no op
    

}

static inline jint wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II_3II_3BI
(JNIEnv* env, jclass clazz, jint count, jint bufSize, jintArray obj_sources, jint sourcesOffset, jintArray obj_types, jint typesOffset, jintArray obj_ids, jint idsOffset, jintArray obj_severities, jint severitiesOffset, jintArray obj_lengths, jint lengthsOffset, jbyteArray obj_messageLog, jint messageLogOffset, int* sources, int* types, int* ids, int* severities, int* lengths, char* messageLog) {

//@line:286

    int res = glGetDebugMessageLogKHR ( (GLuint) count, 
                               (GLsizei) bufSize, 
                               (GLenum *) (sources + sourcesOffset ), 
                               (GLenum *) (types + typesOffset ), 
                               (GLuint *) (ids + idsOffset ), 
                               (GLenum *) (severities + severitiesOffset), 
                               (GLsizei *) (lengths + lengthsOffset ), 
                               (GLchar *)  (messageLog + messageLogOffset ) );
        return (jint) res;                       
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint count, jint bufSize, jintArray obj_sources, jint sourcesOffset, jintArray obj_types, jint typesOffset, jintArray obj_ids, jint idsOffset, jintArray obj_severities, jint severitiesOffset, jintArray obj_lengths, jint lengthsOffset, jbyteArray obj_messageLog, jint messageLogOffset) {
	int* sources = (int*)env->GetPrimitiveArrayCritical(obj_sources, 0);
	int* types = (int*)env->GetPrimitiveArrayCritical(obj_types, 0);
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);
	int* severities = (int*)env->GetPrimitiveArrayCritical(obj_severities, 0);
	int* lengths = (int*)env->GetPrimitiveArrayCritical(obj_lengths, 0);
	char* messageLog = (char*)env->GetPrimitiveArrayCritical(obj_messageLog, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II_3II_3BI(env, clazz, count, bufSize, obj_sources, sourcesOffset, obj_types, typesOffset, obj_ids, idsOffset, obj_severities, severitiesOffset, obj_lengths, lengthsOffset, obj_messageLog, messageLogOffset, sources, types, ids, severities, lengths, messageLog);

	env->ReleasePrimitiveArrayCritical(obj_sources, sources, 0);
	env->ReleasePrimitiveArrayCritical(obj_types, types, 0);
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);
	env->ReleasePrimitiveArrayCritical(obj_severities, severities, 0);
	env->ReleasePrimitiveArrayCritical(obj_lengths, lengths, 0);
	env->ReleasePrimitiveArrayCritical(obj_messageLog, messageLog, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_ByteBuffer_2II
(JNIEnv* env, jclass clazz, jint count, jobject obj_sources, jint offSou, jobject obj_types, jint offTyp, jobject obj_ids, jint offIds, jobject obj_severities, jint offSev, jobject obj_lengths, jint offLen, jobject obj_messageLog, jint offMes, jint bufSize, int* sources, int* types, int* ids, int* severities, int* lengths, char* messageLog) {

//@line:346

      // no op
       
       int res = glGetDebugMessageLogKHR ( (GLuint) count, 
                                 (GLsizei) bufSize, 
                                 (GLenum *)(sources + offSou), 
                                 (GLenum *) (types + offTyp), 
                                 (GLuint *) (ids + offIds), 
                                 (GLenum *) (severities + offSev), 
                                 (GLsizei *)(lengths + offLen), 
                                 (GLchar *) (messageLog + offMes));
        return (jint) res;
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_ByteBuffer_2II(JNIEnv* env, jclass clazz, jint count, jobject obj_sources, jint offSou, jobject obj_types, jint offTyp, jobject obj_ids, jint offIds, jobject obj_severities, jint offSev, jobject obj_lengths, jint offLen, jobject obj_messageLog, jint offMes, jint bufSize) {
	int* sources = (int*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);
	int* types = (int*)(obj_types?env->GetDirectBufferAddress(obj_types):0);
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);
	int* severities = (int*)(obj_severities?env->GetDirectBufferAddress(obj_severities):0);
	int* lengths = (int*)(obj_lengths?env->GetDirectBufferAddress(obj_lengths):0);
	char* messageLog = (char*)(obj_messageLog?env->GetDirectBufferAddress(obj_messageLog):0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_ByteBuffer_2II(env, clazz, count, obj_sources, offSou, obj_types, offTyp, obj_ids, offIds, obj_severities, offSev, obj_lengths, offLen, obj_messageLog, offMes, bufSize, sources, types, ids, severities, lengths, messageLog);


	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II
(JNIEnv* env, jclass clazz, jint count, jint bufSize, jintArray obj_sources, jint sourcesOffset, jintArray obj_types, jint typesOffset, jintArray obj_ids, jint idsOffset, jintArray obj_severities, jint severitiesOffset, int* sources, int* types, int* ids, int* severities) {

//@line:404

       GLsizei lengths = 0;
       GLchar * messageLog = NULL;
      // no op
       glGetDebugMessageLogKHR((GLuint) count, 
                               (GLsizei) bufSize, 
                               (GLenum *)(sources + sourcesOffset), 
                               (GLenum *)(types + typesOffset  ), 
                               (GLuint *)( ids +   idsOffset), 
                               (GLenum *) (severities + severitiesOffset  ), 
                               (GLsizei *) (&lengths ), 
                               (GLchar *) (messageLog));
    
     return NULL;
    
}

JNIEXPORT jobjectArray JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II(JNIEnv* env, jclass clazz, jint count, jint bufSize, jintArray obj_sources, jint sourcesOffset, jintArray obj_types, jint typesOffset, jintArray obj_ids, jint idsOffset, jintArray obj_severities, jint severitiesOffset) {
	int* sources = (int*)env->GetPrimitiveArrayCritical(obj_sources, 0);
	int* types = (int*)env->GetPrimitiveArrayCritical(obj_types, 0);
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);
	int* severities = (int*)env->GetPrimitiveArrayCritical(obj_severities, 0);

	jobjectArray JNI_returnValue = wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__II_3II_3II_3II_3II(env, clazz, count, bufSize, obj_sources, sourcesOffset, obj_types, typesOffset, obj_ids, idsOffset, obj_severities, severitiesOffset, sources, types, ids, severities);

	env->ReleasePrimitiveArrayCritical(obj_sources, sources, 0);
	env->ReleasePrimitiveArrayCritical(obj_types, types, 0);
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);
	env->ReleasePrimitiveArrayCritical(obj_severities, severities, 0);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jint count, jint bufSize, jobject obj_sources, jint sourcesOffset, jobject obj_types, jint typesOffset, jobject obj_ids, jint idsOffset, jobject obj_severities, jint severitiesOffset, int* sources, int* types, int* ids, int* severities) {

//@line:449

       GLsizei * lengths = NULL;
       GLchar * messageLog = NULL;
      // no op
       glGetDebugMessageLogKHR((GLuint) count, 
                               (GLsizei) bufSize, 
                               (GLenum *)(sources + sourcesOffset), 
                               (GLenum *)(types + typesOffset  ), 
                               (GLuint *) ( ids +   idsOffset), 
                               (GLenum *) (severities + severitiesOffset  ), 
                               (GLsizei *) (lengths ), 
                               (GLchar *) (messageLog));
           return NULL;
    
}

JNIEXPORT jobjectArray JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint count, jint bufSize, jobject obj_sources, jint sourcesOffset, jobject obj_types, jint typesOffset, jobject obj_ids, jint idsOffset, jobject obj_severities, jint severitiesOffset) {
	int* sources = (int*)(obj_sources?env->GetDirectBufferAddress(obj_sources):0);
	int* types = (int*)(obj_types?env->GetDirectBufferAddress(obj_types):0);
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);
	int* severities = (int*)(obj_severities?env->GetDirectBufferAddress(obj_severities):0);

	jobjectArray JNI_returnValue = wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageLogKHR__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, count, bufSize, obj_sources, sourcesOffset, obj_types, typesOffset, obj_ids, idsOffset, obj_severities, severitiesOffset, sources, types, ids, severities);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPushDebugGroupKHR(JNIEnv* env, jclass clazz, jint source, jint id, jint length, jstring obj_message) {
	char* message = (char*)env->GetStringUTFChars(obj_message, 0);


//@line:486

        glPushDebugGroupKHR( (GLenum)source,
                             (GLuint)id,
                             (GLsizei)length,
                             (GLchar *) message);
    
	env->ReleaseStringUTFChars(obj_message, message);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPopDebugGroupKHR(JNIEnv* env, jclass clazz) {


//@line:511

        glPopDebugGroupKHR ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLObjectLabelKHR(JNIEnv* env, jclass clazz, jint identifier, jint name, jint length, jstring obj_label) {
	char* label = (char*)env->GetStringUTFChars(obj_label, 0);


//@line:536

      glObjectLabelKHR( (GLenum)identifier,
                        (GLuint)name,
                        (GLsizei)length,
                        (GLchar *) label );
    
	env->ReleaseStringUTFChars(obj_label, label);

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetObjectLabelKHR(JNIEnv* env, jclass clazz, jint identifier, jint name) {


//@line:561

       // no op
        #define GL_MAX_LABEL_LENGTH  0x82E8
        
        GLsizei length = 256;
        glGetIntegerv(GL_MAX_LABEL_LENGTH, &length);
        GLsizei bufSize = length +1;
        std::vector<GLchar> label(length + 1);
        
        glGetObjectLabelKHR ( (GLenum) identifier, (GLuint) name, 
                               (GLsizei) bufSize, 
                               (GLsizei *) &length, 
                               (GLchar *) &label[0]);
                               
         jstring res = env->NewStringUTF(&label[0]);          
         return res;                               
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLObjectPtrLabelKHR(JNIEnv* env, jclass clazz, jlong ptr, jstring obj_label) {
	char* label = (char*)env->GetStringUTFChars(obj_label, 0);


//@line:598

      //no op
    
	env->ReleaseStringUTFChars(obj_label, label);

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetObjectPtrLabelKHR(JNIEnv* env, jclass clazz, jlong ptr) {


//@line:621

     // no op
         GLsizei length = 256;
        glGetIntegerv(GL_MAX_LABEL_LENGTH, &length);
        GLsizei bufSize = length;
        
        std::vector<GLchar> label(length);
        
         glGetObjectPtrLabelKHR ( (void *) ptr, 
                                  (GLsizei) bufSize, 
                                  (GLsizei *) &length, 
                                  (GLchar *) &label[0] );
         jstring res = env->NewStringUTF(&label[0]);          
         return res;                            
    

}

static inline jobject wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageCallbackKHR
(JNIEnv* env, jclass clazz, jint pname, jlongArray obj_param, long long* param) {

//@line:656

       // no op
      //  int * params[] = new int[1] ;
        
        glGetPointervKHR ( (GLenum) pname, (void **) NULL );
        return (jobject)0;
    
}

JNIEXPORT jobject JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageCallbackKHR(JNIEnv* env, jclass clazz, jint pname, jlongArray obj_param) {
	long long* param = (long long*)env->GetPrimitiveArrayCritical(obj_param, 0);

	jobject JNI_returnValue = wrapped_Java_gles_internal_GLES31ExtPipeline_nGLGetDebugMessageCallbackKHR(env, clazz, pname, obj_param, param);

	env->ReleasePrimitiveArrayCritical(obj_param, param, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLMinSampleShadingOES(JNIEnv* env, jclass clazz, jfloat value) {


//@line:682

        glMinSampleShadingOES((GLfloat)value);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexStorage3DMultisampleOES(JNIEnv* env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {


//@line:712

      glTexStorage3DMultisampleOES(
        (GLenum)target,
        (GLsizei)samples,
        (GLenum)internalformat,
        (GLsizei)width,
        (GLsizei)height,
        (GLsizei)depth,
        (GLboolean)fixedsamplelocations
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLCopyImageSubDataEXT(JNIEnv* env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {


//@line:762

      glCopyImageSubDataEXT(
        (GLuint)srcName,
        (GLenum)srcTarget,
        (GLint)srcLevel,
        (GLint)srcX,
        (GLint)srcY,
        (GLint)srcZ,
        (GLuint)dstName,
        (GLenum)dstTarget,
        (GLint)dstLevel,
        (GLint)dstX,
        (GLint)dstY,
        (GLint)dstZ,
        (GLsizei)srcWidth,
        (GLsizei)srcHeight,
        (GLsizei)srcDepth
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLEnableiEXT(JNIEnv* env, jclass clazz, jint target, jint index) {


//@line:800

      glEnableiEXT( (GLenum)target, (GLuint)index );
     
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLDisableiEXT(JNIEnv* env, jclass clazz, jint target, jint index) {


//@line:823
 
       glDisableiEXT( (GLenum)target,   (GLuint)index  );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendEquationiEXT(JNIEnv* env, jclass clazz, jint buf, jint mode) {


//@line:845

       glBlendEquationiEXT( (GLuint)buf,  (GLenum)mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendEquationSeparateiEXT(JNIEnv* env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {


//@line:867

        glBlendEquationSeparateiEXT(
        (GLuint)buf,
        (GLenum)modeRGB,
        (GLenum)modeAlpha
    );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendFunciEXT(JNIEnv* env, jclass clazz, jint buf, jint src, jint dst) {


//@line:894

         glBlendFunciEXT(
        (GLuint)buf,
        (GLenum)src,
        (GLenum)dst
    );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLBlendFuncSeparateiEXT(JNIEnv* env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {


//@line:921

           glBlendFuncSeparateiEXT(
        (GLuint)buf,
        (GLenum)srcRGB,
        (GLenum)dstRGB,
        (GLenum)srcAlpha,
        (GLenum)dstAlpha
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLColorMaskiEXT(JNIEnv* env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {


//@line:949

        glColorMaskiEXT(
        (GLuint)index,
        (GLboolean)r,
        (GLboolean)g,
        (GLboolean)b,
        (GLboolean)a
    );
    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES31ExtPipeline_nGLIsEnablediEXT(JNIEnv* env, jclass clazz, jint target, jint index) {


//@line:978

      GLboolean _returnValue;
       _returnValue = glIsEnablediEXT( (GLenum)target, (GLuint)index );
      return (jboolean)_returnValue;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLFramebufferTextureEXT(JNIEnv* env, jclass clazz, jint target, jint attachment, jint texture, jint level) {


//@line:1002

        glFramebufferTextureEXT(
        (GLenum)target,
        (GLenum)attachment,
        (GLuint)texture,
        (GLint)level
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPrimitiveBoundingBoxEXT(JNIEnv* env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {


//@line:1035

          glPrimitiveBoundingBoxEXT(
        (GLfloat)minX,
        (GLfloat)minY,
        (GLfloat)minZ,
        (GLfloat)minW,
        (GLfloat)maxX,
        (GLfloat)maxY,
        (GLfloat)maxZ,
        (GLfloat)maxW );                                                 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLPatchParameteriEXT(JNIEnv* env, jclass clazz, jint pname, jint value) {


//@line:1065

             glPatchParameteriEXT((GLenum)pname,     (GLint)value  );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIivEXT__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1088

         glTexParameterIivEXT( (GLenum)target, (GLenum)pname,   (GLint *)(params + offset) );  
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1118

           glTexParameterIivEXT( (GLenum)target, (GLenum)pname,   (GLint *)(params + offset) );  
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIuivEXT__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1141

        glTexParameterIuivEXT(  (GLenum)target,
                                (GLenum)pname,
                                (GLuint *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexParameterIuivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1172

      glTexParameterIuivEXT(  (GLenum)target,
                                (GLenum)pname,
                                (GLuint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIivEXT__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1197

            glTexParameterIivEXT(  (GLenum)target,
                                (GLenum)pname,
                                (GLint *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1228

          glGetTexParameterIivEXT(  (GLenum)target,
                                    (GLenum)pname,
                                     (GLint *)params  );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIuivEXT__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1253

          glGetTexParameterIuivEXT(
        (GLenum)target,
        (GLenum)pname,
        (GLuint *)(params + offset)  );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetTexParameterIuivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1285

       glGetTexParameterIuivEXT(
        (GLenum)target,
        (GLenum)pname,
        (GLuint *)(params + offset)  );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIivEXT__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_param, jint offset) {
	int* param = (int*)env->GetPrimitiveArrayCritical(obj_param, 0);


//@line:1311

        glSamplerParameterIivEXT ( (GLuint) sampler, (GLenum) pname, (GLint *)(param + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_param, param, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_param, jint offset) {
	int* param = (int*)(obj_param?env->GetDirectBufferAddress(obj_param):0);


//@line:1340

            glSamplerParameterIuivEXT ( (GLuint) sampler, (GLenum) pname, (GLuint *)(param + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIuivEXT__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_param, jint offset) {
	int* param = (int*)env->GetPrimitiveArrayCritical(obj_param, 0);


//@line:1363

            glSamplerParameterIuivEXT ( (GLuint) sampler, (GLenum) pname, (GLuint *)(param + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_param, param, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLSamplerParameterIuivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_param, jint offset) {
	int* param = (int*)(obj_param?env->GetDirectBufferAddress(obj_param):0);


//@line:1392

            glGetSamplerParameterIivEXT((GLuint) sampler, (GLenum) pname, (GLint *)(param + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIivEXT__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1414

            glGetSamplerParameterIivEXT((GLuint) sampler, (GLenum) pname, (GLint *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1443

             glGetSamplerParameterIivEXT ( (GLuint) sampler, (GLenum) pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIuivEXT__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1466

            glGetSamplerParameterIuivEXT ( (GLuint) sampler, (GLenum) pname, (GLuint *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLGetSamplerParameterIuivEXT__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1496

                       glGetSamplerParameterIuivEXT ( (GLuint) sampler, (GLenum) pname, (GLuint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexBufferEXT(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint buffer) {


//@line:1518

            glTexBufferEXT ( (GLenum) target, (GLenum) internalformat, (GLuint) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31ExtPipeline_nGLTexBufferRangeEXT(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint buffer, jint offset, jint size) {


//@line:1540

             glTexBufferRangeEXT ( (GLenum) target, 
                                   (GLenum) internalformat, 
                                   (GLuint) buffer, 
                                   (GLuint) offset, 
                                   (GLuint) size );
    

}

