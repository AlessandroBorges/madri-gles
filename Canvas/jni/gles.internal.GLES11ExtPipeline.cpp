#include <gles.internal.GLES11ExtPipeline.h>

//@line:26

      #define GL_GLEXT_PROTOTYPES 1
      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
    //  static PFNGLBLENDEQUATIONSEPARATEOESPROC glBlendEquationSeparateOES;
      
      //using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLES11ExtClassInit(JNIEnv* env, jclass clazz) {


//@line:89

          // PFNGLBLENDEQUATIONSEPARATEOESPROC glBlendEquationSeparateOES;
          // glBlendEquationSeparateOES =  reinterpret_cast<PFNGLBLENDEQUATIONSEPARATEOESPROC>(eglGetProcAddress("glBlendEquationSeparateOES"));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLBlendEquationSeparateOES(JNIEnv* env, jclass clazz, jint modeRGB, jint modeAlpha) {


//@line:112

         glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha );
         
//      if(glBlendEquationSeparateOES){
//         glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha );
//         return JNI_TRUE;
//      }else{
//         return JNI_FALSE;
//      }
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLBlendFuncSeparateOES(JNIEnv* env, jclass clazz, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {


//@line:141

       glBlendFuncSeparateOES((GLenum)  srcRGB, (GLenum)  dstRGB, (GLenum)  srcAlpha, (GLenum)  dstAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLBlendEquationOES(JNIEnv* env, jclass clazz, jint mode) {


//@line:163

        glBlendEquationOES((GLenum)  mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexsOES(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z, jshort width, jshort height) {


//@line:185

       glDrawTexsOES((GLshort) x, (GLshort) y, (GLshort) z, (GLshort) width, (GLshort) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexiOES(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint width, jint height) {


//@line:207

       glDrawTexiOES((GLint) x, (GLint) y, (GLint) z, (GLint) width, (GLint) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexxOES(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint width, jint height) {


//@line:229

        glDrawTexxOES ((GLfixed) x,(GLfixed) y,(GLfixed) z,(GLfixed) width,(GLfixed) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexsvOES___3SI(JNIEnv* env, jclass clazz, jshortArray obj_coords, jint offset) {
	short* coords = (short*)env->GetPrimitiveArrayCritical(obj_coords, 0);


//@line:251

      glDrawTexsvOES((GLshort *) (coords + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_coords, coords, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexsvOES__Ljava_nio_ShortBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_coords, jint offset) {
	short* coords = (short*)(obj_coords?env->GetDirectBufferAddress(obj_coords):0);


//@line:281

     glDrawTexsvOES((GLshort *) (coords + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexivOES___3II(JNIEnv* env, jclass clazz, jintArray obj_coords, jint offset) {
	int* coords = (int*)env->GetPrimitiveArrayCritical(obj_coords, 0);


//@line:304

      glDrawTexivOES((GLint *)(coords + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_coords, coords, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexivOES__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_coords, jint offset) {
	int* coords = (int*)(obj_coords?env->GetDirectBufferAddress(obj_coords):0);


//@line:333

       glDrawTexivOES((GLint *)(coords + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexxvOES___3II(JNIEnv* env, jclass clazz, jintArray obj_coords, jint offset) {
	int* coords = (int*)env->GetPrimitiveArrayCritical(obj_coords, 0);


//@line:356

         glDrawTexxvOES((GLfixed *)(coords + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_coords, coords, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexxvOES__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_coords, jint offset) {
	int* coords = (int*)(obj_coords?env->GetDirectBufferAddress(obj_coords):0);


//@line:386

    glDrawTexxvOES((GLfixed *)(coords + offset));


}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexfOES(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat width, jfloat height) {


//@line:408

       glDrawTexfOES((GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) width, (GLfloat) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexfvOES___3FI(JNIEnv* env, jclass clazz, jfloatArray obj_coords, jint offset) {
	float* coords = (float*)env->GetPrimitiveArrayCritical(obj_coords, 0);


//@line:431

       glDrawTexfvOES((GLfloat *)(coords + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_coords, coords, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDrawTexfvOES__Ljava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_coords, jint offset) {
	float* coords = (float*)(obj_coords?env->GetDirectBufferAddress(obj_coords):0);


//@line:461

       glDrawTexfvOES((GLfloat *)(coords + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetTexture2DOES__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jobject obj_image, jint offset) {
	unsigned char* image = (unsigned char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);


//@line:512
    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetTexture2DOES__I_3BI(JNIEnv* env, jclass clazz, jint target, jbyteArray obj_image, jint offset) {
	char* image = (char*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:517
    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetTexture2DOES__I_3II(JNIEnv* env, jclass clazz, jint target, jintArray obj_image, jint offset) {
	int* image = (int*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:522
    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetTexture2DOES__I_3SI(JNIEnv* env, jclass clazz, jint target, jshortArray obj_image, jint offset) {
	short* image = (short*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:527
    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetRenderbufferStorageOES__ILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jobject obj_image, jint offset) {
	unsigned char* image = (unsigned char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);


//@line:580

         glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetRenderbufferStorageOES__I_3BI(JNIEnv* env, jclass clazz, jint target, jbyteArray obj_image, jint offset) {
	char* image = (char*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:584

    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetRenderbufferStorageOES__I_3SI(JNIEnv* env, jclass clazz, jint target, jshortArray obj_image, jint offset) {
	short* image = (short*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:588

    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLEGLImageTargetRenderbufferStorageOES__I_3II(JNIEnv* env, jclass clazz, jint target, jintArray obj_image, jint offset) {
	int* image = (int*)env->GetPrimitiveArrayCritical(obj_image, 0);


//@line:592

    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_image, image, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLAlphaFuncxOES(JNIEnv* env, jclass clazz, jint func, jint ref) {


//@line:612

       glAlphaFuncxOES((GLenum)  func,  (GLclampx)  ref );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClearColorxOES(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:634

       glClearColorxOES( (GLclampx)  red,  (GLclampx)  green,  (GLclampx)  blue,  (GLclampx)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClearDepthxOES(JNIEnv* env, jclass clazz, jint depth) {


//@line:656

      glClearDepthxOES( (GLclampx)  depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClipPlanexOES__I_3II(JNIEnv* env, jclass clazz, jint plane, jintArray obj_equation, jint offset) {
	int* equation = (int*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:678

     glClipPlanexOES((GLenum)  plane, (GLfixed *)(equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClipPlanexOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	int* equation = (int*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:706

         glClipPlanexOES((GLenum)  plane, (GLfixed *)(equation + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLColor4xOES(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:728

          glColor4xOES ((GLfixed) red,(GLfixed) green,(GLfixed) blue,(GLfixed) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDepthRangexOES(JNIEnv* env, jclass clazz, jint zNear, jint zFar) {


//@line:750

       glDepthRangexOES( (GLclampx)  zNear,  (GLclampx)  zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFogxOES(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:772

      glFogxOES((GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFogxvOES__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:795

       glFogxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFogxvOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:824

         glFogxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFrustumxOES(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:856

       glFrustumxOES ((GLfixed) left,(GLfixed) right,
                      (GLfixed) bottom,(GLfixed) top,
                      (GLfixed) zNear,(GLfixed) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetClipPlanexOES__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_eqn, jint offset) {
	int* eqn = (int*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:881

    glGetClipPlanexOES((GLenum)  pname, (GLfixed *)(eqn + offset));
  
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetClipPlanexOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	int* eqn = (int*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:911

      glGetClipPlanexOES((GLenum)  pname, (GLfixed *)(eqn + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetFixedvOES__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:934

      glGetFixedvOES((GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetFixedvOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:964

         glGetFixedvOES((GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetLightxvOES__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:988

       glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetLightxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1018

       glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetMaterialxvOES__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1040

            glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetMaterialxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1070

       glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset) );
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexEnvxvOES__II_3II(JNIEnv* env, jclass clazz, jint envir, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1094

      glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexEnvxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1123

       glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexParameterxvOES__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1143

       glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexParameterxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1171

       glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightModelxOES(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1191

       glLightModelxOES((GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightModelxvOES__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1213

       glLightModelxvOES((GLenum)  pname,    (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightModelxvOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1234

       glLightModelxvOES((GLenum)  pname,    (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightxOES(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:1254

      glLightxOES((GLenum)  light, (GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightxvOES__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1274

        glLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLightxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1303

       glLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLineWidthxOES(JNIEnv* env, jclass clazz, jint width) {


//@line:1323

     glLineWidthxOES ((GLfixed) width );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLoadMatrixxOES___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:1344

         glLoadMatrixxOES(   (GLfixed *)(m + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLoadMatrixxOES__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:1373

       glLoadMatrixxOES(   (GLfixed *)(m + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMaterialxOES(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:1393

       glMaterialxOES((GLenum)  face, (GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMaterialxvOES__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1415

       glMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMaterialxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1444

      glMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMultMatrixxOES___3II(JNIEnv* env, jclass clazz, jintArray obj_m, jint offset) {
	int* m = (int*)env->GetPrimitiveArrayCritical(obj_m, 0);


//@line:1465

    glMultMatrixxOES(   (GLfixed *)(m + offset));    
 
	env->ReleasePrimitiveArrayCritical(obj_m, m, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMultMatrixxOES__Ljava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jobject obj_m, jint offset) {
	int* m = (int*)(obj_m?env->GetDirectBufferAddress(obj_m):0);


//@line:1493

       glMultMatrixxOES(   (GLfixed *)(m + offset));    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMultiTexCoord4xOES(JNIEnv* env, jclass clazz, jint target, jint s, jint t, jint r, jint q) {


//@line:1513

       glMultiTexCoord4xOES((GLenum)  target,(GLfixed) s,(GLfixed) t,(GLfixed) r,(GLfixed) q );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLNormal3xOES(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:1533

       glNormal3xOES ((GLfixed) nx,(GLfixed) ny,(GLfixed) nz );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLOrthoxOES(JNIEnv* env, jclass clazz, jint left, jint right, jint bottom, jint top, jint zNear, jint zFar) {


//@line:1561

       glOrthoxOES ((GLfixed) left,(GLfixed) right,
                    (GLfixed) bottom,(GLfixed) top,
                    (GLfixed) zNear,(GLfixed) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLPointParameterxOES(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1583

       glPointParameterxOES((GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLPointParameterxvOES__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1603

         glPointParameterxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLPointParameterxvOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1627

       glPointParameterxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLPointSizexOES(JNIEnv* env, jclass clazz, jint size) {


//@line:1647

      glPointSizexOES ((GLfixed) size );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLPolygonOffsetxOES(JNIEnv* env, jclass clazz, jint factor, jint units) {


//@line:1667

       glPolygonOffsetxOES ((GLfixed) factor,(GLfixed) units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLRotatexOES(JNIEnv* env, jclass clazz, jint angle, jint x, jint y, jint z) {


//@line:1687

     glRotatexOES ((GLfixed) angle,(GLfixed) x,(GLfixed) y,(GLfixed) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLSampleCoveragexOES(JNIEnv* env, jclass clazz, jint value, jboolean invert) {


//@line:1707

       glSampleCoveragexOES( (GLclampx)  value, (GLboolean) invert );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLScalexOES(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:1727

      glScalexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexEnvxOES(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1747

       glTexEnvxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexEnvxvOES__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1767

        glTexEnvxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexEnvxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1791

       glTexEnvxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexParameterxOES(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1811

      glTexParameterxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexParameterxvOES__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1831

    glTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
 
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexParameterxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1852

       glTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTranslatexOES(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:1872

           glTranslatexOES((GLfixed) x, (GLfixed) y, (GLfixed) z );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11ExtPipeline_nGLIsRenderbufferOES(JNIEnv* env, jclass clazz, jint renderbuffer) {


//@line:1892

            return (jboolean)  glIsRenderbufferOES((GLuint)  renderbuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLBindRenderbufferOES(JNIEnv* env, jclass clazz, jint target, jint renderbuffer) {


//@line:1912

       glBindRenderbufferOES((GLenum)  target, (GLuint)  renderbuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDeleteRenderbuffersOES__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1932

         glDeleteRenderbuffersOES((GLsizei) n, (GLuint  *)(renderbuffers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDeleteRenderbuffersOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1956

       glDeleteRenderbuffersOES((GLsizei) n, (GLuint  *)(renderbuffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGenRenderbuffersOES__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1978

         glGenRenderbuffersOES((GLsizei) n, (GLuint *)(renderbuffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGenRenderbuffersOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:2003

       glGenRenderbuffersOES((GLsizei) n, (GLuint *)(renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLRenderbufferStorageOES(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint width, jint height) {


//@line:2030

       glRenderbufferStorageOES((GLenum)  target, (GLenum)  internalformat, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetRenderbufferParameterivOES__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2050

      glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)(params + offset));
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetRenderbufferParameterivOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2078

         glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11ExtPipeline_nGLIsFramebufferOES(JNIEnv* env, jclass clazz, jint framebuffer) {


//@line:2098

          return (jboolean) glIsFramebufferOES((GLuint)  framebuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLBindFramebufferOES(JNIEnv* env, jclass clazz, jint target, jint framebuffer) {


//@line:2118

     glBindFramebufferOES((GLenum)  target, (GLuint)  framebuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDeleteFramebuffersOES__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:2138

      glDeleteFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDeleteFramebuffersOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:2168

       glDeleteFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGenFramebuffersOES__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:2189

        glGenFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGenFramebuffersOES__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:2216

        glGenFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset) );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES11ExtPipeline_nGLCheckFramebufferStatusOES(JNIEnv* env, jclass clazz, jint target) {


//@line:2236

       return (jint) glCheckFramebufferStatusOES((GLenum)  target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFramebufferRenderbufferOES(JNIEnv* env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {


//@line:2267

       glFramebufferRenderbufferOES((GLenum)  target, 
                                     (GLenum)  attachment, 
                                     (GLenum)  renderbuffertarget, 
                                     (GLuint)  renderbuffer );                             
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFramebufferTexture2DOES(JNIEnv* env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {


//@line:2300

       glFramebufferTexture2DOES((GLenum)  target, 
                                 (GLenum)  attachment, 
                                 (GLenum)  textarget, 
                                 (GLuint)  texture, 
                                 (GLint) level );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetFramebufferAttachmentParameterivOES__III_3II(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2338

        glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
            (GLenum)  attachment,
            (GLenum)  pname, 
            (GLint *)(params + offset));                                                                         
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetFramebufferAttachmentParameterivOES__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2374

        glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
                                                 (GLenum)  attachment, 
                                                 (GLenum)  pname, 
                                                 (GLint *)(params + offset));                                                                         
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGenerateMipmapOES(JNIEnv* env, jclass clazz, jint target) {


//@line:2397

       glGenerateMipmapOES((GLenum)  target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLCurrentPaletteMatrixOES(JNIEnv* env, jclass clazz, jint matrixpaletteindex) {


//@line:2418

       glCurrentPaletteMatrixOES((GLuint)  matrixpaletteindex );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLLoadPaletteFromModelViewMatrixOES(JNIEnv* env, jclass clazz) {


//@line:2439

        glLoadPaletteFromModelViewMatrixOES();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMatrixIndexPointerOES(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:2462

        glMatrixIndexPointerOES(
        (GLint)size,
        (GLenum)type,
        (GLsizei)stride,
        reinterpret_cast<GLvoid *>(offset)
    );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLMatrixIndexPointerOESBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2482

                                                              
            glMatrixIndexPointerOES((GLint) size, 
                                    (GLenum)  type, 
                                    (GLsizei) stride, 
                                    (GLvoid *) (pointer + offset));                                                  
        
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLWeightPointerOESBounds(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:2517

        glWeightPointerOES((GLint) size, 
                           (GLenum)  type, 
                           (GLsizei) stride, 
                           (GLvoid *) (pointer + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLDepthRangefOES(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:2549

      glDepthRangefOES((GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLFrustumfOES(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:2571

       glFrustumfOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLOrthofOES(JNIEnv* env, jclass clazz, jfloat left, jfloat right, jfloat bottom, jfloat top, jfloat zNear, jfloat zFar) {


//@line:2593

      glOrthofOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClipPlanefOES__I_3FI(JNIEnv* env, jclass clazz, jint plane, jfloatArray obj_equation, jint offset) {
	float* equation = (float*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:2615

         glClipPlanefOES((GLenum)  plane, (GLfloat *)(equation + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClipPlanefOES__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	float* equation = (float*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:2639

       glClipPlanefOES((GLenum)  plane, (GLfloat *)(equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetClipPlanefOES__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_eqn, jint offset) {
	float* eqn = (float*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:2661

    glGetClipPlanefOES((GLenum)  pname, (GLfloat *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetClipPlanefOES__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	float* eqn = (float*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:2684

        glGetClipPlanefOES((GLenum)  pname, (GLfloat *)(eqn + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLClearDepthfOES(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:2706

         glClearDepthfOES( (GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenfOES(JNIEnv* env, jclass clazz, jint coord, jint pname, jfloat param) {


//@line:2728

         glTexGenfOES((GLenum)  coord, (GLenum)  pname, (GLfloat) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenfvOES__II_3FI(JNIEnv* env, jclass clazz, jint coord, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2750

        glTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenfvOES__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2773

        glTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGeniOES(JNIEnv* env, jclass clazz, jint coord, jint pname, jint param) {


//@line:2795

          glTexGeniOES((GLenum)  coord, (GLenum)  pname, (GLint) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenivOES__II_3II(JNIEnv* env, jclass clazz, jint coord, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2820

        glTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenivOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2846

        glTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenxOES(JNIEnv* env, jclass clazz, jint coord, jint pname, jint param) {


//@line:2868

        glTexGenxOES((GLenum)  coord, (GLenum)  pname, (GLfixed) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenxvOES__II_3II(JNIEnv* env, jclass clazz, jint coord, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2890

    glTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLTexGenxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2916

       glTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenfvOES__II_3FI(JNIEnv* env, jclass clazz, jint coord, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2939

    glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset) );
 
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenfvOES__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2962

       glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenivOES__II_3II(JNIEnv* env, jclass clazz, jint coord, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2984

       glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenivOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3007

        glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenxvOES__II_3II(JNIEnv* env, jclass clazz, jint coord, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3033

       glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11ExtPipeline_nGLGetTexGenxvOES__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3066

       glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    

}

