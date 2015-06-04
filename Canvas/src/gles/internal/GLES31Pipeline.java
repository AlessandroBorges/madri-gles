/*

**    Place holder for disclaimer.
*/

package gles.internal;

/** OpenGL ES 3.1
 */
public class GLES31Pipeline
	extends GLES30Pipeline
	implements Pipeline {
    
    private static String VALUE = "value";
    
    /** Includes **/
    //@off
    /*JNI
      #include <GLES3/gl3.h>
      #include <GLES3/gl3ext.h>
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     */

	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	private GLES31Pipeline(){}

	/**
	 * 
	 */
	private static Pipeline instance;
	
	/**
	 * Get a instance of this Pipeline implementation
	 * @return a live instance of GLES10EXT
	 */
	public  Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES31Pipeline();
		}        
        return instance;
    }

    /**
     * <pre>
     * Delegate Method generated from GLES31._nativeClassInit();
     * 
     *  C function void glDispatchCompute ( (GLuint) num_groups_x, (GLuint) num_groups_y, (GLuint) num_groups_z )

     **/
    public void GLES31ClassInit() {
        GLES31Pipeline.nGLES31ClassInit();
    }

    /**
     * <pre>
     * Native method generated from GLES31._nativeClassInit();
     * 
     *  C function void glDispatchCompute ( (GLuint) num_groups_x, (GLuint) num_groups_y, (GLuint) num_groups_z )

     **/
    private static  void nGLES31ClassInit(){}/*
     //no op
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDispatchCompute([int num_groups_x, int num_groups_y, int num_groups_z]);
     * 
     *  C function void glDispatchCompute ( (GLuint) num_groups_x, (GLuint) num_groups_y, (GLuint) num_groups_z )

     **/
    public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        GLES31Pipeline.nGLDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDispatchCompute([int num_groups_x, int num_groups_y, int num_groups_z]);
     * 
     *  C function void glDispatchCompute ( (GLuint) num_groups_x, (GLuint) num_groups_y, (GLuint) num_groups_z )

     **/
    private static native void nGLDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z);/*
       glDispatchCompute(
        (GLuint)num_groups_x,
        (GLuint)num_groups_y,
        (GLuint)num_groups_z
    );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDispatchComputeIndirect([long indirect]);
     * 
     *  C function void glDispatchComputeIndirect (  (GLintptr) indirect );

     **/
    public void glDispatchComputeIndirect(long indirect) {
        GLES31Pipeline.nGLDispatchComputeIndirect(indirect);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDispatchComputeIndirect([long indirect]);
     * 
     *  C function void glDispatchComputeIndirect (  (GLintptr) indirect );

     **/
    private static native void nGLDispatchComputeIndirect(long indirect);/*
       glDispatchComputeIndirect((GLintptr)indirect);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDrawArraysIndirect([int mode, long indirect]);
     * 
     *  C function void glDrawArraysIndirect ( (GLenum) mode, const void *indirect );

     **/
    public void glDrawArraysIndirect(int mode, long indirect) {
        GLES31Pipeline.nGLDrawArraysIndirect(mode, indirect);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDrawArraysIndirect([int mode, long indirect]);
     * 
     *  C function void glDrawArraysIndirect ( (GLenum) mode, const void *indirect );

     **/
    private static native void nGLDrawArraysIndirect(int mode, long indirect);/*
       glDrawArraysIndirect(mode, (const void*)indirect);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDrawElementsIndirect([int mode, int type, long indirect]);
     * 
     *  C function glDrawElementsIndirect ( (GLenum) mode, (GLenum) type, const void *indirect );

     **/
    public void glDrawElementsIndirect(int mode, int type, long indirect) {
        GLES31Pipeline.nGLDrawElementsIndirect(mode, type, indirect);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDrawElementsIndirect([int mode, int type, long indirect]);
     * 
     *  C function glDrawElementsIndirect ( (GLenum) mode, (GLenum) type, const void *indirect );

     **/
    private static native void nGLDrawElementsIndirect(int mode, int type, long indirect);/*
       glDrawElementsIndirect(mode, type, (const void*)indirect);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glFramebufferParameteri([int target, int pname, int param]);
     * 
     *  C function void glFramebufferParameteri ( (GLenum) target, (GLenum) pname, (GLint) param )

     **/
    public void glFramebufferParameteri(int target, int pname, int param) {
        GLES31Pipeline.nGLFramebufferParameteri(target, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glFramebufferParameteri([int target, int pname, int param]);
     * 
     *  C function void glFramebufferParameteri ( (GLenum) target, (GLenum) pname, (GLint) param )

     **/
    private static native void nGLFramebufferParameteri(int target, int pname, int param);/*
             glFramebufferParameteri( (GLenum)target, (GLenum)pname, (GLint)param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferParameteriv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     **/
    public void glGetFramebufferParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, "params");
        GLES31Pipeline.nGLGetFramebufferParameteriv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferParameteriv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetFramebufferParameteriv(int target, int pname, int[] params, int offset);/*
      glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset);
    );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferParameteriv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     **/
    public void glGetFramebufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 0, "params");
        int offset = getOffset(params);
        if (params.isDirect()) {            
            GLES31Pipeline.nGLGetFramebufferParameteriv(target, pname, params, offset);
        } else {           
            int[] array = params.array();
            GLES31Pipeline.nGLGetFramebufferParameteriv(target, pname, array, offset);
        } 
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferParameteriv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetFramebufferParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
           glGetFramebufferParameteriv(
        (GLenum)target,
        (GLenum)pname,
        (GLint *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramInterfaceiv ( (GLuint) program, (GLenum) programInterface, (GLenum) pname, (GLint) *params )

     **/
    public void glGetProgramInterfaceiv( int program, int programInterface, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, "params");
        GLES31Pipeline.nGLGetProgramInterfaceiv(program, programInterface, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramInterfaceiv ( (GLuint) program, (GLenum) programInterface, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetProgramInterfaceiv( int program, 
                                                         int programInterface, 
                                                         int pname, 
                                                         int[] params, int offset);/*
       glGetProgramInterfaceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLenum)pname,
                                (GLint *)(params + offset)  );
                                                         
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramInterfaceiv ( (GLuint) program, (GLenum) programInterface, (GLenum) pname, (GLint) *params )

     **/
    public void glGetProgramInterfaceiv(int program, int programInterface, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 0, "params");
        int offset = getOffset(params);
        if (params.isDirect()) {            
            GLES31Pipeline.nGLGetProgramInterfaceiv(program, programInterface, pname, params, offset);
        } else {           
            int[] array = params.array();
            GLES31Pipeline.nGLGetProgramInterfaceiv(program, programInterface, pname, array, offset);
        }  
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramInterfaceiv ( (GLuint) program, (GLenum) programInterface, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetProgramInterfaceiv( int program, 
                                                         int programInterface, 
                                                         int pname, 
                                                         java.nio.IntBuffer params, int offset);/*
         glGetProgramInterfaceiv( (GLuint)program,
                                  (GLenum)programInterface,
                                  (GLenum)pname,
                                  (GLint *)(params + offset)   );                                                 
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramResourceIndex([int program, int programInterface, String name]);
     * 
     *  C function (GLuint) glGetProgramResourceIndex ( (GLuint) program, (GLenum) programInterface, const  (GLchar *) name )

     **/
    public int glGetProgramResourceIndex(int program, int programInterface, String name) {
        if(null == name){
            throw new IllegalArgumentException("name==null");
        }
       return GLES31Pipeline.nGLGetProgramResourceIndex(program, programInterface, name);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramResourceIndex([int program, int programInterface, String name]);
     * 
     *  C function (GLuint) glGetProgramResourceIndex ( (GLuint) program, (GLenum) programInterface, const  (GLchar *) name )

     **/
    private static native int nGLGetProgramResourceIndex(int program, int programInterface, String name);/*
         return (jint) glGetProgramResourceIndex( (GLuint)program,  (GLenum)programInterface, ( (GLchar *) )name);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramResourceName([int program, int programInterface, int index]);
     * 
     *  C function void glGetProgramResourceName ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) bufSize, (GLsizei) *length,  (GLchar *) name )

     **/
    public String glGetProgramResourceName(int program, int programInterface, int index) {        
       return GLES31Pipeline.nGLGetProgramResourceName(program, programInterface, index);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramResourceName([int program, int programInterface, int index]);
     * 
     *  C function void glGetProgramResourceName ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) bufSize, (GLsizei) *length,  (GLchar *) name )

     **/
    private static native String nGLGetProgramResourceName(int program, int programInterface, int index);/*
      // based on code from 
      // http://people.freedesktop.org/~idr/OpenGL_tutorials/05-attributes.html
      (GLint)  max_length = 0;
            
       //get max length of attribute
       glGetProgramInterfaceiv(program, programInterface,  GL_MAX_NAME_LENGTH, &max_length);
        //alloc some space
        std::vector<GLchar> name(max_length + 1);
        
        glGetProgramResourceName ( (GLuint) program, 
                                   (GLenum) programInterface, 
                                   (GLuint) index, 
                                   (GLsizei) max_length, 
                                    &max_length, 
                                    &name[0] );
        
         jstring result = env->NewStringUTF(&name[0]);
         return result; 
       
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset]);
     * 
     *  C function void glGetProgramResourceiv ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) propCount, const (GLenum) *props, (GLsizei) bufSize, (GLsizei) *length, (GLint) *params )

     **/
    public void glGetProgramResourceiv( int program, 
                                        int programInterface, 
                                        int index, 
                                        int propCount, 
                                        int[] props, int propsOffset, 
                                        int bufSize, 
                                        int[] length, int lengthOffset, 
                                        int[] params, int paramsOffset) {
        checkArray(props, propsOffset, 1, "props");
        checkArray(length, lengthOffset, 1, "length");
        checkArray(params, paramsOffset, 1, "params");
        GLES31Pipeline.nGLGetProgramResourceiv( program, 
                                                programInterface, 
                                                index, 
                                                propCount, 
                                                props, propsOffset, bufSize, 
                                                length, lengthOffset, 
                                                params, paramsOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset]);
     * 
     *  C function void glGetProgramResourceiv ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) propCount, const (GLenum) *props, (GLsizei) bufSize, (GLsizei) *length, (GLint) *params )

     **/
    private static native void nGLGetProgramResourceiv( int program, 
                                                        int programInterface, 
                                                        int index, int propCount, 
                                                        int[] props, int propsOffset, 
                                                        int bufSize, 
                                                        int[] length, int lengthOffset, 
                                                        int[] params, int paramsOffset);/*    
        glGetProgramResourceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLuint)index,
                                (GLsizei)propCount,
                                (GLenum *)(props + propsOffset) ,
                                (GLsizei)bufSize,
                                (GLsizei *)(length + lengthOffset) ,
                                (GLint *)(params + paramsOffset) );                                                
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramResourceiv ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) propCount, const (GLenum) *props, (GLsizei) bufSize, (GLsizei) *length, (GLint) *params )

     **/
    public void glGetProgramResourceiv( int program, 
                                        int programInterface, 
                                        int index, int propCount, 
                                        java.nio.IntBuffer props, int bufSize, 
                                        java.nio.IntBuffer length, 
                                        java.nio.IntBuffer params) {
        
        checkBuffer(props, 1, "props");
        checkBuffer(length, 1, "length");
        checkBuffer(params, 1, "params");
        
        int propsOffset = getOffset(props);
        int lengthOffset = getOffset(props);
        int paramsOffset = getOffset(props);
        
        if(props.isDirect() && length.isDirect() && params.isDirect()){
            GLES31Pipeline.nGLGetProgramResourceiv( program, 
                    programInterface, 
                    index, 
                    propCount, 
                    props, propsOffset,  
                    bufSize, 
                    length, lengthOffset,
                    params, paramsOffset);
        }else 
         if(props.hasArray() && length.hasArray() && params.hasArray()){             
             int[] propsArray = props.array();
             int[] lenArray = length.array();
             int[] paramArray = params.array();
             
             GLES31Pipeline.nGLGetProgramResourceiv( program, 
                     programInterface, 
                     index, 
                     propCount, 
                     propsArray, propsOffset,  
                     bufSize, 
                     lenArray, lengthOffset,
                     paramArray, paramsOffset);
         }else{
             throw new IllegalArgumentException("inconsistent buffers. Please use all direct or all heap buffers.");
         }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramResourceiv ( (GLuint) program, (GLenum) programInterface, (GLuint) index, (GLsizei) propCount, const (GLenum) *props, (GLsizei) bufSize, (GLsizei) *length, (GLint) *params )

     **/
    private static native void nGLGetProgramResourceiv(int program, 
                                                       int programInterface, 
                                                       int index, 
                                                       int propCount, 
                                                       java.nio.IntBuffer props, int propsOffset, 
                                                       int bufSize, 
                                                       java.nio.IntBuffer length, int lengthOffset, 
                                                       java.nio.IntBuffer params, int paramsOffset);/*
        
        glGetProgramResourceiv( (GLuint)program,
                                (GLenum)programInterface,
                                (GLuint)index,
                                (GLsizei)propCount,
                                (GLenum *)(props + propsOffset) ,
                                (GLsizei)bufSize,
                                (GLsizei *)(length + lengthOffset) ,
                                (GLint *)(params + paramsOffset) );                                                
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramResourceLocation([int program, int programInterface, String name]);
     * 
     *  C function (GLint) glGetProgramResourceLocation ( (GLuint) program, (GLenum) programInterface, const  (GLchar *) name )

     **/
    public int glGetProgramResourceLocation(int program, int programInterface, String name) {
        if(null == name){
            throw new IllegalArgumentException("name == null");
        }
        return GLES31Pipeline.nGLGetProgramResourceLocation(program, programInterface, name);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramResourceLocation([int program, int programInterface, String name]);
     * 
     *  C function (GLint) glGetProgramResourceLocation ( (GLuint) program, (GLenum) programInterface, const  (GLchar *) name )

     **/
    private static native int nGLGetProgramResourceLocation(int program, int programInterface, String name);/*
        
        return  glGetProgramResourceLocation( (GLuint)program, 
                                              (GLenum)programInterface,
                                              ( (GLchar *) )name );
        
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glUseProgramStages([int pipeline, int stages, int program]);
     * 
     *  C function void glUseProgramStages ( (GLuint) pipeline,  (GLbitfield)  stages, (GLuint) program )

     **/
    public void glUseProgramStages(int pipeline, int stages, int program) {
        GLES31Pipeline.nGLUseProgramStages(pipeline, stages, program);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glUseProgramStages([int pipeline, int stages, int program]);
     * 
     *  C function void glUseProgramStages ( (GLuint) pipeline,  (GLbitfield)  stages, (GLuint) program )

     **/
    private static native void nGLUseProgramStages(int pipeline, int stages, int program);/*
           glUseProgramStages((GLuint)pipeline, ( (GLbitfield) )stages, (GLuint)program );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glActiveShaderProgram([int pipeline, int program]);
     * 
     *  C function void glActiveShaderProgram ( (GLuint) pipeline, (GLuint) program )

     **/
    public void glActiveShaderProgram(int pipeline, int program) {
        GLES31Pipeline.nGLActiveShaderProgram(pipeline, program);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glActiveShaderProgram([int pipeline, int program]);
     * 
     *  C function void glActiveShaderProgram ( (GLuint) pipeline, (GLuint) program )

     **/
    private static native void nGLActiveShaderProgram(int pipeline, int program);/*
           glActiveShaderProgram( (GLuint)pipeline, (GLuint)program );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glCreateShaderProgramv([int type, String[] strings]);
     * 
     *  C function (GLuint) glCreateShaderProgramv ( (GLenum) type, (GLsizei) count, const  (GLchar *) const *strings )

     **/
    public int glCreateShaderProgramv(int type, String[] strings) {
        if(null == strings){
            throw new IllegalArgumentException("strings == null");
        }
        return GLES31Pipeline.nGLCreateShaderProgramv(type, strings.length, strings);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glCreateShaderProgramv([int type, String[] strings]);
     * 
     *  C function (GLuint) glCreateShaderProgramv ( (GLenum) type, (GLsizei) count, const  (GLchar *) const *strings )

     **/
    private static native int nGLCreateShaderProgramv(int type, int stringCount, String[] stringArray);/*
    
                      
            std::vector<jstring> jstringVec(stringCount);
            std::vector<char *>  charVec(stringCount); 
             
            for (int i=0; i<stringCount; i++) {
                 jstring string = (jstring) GetObjectArrayElement(env, stringArray, i);
                 const char *rawString = GetStringUTFChars(env, string, 0);             
                 jstringVec.[i] = string;
                 charVec.[i] = rawString;           
            }
            ////////////////////////////////////////
             
             char * strings[] = &charVec[0];
             
             (GLint) result = glCreateShaderProgramv ( (GLenum) type, (GLsizei) stringCount,  strings );
            
            //////////////////////////////////////
            // Done
            for (int i=0; i<stringCount; i++) {
               jstring string = jstringVec.[i];
               const char *rawString = charVec.[i];
               
                env->ReleaseStringUTFChars(string, rawString);
            }
            ///////////////////////////////////////////
             
             return result;
            
      
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glBindProgramPipeline([int pipeline]);
     * 
     *  C function void glBindProgramPipeline ( (GLuint) pipeline )

     **/
    public void glBindProgramPipeline(int pipeline) {
        GLES31Pipeline.nGLBindProgramPipeline(pipeline);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glBindProgramPipeline([int pipeline]);
     * 
     *  C function void glBindProgramPipeline ( (GLuint) pipeline )

     **/
    private static native void nGLBindProgramPipeline(int pipeline);/*
         glBindProgramPipeline( (GLuint) pipeline );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDeleteProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glDeleteProgramPipelines ( (GLsizei) n, const (GLuint) *pipelines )

     **/
    public void glDeleteProgramPipelines(int n, int[] pipelines, int offset) {
        checkArray(pipelines, offset, 1, "pipelines");
        GLES31Pipeline.nGLDeleteProgramPipelines(n, pipelines, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDeleteProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glDeleteProgramPipelines ( (GLsizei) n, const (GLuint) *pipelines )

     **/
    private static native void nGLDeleteProgramPipelines(int n, int[] pipelines, int offset);/*
       glDeleteProgramPipelines ( (GLsizei) n, (GLuint *) (pipelines + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glDeleteProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glDeleteProgramPipelines ( (GLsizei) n, const (GLuint) *pipelines )

     **/
    public void glDeleteProgramPipelines(int n, java.nio.IntBuffer pipelines) {
        checkBuffer(pipelines, 0, "params");
        int offset = getOffset(pipelines);
        if (pipelines.isDirect()) {            
            GLES31Pipeline.nGLDeleteProgramPipelines(n, pipelines, offset);
        } else {           
            int[] array = pipelines.array();
            GLES31Pipeline.nGLDeleteProgramPipelines(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glDeleteProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glDeleteProgramPipelines ( (GLsizei) n, const (GLuint) *pipelines )

     **/
    private static native void nGLDeleteProgramPipelines(int n, java.nio.IntBuffer pipelines, int offset);/*
         glDeleteProgramPipelines ( (GLsizei) n, (GLuint *) (pipelines + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGenProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glGenProgramPipelines ( (GLsizei) n, (GLuint) *pipelines )

     **/
    public void glGenProgramPipelines(int n, int[] pipelines, int offset) {
        checkArray(pipelines, offset, 1, "pipelines");
        GLES31Pipeline.nGLGenProgramPipelines(n, pipelines, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGenProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glGenProgramPipelines ( (GLsizei) n, (GLuint) *pipelines )
     **/
    private static native void nGLGenProgramPipelines(int n, int[] pipelines, int offset);/*
        glGenProgramPipelines ( (GLsizei) n, (GLuint *)(pipelines + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGenProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glGenProgramPipelines ( (GLsizei) n, (GLuint) *pipelines )

     **/
    public void glGenProgramPipelines(int n, java.nio.IntBuffer pipelines) {
        GLES31Pipeline.nGLGenProgramPipelines(n, pipelines);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGenProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glGenProgramPipelines ( (GLsizei) n, (GLuint) *pipelines )

     **/
    private static native void nGLGenProgramPipelines(int n, java.nio.IntBuffer pipelines);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glIsProgramPipeline([int pipeline]);
     * 
     *  C function  (GLboolean) glIsProgramPipeline ( (GLuint) pipeline )

     **/
    public boolean glIsProgramPipeline(int pipeline) {
        return GLES31Pipeline.nGLIsProgramPipeline(pipeline);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glIsProgramPipeline([int pipeline]);
     * 
     *  C function  (GLboolean) glIsProgramPipeline ( (GLuint) pipeline )

     **/
    private static native boolean nGLIsProgramPipeline(int pipeline);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramPipelineiv ( (GLuint) pipeline, (GLenum) pname, (GLint) *params )

     **/
    public void glGetProgramPipelineiv(int pipeline, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetProgramPipelineiv(pipeline, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramPipelineiv ( (GLuint) pipeline, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetProgramPipelineiv(int pipeline, int pname, int[] params, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramPipelineiv ( (GLuint) pipeline, (GLenum) pname, (GLint) *params )

     **/
    public void glGetProgramPipelineiv(int pipeline, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetProgramPipelineiv(pipeline, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramPipelineiv ( (GLuint) pipeline, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetProgramPipelineiv(int pipeline, int pname, java.nio.IntBuffer params);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1i([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1i ( (GLuint) program, (GLint) location, (GLint) v0 )

     **/
    public void glProgramUniform1i(int program, int location, int v0) {
        GLES31Pipeline.nGLProgramUniform1i(program, location, v0);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1i([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1i ( (GLuint) program, (GLint) location, (GLint) v0 )

     **/
    private static native void nGLProgramUniform1i(int program, int location, int v0);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2i([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1 )

     **/
    public void glProgramUniform2i(int program, int location, int v0, int v1) {
        GLES31Pipeline.nGLProgramUniform2i(program, location, v0, v1);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2i([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1 )

     **/
    private static native void nGLProgramUniform2i(int program, int location, int v0, int v1);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3i([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2 )

     **/
    public void glProgramUniform3i(int program, int location, int v0, int v1, int v2) {
        GLES31Pipeline.nGLProgramUniform3i(program, location, v0, v1, v2);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3i([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2 )

     **/
    private static native void nGLProgramUniform3i(int program, int location, int v0, int v1, int v2);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4i([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2, (GLint) v3 )

     **/
    public void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        GLES31Pipeline.nGLProgramUniform4i(program, location, v0, v1, v2, v3);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4i([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4i ( (GLuint) program, (GLint) location, (GLint) v0, (GLint) v1, (GLint) v2, (GLint) v3 )

     **/
    private static native void nGLProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1ui([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1ui ( (GLuint) program, (GLint) location, (GLuint) v0 )

     **/
    public void glProgramUniform1ui(int program, int location, int v0) {
        GLES31Pipeline.nGLProgramUniform1ui(program, location, v0);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1ui([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1ui ( (GLuint) program, (GLint) location, (GLuint) v0 )

     **/
    private static native void nGLProgramUniform1ui(int program, int location, int v0);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2ui([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1 )

     **/
    public void glProgramUniform2ui(int program, int location, int v0, int v1) {
        GLES31Pipeline.nGLProgramUniform2ui(program, location, v0, v1);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2ui([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1 )

     **/
    private static native void nGLProgramUniform2ui(int program, int location, int v0, int v1);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3ui([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1, (GLuint) v2 )

     **/
    public void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
        GLES31Pipeline.nGLProgramUniform3ui(program, location, v0, v1, v2);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3ui([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1, (GLuint) v2 )

     **/
    private static native void nGLProgramUniform3ui(int program, int location, int v0, int v1, int v2);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4ui([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1, (GLuint) v2, (GLuint) v3 )

     **/
    public void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        GLES31Pipeline.nGLProgramUniform4ui(program, location, v0, v1, v2, v3);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4ui([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1, (GLuint) v2, (GLuint) v3 )

     **/
    private static native void nGLProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3);/*
             glProgramUniform4ui ( (GLuint) program, (GLint) location, (GLuint) v0, (GLuint) v1, (GLuint) v2, (GLuint) v3 );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1f([int program, int location, float v0]);
     * 
     *  C function void glProgramUniform1f ( (GLuint) program, (GLint) location, (GLFloat)  v0 )

     **/
    public void glProgramUniform1f(int program, int location, float v0) {
        GLES31Pipeline.nGLProgramUniform1f(program, location, v0);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1f([int program, int location, float v0]);
     * 
     *  C function void glProgramUniform1f ( (GLuint) program, (GLint) location, (GLFloat)  v0 )

     **/
    private static native void nGLProgramUniform1f(int program, int location, float v0);/*
            glProgramUniform1f ( (GLuint) program, (GLint) location, (GLFloat)  v0 );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2f([int program, int location, float v0, float v1]);
     * 
     *  C function void glProgramUniform2f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1 )

     **/
    public void glProgramUniform2f(int program, int location, float v0, float v1) {
        GLES31Pipeline.nGLProgramUniform2f(program, location, v0, v1);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2f([int program, int location, float v0, float v1]);
     * 
     *  C function void glProgramUniform2f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1 )

     **/
    private static native void nGLProgramUniform2f(int program, int location, float v0, float v1);/*
            glProgramUniform2f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1 );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3f([int program, int location, float v0, float v1, float v2]);
     * 
     *  C function void glProgramUniform3f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2 )

     **/
    public void glProgramUniform3f(int program, int location, float v0, float v1, float v2) {
        GLES31Pipeline.nGLProgramUniform3f(program, location, v0, v1, v2);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3f([int program, int location, float v0, float v1, float v2]);
     * 
     *  C function void glProgramUniform3f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2 )

     **/
    private static native void nGLProgramUniform3f(int program, int location, float v0, float v1, float v2);/*
            glProgramUniform3f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2 );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4f([int program, int location, float v0, float v1, float v2, float v3]);
     * 
     *  C function void glProgramUniform4f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2, (GLFloat)  v3 )

     **/
    public void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        GLES31Pipeline.nGLProgramUniform4f(program, location, v0, v1, v2, v3);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4f([int program, int location, float v0, float v1, float v2, float v3]);
     * 
     *  C function void glProgramUniform4f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2, (GLFloat)  v3 )

     **/
    private static native void nGLProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3);/*
            glProgramUniform4f ( (GLuint) program, (GLint) location, (GLFloat)  v0, (GLFloat)  v1, (GLFloat)  v2, (GLFloat)  v3 ); 
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform1iv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform1iv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform1iv(int program, int location, int count, int[] value, int offset);/*
    glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform1iv(int program, int location, int count, java.nio.IntBuffer value) {
        
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
        
        GLES31Pipeline.nGLProgramUniform1iv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform1iv(program, location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform1iv(int program, int location, int count, java.nio.IntBuffer value, int offset);/*
           glProgramUniform1iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform2iv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform2iv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform2iv(int program, int location, int count, int[] value, int offset);/*
           glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform2iv(int program, int location, int count, java.nio.IntBuffer value) {

        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform2iv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform2iv(program, location, count, array, offset);
        }     
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform2iv(int program, int location, int count, java.nio.IntBuffer value, int offset);/*
    glProgramUniform2iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) );
*/

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform3iv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform3iv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform3iv(int program, int location, int count, int[] value, int offset);/*
           glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform3iv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform3iv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform3iv(program, location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform3iv(int program, int location, int count, java.nio.IntBuffer value, int offset);/*
            glProgramUniform3iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform4iv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform4iv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform4iv(int program, int location, int count, int[] value, int offset);/*
        glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset) )
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    public void glProgramUniform4iv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform4iv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform4iv(program, location, count, array, offset);
    }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLint) *value )

     **/
    private static native void nGLProgramUniform4iv(int program, int location, int count, java.nio.IntBuffer value, int offset);/*
       glProgramUniform4iv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLint *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform1uiv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform1uiv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform1uiv(int program, int location, int count, int[] value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform1uiv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform1uiv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform1uiv(program, location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform1uiv(int program, int location, int count, java.nio.IntBuffer value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform2uiv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform2uiv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform2uiv(int program, int location, int count, int[] value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform2uiv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform2uiv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform2uiv(program, location, count, array, offset);
        }
        
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform2uiv(int program, int location, int count, java.nio.IntBuffer value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform3uiv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform3uiv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform3uiv(int program, int location, int count, int[] value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform3uiv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform3uiv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform3uiv(program, location, count, array, offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform3uiv(int program, int location, int count, java.nio.IntBuffer value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform4uiv(int program, int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform4uiv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform4uiv(int program, int location, int count, int[] value, int offset);/*
         glProgramUniform4uiv ( (GLuint) program, (GLint) location, (GLsizei) count, (GLuint *) (value + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    public void glProgramUniform4uiv(int program, int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform4uiv(program, location, count, value, offset);
        }else{
            int[] array = value.array();
            GLES31Pipeline.nGLProgramUniform4uiv(program, location, count, array, offset);
    }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4uiv ( (GLuint) program, (GLint) location, (GLsizei) count, const (GLuint) *value )

     **/
    private static native void nGLProgramUniform4uiv(int program, int location, int count, java.nio.IntBuffer value, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform1fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    public void glProgramUniform1fv(int program, int location, int count, float[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform1fv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniform1fv([int program, int
     * location, int count, float[] value, int offset]);
     * 
     * C function void glProgramUniform1fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    private static native void nGLProgramUniform1fv(int program, int location, int count, float[] value, int offset);/*
    
                glProgramUniform1fv ( (GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform1fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform1fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    public void glProgramUniform1fv(int program, int location, int count, java.nio.FloatBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform1fv(program, location, count, value, offset);
        }else{
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniform1fv(program, location, count, array, offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform1fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform1fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniform1fv(int program, int location, int count, java.nio.FloatBuffer value, int offset);/*
  
                glProgramUniform1fv ( (GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    */
    
  

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform2fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    public void glProgramUniform2fv(int program, int location, int count, float[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform2fv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform2fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniform2fv(int program, int location, int count, float[] value, int offset);/*
    glProgramUniform2fv ( (GLuint) program, 
                          (GLint) location,
                          (GLsizei) count,
                          (GLfloat *) (value + offset) );                                                       

*/

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform2fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform2fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    public void glProgramUniform2fv(int program,
                                    int location,
                                    int count,
                                    java.nio.FloatBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if (value.isDirect()) {
            GLES31Pipeline.nGLProgramUniform2fv(program,
                    location,
                    count,
                    value,
                    offset);
        } else {
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniform2fv(program,
                    location,
                    count,
                    array,
                    offset);
    }

    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform2fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform2fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniform2fv(int program, int location, int count, java.nio.FloatBuffer value, int offset);/*
                glProgramUniform2fv ( (GLuint) program, 
                                      (GLint) location, 
                                      (GLsizei) count, 
                                      (GLfloat *) (value + offset) );                                                       

    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniform3fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform3fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    public void glProgramUniform3fv(int program, int location, int count, float[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform3fv(program, location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniform3fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform3fv ( (GLuint) program, (GLint) location, (GLsizei) count, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniform3fv(int program, int location, int count, float[] value, int offset);/*
              glProgramUniform3fv ( (GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       

    */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniform3fv([int program,
     * int location, int count, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniform3fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    public void glProgramUniform3fv(int program, int location, int count, java.nio.FloatBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if(value.isDirect()){
            GLES31Pipeline.nGLProgramUniform3fv(program, location, count, value, offset);
        }else{
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniform3fv(program, location, count, array, offset);
        }
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniform3fv([int program, int
     * location, int count, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniform3fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    private static native void nGLProgramUniform3fv(int program,
                                                    int location,
                                                    int count,
                                                    java.nio.FloatBuffer value,
                                                    int offset);/*
            glProgramUniform3fv ( (GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset) );                                                       
     */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniform4fv([int program,
     * int location, int count, float[] value, int offset]);
     * 
     * C function void glProgramUniform4fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    public void glProgramUniform4fv(int program, int location, int count, float[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniform4fv(program, location, count, value, offset);
    }

    /**
     * <pre> 
     * Native method generated from
     * GLES31.glProgramUniform4fv([int program, int location, int count, float[]
     * value, int offset]);
     * 
     * C function void glProgramUniform4fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    private static native void nGLProgramUniform4fv(int program,
                                                    int location,
                                                    int count,
                                                    float[] value,
                                                    int offset);/*
                   glProgramUniform4fv ( (GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count, 
                                         (GLfloat *) (value + offset));                                 
                                                    
    */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniform4fv([int program,
     * int location, int count, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniform4fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    public void glProgramUniform4fv(int program, int location, int count, java.nio.FloatBuffer value) {
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniform4fv(program, location, count,value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniform4fv(program, location, count,  array, offset);
        }  
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniform4fv([int program, int
     * location, int count, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniform4fv ( (GLuint) program, (GLint) location,
     * (GLsizei) count, const (GLfloat *) value )
     * 
     **/
    private static native void nGLProgramUniform4fv(int program,
                                                    int location,
                                                    int count,
                                                    java.nio.FloatBuffer value, int offset);/*
            glProgramUniform4fv ( (GLuint) program, 
                                  (GLint) location, 
                                  (GLsizei) count, 
                                  (GLfloat *) (value + offset));                                        
                                                    
     */

    /**
     * <pre> 
     * Delegate Method generated from
     * GLES31.glProgramUniformMatrix2fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2fv(int program,
                                          int location,
                                          int count,
                                          boolean transpose,
                                          float[] value,
                                          int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix2fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre> 
     * Native method generated from
     * GLES31.glProgramUniformMatrix2fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix2fv(int program,
                                                          int location,
                                                          int count,
                                                          boolean transpose,
                                                          float[] value,
                                                          int offset);/*
          glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                                   
                                                          */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix2fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2fv(int program,
                                          int location,
                                          int count,
                                          boolean transpose,
                                          java.nio.FloatBuffer value) {
        
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix2fv(program, location, count, transpose, value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix2fv(program, location, count, transpose, array, offset);
        }
    }

    /**
     * <pre> 
     * Native method generated from
     * GLES31.glProgramUniformMatrix2fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void   nGLProgramUniformMatrix2fv(int program,
                                       int location,
                                       int count,
                                       boolean transpose,
                                       java.nio.FloatBuffer value, int offset);/*
             glProgramUniformMatrix2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                  
                                       
     */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniformMatrix3fv([int
     * program, int location, int count, boolean transpose, float[] value, int
     * offset]);
     * 
     * C function void glProgramUniformMatrix3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix3fv(int program,
                                          int location,
                                          int count,
                                          boolean transpose,
                                          float[] value,
                                          int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix3fv( program, location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniformMatrix3fv([int
     * program, int location, int count, boolean transpose, float[] value, int
     * offset]);
     * 
     * C function void glProgramUniformMatrix3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix3fv(int program,
                                                          int location,
                                                          int count,
                                                          boolean transpose,
                                                          float[] value,
                                                          int offset);/*
         glProgramUniformMatrix3fv ( (GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );  
    
    */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniformMatrix3fv([int
     * program, int location, int count, boolean transpose, java.nio.FloatBuffer
     * value]);
     * 
     * C function void glProgramUniformMatrix3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix3fv(program, location, count, transpose, value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix3fv(program, location, count, transpose,  array, offset);
        }   
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniformMatrix3fv([int
     * program, int location, int count, boolean transpose, java.nio.FloatBuffer
     * value]);
     * 
     * C function void glProgramUniformMatrix3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix3fv(int program,
                                       int location,
                                       int count,
                                       boolean transpose,
                                       java.nio.FloatBuffer value, int offset);/*
             glProgramUniformMatrix3fv ( (GLuint) program, 
                                         (GLint) location, 
                                         (GLsizei) count,  
                                         (GLboolean) transpose, 
                                         (GLfloat *) (value + offset) );                          
     */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniformMatrix4fv([int
     * program, int location, int count, boolean transpose, float[] value, int
     * offset]);
     * 
     * C function void glProgramUniformMatrix4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix4fv(int program,
                                          int location,
                                          int count,
                                          boolean transpose,
                                          float[] value,
                                          int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix4fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniformMatrix4fv([int
     * program, int location, int count, boolean transpose, float[] value, int
     * offset]);
     * 
     * C function void glProgramUniformMatrix4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix4fv(int program,
                                                          int location,
                                                          int count,
                                                          boolean transpose,
                                                          float[] value,
                                                          int offset);/*
                   glProgramUniformMatrix4fv ( (GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                                            
    */

    /**
     * <pre>
     * 
     * Delegate Method generated from GLES31.glProgramUniformMatrix4fv([int
     * program, int location, int count, boolean transpose, java.nio.FloatBuffer
     * value]);
     * 
     * C function void glProgramUniformMatrix4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix4fv(program, location, count, transpose, value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix4fv(program, location, count, transpose, array, offset);
        }
    }

    /**
     * <pre>
     * 
     * Native method generated from GLES31.glProgramUniformMatrix4fv([int
     * program, int location, int count, boolean transpose, java.nio.FloatBuffer
     * value]);
     * 
     * C function void glProgramUniformMatrix4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix4fv(int program,
                                       int location,
                                       int count,
                                       boolean transpose,
                                       java.nio.FloatBuffer value, int offset);/*
           glProgramUniformMatrix4fv ( (GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );                            
   */

    /**
     * <pre><br>
     * Delegate Method generated from
     * GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * <br>
     * C function void glProgramUniformMatrix2x3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2x3fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value,
                                            int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix2x3fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre><br>
     * Native method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     *  </br></br>
     *  C function void glProgramUniformMatrix2x3fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix2x3fv(int program,
                                                            int location,
                                                            int count,
                                                            boolean transpose,
                                                            float[] value,
                                                            int offset);/*
                    glProgramUniformMatrix2x3fv ( (GLuint) program, 
                                                  (GLint) location, 
                                                  (GLsizei) count,  
                                                  (GLboolean) transpose, 
                                                  (GLfloat *) (value + offset) );                                        
      */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix2x3fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2x3fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            java.nio.FloatBuffer value) {
        
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix2x3fv(program, location, count, transpose,value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix2x3fv(program, location, count, transpose,array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x3fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    private static native void  nGLProgramUniformMatrix2x3fv(int program,
                                         int location,
                                         int count,
                                         boolean transpose,
                                         java.nio.FloatBuffer value, int offset);/*
          glProgramUniformMatrix2x3fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x2fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    public void glProgramUniformMatrix3x2fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value,
                                            int offset) {
        checkArray(value, offset, count, VALUE);        
        GLES31Pipeline.nGLProgramUniformMatrix3x2fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre> Native method generated from
     * GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix3x2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix3x2fv(int program,
                                                            int location,
                                                            int count,
                                                            boolean transpose,
                                                            float[] value,
                                                            int offset);/*
            glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );       
                                                            */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix3x2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix3x2fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            java.nio.FloatBuffer value) {
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix3x2fv(program, location, count, transpose, value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix3x2fv(program, location, count, transpose, array, offset);
        }
    }

    /**
     * <pre> Native method generated from
     * GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix3x2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void  nGLProgramUniformMatrix3x2fv(int program,
                                         int location,
                                         int count,
                                         boolean transpose,
                                         java.nio.FloatBuffer value, int offset);/*
           glProgramUniformMatrix3x2fv( (GLuint) program, 
                                        (GLint) location, 
                                        (GLsizei) count,  
                                        (GLboolean) transpose, 
                                        (GLfloat *) (value + offset) );                                         
                                         */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix2x4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2x4fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value,
                                            int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix2x4fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre> Native method generated from
     * GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix2x4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix2x4fv(int program,
                                                            int location,
                                                            int count,
                                                            boolean transpose,
                                                            float[] value,
                                                            int offset);/*
             glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );                                         
   */                                                            

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix2x4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix2x4fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            java.nio.FloatBuffer value) {
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix2x4fv(program, location, count, transpose, value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix2x4fv(program, location, count, transpose, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x4fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix2x4fv(int program,
                                         int location,
                                         int count,
                                         boolean transpose,
                                         java.nio.FloatBuffer value, int offset);/*
            glProgramUniformMatrix2x4fv( (GLuint) program, 
                                          (GLint) location, 
                                          (GLsizei) count,  
                                          (GLboolean) transpose, 
                                          (GLfloat *) (value + offset) );   
      */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    public void glProgramUniformMatrix4x2fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value,
                                            int offset) {        
        checkArray(value, offset, count,VALUE);        
        GLES31Pipeline.nGLProgramUniformMatrix4x2fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre> Native method generated from
     * GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix4x2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    private static native void nGLProgramUniformMatrix4x2fv(int program,
                                                            int location,
                                                            int count,
                                                            boolean transpose,
                                                            float[] value,
                                                            int offset);/*
                  glProgramUniformMatrix4x2fv ( (GLuint) program, 
                                                (GLint)  location, 
                                                (GLsizei) count, 
                                                (GLboolean) transpose, 
                                                (GLfloat *) (value + offset));                                          
    */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count,
     * boolean transpose, java.nio.FloatBuffer value]);
     * 
     * C function void glProgramUniformMatrix4x2fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix4x2fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            java.nio.FloatBuffer value) {
        
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix4x2fv(program, location, count, transpose,value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix4x2fv(program, location, count, transpose, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix4x2fv(int program,
                                         int location,
                                         int count,
                                         boolean transpose,
                                         java.nio.FloatBuffer value, int offset);/*
          glProgramUniformMatrix4x2fv( (GLuint) program, 
                                       (GLint) location, 
                                       (GLsizei) count,  
                                       (GLboolean) transpose, 
                                       (GLfloat *) (value + offset) );
      */

    /**
     * <pre> Delegate Method generated from
     * GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count,
     * boolean transpose, float[] value, int offset]);
     * 
     * C function void glProgramUniformMatrix3x4fv ( (GLuint) program, (GLint)
     * location, (GLsizei) count, (GLboolean) transpose, const (GLfloat *) value
     * )
     * 
     **/
    public void glProgramUniformMatrix3x4fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value,
                                            int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix3x4fv(program,
                location,
                count,
                transpose,
                value,
                offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( (GLuint) program, 
     *                                                (GLint) location, 
     *                                                (GLsizei) count,  
     *                                                (GLboolean) transpose, 
     *                                                const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix3x4fv(int program,
                                                            int location,
                                                            int count,
                                                            boolean transpose,
                                                            float[] value,
                                                            int offset);/*
             glProgramUniformMatrix3x4fv ( (GLuint) program, 
                                           (GLint) location, 
                                           (GLsizei) count,  
                                           (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                            
                                                            
     */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    public void glProgramUniformMatrix3x4fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            java.nio.FloatBuffer value) {   
        checkBuffer(value, count, VALUE);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix3x4fv(program, location, count, transpose,value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix3x4fv(program, location, count, transpose,array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( (GLuint) program, 
     *                                                (GLint) location, 
     *                                                (GLsizei) count,  
     *                                                (GLboolean) transpose, 
     *                                                const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix3x4fv( int program, 
                                                             int location, 
                                                             int count, 
                                                             boolean transpose, 
                                                             java.nio.FloatBuffer value, int offset);/*
              glProgramUniformMatrix3x4fv ( (GLuint) program, 
                                            (GLint) location, 
                                            (GLsizei) count,  
                                            (GLboolean) transpose, 
                                           (GLfloat *) (value + offset) );                                                             
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( (GLuint) program, (GLint) location, (GLsizei) count,  (GLboolean) transpose, const  (GLfloat *) value )

     **/
    public void glProgramUniformMatrix4x3fv(int program,
                                            int location,
                                            int count,
                                            boolean transpose,
                                            float[] value, int offset) {
        checkArray(value, offset, count, VALUE);
        GLES31Pipeline.nGLProgramUniformMatrix4x3fv(program, location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( (GLuint) program, 
     *                                                (GLint) location, 
     *                                                (GLsizei) count,  
     *                                                (GLboolean) transpose, 
     *                                                const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix4x3fv( int program, 
                                                             int location, 
                                                             int count, 
                                                             boolean transpose, 
                                                             float[] value, int offset);/*
       glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );                                                      
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x3fv([ int program, 
     *                                                                     int location, 
     *                                                                     int count, 
     *                                                                     boolean transpose, 
     *                                                                     java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( (GLuint) program, 
     *                                                (GLint) location, 
     *                                                (GLsizei) count,  
     *                                                (GLboolean) transpose, 
     *                                                const  (GLfloat *) value )
     *
     **/
    public void glProgramUniformMatrix4x3fv( int program, 
                                             int location, 
                                             int count, 
                                             boolean transpose, 
                                             java.nio.FloatBuffer value) {
        checkBuffer(value, count, "value");
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES31Pipeline.nGLProgramUniformMatrix4x3fv(program, location, count, transpose,value, offset);
        } else {           
            float[] array = value.array();
            GLES31Pipeline.nGLProgramUniformMatrix4x3fv(program, location, count, transpose,array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( (GLuint) program, 
     *                                                (GLint) location, 
     *                                                (GLsizei) count,  
     *                                                (GLboolean) transpose, 
     *                                                const  (GLfloat *) value )

     **/
    private static native void nGLProgramUniformMatrix4x3fv( int program, 
                                                             int location, 
                                                             int count, 
                                                             boolean transpose, 
                                                             java.nio.FloatBuffer value, int offset);/*
    glProgramUniformMatrix4x3fv( (GLuint) program, 
                                 (GLint) location, 
                                 (GLsizei) count,  
                                 (GLboolean) transpose, 
                                 (GLfloat *) (value + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glValidateProgramPipeline([int pipeline]);
     * 
     *  C function void glValidateProgramPipeline ( (GLuint) pipeline )

     **/
    public void glValidateProgramPipeline(int pipeline) {
        GLES31Pipeline.nGLValidateProgramPipeline(pipeline);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glValidateProgramPipeline([int pipeline]);
     * 
     *  C function void glValidateProgramPipeline ( (GLuint) pipeline )

     **/
    private static native void nGLValidateProgramPipeline(int pipeline);/*
      glValidateProgramPipeline ( (GLuint) pipeline );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetProgramPipelineInfoLog([int program]);
     * 
     *  C function void glGetProgramPipelineInfoLog( (GLuint) program, (GLsizei) maxLength, (GLsizei) * length,  (GLchar *)  infoLog);

     **/
    public String glGetProgramPipelineInfoLog(int program) {
       return GLES31Pipeline.nGLGetProgramPipelineInfoLog(program);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetProgramPipelineInfoLog([int program]);
     * 
     *  C function void glGetProgramPipelineInfoLog( (GLuint) program, 
     *                                               (GLsizei) maxLength, 
     *                                               (GLsizei) * length,  
     *                                               (GLchar *)  infoLog);

     **/
    private static native String nGLGetProgramPipelineInfoLog(int program);/*
    
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
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glBindImageTexture([int unit, int texture, int level, boolean layered, int layer, int access, int format]);
     * 
     *  C function void glBindImageTexture ( (GLuint) unit, (GLuint) texture, (GLint) level,  (GLboolean) layered, (GLint) layer, (GLenum) access, (GLenum) format )

     **/
    public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        GLES31Pipeline.nGLBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glBindImageTexture([int unit, int texture, int level, boolean layered, int layer, int access, int format]);
     * 
     *  C function void glBindImageTexture ( (GLuint) unit, (GLuint) texture, (GLint) level,  (GLboolean) layered, (GLint) layer, (GLenum) access, (GLenum) format )

     **/
    private static native void nGLBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetBooleani_v([int target, int index, boolean[] data, int offset]);
     * 
     *  C function void glGetBooleani_v ( (GLenum) target, (GLuint) index,  (GLboolean) *data )

     **/
    public void glGetBooleani_v(int target, int index, boolean[] data, int offset) {
        GLES31Pipeline.nGLGetBooleani_v(target, index, data, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetBooleani_v([int target, int index, boolean[] data, int offset]);
     * 
     *  C function void glGetBooleani_v ( (GLenum) target, (GLuint) index,  (GLboolean) *data )

     **/
    private static native void nGLGetBooleani_v(int target, int index, boolean[] data, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetBooleani_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetBooleani_v ( (GLenum) target, (GLuint) index,  (GLboolean) *data )

     **/
    public void glGetBooleani_v(int target, int index, java.nio.IntBuffer data) {
        GLES31Pipeline.nGLGetBooleani_v(target, index, data);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetBooleani_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetBooleani_v ( (GLenum) target, (GLuint) index,  (GLboolean) *data )

     **/
    private static native void nGLGetBooleani_v(int target, int index, java.nio.IntBuffer data);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glMemoryBarrier([int barriers]);
     * 
     *  C function void glMemoryBarrier (  (GLbitfield)  barriers )

     **/
    public void glMemoryBarrier(int barriers) {
        GLES31Pipeline.nGLMemoryBarrier(barriers);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glMemoryBarrier([int barriers]);
     * 
     *  C function void glMemoryBarrier (  (GLbitfield)  barriers )

     **/
    private static native void nGLMemoryBarrier(int barriers);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glMemoryBarrierByRegion([int barriers]);
     * 
     *  C function void glMemoryBarrierByRegion (  (GLbitfield)  barriers )

     **/
    public void glMemoryBarrierByRegion(int barriers) {
        GLES31Pipeline.nGLMemoryBarrierByRegion(barriers);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glMemoryBarrierByRegion([int barriers]);
     * 
     *  C function void glMemoryBarrierByRegion (  (GLbitfield)  barriers )

     **/
    private static native void nGLMemoryBarrierByRegion(int barriers);/*
          glMemoryBarrierByRegion (  (GLbitfield)  barriers );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glTexStorage2DMultisample([int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage2DMultisample ( (GLenum) target, 
     *                                              (GLsizei) samples, 
     *                                              (GLenum) internalformat, (GLsizei) width, (GLsizei) height,  (GLboolean) fixedsamplelocations )

     **/
    public void glTexStorage2DMultisample(int target,
                                          int samples,
                                          int internalformat,
                                          int width,
                                          int height,
                                          boolean fixedsamplelocations) {
        GLES31Pipeline.nGLTexStorage2DMultisample(target,
                samples,
                internalformat,
                width,
                height,
                fixedsamplelocations);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glTexStorage2DMultisample([int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage2DMultisample ( (GLenum) target, (GLsizei) samples, (GLenum) internalformat, (GLsizei) width, (GLsizei) height,  (GLboolean) fixedsamplelocations )

     **/
    private static native void nGLTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetMultisamplefv([int pname, int index, float[] val, int offset]);
     * 
     *  C function void glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) val )

     **/
    public void glGetMultisamplefv(int pname, int index, float[] val, int offset) {
        checkArray(val, offset, 2, "val");
        GLES31Pipeline.nGLGetMultisamplefv(pname, index, val, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetMultisamplefv([int pname, int index, float[] val, int offset]);
     * 
     *  C function void glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) val )

     **/
    private static native void nGLGetMultisamplefv(int pname, int index, float[] val, int offset);/*
        glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetMultisamplefv([int pname, int index, java.nio.FloatBuffer val]);
     * 
     *  C function void glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) val )

     **/
    public void glGetMultisamplefv(int pname, int index, java.nio.FloatBuffer val) {
        checkBuffer(val, 2, "val");
        int offset = getOffset(val);
        if(val.isDirect()){
            GLES31Pipeline.nGLGetMultisamplefv(pname, index, val, offset);
        }else{
            float[] array = val.array();
            GLES31Pipeline.nGLGetMultisamplefv(pname, index, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetMultisamplefv([int pname, int index, java.nio.FloatBuffer val]);
     * 
     *  C function void glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) val )

     **/
    private static native void nGLGetMultisamplefv(int pname, int index, java.nio.FloatBuffer val, int offset);/*
            glGetMultisamplefv ( (GLenum) pname, (GLuint) index,  (GLfloat *) (val + offset) );
   */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glSampleMaski([int maskNumber, int mask]);
     * 
     *  C function void glSampleMaski ( (GLuint) maskNumber,  (GLbitfield)  mask )

     **/
    public void glSampleMaski(int maskNumber, int mask) {
        GLES31Pipeline.nGLSampleMaski(maskNumber, mask);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glSampleMaski([int maskNumber, int mask]);
     * 
     *  C function void glSampleMaski ( (GLuint) maskNumber,  (GLbitfield)  mask )

     **/
    private static native void nGLSampleMaski(int maskNumber, int mask);/*
       glSampleMaski ( (GLuint) maskNumber,  (GLbitfield)  mask );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameteriv ( (GLenum) target, (GLint) level, (GLenum) pname, (GLint) *params )

     **/
    public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetTexLevelParameteriv(target, level, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameteriv ( (GLenum) target, (GLint) level, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetTexLevelParameteriv(int target, int level, int pname, int[] params, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexLevelParameteriv ( (GLenum) target, (GLint) level, (GLenum) pname, (GLint) *params )

     **/
    public void glGetTexLevelParameteriv(int target, int level, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetTexLevelParameteriv(target, level, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexLevelParameteriv ( (GLenum) target, (GLint) level, (GLenum) pname, (GLint) *params )

     **/
    private static native void nGLGetTexLevelParameteriv(int target, int level, int pname, java.nio.IntBuffer params);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameterfv ( (GLenum) target, (GLint) level, (GLenum) pname,  (GLfloat *) params )

     **/
    public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params, int offset) {
        GLES31Pipeline.nGLGetTexLevelParameterfv(target, level, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameterfv ( (GLenum) target, (GLint) level, (GLenum) pname,  (GLfloat *) params )

     **/
    private static native void nGLGetTexLevelParameterfv(int target, int level, int pname, float[] params, int offset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexLevelParameterfv ( (GLenum) target, (GLint) level, (GLenum) pname,  (GLfloat *) params )

     **/
    public void glGetTexLevelParameterfv(int target, int level, int pname, java.nio.FloatBuffer params) {
        GLES31Pipeline.nGLGetTexLevelParameterfv(target, level, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexLevelParameterfv ( (GLenum) target, (GLint) level, (GLenum) pname,  (GLfloat *) params )

     **/
    private static native void nGLGetTexLevelParameterfv(int target, int level, int pname, java.nio.FloatBuffer params);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glBindVertexBuffer([int bindingindex, int buffer, long offset, int stride]);
     * 
     *  C function void glBindVertexBuffer ( (GLuint) bindingindex, (GLuint) buffer,  (GLintptr) offset, (GLsizei) stride )

     **/
    public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        GLES31Pipeline.nGLBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glBindVertexBuffer([int bindingindex, int buffer, long offset, int stride]);
     * 
     *  C function void glBindVertexBuffer ( (GLuint) bindingindex, (GLuint) buffer,  (GLintptr) offset, (GLsizei) stride )

     **/
    private static native void nGLBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glVertexAttribFormat([int attribindex, int size, int type, boolean normalized, int relativeoffset]);
     * 
     *  C function void glVertexAttribFormat ( (GLuint) attribindex, (GLint) size, (GLenum) type,  (GLboolean) normalized, (GLuint) relativeoffset )

     **/
    public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        GLES31Pipeline.nGLVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glVertexAttribFormat([int attribindex, int size, int type, boolean normalized, int relativeoffset]);
     * 
     *  C function void glVertexAttribFormat ( (GLuint) attribindex, (GLint) size, (GLenum) type,  (GLboolean) normalized, (GLuint) relativeoffset )

     **/
    private static native void nGLVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

    /**
     * <pre>
     * Delegate Method generated from GLES31.glVertexAttribIFormat([int attribindex, int size, int type, int relativeoffset]);
     * 
     *  C function void glVertexAttribIFormat ( (GLuint) attribindex, (GLint) size, (GLenum) type, (GLuint) relativeoffset )

     **/
    public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        GLES31Pipeline.nGLVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glVertexAttribIFormat([int attribindex, int size, int type, int relativeoffset]);
     * 
     *  C function void glVertexAttribIFormat ( (GLuint) attribindex, (GLint) size, (GLenum) type, (GLuint) relativeoffset )

     **/
    private static native void nGLVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);/*
           glVertexAttribIFormat ( (GLuint) attribindex, (GLint) size, (GLenum) type, (GLuint) relativeoffset )
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glVertexAttribBinding([int attribindex, int bindingindex]);
     * 
     *  C function void glVertexAttribBinding ( (GLuint) attribindex, (GLuint) bindingindex )

     **/
    public void glVertexAttribBinding(int attribindex, int bindingindex) {
        GLES31Pipeline.nGLVertexAttribBinding(attribindex, bindingindex);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glVertexAttribBinding([int attribindex, int bindingindex]);
     * 
     *  C function void glVertexAttribBinding ( (GLuint) attribindex, (GLuint) bindingindex )

     **/
    private static native void nGLVertexAttribBinding(int attribindex, int bindingindex);/*
        glVertexAttribBinding ( (GLuint) attribindex, (GLuint) bindingindex );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES31.glVertexBindingDivisor([int bindingindex, int divisor]);
     * 
     *  C function void glVertexBindingDivisor ( (GLuint) bindingindex, (GLuint) divisor )

     **/
    public void glVertexBindingDivisor(int bindingindex, int divisor) {
        GLES31Pipeline.nGLVertexBindingDivisor(bindingindex, divisor);
    }

    /**
     * <pre>
     * Native method generated from GLES31.glVertexBindingDivisor([int bindingindex, int divisor]);
     * 
     *  C function void glVertexBindingDivisor ( (GLuint) bindingindex, (GLuint) divisor )

     **/
    private static native void nGLVertexBindingDivisor(int bindingindex, int divisor);/*
        glVertexBindingDivisor ( (GLuint) bindingindex, (GLuint) divisor );
    */
}
