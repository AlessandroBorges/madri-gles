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


//@line:101

       glDispatchCompute(
        (GLuint)num_groups_x,
        (GLuint)num_groups_y,
        (GLuint)num_groups_z
    );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDispatchComputeIndirect(JNIEnv* env, jclass clazz, jlong indirect) {


//@line:127

       glDispatchComputeIndirect((GLintptr)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDrawArraysIndirect(JNIEnv* env, jclass clazz, jint mode, jlong indirect) {


//@line:149

       glDrawArraysIndirect(mode, (const void*)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDrawElementsIndirect(JNIEnv* env, jclass clazz, jint mode, jint type, jlong indirect) {


//@line:171

       glDrawElementsIndirect(mode, type, (const void*)indirect);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLFramebufferParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:193

             glFramebufferParameteri( (GLenum)target, (GLenum)pname, (GLint)param );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetFramebufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:216

      glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset));

    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetFramebufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:249

           glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramInterfaceiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:278

       glGetProgramInterfaceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLenum)pname,
                                (GLint *)(params + offset)  );
                                                         
   
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramInterfaceiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint programInterface, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:314

         glGetProgramInterfaceiv( (GLuint)program,
                                  (GLenum)programInterface,
                                  (GLenum)pname,
                                  (GLint *)(params + offset)   );                                                 
   

}

