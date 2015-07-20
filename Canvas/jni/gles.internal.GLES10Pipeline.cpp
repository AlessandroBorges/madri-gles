#include <gles.internal.GLES10Pipeline.h>

//@line:23

      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLES10ClassInit(JNIEnv* env, jclass clazz) {


//@line:89

      // no op
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:111

         glActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFunc(JNIEnv* env, jclass clazz, jint func, jfloat ref) {


//@line:133

          glAlphaFunc( (GLenum)  func, (GLclampf) ref );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFuncx(JNIEnv* env, jclass clazz, jint func, jint ref) {


//@line:156

         glAlphaFuncx( (GLenum)  func, (GLclampx)  ref );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:178

             glBindTexture( (GLenum)  target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:200

            glBlendFunc( (GLenum)  sfactor, (GLenum)  dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:222

          glClear (  (GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:244

            glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColorx(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:266

         glClearColorx ( (GLclampx)  red, (GLclampx)  green, (GLclampx)  blue, (GLclampx)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:288

          glClearDepthf ( (GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthx(JNIEnv* env, jclass clazz, jint depth) {


//@line:310

             glClearDepthx ( (GLclampx)  depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:332

           glClearStencil( (GLint)  s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClientActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:354

           glClientActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:376

            glColor4f( (GLfloat)  red, (GLfloat)  green, (GLfloat)  blue, (GLfloat)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4x(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:398

            glColor4x( (GLfixed)  red, (GLfixed)  green, (GLfixed)  blue, (GLfixed)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:420

               glColorMask ( (GLboolean) red, (GLboolean) green, (GLboolean) blue, (GLboolean) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:459

            glColorPointer( (GLint)  size, 
                            (GLenum)  type, 
                            (GLsizei) stride,
                            (GLvoid *) (pointer + offset) );                                         
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexImage2D__IIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:532

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


//@line:550

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


//@line:622

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


//@line:638

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


//@line:692

        glCopyTexImage2D( (GLenum)  target, (GLint)  level, 
                          (GLenum)  internalformat, 
                          (GLint)  x, (GLint)  y, 
                          (GLsizei) width, (GLsizei) height, 
                          (GLint)  border );                                         
       

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:735

          glCopyTexSubImage2D( (GLenum)  target,
                               (GLint)  level, 
                               (GLint)  xoffset, (GLint)  yoffset, 
                               (GLint)  x, (GLint)  y, 
                               (GLsizei) width, (GLsizei) height );                                          
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:761

           glCullFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:784

             glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:813

    glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:835

       glDepthFunc( (GLenum)  func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:857

         glDepthMask ( (GLboolean) flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:879

             glDepthRangef ( (GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangex(JNIEnv* env, jclass clazz, jint zNear, jint zFar) {


//@line:901

            glDepthRangex ( (GLclampx)  zNear, (GLclampx)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:923

          glDisable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:945

         glDisableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:967

             glDrawArrays( (GLenum)  mode, (GLint)  first, (GLsizei) count );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1015

           glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1027

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3SI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1033

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3BI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1040

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1062

       glEnable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:1084

            glEnableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1106

       glFinish ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1128

          glFlush();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1150

       glFogf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1174

         glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1204

        glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1226

        glFogx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1250

          glFogxv( (GLenum)  pname, (GLfixed *)( params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1281

          glFogxv( (GLenum)  pname, (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1303

            glFrontFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumf(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:1335

         glFrustumf( (GLfloat)  left, (GLfloat)  right, 
                     (GLfloat)  bottom, (GLfloat)  top, 
                     (GLfloat)  zNear, (GLfloat)  zFar );             
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumx(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:1362

       glFrustumx( (GLfixed)  left, (GLfixed)  right, 
                   (GLfixed)  bottom, (GLfixed)  top, 
                   (GLfixed)  zNear, (GLfixed)  zFar );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1388

        glGenTextures((GLsizei) n, (GLuint *)(textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1417

       glGenTextures ( (GLsizei) n, (GLuint *)(textures + offset) );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES10Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:1439

         return (jint)  glGetError ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1590

         glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1620

             glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES10Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:1642

        const char* str = (const char*) glGetString((GLenum) name);
        return env->NewStringUTF(str);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:1665

         glHint( (GLenum)  target, (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1687

        glLightModelf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1711

          glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1741

           glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1763

      glLightModelx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1787

        glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1817

         glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightf(JNIEnv* env, jclass clazz, jint light, jint pname, jfloat param) {


//@line:1839

          glLightf( (GLenum)  light, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1865

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1895

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightx(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:1917

      glLightx( (GLenum)  light, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1941

       glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1970

           glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:1992

            glLineWidth( (GLfloat)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidthx(JNIEnv* env, jclass clazz, jint width) {


//@line:2014

           glLineWidthx( (GLfixed)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadIdentity(JNIEnv* env, jclass clazz) {


//@line:2036

        glLoadIdentity ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2059

            glLoadMatrixf ((GLfloat *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2088

           glLoadMatrixf ((GLfloat *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2111

         glLoadMatrixx ( (GLfixed *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2140

            glLoadMatrixx ( (GLfixed *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLogicOp(JNIEnv* env, jclass clazz, jint opcode) {


//@line:2162

            glLogicOp( (GLenum)  opcode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialf(JNIEnv* env, jclass clazz, jint face, jint pname, jfloat param) {


//@line:2184

           glMaterialf( (GLenum)  face, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2207

                glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2236

        glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialx(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:2258

            glMaterialx( (GLenum)  face, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2281

           glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2310

            glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMatrixMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:2355

          glMatrixMode( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2377

          glMultMatrixf((GLfloat *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2406

            glMultMatrixf((GLfloat *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2429

        glMultMatrixx ( (GLfixed *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2458

        glMultMatrixx ( (GLfixed *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4f(JNIEnv* env, jclass clazz, jint target, jfloat s, jfloat t, jfloat r, jfloat q) {


//@line:2480

       glMultiTexCoord4f( (GLenum)  target, (GLfloat)  s, (GLfloat)  t, (GLfloat)  r, (GLfloat)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4x(JNIEnv* env, jclass clazz, jint target, jint s, jint t, jint r, jint q) {


//@line:2502

     glMultiTexCoord4x( (GLenum)  target, (GLfixed)  s, (GLfixed)  t, (GLfixed)  r, (GLfixed)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3f(JNIEnv* env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {


//@line:2524

         glNormal3f( (GLfloat)  nx, (GLfloat)  ny, (GLfloat)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3x(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:2546

          glNormal3x( (GLfixed)  nx, (GLfixed)  ny, (GLfixed)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormalPointerBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2575

        glNormalPointer( (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthof(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:2605

             glOrthof( (GLfloat)  left, (GLfloat)  right, 
                       (GLfloat)  bottom, (GLfloat)  top, 
                       (GLfloat)  zNear, (GLfloat)  zFar );                            
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthox(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:2638

          glOrthox( (GLfixed)  left,   (GLfixed)  right, 
                    (GLfixed)  bottom, (GLfixed)  top, 
                    (GLfixed)  zNear,  (GLfixed)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:2662

             glPixelStorei( (GLenum)  pname, (GLint)  param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSize(JNIEnv* env, jclass clazz, jfloat size) {


//@line:2684

        glPointSize( (GLfloat)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSizex(JNIEnv* env, jclass clazz, jint size) {


//@line:2706

          glPointSizex( (GLfixed)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:2728

        glPolygonOffset( (GLfloat)  factor, (GLfloat)  units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffsetx(JNIEnv* env, jclass clazz, jint factor, jint units) {


//@line:2750

       glPolygonOffsetx(
       (GLfixed)factor,
       (GLfixed)units);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPopMatrix(JNIEnv* env, jclass clazz) {


//@line:2775

               glPopMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPushMatrix(JNIEnv* env, jclass clazz) {


//@line:2797

          glPushMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLReadPixels__IIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:2840

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


//@line:2865

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


//@line:2893

       glRotatef( (GLfloat)  angle, (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLRotatex(JNIEnv* env, jclass clazz, jint angle, jint x, jint y, jint z) {


//@line:2915

         glRotatex( (GLfixed)  angle, (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:2937

         glSampleCoverage ( (GLclampf) value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoveragex(JNIEnv* env, jclass clazz, jint value, jboolean invert) {


//@line:2959

        glSampleCoveragex((GLclampx)value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:2981

       glScalef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:3003

         glScalex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3025

          glScissor( (GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLShadeModel(JNIEnv* env, jclass clazz, jint mode) {


//@line:3047

       glShadeModel( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:3069

      glStencilFunc( (GLenum)  func, (GLint)  ref, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:3091

      glStencilMask ( (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:3113

       glStencilOp( (GLenum)  fail, (GLenum)  zfail, (GLenum)  zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexCoordPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3145

    
    glTexCoordPointer( (GLint)  size, (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:3169

          glTexEnvf( (GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3193

            glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );
    

	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3225

             glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3247

              glTexEnvx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3274

           glTexEnvxv((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3309

            glTexEnvxv( (GLenum)  target, (GLenum)  pname, (GLfixed  *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3406

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


//@line:3440

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


//@line:3475

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


//@line:3505

       glTexParameterf((GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexParameterx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3527

      glTexParameterx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3617

                                                
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


//@line:3653

                                                
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


//@line:3690

                                                
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


//@line:3721

        glTranslatef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTranslatex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:3743

        glTranslatex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLVertexPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3776

    glVertexPointer((GLint)  size,  
                   (GLenum)  type, 
                   (GLsizei) stride, 
                   (GLvoid *) (pointer + offset) );                                                     
 

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3801

        glViewport((GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    
    

}

