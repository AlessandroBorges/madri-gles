#include <gles.internal.GLES11Pipeline.h>

//@line:21

       #define GL_GLEXT_PROTOTYPES
      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLES11ClassInit(JNIEnv* env, jclass clazz) {


//@line:86

      // no op
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:109

       glBindBuffer((GLenum)  target, (GLuint ) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offset, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:161

        glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3BII(JNIEnv* env, jclass clazz, jint target, jint size, jbyteArray obj_data, jint offset, jint usage) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:173

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3SII(JNIEnv* env, jclass clazz, jint target, jint size, jshortArray obj_data, jint offset, jint usage) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:185

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3FII(JNIEnv* env, jclass clazz, jint target, jint size, jfloatArray obj_data, jint offset, jint usage) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:197

      glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3III(JNIEnv* env, jclass clazz, jint target, jint size, jintArray obj_data, jint offset, jint usage) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:209

     glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint dataOffset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:262

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3BI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jbyteArray obj_data, jint dataOffset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:266

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3SI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jshortArray obj_data, jint dataOffset) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:270

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3II(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jintArray obj_data, jint dataOffset) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:274

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3FI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jfloatArray obj_data, jint dataOffset) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:278

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint plane, jfloatArray obj_equation, jint offset) {
	float* equation = (float*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:301

      glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	float* equation = (float*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:330

        glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint plane, jintArray obj_equation, jint offset) {
	int* equation = (int*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:353

        glClipPlanex((GLenum)  plane,  (GLfixed *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	int* equation = (int*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:382

            glClipPlanex((GLenum)  plane,  (GLfixed *)(equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColor4ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:404

         glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:428

         glColorPointer((GLint)  size,  
                        (GLenum)  type, 
                        (GLsizei)  stride,  
                        reinterpret_cast<GLvoid *>(offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:454

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:483

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDrawElements(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:505

       glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:528

        glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:557

       glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3ZI(JNIEnv* env, jclass clazz, jint pname, jbooleanArray obj_params, jint offset) {
	bool* params = (bool*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:581

       glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:585

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:615

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:638

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:667

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_eqn, jint offset) {
	float* eqn = (float*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:690

        glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	float* eqn = (float*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:719

          glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_eqn, jint offset) {
	int* eqn = (int*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:742

        glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	int* eqn = (int*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:771

       glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:794

         glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:824

       glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:848

       glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:878

         glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:902

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:932

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:956

         glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:986

       glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)( params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1010

          glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1040

        glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1064

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1097

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint envir, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1121

          glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1151

        glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint envir, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1175

        glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1206

       glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint envir, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1230

        glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint envir, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1261

             glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1284

         glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1314

        glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1337

      glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1367

           glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1390

        glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1420

            glGetTexParameterxv( (GLenum)target,
                    (GLenum)pname,
                    (GLfixed *)(params + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:1444

      GLboolean _returnValue = glIsBuffer( (GLuint)buffer);
      return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:1467

       GLboolean _returnValue = glIsEnabled((GLenum)cap);
       return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:1490

      GLboolean val = glIsTexture( (GLuint)texture);
      return (jboolean)val;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLNormalPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jint offset) {


//@line:1513

        glNormalPointer( (GLenum)  type, 
                         (GLsizei)  stride,  
                         reinterpret_cast<GLvoid *> (offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1537

         glPointParameterf((GLenum)  pname, (GLfloat) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1560

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1590

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1612

         glPointParameterx((GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1634

         glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1664

       glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointSizePointerOESBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:1693

       glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)(pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexCoordPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1715

         glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,   reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnvi(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1737

       glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1760

        glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1790

           glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1813

          glTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1843

        glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1865

         glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1888

            glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1918

           glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1941

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1971

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLVertexPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1993

         glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  reinterpret_cast<GLvoid *>(offset));
    

}