static inline jint wrapped_Java_gles_internal_GLES31Pipeline_nGLGetProgramResourceIndex
(JNIEnv* env, jclass clazz, jint program, jint programInterface, jstring obj_name, char* name) {

//@line:342

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


//@line:366

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


//@line:428
    
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


//@line:503

        
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

//@line:536

        
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


//@line:562

           glUseProgramStages((GLuint)pipeline, 
                              (GLbitfield)stages, 
                              (GLuint)program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLActiveShaderProgram(JNIEnv* env, jclass clazz, jint pipeline, jint program) {


//@line:586

           glActiveShaderProgram( (GLuint)pipeline, (GLuint)program );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES31Pipeline_nGLCreateShaderProgramv(JNIEnv* env, jclass clazz, jint type, jint stringCount, jobjectArray stringArray, jboolean debug) {


//@line:624

    int MAX = 128;
    const char *strings[MAX];
    jstring *jstringVec = new jstring[stringCount];
    jint result = 0;
   
    // get the strings from stringArray[] 
    for (int i=0; i<stringCount; i++) {
         jstring string = (jstring)env->GetObjectArrayElement(stringArray, i);
         const char *rawString = env->GetStringUTFChars(string, 0);             
         jstringVec[i] = string;
         strings[i] = rawString;           
    }
    
    //nullify non used strings[] elements
    for(int i=stringCount; i<MAX; i++){
         strings[i] = NULL;  
    }
    
    // GL call     
    result = (jint) glCreateShaderProgramv((GLenum) type, (GLsizei) stringCount,  strings );
    
    if(debug){
        for (int i=0; i<stringCount; i++) {
              printf("[%d] - (%s) \n", i, strings[i]);
        }
    }
    
    // release resources
    for (int i=0; i<stringCount; i++) {
       jstring string = jstringVec[i];
       const char *rawString = strings[i];       
       env->ReleaseStringUTFChars(string, rawString);
    }    
    delete[] jstringVec;
    
    return result;


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:681

         glBindProgramPipeline( (GLuint) pipeline );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDeleteProgramPipelines__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_pipelines, jint offset) {
	int* pipelines = (int*)env->GetPrimitiveArrayCritical(obj_pipelines, 0);


//@line:704

       glDeleteProgramPipelines((GLsizei) n, (GLuint *) (pipelines + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_pipelines, pipelines, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLDeleteProgramPipelines__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_pipelines, jint offset) {
	int* pipelines = (int*)(obj_pipelines?env->GetDirectBufferAddress(obj_pipelines):0);


//@line:733

         glDeleteProgramPipelines((GLsizei) n, (GLuint *) (pipelines + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGenProgramPipelines__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_pipelines, jint offset) {
	int* pipelines = (int*)env->GetPrimitiveArrayCritical(obj_pipelines, 0);


//@line:755

        glGenProgramPipelines((GLsizei) n, (GLuint *)(pipelines + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_pipelines, pipelines, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGenProgramPipelines__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_pipelines, jint offset) {
	int* pipelines = (int*)(obj_pipelines?env->GetDirectBufferAddress(obj_pipelines):0);


//@line:778

      glGenProgramPipelines((GLsizei) n, (GLuint *)(pipelines + offset) );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES31Pipeline_nGLIsProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:800

        return (jboolean) glIsProgramPipeline((GLuint) pipeline );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineiv__II_3II(JNIEnv* env, jclass clazz, jint pipeline, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:824

           glGetProgramPipelineiv((GLuint) pipeline, (GLenum) pname, (GLint *)(params + offset) );
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineiv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint pipeline, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:849

       glGetProgramPipelineiv((GLuint) pipeline, (GLenum) pname, (GLint *)(params + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0) {


//@line:871

       glProgramUniform1i((GLuint) program, (GLint) location, (GLint) v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1) {


//@line:893

      glProgramUniform2i((GLuint) program, (GLint) location, (GLint) v0, (GLint) v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {


//@line:915

         glProgramUniform3i((GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4i(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {


//@line:939

      glProgramUniform4i((GLuint) program, (GLint) location, 
                         (GLint) v0, (GLint) v1, (GLint) v2, (GLint) v3 );                                             
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0) {


//@line:962

    glProgramUniform1ui((GLuint) program, (GLint) location, (GLuint) v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1) {


//@line:984

       glProgramUniform2ui((GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {


//@line:1006

       glProgramUniform3ui((GLuint) program, (GLint) location, 
                           (GLuint) v0, (GLuint) v1, (GLuint) v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4ui(JNIEnv* env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {


//@line:1029

             glProgramUniform4ui((GLuint) program, (GLint) location, 
                 (GLuint) v0, (GLuint) v1, (GLuint) v2, (GLuint) v3 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0) {


//@line:1052

            glProgramUniform1f((GLuint) program, (GLint) location, (GLfloat)  v0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {


//@line:1074

            glProgramUniform2f((GLuint) program, (GLint) location, (GLfloat)  v0, (GLfloat)  v1 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {


//@line:1096

            glProgramUniform3f((GLuint) program, (GLint) location,
             (GLfloat)  v0, (GLfloat)  v1, (GLfloat)  v2 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4f(JNIEnv* env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {


//@line:1119

            glProgramUniform4f((GLuint) program, (GLint) location, 
            (GLfloat)  v0, (GLfloat)  v1, (GLfloat)  v2, (GLfloat)  v3 ); 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1143

    glProgramUniform1iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1175

           glProgramUniform1iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1198

           glProgramUniform2iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1228

    glProgramUniform2iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1251

           glProgramUniform3iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1280

            glProgramUniform3iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4iv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1303

        glProgramUniform4iv((GLuint) program, 
                            (GLint) location, 
                            (GLsizei) count, 
                            (GLint *)(value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4iv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1335

       glProgramUniform4iv((GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1361

    glProgramUniform1uiv((GLuint) program, 
                         (GLint) location, 
                         (GLsizei) count, 
                         (GLuint *)(value + offset));                                                     
                                                     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1396

       glProgramUniform1uiv((GLuint) program, 
                         (GLint) location, 
                         (GLsizei) count, 
                         (GLuint *)(value + offset));                                              
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1425

       glProgramUniform2uiv((GLuint) program, 
                            (GLint) location, 
                            (GLsizei) count, 
                            (GLuint *) (value + offset));                                                     
     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1461

    glProgramUniform2uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1491

    glProgramUniform3uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     

	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1527

    glProgramUniform3uiv((GLuint) program, 
    (GLint) location, 
    (GLsizei) count, 
    (GLuint *) (value + offset));                                                     


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4uiv__III_3II(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1553

         glProgramUniform4uiv((GLuint) program, 
          (GLint) location,
          (GLsizei) count, 
          (GLuint *) (value + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4uiv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	int* value = (int*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1590

      glProgramUniform4uiv((GLuint) program, 
                       (GLint) location, 
                       (GLsizei) count, 
                       (GLuint *)(value +offset));                                                     
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1619

    
                glProgramUniform1fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform1fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1652

  
                glProgramUniform1fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1682

    glProgramUniform2fv((GLuint) program, 
                          (GLint) location,
                          (GLsizei) count,
                          (GLfloat *) (value + offset) );                                                       


	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform2fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1727

                glProgramUniform2fv((GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1754

              glProgramUniform3fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       

    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform3fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1797

            glProgramUniform3fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4fv__III_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1833

                   glProgramUniform4fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count, 
                                         (GLfloat *) (value + offset));                                 
                                                    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniform4fv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1875

            glProgramUniform4fv((GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset));                                        
                                                    
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:1920

          glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                                   
                                                          
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:1969

             glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                  
                                       
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2017

         glProgramUniformMatrix3fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );  
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2065

             glProgramUniformMatrix3fv((GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );                          
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2112

                   glProgramUniformMatrix4fv((GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                                            
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2159

           glProgramUniformMatrix4fv((GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                            
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2200

                    glProgramUniformMatrix2x3fv((GLuint) program, 
                                                  (GLint) location, 
                                                  (GLsizei) count,  
                                                  (GLboolean) transpose, 
                                                  (GLfloat *) (value + offset) );                                        
      
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2245

          glProgramUniformMatrix2x3fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2285

            glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );       
                                                            
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2332

           glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2375

             glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );                                         
   
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix2x4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2419

            glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );   
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x2fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2459

                  glProgramUniformMatrix4x2fv((GLuint) program, 
                                                (GLint)  location, 
                                                (GLsizei) count, 
                                                (GLboolean) transpose, 
                                                (GLfloat *) (value + offset));                                          
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x2fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2504

          glProgramUniformMatrix4x2fv( (GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x4fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2553

             glProgramUniformMatrix3x4fv((GLuint) program, 
                                           (GLint) location, 
                                           (GLsizei) count,  
                                           (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                            
                                                            
     
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix3x4fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2599

              glProgramUniformMatrix3x4fv((GLuint) program, 
                                            (GLint) location, 
                                            (GLsizei) count,  
                                            (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                                             
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x3fv__IIIZ_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:2638

       glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );                                                      
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLProgramUniformMatrix4x3fv__IIIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:2691

    glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLValidateProgramPipeline(JNIEnv* env, jclass clazz, jint pipeline) {


//@line:2717

      glValidateProgramPipeline((GLuint) pipeline );
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES31Pipeline_nGLGetProgramPipelineInfoLog(JNIEnv* env, jclass clazz, jint program) {


//@line:2742

    
       // based on code from 
      // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
        GLint  max_length = 0;
        GLsizei length = 0;
            
       //get max length of infoLog       
       glGetProgramPipelineiv( (GLuint) program,
                               (GLenum) GL_INFO_LOG_LENGTH,  
                               &max_length);
                               
       //alloc some space 
       std::vector<GLchar> infoLog(max_length + 1);
       
       glGetProgramPipelineInfoLog( (GLuint) program, 
                                    (GLsizei) max_length, 
                                    (GLsizei *) &length,  // not used
                                    (GLchar *)  &infoLog[0]);
                                    
       jstring result = env->NewStringUTF(&infoLog[0]);
       return result;
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindImageTexture(JNIEnv* env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {


//@line:2790

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


//@line:2818

      glGetBooleani_v((GLenum) target, 
                      (GLuint) index,  
                      (GLboolean *)(data + offset));
    
    
	env->ReleasePrimitiveArrayCritical(obj_data, data, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetBooleaniv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint index, jobject obj_data, jint offset) {
	int* data = (int*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:2845

    glGetBooleani_v((GLenum) target, 
                    (GLuint) index,  
                    (GLboolean *)(data + offset));



}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLMemoryBarrier(JNIEnv* env, jclass clazz, jint barriers) {


//@line:2870

          glMemoryBarrier( (GLbitfield)  barriers );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLMemoryBarrierByRegion(JNIEnv* env, jclass clazz, jint barriers) {


//@line:2892

          glMemoryBarrierByRegion( (GLbitfield)  barriers );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLTexStorage2DMultisample(JNIEnv* env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {


//@line:2931

     glTexStorage2DMultisample((GLenum) target,
                               (GLsizei) samples, 
                               (GLenum) internalformat,
                               (GLsizei) width, (GLsizei) height,  
                               (GLboolean) fixedsamplelocations );                                                          
      

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetMultisamplefv__II_3FI(JNIEnv* env, jclass clazz, jint pname, jint index, jfloatArray obj_val, jint offset) {
	float* val = (float*)env->GetPrimitiveArrayCritical(obj_val, 0);


//@line:2958

        glGetMultisamplefv((GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetMultisamplefv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jint index, jobject obj_val, jint offset) {
	float* val = (float*)(obj_val?env->GetDirectBufferAddress(obj_val):0);


//@line:2987

            glGetMultisamplefv((GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLSampleMaski(JNIEnv* env, jclass clazz, jint maskNumber, jint mask) {


//@line:3009

       glSampleMaski((GLuint) maskNumber,  (GLbitfield)  mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameteriv__III_3II(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3034

    glGetTexLevelParameteriv((GLenum) target, 
                             (GLint) level, 
                             (GLenum) pname, 
                             (GLint *) (params + offset));                                                         
     
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameteriv__IIILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3063

    glGetTexLevelParameteriv((GLenum) target, 
    (GLint) level, 
    (GLenum) pname, 
    (GLint *) (params + offset));                                                         


}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameterfv__III_3FI(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3094

        glGetTexLevelParameterfv((GLenum) target, 
                                 (GLint) level,
                                 (GLenum) pname,
                                 (GLfloat *) (params + offset));                                                  
        
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLGetTexLevelParameterfv__IIILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3123

        glGetTexLevelParameterfv((GLenum) target, 
                                 (GLint) level,
                                 (GLenum) pname,
                                 (GLfloat *) (params + offset));                                                  
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLBindVertexBuffer(JNIEnv* env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride) {


//@line:3151

       glBindVertexBuffer((GLuint) bindingindex, 
                             (GLuint) buffer,  
                             (GLintptr) offset, 
                             (GLsizei) stride );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribFormat(JNIEnv* env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {


//@line:3179

   glVertexAttribFormat ((GLuint) attribindex, 
                        (GLint) size, (GLenum) type,  (GLboolean) normalized, (GLuint) relativeoffset );                                                  
   

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribIFormat(JNIEnv* env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {


//@line:3202

           glVertexAttribIFormat((GLuint) attribindex, 
                                 (GLint) size, 
                                 (GLenum) type, 
                                 (GLuint) relativeoffset );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexAttribBinding(JNIEnv* env, jclass clazz, jint attribindex, jint bindingindex) {


//@line:3227

        glVertexAttribBinding((GLuint) attribindex, (GLuint) bindingindex );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES31Pipeline_nGLVertexBindingDivisor(JNIEnv* env, jclass clazz, jint bindingindex, jint divisor) {


//@line:3249

        glVertexBindingDivisor((GLuint) bindingindex, (GLuint) divisor );
    

}

