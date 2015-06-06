#include <gles.internal.GLES11Pipeline.h>

//@line:19

      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLES11ClassInit(JNIEnv* env, jclass clazz) {


//@line:83

      // no op
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:106

       glBindBuffer((GLenum)  target, (GLuint ) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offset, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:158

        glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3BII(JNIEnv* env, jclass clazz, jint target, jint size, jbyteArray obj_data, jint offset, jint usage) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:170

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3SII(JNIEnv* env, jclass clazz, jint target, jint size, jshortArray obj_data, jint offset, jint usage) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:182

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3FII(JNIEnv* env, jclass clazz, jint target, jint size, jfloatArray obj_data, jint offset, jint usage) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:194

      glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3III(JNIEnv* env, jclass clazz, jint target, jint size, jintArray obj_data, jint offset, jint usage) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:206

     glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint dataOffset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:259

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3BI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jbyteArray obj_data, jint dataOffset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:263

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3SI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jshortArray obj_data, jint dataOffset) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:267

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3II(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jintArray obj_data, jint dataOffset) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:271

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3FI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jfloatArray obj_data, jint dataOffset) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:275

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint plane, jfloatArray obj_equation, jint offset) {
	float* equation = (float*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:298

      glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	float* equation = (float*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:327

        glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint plane, jintArray obj_equation, jint offset) {
	int* equation = (int*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:350

        glClipPlanex((GLenum)  plane,  (GLfixed *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	int* equation = (int*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:379

            glClipPlanex((GLenum)  plane,  (GLfixed *)(equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColor4ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:401

         glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:425

         glColorPointer((GLint)  size,  
                        (GLenum)  type, 
                        (GLsizei)  stride,  
                        reinterpret_cast<GLvoid *>(offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:451

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:480

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDrawElements(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:502

       glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:525

        glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:554

       glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3ZI(JNIEnv* env, jclass clazz, jint pname, jbooleanArray obj_params, jint offset) {
	bool* params = (bool*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:578

       glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:582

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:612

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:635

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:664

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_eqn, jint offset) {
	float* eqn = (float*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:687

        glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	float* eqn = (float*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:716

          glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_eqn, jint offset) {
	int* eqn = (int*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:739

        glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	int* eqn = (int*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:768

       glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:791

         glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:821

       glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:845

       glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:875

         glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:899

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:929

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:953

         glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:983

       glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)( params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1007

          glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1037

        glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1061

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1094

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint envir, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1118

          glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1148

        glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint envir, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1172

        glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1203

       glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint envir, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1227

        glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1258

             glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1281

         glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1311

        glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1334

      glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1364

           glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1387

        glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1417

            glGetTexParameterxv( (GLenum)target,
                    (GLenum)pname,
                    (GLfixed *)(params + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:1441

      GLboolean _returnValue = glIsBuffer( (GLuint)buffer);
      return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:1464

       GLboolean _returnValue = glIsEnabled((GLenum)cap);
       return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:1487

      GLboolean val = glIsTexture( (GLuint)texture);
      return (jboolean)val;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLNormalPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jint offset) {


//@line:1510

        glNormalPointer( (GLenum)  type, 
                         (GLsizei)  stride,  
                         reinterpret_cast<GLvoid *> (offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1534

         glPointParameterf((GLenum)  pname, (GLfloat) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1557

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1587

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1609

         glPointParameterx((GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1631

         glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1661

       glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointSizePointerOESBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:1690

       glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)(pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexCoordPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1712

         glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,   reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnvi(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1734

       glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1757

        glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1787

           glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1810

          glTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1840

        glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1862

         glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1885

            glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1915

           glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1938

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1968

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLVertexPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1990

         glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  reinterpret_cast<GLvoid *>(offset));
    

}

