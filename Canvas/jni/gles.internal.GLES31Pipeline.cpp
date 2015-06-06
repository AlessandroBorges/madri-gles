#include <gles.internal.GLES31Pipeline.h>

//@line:18

      #include <GLES3/gl31.h>
      #include <GLES2/gl2ext.h>
      
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDispatchCompute(JNIEnv* env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z) {


//@line:99

       glDispatchCompute(
        (GLuint)num_groups_x,
        (GLuint)num_groups_y,
        (GLuint)num_groups_z
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDispatchComputeIndirect(JNIEnv* env, jclass clazz, jlong indirect) {


//@line:125

       glDispatchComputeIndirect((GLintptr)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDrawArraysIndirect(JNIEnv* env, jclass clazz, jint mode, jlong indirect) {


//@line:147

       glDrawArraysIndirect(mode, (const void*)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDrawElementsIndirect(JNIEnv* env, jclass clazz, jint mode, jint type, jlong indirect) {


//@line:169

       glDrawElementsIndirect(mode, type, (const void*)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLFramebufferParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:191

             glFramebufferParameteri( (GLenum)target, (GLenum)pname, (GLint)param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetFramebufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:214

      glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset));

    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetFramebufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:247

           glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramInterfaceiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:276

       glGetProgramInterfaceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLenum)pname,
                                (GLint *)(params + offset)  );
                                                         
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramInterfaceiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:312

         glGetProgramInterfaceiv( (GLuint)program,
                                  (GLenum)programInterface,
                                  (GLenum)pname,
                                  (GLint *)(params + offset)   );                                                 
   

}

static inline jint wrapped_Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceIndex
(JNIEnv* env, jclass clazz, jint program, jint programInterface, jstring obj_name, char* name) {

//@line:340

         return (jint) glGetProgramResourceIndex( (GLuint)program,  
                                                  (GLenum)programInterface,
                                                  (GLchar *)name);
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceIndex(JNIEnv* env, jclass clazz, jint program, jint programInterface, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceIndex(env, clazz, program, programInterface, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceName(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint index) {


//@line:364

      // based on code from 
      // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
       GLint max_length = 128;
            
       //get max length of attribute
       glGetProgramInterfaceiv(program, programInterface,  GL_MAX_NAME_LENGTH, &max_length);
        //alloc some space
        std::vector<GLchar> name(max_length + 1);
        
        glGetProgramResourceName((GLuint) program, 
                                   (GLenum) programInterface, 
                                   (GLuint) index, 
                                   (GLsizei) max_length, 
                                    &max_length, 
                                    &name[0] );
        
         jstring result = env->NewStringUTF(&name[0]);
         return result; 
       
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceiv__IIII_3III_3II_3II(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jintArray obj_props, jint propsOffset, jint bufSize, jintArray obj_length, jint lengthOffset, jintArray obj_params, jint paramsOffset) {
	int* props = (int*)env->GetPrimitiveArrayCritical(obj_props, 0);
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:426
    
        glGetProgramResourceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLuint)index,
                                (GLsizei)propCount,
                                (GLenum *)(props + propsOffset) ,
                                (GLsizei)bufSize,
                                (GLsizei *)(length + lengthOffset) ,
                                (GLint *)(params + paramsOffset) );                                                
   
	env->ReleasePrimitiveArrayCritical(obj_props, props, 0);
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceiv__IIIILjava_nio_IntBuffer_2IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jobject obj_props, jint propsOffset, jint bufSize, jobject obj_length, jint lengthOffset, jobject obj_params, jint paramsOffset) {
	int* props = (int*)(obj_props?env->GetDirectBufferAddress(obj_props):0);
	int* length = (int*)(obj_length?env->GetDirectBufferAddress(obj_length):0);
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:501

        
        glGetProgramResourceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLuint)index,
                                (GLsizei)propCount,
                                (GLenum *)(props + propsOffset) ,
                                (GLsizei)bufSize,
                                (GLsizei *)(length + lengthOffset) ,
                                (GLint *)(params + paramsOffset) );                                                
   

}

static inline jint wrapped_Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceLocation
(JNIEnv* env, jclass clazz, jint program, jint programInterface, jstring obj_name, char* name) {

//@line:534

        
        return  glGetProgramResourceLocation( (GLuint)program, 
                                              (GLenum)programInterface,
                                              (GLchar *)name );
        
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceLocation(JNIEnv* env, jclass clazz, jint program, jint programInterface, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceLocation(env, clazz, program, programInterface, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLUseProgramStages(JNIEnv* env, jclass clazz, jint pipeline, jint stages, jint program) {


//@line:560

           glUseProgramStages((GLuint)pipeline, 
                              (GLbitfield)stages, 
                              (GLuint)program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLActiveShaderProgram(JNIEnv* env, jclass clazz, jint pipeline, jint program) {


//@line:584

           glActiveShaderProgram( (GLuint)pipeline, (GLuint)program );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31Pipeline_nGLCreateShaderProgramv(JNIEnv* env, jclass clazz, jint type, jint stringCount, jobjectArray stringArray) {


//@line:609

    
                      
            std::vector<jstring> jstringVec(stringCount);
            std::vector<char *>  charVec(stringCount); 
             
            for (int i=0; i<stringCount; i++) {
                 jstring string = (jstring)env->GetObjectArrayElement(stringArray, i);
                 const char *rawString = env->GetStringUTFChars(string, 0);             
                 jstringVec[i] = string;
                 charVec[i] = rawString;           
            }
            ////////////////////////////////////////
             
             char * strings[] = &charVec[0];
             
             (GLint) result = glCreateShaderProgramv((GLenum) type, (GLsizei) stringCount,  strings );
            
            //////////////////////////////////////
            // Done
            for (int i=0; i<stringCount; i++) {
               jstring string = jstringVec[i];
               const char *rawString = charVec[i];
               
                env->ReleaseStringUTFChars(string, rawString);
            }
            ///////////////////////////////////////////
             
             return result;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:658

         glBindProgramPipeline( (GLuint) pipeline );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDeleteProgramPipelines__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_pipelines, jint offset) {
	int* pipelines = (int*)env->GetPrimitiveArrayCritical(obj_pipelines, 0);


//@line:681

       glDeleteProgramPipelines((GLsizei) n, (GLuint *) (pipelines + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pipelines, pipelines, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDeleteProgramPipelines__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_pipelines, jint offset) {
	int* pipelines = (int*)(obj_pipelines?env->GetDirectBufferAddress(obj_pipelines):0);


//@line:710

         glDeleteProgramPipelines((GLsizei) n, (GLuint *) (pipelines + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGenProgramPipelines__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_pipelines, jint offset) {
	int* pipelines = (int*)env->GetPrimitiveArrayCritical(obj_pipelines, 0);


//@line:732

        glGenProgramPipelines((GLsizei) n, (GLuint *)(pipelines + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_pipelines, pipelines, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGenProgramPipelines__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_pipelines, jint offset) {
	int* pipelines = (int*)(obj_pipelines?env->GetDirectBufferAddress(obj_pipelines):0);


//@line:755

      glGenProgramPipelines((GLsizei) n, (GLuint *)(pipelines + offset) );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES31Pipeline_nGLIsProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:777

        return (jboolean) glIsProgramPipeline((GLuint) pipeline );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineiv__II_3II(JNIEnv* env, jclass clazz, jint pipeline, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:801

           glGetProgramPipelineiv((GLuint) pipeline, (GLenum) pname, (GLint *)(params + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pipeline, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:826

       glGetProgramPipelineiv((GLuint) pipeline, (GLenum) pname, (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0) {


//@line:848

       glProgramUniform1i((GLuint) program, (GLint) location, (GLint) v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1) {


//@line:870

      glProgramUniform2i((GLuint) program, (GLint) location, (GLint) v0, (GLint) v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {


//@line:892

         glProgramUniform3i((GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {


//@line:916

      glProgramUniform4i((GLuint) program, (GLint) location, 
                         (GLint) v0, (GLint) v1, (GLint) v2, (GLint) v3 );                                             
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0) {


//@line:939

    glProgramUniform1ui((GLuint) program, (GLint) location, (GLuint) v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1) {


//@line:961

       glProgramUniform2ui((GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {


//@line:983

       glProgramUniform3ui((GLuint) program, (GLint) location, 
                           (GLuint) v0, (GLuint) v1, (GLuint) v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {


//@line:1006

             glProgramUniform4ui((GLuint) program, (GLint) location, 
                 (GLuint) v0, (GLuint) v1, (GLuint) v2, (GLuint) v3 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0) {


//@line:1029

            glProgramUniform1f((GLuint) program, (GLint) location, (GLfloat)  v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {


//@line:1051

            glProgramUniform2f((GLuint) program, (GLint) location, (GLfloat)  v0, (GLfloat)  v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {


//@line:1073

            glProgramUniform3f((GLuint) program, (GLint) location,
             (GLfloat)  v0, (GLfloat)  v1, (GLfloat)  v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {


//@line:1096

            glProgramUniform4f((GLuint) program, (GLint) location, 
            (GLfloat)  v0, (GLfloat)  v1, (GLfloat)  v2, (GLfloat)  v3 ); 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1120

    glProgramUniform1iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1152

           glProgramUniform1iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1175

           glProgramUniform2iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1205

    glProgramUniform2iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1228

           glProgramUniform3iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1257

            glProgramUniform3iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1280

        glProgramUniform4iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) )
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1309

       glProgramUniform4iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1335

    glProgramUniform1uiv((GLuint) program, 
                         (GLint) location, 
                         (GLsizei) count, 
                         (GLuint *)(value + offset));                                                     
                                                     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1370

       glProgramUniform1uiv((GLuint) program, 
                         (GLint) location, 
                         (GLsizei) count, 
                         (GLuint *)(value + offset));                                              
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1399

       glProgramUniform2uiv((GLuint) program, 
                            (GLint) location, 
                            (GLsizei) count, 
                            (GLuint *) (value + offset));                                                     
     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1435

    glProgramUniform2uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1465

    glProgramUniform3uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     

	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1501

    glProgramUniform3uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1527

         glProgramUniform4uiv((GLuint) program, 
          (GLint) location,
          (GLsizei) count, 
          (GLuint *) (value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1564

      glProgramUniform4uiv((GLuint) program, 
                       (GLint) location, 
                       (GLsizei) count, 
                       (GLuint *)(value +offset));                                                     
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1593

    
                glProgramUniform1fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1626

  
                glProgramUniform1fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1656

    glProgramUniform2fv((GLuint) program, 
                          (GLint) location,
                          (GLsizei) count,
                          (GLfloat *) (value + offset) );                                                       


	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1701

                glProgramUniform2fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1728

              glProgramUniform3fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       

    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1771

            glProgramUniform3fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1807

                   glProgramUniform4fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count, 
                                         (GLfloat *) (value + offset));                                 
                                                    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1849

            glProgramUniform4fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset));                                        
                                                    
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1894

          glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                                   
                                                          
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1943

             glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                  
                                       
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1991

         glProgramUniformMatrix3fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );  
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2039

             glProgramUniformMatrix3fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );                          
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2086

                   glProgramUniformMatrix4fv((GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                                            
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2133

           glProgramUniformMatrix4fv((GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                            
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2174

                    glProgramUniformMatrix2x3fv((GLuint) program, 
                                                  (GLint) location, 
                                                  (GLsizei) count,  
                                                  (GLboolean) transpose, 
                                                  (GLfloat *) (value + offset) );                                        
      
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2219

          glProgramUniformMatrix2x3fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2259

            glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );       
                                                            
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2306

           glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2349

             glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );                                         
   
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2393

            glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );   
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2433

                  glProgramUniformMatrix4x2fv((GLuint) program, 
                                                (GLint)  location, 
                                                (GLsizei) count, 
                                                (GLboolean) transpose, 
                                                (GLfloat *) (value + offset));                                          
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2478

          glProgramUniformMatrix4x2fv( (GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2527

             glProgramUniformMatrix3x4fv((GLuint) program, 
                                           (GLint) location, 
                                           (GLsizei) count,  
                                           (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                            
                                                            
     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2573

              glProgramUniformMatrix3x4fv((GLuint) program, 
                                            (GLint) location, 
                                            (GLsizei) count,  
                                            (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                                             
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2612

       glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );                                                      
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2665

    glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLValidateProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:2691

      glValidateProgramPipeline((GLuint) pipeline );
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineInfoLog(JNIEnv* env, jclass clazz, jint program) {


//@line:2716

    
       // based on code from 
      // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
        GLint  max_length = 0;
            
       //get max length of infoLog       
       glGetProgramPipelineiv( (GLuint) program,
                               (GLenum) GL_INFO_LOG_LENGTH,  
                               &max_length);
                               
       //alloc some space 
       std::vector<GLchar> infoLog(max_length + 1);
       
       glGetProgramPipelineInfoLog( (GLuint) program, 
                                    (GLsizei) max_length, 
                                    (GLsizei) &max_length,  // not used
                                    (GLchar *)  &infoLog[0]);
                                    
       jstring result = env->NewStringUTF(&name[0]);
       return result;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindImageTexture(JNIEnv* env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {


//@line:2763

    glBindImageTexture((GLuint) unit, 
                       (GLuint) texture, 
                       (GLint) level,  
                       (GLboolean) layered, 
                       (GLint) layer, 
                       (GLenum) access, 
                       (GLenum) format );                                                   
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetBooleaniv__II_3ZI(JNIEnv* env, jclass clazz, jint target, jint index, jbooleanArray obj_data, jint offset) {
	bool* data = (bool*)env->GetPrimitiveArrayCritical(obj_data, 0);


//@line:2791

      glGetBooleani_v((GLenum) target, 
                      (GLuint) index,  
                      (GLboolean *)(data + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetBooleaniv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint index, jobject obj_data, jint offset) {
	int* data = (int*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:2818

    glGetBooleani_v((GLenum) target, 
                    (GLuint) index,  
                    (GLboolean *)(data + offset));



}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLMemoryBarrier(JNIEnv* env, jclass clazz, jint barriers) {


//@line:2843

          glMemoryBarrier( (GLbitfield)  barriers );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLMemoryBarrierByRegion(JNIEnv* env, jclass clazz, jint barriers) {


//@line:2865

          glMemoryBarrierByRegion( (GLbitfield)  barriers );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLTexStorage2DMultisample(JNIEnv* env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {


//@line:2904

     glTexStorage2DMultisample((GLenum) target,
                               (GLsizei) samples, 
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,  
                               (GLboolean) fixedsamplelocations );                                                          
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetMultisamplefv__II_3FI(JNIEnv* env, jclass clazz, jint pname, jint index, jfloatArray obj_val, jint offset) {
	float* val = (float*)env->GetPrimitiveArrayCritical(obj_val, 0);


//@line:2931

        glGetMultisamplefv((GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetMultisamplefv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jint index, jobject obj_val, jint offset) {
	float* val = (float*)(obj_val?env->GetDirectBufferAddress(obj_val):0);


//@line:2960

            glGetMultisamplefv((GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLSampleMaski(JNIEnv* env, jclass clazz, jint maskNumber, jint mask) {


//@line:2982

       glSampleMaski((GLuint) maskNumber,  (GLbitfield)  mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameteriv__III_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3007

    glGetTexLevelParameteriv((GLenum) target, 
                             (GLint) level, 
                             (GLenum) pname, 
                             (GLint *) (params + offset));                                                         
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameteriv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3036

    glGetTexLevelParameteriv((GLenum) target, 
    (GLint) level, 
    (GLenum) pname, 
    (GLint *) (params + offset));                                                         


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameterfv__III_3FI(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3064

        glGetTexLevelParameterfv((GLenum) target, 
                                 (GLint) level,
                                 (GLenum) pname,
                                 (GLint *) (params + offset));                                                  
        
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameterfv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3093

        glGetTexLevelParameterfv((GLenum) target, 
                                 (GLint) level,
                                 (GLenum) pname,
                                 (GLint *) (params + offset));                                                  
                                                         

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindVertexBuffer(JNIEnv* env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride) {


//@line:3121

       glBindVertexBuffer((GLuint) bindingindex, 
                             (GLuint) buffer,  
                             (GLintptr) offset, 
                             (GLsizei) stride );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribFormat(JNIEnv* env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {


//@line:3149

   glVertexAttribFormat ((GLuint) attribindex, 
                        (GLint) size, (GLenum) type,  (GLboolean) normalized, (GLuint) relativeoffset );                                                  
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribIFormat(JNIEnv* env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {


//@line:3172

           glVertexAttribIFormat((GLuint) attribindex, (GLint) size, (GLenum) type, (GLuint) relativeoffset )
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribBinding(JNIEnv* env, jclass clazz, jint attribindex, jint bindingindex) {


//@line:3194

        glVertexAttribBinding((GLuint) attribindex, (GLuint) bindingindex );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexBindingDivisor(JNIEnv* env, jclass clazz, jint bindingindex, jint divisor) {


//@line:3216

        glVertexBindingDivisor((GLuint) bindingindex, (GLuint) divisor );
    

}

