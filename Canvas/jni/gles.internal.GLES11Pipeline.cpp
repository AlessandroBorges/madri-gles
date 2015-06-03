#include <gles.internal.GLES11Pipeline.h>
JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLES11ClassInit(JNIEnv* env, jclass clazz) {


//@line:68

      // no op
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:91

       glBindBuffer((GLenum)  target, (GLuint ) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__IILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offset, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:143

        glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3BII(JNIEnv* env, jclass clazz, jint target, jint size, jbyteArray obj_data, jint offset, jint usage) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:155

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3SII(JNIEnv* env, jclass clazz, jint target, jint size, jshortArray obj_data, jint offset, jint usage) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:167

       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3FII(JNIEnv* env, jclass clazz, jint target, jint size, jfloatArray obj_data, jint offset, jint usage) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:179

      glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferData__II_3III(JNIEnv* env, jclass clazz, jint target, jint size, jintArray obj_data, jint offset, jint usage) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:191

     glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
   
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint dataOffset) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:244

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3BI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jbyteArray obj_data, jint dataOffset) {
	char* data = (char*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:248

      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3SI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jshortArray obj_data, jint dataOffset) {
	short* data = (short*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:252

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3II(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jintArray obj_data, jint dataOffset) {
	int* data = (int*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:256

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLBufferSubData__III_3FI(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jfloatArray obj_data, jint dataOffset) {
	float* data = (float*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:260

    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint plane, jfloatArray obj_equation, jint offset) {
	float* equation = (float*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:283

      glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	float* equation = (float*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:312

        glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint plane, jintArray obj_equation, jint offset) {
	int* equation = (int*)env->GetPrimitiveArrayCritical(obj_equation, 0);


//@line:335

        glClipPlanex((GLenum)  plane,  (GLfixed *) (equation + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_equation, equation, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint offset) {
	int* equation = (int*)(obj_equation?env->GetDirectBufferAddress(obj_equation):0);


//@line:364

            glClipPlanex((GLenum)  plane,  (GLfixed *)(equation + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColor4ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:386

         glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:408

         glColorPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:431

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:460

        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLDrawElements(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:482

       glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:505

        glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:534

       glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3ZI(JNIEnv* env, jclass clazz, jint pname, jbooleanArray obj_params, jint offset) {
	bool* params = (bool*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:558

       glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:562

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:592

      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:615

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:644

       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_eqn, jint offset) {
	float* eqn = (float*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:667

        glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanef__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	float* eqn = (float*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:696

          glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_eqn, jint offset) {
	int* eqn = (int*)env->GetPrimitiveArrayCritical(obj_eqn, 0);


//@line:719

        glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_eqn, eqn, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetClipPlanex__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_eqn, jint offset) {
	int* eqn = (int*)(obj_eqn?env->GetDirectBufferAddress(obj_eqn):0);


//@line:748

       glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:771

         glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFixedv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:801

       glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:825

       glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:855

         glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__II_3FI(JNIEnv* env, jclass clazz, jint light, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:879

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:909

        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__II_3II(JNIEnv* env, jclass clazz, jint light, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:933

         glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetLightxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:963

       glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)( params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__II_3FI(JNIEnv* env, jclass clazz, jint face, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:987

          glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1017

        glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__II_3II(JNIEnv* env, jclass clazz, jint face, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1041

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetMaterialxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1071

        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__II_3FI(JNIEnv* env, jclass clazz, jint env, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1095

          glGetTexEnvfv((GLenum)  env,  (GLenum)  pname, (GLfloat *)(params + offset)):
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint env, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1125

        glGetTexEnvfv((GLenum)  env,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint env, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1149

        glGetTexEnviv((GLenum)  env,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint env, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1180

       glGetTexEnviv((GLenum)  env,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__II_3II(JNIEnv* env, jclass clazz, jint env, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1204

        glGetTexEnvxv((GLenum)  env,  (GLenum)  pname, (GLfixed *)(params + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexEnvxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint env, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1235

             glGetTexEnvxv((GLenum)  env,  (GLenum)  pname, (GLfixed *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1258

         glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1288

        glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1311

      glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1341

           glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1364

        glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLGetTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1394

            glGetTexParameterxv( (GLenum)target,
                    (GLenum)pname,
                    (GLfixed *)(params + offset));
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:1418

      GLboolean _returnValue = glIsBuffer( (GLuint)buffer);
      return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:1441

       GLboolean _returnValue = glIsEnabled((GLenum)cap);
       return (jboolean)_returnValue;
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES11Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:1464

      GLboolean val = glIsTexture( (GLuint)texture);
      return (jboolean)val;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLNormalPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jint offset) {


//@line:1487

        glNormalPointer( (GLenum)  type, 
                         (GLsizei)  stride,  
                         reinterpret_cast<GLvoid *> offset );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1511

         glPointParameterf((GLenum)  pname, (GLfloat) param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1534

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterfv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1564

         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterx(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1586

         glPointParameterx((GLenum)  pname, (GLfixed)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1608

         glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointParameterxv__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1638

       glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLPointSizePointerOESBounds(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint offset, jint remaining) {
	unsigned char* pointer = (unsigned char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer):0);


//@line:1667

       glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)(pointer + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexCoordPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1689

         glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,   reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnvi(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1711

       glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1734

        glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexEnviv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1764

           glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1787

          glTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *) (params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1817

        glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) (params + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1839

         glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1862

            glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1892

           glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:1915

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *)(params + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLTexParameterxv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:1945

        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) (params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES11Pipeline_nGLVertexPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jint offset) {


//@line:1967

         glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  reinterpret_cast<GLvoid *>(offset));
    

}

