#include <gles.internal.GLES20Pipeline.h>

//@line:28

          #include <GLES2/gl2.h>
          #include <GLES2/gl2ext.h>
          #include <stdio.h>
          #include <stdlib.h>
          #include <vector>
          
          using namespace std;
          
          ////////////////////////////////////////
         JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLES20ClassInit(JNIEnv* env, jclass clazz) {


//@line:87
  
         // hold
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:109

                    glActiveTexture((GLenum) texture );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLAttachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:131

       glAttachShader((GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindAttribLocation(JNIEnv* env, jclass clazz, jint program, jint index, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);


//@line:153
            
                    glBindAttribLocation((GLuint) program, (GLuint) index, name);
    
	env->ReleaseStringUTFChars(obj_name, name);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:175

            glBindBuffer((GLenum) target, (GLuint) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindFramebuffer(JNIEnv* env, jclass clazz, jint target, jint framebuffer) {


//@line:197

            glBindFramebuffer((GLenum) target, (GLuint) framebuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint renderbuffer) {


//@line:219

          glBindRenderbuffer((GLenum) target, (GLuint) renderbuffer ); 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:241

            glBindTexture((GLenum) target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:263

            glBlendColor((GLclampf) red, 
                           (GLclampf) green, 
                           (GLclampf) blue, 
                           (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquation(JNIEnv* env, jclass clazz, jint mode) {


//@line:288

                    glBlendEquation((GLenum) mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquationSeparate(JNIEnv* env, jclass clazz, jint modeRGB, jint modeAlpha) {


//@line:310

           glBlendEquationSeparate((GLenum) modeRGB, (GLenum) modeAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:332

            glBlendFunc((GLenum) sfactor, (GLenum) dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFuncSeparate(JNIEnv* env, jclass clazz, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {


//@line:354

            glBlendFuncSeparate((GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offsetBytes, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:420

         glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__III(JNIEnv* env, jclass clazz, jint target, jint size, jint usage) {


//@line:424

      glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(NULL), (GLenum) usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3BII(JNIEnv* env, jclass clazz, jint target, jint size, jbyteArray obj_data, jint offsetBytes, jint usage) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:428

        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3SII(JNIEnv* env, jclass clazz, jint target, jint size, jshortArray obj_data, jint offsetBytes, jint usage) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:432

        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3III(JNIEnv* env, jclass clazz, jint target, jint size, jintArray obj_data, jint offsetBytes, jint usage) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:436

       glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
      
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3FII(JNIEnv* env, jclass clazz, jint target, jint size, jfloatArray obj_data, jint offsetBytes, jint usage) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:440

    glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:509

                    glBufferSubData((GLenum) target, 
                                      (GLintptr) offset, 
                                      (GLsizeiptr) size, 
                                      (GLvoid *)(data + offsetBytes));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III(JNIEnv* env, jclass clazz, jint target, jint offset, jint size) {


//@line:515

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(NULL));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3BI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jbyteArray obj_data, jint offsetBytes) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:522

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3SI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jshortArray obj_data, jint offsetBytes) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:529

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3II(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jintArray obj_data, jint offsetBytes) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:536

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3FI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jfloatArray obj_data, jint offsetBytes) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:543

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCheckFramebufferStatus(JNIEnv* env, jclass clazz, jint target) {


//@line:566

          return (jint)glCheckFramebufferStatus((GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:588

        glClear((GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:610

          glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:631

            glClearDepthf((GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:651

            glClearStencil((GLint) s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:672

              glColorMask((GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompileShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:694

                    glCompileShader((GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D__IIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:777
            
            // raw java.nio.Buffer is translated as (char *)
           glCompressedTexImage2D((GLenum) target, 
                                  (GLint) level,
                                  (GLenum) internalformat,
                                  (GLsizei) width, (GLsizei) height,
                                  (GLint) border,
                                  (GLsizei) imageSize,
                                 (GLvoid *) (data + offsetBytes));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D__IIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jbyteArray obj_data, jint offsetBytes) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:794
            
        // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                               (GLvoid *) (data + offsetBytes));
     
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D__IIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jshortArray obj_data, jint offsetBytes) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:811
            
       // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                              (GLvoid *) (data + offsetBytes));
     
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D__IIIIIII_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jintArray obj_data, jint offsetBytes) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:828
            
        // raw java.nio.Buffer is translated as (char *)
        glCompressedTexImage2D((GLenum) target, 
                               (GLint) level,
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,
                               (GLint) border,
                               (GLsizei) imageSize,
                              (GLvoid *) (data + offsetBytes));
       
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:927

                    //native code                    
                    glCompressedTexSubImage2D(
                                            (GLenum) target,
                                            (GLint) level, 
                                            (GLint) xoffset, 
                                            (GLint) yoffset, 
                                            (GLsizei) width, 
                                            (GLsizei) height, 
                                            (GLenum) format, 
                                            (GLsizei) imageSize, 
                                            (GLvoid *) (data + offsetBytes) );                    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexSubImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jbyteArray obj_data, jint offsetBytes) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:947
                                                                       
         glCompressedTexSubImage2D ((GLenum) target,
                                    (GLint) level, 
                                    (GLint) xoffset, 
                                    (GLint) yoffset, 
                                    (GLsizei) width, 
                                    (GLsizei) height, 
                                    (GLenum) format, 
                                    (GLsizei) imageSize, 
                                    (GLvoid *) (data + offsetBytes) );                    
      
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexSubImage2D__IIIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jshortArray obj_data, jint offsetBytes) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:965
                                                                       
          glCompressedTexSubImage2D ((GLenum) target,
                                     (GLint) level, 
                                     (GLint) xoffset, (GLint) yoffset, 
                                     (GLsizei) width, (GLsizei) height, 
                                     (GLenum) format, 
                                     (GLsizei) imageSize, 
                                     (GLvoid *) (data + offsetBytes) );                    
       
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexSubImage2D__IIIIIIII_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jintArray obj_data, jint offsetBytes) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:981
                                                                       
          glCompressedTexSubImage2D ((GLenum) target,
                                     (GLint) level, 
                                     (GLint) xoffset, (GLint) yoffset, 
                                     (GLsizei) width, (GLsizei) height, 
                                     (GLenum) format, 
                                     (GLsizei) imageSize, 
                                     (GLvoid *) (data + offsetBytes) );                    
       
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCopyTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {


//@line:1022

                    //native code
                            glCopyTexImage2D(
                                            (GLenum) target, 
                                            (GLint) level,
                                            (GLenum) internalformat,
                                            (GLint) x, 
                                            (GLint) y, 
                                            (GLsizei) width, 
                                            (GLsizei) height, 
                                            (GLint) border );
                    
                    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:1062

                    
                            glCopyTexSubImage2D (
                            (GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, (GLint) yoffset, 
                            (GLint) x,       (GLint) y, 
                            (GLsizei) width, (GLsizei) height );
    
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateProgram(JNIEnv* env, jclass clazz) {


//@line:1091

                    return (jint)glCreateProgram();
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateShader(JNIEnv* env, jclass clazz, jint type) {


//@line:1113

            return (jint) glCreateShader((GLenum) type );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1135

                    glCullFace((GLenum) mode );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:1159

                    // native
                    glDeleteBuffers((GLsizei) n, (const GLuint *) &buffers[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:1192

            glDeleteBuffers((GLsizei) n, (const GLuint *) (buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:1215

      glDeleteFramebuffers((GLsizei) n, (const GLuint *) &framebuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:1244

            glDeleteFramebuffers((GLsizei) n, (const GLuint *) (framebuffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:1266

      glDeleteProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1289
    
          glDeleteRenderbuffers((GLsizei) n, (const GLuint *) &renderbuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1318
                            
           glDeleteRenderbuffers((GLsizei) n,(const GLuint *) (renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:1339

         glDeleteShader((GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1362

      glDeleteTextures((GLsizei) n,(GLuint *) &textures[offset] );                                              
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1390

         glDeleteTextures((GLsizei) n, (const GLuint *)(textures + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:1412

            glDepthFunc((GLenum) func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:1434

            glDepthMask((GLboolean)  flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:1456

            glDepthRangef((GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDetachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:1478

             glDetachShader((GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1500

        glDisable((GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1522

         glDisableVertexAttribArray((GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:1544

       glDrawArrays((GLenum) mode, (GLint) first, (GLsizei) count );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:1566

            glDrawElements((GLenum) mode,
                           (GLsizei) count, 
                           (GLenum) type, 
                           reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1617
    
          glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3BI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1621
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3SI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1625
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1629
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1652

        glEnable((GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1672

         glEnableVertexAttribArray((GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1692

       glFinish();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1712
      
         glFlush ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {


//@line:1732

            glFramebufferRenderbuffer((GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferTexture2D(JNIEnv* env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {


//@line:1757

        glFramebufferTexture2D((GLenum) target, (GLenum) attachment, (GLenum) textarget, (GLuint) texture, (GLint) level );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1779

       glFrontFace((GLenum) mode );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:1802
 
       glGenBuffers((GLsizei) n, (GLuint *) &buffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:1831

        glGenBuffers((GLsizei) n, (GLuint *)(buffers+offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenerateMipmap(JNIEnv* env, jclass clazz, jint target) {


//@line:1853

            glGenerateMipmap((GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:1876
                               
            glGenFramebuffers((GLsizei) n, (GLuint *) &framebuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:1903

          glGenFramebuffers((GLsizei) n, (GLuint *)(framebuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1926

            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1953

            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1976

            glGenTextures((GLsizei) n, (GLuint *) (textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:2005

            glGenTextures((GLsizei) n, (GLuint *)(textures + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:2051

                 
                    glGetActiveAttrib((GLuint) program, 
                                            (GLuint) index, 
                                            (GLsizei) bufsize, 
                                            (GLsizei *) (length + lengthOffset), 
                                            (GLint *)  (size + sizeOffset), 
                                            (GLenum *) (type + typeOffset), 
                                            (char *) (name + nameOffset));
                    
                    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);
	env->ReleasePrimitiveArrayCritical(obj_name, name, 0);

}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II
(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, int* size, int* type) {

//@line:2138

    GLint  max_length = 0; 
    //get max length of attribute
    glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);
    
    //alloc some space
    std::vector<GLchar> name(max_length + 1);
    
    // gles call
    glGetActiveAttrib ((GLuint) program,
                       (GLuint) index,
                       max_length + 1,  // bufSize
                       &max_length,     // length - not used after call
                       (GLint *)(size + sizeOffset),   // size 
                       (GLenum *)(type + typeOffset),  // type
                       &name[0]);
     
     jstring result = env->NewStringUTF(&name[0]);
     return result;
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);

	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);

	return JNI_returnValue;
}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset, int* size, int* type) {

//@line:2195

    
     // used code snipet from
     // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
     GLint  max_length = 0;

    //get max length of attribute
    glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);

    //alloc some space
    std::vector<GLchar> name(max_length + 1);
    
    // gles call
    glGetActiveAttrib((GLuint) program, 
                      (GLuint) index,
                       max_length + 1, 
                      &max_length, // not used after call
                      (GLint *)  (size + sizeOffset), 
                      (GLenum *) (type + typeOffset), 
                      &name[0]);
    jstring result = env->NewStringUTF(&name[0]);
    return result;
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset) {
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:2269

            //gles call
            glGetActiveUniform ((GLuint) program, 
                                (GLuint) index, 
                                (GLsizei) bufsize, 
                                (GLsizei *) &length[lengthOffset], 
                                (GLint *)  &size[sizeOffset], 
                                (GLenum *) &type[typeOffset], 
                                (char *) &name[nameOffset] );
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);
	env->ReleasePrimitiveArrayCritical(obj_name, name, 0);

}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II
(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, int* size, int* type) {

//@line:2390

            // used code snipet from
            // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
            GLint  max_length = 0;
            
            //get max length of attribute
            glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
            //alloc some space
            std::vector<GLchar> name(max_length + 1);
    
            glGetActiveUniform( (GLuint) program, 
                                (GLuint) index, 
                                 max_length + 1, 
                                 &max_length, // not used after call
                                 (GLint *)  &size[sizeOffset], 
                                 (GLenum *) &type[typeOffset], 
                                  &name[0] );
                                
            jstring result = env->NewStringUTF(&name[0]);
            return result; 
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);

	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);

	return JNI_returnValue;
}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset, int* size, int* type) {

//@line:2448

    
            // used code snipet from
            // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
            GLint  max_length = 0;                            
                                                            
            //get max length of attribute
            glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
            
            //alloc some space
            std::vector<GLchar> name(max_length + 1);

            glGetActiveUniform ((GLuint) program,
                                (GLuint) index, 
                                (max_length + 1), 
                                &max_length, // not used after call
                                (GLint *) (size + sizeOffset), 
                                (GLenum *)(type + typeOffset), 
                                &name[0] );

             jstring result = env->NewStringUTF(&name[0]);
             return result;
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset) {
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttachedShaders__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint maxcount, jintArray obj_count, jint countOffset, jintArray obj_shaders, jint shadersOffset) {
	int* count = (int*)env->GetPrimitiveArrayCritical(obj_count, 0);
	int* shaders = (int*)env->GetPrimitiveArrayCritical(obj_shaders, 0);


//@line:2498

             glGetAttachedShaders((GLuint) program, 
                                  (GLsizei) maxcount, 
                                  (GLsizei *) &count[countOffset], 
                                  (GLuint *) &shaders[shadersOffset]);
    
    
	env->ReleasePrimitiveArrayCritical(obj_count, count, 0);
	env->ReleasePrimitiveArrayCritical(obj_shaders, shaders, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttachedShaders__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint maxcount, jobject obj_count, jint countOffset, jobject obj_shaders, jint shadersOffset) {
	int* count = (int*)(obj_count?env->GetDirectBufferAddress(obj_count):0);
	int* shaders = (int*)(obj_shaders?env->GetDirectBufferAddress(obj_shaders):0);


//@line:2542

             glGetAttachedShaders((GLuint ) program, 
                                  (GLsizei) maxcount, 
                                  (GLsizei *) (count + countOffset), 
                                  (GLuint *) (shaders + shadersOffset));
    
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:2568

            // name is converted to (const char *)
            return (jint) glGetAttribLocation((GLuint) program, name );
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation(JNIEnv* env, jclass clazz, jint program, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation(env, clazz, program, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__I_3ZI(JNIEnv* env, jclass clazz, jint pname, jbooleanArray obj_params, jint offset) {
	bool* params = (bool*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2592

            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2602

            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2633
    
            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2656

            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname,
                                    (GLint *) (params + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2687
                    
            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname, 
                                    (GLint *)  (params + offset));    
     

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:2711

            return (jint) glGetError();    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2735

            glGetFloatv((GLenum) pname,  (GLfloat *) (params + offset));       
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2766
    
            glGetFloatv((GLenum) pname, (GLfloat *) (params + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__III_3II(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2803
                                             
             glGetFramebufferAttachmentParameteriv((GLenum) target, 
                                                     (GLenum) attachment, 
                                                     (GLenum) pname, 
                                                     (GLint *) &params[offset] );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2849

            glGetFramebufferAttachmentParameteriv( (GLenum) target, 
                                                   (GLenum) attachment, 
                                                   (GLenum) pname, 
                                                   (GLint *) (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2875
    
            glGetIntegerv((GLenum) pname,  (GLint *) (params +offset) );        
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2905
    
            glGetIntegerv((GLenum) pname, (GLint *) (params + offset));   
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2929

            glGetProgramiv( (GLuint) program, 
                            (GLenum) pname, 
                            (GLint *) &params[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2960
    
            glGetProgramiv( (GLuint) program, (GLenum) pname, (GLint *) (params + offset));
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramInfoLog(JNIEnv* env, jclass clazz, jint program) {


//@line:2990
    
            // Code based on example from https://www.opengl.org/wiki/Example_Code
            // get the log length                     
            GLint maxLength = 0;
            glGetProgramiv((GLuint)program, GL_INFO_LOG_LENGTH, &maxLength);
                               
            // allocate using  vector
            std::vector<GLchar> infoLog(maxLength + 1);
                
            // get the log with right buffer size
            glGetProgramInfoLog( (GLuint) program, 
                                 (GLsizei) (maxLength + 1), 
                                 (GLsizei *) &maxLength, 
                                 (GLchar *) &infoLog[0]);
                                                                                 
            // return the requested String                                 
            jstring result = env->NewStringUTF(&infoLog[0]);
            return result;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetRenderbufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3029
        
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) &params[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetRenderbufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3062
       
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__II_3II(JNIEnv* env, jclass clazz, jint shader, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3087

            glGetShaderiv( (GLuint) shader, 
                           (GLenum) pname, 
                           (GLint *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint shader, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3124
    
             glGetShaderiv( (GLuint) shader, 
                            (GLenum) pname, 
                            (GLint *)(params + offset) );    
    
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderInfoLog(JNIEnv* env, jclass clazz, jint shader) {


//@line:3159
    
            // get string length
            GLint maxLength = 0;    
            glGetShaderiv( (GLuint) shader, (GLenum) GL_INFO_LOG_LENGTH, &maxLength);
                    
            // allocate 
            std::vector<GLchar> infoLog(maxLength + 1);
    
            glGetShaderInfoLog( (GLuint) shader,
                                maxLength + 1,
                                &maxLength,
                                &infoLog[0]);
            jstring result = env->NewStringUTF(&infoLog[0]);
            return result;
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderPrecisionFormat__II_3II_3II(JNIEnv* env, jclass clazz, jint shadertype, jint precisiontype, jintArray obj_range, jint rangeOffset, jintArray obj_precision, jint precisionOffset) {
	int* range = (int*)env->GetPrimitiveArrayCritical(obj_range, 0);
	int* precision = (int*)env->GetPrimitiveArrayCritical(obj_precision, 0);


//@line:3205

            glGetShaderPrecisionFormat((GLenum) shadertype, 
                                         (GLenum) precisiontype, 
                                         (GLint *) &range[rangeOffset], 
                                         (GLint *) &precision[precisionOffset]);   
    
	env->ReleasePrimitiveArrayCritical(obj_range, range, 0);
	env->ReleasePrimitiveArrayCritical(obj_precision, precision, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderPrecisionFormat__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint shadertype, jint precisiontype, jobject obj_range, jint rangeOffset, jobject obj_precision, jint precisionOffset) {
	int* range = (int*)(obj_range?env->GetDirectBufferAddress(obj_range):0);
	int* precision = (int*)(obj_precision?env->GetDirectBufferAddress(obj_precision):0);


//@line:3253
      
      
          glGetShaderPrecisionFormat( (GLenum) shadertype, 
                                        (GLenum) precisiontype,         
                                        (GLint *) &range[rangeOffset], 
                                        (GLint *) &precision[precisionOffset]); 
      
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__II_3II_3BI(JNIEnv* env, jclass clazz, jint shader, jint bufsize, jintArray obj_length, jint lengthOffset, jbyteArray obj_source, jint sourceOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	char* source = (char*)env->GetPrimitiveArrayCritical(obj_source, 0);


//@line:3290

           // get the source
            glGetShaderSource((GLuint) shader, 
                                (GLsizei) bufsize, 
                                (GLsizei *)(length + lengthOffset), 
                                (char *)(source +sourceOffset));                    
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_source, source, 0);

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__I(JNIEnv* env, jclass clazz, jint shader) {


//@line:3341

            GLint maxLength = 0;
            glGetShaderiv(shader, GL_SHADER_SOURCE_LENGTH, &maxLength);
            
           // The maxLength includes the NULL character
           std::vector<GLchar> source(maxLength + 1);
    
           glGetShaderSource((GLuint) shader, maxLength + 1, &maxLength, &source[0]);
           jstring result = env->NewStringUTF(&source[0]);
           return result;        
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:3371

             const GLubyte* value = glGetString( (GLenum) name);
             const char * valueCast = reinterpret_cast<const char*>(value);
             jstring result = env->NewStringUTF( valueCast );
             return result;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3396

            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  &params[offset]);    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3424

            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3447

            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  &params[offset] );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3476

            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__II_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3499

            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) &params[offset] );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3528

            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) (params + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint location, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3551

            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) &params[offset]  );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3578

            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) (params + offset) );
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:3601

            return (jint) glGetUniformLocation((GLuint) program, name );                                    
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation(JNIEnv* env, jclass clazz, jint program, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation(env, clazz, program, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribfv__II_3FI(JNIEnv* env, jclass clazz, jint index, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3625
                                    
            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3655

            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *)(params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__II_3II(JNIEnv* env, jclass clazz, jint index, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3679

            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *)  &params[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3709

            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *) (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:3731

            glHint((GLenum) target, (GLenum) mode );                                    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:3753
    
            return (jboolean)  glIsBuffer( (GLuint) buffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:3775

            return (jboolean)  glIsEnabled((GLenum) cap );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsFramebuffer(JNIEnv* env, jclass clazz, jint framebuffer) {


//@line:3795

          return (jboolean)  glIsFramebuffer((GLuint) framebuffer );    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3815

            return (jboolean)  glIsProgram((GLuint) program );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsRenderbuffer(JNIEnv* env, jclass clazz, jint renderbuffer) {


//@line:3836

            return (jboolean)  glIsRenderbuffer((GLuint) renderbuffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:3858
    
            return (jboolean)  glIsShader((GLuint) shader );    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:3880
    
            return  (jboolean)  glIsTexture((GLuint) texture );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:3903

            glLineWidth( (GLfloat) width );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLinkProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3925
    
            glLinkProgram ((GLuint) program );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:3947

            glPixelStorei ((GLenum) pname, (GLint) param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:3969

            glPolygonOffset((GLfloat) factor, (GLfloat) units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLReadPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4004

            // apply correct offset
            unsigned char* pixBuffer = (pixels + offset); 
            // do the call              
            glReadPixels((GLint) x, 
                         (GLint) y, 
                         (GLsizei) width, 
                         (GLsizei) height, 
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) pixBuffer );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLReleaseShaderCompiler(JNIEnv* env, jclass clazz) {


//@line:4035
    
            glReleaseShaderCompiler();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLRenderbufferStorage(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint width, jint height) {


//@line:4057

            glRenderbufferStorage((GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:4079

            glSampleCoverage((GLclampf) value, (GLboolean)  invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:4101

            glScissor((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderBinary__I_3IIILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint n, jintArray obj_shaders, jint offset, jint binaryformat, jobject obj_binary, jint binaryOffset, jint length) {
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);
	int* shaders = (int*)env->GetPrimitiveArrayCritical(obj_shaders, 0);


//@line:4133

             unsigned char * binBuffer = (binary + binaryOffset);                                  
             glShaderBinary((GLsizei) n, 
                              (GLuint *) &shaders[offset], 
                              (GLenum) binaryformat, 
                              (GLvoid *) binBuffer, 
                              (GLsizei) length );  
    
	env->ReleasePrimitiveArrayCritical(obj_shaders, shaders, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderBinary__ILjava_nio_IntBuffer_2IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint n, jobject obj_shaders, jint shadersOffset, jint binaryformat, jobject obj_binary, jint binaryOffset, jint length) {
	int* shaders = (int*)(obj_shaders?env->GetDirectBufferAddress(obj_shaders):0);
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);


//@line:4188

                                                                   
            // native code        
            unsigned char * binBuffer = (unsigned char *) (binary + binaryOffset);        
            glShaderBinary(  (GLsizei) n, 
                             (GLuint *) (shaders + shadersOffset), 
                             (GLenum) binaryformat, 
                             (GLvoid *) binBuffer, 
                             (GLsizei) length );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderSource(JNIEnv* env, jclass clazz, jint shader, jstring obj_source) {
	char* source = (char*)env->GetStringUTFChars(obj_source, 0);


//@line:4219

            //Send the vertex shader source code to GL
            // GL expects an array of strings
            const char* strings[] = {source};                                                                
            glShaderSource((GLuint)shader, 1, strings, 0);
    
	env->ReleaseStringUTFChars(obj_source, source);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:4244
     
               glStencilFunc((GLenum) func, (GLint) ref, (GLuint) mask );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFuncSeparate(JNIEnv* env, jclass clazz, jint face, jint func, jint ref, jint mask) {


//@line:4266

            glStencilFuncSeparate( (GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:4288

            glStencilMask((GLuint) mask );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMaskSeparate(JNIEnv* env, jclass clazz, jint face, jint mask) {


//@line:4308

            glStencilMaskSeparate( (GLenum) face, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:4329

             glStencilOp( (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOpSeparate(JNIEnv* env, jclass clazz, jint face, jint fail, jint zfail, jint zpass) {


//@line:4351

            glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4463


           // offset       
            char * pixels0 = (char *) (pixels + offsetBytes);        
                    
            glTexImage2D((GLenum) target, 
                           (GLint) level, 
                           (GLint) internalformat, 
                           (GLsizei) width, 
                           (GLsizei) height,
                           (GLint) border,
                           (GLenum) format, 
                           (GLenum) type, 
                           (GLvoid *) pixels0 );
                                                    
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4486

           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jshortArray obj_pixels, jint offset) {
	short* pixels = (short*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4504

           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIII_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jintArray obj_pixels, jint offset) {
	int* pixels = (int*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4522

           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIII_3FI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jfloatArray obj_pixels, jint offset) {
	float* pixels = (float*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4540

           glTexImage2D( (GLenum) target, 
                         (GLint) level, 
                         (GLint) internalformat, 
                         (GLsizei) width, 
                         (GLsizei) height,
                         (GLint) border,
                         (GLenum) format, 
                         (GLenum) type, 
                         (GLvoid *) (pixels + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:4571

            glTexParameterf((GLenum) target, (GLenum) pname, (GLfloat) param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4594

            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4620

            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:4642

             glTexParameteri((GLenum) target, (GLenum) pname, (GLint) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4665
                            
            glTexParameteriv((GLenum) target, (GLenum) pname, (const GLint *) &params[offset]);    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4693

            glTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4774

            // native code        
            unsigned char * pixels0 = (unsigned char *) (pixels + offsetBytes);        
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) pixels0 );  
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4795
           
            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jshortArray obj_pixels, jint offset) {
	short* pixels = (short*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4813

            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIII_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jintArray obj_pixels, jint offset) {
	int* pixels = (int*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4831

            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIII_3FI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jfloatArray obj_pixels, jint offset) {
	float* pixels = (float*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:4848

            glTexSubImage2D((GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, 
                            (GLint) yoffset, 
                            (GLsizei) width, 
                            (GLsizei) height, 
                            (GLenum) format, 
                            (GLenum) type, 
                            (GLvoid *) (pixels + offset));  
    
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1f(JNIEnv* env, jclass clazz, jint location, jfloat x) {


//@line:4878
    
            glUniform1f( (GLint) location, (GLfloat) x );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4901

            glUniform1fv( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );                                    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v, jint offset) {
	float* v = (float*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:4929

            glUniform1fv((GLint) location, (GLsizei) count, (GLfloat *)(v + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1i(JNIEnv* env, jclass clazz, jint location, jint x) {


//@line:4951

            glUniform1i((GLint) location, (GLint) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4974

             glUniform1iv((GLint) location, (GLsizei) count, (GLint *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v, jint offset) {
	int* v = (int*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:5002

            glUniform1iv((GLint) location, (GLsizei) count, (GLint *)(v + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y) {


//@line:5024

            glUniform2f((GLint) location, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5047

            glUniform2fv( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5078
            
            glUniform2fv( (GLint) location, (GLsizei) count, (GLfloat *) (values + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2i(JNIEnv* env, jclass clazz, jint location, jint x, jint y) {


//@line:5100

            glUniform2i((GLint) location, (GLint) x, (GLint) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5123

            glUniform2iv((GLint) location, (GLsizei) count, (const GLint *) &v[offset] );    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5153

              glUniform2iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z) {


//@line:5175
    
            glUniform3f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5198

            glUniform3fv((GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );   
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5227

            glUniform3fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z) {


//@line:5249

            glUniform3i((GLint) location, (GLint) x, (GLint) y, (GLint) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5272
    
            glUniform3iv((GLint) location, (GLsizei) count, (const GLint *) &value[offset] );  
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5303

             glUniform3iv((GLint) location, (GLsizei) count,(GLint *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5325

             glUniform4f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5347

            glUniform4fv((GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5376

            glUniform4fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z, jint w) {


//@line:5398

            glUniform4i((GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5421

            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5449

            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5478

             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *) &value[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5515

             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5539

            glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) &value[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5576

            glUniformMatrix3fv( (GLint) location, 
                                (GLsizei) count, 
                                (GLboolean)  transpose, 
                                (GLfloat *) (value + offset) );   
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5612

            glUniformMatrix4fv((GLint) location, 
                               (GLsizei) count, 
                               (GLboolean)  transpose, 
                               (GLfloat *) &value[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5647

            glUniformMatrix4fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUseProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5669

            glUseProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLValidateProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5691

            glValidateProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1f(JNIEnv* env, jclass clazz, jint indx, jfloat x) {


//@line:5713

           glVertexAttrib1f((GLuint) indx, (GLfloat) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5736

            glVertexAttrib1fv((GLuint) indx, (GLfloat *) (values + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5765

             glVertexAttrib1fv ((GLuint) indx, (GLfloat *)(values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y) {


//@line:5787

         glVertexAttrib2f((GLuint) indx, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5810
    
            glVertexAttrib2fv((GLuint) indx, (const GLfloat *)(values + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5840
    
            glVertexAttrib2fv((GLuint) indx,  (const GLfloat *)(values + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z) {


//@line:5862

            glVertexAttrib3f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5885

            glVertexAttrib3fv((GLuint) indx, (GLfloat *)(values + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5914

            glVertexAttrib3fv((GLuint) indx, (GLfloat *) (values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5936

            glVertexAttrib4f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5959

            glVertexAttrib4fv((GLuint) indx, (GLfloat *)(values + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5988

            glVertexAttrib4fv( (GLuint) indx, (GLfloat *)(values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointer(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jint offset) {


//@line:6018

            glVertexAttribPointer((GLuint) indx, 
                                            (GLint) size, 
                                            (GLenum) type, 
                                            (GLboolean)  normalized, 
                                            (GLsizei) stride, 
                                             reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointerBounds(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jobject obj_ptr, jint offsetBytes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:6068
                    
           // native code        
           char * data0 = (char *) (ptr + offsetBytes);                    
           // param remaining is unused.                    
           glVertexAttribPointer((GLuint) indx, 
                                 (GLint) size, 
                                 (GLenum) type, 
                                 (GLboolean) normalized, 
                                 (GLsizei) stride, 
                                 (GLvoid *)data0 );        
            
            

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:6099

            glViewport((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

