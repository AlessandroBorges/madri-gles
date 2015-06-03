#include <gles.internal.GLES30Pipeline.h>

//@line:23

	  #include <GLES3/gl3.h>
	  #include <stdio.h>
	  #include <stdlib.h>
	  #include <vector>
	  
	  using namespace std;
	  
	  ////////////////////////////////////////
	 JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLES30ClassInit(JNIEnv* env, jclass clazz) {


//@line:69

    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLReadBuffer(JNIEnv* env, jclass clazz, jint mode) {


//@line:91
    
    			glReadBuffer( (GLenum) mode);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawRangeElements__IIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:152
    
          //char * indices0 = (char *) (indices + offset); 
          glDrawRangeElements((GLenum) mode, 
          		              (GLuint) start, 
          		              (GLuint)  end,
          		              (GLsizei) count, 
          			          (GLenum) type, 
          			          ( GLvoid *)( indices + offset));
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawRangeElements__IIIII_3BI(JNIEnv* env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:168
    
                              //char * indices0 = (char *) (indices + offset); 
                              glDrawRangeElements((GLenum) mode, 
                                                  (GLuint) start, 
                                                  (GLuint)  end,
                                                  (GLsizei) count, 
                                                  (GLenum) type, 
                                                  ( GLvoid *)( indices + offset));
                        
                        
      
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawRangeElements__IIIII_3SI(JNIEnv* env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:184
   
                              
                              glDrawRangeElements((GLenum) mode, 
                                                  (GLuint) start, 
                                                  (GLuint)  end,
                                                  (GLsizei) count, 
                                                  (GLenum) type, 
                                                  ( GLvoid *)( indices + offset));
                        
                        
      
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawRangeElements__IIIII_3II(JNIEnv* env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:199
    
                              //char * indices0 = (char *) (indices + offset); 
                              glDrawRangeElements((GLenum) mode, 
                                                  (GLuint) start, 
                                                  (GLuint)  end,
                                                  (GLsizei) count, 
                                                  (GLenum) type, 
                                                  ( GLvoid *)( indices + offset));
                        
                        
      
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawRangeElements__IIIIII(JNIEnv* env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jint offset) {


//@line:234

                                    
             glDrawRangeElements( (GLenum) mode, 
             			  (GLuint)  start, 
             			  (GLuint)  end, 
             			  (GLsizei) count, 
             			  (GLenum) type, 
             			  reinterpret_cast<GLvoid *>(offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexImage3D__IIIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:291
    					
    									
    				glTexImage3D((GLenum) target, 
    								(GLint) level, 
    								(GLint) internalformat, 
    								(GLsizei) width, (GLsizei) height, 
    								(GLsizei) depth, 
    								(GLint) border, 
    								(GLenum) format, 
    								(GLenum) type, 
    							    (GLvoid *) (pixels + offset));						
    	

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexImage3D__IIIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:312
                     
                                                        
                                    glTexImage3D((GLenum) target, 
                                                    (GLint) level, 
                                                    (GLint) internalformat, 
                                                    (GLsizei) width, (GLsizei) height, 
                                                    (GLsizei) depth, 
                                                    (GLint) border, 
                                                    (GLenum) format, 
                                                    (GLenum) type, 
                                                    (GLvoid *) (pixels + offset));                      
                        
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexImage3D__IIIIIIIIII(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jint offset) {


//@line:382

    		
      glTexImage3D((GLenum) target, 
      				(GLint) level, 
      				(GLint) internalformat, 
      				(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
      				(GLint) border, 
      				(GLenum) format, 
      				(GLenum) type, 
      				reinterpret_cast<GLvoid *>(offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexSubImage3D__IIIIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:453
  		
    		
    	glTexSubImage3D((GLenum) target, (GLint) level, 
    						(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    						(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    						(GLenum) format, 
    						(GLenum) type, 
    						(GLvoid *)(pixels + offset));    		
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexSubImage3D__IIIIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:469

        glTexSubImage3D((GLenum) target, (GLint) level, 
                        (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                        (GLenum) format, 
                        (GLenum) type, 
                        (GLvoid *)(pixels + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexSubImage3D__IIIIIIIIIII(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jint offset) {


//@line:513

    	 glTexSubImage3D((GLenum) target, (GLint) level, 
    	 					(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    	 					(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    	 					(GLenum) format, (GLenum) type, 
    	 					reinterpret_cast<GLvoid *>(offset)
    	 					);									
    	
    	

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCopyTexSubImage3D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {


//@line:552
    
    	glCopyTexSubImage3D((GLenum) target, (GLint) level, 
    						(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    						(GLint) x, (GLint) y, 
    						(GLsizei) width, (GLsizei) height);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexImage3D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:616
    					
    				//char * data0 = (char *) (data + offset);								
    				glCompressedTexImage3D((GLenum) target, 
    				                        (GLint) level, (GLenum) internalformat, 
    				                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    				                        (GLint) border, 
    				                        (GLsizei) imageSize, 
    				                        ( GLvoid *)(data + offset));
    	

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexImage3D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jbyteArray obj_data, jint offset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:629
                        
                       //char * data0 = (char *) (data + offset);                              
                       glCompressedTexImage3D((GLenum) target, 
                                               (GLint) level, (GLenum) internalformat, 
                                               (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                               (GLint) border, 
                                               (GLsizei) imageSize, 
                                               ( GLvoid *)(data + offset));
           
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexImage3D__IIIIIIIII(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jint offset) {


//@line:681

         glCompressedTexImage3D((GLenum) target, 
                                 (GLint) level, (GLenum) internalformat, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLint) border, 
                                 (GLsizei) imageSize, 
                                 reinterpret_cast<GLvoid *>(offset));
         
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexSubImage3D__IIIIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:753

    //char * data0 = (char *) (data + offset);
    glCompressedTexSubImage3D((GLenum) target, (GLint) level, 
                                 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLenum) format, (GLsizei) imageSize, 
                                 (GLvoid *)(data + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexSubImage3D__IIIIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jbyteArray obj_data, jint offset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:768

    //char * data0 = (char *) (data + offset);
    glCompressedTexSubImage3D((GLenum) target, (GLint) level, 
                                 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLenum) format, (GLsizei) imageSize, 
                                 (GLvoid *)(data + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCompressedTexSubImage3D__IIIIIIIIIII(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jint offset) {


//@line:801

          glCompressedTexSubImage3D((GLenum) target, 
                                      (GLint) level, 
                                      (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                      (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                      (GLenum) format, (GLsizei) imageSize, 
                                       reinterpret_cast<GLvoid *>(offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenQueries__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_ids, jint offset) {
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);


//@line:828
    
           glGenQueries((GLsizei) n, (GLuint *)(ids + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenQueries__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_ids, jint offset) {
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);


//@line:857
    
              glGenQueries((GLsizei) n, (GLuint  *)(ids + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteQueries__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_ids, jint offset) {
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);


//@line:880
    
            glDeleteQueries((GLsizei) n, (GLuint  *) (ids + offset));    
    
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteQueries__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_ids, jint offset) {
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);


//@line:909
    
          glDeleteQueries((GLsizei) n, ( GLuint  *) (ids + offset));    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLIsQuery(JNIEnv* env, jclass clazz, jint id) {


//@line:931
    
       return (jboolean) glIsQuery((GLuint)  id);    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBeginQuery(JNIEnv* env, jclass clazz, jint target, jint id) {


//@line:953

    			glBeginQuery((GLenum) target, (GLuint)  id);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLEndQuery(JNIEnv* env, jclass clazz, jint target) {


//@line:975

                glEndQuery((GLenum) target);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetQueryiv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:997

                glGetQueryiv((GLenum) target, (GLenum) pname, (GLint *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetQueryiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1026
    
            glGetQueryiv((GLenum) target, (GLenum) pname, (GLint *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetQueryObjectuiv__II_3II(JNIEnv* env, jclass clazz, jint id, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1049
    
         glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint  *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetQueryObjectuiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint id, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1079

            glGetQueryObjectuiv((GLuint)id,  (GLenum)pname, (GLuint *)(params + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLUnmapBuffer(JNIEnv* env, jclass clazz, jint target) {


//@line:1101
    
          return (jboolean)glUnmapBuffer((GLenum) target);
    

}

JNIEXPORT jobject JNICALL Java_gles_internal_GLES30Pipeline_nGLGetBufferPointerv(JNIEnv* env, jclass clazz, jint target, jint pname) {


//@line:1121
        
        // from android.googlesource.com
        GLint64 _mapLength = 0;
        GLvoid* _p; // &_p works like GLvoid** _p
        
        glGetBufferParameteri64v((GLenum)target, GL_BUFFER_MAP_LENGTH, &_mapLength);
        
        glGetBufferPointerv((GLenum)target, (GLenum)pname, &_p);
        return env->NewDirectByteBuffer(_p, _mapLength);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_bufs, jint offset) {
	int* bufs = (int*)env->GetPrimitiveArrayCritical(obj_bufs, 0);


//@line:1149
    
            glDrawBuffers((GLsizei) n, (GLenum *)(bufs + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_bufs, bufs, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_bufs, jint offset) {
	int* bufs = (int*)(obj_bufs?env->GetDirectBufferAddress(obj_bufs):0);


//@line:1177
    
         glDrawBuffers((GLsizei) n, (GLenum *)(bufs + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix2x3fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1200
    
                glUniformMatrix2x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (GLfloat *)(value+offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix2x3fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1233
    
         glUniformMatrix2x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, ( GLfloat *)(value+offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix3x2fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1256
    
            glUniformMatrix3x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix3x2fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1285
    
            glUniformMatrix3x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix2x4fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1308

    
         glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix2x4fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1339
    
             glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix4x2fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1360
    
            glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix4x2fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1388
    
             glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix3x4fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1411
    
    					glUniformMatrix3x4fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											( GLfloat *) &value[offset]);    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix3x4fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1443
    
    					glUniformMatrix3x4fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(GLfloat *) (value + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix4x3fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1470
    
    						glUniformMatrix4x3fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(GLfloat *) &value[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformMatrix4x3fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1504
    
    						glUniformMatrix4x3fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(GLfloat *) (value + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBlitFramebuffer(JNIEnv* env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {


//@line:1544

   
    				glBlitFramebuffer((GLint) srcX0, (GLint) srcY0, 
    									(GLint) srcX1, (GLint) srcY1, 
    									(GLint) dstX0, (GLint) dstY0, 
    									(GLint) dstX1, (GLint) dstY1, 
    									(GLbitfield) mask, 
    									(GLenum) filter);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLRenderbufferStorageMultisample(JNIEnv* env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {


//@line:1573
    			
    			glRenderbufferStorageMultisample(   (GLenum) target, 
    												(GLsizei) samples, 
    												(GLenum) internalformat, 
    												(GLsizei) width, 
    												(GLsizei) height);    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLFramebufferTextureLayer(JNIEnv* env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {


//@line:1599

    				glFramebufferTextureLayer((GLenum) target, 
    											(GLenum) attachment, 
    											(GLuint)  texture, 
    											(GLint) level,
    											(GLint) layer);
    

}

JNIEXPORT jobject JNICALL Java_gles_internal_GLES30Pipeline_nGLMapBufferRange(JNIEnv* env, jclass clazz, jint target, jint offset, jint length, jint access) {


//@line:1625

    
            GLvoid * map;            
            map = glMapBufferRange((GLenum) target, 
                                    (GLintptr) offset, 
                                    (GLsizeiptr) length, 
                                    (GLbitfield) access);
            
            
            //create buffer
            jobject buf = (jobject)0;
            if (map) {
             buf = env->NewDirectByteBuffer((void *)map, (jlong)length);
            }
            
           //done
           return buf;      
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLFlushMappedBufferRange(JNIEnv* env, jclass clazz, jint target, jint offset, jint length) {


//@line:1662

    	glFlushMappedBufferRange((GLenum) target, (GLintptr) offset, (GLsizeiptr) length);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBindVertexArray(JNIEnv* env, jclass clazz, jint array) {


//@line:1684
    
    	    glBindVertexArray((GLuint) array);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteVertexArrays__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_arrays, jint offset) {
	int* arrays = (int*)env->GetPrimitiveArrayCritical(obj_arrays, 0);


//@line:1707
    
    	    glDeleteVertexArrays((GLsizei) n, (const GLuint  *) &arrays[offset]);    
    
	env->ReleasePrimitiveArrayCritical(obj_arrays, arrays, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteVertexArrays__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_arrays, jint offset) {
	int* arrays = (int*)(obj_arrays?env->GetDirectBufferAddress(obj_arrays):0);


//@line:1736

            glDeleteVertexArrays((GLsizei) n, (const GLuint *) (arrays + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenVertexArrays__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_arrays, jint offset) {
	int* arrays = (int*)env->GetPrimitiveArrayCritical(obj_arrays, 0);


//@line:1759

            glGenVertexArrays( (GLsizei) n, (GLuint *) &arrays[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_arrays, arrays, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenVertexArrays__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_arrays, jint offset) {
	int* arrays = (int*)(obj_arrays?env->GetDirectBufferAddress(obj_arrays):0);


//@line:1789

    	    glGenVertexArrays((GLsizei) n, (GLuint *) (arrays + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLIsVertexArray(JNIEnv* env, jclass clazz, jint array) {


//@line:1811

          return (jboolean)  glIsVertexArray((GLuint)  array);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetIntegeriv(JNIEnv* env, jclass clazz, jint target, jint index, jintArray obj_data, jint offset) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:1835

         glGetIntegeri_v((GLenum) target, 
         		  (GLuint)  index, 
         		  (GLint *)(data + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetIntegeriv0__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint index, jobject obj_data, jint offset) {
	int* data = (int*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:1868
    
            glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset));             
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetIntegeriv0__II_3II(JNIEnv* env, jclass clazz, jint target, jint index, jintArray obj_data, jint offset) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:1874
    
        glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset));             
     
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBeginTransformFeedback(JNIEnv* env, jclass clazz, jint primitiveMode) {


//@line:1896
    
    		glBeginTransformFeedback((GLenum) primitiveMode);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLEndTransformFeedback(JNIEnv* env, jclass clazz) {


//@line:1916

            glEndTransformFeedback();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBindBufferRange(JNIEnv* env, jclass clazz, jint target, jint index, jint buffer, jint offset, jint size) {


//@line:1941

    	glBindBufferRange((GLenum) target, 
    	(GLuint)  index, 
    	(GLuint)  buffer, 
    	(GLintptr) offset, 
    	(GLsizeiptr) size);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBindBufferBase(JNIEnv* env, jclass clazz, jint target, jint index, jint buffer) {


//@line:1967

          glBindBufferBase((GLenum) target, (GLuint)  index, (GLuint)  buffer);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTransformFeedbackVaryings(JNIEnv* env, jclass clazz, jint program, jobjectArray varyings, jint count, jint bufferMode) {


//@line:1998

      
       jint i=0;
       const char** arrayStr = NULL;
       //const char* tempStr = NULL;
       
       // get strings from array
       arrayStr = (const char**)calloc(count, sizeof(const char*));
       for (i = 0; i < count; i++) {
            jstring tempStr = (jstring)env->GetObjectArrayElement(varyings, i);        
            arrayStr[i] = env->GetStringUTFChars(tempStr, 0);
        }    
                
       glTransformFeedbackVaryings((GLuint)  program, 
                                   (GLsizei) count, 
                                    arrayStr, 
                                   (GLenum) bufferMode);                                
                                         
     // release strings                           
        for (i = count - 1; i >= 0; i--) {
             if (arrayStr[i]) {
                   jstring tempStr = (jstring)env->GetObjectArrayElement(varyings, i);
                       if (tempStr) {
                           env->ReleaseStringUTFChars(tempStr, arrayStr[i]);
                        }
               }
           }//for
        free(arrayStr);
             
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufSize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:2069

	    
	    glGetTransformFeedbackVarying((GLuint)  program, 
	    (GLuint)  index, 
	    (GLsizei) bufSize, 
	    (GLsizei *) (length + lengthOffset),
	    (GLint *)   (size + sizeOffset),
	    (GLenum *)  (type + typeOffset), 
	    (GLchar *)  (name + nameOffset));
	
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);
	env->ReleasePrimitiveArrayCritical(obj_name, name, 0);

}

static inline jstring wrapped_Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__II_3II_3II
(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, int* size, int* type) {

//@line:2161

	    // name is useless
            //hold
             jstring result = 0;
             GLint len = 0;
             GLint lenRet = 0;
             
             glGetProgramiv((GLuint)program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH, &len);
                if (!len) {
                        return env->NewStringUTF("");
                 }
               len = len +1;   
              char* buf = (char*) calloc(len,sizeof(char));  
                          
              glGetTransformFeedbackVarying(
                    (GLuint)program,
                    (GLuint)index,
                    (GLsizei)len,
                     &lenRet,
                     (GLint *)  (size + sizeOffset),
                     (GLenum *) (type + typeOffset),
                     (char *) buf
                      );
               
              //TODO - check lenRet value against len
                       
              result = env->NewStringUTF(buf);
              
              if (buf) { 
                  free(buf); 
               }
               
                if (result == 0) {
                    result = env->NewStringUTF("");
                }
                
            return result;
    
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__II_3II_3II(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);

	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);

	return JNI_returnValue;
}

static inline jstring wrapped_Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset, int* size, int* type) {

//@line:2244

	    // name is useless
            //hold
             jstring result = 0;
             GLint len = 0;
             GLint lenRet = 0;
             
             glGetProgramiv((GLuint)program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH, &len);
                if (!len) {
                        return env->NewStringUTF("");
                 }
               len = len +1;   
              char* buf = (char*) calloc(len, sizeof(char));              
              glGetTransformFeedbackVarying(
                    (GLuint)program,
                    (GLuint)index,
                    (GLsizei)len,
                     &lenRet,
                     (GLint *)  (size + sizeOffset),
                     (GLenum *) (type + typeOffset),
                     (char *) buf
                      );
               
              //TODO - check lenRet value against len
                       
              result = env->NewStringUTF(buf);
              
              if (buf) free(buf); 
               
               if (result == 0) {
                    result = env->NewStringUTF("");
                }
                
            return result;	    
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset) {
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES30Pipeline_nGLGetTransformFeedbackVarying__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribIPointerBounds__IIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint index, jint size, jint type, jint stride, jobject obj_pointer, jint offset) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2333
	    
	    glVertexAttribIPointer((GLuint)  index, 
	    (GLint) size, 
	    (GLenum) type, 
	    (GLsizei) stride, 
	    (const GLvoid *)(pointer + offset));	    


}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribIPointerBounds__IIII_3BI(JNIEnv* env, jclass clazz, jint index, jint size, jint type, jint stride, jbyteArray obj_pointer, jint offset) {
	char* pointer = (char*)env->GetPrimitiveArrayCritical(obj_pointer, 0);


//@line:2345
   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        

	env->ReleasePrimitiveArrayCritical(obj_pointer, pointer, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribIPointerBounds__IIII_3SI(JNIEnv* env, jclass clazz, jint index, jint size, jint type, jint stride, jshortArray obj_pointer, jint offset) {
	short* pointer = (short*)env->GetPrimitiveArrayCritical(obj_pointer, 0);


//@line:2356
   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        

	env->ReleasePrimitiveArrayCritical(obj_pointer, pointer, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribIPointerBounds__IIII_3II(JNIEnv* env, jclass clazz, jint index, jint size, jint type, jint stride, jintArray obj_pointer, jint offset) {
	int* pointer = (int*)env->GetPrimitiveArrayCritical(obj_pointer, 0);


//@line:2368
   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        

	env->ReleasePrimitiveArrayCritical(obj_pointer, pointer, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribIPointer(JNIEnv* env, jclass clazz, jint index, jint size, jint type, jint stride, jint offset) {


//@line:2398

	    
	    glVertexAttribIPointer((GLuint)  index, 
	    			    (GLint) size, 
	    			    (GLenum) type, 
	    			    (GLsizei) stride, 
	    			     reinterpret_cast<GLvoid *>(offset) //(GLsizei) offset
	    			     );
	    
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetVertexAttribIiv__II_3II(JNIEnv* env, jclass clazz, jint index, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2428

    		 glGetVertexAttribIiv((GLuint)  index, 
    		 		              (GLenum) pname, 
    		                      (GLint *)(params+offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetVertexAttribIiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2463
	    
	    glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint *)(params + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetVertexAttribIuiv__II_3II(JNIEnv* env, jclass clazz, jint index, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2486

          glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint  *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetVertexAttribIuiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2522

	   glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *)(params + offset)); 
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4i(JNIEnv* env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {


//@line:2544

       glVertexAttribI4i((GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4ui(JNIEnv* env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {


//@line:2566

       glVertexAttribI4ui((GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4iv__I_3II(JNIEnv* env, jclass clazz, jint index, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:2589

     glVertexAttribI4iv((GLuint)  index, (const GLint *)(v + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4iv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jobject obj_v, jint offset) {
	int* v = (int*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:2617

          glVertexAttribI4iv((GLuint)  index, (const GLint *)(v + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4uiv__I_3II(JNIEnv* env, jclass clazz, jint index, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:2638

    		glVertexAttribI4uiv((GLuint)  index, (const GLuint *)(v + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribI4uiv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jobject obj_v, jint offset) {
	int* v = (int*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:2666

    		glVertexAttribI4uiv((GLuint)  index, (const GLuint *) (v + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetUniformuiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint location, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2687

    		glGetUniformuiv((GLuint)  program, 
    				(GLint) location, 
    				(GLuint *)(params + offset));    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetUniformuiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2721
	    	
	    	glGetUniformuiv((GLuint)  program, 
    				        (GLint) location, 
    				        (GLuint *)(params + offset));    
    

}

static inline jint wrapped_Java_gles_internal_GLES30Pipeline_nGLGetFragDataLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:2746

    	return (jint) glGetFragDataLocation((GLuint)  program, (const GLchar *)name);
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES30Pipeline_nGLGetFragDataLocation(JNIEnv* env, jclass clazz, jint program, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES30Pipeline_nGLGetFragDataLocation(env, clazz, program, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform1ui(JNIEnv* env, jclass clazz, jint location, jint v0) {


//@line:2767

    		glUniform1ui((GLint) location, (GLuint)  v0);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform2ui(JNIEnv* env, jclass clazz, jint location, jint v0, jint v1) {


//@line:2787

    		glUniform2ui((GLint) location, (GLuint)  v0, (GLuint)  v1);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform3ui(JNIEnv* env, jclass clazz, jint location, jint v0, jint v1, jint v2) {


//@line:2807

        glUniform3ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform4ui(JNIEnv* env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {


//@line:2835

    	glUniform4ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2, (GLuint)  v3);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform1uiv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2858

    		glUniform1uiv((GLint) location, 
    			          (GLsizei) count, 
    			          (GLuint *) (value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform1uiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2889

        glUniform1uiv((GLint) location, 
        	          (GLsizei) count, 
        	          ( GLuint *) (value+offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform2uiv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2912

    		glUniform2uiv((GLint) location, 
    			          (GLsizei) count, 
    			          (GLuint *) (value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform2uiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2941

    		glUniform2uiv((GLint) location, 
    			      (GLsizei) count, 
    			      ( GLuint *) (value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform3uiv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2964

    		glUniform3uiv((GLint) location, 
    		              (GLsizei) count, 
    		              (GLuint *) (value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform3uiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2993

	   glUniform3uiv((GLint) location, 
	              (GLsizei) count,
	              (GLuint *) (value + offset));
  

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform4uiv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:3015

    	glUniform4uiv((GLint) location, (GLsizei) count, (GLuint *) (value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniform4uiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:3046

    		glUniform4uiv((GLint) location, 
    		              (GLsizei) count, 
    		              (GLuint *) (value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferiv__II_3II(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:3069

    		glClearBufferiv((GLenum) buffer, 
    				        (GLint) drawbuffer, 
    				        (GLint *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:3098

    			glClearBufferiv((GLenum) buffer, 
    				            (GLint) drawbuffer, 
    				            (GLint *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferuiv__II_3II(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:3121

    		glClearBufferuiv((GLenum) buffer, 
    				         (GLint) drawbuffer, 
    				         (GLuint  *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferuiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:3153

    		glClearBufferuiv((GLenum) buffer, 
    				 (GLint) drawbuffer, 
    				 (const GLuint  *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferfv__II_3FI(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:3178

    			glClearBufferfv((GLenum) buffer, 
    					        (GLint) drawbuffer, 
    					        (GLfloat *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:3207

    			glClearBufferfv((GLenum) buffer, 
    					        (GLint) drawbuffer, 
    					        (GLfloat *)(value+offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLClearBufferfi(JNIEnv* env, jclass clazz, jint buffer, jint drawbuffer, jfloat depth, jint stencil) {


//@line:3230
    
    		glClearBufferfi((GLenum) buffer, 
    				(GLint) drawbuffer, 
    				(GLfloat) depth, 
    				(GLint) stencil);
    
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES30Pipeline_nGLGetStringi(JNIEnv* env, jclass clazz, jint name, jint index) {


//@line:3255
    
        const char * res = (const char *)glGetStringi((GLenum) name, (GLuint)  index);               
        // support null jstring
        return (res == NULL ? ((jstring) 0) :(env->NewStringUTF(res)));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLCopyBufferSubData(JNIEnv* env, jclass clazz, jint readTarget, jint writeTarget, jint readOffset, jint writeOffset, jint size) {


//@line:3289
	    					    
	   glCopyBufferSubData((GLenum) readTarget, 
	   			(GLenum) writeTarget, 
	   			(GLintptr) readOffset, 
	   			(GLintptr) writeOffset, 
	   			(GLsizeiptr) size);
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetUniformIndices__I_3Ljava_lang_String_2_3II(JNIEnv* env, jclass clazz, jint program, jobjectArray uniformNames, jintArray obj_uniformIndices, jint uniformIndicesOffset) {
	int* uniformIndices = (int*)env->GetPrimitiveArrayCritical(obj_uniformIndices, 0);


//@line:3340

	    	jint count = 0;
	    	jint i;
	    	const char** names = NULL;
	    		    					    
	    	 count = env->GetArrayLength(uniformNames);
	    	 
    		 names = (const char**)calloc(count, sizeof(const char*));
    		 
    		 for (i = 0; i < count; i++) {
        		jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);				    
	    		names[i] = env->GetStringUTFChars(name, 0);
	    	  }	
	    	  
	    	      		  
    		  glGetUniformIndices(program, 
    		  		      count, 
    		  		      names, 
    		  		      (GLuint*)(uniformIndices + uniformIndicesOffset)
    		  		       );
    		  
    		  //release uniformNames strings
    		  for (i = count - 1; i >= 0; i--) {
    		          if (names[i]) {
    		              jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);
    		              if (name) {
    		                     env->ReleaseStringUTFChars(name, names[i]);
    		               }
    		            }
    		     }
    		  free(names);		    
	    	  		    
	 
	env->ReleasePrimitiveArrayCritical(obj_uniformIndices, uniformIndices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetUniformIndices__I_3Ljava_lang_String_2Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jobjectArray uniformNames, jobject obj_uniformIndices, jint uniformIndicesOffset) {
	int* uniformIndices = (int*)(obj_uniformIndices?env->GetDirectBufferAddress(obj_uniformIndices):0);


//@line:3413
                                                    
                jint count = 0;
                jint i;
                const char** names = NULL;
                                                                   
                count = env->GetArrayLength(uniformNames);                 
                names = (const char**)calloc(count, sizeof(const char*));
                 
                for (i = 0; i < count; i++) {
                        jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);                                
                        names[i] = env->GetStringUTFChars(name, 0);
                }                       
                                  
                glGetUniformIndices(program, 
                                    count, 
                                    names, 
                                    (GLuint*)(uniformIndices + uniformIndicesOffset)
                                    );
                  
                //release uniformNames strings
                for (i = count - 1; i >= 0; i--) {
                          if (names[i]) {
                              jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);
                              if (name) {
                                     env->ReleaseStringUTFChars(name, names[i]);
                               }
                            }
                     }
                     
                free(names);              
                                                    
       

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformsiv__II_3III_3II(JNIEnv* env, jclass clazz, jint program, jint uniformCount, jintArray obj_uniformIndices, jint uniformIndicesOffset, jint pname, jintArray obj_params, jint paramsOffset) {
	int* uniformIndices = (int*)env->GetPrimitiveArrayCritical(obj_uniformIndices, 0);
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3481
        
         glGetActiveUniformsiv((GLuint)  program, 
                                (GLsizei) uniformCount, 
                                (GLuint *) (uniformIndices + uniformIndicesOffset), 
                                (GLenum) pname, 
                                (GLint *) (params + paramsOffset));
    
	env->ReleasePrimitiveArrayCritical(obj_uniformIndices, uniformIndices, 0);
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformsiv__IILjava_nio_IntBuffer_2IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint uniformCount, jobject obj_uniformIndices, jint uniformIndicesOffset, jint pname, jobject obj_params, jint paramsOffset) {
	int* uniformIndices = (int*)(obj_uniformIndices?env->GetDirectBufferAddress(obj_uniformIndices):0);
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3539

     glGetActiveUniformsiv((GLuint)  program, 
                                (GLsizei) uniformCount, 
                                (const GLuint *) (uniformIndices + uniformIndicesOffset), 
                                (GLenum) pname, 
                                (GLint *) (params + paramsOffset));
    
    

}

static inline jint wrapped_Java_gles_internal_GLES30Pipeline_nGLGetUniformBlockIndex
(JNIEnv* env, jclass clazz, jint program, jstring obj_uniformBlockName, char* uniformBlockName) {

//@line:3566
    		
    	return (jint)	glGetUniformBlockIndex((GLuint)  program, (GLchar *) uniformBlockName);
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES30Pipeline_nGLGetUniformBlockIndex(JNIEnv* env, jclass clazz, jint program, jstring obj_uniformBlockName) {
	char* uniformBlockName = (char*)env->GetStringUTFChars(obj_uniformBlockName, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES30Pipeline_nGLGetUniformBlockIndex(env, clazz, program, obj_uniformBlockName, uniformBlockName);

	env->ReleaseStringUTFChars(obj_uniformBlockName, uniformBlockName);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformBlockiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3595

                                                          
           glGetActiveUniformBlockiv((GLuint)  program, 
                                     (GLuint)  uniformBlockIndex, 
                                     (GLenum) pname, 
                                     (GLint *)(params + offset));                                                          
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformBlockiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3636

           glGetActiveUniformBlockiv((GLuint)  program, 
                                     (GLuint)  uniformBlockIndex, 
                                     (GLenum) pname, 
                                     (GLint *)(params + offset)); 
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformBlockName__III_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jintArray obj_length, jint lengthOffset, jbyteArray obj_uniformBlockName, jint uniformBlockNameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	char* uniformBlockName = (char*)env->GetPrimitiveArrayCritical(obj_uniformBlockName, 0);


//@line:3676

          glGetActiveUniformBlockName((GLuint)  program, 
                                      (GLuint)  uniformBlockIndex, 
                                      (GLsizei) bufSize, 
                                      (GLsizei *)(length + lengthOffset), 
                                      (GLchar *) (uniformBlockName + uniformBlockNameOffset)) ;                                                 
                                                            
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_uniformBlockName, uniformBlockName, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformBlockName__IIILjava_nio_Buffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jobject obj_length, jint lenOffset, jobject obj_uniformBlockName, jint uniOffset) {
	unsigned char* length = (unsigned char*)(obj_length?env->GetDirectBufferAddress(obj_length):0);
	unsigned char* uniformBlockName = (unsigned char*)(obj_uniformBlockName?env->GetDirectBufferAddress(obj_uniformBlockName):0);


//@line:3734

          // assume length is int*           	
          glGetActiveUniformBlockName ((GLuint)  program, 
    					(GLuint)  uniformBlockIndex,
    					(GLsizei) bufSize, // get the size of buffer from Buffer
    					(GLsizei *) (length + uniOffset),  // get the pointer
    					(GLchar *)  (uniformBlockName + uniOffset) );  
    
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES30Pipeline_nGLGetActiveUniformBlockName__II(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex) {


//@line:3762

    
    				// get string length
    		   GLint maxLength = 0;                     
                    glGetProgramiv((GLuint)program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &maxLength); 
                    
                    std::vector<GLchar> uniformBlockName(maxLength + 1);
    
    		    glGetActiveUniformBlockName ((GLuint)  program, 
    						 (GLuint)  uniformBlockIndex, 
    						 (GLsizei) maxLength + 1, 
    						  &maxLength, 
    						  &uniformBlockName[0]);
    											 
    		    return (jstring) env->NewStringUTF((char *)&uniformBlockName[0]);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLUniformBlockBinding(JNIEnv* env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding) {


//@line:3798

            glUniformBlockBinding((GLuint)  program, (GLuint)  uniformBlockIndex, (GLuint)  uniformBlockBinding);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawArraysInstanced(JNIEnv* env, jclass clazz, jint mode, jint first, jint count, jint instanceCount) {


//@line:3824

    		glDrawArraysInstanced((GLenum) mode, 
    		(GLint) first, 
    		(GLsizei) count, 
    		(GLsizei) instanceCount);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawElementsInstanced__IIILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset, jint instanceCount) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:3882

     glDrawElementsInstanced(
        (GLenum)mode,
        (GLsizei)count,
        (GLenum)type,
        (GLvoid *) (indices + offset),
        (GLsizei)instanceCount);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawElementsInstanced__III_3BII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset, jint instanceCount) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:3896

             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
 
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawElementsInstanced__III_3SII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset, jint instanceCount) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:3910

             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawElementsInstanced__III_3III(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset, jint instanceCount) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:3924

             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
 
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDrawElementsInstanced__IIIII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint indicesOffset, jint instanceCount) {


//@line:3956

       glDrawElementsInstanced((GLenum) mode, 
       				(GLsizei) count, 
       				(GLenum) type, 
       				(GLvoid *)static_cast<uintptr_t>(indicesOffset),
       				(GLsizei) instanceCount);
    

}

JNIEXPORT jlong JNICALL Java_gles_internal_GLES30Pipeline_nGLFenceSync(JNIEnv* env, jclass clazz, jint condition, jint flags) {


//@line:3982

          return (jlong)  glFenceSync((GLenum) condition, (GLbitfield) flags);
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLIsSync(JNIEnv* env, jclass clazz, jlong sync) {


//@line:4004

    	  return (jboolean) glIsSync( (GLsync) sync);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteSync(JNIEnv* env, jclass clazz, jlong sync) {


//@line:4026

     		glDeleteSync((GLsync) sync);
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES30Pipeline_nGLClientWaitSync(JNIEnv* env, jclass clazz, jlong sync, jint flags, jlong timeout) {


//@line:4048

    		return	(jint) glClientWaitSync((GLsync) sync, (GLbitfield) flags, (GLuint64) timeout);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLWaitSync(JNIEnv* env, jclass clazz, jlong sync, jint flags, jlong timeout) {


//@line:4070

    		glWaitSync((GLsync) sync, (GLbitfield) flags, (GLuint64) timeout);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInteger64v__I_3JI(JNIEnv* env, jclass clazz, jint pname, jlongArray obj_params, jint offset) {
	long long* params = (long long*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4092

                glGetInteger64v((GLenum) pname, (GLint64 *)(params+offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInteger64v__ILjava_nio_LongBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	long long* params = (long long*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4126

    			glGetInteger64v((GLenum) pname, (GLint64 *)(params+offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSynciv__JII_3II_3II(JNIEnv* env, jclass clazz, jlong sync, jint pname, jint bufSize, jintArray obj_length, jint lengthOffset, jintArray obj_values, jint valuesOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* values = (int*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:4160
    				    
     glGetSynciv((GLsync) sync, 
                  (GLenum) pname, 
     		  (GLsizei) bufSize, 
     		  (GLsizei *)(length + lengthOffset), 
     		  (GLint *)(values + valuesOffset));  
	    				    

	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSynciv__JIILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jlong sync, jint pname, jint bufSize, jobject obj_length, jint lengthOffset, jobject obj_values, jint valuesOffset) {
	int* length = (int*)(obj_length?env->GetDirectBufferAddress(obj_length):0);
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4217
  
	      				    
    glGetSynciv((GLsync) sync, 
    	        (GLenum) pname, 
	            (GLsizei) bufSize, 
	            (GLsizei *)(length + lengthOffset), 
	            (GLint *)(values + valuesOffset));
				    


}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInteger64iv__II_3JI(JNIEnv* env, jclass clazz, jint target, jint index, jlongArray obj_data, jint offset) {
	long long* data = (long long*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:4246

    		glGetInteger64i_v((GLenum) target, 
    				  (GLuint)  index, 
    				  (GLint64 *)(data+offset));
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInteger64iv__IILjava_nio_LongBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint index, jobject obj_data, jint offset) {
	long long* data = (long long*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:4279

	    
	glGetInteger64i_v((GLenum) target, 
	  (GLuint)  index, 
	  (GLint64 *)(data+offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetBufferParameteri64v__II_3JI(JNIEnv* env, jclass clazz, jint target, jint pname, jlongArray obj_params, jint offset) {
	long long* params = (long long*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4307

    			glGetBufferParameteri64v((GLenum) target, 
    					                 (GLenum) pname, 
    						             (GLint64 *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetBufferParameteri64v__IILjava_nio_LongBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	long long* params = (long long*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4343

	  glGetBufferParameteri64v((GLenum) target, 
	                         (GLenum) pname, 
	                         (GLint64 *)(params + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenSamplers__I_3II(JNIEnv* env, jclass clazz, jint count, jintArray obj_samplers, jint offset) {
	int* samplers = (int*)env->GetPrimitiveArrayCritical(obj_samplers, 0);


//@line:4368

    				glGenSamplers((GLsizei) count, (GLuint *)(samplers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_samplers, samplers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenSamplers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint count, jobject obj_samplers, jint offset) {
	int* samplers = (int*)(obj_samplers?env->GetDirectBufferAddress(obj_samplers):0);


//@line:4399

	glGenSamplers((GLsizei) count, (GLuint *)(samplers + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteSamplers__I_3II(JNIEnv* env, jclass clazz, jint count, jintArray obj_samplers, jint offset) {
	int* samplers = (int*)env->GetPrimitiveArrayCritical(obj_samplers, 0);


//@line:4422

    		glDeleteSamplers((GLsizei) count, (const GLuint  *)(samplers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_samplers, samplers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteSamplers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint count, jobject obj_samplers, jint offset) {
	int* samplers = (int*)(obj_samplers?env->GetDirectBufferAddress(obj_samplers):0);


//@line:4453

    		glDeleteSamplers((GLsizei) count, (const GLuint  *)(samplers + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLIsSampler(JNIEnv* env, jclass clazz, jint sampler) {


//@line:4477

    	return (jboolean) glIsSampler((GLuint) sampler);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBindSampler(JNIEnv* env, jclass clazz, jint unit, jint sampler) {


//@line:4499

    	 glBindSampler((GLuint)  unit, (GLuint)  sampler);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameteri(JNIEnv* env, jclass clazz, jint sampler, jint pname, jint param) {


//@line:4520
    
    			glSamplerParameteri((GLuint)  sampler, (GLenum) pname, (GLint) param);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameteriv__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_param, jint offset) {
	int* param = (int*)env->GetPrimitiveArrayCritical(obj_param, 0);


//@line:4541
    
    	glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (const GLint *) (param + offset));    
    
	env->ReleasePrimitiveArrayCritical(obj_param, param, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_param, jint offset) {
	int* param = (int*)(obj_param?env->GetDirectBufferAddress(obj_param):0);


//@line:4576
    
    		glSamplerParameteriv((GLuint)  sampler, 
    		                     (GLenum) pname, 
    				             (GLint *)(param + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameterf(JNIEnv* env, jclass clazz, jint sampler, jint pname, jfloat param) {


//@line:4600
    
    	       glSamplerParameterf((GLuint)  sampler, (GLenum) pname, (GLfloat) param);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint sampler, jint pname, jfloatArray obj_param, jint offset) {
	float* param = (float*)env->GetPrimitiveArrayCritical(obj_param, 0);


//@line:4623

    		glSamplerParameterfv((GLuint)  sampler, 
    				     (GLenum) pname, 
    				     (const GLfloat *)(param + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_param, param, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLSamplerParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_param, jint offset) {
	float* param = (float*)(obj_param?env->GetDirectBufferAddress(obj_param):0);


//@line:4659

	       glSamplerParameterfv((GLuint)  sampler, 
                                (GLenum) pname, 
                                ( GLfloat *)(param + offset));	     
	    					     
	    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSamplerParameteriv__II_3II(JNIEnv* env, jclass clazz, jint sampler, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4685

          glGetSamplerParameteriv((GLuint)  sampler, 
          			  (GLenum)  pname, 
          			  (GLint *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSamplerParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4719

    		glGetSamplerParameteriv((GLuint)  sampler, 
    					(GLenum) pname, 
    					(GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSamplerParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint sampler, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4743

                glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetSamplerParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint sampler, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4778

    			glGetSamplerParameterfv((GLuint)  sampler, 
    						(GLenum) pname, 
    						(GLfloat *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLVertexAttribDivisor(JNIEnv* env, jclass clazz, jint index, jint divisor) {


//@line:4802

         glVertexAttribDivisor((GLuint)  index, (GLuint)  divisor);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLBindTransformFeedback(JNIEnv* env, jclass clazz, jint target, jint id) {


//@line:4824

     		glBindTransformFeedback((GLenum) target, (GLuint)  id);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteTransformFeedbacks__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_ids, jint offset) {
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);


//@line:4846
        
          	glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) &ids[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLDeleteTransformFeedbacks__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_ids, jint offset) {
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);


//@line:4874

    	glDeleteTransformFeedbacks( (GLsizei) n, (const GLuint *) (ids + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenTransformFeedbacks__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_ids, jint offset) {
	int* ids = (int*)env->GetPrimitiveArrayCritical(obj_ids, 0);


//@line:4895
    
    		glGenTransformFeedbacks((GLsizei) n, (GLuint *) &ids[offset]);    
    
	env->ReleasePrimitiveArrayCritical(obj_ids, ids, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGenTransformFeedbacks__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_ids, jint offset) {
	int* ids = (int*)(obj_ids?env->GetDirectBufferAddress(obj_ids):0);


//@line:4924

    	glGenTransformFeedbacks((GLsizei) n, (GLuint *) (ids + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES30Pipeline_nGLIsTransformFeedback(JNIEnv* env, jclass clazz, jint id) {


//@line:4946

    		return (jboolean) glIsTransformFeedback((GLuint)  id);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLPauseTransformFeedback(JNIEnv* env, jclass clazz) {


//@line:4968

       			glPauseTransformFeedback();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLResumeTransformFeedback(JNIEnv* env, jclass clazz) {


//@line:4990

               glResumeTransformFeedback( );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetProgramBinary__II_3II_3IILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint program, jint bufSize, jintArray obj_length, jint lengthOffset, jintArray obj_binaryFormat, jint binaryFormatOffset, jobject obj_binary, jint binaryOffset) {
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* binaryFormat = (int*)env->GetPrimitiveArrayCritical(obj_binaryFormat, 0);


//@line:5043

    												
    			glGetProgramBinary( (GLuint)  program, 
    			                    (GLsizei) bufSize,
    			                    (GLsizei *) &length[lengthOffset], 
    				            (GLenum *)  &binaryFormat[binaryFormatOffset], 
    					    (GLvoid *)  &binary[binaryOffset]);
    												
    	
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_binaryFormat, binaryFormat, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetProgramBinary__II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint bufSize, jintArray obj_length, jint lengthOffset, jintArray obj_binaryFormat, jint binaryFormatOffset, jbyteArray obj_binary, jint binaryOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* binaryFormat = (int*)env->GetPrimitiveArrayCritical(obj_binaryFormat, 0);
	char* binary = (char*)env->GetPrimitiveArrayCritical(obj_binary, 0);


//@line:5057

                                                                                                
                        glGetProgramBinary( (GLuint)  program, 
                                            (GLsizei) bufSize,
                                            (GLsizei *) &length[lengthOffset], 
                                            (GLenum *)  &binaryFormat[binaryFormatOffset], 
                                            (GLvoid *)  &binary[binaryOffset]);
                                                                                                
        
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_binaryFormat, binaryFormat, 0);
	env->ReleasePrimitiveArrayCritical(obj_binary, binary, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetProgramBinary__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint program, jint bufSize, jobject obj_length, jint lengthOffset, jobject obj_binaryFormat, jint binaryFormatOffset, jobject obj_binary, jint binaryOffset) {
	int* length = (int*)(obj_length?env->GetDirectBufferAddress(obj_length):0);
	int* binaryFormat = (int*)(obj_binaryFormat?env->GetDirectBufferAddress(obj_binaryFormat):0);
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);


//@line:5110

    												
    			glGetProgramBinary( (GLuint)  program, 
    		                            (GLsizei) bufSize, 
    					    (GLsizei *) (length + lengthOffset), 
    					    (GLenum *) (binaryFormat + binaryFormatOffset), 
    					    (GLvoid *) (binary + binaryOffset));	
    												
    		

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLProgramBinary__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint program, jint binaryFormat, jobject obj_binary, jint offset, jint length) {
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);


//@line:5151

    
    					glProgramBinary((GLuint)  program, 
    							(GLenum) binaryFormat, 
    							(GLvoid *) (binary + offset), 
    							(GLsizei) length);    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLProgramBinary__II_3BII(JNIEnv* env, jclass clazz, jint program, jint binaryFormat, jbyteArray obj_binary, jint offset, jint length) {
	char* binary = (char*)env->GetPrimitiveArrayCritical(obj_binary, 0);


//@line:5162

    
                                        glProgramBinary((GLuint)  program, 
                                                        (GLenum) binaryFormat, 
                                                        (GLvoid *) (binary + offset), 
                                                        (GLsizei) length);    
    
	env->ReleasePrimitiveArrayCritical(obj_binary, binary, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLProgramParameteri(JNIEnv* env, jclass clazz, jint program, jint pname, jint value) {


//@line:5188
    
           glProgramParameteri((GLuint)  program, (GLenum) pname, (GLint) value);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLInvalidateFramebuffer__II_3II(JNIEnv* env, jclass clazz, jint target, jint numAttachments, jintArray obj_attachments, jint offset) {
	int* attachments = (int*)env->GetPrimitiveArrayCritical(obj_attachments, 0);


//@line:5221

        glInvalidateFramebuffer((GLenum) target, 
                                (GLsizei) numAttachments, 
                                (GLenum *) (attachments + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_attachments, attachments, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLInvalidateFramebuffer__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint numAttachments, jobject obj_attachments, jint offset) {
	int* attachments = (int*)(obj_attachments?env->GetDirectBufferAddress(obj_attachments):0);


//@line:5264
    
            glInvalidateFramebuffer((GLenum) target, 
                                    (GLsizei) numAttachments, 
                                    (GLenum *) (attachments + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLInvalidateSubFramebuffer__II_3IIIIII(JNIEnv* env, jclass clazz, jint target, jint numAttachments, jintArray obj_attachments, jint offset, jint x, jint y, jint width, jint height) {
	int* attachments = (int*)env->GetPrimitiveArrayCritical(obj_attachments, 0);


//@line:5297

        glInvalidateSubFramebuffer( (GLenum) target, 
                                    (GLsizei) numAttachments, 
                                    (GLenum *) &attachments[offset], 
                                    (GLint) x, (GLint) y, 
                                    (GLsizei) width, (GLsizei) height);
   
	env->ReleasePrimitiveArrayCritical(obj_attachments, attachments, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLInvalidateSubFramebuffer__IILjava_nio_IntBuffer_2IIIII(JNIEnv* env, jclass clazz, jint target, jint numAttachments, jobject obj_attachments, jint offset, jint x, jint y, jint width, jint height) {
	int* attachments = (int*)(obj_attachments?env->GetDirectBufferAddress(obj_attachments):0);


//@line:5351

    							glInvalidateSubFramebuffer( (GLenum) target,
    								(GLsizei) numAttachments,
    								(const GLenum *) (attachments  + offset),
    								(GLint) x, (GLint) y,
    								(GLsizei) width, (GLsizei) height);	
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexStorage2D(JNIEnv* env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height) {


//@line:5388
    
    		glTexStorage2D((GLenum) target, 
    		(GLsizei) levels, 
    		(GLenum) internalformat, 
    		(GLsizei) width, 
    		(GLsizei) height);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLTexStorage3D(JNIEnv* env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {


//@line:5425

     	glTexStorage3D((GLenum) target, 
     	                (GLsizei) levels, 
     	                (GLenum) internalformat, 
     	                (GLsizei) width, (GLsizei) height, (GLsizei) depth);      
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInternalformativ__IIII_3II(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:5459
    
    			glGetInternalformativ((GLenum) target, 
    					      (GLenum) internalformat, 
    					      (GLenum) pname, 
    				          (GLsizei) bufSize, 
    					      (GLint *) &params[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES30Pipeline_nGLGetInternalformativ__IIIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:5492
    
         		glGetInternalformativ(  (GLenum) target, 
    					        (GLenum) internalformat, 
    						(GLenum) pname, 
    						(GLsizei) bufSize, 
    						(GLint *) (params + offset));    
    

}

