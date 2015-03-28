#include <gles.internal.TesteGL.h>

//@line:6

      #include <GLES2/gl2.h>
      
     JNIEXPORT void JNICALL Java_gles_internal_TesteGL_nGLVertexAttrib1fv(JNIEnv* env, jclass clazz, jint indx, jobject obj_values) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:18

    		glVertexAttrib1fv ( indx, values );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_TesteGL_nGLVertexAttrib2f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y) {


//@line:31

         glVertexAttrib2f ( (GLuint) indx, (GLfloat) x, (GLfloat) y );
    

}

