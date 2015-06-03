#include <gles.internal.GLES10Pipeline.h>
JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLES10ClassInit(JNIEnv* env, jclass clazz) {


//@line:74

      // no op
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:96

         glActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFunc(JNIEnv* env, jclass clazz, jint func, jfloat ref) {


//@line:118

          glAlphaFunc( (GLenum)  func, (GLclampf) ref );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFuncx(JNIEnv* env, jclass clazz, jint func, jint ref) {


//@line:141

         glAlphaFuncx( (GLenum)  func, (GLclampx)  ref );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:163

             glBindTexture( (GLenum)  target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:185

            glBlendFunc( (GLenum)  sfactor, (GLenum)  dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:207

          glClear (  (GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:229

            glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColorx(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:251

         glClearColorx ( (GLclampx)  red, (GLclampx)  green, (GLclampx)  blue, (GLclampx)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:273

          glClearDepthf ( (GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthx(JNIEnv* env, jclass clazz, jint depth) {


//@line:295

             glClearDepthx ( (GLclampx)  depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:317

           glClearStencil( (GLint)  s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClientActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:339

           glClientActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:361

            glColor4f( (GLfloat)  red, (GLfloat)  green, (GLfloat)  blue, (GLfloat)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4x(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:383

            glColor4x( (GLfixed)  red, (GLfixed)  green, (GLfixed)  blue, (GLfixed)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:405

               glColorMask ( (GLboolean) red, (GLboolean) green, (GLboolean) blue, (GLboolean) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:444

            glColorPointer( (GLint)  size, 
                            (GLenum)  type, 
                            (GLsizei) stride,
                            (GLvoid *) (pointer + offset) );                                         
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexImage2D__IIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:517

       glCompressedTexImage2D( (GLenum)  target, 
                               (GLint)  level, 
                               (GLenum)  internalformat, 
                               (GLsizei) width, (GLsizei) height, 
                               (GLint)  border, 
                               (GLsizei) imageSize, 
                               (GLvoid *) (data + offset));                                                       
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexImage2D__IIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jbyteArray obj_data, jint offset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:535

       glCompressedTexImage2D( (GLenum)  target, 
                               (GLint)  level, 
                               (GLenum)  internalformat, 
                               (GLsizei) width, (GLsizei) height, 
                               (GLint)  border, 
                               (GLsizei) imageSize, 
                               (GLvoid *) (data + offset));                                                       
      
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:607

         glCompressedTexSubImage2D( (GLenum)  target, 
                                    (GLint)  level, 
                                    (GLint)  xoffset, (GLint)  yoffset, 
                                    (GLsizei) width, (GLsizei) height, 
                                    (GLenum)  format, 
                                    (GLsizei) imageSize, 
                                    (GLvoid *)(data + offset));                                                  
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexSubImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jbyteArray obj_data, jint offset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:623

         glCompressedTexSubImage2D( (GLenum)  target, 
                                    (GLint)  level, 
                                    (GLint)  xoffset, (GLint)  yoffset, 
                                    (GLsizei) width, (GLsizei) height, 
                                    (GLenum)  format, 
                                    (GLsizei) imageSize, 
                                    (GLvoid *)(data + offset));                                                  
      
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCopyTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {


//@line:677

        glCopyTexImage2D( (GLenum)  target, (GLint)  level, 
                          (GLenum)  internalformat, 
                          (GLint)  x, (GLint)  y, 
                          (GLsizei) width, (GLsizei) height, 
                          (GLint)  border );                                         
       

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:720

          glCopyTexSubImage2D( (GLenum)  target,
                               (GLint)  level, 
                               (GLint)  xoffset, (GLint)  yoffset, 
                               (GLint)  x, (GLint)  y, 
                               (GLsizei) width, (GLsizei) height );                                          
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:746

           glCullFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:769

             glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:798

    glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:820

       glDepthFunc( (GLenum)  func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:842

         glDepthMask ( (GLboolean) flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:864

             glDepthRangef ( (GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangex(JNIEnv* env, jclass clazz, jint zNear, jint zFar) {


//@line:886

            glDepthRangex ( (GLclampx)  zNear, (GLclampx)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:908

          glDisable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:930

         glDisableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:952

             glDrawArrays( (GLenum)  mode, (GLint)  first, (GLsizei) count );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1000

           glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1012

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3SI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1018

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3BI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1025

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1047

       glEnable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:1069

            glEnableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1091

       glFinish ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1113

          glFlush();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1135

       glFogf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1159

         glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1189

        glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1211

        glFogx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1235

          glFogxv( (GLenum)  pname, (GLfixed *)( params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1266

          glFogxv( (GLenum)  pname, (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1288

            glFrontFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumf(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:1320

         glFrustumf( (GLfloat)  left, (GLfloat)  right, 
                     (GLfloat)  bottom, (GLfloat)  top, 
                     (GLfloat)  zNear, (GLfloat)  zFar );             
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumx(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:1347

       glFrustumx( (GLfixed)  left, (GLfixed)  right, 
                   (GLfixed)  bottom, (GLfixed)  top, 
                   (GLfixed)  zNear, (GLfixed)  zFar );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1373

        glGenTextures ( (GLsizei) n, (GLuint *)(textures + offset );
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1402

       glGenTextures ( (GLsizei) n, (GLuint *)(textures + offset) );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES10Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:1424

              return (jnit)  glGetError ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1575

         glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1605

             glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES10Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:1627

        const char* str = (const char*) glGetString((GLenum) name);
        return env->NewStringUTF(str);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:1650

         glHint( (GLenum)  target, (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1672

        glLightModelf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1696

          glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1726

           glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1748

      glLightModelx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1772

        glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1802

         glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightf(JNIEnv* env, jclass clazz, jint light, jint pname, jfloat param) {


//@line:1824

          glLightf( (GLenum)  light, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1850

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1880

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightx(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:1902

      glLightx( (GLenum)  light, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1926

       glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1955

           glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:1977

            glLineWidth( (GLfloat)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidthx(JNIEnv* env, jclass clazz, jint width) {


//@line:1999

           glLineWidthx( (GLfixed)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadIdentity(JNIEnv* env, jclass clazz) {


//@line:2021

        glLoadIdentity ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2044

            glLoadMatrixf ((GLfloat *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2073

           glLoadMatrixf ((GLfloat *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2096

         glLoadMatrixx ( (GLfixed *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2125

            glLoadMatrixx ( (GLfixed *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLogicOp(JNIEnv* env, jclass clazz, jint opcode) {


//@line:2147

            glLogicOp( (GLenum)  opcode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialf(JNIEnv* env, jclass clazz, jint face, jint pname, jfloat param) {


//@line:2169

           glMaterialf( (GLenum)  face, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2192

                glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2221

        glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialx(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:2243

            glMaterialx( (GLenum)  face, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2266

           glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2295

            glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMatrixMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:2340

          glMatrixMode( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2362

          glMultMatrixf((GLfloat *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2391

            glMultMatrixf((GLfloat *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2414

        glMultMatrixx ( (GLfixed *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2443

        glMultMatrixx ( (GLfixed *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4f(JNIEnv* env, jclass clazz, jint target, jfloat s, jfloat t, jfloat r, jfloat q) {


//@line:2465

       glMultiTexCoord4f( (GLenum)  target, (GLfloat)  s, (GLfloat)  t, (GLfloat)  r, (GLfloat)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4x(JNIEnv* env, jclass clazz, jint target, jint s, jint t, jint r, jint q) {


//@line:2487

     glMultiTexCoord4x( (GLenum)  target, (GLfixed)  s, (GLfixed)  t, (GLfixed)  r, (GLfixed)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3f(JNIEnv* env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {


//@line:2509

         glNormal3f( (GLfloat)  nx, (GLfloat)  ny, (GLfloat)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3x(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:2531

          glNormal3x( (GLfixed)  nx, (GLfixed)  ny, (GLfixed)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormalPointerBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2560

        glNormalPointer( (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthof(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:2590

             glOrthof( (GLfloat)  left, (GLfloat)  right, 
                       (GLfloat)  bottom, (GLfloat)  top, 
                       (GLfloat)  zNear, (GLfloat)  zFar );                            
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthox(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:2623

          glOrthox( (GLfixed)  left,   (GLfixed)  right, 
                    (GLfixed)  bottom, (GLfixed)  top, 
                    (GLfixed)  zNear,  (GLfixed)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:2647

             glPixelStorei( (GLenum)  pname, (GLint)  param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSize(JNIEnv* env, jclass clazz, jfloat size) {


//@line:2669

        glPointSize( (GLfloat)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSizex(JNIEnv* env, jclass clazz, jint size) {


//@line:2691

          glPointSizex( (GLfixed)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:2713

        glPolygonOffset( (GLfloat)  factor, (GLfloat)  units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffsetx(JNIEnv* env, jclass clazz, jint factor, jint units) {


//@line:2735

       glPolygonOffsetx(
       (GLfixed)factor,
       (GLfixed)units);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPopMatrix(JNIEnv* env, jclass clazz) {


//@line:2760

               glPopMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPushMatrix(JNIEnv* env, jclass clazz) {


//@line:2782

          glPushMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLReadPixels__IIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:2825

        glReadPixels((GLint)x,
                    (GLint)y,
                    (GLsizei)width, 
                    (GLsizei)height,
                    (GLenum)format,
                    (GLenum)type,
                    (GLvoid *)(pixels + offset));                                
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLReadPixels__IIIIII_3BI(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:2850

        glReadPixels((GLint)x,
                    (GLint)y,
                    (GLsizei)width, 
                    (GLsizei)height,
                    (GLenum)format,
                    (GLenum)type,
                    (GLvoid *)(pixels + offset));                                
     
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLRotatef(JNIEnv* env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {


//@line:2878

       glRotatef( (GLfloat)  angle, (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLRotatex(JNIEnv* env, jclass clazz, jint angle, jint x, jint y, jint z) {


//@line:2900

         glRotatex( (GLfixed)  angle, (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:2922

         glSampleCoverage ( (GLclampf) value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoveragex(JNIEnv* env, jclass clazz, jint value, jboolean invert) {


//@line:2944

        glSampleCoveragex ( ( (GLclampx) ) value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:2966

       glScalef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:2988

         glScalex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3010

          glScissor( (GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLShadeModel(JNIEnv* env, jclass clazz, jint mode) {


//@line:3032

       glShadeModel( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:3054

      glStencilFunc( (GLenum)  func, (GLint)  ref, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:3076

      glStencilMask ( (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:3098

       glStencilOp( (GLenum)  fail, (GLenum)  zfail, (GLenum)  zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexCoordPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3130

    
    glTexCoordPointer( (GLint)  size, (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:3154

          glTexEnvf( (GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3178

            glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );
    

	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3210

             glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3232

              glTexEnvx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3259

           glTexEnvxv((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3294

            glTexEnvxv( (GLenum)  target, (GLenum)  pname, (GLfixed  *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3391

             glTexImage2D( (GLenum)  target,  
                          (GLint)  level,  
                          (GLint)  internalformat, 
                          (GLsizei) width, (GLsizei) height,  
                          (GLint)  border,  
                          (GLenum)  format,  
                          (GLenum)  type, 
                          (GLvoid *) (pixels + offset));                                
                                             
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:3425

             glTexImage2D( (GLenum)  target,  
                          (GLint)  level,  
                          (GLint)  internalformat, 
                          (GLsizei) width, (GLsizei) height,  
                          (GLint)  border,  
                          (GLenum)  format,  
                          (GLenum)  type, 
                          (GLvoid *) (pixels + offset));                                
                                             
     
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexImage2D__IIIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jshortArray obj_pixels, jint offset) {
	short* pixels = (short*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:3460

             glTexImage2D( (GLenum)  target,  
                          (GLint)  level,  
                          (GLint)  internalformat, 
                          (GLsizei) width, (GLsizei) height,  
                          (GLint)  border,  
                          (GLenum)  format,  
                          (GLenum)  type, 
                          (GLvoid *) (pixels + offset));                                
                                             
     
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexParameterf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:3490

       glTexParameterf((GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexParameterx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3512

      glTexParameterx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3602

                                                
                       glTexSubImage2D( (GLenum)  target,  
                                       (GLint)  level,  
                                       (GLint)  xoffset,  
                                       (GLint)  yoffset, 
                                       (GLsizei) width, 
                                       (GLsizei) height,  
                                       (GLenum)  format,  
                                       (GLenum)  type, 
                                       (GLvoid *)(pixels + offset) ) ;                               
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexSubImage2D__IIIIIIII_3BI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jbyteArray obj_pixels, jint offset) {
	char* pixels = (char*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:3638

                                                
                       glTexSubImage2D( (GLenum)  target,  
                                       (GLint)  level,  
                                       (GLint)  xoffset,  
                                       (GLint)  yoffset, 
                                       (GLsizei) width, 
                                       (GLsizei) height,  
                                       (GLenum)  format,  
                                       (GLenum)  type, 
                                       (GLvoid *)(pixels + offset) ) ;                               
     
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexSubImage2D__IIIIIIII_3SI(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jshortArray obj_pixels, jint offset) {
	short* pixels = (short*)env->GetPrimitiveArrayCritical(obj_pixels, 0);


//@line:3675

                                                
                       glTexSubImage2D( (GLenum)  target,  
                                       (GLint)  level,  
                                       (GLint)  xoffset,  
                                       (GLint)  yoffset, 
                                       (GLsizei) width, 
                                       (GLsizei) height,  
                                       (GLenum)  format,  
                                       (GLenum)  type, 
                                       (GLvoid *)(pixels + offset) ) ;                               
     
	env->ReleasePrimitiveArrayCritical(obj_pixels, pixels, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTranslatef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:3706

        glTranslatef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTranslatex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:3728

        glTranslatex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLVertexPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3761

    glVertexPointer((GLint)  size,  
                   (GLenum)  type, 
                   (GLsizei) stride, 
                   (GLvoid *) (pointer + offset) );                                                     
 

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3786

        glViewport((GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    
    

}

