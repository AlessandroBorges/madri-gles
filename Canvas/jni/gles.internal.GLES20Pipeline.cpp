#include <gles.internal.GLES20Pipeline.h>

//@line:34

          #include <GLES2/gl2.h>
          #include <GLES2/gl2ext.h>
          #include <stdio.h>
          #include <stdlib.h>
          #include <vector>
          
          using namespace std;
          
          ////////////////////////////////////////
         JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLES20ClassInit(JNIEnv* env, jclass clazz) {


//@line:119
  
         // hold
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:141

                    glActiveTexture((GLenum) texture );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLAttachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:163

       glAttachShader((GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindAttribLocation(JNIEnv* env, jclass clazz, jint program, jint index, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);


//@line:185
            
                    glBindAttribLocation((GLuint) program, (GLuint) index, name);
    
	env->ReleaseStringUTFChars(obj_name, name);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:207

            glBindBuffer((GLenum) target, (GLuint) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindFramebuffer(JNIEnv* env, jclass clazz, jint target, jint framebuffer) {


//@line:229

            glBindFramebuffer((GLenum) target, (GLuint) framebuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint renderbuffer) {


//@line:251

          glBindRenderbuffer((GLenum) target, (GLuint) renderbuffer ); 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:273

            glBindTexture((GLenum) target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:295

            glBlendColor((GLclampf) red, 
                           (GLclampf) green, 
                           (GLclampf) blue, 
                           (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquation(JNIEnv* env, jclass clazz, jint mode) {


//@line:320

                    glBlendEquation((GLenum) mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquationSeparate(JNIEnv* env, jclass clazz, jint modeRGB, jint modeAlpha) {


//@line:342

           glBlendEquationSeparate((GLenum) modeRGB, (GLenum) modeAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:364

            glBlendFunc((GLenum) sfactor, (GLenum) dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFuncSeparate(JNIEnv* env, jclass clazz, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {


//@line:386

            glBlendFuncSeparate((GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offsetBytes, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:452

         glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__III(JNIEnv* env, jclass clazz, jint target, jint size, jint usage) {


//@line:456

      glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(NULL), (GLenum) usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3BII(JNIEnv* env, jclass clazz, jint target, jint size, jbyteArray obj_data, jint offsetBytes, jint usage) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:460

        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3SII(JNIEnv* env, jclass clazz, jint target, jint size, jshortArray obj_data, jint offsetBytes, jint usage) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:464

        glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3III(JNIEnv* env, jclass clazz, jint target, jint size, jintArray obj_data, jint offsetBytes, jint usage) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:468

       glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
      
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData__II_3FII(JNIEnv* env, jclass clazz, jint target, jint size, jfloatArray obj_data, jint offsetBytes, jint usage) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:472

    glBufferData((GLenum) target, (GLsizeiptr) size, (GLvoid *)(data + offsetBytes), (GLenum) usage );
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:541

                    glBufferSubData((GLenum) target, 
                                      (GLintptr) offset, 
                                      (GLsizeiptr) size, 
                                      (GLvoid *)(data + offsetBytes));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III(JNIEnv* env, jclass clazz, jint target, jint offset, jint size) {


//@line:547

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(NULL));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3BI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jbyteArray obj_data, jint offsetBytes) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:554

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3SI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jshortArray obj_data, jint offsetBytes) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:561

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3II(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jintArray obj_data, jint offsetBytes) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:568

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData__III_3FI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jfloatArray obj_data, jint offsetBytes) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:575

    glBufferSubData((GLenum) target, 
                      (GLintptr) offset, 
                      (GLsizeiptr) size, 
                      (GLvoid *)(data + offsetBytes));
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCheckFramebufferStatus(JNIEnv* env, jclass clazz, jint target) {


//@line:598

          return (jint)glCheckFramebufferStatus((GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:620

        glClear((GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:642

          glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:663

            glClearDepthf((GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:683

            glClearStencil((GLint) s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:704

              glColorMask((GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompileShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:726

                    glCompileShader((GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D__IIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:809
            
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


//@line:826
            
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


//@line:843
            
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


//@line:860
            
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


//@line:959

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


//@line:979
                                                                       
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


//@line:997
                                                                       
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


//@line:1013
                                                                       
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


//@line:1054

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


//@line:1094

                    
                            glCopyTexSubImage2D (
                            (GLenum) target, 
                            (GLint) level, 
                            (GLint) xoffset, (GLint) yoffset, 
                            (GLint) x,       (GLint) y, 
                            (GLsizei) width, (GLsizei) height );
    
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateProgram(JNIEnv* env, jclass clazz) {


//@line:1123

                    return (jint)glCreateProgram();
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateShader(JNIEnv* env, jclass clazz, jint type) {


//@line:1145

            return (jint) glCreateShader((GLenum) type );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1167

                    glCullFace((GLenum) mode );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:1191

                    // native
                    glDeleteBuffers((GLsizei) n, ( GLuint *) (buffers + offset) );
    
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:1224

            glDeleteBuffers((GLsizei) n, (const GLuint *) (buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:1247

      glDeleteFramebuffers((GLsizei) n, (GLuint *) (framebuffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:1276

            glDeleteFramebuffers((GLsizei) n, (const GLuint *) (framebuffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:1298

      glDeleteProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1321
    
          glDeleteRenderbuffers((GLsizei) n, ( GLuint *) (renderbuffers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1350
                            
           glDeleteRenderbuffers((GLsizei) n,(const GLuint *) (renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:1371

         glDeleteShader((GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1394

      glDeleteTextures((GLsizei) n,(GLuint *) (textures + offset));                                              
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1422

         glDeleteTextures((GLsizei) n, (const GLuint *)(textures + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:1444

            glDepthFunc((GLenum) func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:1466

            glDepthMask((GLboolean)  flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:1488

            glDepthRangef((GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDetachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:1510

             glDetachShader((GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1532

        glDisable((GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1554

         glDisableVertexAttribArray((GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:1576

       glDrawArrays((GLenum) mode, (GLint) first, (GLsizei) count );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:1598

            glDrawElements((GLenum) mode,
                           (GLsizei) count, 
                           (GLenum) type, 
                           reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1649
    
          glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3BI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1653
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3SI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1657
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__III_3II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1661
    
           glDrawElements((GLenum) mode, (GLsizei) count, (GLenum) type,(GLvoid *) (indices + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1684

        glEnable((GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1704

         glEnableVertexAttribArray((GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1724

       glFinish();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1744
      
         glFlush ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {


//@line:1764

            glFramebufferRenderbuffer((GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferTexture2D(JNIEnv* env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {


//@line:1789

        glFramebufferTexture2D((GLenum) target, (GLenum) attachment, (GLenum) textarget, (GLuint) texture, (GLint) level );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1811

       glFrontFace((GLenum) mode );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:1834
 
       glGenBuffers((GLsizei) n, (GLuint *) (buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:1863

        glGenBuffers((GLsizei) n, (GLuint *)(buffers+offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenerateMipmap(JNIEnv* env, jclass clazz, jint target) {


//@line:1885

            glGenerateMipmap((GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:1908
                               
            glGenFramebuffers((GLsizei) n, (GLuint *) (framebuffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:1935

          glGenFramebuffers((GLsizei) n, (GLuint *)(framebuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1958

            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1985

            glGenRenderbuffers((GLsizei) n, (GLuint *) (renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:2008

            glGenTextures((GLsizei) n, (GLuint *) (textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:2037

            glGenTextures((GLsizei) n, (GLuint *)(textures + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:2083

                 
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

//@line:2170

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

//@line:2227

    
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


//@line:2301

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

//@line:2422

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

//@line:2480

    
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


//@line:2530

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


//@line:2574

             glGetAttachedShaders((GLuint ) program, 
                                  (GLsizei) maxcount, 
                                  (GLsizei *) (count + countOffset), 
                                  (GLuint *) (shaders + shadersOffset));
    
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:2600

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


//@line:2624

            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2634

            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2665
    
            glGetBooleanv((GLenum) pname, (GLboolean *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2688

            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname,
                                    (GLint *) (params + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2719
                    
            glGetBufferParameteriv( (GLenum) target, 
                                    (GLenum) pname, 
                                    (GLint *)  (params + offset));    
     

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:2743

            return (jint) glGetError();    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2767

            glGetFloatv((GLenum) pname,  (GLfloat *) (params + offset));       
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2798
    
            glGetFloatv((GLenum) pname, (GLfloat *) (params + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__III_3II(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2835
                                             
             glGetFramebufferAttachmentParameteriv((GLenum) target, 
                                                     (GLenum) attachment, 
                                                     (GLenum) pname, 
                                                     (GLint *) (params + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2881

            glGetFramebufferAttachmentParameteriv( (GLenum) target, 
                                                   (GLenum) attachment, 
                                                   (GLenum) pname, 
                                                   (GLint *) (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2907
    
            glGetIntegerv((GLenum) pname,  (GLint *) (params +offset) );        
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2937
    
            glGetIntegerv((GLenum) pname, (GLint *) (params + offset));   
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2961

            glGetProgramiv( (GLuint) program, 
                            (GLenum) pname, 
                            (GLint *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2992
    
            glGetProgramiv( (GLuint) program, (GLenum) pname, (GLint *) (params + offset));
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramInfoLog(JNIEnv* env, jclass clazz, jint program) {


//@line:3022
    
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


//@line:3061
        
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetRenderbufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3094
       
            glGetRenderbufferParameteriv((GLenum) target, 
                                           (GLenum) pname, 
                                           (GLint *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__II_3II(JNIEnv* env, jclass clazz, jint shader, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3119

            glGetShaderiv( (GLuint) shader, 
                           (GLenum) pname, 
                           (GLint *) (params + offset) );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint shader, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3156
    
             glGetShaderiv( (GLuint) shader, 
                            (GLenum) pname, 
                            (GLint *)(params + offset) );    
    
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderInfoLog(JNIEnv* env, jclass clazz, jint shader) {


//@line:3191
    
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


//@line:3237

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


//@line:3285
      
      
          glGetShaderPrecisionFormat( (GLenum) shadertype, 
                                        (GLenum) precisiontype,         
                                        (GLint *) &range[rangeOffset], 
                                        (GLint *) &precision[precisionOffset]); 
      
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__II_3II_3BI(JNIEnv* env, jclass clazz, jint shader, jint bufsize, jintArray obj_length, jint lengthOffset, jbyteArray obj_source, jint sourceOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	char* source = (char*)env->GetPrimitiveArrayCritical(obj_source, 0);


//@line:3322

           // get the source
            glGetShaderSource((GLuint) shader, 
                                (GLsizei) bufsize, 
                                (GLsizei *)(length + lengthOffset), 
                                (char *)(source +sourceOffset));                    
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_source, source, 0);

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__I(JNIEnv* env, jclass clazz, jint shader) {


//@line:3373

            GLint maxLength = 0;
            glGetShaderiv(shader, GL_SHADER_SOURCE_LENGTH, &maxLength);
            
           // The maxLength includes the NULL character
           std::vector<GLchar> source(maxLength + 1);
    
           glGetShaderSource((GLuint) shader, maxLength + 1, &maxLength, &source[0]);
           jstring result = env->NewStringUTF(&source[0]);
           return result;        
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:3403

             const GLubyte* value = glGetString( (GLenum) name);
             const char * valueCast = reinterpret_cast<const char*>(value);
             jstring result = env->NewStringUTF( valueCast );
             return result;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3428

            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset));    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3456

            glGetTexParameterfv((GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3479

            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  (params + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3508

            glGetTexParameteriv((GLenum) target, (GLenum) pname,  (GLint *)  (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__II_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3531

            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) (params + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3560

            glGetUniformfv((GLuint) program, (GLint) location, (GLfloat *) (params + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint location, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3583

            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) (params + offset)  );    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3610

            glGetUniformiv((GLuint) program, (GLint) location, (GLint *) (params + offset) );
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:3633

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


//@line:3657
                                    
            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3687

            glGetVertexAttribfv((GLuint) index, (GLenum) pname,  (GLfloat *)(params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__II_3II(JNIEnv* env, jclass clazz, jint index, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3711

            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *)  (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3741

            glGetVertexAttribiv((GLuint) index, (GLenum) pname,  (GLint *) (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:3763

            glHint((GLenum) target, (GLenum) mode );                                    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:3785
    
            return (jboolean)  glIsBuffer( (GLuint) buffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:3807

            return (jboolean)  glIsEnabled((GLenum) cap );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsFramebuffer(JNIEnv* env, jclass clazz, jint framebuffer) {


//@line:3827

          return (jboolean)  glIsFramebuffer((GLuint) framebuffer );    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3847

            return (jboolean)  glIsProgram((GLuint) program );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsRenderbuffer(JNIEnv* env, jclass clazz, jint renderbuffer) {


//@line:3868

            return (jboolean)  glIsRenderbuffer((GLuint) renderbuffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:3890
    
            return (jboolean)  glIsShader((GLuint) shader );    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:3912
    
            return  (jboolean)  glIsTexture((GLuint) texture );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:3935

            glLineWidth( (GLfloat) width );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLinkProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3957
    
            glLinkProgram ((GLuint) program );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:3979

            glPixelStorei ((GLenum) pname, (GLint) param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:4001

            glPolygonOffset((GLfloat) factor, (GLfloat) units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLReadPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4036

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


//@line:4067
    
            glReleaseShaderCompiler();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLRenderbufferStorage(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint width, jint height) {


//@line:4089

            glRenderbufferStorage((GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:4111

            glSampleCoverage((GLclampf) value, (GLboolean)  invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:4133

            glScissor((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderBinary__I_3IIILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint n, jintArray obj_shaders, jint offset, jint binaryformat, jobject obj_binary, jint binaryOffset, jint length) {
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);
	int* shaders = (int*)env->GetPrimitiveArrayCritical(obj_shaders, 0);


//@line:4165

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


//@line:4220

                                                                   
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


//@line:4251

            //Send the vertex shader source code to GL
            // GL expects an array of strings
            const char* strings[] = {source};                                                                
            glShaderSource((GLuint)shader, 1, strings, 0);
    
	env->ReleaseStringUTFChars(obj_source, source);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:4276
     
               glStencilFunc((GLenum) func, (GLint) ref, (GLuint) mask );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFuncSeparate(JNIEnv* env, jclass clazz, jint face, jint func, jint ref, jint mask) {


//@line:4298

            glStencilFuncSeparate( (GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:4320

            glStencilMask((GLuint) mask );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMaskSeparate(JNIEnv* env, jclass clazz, jint face, jint mask) {


//@line:4340

            glStencilMaskSeparate( (GLenum) face, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:4361

             glStencilOp( (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOpSeparate(JNIEnv* env, jclass clazz, jint face, jint fail, jint zfail, jint zpass) {


//@line:4383

            glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4495


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


//@line:4518

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


//@line:4536

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


//@line:4554

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


//@line:4572

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


//@line:4603

            glTexParameterf((GLenum) target, (GLenum) pname, (GLfloat) param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4626

            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4652

            glTexParameterfv( (GLenum) target, (GLenum) pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:4674

             glTexParameteri((GLenum) target, (GLenum) pname, (GLint) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4697
                            
            glTexParameteriv((GLenum) target, (GLenum) pname, (const GLint *) (params + offset));    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4725

            glTexParameteriv((GLenum) target, (GLenum) pname, (GLint *) (params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4806

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


//@line:4827
           
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


//@line:4845

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


//@line:4863

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


//@line:4880

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


//@line:4910
    
            glUniform1f( (GLint) location, (GLfloat) x );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4933

            glUniform1fv( (GLint) location, (GLsizei) count, (GLfloat *) (v +offset) );                                    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v, jint offset) {
	float* v = (float*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:4961

            glUniform1fv((GLint) location, (GLsizei) count, (GLfloat *)(v + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1i(JNIEnv* env, jclass clazz, jint location, jint x) {


//@line:4983

            glUniform1i((GLint) location, (GLint) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5006

             glUniform1iv((GLint) location, (GLsizei) count, (GLint *) (v + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v, jint offset) {
	int* v = (int*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:5034

            glUniform1iv((GLint) location, (GLsizei) count, (GLint *)(v + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y) {


//@line:5056

            glUniform2f((GLint) location, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5079

            glUniform2fv( (GLint) location, (GLsizei) count, (GLfloat *) (v + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5110
            
            glUniform2fv( (GLint) location, (GLsizei) count, (GLfloat *) (values + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2i(JNIEnv* env, jclass clazz, jint location, jint x, jint y) {


//@line:5132

            glUniform2i((GLint) location, (GLint) x, (GLint) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5155

            glUniform2iv((GLint) location, (GLsizei) count, (GLint *) (v + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5185

              glUniform2iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z) {


//@line:5207
    
            glUniform3f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5230

            glUniform3fv((GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );   
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5259

            glUniform3fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z) {


//@line:5281

            glUniform3i((GLint) location, (GLint) x, (GLint) y, (GLint) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5304
    
            glUniform3iv((GLint) location, (GLsizei) count, (const GLint *) (value + offset) );  
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5335

             glUniform3iv((GLint) location, (GLsizei) count,(GLint *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5357

             glUniform4f((GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5380

            glUniform4fv((GLint) location, (GLsizei) count, (GLfloat *) (v + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5409

            glUniform4fv((GLint) location, (GLsizei) count, (GLfloat *) (values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z, jint w) {


//@line:5431

            glUniform4i((GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:5454

            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5482

            glUniform4iv((GLint) location, (GLsizei) count, (GLint *) (values + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5511

             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5548

             glUniformMatrix2fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5572

            glUniformMatrix3fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5609

            glUniformMatrix3fv( (GLint) location, 
                                (GLsizei) count, 
                                (GLboolean)  transpose, 
                                (GLfloat *) (value + offset) );   
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5645

            glUniformMatrix4fv((GLint) location, 
                               (GLsizei) count, 
                               (GLboolean)  transpose, 
                               (GLfloat *) (value + offset) );
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5680

            glUniformMatrix4fv((GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUseProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5702

            glUseProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLValidateProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5724

            glValidateProgram((GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1f(JNIEnv* env, jclass clazz, jint indx, jfloat x) {


//@line:5746

           glVertexAttrib1f((GLuint) indx, (GLfloat) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5769

            glVertexAttrib1fv((GLuint) indx, (GLfloat *) (values + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5798

             glVertexAttrib1fv ((GLuint) indx, (GLfloat *)(values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y) {


//@line:5820

         glVertexAttrib2f((GLuint) indx, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5843
    
            glVertexAttrib2fv((GLuint) indx, ( GLfloat *)(values + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5873
    
            glVertexAttrib2fv((GLuint) indx,  ( GLfloat *)(values + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z) {


//@line:5895

            glVertexAttrib3f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5918

            glVertexAttrib3fv((GLuint) indx, (GLfloat *)(values + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5947

            glVertexAttrib3fv((GLuint) indx, (GLfloat *) (values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5969

            glVertexAttrib4f((GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5992

            glVertexAttrib4fv((GLuint) indx, (GLfloat *)(values + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:6021

            glVertexAttrib4fv( (GLuint) indx, (GLfloat *)(values + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointer(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jint offset) {


//@line:6051

            glVertexAttribPointer((GLuint) indx, 
                                            (GLint) size, 
                                            (GLenum) type, 
                                            (GLboolean)  normalized, 
                                            (GLsizei) stride, 
                                             reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointerBounds(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jobject obj_ptr, jint offsetBytes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:6101
                    
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


//@line:6132

            glViewport((GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

