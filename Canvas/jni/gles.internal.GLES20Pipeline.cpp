#include <gles.internal.GLES20Pipeline.h>

//@line:34

	  #include <GLES2/gl2.h>
	  #include <stdio.h>
          #include <stdlib.h>
          #include <vector>
          
          using namespace std;
	  
	  ////////////////////////////////////////
	 JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLES20ClassInit(JNIEnv* env, jclass clazz) {


//@line:92
  
         // hold
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLActiveTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:114

    		glActiveTexture ( (GLenum) texture );
     

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLAttachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:136

       glAttachShader ( (GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindAttribLocation(JNIEnv* env, jclass clazz, jint program, jint index, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);


//@line:158
            
    		glBindAttribLocation ( (GLuint) program, (GLuint) index, name);
    
	env->ReleaseStringUTFChars(obj_name, name);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindBuffer(JNIEnv* env, jclass clazz, jint target, jint buffer) {


//@line:180

    		glBindBuffer ( (GLenum) target, (GLuint) buffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindFramebuffer(JNIEnv* env, jclass clazz, jint target, jint framebuffer) {


//@line:202

    			glBindFramebuffer ( (GLenum) target, (GLuint) framebuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint renderbuffer) {


//@line:224

          glBindRenderbuffer ( (GLenum) target, (GLuint) renderbuffer ); 
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:246

     		glBindTexture ( (GLenum) target, (GLuint) texture );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:268

     		glBlendColor ( (GLclampf) red, 
     					   (GLclampf) green, 
     					   (GLclampf) blue, 
     					   (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquation(JNIEnv* env, jclass clazz, jint mode) {


//@line:293

    		glBlendEquation ( (GLenum) mode );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendEquationSeparate(JNIEnv* env, jclass clazz, jint modeRGB, jint modeAlpha) {


//@line:315

    		glBlendEquationSeparate ( (GLenum) modeRGB, (GLenum) modeAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:337

       glBlendFunc ( (GLenum) sfactor, (GLenum) dfactor );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBlendFuncSeparate(JNIEnv* env, jclass clazz, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {


//@line:359

    			glBlendFuncSeparate ( (GLenum) srcRGB, (GLenum) dstRGB, (GLenum) srcAlpha, (GLenum) dstAlpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferData(JNIEnv* env, jclass clazz, jint target, jint size, jobject obj_data, jint offsetBytes, jint usage) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:393

                   // native code	
            char * data0 = (char *) (data + offsetBytes);	    		
    		glBufferData ( (GLenum) target, (GLsizeiptr) size, (const GLvoid *)data0, (GLenum) usage );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLBufferSubData(JNIEnv* env, jclass clazz, jint target, jint offset, jint size, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:429

    		
    		char * data0 = (char *) (data + offsetBytes); 
    		
    		
    		glBufferSubData ( (GLenum) target, 
    						  (GLintptr) offset, 
    						  (GLsizeiptr) size, 
    						  (const GLvoid *)data0 );
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCheckFramebufferStatus(JNIEnv* env, jclass clazz, jint target) {


//@line:458

          return (jint)glCheckFramebufferStatus ( (GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:480

        glClear ( (GLbitfield) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:502

     		glClearColor ( (GLclampf) red, (GLclampf) green, (GLclampf) blue, (GLclampf) alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearDepthf(JNIEnv* env, jclass clazz, jfloat depth) {


//@line:524

    			glClearDepthf ( (GLclampf) depth );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:546

    		glClearStencil ( (GLint) s );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:568

              glColorMask ( (GLboolean)  red, (GLboolean)  green, (GLboolean)  blue, (GLboolean)  alpha );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompileShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:590

    		glCompileShader ( (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:649

    	// native code	
    	   char * data0 = (char *) (data + offsetBytes);
    	   
    	   // raw java.nio.Buffer is translated as (char *)
           glCompressedTexImage2D((GLenum) target, 
           			  (GLint) level,
           			             							  (GLenum) internalformat,
           							  (GLsizei) width,
           							  (GLsizei) height,
           							  (GLint) border,
           							  (GLsizei) imageSize,
           							  (const GLvoid *) data0);
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCompressedTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jobject obj_data, jint offsetBytes) {
	unsigned char* data = (unsigned char*)(obj_data?env->GetDirectBufferAddress(obj_data):0);


//@line:712

    		//native code
    		char * data0 = (char *) (data + offsetBytes);
    		glCompressedTexSubImage2D ( 
    					(GLenum) target,
    					(GLint) level, 
    					(GLint) xoffset, 
    					(GLint) yoffset, 
    					(GLsizei) width, 
    					(GLsizei) height, 
    					(GLenum) format, 
    					(GLsizei) imageSize, 
    					(const GLvoid *) data0 );
    		
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCopyTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {


//@line:754

    		//native code
    			glCopyTexImage2D ( 
    					(GLenum) target, 
    					(GLint) level,
    					(GLenum) internalformat,
    					(GLint) x, 
    					(GLint) y, 
    					(GLsizei) width, 
    					(GLsizei) height, 
    					(GLint) border );
    		
    		

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:794

    		
    			glCopyTexSubImage2D (
    			(GLenum) target, 
    			(GLint) level, 
    			(GLint) xoffset, (GLint) yoffset, 
    			(GLint) x,       (GLint) y, 
    			(GLsizei) width, (GLsizei) height );
    
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateProgram(JNIEnv* env, jclass clazz) {


//@line:823

    		return (jint)glCreateProgram();
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLCreateShader(JNIEnv* env, jclass clazz, jint type) {


//@line:845

    	return (jint) glCreateShader ( (GLenum) type );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:867

    		glCullFace ( (GLenum) mode );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:891

    		// native
    		glDeleteBuffers ( (GLsizei) n, (const GLuint *) &buffers[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:927

    				glDeleteBuffers ( (GLsizei) n, (const GLuint *) (buffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:949

    
           
    		glDeleteFramebuffers ( (GLsizei) n, (const GLuint *) &framebuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:985

    		glDeleteFramebuffers ( (GLsizei) n, (const GLuint *) (framebuffers + offset));
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:1007

       		glDeleteProgram ( (GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1029

    
    	       glDeleteRenderbuffers ( (GLsizei) n, (const GLuint *) &renderbuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteRenderbuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1065

    			
    			glDeleteRenderbuffers ( (GLsizei) n,(const GLuint *) (renderbuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:1088

         glDeleteShader ( (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1110

    
     
      glDeleteTextures ( (GLsizei) n,
      					(const GLuint *) &textures[offset] );
      					
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDeleteTextures__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint offset) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1147

    
         
         glDeleteTextures ( (GLsizei) n, (const GLuint *)(textures + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:1171

    		glDepthFunc ( (GLenum) func );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:1193

    			glDepthMask ( (GLboolean)  flag );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDepthRangef(JNIEnv* env, jclass clazz, jfloat zNear, jfloat zFar) {


//@line:1215

     		glDepthRangef ( (GLclampf) zNear, (GLclampf) zFar );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDetachShader(JNIEnv* env, jclass clazz, jint program, jint shader) {


//@line:1237

    			glDetachShader ( (GLuint) program, (GLuint) shader );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1259

    			glDisable ( (GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDisableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1281

    				glDisableVertexAttribArray ( (GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:1303

      		glDrawArrays ( (GLenum) mode, (GLint) first, (GLsizei) count );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIII(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jint offset) {


//@line:1325

    			glDrawElements ( (GLenum) mode, 
    					 (GLsizei) count, 
    					 (GLenum) type, 
    					  reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLDrawElements__IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint offset) {
	unsigned char* indices = (unsigned char*)(obj_indices?env->GetDirectBufferAddress(obj_indices):0);


//@line:1361


                        char * indices0 = (char *) (indices + offset);  
    					glDrawElements ( (GLenum) mode, (GLsizei) count, (GLenum) type, (const GLvoid *) indices0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:1385

    			glEnable ( (GLenum) cap );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLEnableVertexAttribArray(JNIEnv* env, jclass clazz, jint index) {


//@line:1407

    				glEnableVertexAttribArray ( (GLuint) index );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFinish(JNIEnv* env, jclass clazz) {


//@line:1429

    				glFinish ( );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFlush(JNIEnv* env, jclass clazz) {


//@line:1451

       // simple call
    	glFlush ();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferRenderbuffer(JNIEnv* env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {


//@line:1474

    	glFramebufferRenderbuffer ( (GLenum) target, (GLenum) attachment, (GLenum) renderbuffertarget, (GLuint) renderbuffer );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFramebufferTexture2D(JNIEnv* env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {


//@line:1496

    		glFramebufferTexture2D ( (GLenum) target, (GLenum) attachment, (GLenum) textarget, (GLuint) texture, (GLint) level );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:1518

    					glFrontFace ( (GLenum) mode );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_buffers, jint offset) {
	int* buffers = (int*)env->GetPrimitiveArrayCritical(obj_buffers, 0);


//@line:1540
    					
    						
    						glGenBuffers ( (GLsizei) n, (GLuint *) &buffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_buffers, buffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenBuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_buffers, jint offset) {
	int* buffers = (int*)(obj_buffers?env->GetDirectBufferAddress(obj_buffers):0);


//@line:1574

     			glGenBuffers ( (GLsizei) n, (GLuint *)(buffers+offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenerateMipmap(JNIEnv* env, jclass clazz, jint target) {


//@line:1596

            glGenerateMipmap ( (GLenum) target );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_framebuffers, jint offset) {
	int* framebuffers = (int*)env->GetPrimitiveArrayCritical(obj_framebuffers, 0);


//@line:1618
       			
       				
    				glGenFramebuffers ( (GLsizei) n, (GLuint *) &framebuffers[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_framebuffers, framebuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenFramebuffers__ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint n, jobject obj_framebuffers, jint offset) {
	int* framebuffers = (int*)(obj_framebuffers?env->GetDirectBufferAddress(obj_framebuffers):0);


//@line:1654

    
          glGenFramebuffers ( (GLsizei) n, (GLuint*)(framebuffers + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_renderbuffers, jint offset) {
	int* renderbuffers = (int*)env->GetPrimitiveArrayCritical(obj_renderbuffers, 0);


//@line:1677

    						glGenRenderbuffers ( (GLsizei) n, (GLuint*) renderbuffers );
    
	env->ReleasePrimitiveArrayCritical(obj_renderbuffers, renderbuffers, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenRenderbuffers__ILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint n, jobject obj_renderbuffers) {
	int* renderbuffers = (int*)(obj_renderbuffers?env->GetDirectBufferAddress(obj_renderbuffers):0);


//@line:1699

    				glGenRenderbuffers ( (GLsizei) n, (GLuint*) renderbuffers );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__I_3II(JNIEnv* env, jclass clazz, jint n, jintArray obj_textures, jint offset) {
	int* textures = (int*)env->GetPrimitiveArrayCritical(obj_textures, 0);


//@line:1721

    
    				glGenTextures ( (GLsizei) n, (GLuint *) &textures[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_textures, textures, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGenTextures__ILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint n, jobject obj_textures) {
	int* textures = (int*)(obj_textures?env->GetDirectBufferAddress(obj_textures):0);


//@line:1744

    					glGenTextures ( (GLsizei) n, (GLuint *)textures );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:1780

    		
    		//GLsizei *length0 = (GLsizei *) (length + lengthOffset);
    		//GLint *size0 = (GLint *)(size + sizeOffset);
    		//GLenum *type0 = (GLenum *)(type + typeOffset);
    		//char *name0 = (char*) (name + nameOffset);
    		
    		glGetActiveAttrib ( 
    					(GLuint) program, 
    					(GLuint) index, 
    					(GLsizei) bufsize, 
    					(GLsizei *) &length[lengthOffset], 
    					(GLint *) &size[sizeOffset], 
    					(GLenum *) &type[typeOffset], 
    					(char*) &name[nameOffset]);
    		
    		
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);
	env->ReleasePrimitiveArrayCritical(obj_name, name, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IIILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2Ljava_nio_IntBuffer_2B(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jobject obj_length, jobject obj_size, jobject obj_type, jbyte name) {
	int* length = (int*)(obj_length?env->GetDirectBufferAddress(obj_length):0);
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);


//@line:1836

    		
    		glGetActiveAttrib ( 
    						(GLuint) program, 
    						(GLuint) index, 
    						(GLsizei) bufsize, 
    						(GLsizei *) length, 
    						(GLint *) size, 
    						(GLenum *) type, 
    						(char *) &name );
    	

}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II
(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, int* size, int* type) {

//@line:1874

        							    							    							
    				GLint  max_length = 0;    													   							
       							
    				//get max length of attribute
                                glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);
    
                                //alloc some space
                                std::vector<GLchar> name(max_length + 1);
    							
    				// gles call
    				glGetActiveAttrib ( 
    						(GLuint) program, 
    						(GLuint) index, 
    						 max_length + 1, 
    						 &max_length, // not used after call
    						 (GLint *)(size + sizeOffset), 
    						 (GLenum *)(type + typeOffset), 
    						  &name[0]);
    									 
    				jstring result = env->NewStringUTF(&name[0]);
				return result;
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__II_3II_3II(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);

	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);

	return JNI_returnValue;
}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I
(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset, int* size, int* type) {

//@line:1936

    
                                // used code snipet from
                                // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
    				GLint  max_length = 0;   													   							
    							
    							
    				//get max length of attribute
                                glGetProgramiv((GLuint) program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, &max_length);

                                //alloc some space
                                std::vector<GLchar> name(max_length + 1);
                                
                                // gles call
    				glGetActiveAttrib ( 
    						(GLuint) program, 
    						(GLuint) index, 
    						 max_length + 1, 
    						 &max_length, // not used after call
    						 (GLint *)  (size + sizeOffset), 
    						 (GLenum *) (type + typeOffset), 
    						 &name[0]);
    							 
    				jstring result = env->NewStringUTF(&name[0]);
    				return result;	
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jint sizeOffset, jobject obj_type, jint typeOffset) {
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveAttrib__IILjava_nio_IntBuffer_2ILjava_nio_IntBuffer_2I(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__III_3II_3II_3II_3BI(JNIEnv* env, jclass clazz, jint program, jint index, jint bufsize, jintArray obj_length, jint lengthOffset, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, jbyteArray obj_name, jint nameOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);
	char* name = (char*)env->GetPrimitiveArrayCritical(obj_name, 0);


//@line:2003

    								
    								
    								//gles call
    								glGetActiveUniform ( 
       									(GLuint) program, 
       									(GLuint) index, 
       									(GLsizei) bufsize, 
       									(GLsizei *) &length[lengthOffset], 
       									(GLint *)  &size[sizeOffset], 
       									(GLenum *) &type[typeOffset], 
       									(char *) &name[nameOffset] );
    								
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);
	env->ReleasePrimitiveArrayCritical(obj_name, name, 0);

}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II
(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset, int* size, int* type) {

//@line:2108

    
    					 // used code snipet from
                         // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
    			 GLint  max_length = 0;
    							
    			//get max length of attribute
                        glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
                        //alloc some space
                        std::vector<GLchar> name(max_length + 1);   					
    
    			glGetActiveUniform (    (GLuint) program, 
    						(GLuint) index, 
    						max_length + 1, 
    						&max_length, // not used after call
    						(GLint *)  &size[sizeOffset], 
    						(GLenum *) &type[typeOffset], 
    						&name[0] );
    								
    				  // return the requested String				 
    			jstring result = env->NewStringUTF(&name[0]);    				   	
    			return result; 
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint index, jintArray obj_size, jint sizeOffset, jintArray obj_type, jint typeOffset) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);
	int* type = (int*)env->GetPrimitiveArrayCritical(obj_type, 0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__II_3II_3II(env, clazz, program, index, obj_size, sizeOffset, obj_type, typeOffset, size, type);

	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);
	env->ReleasePrimitiveArrayCritical(obj_type, type, 0);

	return JNI_returnValue;
}

static inline jstring wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2
(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jobject obj_type, int* size, int* type) {

//@line:2150

    
    			 // used code snipet from
                         // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
    			 GLint  max_length = 0;    			
    							
    			//get max length of attribute
                        glGetProgramiv((GLuint) program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &max_length);
                        
                        //alloc some space
                        std::vector<GLchar> name(max_length + 1);

			glGetActiveUniform ((GLuint) program,
					    (GLuint) index, 
    					    (max_length + 1), 
    					    &max_length, // not used after call
    				            (GLint *)  size, 
    					    (GLenum *) type, 
    					    &name[0] );
    								
    		      // return the requested String				 
    		     jstring result = env->NewStringUTF(&name[0]);    				 	
    		     return result; 	    
    
}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint program, jint index, jobject obj_size, jobject obj_type) {
	int* size = (int*)(obj_size?env->GetDirectBufferAddress(obj_size):0);
	int* type = (int*)(obj_type?env->GetDirectBufferAddress(obj_type):0);

	jstring JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetActiveUniform__IILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2(env, clazz, program, index, obj_size, obj_type, size, type);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttachedShaders__II_3II_3II(JNIEnv* env, jclass clazz, jint program, jint maxcount, jintArray obj_count, jint countOffset, jintArray obj_shaders, jint shadersOffset) {
	int* count = (int*)env->GetPrimitiveArrayCritical(obj_count, 0);
	int* shaders = (int*)env->GetPrimitiveArrayCritical(obj_shaders, 0);


//@line:2200

    					    					    					
    					glGetAttachedShaders((GLuint) program, 
    										 (GLsizei) maxcount, 
    										 (GLsizei *) &count[countOffset], 
    										 (GLuint *) &shaders[shadersOffset]);
    
    
	env->ReleasePrimitiveArrayCritical(obj_count, count, 0);
	env->ReleasePrimitiveArrayCritical(obj_shaders, shaders, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttachedShaders__IILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint program, jint maxcount, jobject obj_count, jobject obj_shaders) {
	int* count = (int*)(obj_count?env->GetDirectBufferAddress(obj_count):0);
	int* shaders = (int*)(obj_shaders?env->GetDirectBufferAddress(obj_shaders):0);


//@line:2227

    					
    					glGetAttachedShaders((GLuint ) program, 
    										 (GLsizei) maxcount, 
    										 (GLsizei *) count, 
    										 (GLuint *) shaders);
    
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:2254

    
                // name is converted to (const char *)
    		return (jint)	glGetAttribLocation ( (GLuint) program, name );
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation(JNIEnv* env, jclass clazz, jint program, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetAttribLocation(env, clazz, program, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__I_3ZI(JNIEnv* env, jclass clazz, jint pname, jbooleanArray obj_params, jint offset) {
	bool* params = (bool*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2278
                        
                            
    					glGetBooleanv((GLenum) pname, 
    					              (GLboolean*) &params[offset] );
    					              
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBooleanv__ILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2303

    
     			glGetBooleanv ( (GLenum) pname, (GLboolean *) params );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2326

    
    					
    
    					glGetBufferParameteriv( (GLenum) target, 
    											(GLenum) pname,
    											(GLint *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetBufferParameteriv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2354

    				
    				glGetBufferParameteriv ( (GLenum) target, 
    										 (GLenum) pname, 
    										  (GLint *)  params );
    
    

}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetError(JNIEnv* env, jclass clazz) {


//@line:2380

               return (jint) glGetError();    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__I_3FI(JNIEnv* env, jclass clazz, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2402

    
    				glGetFloatv ( (GLenum) pname, 
    				               (GLfloat *)  &params[offset]);
       
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFloatv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2439

    
    			glGetFloatv ( (GLenum) pname, (GLfloat *) (params + offset));
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__III_3II(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2470

     					
     					glGetFramebufferAttachmentParameteriv ( (GLenum) target, 
     															(GLenum) attachment, 
     															(GLenum) pname, 
     															(GLint *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetFramebufferAttachmentParameteriv__IIILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint target, jint attachment, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2497

    
    					glGetFramebufferAttachmentParameteriv ( (GLenum) target, 
    															(GLenum) attachment, 
    															(GLenum) pname, 
    															 (GLint *)  params );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__I_3II(JNIEnv* env, jclass clazz, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2524

    
    				glGetIntegerv ( (GLenum) pname, 
    								(GLint *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetIntegerv__ILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2549

    
    				glGetIntegerv ( (GLenum) pname, (GLint *) params );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2573

    
          glGetProgramiv( (GLuint) program, 
          				  (GLenum) pname, 
          				  (GLint *) &params[offset] );
          
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramiv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint program, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2600

    
    					glGetProgramiv( (GLuint) program, (GLenum) pname, (GLint *) params);
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetProgramInfoLog(JNIEnv* env, jclass clazz, jint program) {


//@line:2630

    
            // Code based on example from https://www.opengl.org/wiki/Example_Code
            
            // get the log length     		
    		GLint maxLength = 0;
	        glGetProgramiv((GLuint)program, GL_INFO_LOG_LENGTH, &maxLength);
	        	        
	       // allocate using  vector
    		std::vector<GLchar> infoLog(maxLength + 1);
	        
	        // get the log with right buffer size
    		glGetProgramInfoLog( (GLuint) program, 
    		                     (GLsizei) (maxLength + 1), 
    		                     (GLsizei *) &maxLength, 
    		                     (GLchar *) &infoLog[0]);
 										
 		// return the requested String				 
    		jstring result = env->NewStringUTF(&infoLog[0]);
    		
    		// get result back
    		return result;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetRenderbufferParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2672

        
    							glGetRenderbufferParameteriv ( (GLenum) target, 
    															(GLenum) pname, 
    															(GLint *) &params[offset]);
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetRenderbufferParameteriv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2710
       
       	glGetRenderbufferParameteriv ( (GLenum) target, 
       														(GLenum) pname, 
       														(GLint *) (params + offset));
       
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__II_3II(JNIEnv* env, jclass clazz, jint shader, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:2736

                      glGetShaderiv ( (GLuint) shader, 
                      (GLenum) pname, 
                      (GLint *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderiv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint shader, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:2761

    
        glGetShaderiv ( (GLuint) shader, 
        				(GLenum) pname, 
        				(GLint *)params );
    
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderInfoLog(JNIEnv* env, jclass clazz, jint shader) {


//@line:2796

    
            // get string length
            GLint maxLength = 0;    
    		glGetShaderiv(	(GLuint) shader, (GLenum) GL_INFO_LOG_LENGTH, &maxLength);
    		
    		// allocate 
    		std::vector<GLchar> infoLog(maxLength + 1);
    
            glGetShaderInfoLog(	(GLuint) shader,
            	 maxLength + 1,
             	 &maxLength,
              	 &infoLog[0]);
              
           jstring result = env->NewStringUTF(&infoLog[0]);
                                 
           return result;
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderPrecisionFormat__II_3II_3II(JNIEnv* env, jclass clazz, jint shadertype, jint precisiontype, jintArray obj_range, jint rangeOffset, jintArray obj_precision, jint precisionOffset) {
	int* range = (int*)env->GetPrimitiveArrayCritical(obj_range, 0);
	int* precision = (int*)env->GetPrimitiveArrayCritical(obj_precision, 0);


//@line:2839

    													   
    													   
    							glGetShaderPrecisionFormat ( (GLenum) shadertype, 
    							                             (GLenum) precisiontype, 
    							                             (GLint *) &range[rangeOffset], 
    							                             (GLint *) &precision[precisionOffset]);   
    
    
	env->ReleasePrimitiveArrayCritical(obj_range, range, 0);
	env->ReleasePrimitiveArrayCritical(obj_precision, precision, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderPrecisionFormat__IILjava_nio_IntBuffer_2Ljava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint shadertype, jint precisiontype, jobject obj_range, jobject obj_precision) {
	int* range = (int*)(obj_range?env->GetDirectBufferAddress(obj_range):0);
	int* precision = (int*)(obj_precision?env->GetDirectBufferAddress(obj_precision):0);


//@line:2867

      
          glGetShaderPrecisionFormat (  (GLenum) shadertype, 
          								(GLenum) precisiontype, 	
          								(GLint *) range, 
          								(GLint *) precision );
      
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__II_3II_3BI(JNIEnv* env, jclass clazz, jint shader, jint bufsize, jintArray obj_length, jint lengthOffset, jbyteArray obj_source, jint sourceOffset) {
	int* length = (int*)env->GetPrimitiveArrayCritical(obj_length, 0);
	char* source = (char*)env->GetPrimitiveArrayCritical(obj_source, 0);


//@line:2896

    				
    				// get the source
    				glGetShaderSource ( (GLuint) shader, 
    				(GLsizei) bufsize, 
    				&length[lengthOffset], 
    				&source[sourceOffset]);
    				
    
	env->ReleasePrimitiveArrayCritical(obj_length, length, 0);
	env->ReleasePrimitiveArrayCritical(obj_source, source, 0);

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetShaderSource__I(JNIEnv* env, jclass clazz, jint shader) {


//@line:2952

    
    				GLint maxLength = 0;
				glGetShaderiv(shader, GL_SHADER_SOURCE_LENGTH, &maxLength);
				
          			// The maxLength includes the NULL character
				std::vector<GLchar> source(maxLength + 1);
    
    				glGetShaderSource ( (GLuint) shader, maxLength + 1, &maxLength, &source[0]);
    				
    				jstring result = env->NewStringUTF(&source[0]);                                 
                    return result;	
    				
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_GLES20Pipeline_nGLGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:2985

    
                const GLubyte* value;
    
    			value = glGetString( (GLenum) name);
    			
    			const char * valueCast = reinterpret_cast<const char*>(value);
    			
    			jstring result = env->NewStringUTF( valueCast );
    			
    			return result;    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3016

    
    				glGetTexParameterfv ( (GLenum) target, (GLenum) pname,  (GLfloat *)  &params[offset]);
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameterfv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint offset) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3052

    
    			glGetTexParameterfv ( (GLenum) target, (GLenum) pname,  (GLfloat *)  (params + offset) );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3076

    
    				glGetTexParameteriv ( (GLenum) target, (GLenum) pname,  (GLint *)  &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetTexParameteriv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3100

    
    					 glGetTexParameteriv ( (GLenum) target, (GLenum) pname,  (GLint *)  params );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__II_3FI(JNIEnv* env, jclass clazz, jint program, jint location, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3123

    
    					glGetUniformfv ( (GLuint) program, (GLint) location, (GLfloat *) &params[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformfv__IILjava_nio_FloatBuffer_2(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3147

    
    					glGetUniformfv ( (GLuint) program, (GLint) location, (GLfloat *) params );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__II_3II(JNIEnv* env, jclass clazz, jint program, jint location, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3171

    
    				glGetUniformiv ( (GLuint) program, (GLint) location, (GLint *) &params[offset]  );
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformiv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint program, jint location, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3195

    
        				glGetUniformiv ( (GLuint) program, (GLint) location, (GLint *) params );
    

}

static inline jint wrapped_Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation
(JNIEnv* env, jclass clazz, jint program, jstring obj_name, char* name) {

//@line:3218

    
    				return (jint) glGetUniformLocation ( (GLuint) program, name );
    				
    
}

JNIEXPORT jint JNICALL Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation(JNIEnv* env, jclass clazz, jint program, jstring obj_name) {
	char* name = (char*)env->GetStringUTFChars(obj_name, 0);

	jint JNI_returnValue = wrapped_Java_gles_internal_GLES20Pipeline_nGLGetUniformLocation(env, clazz, program, obj_name, name);

	env->ReleaseStringUTFChars(obj_name, name);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribfv__II_3FI(JNIEnv* env, jclass clazz, jint index, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3242

    				
    				glGetVertexAttribfv ( (GLuint) index, (GLenum) pname,  (GLfloat *)  &params[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribfv__IILjava_nio_FloatBuffer_2(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3265

    
    						 glGetVertexAttribfv ( (GLuint) index, (GLenum) pname,  (GLfloat *)  params );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__II_3II(JNIEnv* env, jclass clazz, jint index, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:3289

    
    			glGetVertexAttribiv ( (GLuint) index, (GLenum) pname,  (GLint *)  &params[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLGetVertexAttribiv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint index, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:3312

    
    					glGetVertexAttribiv ( (GLuint) index, (GLenum) pname,  (GLint *)  params );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:3335

    				glHint ( (GLenum) target, (GLenum) mode );
    				
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsBuffer(JNIEnv* env, jclass clazz, jint buffer) {


//@line:3358

    
                return (jboolean)  glIsBuffer( (GLuint) buffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:3381

              return (jboolean)  glIsEnabled ( (GLenum) cap );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsFramebuffer(JNIEnv* env, jclass clazz, jint framebuffer) {


//@line:3403

          return (jboolean)  glIsFramebuffer ( (GLuint) framebuffer );
    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3426

                     return (jboolean)  glIsProgram ( (GLuint) program );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsRenderbuffer(JNIEnv* env, jclass clazz, jint renderbuffer) {


//@line:3448

    		return 	(jboolean)  glIsRenderbuffer ( (GLuint) renderbuffer );
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsShader(JNIEnv* env, jclass clazz, jint shader) {


//@line:3470

    
    		return (jboolean)  glIsShader ( (GLuint) shader );
    
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_GLES20Pipeline_nGLIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:3494

    
    		return  (jboolean)  glIsTexture ( (GLuint) texture );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:3518

    				glLineWidth( (GLfloat) width );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLLinkProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:3540

    
    		glLinkProgram ((GLuint) program );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:3564

    
    			glPixelStorei ((GLenum) pname, (GLint) param );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:3588

    
    			glPolygonOffset ( (GLfloat) factor, (GLfloat) units );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLReadPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:3611

    
    			glReadPixels (  (GLint) x, 
    							(GLint) y, 
    							(GLsizei) width, 
    							(GLsizei) height, 
    							(GLenum) format, 
    							(GLenum) type, 
    							(GLvoid *) pixels );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLReleaseShaderCompiler(JNIEnv* env, jclass clazz) {


//@line:3641

    
    				glReleaseShaderCompiler();
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLRenderbufferStorage(JNIEnv* env, jclass clazz, jint target, jint internalformat, jint width, jint height) {


//@line:3664

    
    				 glRenderbufferStorage ( (GLenum) target, (GLenum) internalformat, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLSampleCoverage(JNIEnv* env, jclass clazz, jfloat value, jboolean invert) {


//@line:3687

    
    			glSampleCoverage ( (GLclampf) value, (GLboolean)  invert );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:3711

    
    			glScissor ( (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderBinary__I_3IIILjava_nio_Buffer_2I(JNIEnv* env, jclass clazz, jint n, jintArray obj_shaders, jint offset, jint binaryformat, jobject obj_binary, jint length) {
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);
	int* shaders = (int*)env->GetPrimitiveArrayCritical(obj_shaders, 0);


//@line:3742

    											
    									glShaderBinary ( (GLsizei) n, 
    													(const GLuint *) &shaders[offset], 
    													(GLenum) binaryformat, 
    													(const GLvoid *) binary, 
    													(GLsizei) length );		
    											
    		
    		
    
    
	env->ReleasePrimitiveArrayCritical(obj_shaders, shaders, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderBinary__ILjava_nio_IntBuffer_2ILjava_nio_Buffer_2II(JNIEnv* env, jclass clazz, jint n, jobject obj_shaders, jint binaryformat, jobject obj_binary, jint offsetBytes, jint length) {
	int* shaders = (int*)(obj_shaders?env->GetDirectBufferAddress(obj_shaders):0);
	unsigned char* binary = (unsigned char*)(obj_binary?env->GetDirectBufferAddress(obj_binary):0);


//@line:3788

    								
 		// native code	
 		char * data0 = (char *) (binary + offsetBytes);	
    		glShaderBinary( (GLsizei) n, 
    				(const GLuint *)shaders, 
    				(GLenum) binaryformat, 
    				(const GLvoid *) data0, 
    				(GLsizei) length );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLShaderSource(JNIEnv* env, jclass clazz, jint shader, jstring obj_source) {
	char* source = (char*)env->GetStringUTFChars(obj_source, 0);


//@line:3818

        										
   			//Send the vertex shader source code to GL
   			// GL expects an array of strings
   			const char* sourceArr[] = {source};								
			glShaderSource((GLuint)shader, 1, sourceArr, 0);
    
	env->ReleaseStringUTFChars(obj_source, source);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:3844
    
    
               glStencilFunc ( (GLenum) func, (GLint) ref, (GLuint) mask );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilFuncSeparate(JNIEnv* env, jclass clazz, jint face, jint func, jint ref, jint mask) {


//@line:3868

    
     			glStencilFuncSeparate( (GLenum) face, (GLenum) func, (GLint) ref, (GLuint) mask );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:3892

    				glStencilMask ( (GLuint) mask );    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilMaskSeparate(JNIEnv* env, jclass clazz, jint face, jint mask) {


//@line:3914

    
    				glStencilMaskSeparate( (GLenum) face, (GLuint) mask );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:3937

    			glStencilOp( (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLStencilOpSeparate(JNIEnv* env, jclass clazz, jint face, jint fail, jint zfail, jint zpass) {


//@line:3960

    
    				glStencilOpSeparate((GLenum) face, (GLenum) fail, (GLenum) zfail, (GLenum) zpass );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4015


    		// native code	
            char * pixels0 = (char *) (pixels + offsetBytes);	
    		
    		glTexImage2D ( (GLenum) target, 
    						(GLint) level, 
    						(GLint) internalformat, 
    						(GLsizei) width, 
    						(GLsizei) height,
    						(GLint) border,
    						(GLenum) format, 
    						(GLenum) type, 
    						(const GLvoid *) pixels0 );
    						
    		

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:4050

    			
    			glTexParameterf ( (GLenum) target, (GLenum) pname, (GLfloat) param );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__II_3FI(JNIEnv* env, jclass clazz, jint target, jint pname, jfloatArray obj_params, jint offset) {
	float* params = (float*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4074

    
    				glTexParameterfv( (GLenum) target, (GLenum) pname, (const GLfloat *) &params[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameterfv__IILjava_nio_FloatBuffer_2(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params) {
	float* params = (float*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4097

    
    				glTexParameterfv( (GLenum) target, (GLenum) pname, (const GLfloat *)params );
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:4122

    			
    			glTexParameteri ( (GLenum) target, (GLenum) pname, (GLint) param );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__II_3II(JNIEnv* env, jclass clazz, jint target, jint pname, jintArray obj_params, jint offset) {
	int* params = (int*)env->GetPrimitiveArrayCritical(obj_params, 0);


//@line:4146

    			
    			glTexParameteriv ( (GLenum) target, (GLenum) pname, (const GLint *) &params[offset]);
    
    
	env->ReleasePrimitiveArrayCritical(obj_params, params, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexParameteriv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params) {
	int* params = (int*)(obj_params?env->GetDirectBufferAddress(obj_params):0);


//@line:4170

    		
    		glTexParameteriv ( (GLenum) target, (GLenum) pname, (const GLint *)params );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint offsetBytes) {
	unsigned char* pixels = (unsigned char*)(obj_pixels?env->GetDirectBufferAddress(obj_pixels):0);


//@line:4219

    										
	
										 // native code	
										char * pixels0 = (char *) (pixels + offsetBytes);	
    									glTexSubImage2D ( (GLenum) target, 
    														(GLint) level, 
    														(GLint) xoffset, 
    														(GLint) yoffset, 
    														(GLsizei) width, 
    														(GLsizei) height, 
    														(GLenum) format, 
    														(GLenum) type, 
    														(const GLvoid *) pixels0 );		
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1f(JNIEnv* env, jclass clazz, jint location, jfloat x) {


//@line:4255

    
    			glUniform1f( (GLint) location, (GLfloat) x );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4279

    
    				glUniform1fv( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    				
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1fv__IILjava_nio_FloatBuffer_2(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v) {
	float* v = (float*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:4303

    
    					glUniform1fv ( (GLint) location, (GLsizei) count, (const GLfloat *)v );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1i(JNIEnv* env, jclass clazz, jint location, jint x) {


//@line:4327

    
    			 glUniform1i ( (GLint) location, (GLint) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4350

    
    				glUniform1iv ( (GLint) location, (GLsizei) count, (const GLint *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform1iv__IILjava_nio_IntBuffer_2(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_v) {
	int* v = (int*)(obj_v?env->GetDirectBufferAddress(obj_v):0);


//@line:4373

    
    				glUniform1iv((GLint) location, (GLsizei) count, (const GLint *)v );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y) {


//@line:4397

    
    				glUniform2f ( (GLint) location, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4420

    
    				glUniform2fv( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4455

   
  			// apply offset    
			GLfloat * values0 = (GLfloat *) (values + offset);    
    		glUniform2fv( (GLint) location, (GLsizei) count, (const GLfloat *)values0);
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2i(JNIEnv* env, jclass clazz, jint location, jint x, jint y) {


//@line:4481

    
    			 glUniform2i ( (GLint) location, (GLint) x, (GLint) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4504

    
    	 glUniform2iv ( (GLint) location, (GLsizei) count, (const GLint *) &v[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform2iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4539

    
			// apply offset    
			 GLint * values0 = (GLint *) (values + offset);
    		 glUniform2iv ( (GLint) location, (GLsizei) count, (const GLint *) values0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z) {


//@line:4564

    
     		glUniform3f ( (GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4588

    
    			glUniform3fv ( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4624

    
			// apply offset    
			GLfloat * values0 = (GLfloat *) (values + offset);
     		glUniform3fv ( (GLint) location, (GLsizei) count, (const GLfloat *) values0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z) {


//@line:4649

    
    			glUniform3i ( (GLint) location, (GLint) x, (GLint) y, (GLint) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:4672
    
        glUniform3iv ( (GLint) location, (GLsizei) count, (const GLint *) &value[offset] );    
    
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform3iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4708


			// apply offset    
			 GLint * values0 = ( GLint *) (values + offset);
  			glUniform3iv ( (GLint) location, (GLsizei) count, (const GLint *) values0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4f(JNIEnv* env, jclass clazz, jint location, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:4733

    			
    			glUniform4f ( (GLint) location, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__II_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jfloatArray obj_v, jint offset) {
	float* v = (float*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4757

    
    				glUniform4fv ( (GLint) location, (GLsizei) count, (const GLfloat *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4fv__IILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4791

    
			// apply offset    
			GLfloat * values0 = (GLfloat *) (values + offset);
    		glUniform4fv ( (GLint) location, (GLsizei) count, (const GLfloat *) values0 );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4i(JNIEnv* env, jclass clazz, jint location, jint x, jint y, jint z, jint w) {


//@line:4816

    
    			glUniform4i ( (GLint) location, (GLint) x, (GLint) y, (GLint) z, (GLint) w );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__II_3II(JNIEnv* env, jclass clazz, jint location, jint count, jintArray obj_v, jint offset) {
	int* v = (int*)env->GetPrimitiveArrayCritical(obj_v, 0);


//@line:4839

    
    			glUniform4iv ( (GLint) location, (GLsizei) count, (const GLint *) &v[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_v, v, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniform4iv__IILjava_nio_IntBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jobject obj_values, jint offset) {
	int* values = (int*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:4873

    
    			// apply offset    
				GLint * values0 = (GLint *) (values + offset);
    			glUniform4iv ( (GLint) location, (GLsizei) count, (const GLint *) values0 );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:4899

     			glUniformMatrix2fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *) &value[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix2fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:4933

    				glUniformMatrix2fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (GLfloat *) (value + offset) );    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:4956

    
     				glUniformMatrix3fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *) &value[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix3fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:4992

    		
			// apply offset    
			//GLfloat * value0 = (GLfloat *) (value + offset);
    		glUniformMatrix3fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *) (value + offset) );    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZ_3FI(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jfloatArray obj_value, jint offset) {
	float* value = (float*)env->GetPrimitiveArrayCritical(obj_value, 0);


//@line:5018

    
    		glUniformMatrix4fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *) &value[offset] );
    
    
	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUniformMatrix4fv__IIZLjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint location, jint count, jboolean transpose, jobject obj_value, jint offset) {
	float* value = (float*)(obj_value?env->GetDirectBufferAddress(obj_value):0);


//@line:5052

    
			// apply offset    
			GLfloat * value0 = (GLfloat *) (value + offset);
    		glUniformMatrix4fv ( (GLint) location, (GLsizei) count, (GLboolean)  transpose, (const GLfloat *)value0 );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLUseProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5078

    			glUseProgram ( (GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLValidateProgram(JNIEnv* env, jclass clazz, jint program) {


//@line:5100

        glValidateProgram ( (GLuint) program );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1f(JNIEnv* env, jclass clazz, jint indx, jfloat x) {


//@line:5122

    
     			glVertexAttrib1f ( (GLuint) indx, (GLfloat) x );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5145

    
    			glVertexAttrib1fv ( (GLuint) indx, (const GLfloat *) &values[offset] );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib1fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5177


			// apply offset    
			GLfloat * values0 = ( GLfloat *) (values + offset);      
    		glVertexAttrib1fv ((GLuint) indx, (const GLfloat *)values0 );
    
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y) {


//@line:5204

         glVertexAttrib2f ( (GLuint) indx, (GLfloat) x, (GLfloat) y );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5226

    
    			glVertexAttrib2fv ( (GLuint) indx, (const GLfloat *)(values + offset) );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib2fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5258

    
            // apply offset    
            glVertexAttrib2fv ( (GLuint) indx,  (const GLfloat *)(values + offset) );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z) {


//@line:5283

    		glVertexAttrib3f ( (GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5305

     		glVertexAttrib3fv ( (GLuint) indx, (const GLfloat *)values );
    
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib3fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5335

    			// apply offset  
 			
    			glVertexAttrib3fv ( (GLuint) indx,(const GLfloat *) (values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4f(JNIEnv* env, jclass clazz, jint indx, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5359

    		glVertexAttrib4f ( (GLuint) indx, (GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) w );
    
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__I_3FI(JNIEnv* env, jclass clazz, jint indx, jfloatArray obj_values, jint offset) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:5382

    		glVertexAttrib4fv ( (GLuint) indx, (const GLfloat *)values );
    
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttrib4fv__ILjava_nio_FloatBuffer_2I(JNIEnv* env, jclass clazz, jint indx, jobject obj_values, jint offset) {
	float* values = (float*)(obj_values?env->GetDirectBufferAddress(obj_values):0);


//@line:5412

       // apply offset    
       // GLfloat * values0 = values + offset;
        glVertexAttrib4fv ( (GLuint) indx, (const GLfloat *)(values + offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointer(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jint offset) {


//@line:5442

    		glVertexAttribPointer ( (GLuint) indx, 
    		                        (GLint) size, 
    		                        (GLenum) type, 
    		                        (GLboolean)  normalized, 
    		                        (GLsizei) stride, 
    		                         reinterpret_cast<GLvoid *>(offset) );
    

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLVertexAttribPointerBounds(JNIEnv* env, jclass clazz, jint indx, jint size, jint type, jboolean normalized, jint stride, jobject obj_ptr, jint offsetBytes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:5485

    		
    	   // native code	
 	     char * data0 = (char *) (ptr + offsetBytes);
    		
            // param remaining is unused.    		
    	        glVertexAttribPointer ( 
    					(GLuint) indx, 
    					(GLint) size, 
    					(GLenum) type, 
    					(GLboolean) normalized, 
    					(GLsizei) stride, 
    					(const GLvoid *)data0 );	
    	
    	

}

JNIEXPORT void JNICALL Java_gles_internal_GLES20Pipeline_nGLViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:5519

    	    glViewport ( (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    

}

