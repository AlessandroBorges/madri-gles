#include <gles.internal.GLES10Pipeline.h>

//@line:23

      #define GL_GLEXT_PROTOTYPES 
      #include <GLES/egl.h>
      #include <GLES/gl.h>
      #include <GLES/glext.h>
      
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLES10ClassInit(JNIEnv* env, jclass clazz) {


//@line:91

      // no op
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:113

         glActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFunc(JNIEnv* env, jclass clazz, jint func, jfloat ref) {


//@line:135

          glAlphaFunc( (GLenum)  func, (GLclampf) ref );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLAlphaFuncx(JNIEnv* env, jclass clazz, jint func, jint ref) {


//@line:158

         glAlphaFuncx( (GLenum)  func, (GLclampx)  ref );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:180

             glBindTexture( (GLenum)  target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:202

            glBlendFunc( (GLenum)  sfactor, (GLenum)  dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:224

          glClear (  (GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:246

            glClearColor((GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearColorx(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:268

         glClearColorx ( (GLclampx)  red, (GLclampx)  green, (GLclampx)  blue, (GLclampx)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:290

          glClearDepthf ( (GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearDepthx(JNIEnv* env, jclass clazz, jint depth) {


//@line:312

             glClearDepthx ( (GLclampx)  depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:334

           glClearStencil( (GLint)  s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLClientActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:356

           glClientActiveTexture( (GLenum)  texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:378

            glColor4f( (GLfloat)  red, (GLfloat)  green, (GLfloat)  blue, (GLfloat)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColor4x(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:400

            glColor4x( (GLfixed)  red, (GLfixed)  green, (GLfixed)  blue, (GLfixed)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:422

               glColorMask ( (GLboolean) red, (GLboolean) green, (GLboolean) blue, (GLboolean) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:461

            glColorPointer( (GLint)  size, 
                            (GLenum)  type, 
                            (GLsizei) stride,
                            (GLvoid *) (pointer + offset) );                                         
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCompressedTexImage2D__IIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:534

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


//@line:552

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


//@line:624

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


//@line:640

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


//@line:694

        glCopyTexImage2D( (GLenum)  target, (GLint)  level, 
                          (GLenum)  internalformat, 
                          (GLint)  x, (GLint)  y, 
                          (GLsizei) width, (GLsizei) height, 
                          (GLint)  border );                                         
       

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:737

          glCopyTexSubImage2D( (GLenum)  target,
                               (GLint)  level, 
                               (GLint)  xoffset, (GLint)  yoffset, 
                               (GLint)  x, (GLint)  y, 
                               (GLsizei) width, (GLsizei) height );                                          
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:763

           glCullFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:786

             glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:815

    glDeleteTextures ( (GLsizei) n, (GLuint *) (textures + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:837

       glDepthFunc( (GLenum)  func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:859

         glDepthMask ( (GLboolean) flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:881

             glDepthRangef ( (GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDepthRangex(JNIEnv* env, jclass clazz, jint zNear, jint zFar) {


//@line:903

            glDepthRangex ( (GLclampx)  zNear, (GLclampx)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:925

          glDisable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDisableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:947

         glDisableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:969

             glDrawArrays( (GLenum)  mode, (GLint)  first, (GLsizei) count );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1017

           glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3II(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jintArray obj_indices, jint offset) {
	int* indices = (int*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1029

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3SI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jshortArray obj_indices, jint offset) {
	short* indices = (short*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1035

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLDrawElements__III_3BI(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jbyteArray obj_indices, jint offset) {
	char* indices = (char*)env->GetPrimitiveArrayCritical(obj_indices, 0);


//@line:1042

       glDrawElements( (GLenum)  mode, (GLsizei) count, (GLenum)  type, (GLvoid *)(indices + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_indices, indices, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1064

       glEnable( (GLenum)  cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLEnableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:1086

            glEnableClientState( (GLenum)  array );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1108

       glFinish ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1130

          glFlush();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1152

       glFogf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1176

         glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1206

        glFogfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1228

        glFogx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1252

          glFogxv( (GLenum)  pname, (GLfixed *)( params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFogxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1283

          glFogxv( (GLenum)  pname, (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1305

            glFrontFace( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumf(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:1337

         glFrustumf( (GLfloat)  left, (GLfloat)  right, 
                     (GLfloat)  bottom, (GLfloat)  top, 
                     (GLfloat)  zNear, (GLfloat)  zFar );             
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLFrustumx(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:1364

       glFrustumx( (GLfixed)  left, (GLfixed)  right, 
                   (GLfixed)  bottom, (GLfixed)  top, 
                   (GLfixed)  zNear, (GLfixed)  zFar );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1390

        glGenTextures((GLsizei) n, (GLuint *)(textures + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1419

       glGenTextures ( (GLsizei) n, (GLuint *)(textures + offset) );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES10Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:1441

         return (jint)  glGetError ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1592

         glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1622

             glGetIntegerv( (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES10Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:1644

        const char* str = (const char*) glGetString((GLenum) name);
        return env->NewStringUTF(str);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:1667

         glHint( (GLenum)  target, (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1689

        glLightModelf( (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1713

          glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1743

           glLightModelfv( (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1765

      glLightModelx( (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1789

        glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightModelxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1819

         glLightModelxv( (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightf(JNIEnv* env, jclass clazz, jint light, jint pname, jfloat param) {


//@line:1841

          glLightf( (GLenum)  light, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1867

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1897

          glLightfv( (GLenum)  light, (GLenum)  pname, (GLfloat *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightx(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:1919

      glLightx( (GLenum)  light, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1943

       glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *) (params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1972

           glLightxv( (GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:1994

            glLineWidth( (GLfloat)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLineWidthx(JNIEnv* env, jclass clazz, jint width) {


//@line:2016

           glLineWidthx( (GLfixed)  width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadIdentity(JNIEnv* env, jclass clazz) {


//@line:2038

        glLoadIdentity ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2061

            glLoadMatrixf ((GLfloat *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2090

           glLoadMatrixf ((GLfloat *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2113

         glLoadMatrixx ( (GLfixed *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLoadMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2142

            glLoadMatrixx ( (GLfixed *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLLogicOp(JNIEnv* env, jclass clazz, jint opcode) {


//@line:2164

            glLogicOp( (GLenum)  opcode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialf(JNIEnv* env, jclass clazz, jint face, jint pname, jfloat param) {


//@line:2186

           glMaterialf( (GLenum)  face, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2209

                glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2238

        glMaterialfv( (GLenum)  face, (GLenum)  pname,  (GLfloat *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialx(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:2260

            glMaterialx( (GLenum)  face, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2283

           glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2312

            glMaterialxv( (GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMatrixMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:2357

          glMatrixMode( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_m, jint offset) {
	float* m = (float*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2379

          glMultMatrixf((GLfloat *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixf__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	float* m = (float*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2408

            glMultMatrixf((GLfloat *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:2431

        glMultMatrixx ( (GLfixed *)(m + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultMatrixx__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:2460

        glMultMatrixx ( (GLfixed *)(m + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4f(JNIEnv* env, jclass clazz, jint target, jfloat s, jfloat t, jfloat r, jfloat q) {


//@line:2482

       glMultiTexCoord4f( (GLenum)  target, (GLfloat)  s, (GLfloat)  t, (GLfloat)  r, (GLfloat)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLMultiTexCoord4x(JNIEnv* env, jclass clazz, jint target, jint s, jint t, jint r, jint q) {


//@line:2504

     glMultiTexCoord4x( (GLenum)  target, (GLfixed)  s, (GLfixed)  t, (GLfixed)  r, (GLfixed)  q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3f(JNIEnv* env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {


//@line:2526

         glNormal3f( (GLfloat)  nx, (GLfloat)  ny, (GLfloat)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormal3x(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:2548

          glNormal3x( (GLfixed)  nx, (GLfixed)  ny, (GLfixed)  nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLNormalPointerBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2577

        glNormalPointer( (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthof(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:2607

             glOrthof( (GLfloat)  left, (GLfloat)  right, 
                       (GLfloat)  bottom, (GLfloat)  top, 
                       (GLfloat)  zNear, (GLfloat)  zFar );                            
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLOrthox(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:2640

          glOrthox( (GLfixed)  left,   (GLfixed)  right, 
                    (GLfixed)  bottom, (GLfixed)  top, 
                    (GLfixed)  zNear,  (GLfixed)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:2664

             glPixelStorei( (GLenum)  pname, (GLint)  param );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSize(JNIEnv* env, jclass clazz, jfloat size) {


//@line:2686

        glPointSize( (GLfloat)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPointSizex(JNIEnv* env, jclass clazz, jint size) {


//@line:2708

          glPointSizex( (GLfixed)  size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:2730

        glPolygonOffset( (GLfloat)  factor, (GLfloat)  units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPolygonOffsetx(JNIEnv* env, jclass clazz, jint factor, jint units) {


//@line:2752

       glPolygonOffsetx(
       (GLfixed)factor,
       (GLfixed)units);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPopMatrix(JNIEnv* env, jclass clazz) {


//@line:2777

               glPopMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLPushMatrix(JNIEnv* env, jclass clazz) {


//@line:2799

          glPushMatrix();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLReadPixels__IIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:2842

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


//@line:2867

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


//@line:2895

       glRotatef( (GLfloat)  angle, (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLRotatex(JNIEnv* env, jclass clazz, jint angle, jint x, jint y, jint z) {


//@line:2917

         glRotatex( (GLfixed)  angle, (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:2939

         glSampleCoverage ( (GLclampf) value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLSampleCoveragex(JNIEnv* env, jclass clazz, jint value, jboolean invert) {


//@line:2961

        glSampleCoveragex((GLclampx)value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:2983

       glScalef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScalex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:3005

         glScalex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3027

          glScissor( (GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLShadeModel(JNIEnv* env, jclass clazz, jint mode) {


//@line:3049

       glShadeModel( (GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:3071

      glStencilFunc( (GLenum)  func, (GLint)  ref, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:3093

      glStencilMask ( (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:3115

       glStencilOp( (GLenum)  fail, (GLenum)  zfail, (GLenum)  zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexCoordPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3147

    
    glTexCoordPointer( (GLint)  size, (GLenum)  type, (GLsizei) stride, (GLvoid *) (pointer + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:3171

          glTexEnvf( (GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3195

            glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );
    

	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3227

             glTexEnvfv( (GLenum)  target, (GLenum)  pname, (GLfloat  *)(params + offset) );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3249

              glTexEnvx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3276

           glTexEnvxv((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3311

            glTexEnvxv( (GLenum)  target, (GLenum)  pname, (GLfixed  *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3408

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


//@line:3442

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


//@line:3477

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


//@line:3507

       glTexParameterf((GLenum)  target, (GLenum)  pname, (GLfloat)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexParameterx(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:3529

      glTexParameterx( (GLenum)  target, (GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTexSubImage2D__IIIIIIIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offset) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3619

                                                
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


//@line:3655

                                                
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


//@line:3692

                                                
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


//@line:3723

        glTranslatef( (GLfloat)  x, (GLfloat)  y, (GLfloat)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLTranslatex(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:3745

        glTranslatex( (GLfixed)  x, (GLfixed)  y, (GLfixed)  z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLVertexPointerBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:3778

    glVertexPointer((GLint)  size,  
                   (GLenum)  type, 
                   (GLsizei) stride, 
                   (GLvoid *) (pointer + offset) );                                                     
 

}

JNIEXPORT void JNICALL Java_gles_internal_GLES10Pipeline_nGLViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3803

        glViewport((GLint)  x, (GLint)  y, (GLsizei) width, (GLsizei) height );
    
    

}

