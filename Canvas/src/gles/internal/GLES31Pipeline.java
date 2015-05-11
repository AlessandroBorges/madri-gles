/*

**    Place holder for disclaimer.
*/

package gles.internal;

/** OpenGL ES 3.1
 */
public class GLES31Pipeline
	extends GLES30Pipeline
	implements Pipeline {

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
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31._nativeClassInit();
     * 
     *  C function void glDispatchCompute ( GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z )

     * */
    public void GLES31ClassInit() {
        GLES31Pipeline.nGLES31ClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31._nativeClassInit();
     * 
     *  C function void glDispatchCompute ( GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z )

     * */
    private static native void nGLES31ClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDispatchCompute([int num_groups_x, int num_groups_y, int num_groups_z]);
     * 
     *  C function void glDispatchCompute ( GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z )

     * */
    public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        GLES31Pipeline.nGLDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDispatchCompute([int num_groups_x, int num_groups_y, int num_groups_z]);
     * 
     *  C function void glDispatchCompute ( GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z )

     * */
    private static native void nGLDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDispatchComputeIndirect([long indirect]);
     * 
     *  C function void glDispatchComputeIndirect ( GLintptr indirect );

     * */
    public void glDispatchComputeIndirect(long indirect) {
        GLES31Pipeline.nGLDispatchComputeIndirect(indirect);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDispatchComputeIndirect([long indirect]);
     * 
     *  C function void glDispatchComputeIndirect ( GLintptr indirect );

     * */
    private static native void nGLDispatchComputeIndirect(long indirect);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDrawArraysIndirect([int mode, long indirect]);
     * 
     *  C function void glDrawArraysIndirect ( GLenum mode, const void *indirect );

     * */
    public void glDrawArraysIndirect(int mode, long indirect) {
        GLES31Pipeline.nGLDrawArraysIndirect(mode, indirect);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDrawArraysIndirect([int mode, long indirect]);
     * 
     *  C function void glDrawArraysIndirect ( GLenum mode, const void *indirect );

     * */
    private static native void nGLDrawArraysIndirect(int mode, long indirect);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDrawElementsIndirect([int mode, int type, long indirect]);
     * 
     *  C function glDrawElementsIndirect ( GLenum mode, GLenum type, const void *indirect );

     * */
    public void glDrawElementsIndirect(int mode, int type, long indirect) {
        GLES31Pipeline.nGLDrawElementsIndirect(mode, type, indirect);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDrawElementsIndirect([int mode, int type, long indirect]);
     * 
     *  C function glDrawElementsIndirect ( GLenum mode, GLenum type, const void *indirect );

     * */
    private static native void nGLDrawElementsIndirect(int mode, int type, long indirect);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glFramebufferParameteri([int target, int pname, int param]);
     * 
     *  C function void glFramebufferParameteri ( GLenum target, GLenum pname, GLint param )

     * */
    public void glFramebufferParameteri(int target, int pname, int param) {
        GLES31Pipeline.nGLFramebufferParameteri(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glFramebufferParameteri([int target, int pname, int param]);
     * 
     *  C function void glFramebufferParameteri ( GLenum target, GLenum pname, GLint param )

     * */
    private static native void nGLFramebufferParameteri(int target, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetFramebufferParameteriv(int target, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetFramebufferParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetFramebufferParameteriv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetFramebufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetFramebufferParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetFramebufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetFramebufferParameteriv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramInterfaceiv ( GLuint program, GLenum programInterface, GLenum pname, GLint *params )

     * */
    public void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetProgramInterfaceiv(program, programInterface, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramInterfaceiv ( GLuint program, GLenum programInterface, GLenum pname, GLint *params )

     * */
    private static native void nGLGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramInterfaceiv ( GLuint program, GLenum programInterface, GLenum pname, GLint *params )

     * */
    public void glGetProgramInterfaceiv(int program, int programInterface, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramInterfaceiv([int program, int programInterface, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramInterfaceiv ( GLuint program, GLenum programInterface, GLenum pname, GLint *params )

     * */
    private static native void nGLGetProgramInterfaceiv(int program, int programInterface, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramResourceIndex([int program, int programInterface, String name]);
     * 
     *  C function GLuint glGetProgramResourceIndex ( GLuint program, GLenum programInterface, const GLchar *name )

     * */
    public int glGetProgramResourceIndex(int program, int programInterface, String name) {
       return GLES31Pipeline.nGLGetProgramResourceIndex(program, programInterface, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramResourceIndex([int program, int programInterface, String name]);
     * 
     *  C function GLuint glGetProgramResourceIndex ( GLuint program, GLenum programInterface, const GLchar *name )

     * */
    private static native int nGLGetProgramResourceIndex(int program, int programInterface, String name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramResourceName([int program, int programInterface, int index]);
     * 
     *  C function void glGetProgramResourceName ( GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei *length, GLchar *name )

     * */
    public String glGetProgramResourceName(int program, int programInterface, int index) {
        return GLES31Pipeline.nGLGetProgramResourceName(program, programInterface, index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramResourceName([int program, int programInterface, int index]);
     * 
     *  C function void glGetProgramResourceName ( GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei *length, GLchar *name )

     * */
    private static native String nGLGetProgramResourceName(int program, int programInterface, int index);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset]);
     * 
     *  C function void glGetProgramResourceiv ( GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, const GLenum *props, GLsizei bufSize, GLsizei *length, GLint *params )

     * */
    public void glGetProgramResourceiv(int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset) {
        GLES31Pipeline.nGLGetProgramResourceiv(program, programInterface, index, propCount, props, propsOffset, bufSize, length, lengthOffset, params, paramsOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset]);
     * 
     *  C function void glGetProgramResourceiv ( GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, const GLenum *props, GLsizei bufSize, GLsizei *length, GLint *params )

     * */
    private static native void nGLGetProgramResourceiv(int program, int programInterface, int index, int propCount, int[] props, int propsOffset, int bufSize, int[] length, int lengthOffset, int[] params, int paramsOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramResourceiv ( GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, const GLenum *props, GLsizei bufSize, GLsizei *length, GLint *params )

     * */
    public void glGetProgramResourceiv(int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramResourceiv([int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramResourceiv ( GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, const GLenum *props, GLsizei bufSize, GLsizei *length, GLint *params )

     * */
    private static native void nGLGetProgramResourceiv(int program, int programInterface, int index, int propCount, java.nio.IntBuffer props, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramResourceLocation([int program, int programInterface, String name]);
     * 
     *  C function GLint glGetProgramResourceLocation ( GLuint program, GLenum programInterface, const GLchar *name )

     * */
    public int glGetProgramResourceLocation(int program, int programInterface, String name) {
        return GLES31Pipeline.nGLGetProgramResourceLocation(program, programInterface, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramResourceLocation([int program, int programInterface, String name]);
     * 
     *  C function GLint glGetProgramResourceLocation ( GLuint program, GLenum programInterface, const GLchar *name )

     * */
    private static native int nGLGetProgramResourceLocation(int program, int programInterface, String name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glUseProgramStages([int pipeline, int stages, int program]);
     * 
     *  C function void glUseProgramStages ( GLuint pipeline, GLbitfield stages, GLuint program )

     * */
    public void glUseProgramStages(int pipeline, int stages, int program) {
        GLES31Pipeline.nGLUseProgramStages(pipeline, stages, program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glUseProgramStages([int pipeline, int stages, int program]);
     * 
     *  C function void glUseProgramStages ( GLuint pipeline, GLbitfield stages, GLuint program )

     * */
    private static native void nGLUseProgramStages(int pipeline, int stages, int program);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glActiveShaderProgram([int pipeline, int program]);
     * 
     *  C function void glActiveShaderProgram ( GLuint pipeline, GLuint program )

     * */
    public void glActiveShaderProgram(int pipeline, int program) {
        GLES31Pipeline.nGLActiveShaderProgram(pipeline, program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glActiveShaderProgram([int pipeline, int program]);
     * 
     *  C function void glActiveShaderProgram ( GLuint pipeline, GLuint program )

     * */
    private static native void nGLActiveShaderProgram(int pipeline, int program);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glCreateShaderProgramv([int type, String[] strings]);
     * 
     *  C function GLuint glCreateShaderProgramv ( GLenum type, GLsizei count, const GLchar *const *strings )

     * */
    public int glCreateShaderProgramv(int type, String[] strings) {
        return GLES31Pipeline.nGLCreateShaderProgramv(type, strings);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glCreateShaderProgramv([int type, String[] strings]);
     * 
     *  C function GLuint glCreateShaderProgramv ( GLenum type, GLsizei count, const GLchar *const *strings )

     * */
    private static native int nGLCreateShaderProgramv(int type, String[] strings);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glBindProgramPipeline([int pipeline]);
     * 
     *  C function void glBindProgramPipeline ( GLuint pipeline )

     * */
    public void glBindProgramPipeline(int pipeline) {
        GLES31Pipeline.nGLBindProgramPipeline(pipeline);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glBindProgramPipeline([int pipeline]);
     * 
     *  C function void glBindProgramPipeline ( GLuint pipeline )

     * */
    private static native void nGLBindProgramPipeline(int pipeline);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDeleteProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glDeleteProgramPipelines ( GLsizei n, const GLuint *pipelines )

     * */
    public void glDeleteProgramPipelines(int n, int[] pipelines, int offset) {
        GLES31Pipeline.nGLDeleteProgramPipelines(n, pipelines, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDeleteProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glDeleteProgramPipelines ( GLsizei n, const GLuint *pipelines )

     * */
    private static native void nGLDeleteProgramPipelines(int n, int[] pipelines, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glDeleteProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glDeleteProgramPipelines ( GLsizei n, const GLuint *pipelines )

     * */
    public void glDeleteProgramPipelines(int n, java.nio.IntBuffer pipelines) {
        GLES31Pipeline.nGLDeleteProgramPipelines(n, pipelines);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glDeleteProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glDeleteProgramPipelines ( GLsizei n, const GLuint *pipelines )

     * */
    private static native void nGLDeleteProgramPipelines(int n, java.nio.IntBuffer pipelines);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGenProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glGenProgramPipelines ( GLsizei n, GLuint *pipelines )

     * */
    public void glGenProgramPipelines(int n, int[] pipelines, int offset) {
        GLES31Pipeline.nGLGenProgramPipelines(n, pipelines, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGenProgramPipelines([int n, int[] pipelines, int offset]);
     * 
     *  C function void glGenProgramPipelines ( GLsizei n, GLuint *pipelines )

     * */
    private static native void nGLGenProgramPipelines(int n, int[] pipelines, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGenProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glGenProgramPipelines ( GLsizei n, GLuint *pipelines )

     * */
    public void glGenProgramPipelines(int n, java.nio.IntBuffer pipelines) {
        GLES31Pipeline.nGLGenProgramPipelines(n, pipelines);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGenProgramPipelines([int n, java.nio.IntBuffer pipelines]);
     * 
     *  C function void glGenProgramPipelines ( GLsizei n, GLuint *pipelines )

     * */
    private static native void nGLGenProgramPipelines(int n, java.nio.IntBuffer pipelines);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glIsProgramPipeline([int pipeline]);
     * 
     *  C function GLboolean glIsProgramPipeline ( GLuint pipeline )

     * */
    public boolean glIsProgramPipeline(int pipeline) {
        return GLES31Pipeline.nGLIsProgramPipeline(pipeline);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glIsProgramPipeline([int pipeline]);
     * 
     *  C function GLboolean glIsProgramPipeline ( GLuint pipeline )

     * */
    private static native boolean nGLIsProgramPipeline(int pipeline);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramPipelineiv ( GLuint pipeline, GLenum pname, GLint *params )

     * */
    public void glGetProgramPipelineiv(int pipeline, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetProgramPipelineiv(pipeline, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramPipelineiv ( GLuint pipeline, GLenum pname, GLint *params )

     * */
    private static native void nGLGetProgramPipelineiv(int pipeline, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramPipelineiv ( GLuint pipeline, GLenum pname, GLint *params )

     * */
    public void glGetProgramPipelineiv(int pipeline, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetProgramPipelineiv(pipeline, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramPipelineiv([int pipeline, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramPipelineiv ( GLuint pipeline, GLenum pname, GLint *params )

     * */
    private static native void nGLGetProgramPipelineiv(int pipeline, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1i([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1i ( GLuint program, GLint location, GLint v0 )

     * */
    public void glProgramUniform1i(int program, int location, int v0) {
        GLES31Pipeline.nGLProgramUniform1i(program, location, v0);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1i([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1i ( GLuint program, GLint location, GLint v0 )

     * */
    private static native void nGLProgramUniform1i(int program, int location, int v0);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2i([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2i ( GLuint program, GLint location, GLint v0, GLint v1 )

     * */
    public void glProgramUniform2i(int program, int location, int v0, int v1) {
        GLES31Pipeline.nGLProgramUniform2i(program, location, v0, v1);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2i([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2i ( GLuint program, GLint location, GLint v0, GLint v1 )

     * */
    private static native void nGLProgramUniform2i(int program, int location, int v0, int v1);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3i([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3i ( GLuint program, GLint location, GLint v0, GLint v1, GLint v2 )

     * */
    public void glProgramUniform3i(int program, int location, int v0, int v1, int v2) {
        GLES31Pipeline.nGLProgramUniform3i(program, location, v0, v1, v2);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3i([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3i ( GLuint program, GLint location, GLint v0, GLint v1, GLint v2 )

     * */
    private static native void nGLProgramUniform3i(int program, int location, int v0, int v1, int v2);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4i([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4i ( GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3 )

     * */
    public void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        GLES31Pipeline.nGLProgramUniform4i(program, location, v0, v1, v2, v3);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4i([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4i ( GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3 )

     * */
    private static native void nGLProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1ui([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1ui ( GLuint program, GLint location, GLuint v0 )

     * */
    public void glProgramUniform1ui(int program, int location, int v0) {
        GLES31Pipeline.nGLProgramUniform1ui(program, location, v0);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1ui([int program, int location, int v0]);
     * 
     *  C function void glProgramUniform1ui ( GLuint program, GLint location, GLuint v0 )

     * */
    private static native void nGLProgramUniform1ui(int program, int location, int v0);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2ui([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2ui ( GLuint program, GLint location, GLuint v0, GLuint v1 )

     * */
    public void glProgramUniform2ui(int program, int location, int v0, int v1) {
        GLES31Pipeline.nGLProgramUniform2ui(program, location, v0, v1);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2ui([int program, int location, int v0, int v1]);
     * 
     *  C function void glProgramUniform2ui ( GLuint program, GLint location, GLuint v0, GLuint v1 )

     * */
    private static native void nGLProgramUniform2ui(int program, int location, int v0, int v1);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3ui([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3ui ( GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2 )

     * */
    public void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
        GLES31Pipeline.nGLProgramUniform3ui(program, location, v0, v1, v2);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3ui([int program, int location, int v0, int v1, int v2]);
     * 
     *  C function void glProgramUniform3ui ( GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2 )

     * */
    private static native void nGLProgramUniform3ui(int program, int location, int v0, int v1, int v2);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4ui([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4ui ( GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3 )

     * */
    public void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        GLES31Pipeline.nGLProgramUniform4ui(program, location, v0, v1, v2, v3);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4ui([int program, int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glProgramUniform4ui ( GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3 )

     * */
    private static native void nGLProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1f([int program, int location, float v0]);
     * 
     *  C function void glProgramUniform1f ( GLuint program, GLint location, GLfloat v0 )

     * */
    public void glProgramUniform1f(int program, int location, float v0) {
        GLES31Pipeline.nGLProgramUniform1f(program, location, v0);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1f([int program, int location, float v0]);
     * 
     *  C function void glProgramUniform1f ( GLuint program, GLint location, GLfloat v0 )

     * */
    private static native void nGLProgramUniform1f(int program, int location, float v0);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2f([int program, int location, float v0, float v1]);
     * 
     *  C function void glProgramUniform2f ( GLuint program, GLint location, GLfloat v0, GLfloat v1 )

     * */
    public void glProgramUniform2f(int program, int location, float v0, float v1) {
        GLES31Pipeline.nGLProgramUniform2f(program, location, v0, v1);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2f([int program, int location, float v0, float v1]);
     * 
     *  C function void glProgramUniform2f ( GLuint program, GLint location, GLfloat v0, GLfloat v1 )

     * */
    private static native void nGLProgramUniform2f(int program, int location, float v0, float v1);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3f([int program, int location, float v0, float v1, float v2]);
     * 
     *  C function void glProgramUniform3f ( GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2 )

     * */
    public void glProgramUniform3f(int program, int location, float v0, float v1, float v2) {
        GLES31Pipeline.nGLProgramUniform3f(program, location, v0, v1, v2);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3f([int program, int location, float v0, float v1, float v2]);
     * 
     *  C function void glProgramUniform3f ( GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2 )

     * */
    private static native void nGLProgramUniform3f(int program, int location, float v0, float v1, float v2);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4f([int program, int location, float v0, float v1, float v2, float v3]);
     * 
     *  C function void glProgramUniform4f ( GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3 )

     * */
    public void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        GLES31Pipeline.nGLProgramUniform4f(program, location, v0, v1, v2, v3);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4f([int program, int location, float v0, float v1, float v2, float v3]);
     * 
     *  C function void glProgramUniform4f ( GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3 )

     * */
    private static native void nGLProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform1iv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform1iv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform1iv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform1iv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform1iv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform1iv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform2iv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform2iv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform2iv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform2iv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform2iv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform2iv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform3iv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform3iv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform3iv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform3iv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform3iv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform3iv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform4iv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform4iv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4iv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform4iv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    public void glProgramUniform4iv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform4iv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4iv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4iv ( GLuint program, GLint location, GLsizei count, const GLint *value )

     * */
    private static native void nGLProgramUniform4iv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform1uiv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform1uiv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform1uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform1uiv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform1uiv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform1uiv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform1uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform1uiv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform2uiv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform2uiv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform2uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform2uiv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform2uiv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform2uiv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform2uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform2uiv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform3uiv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform3uiv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform3uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform3uiv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform3uiv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform3uiv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform3uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform3uiv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform4uiv(int program, int location, int count, int[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform4uiv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, int[] value, int offset]);
     * 
     *  C function void glProgramUniform4uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform4uiv(int program, int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    public void glProgramUniform4uiv(int program, int location, int count, java.nio.IntBuffer value) {
        GLES31Pipeline.nGLProgramUniform4uiv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4uiv([int program, int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glProgramUniform4uiv ( GLuint program, GLint location, GLsizei count, const GLuint *value )

     * */
    private static native void nGLProgramUniform4uiv(int program, int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform1fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform1fv(int program, int location, int count, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform1fv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform1fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform1fv(int program, int location, int count, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform1fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform1fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform1fv(int program, int location, int count, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniform1fv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform1fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform1fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform1fv(int program, int location, int count, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform2fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform2fv(int program, int location, int count, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform2fv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform2fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform2fv(int program, int location, int count, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform2fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform2fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform2fv(int program, int location, int count, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniform2fv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform2fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform2fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform2fv(int program, int location, int count, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform3fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform3fv(int program, int location, int count, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform3fv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform3fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform3fv(int program, int location, int count, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform3fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform3fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform3fv(int program, int location, int count, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniform3fv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform3fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform3fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform3fv(int program, int location, int count, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform4fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform4fv(int program, int location, int count, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniform4fv(program, location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4fv([int program, int location, int count, float[] value, int offset]);
     * 
     *  C function void glProgramUniform4fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform4fv(int program, int location, int count, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniform4fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform4fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    public void glProgramUniform4fv(int program, int location, int count, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniform4fv(program, location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniform4fv([int program, int location, int count, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniform4fv ( GLuint program, GLint location, GLsizei count, const GLfloat *value )

     * */
    private static native void nGLProgramUniform4fv(int program, int location, int count, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix2fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix3fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix4fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix2x3fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix3x2fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3x2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix2x4fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix2x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix2x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix2x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix4x2fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4x2fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x2fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix3x4fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix3x4fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix3x4fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, float[] value, int offset) {
        GLES31Pipeline.nGLProgramUniformMatrix4x3fv(program, location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public void glProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        GLES31Pipeline.nGLProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glProgramUniformMatrix4x3fv([int program, int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glProgramUniformMatrix4x3fv ( GLuint program, GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    private static native void nGLProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glValidateProgramPipeline([int pipeline]);
     * 
     *  C function void glValidateProgramPipeline ( GLuint pipeline )

     * */
    public void glValidateProgramPipeline(int pipeline) {
        GLES31Pipeline.nGLValidateProgramPipeline(pipeline);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glValidateProgramPipeline([int pipeline]);
     * 
     *  C function void glValidateProgramPipeline ( GLuint pipeline )

     * */
    private static native void nGLValidateProgramPipeline(int pipeline);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetProgramPipelineInfoLog([int program]);
     * 
     *  C function void glGetProgramPipelineInfoLog( GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog);

     * */
    public String glGetProgramPipelineInfoLog(int program) {
       return GLES31Pipeline.nGLGetProgramPipelineInfoLog(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetProgramPipelineInfoLog([int program]);
     * 
     *  C function void glGetProgramPipelineInfoLog( GLuint program, GLsizei maxLength, GLsizei * length, GLchar * infoLog);

     * */
    private static native String nGLGetProgramPipelineInfoLog(int program);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glBindImageTexture([int unit, int texture, int level, boolean layered, int layer, int access, int format]);
     * 
     *  C function void glBindImageTexture ( GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format )

     * */
    public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        GLES31Pipeline.nGLBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glBindImageTexture([int unit, int texture, int level, boolean layered, int layer, int access, int format]);
     * 
     *  C function void glBindImageTexture ( GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format )

     * */
    private static native void nGLBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetBooleani_v([int target, int index, boolean[] data, int offset]);
     * 
     *  C function void glGetBooleani_v ( GLenum target, GLuint index, GLboolean *data )

     * */
    public void glGetBooleani_v(int target, int index, boolean[] data, int offset) {
        GLES31Pipeline.nGLGetBooleani_v(target, index, data, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetBooleani_v([int target, int index, boolean[] data, int offset]);
     * 
     *  C function void glGetBooleani_v ( GLenum target, GLuint index, GLboolean *data )

     * */
    private static native void nGLGetBooleani_v(int target, int index, boolean[] data, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetBooleani_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetBooleani_v ( GLenum target, GLuint index, GLboolean *data )

     * */
    public void glGetBooleani_v(int target, int index, java.nio.IntBuffer data) {
        GLES31Pipeline.nGLGetBooleani_v(target, index, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetBooleani_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetBooleani_v ( GLenum target, GLuint index, GLboolean *data )

     * */
    private static native void nGLGetBooleani_v(int target, int index, java.nio.IntBuffer data);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glMemoryBarrier([int barriers]);
     * 
     *  C function void glMemoryBarrier ( GLbitfield barriers )

     * */
    public void glMemoryBarrier(int barriers) {
        GLES31Pipeline.nGLMemoryBarrier(barriers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glMemoryBarrier([int barriers]);
     * 
     *  C function void glMemoryBarrier ( GLbitfield barriers )

     * */
    private static native void nGLMemoryBarrier(int barriers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glMemoryBarrierByRegion([int barriers]);
     * 
     *  C function void glMemoryBarrierByRegion ( GLbitfield barriers )

     * */
    public void glMemoryBarrierByRegion(int barriers) {
        GLES31Pipeline.nGLMemoryBarrierByRegion(barriers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glMemoryBarrierByRegion([int barriers]);
     * 
     *  C function void glMemoryBarrierByRegion ( GLbitfield barriers )

     * */
    private static native void nGLMemoryBarrierByRegion(int barriers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glTexStorage2DMultisample([int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage2DMultisample ( GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations )

     * */
    public void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        GLES31Pipeline.nGLTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glTexStorage2DMultisample([int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage2DMultisample ( GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations )

     * */
    private static native void nGLTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetMultisamplefv([int pname, int index, float[] val, int offset]);
     * 
     *  C function void glGetMultisamplefv ( GLenum pname, GLuint index, GLfloat *val )

     * */
    public void glGetMultisamplefv(int pname, int index, float[] val, int offset) {
        GLES31Pipeline.nGLGetMultisamplefv(pname, index, val, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetMultisamplefv([int pname, int index, float[] val, int offset]);
     * 
     *  C function void glGetMultisamplefv ( GLenum pname, GLuint index, GLfloat *val )

     * */
    private static native void nGLGetMultisamplefv(int pname, int index, float[] val, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetMultisamplefv([int pname, int index, java.nio.FloatBuffer val]);
     * 
     *  C function void glGetMultisamplefv ( GLenum pname, GLuint index, GLfloat *val )

     * */
    public void glGetMultisamplefv(int pname, int index, java.nio.FloatBuffer val) {
        GLES31Pipeline.nGLGetMultisamplefv(pname, index, val);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetMultisamplefv([int pname, int index, java.nio.FloatBuffer val]);
     * 
     *  C function void glGetMultisamplefv ( GLenum pname, GLuint index, GLfloat *val )

     * */
    private static native void nGLGetMultisamplefv(int pname, int index, java.nio.FloatBuffer val);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glSampleMaski([int maskNumber, int mask]);
     * 
     *  C function void glSampleMaski ( GLuint maskNumber, GLbitfield mask )

     * */
    public void glSampleMaski(int maskNumber, int mask) {
        GLES31Pipeline.nGLSampleMaski(maskNumber, mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glSampleMaski([int maskNumber, int mask]);
     * 
     *  C function void glSampleMaski ( GLuint maskNumber, GLbitfield mask )

     * */
    private static native void nGLSampleMaski(int maskNumber, int mask);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameteriv ( GLenum target, GLint level, GLenum pname, GLint *params )

     * */
    public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params, int offset) {
        GLES31Pipeline.nGLGetTexLevelParameteriv(target, level, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameteriv ( GLenum target, GLint level, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexLevelParameteriv(int target, int level, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexLevelParameteriv ( GLenum target, GLint level, GLenum pname, GLint *params )

     * */
    public void glGetTexLevelParameteriv(int target, int level, int pname, java.nio.IntBuffer params) {
        GLES31Pipeline.nGLGetTexLevelParameteriv(target, level, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetTexLevelParameteriv([int target, int level, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexLevelParameteriv ( GLenum target, GLint level, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexLevelParameteriv(int target, int level, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameterfv ( GLenum target, GLint level, GLenum pname, GLfloat *params )

     * */
    public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params, int offset) {
        GLES31Pipeline.nGLGetTexLevelParameterfv(target, level, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexLevelParameterfv ( GLenum target, GLint level, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexLevelParameterfv(int target, int level, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexLevelParameterfv ( GLenum target, GLint level, GLenum pname, GLfloat *params )

     * */
    public void glGetTexLevelParameterfv(int target, int level, int pname, java.nio.FloatBuffer params) {
        GLES31Pipeline.nGLGetTexLevelParameterfv(target, level, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glGetTexLevelParameterfv([int target, int level, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexLevelParameterfv ( GLenum target, GLint level, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexLevelParameterfv(int target, int level, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glBindVertexBuffer([int bindingindex, int buffer, long offset, int stride]);
     * 
     *  C function void glBindVertexBuffer ( GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride )

     * */
    public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        GLES31Pipeline.nGLBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glBindVertexBuffer([int bindingindex, int buffer, long offset, int stride]);
     * 
     *  C function void glBindVertexBuffer ( GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride )

     * */
    private static native void nGLBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glVertexAttribFormat([int attribindex, int size, int type, boolean normalized, int relativeoffset]);
     * 
     *  C function void glVertexAttribFormat ( GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset )

     * */
    public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        GLES31Pipeline.nGLVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glVertexAttribFormat([int attribindex, int size, int type, boolean normalized, int relativeoffset]);
     * 
     *  C function void glVertexAttribFormat ( GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset )

     * */
    private static native void nGLVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glVertexAttribIFormat([int attribindex, int size, int type, int relativeoffset]);
     * 
     *  C function void glVertexAttribIFormat ( GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset )

     * */
    public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        GLES31Pipeline.nGLVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glVertexAttribIFormat([int attribindex, int size, int type, int relativeoffset]);
     * 
     *  C function void glVertexAttribIFormat ( GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset )

     * */
    private static native void nGLVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glVertexAttribBinding([int attribindex, int bindingindex]);
     * 
     *  C function void glVertexAttribBinding ( GLuint attribindex, GLuint bindingindex )

     * */
    public void glVertexAttribBinding(int attribindex, int bindingindex) {
        GLES31Pipeline.nGLVertexAttribBinding(attribindex, bindingindex);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glVertexAttribBinding([int attribindex, int bindingindex]);
     * 
     *  C function void glVertexAttribBinding ( GLuint attribindex, GLuint bindingindex )

     * */
    private static native void nGLVertexAttribBinding(int attribindex, int bindingindex);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31.glVertexBindingDivisor([int bindingindex, int divisor]);
     * 
     *  C function void glVertexBindingDivisor ( GLuint bindingindex, GLuint divisor )

     * */
    public void glVertexBindingDivisor(int bindingindex, int divisor) {
        GLES31Pipeline.nGLVertexBindingDivisor(bindingindex, divisor);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31.glVertexBindingDivisor([int bindingindex, int divisor]);
     * 
     *  C function void glVertexBindingDivisor ( GLuint bindingindex, GLuint divisor )

     * */
    private static native void nGLVertexBindingDivisor(int bindingindex, int divisor);
}