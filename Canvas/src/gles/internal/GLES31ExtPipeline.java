/*

**    Place holder for disclaimer.
*/

package gles.internal;

import android.opengl.GLES31Ext.DebugProcKHR;

public class GLES31ExtPipeline implements Pipeline{
	
	

	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	private GLES31ExtPipeline(){}

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
			instance = new GLES31ExtPipeline();
		}        
        return instance;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext._nativeClassInit();
     * 
     *  C function void glBlendBarrierKHR ( void )

     * */
    public void GLES31ExtClassInit() {
        GLES31ExtPipeline.nGLES31ExtClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext._nativeClassInit();
     * 
     *  C function void glBlendBarrierKHR ( void )

     * */
    private static native void nGLES31ExtClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glBlendBarrierKHR();
     * 
     *  C function void glBlendBarrierKHR ( void )

     * */
    public void glBlendBarrierKHR() {
        GLES31ExtPipeline.nGLBlendBarrierKHR();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glBlendBarrierKHR();
     * 
     *  C function void glBlendBarrierKHR ( void )

     * */
    private static native void nGLBlendBarrierKHR();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glDebugMessageControlKHR([int source, int type, int severity, int count, int[] ids, int offset, boolean enabled]);
     * 
     *  C function void glDebugMessageControlKHR ( GLenum source, GLenum type, GLenum severity, GLsizei count, const GLuint *ids, GLboolean enabled )

     * */
    public void glDebugMessageControlKHR(int source, int type, int severity, int count, int[] ids, int offset, boolean enabled) {
        GLES31ExtPipeline.nGLDebugMessageControlKHR(source, type, severity, count, ids, offset, enabled);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glDebugMessageControlKHR([int source, int type, int severity, int count, int[] ids, int offset, boolean enabled]);
     * 
     *  C function void glDebugMessageControlKHR ( GLenum source, GLenum type, GLenum severity, GLsizei count, const GLuint *ids, GLboolean enabled )

     * */
    private static native void nGLDebugMessageControlKHR(int source, int type, int severity, int count, int[] ids, int offset, boolean enabled);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glDebugMessageControlKHR([int source, int type, int severity, int count, java.nio.IntBuffer ids, boolean enabled]);
     * 
     *  C function void glDebugMessageControlKHR ( GLenum source, GLenum type, GLenum severity, GLsizei count, const GLuint *ids, GLboolean enabled )

     * */
    public void glDebugMessageControlKHR(int source, int type, int severity, int count, java.nio.IntBuffer ids, boolean enabled) {
        GLES31ExtPipeline.nGLDebugMessageControlKHR(source, type, severity, count, ids, enabled);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glDebugMessageControlKHR([int source, int type, int severity, int count, java.nio.IntBuffer ids, boolean enabled]);
     * 
     *  C function void glDebugMessageControlKHR ( GLenum source, GLenum type, GLenum severity, GLsizei count, const GLuint *ids, GLboolean enabled )

     * */
    private static native void nGLDebugMessageControlKHR(int source, int type, int severity, int count, java.nio.IntBuffer ids, boolean enabled);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glDebugMessageInsertKHR([int source, int type, int id, int severity, String buf]);
     * 
     *  C function void glDebugMessageInsertKHR ( GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, const GLchar *buf )

     * */
    public void glDebugMessageInsertKHR(int source, int type, int id, int severity, String buf) {
        GLES31ExtPipeline.nGLDebugMessageInsertKHR(source, type, id, severity, buf);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glDebugMessageInsertKHR([int source, int type, int id, int severity, String buf]);
     * 
     *  C function void glDebugMessageInsertKHR ( GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, const GLchar *buf )

     * */
    private static native void nGLDebugMessageInsertKHR(int source, int type, int id, int severity, String buf);

    
 // C function void glDebugMessageCallbackKHR ( GLDEBUGPROCKHR callback, const void *userParam )

   
     
    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glDebugMessageCallbackKHR([DebugProcKHR callback]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    public void glDebugMessageCallbackKHR(DebugProcKHR callback) {
        GLES31ExtPipeline.nGLDebugMessageCallbackKHR(callback);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glDebugMessageCallbackKHR([DebugProcKHR callback]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    private static native void nGLDebugMessageCallbackKHR(DebugProcKHR callback);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, int bufSize, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset, int[] lengths, int lengthsOffset, byte[] messageLog, int messageLogOffset]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    public int glGetDebugMessageLogKHR(int count, int bufSize, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset, int[] lengths, int lengthsOffset, byte[] messageLog, int messageLogOffset) {
       return GLES31ExtPipeline.nGLGetDebugMessageLogKHR(count, bufSize, sources, sourcesOffset, types, typesOffset, ids, idsOffset, severities, severitiesOffset, lengths, lengthsOffset, messageLog, messageLogOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, int bufSize, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset, int[] lengths, int lengthsOffset, byte[] messageLog, int messageLogOffset]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    private static native int nGLGetDebugMessageLogKHR(int count, int bufSize, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset, int[] lengths, int lengthsOffset, byte[] messageLog, int messageLogOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.nio.ByteBuffer messageLog]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    public int glGetDebugMessageLogKHR(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.nio.ByteBuffer messageLog) {
       return GLES31ExtPipeline.nGLGetDebugMessageLogKHR(count, sources, types, ids, severities, lengths, messageLog);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.nio.ByteBuffer messageLog]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    private static native int nGLGetDebugMessageLogKHR(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.nio.ByteBuffer messageLog);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    public String[] glGetDebugMessageLogKHR(int count, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset) {
       return GLES31ExtPipeline.nGLGetDebugMessageLogKHR(count, sources, sourcesOffset, types, typesOffset, ids, idsOffset, severities, severitiesOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    private static native String[] nGLGetDebugMessageLogKHR(int count, int[] sources, int sourcesOffset, int[] types, int typesOffset, int[] ids, int idsOffset, int[] severities, int severitiesOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    public String[] glGetDebugMessageLogKHR(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities) {
       return  GLES31ExtPipeline.nGLGetDebugMessageLogKHR(count, sources, types, ids, severities);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetDebugMessageLogKHR([int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities]);
     * 
     *  C function GLuint glGetDebugMessageLogKHR ( GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog )

     * */
    private static native String[] nGLGetDebugMessageLogKHR(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glPushDebugGroupKHR([int source, int id, int length, String message]);
     * 
     *  C function void glPushDebugGroupKHR ( GLenum source, GLuint id, GLsizei length, const GLchar *message )

     * */
    public void glPushDebugGroupKHR(int source, int id, int length, String message) {
        GLES31ExtPipeline.nGLPushDebugGroupKHR(source, id, length, message);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glPushDebugGroupKHR([int source, int id, int length, String message]);
     * 
     *  C function void glPushDebugGroupKHR ( GLenum source, GLuint id, GLsizei length, const GLchar *message )

     * */
    private static native void nGLPushDebugGroupKHR(int source, int id, int length, String message);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glPopDebugGroupKHR();
     * 
     *  C function void glPopDebugGroupKHR ( void )

     * */
    public void glPopDebugGroupKHR() {
        GLES31ExtPipeline.nGLPopDebugGroupKHR();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glPopDebugGroupKHR();
     * 
     *  C function void glPopDebugGroupKHR ( void )

     * */
    private static native void nGLPopDebugGroupKHR();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glObjectLabelKHR([int identifier, int name, int length, String label]);
     * 
     *  C function void glObjectLabelKHR ( GLenum identifier, GLuint name, GLsizei length, const GLchar *label )

     * */
    public void glObjectLabelKHR(int identifier, int name, int length, String label) {
        GLES31ExtPipeline.nGLObjectLabelKHR(identifier, name, length, label);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glObjectLabelKHR([int identifier, int name, int length, String label]);
     * 
     *  C function void glObjectLabelKHR ( GLenum identifier, GLuint name, GLsizei length, const GLchar *label )

     * */
    private static native void nGLObjectLabelKHR(int identifier, int name, int length, String label);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetObjectLabelKHR([int identifier, int name]);
     * 
     *  C function void glGetObjectLabelKHR ( GLenum identifier, GLuint name, GLsizei bufSize, GLsizei *length, GLchar *label )

     * */
    public String glGetObjectLabelKHR(int identifier, int name) {
       return GLES31ExtPipeline.nGLGetObjectLabelKHR(identifier, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetObjectLabelKHR([int identifier, int name]);
     * 
     *  C function void glGetObjectLabelKHR ( GLenum identifier, GLuint name, GLsizei bufSize, GLsizei *length, GLchar *label )

     * */
    private static native String nGLGetObjectLabelKHR(int identifier, int name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glObjectPtrLabelKHR([long ptr, String label]);
     * 
     *  C function void glObjectPtrLabelKHR ( const void *ptr, GLsizei length, const GLchar *label )

     * */
    public void glObjectPtrLabelKHR(long ptr, String label) {
        GLES31ExtPipeline.nGLObjectPtrLabelKHR(ptr, label);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glObjectPtrLabelKHR([long ptr, String label]);
     * 
     *  C function void glObjectPtrLabelKHR ( const void *ptr, GLsizei length, const GLchar *label )

     * */
    private static native void nGLObjectPtrLabelKHR(long ptr, String label);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetObjectPtrLabelKHR([long ptr]);
     * 
     *  C function void glGetObjectPtrLabelKHR ( const void *ptr, GLsizei bufSize, GLsizei *length, GLchar *label )

     * */
    public String glGetObjectPtrLabelKHR(long ptr) {
      return  GLES31ExtPipeline.nGLGetObjectPtrLabelKHR(ptr);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetObjectPtrLabelKHR([long ptr]);
     * 
     *  C function void glGetObjectPtrLabelKHR ( const void *ptr, GLsizei bufSize, GLsizei *length, GLchar *label )

     * */
    private static native String nGLGetObjectPtrLabelKHR(long ptr);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetDebugMessageCallbackKHR();
     * 
     *  C function void glGetPointervKHR ( GLenum pname, void **params )

     * */
    public DebugProcKHR glGetDebugMessageCallbackKHR() {
       return GLES31ExtPipeline.nGLGetDebugMessageCallbackKHR();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetDebugMessageCallbackKHR();
     * 
     *  C function void glGetPointervKHR ( GLenum pname, void **params )

     * */
    private static native DebugProcKHR nGLGetDebugMessageCallbackKHR();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glMinSampleShadingOES([float value]);
     * 
     *  C function void glMinSampleShadingOES ( GLfloat value )

     * */
    public void glMinSampleShadingOES(float value) {
        GLES31ExtPipeline.nGLMinSampleShadingOES(value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glMinSampleShadingOES([float value]);
     * 
     *  C function void glMinSampleShadingOES ( GLfloat value )

     * */
    private static native void nGLMinSampleShadingOES(float value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexStorage3DMultisampleOES([int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage3DMultisampleOES ( GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations )

     * */
    public void glTexStorage3DMultisampleOES(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        GLES31ExtPipeline.nGLTexStorage3DMultisampleOES(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexStorage3DMultisampleOES([int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations]);
     * 
     *  C function void glTexStorage3DMultisampleOES ( GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations )

     * */
    private static native void nGLTexStorage3DMultisampleOES(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glCopyImageSubDataEXT([int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth]);
     * 
     *  C function void glCopyImageSubDataEXT ( GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth )

     * */
    public void glCopyImageSubDataEXT(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        GLES31ExtPipeline.nGLCopyImageSubDataEXT(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glCopyImageSubDataEXT([int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth]);
     * 
     *  C function void glCopyImageSubDataEXT ( GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth )

     * */
    private static native void nGLCopyImageSubDataEXT(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glEnableiEXT([int target, int index]);
     * 
     *  C function void glEnableiEXT ( GLenum target, GLuint index )

     * */
    public void glEnableiEXT(int target, int index) {
        GLES31ExtPipeline.nGLEnableiEXT(target, index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glEnableiEXT([int target, int index]);
     * 
     *  C function void glEnableiEXT ( GLenum target, GLuint index )

     * */
    private static native void nGLEnableiEXT(int target, int index);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glDisableiEXT([int target, int index]);
     * 
     *  C function void glDisableiEXT ( GLenum target, GLuint index )

     * */
    public void glDisableiEXT(int target, int index) {
        GLES31ExtPipeline.nGLDisableiEXT(target, index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glDisableiEXT([int target, int index]);
     * 
     *  C function void glDisableiEXT ( GLenum target, GLuint index )

     * */
    private static native void nGLDisableiEXT(int target, int index);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glBlendEquationiEXT([int buf, int mode]);
     * 
     *  C function void glBlendEquationiEXT ( GLuint buf, GLenum mode )

     * */
    public void glBlendEquationiEXT(int buf, int mode) {
        GLES31ExtPipeline.nGLBlendEquationiEXT(buf, mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glBlendEquationiEXT([int buf, int mode]);
     * 
     *  C function void glBlendEquationiEXT ( GLuint buf, GLenum mode )

     * */
    private static native void nGLBlendEquationiEXT(int buf, int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glBlendEquationSeparateiEXT([int buf, int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparateiEXT ( GLuint buf, GLenum modeRGB, GLenum modeAlpha )

     * */
    public void glBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha) {
        GLES31ExtPipeline.nGLBlendEquationSeparateiEXT(buf, modeRGB, modeAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glBlendEquationSeparateiEXT([int buf, int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparateiEXT ( GLuint buf, GLenum modeRGB, GLenum modeAlpha )

     * */
    private static native void nGLBlendEquationSeparateiEXT(int buf, int modeRGB, int modeAlpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glBlendFunciEXT([int buf, int src, int dst]);
     * 
     *  C function void glBlendFunciEXT ( GLuint buf, GLenum src, GLenum dst )

     * */
    public void glBlendFunciEXT(int buf, int src, int dst) {
        GLES31ExtPipeline.nGLBlendFunciEXT(buf, src, dst);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glBlendFunciEXT([int buf, int src, int dst]);
     * 
     *  C function void glBlendFunciEXT ( GLuint buf, GLenum src, GLenum dst )

     * */
    private static native void nGLBlendFunciEXT(int buf, int src, int dst);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glBlendFuncSeparateiEXT([int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparateiEXT ( GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha )

     * */
    public void glBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        GLES31ExtPipeline.nGLBlendFuncSeparateiEXT(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glBlendFuncSeparateiEXT([int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparateiEXT ( GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha )

     * */
    private static native void nGLBlendFuncSeparateiEXT(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glColorMaskiEXT([int index, boolean r, boolean g, boolean b, boolean a]);
     * 
     *  C function void glColorMaskiEXT ( GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a )

     * */
    public void glColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a) {
        GLES31ExtPipeline.nGLColorMaskiEXT(index, r, g, b, a);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glColorMaskiEXT([int index, boolean r, boolean g, boolean b, boolean a]);
     * 
     *  C function void glColorMaskiEXT ( GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a )

     * */
    private static native void nGLColorMaskiEXT(int index, boolean r, boolean g, boolean b, boolean a);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glIsEnablediEXT([int target, int index]);
     * 
     *  C function GLboolean glIsEnablediEXT ( GLenum target, GLuint index )

     * */
    public boolean glIsEnablediEXT(int target, int index) {
       return  GLES31ExtPipeline.nGLIsEnablediEXT(target, index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glIsEnablediEXT([int target, int index]);
     * 
     *  C function GLboolean glIsEnablediEXT ( GLenum target, GLuint index )

     * */
    private static native boolean nGLIsEnablediEXT(int target, int index);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glFramebufferTextureEXT([int target, int attachment, int texture, int level]);
     * 
     *  C function void glFramebufferTextureEXT ( GLenum target, GLenum attachment, GLuint texture, GLint level )

     * */
    public void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
        GLES31ExtPipeline.nGLFramebufferTextureEXT(target, attachment, texture, level);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glFramebufferTextureEXT([int target, int attachment, int texture, int level]);
     * 
     *  C function void glFramebufferTextureEXT ( GLenum target, GLenum attachment, GLuint texture, GLint level )

     * */
    private static native void nGLFramebufferTextureEXT(int target, int attachment, int texture, int level);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glPrimitiveBoundingBoxEXT([float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW]);
     * 
     *  C function void glPrimitiveBoundingBoxEXT ( GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW )

     * */
    public void glPrimitiveBoundingBoxEXT(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
        GLES31ExtPipeline.nGLPrimitiveBoundingBoxEXT(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glPrimitiveBoundingBoxEXT([float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW]);
     * 
     *  C function void glPrimitiveBoundingBoxEXT ( GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW )

     * */
    private static native void nGLPrimitiveBoundingBoxEXT(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glPatchParameteriEXT([int pname, int value]);
     * 
     *  C function void glPatchParameteriEXT ( GLenum pname, GLint value )

     * */
    public void glPatchParameteriEXT(int pname, int value) {
        GLES31ExtPipeline.nGLPatchParameteriEXT(pname, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glPatchParameteriEXT([int pname, int value]);
     * 
     *  C function void glPatchParameteriEXT ( GLenum pname, GLint value )

     * */
    private static native void nGLPatchParameteriEXT(int pname, int value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexParameterIivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterIivEXT ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexParameterIivEXT(int target, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLTexParameterIivEXT(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexParameterIivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterIivEXT ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexParameterIivEXT(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexParameterIivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterIivEXT ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexParameterIivEXT(int target, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLTexParameterIivEXT(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexParameterIivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterIivEXT ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexParameterIivEXT(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexParameterIuivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterIuivEXT ( GLenum target, GLenum pname, const GLuint *params )

     * */
    public void glTexParameterIuivEXT(int target, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLTexParameterIuivEXT(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexParameterIuivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterIuivEXT ( GLenum target, GLenum pname, const GLuint *params )

     * */
    private static native void nGLTexParameterIuivEXT(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexParameterIuivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterIuivEXT ( GLenum target, GLenum pname, const GLuint *params )

     * */
    public void glTexParameterIuivEXT(int target, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLTexParameterIuivEXT(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexParameterIuivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterIuivEXT ( GLenum target, GLenum pname, const GLuint *params )

     * */
    private static native void nGLTexParameterIuivEXT(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetTexParameterIivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterIivEXT ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetTexParameterIivEXT(int target, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLGetTexParameterIivEXT(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetTexParameterIivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterIivEXT ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexParameterIivEXT(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetTexParameterIivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterIivEXT ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetTexParameterIivEXT(int target, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLGetTexParameterIivEXT(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetTexParameterIivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterIivEXT ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexParameterIivEXT(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetTexParameterIuivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterIuivEXT ( GLenum target, GLenum pname, GLuint *params )

     * */
    public void glGetTexParameterIuivEXT(int target, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLGetTexParameterIuivEXT(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetTexParameterIuivEXT([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterIuivEXT ( GLenum target, GLenum pname, GLuint *params )

     * */
    private static native void nGLGetTexParameterIuivEXT(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetTexParameterIuivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterIuivEXT ( GLenum target, GLenum pname, GLuint *params )

     * */
    public void glGetTexParameterIuivEXT(int target, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLGetTexParameterIuivEXT(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetTexParameterIuivEXT([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterIuivEXT ( GLenum target, GLenum pname, GLuint *params )

     * */
    private static native void nGLGetTexParameterIuivEXT(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glSamplerParameterIivEXT([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameterIivEXT ( GLuint sampler, GLenum pname, const GLint *param )

     * */
    public void glSamplerParameterIivEXT(int sampler, int pname, int[] param, int offset) {
        GLES31ExtPipeline.nGLSamplerParameterIivEXT(sampler, pname, param, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glSamplerParameterIivEXT([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameterIivEXT ( GLuint sampler, GLenum pname, const GLint *param )

     * */
    private static native void nGLSamplerParameterIivEXT(int sampler, int pname, int[] param, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glSamplerParameterIivEXT([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameterIivEXT ( GLuint sampler, GLenum pname, const GLint *param )

     * */
    public void glSamplerParameterIivEXT(int sampler, int pname, java.nio.IntBuffer param) {
        GLES31ExtPipeline.nGLSamplerParameterIivEXT(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glSamplerParameterIivEXT([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameterIivEXT ( GLuint sampler, GLenum pname, const GLint *param )

     * */
    private static native void nGLSamplerParameterIivEXT(int sampler, int pname, java.nio.IntBuffer param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glSamplerParameterIuivEXT([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, const GLuint *param )

     * */
    public void glSamplerParameterIuivEXT(int sampler, int pname, int[] param, int offset) {
        GLES31ExtPipeline.nGLSamplerParameterIuivEXT(sampler, pname, param, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glSamplerParameterIuivEXT([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, const GLuint *param )

     * */
    private static native void nGLSamplerParameterIuivEXT(int sampler, int pname, int[] param, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glSamplerParameterIuivEXT([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, const GLuint *param )

     * */
    public void glSamplerParameterIuivEXT(int sampler, int pname, java.nio.IntBuffer param) {
        GLES31ExtPipeline.nGLSamplerParameterIuivEXT(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glSamplerParameterIuivEXT([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, const GLuint *param )

     * */
    private static native void nGLSamplerParameterIuivEXT(int sampler, int pname, java.nio.IntBuffer param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetSamplerParameterIivEXT([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterIivEXT ( GLuint sampler, GLenum pname, GLint *params )

     * */
    public void glGetSamplerParameterIivEXT(int sampler, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLGetSamplerParameterIivEXT(sampler, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetSamplerParameterIivEXT([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterIivEXT ( GLuint sampler, GLenum pname, GLint *params )

     * */
    private static native void nGLGetSamplerParameterIivEXT(int sampler, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetSamplerParameterIivEXT([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameterIivEXT ( GLuint sampler, GLenum pname, GLint *params )

     * */
    public void glGetSamplerParameterIivEXT(int sampler, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLGetSamplerParameterIivEXT(sampler, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetSamplerParameterIivEXT([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameterIivEXT ( GLuint sampler, GLenum pname, GLint *params )

     * */
    private static native void nGLGetSamplerParameterIivEXT(int sampler, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetSamplerParameterIuivEXT([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, GLuint *params )

     * */
    public void glGetSamplerParameterIuivEXT(int sampler, int pname, int[] params, int offset) {
        GLES31ExtPipeline.nGLGetSamplerParameterIuivEXT(sampler, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetSamplerParameterIuivEXT([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, GLuint *params )

     * */
    private static native void nGLGetSamplerParameterIuivEXT(int sampler, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glGetSamplerParameterIuivEXT([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, GLuint *params )

     * */
    public void glGetSamplerParameterIuivEXT(int sampler, int pname, java.nio.IntBuffer params) {
        GLES31ExtPipeline.nGLGetSamplerParameterIuivEXT(sampler, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glGetSamplerParameterIuivEXT([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameterIuivEXT ( GLuint sampler, GLenum pname, GLuint *params )

     * */
    private static native void nGLGetSamplerParameterIuivEXT(int sampler, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexBufferEXT([int target, int internalformat, int buffer]);
     * 
     *  C function void glTexBufferEXT ( GLenum target, GLenum internalformat, GLuint buffer )

     * */
    public void glTexBufferEXT(int target, int internalformat, int buffer) {
        GLES31ExtPipeline.nGLTexBufferEXT(target, internalformat, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexBufferEXT([int target, int internalformat, int buffer]);
     * 
     *  C function void glTexBufferEXT ( GLenum target, GLenum internalformat, GLuint buffer )

     * */
    private static native void nGLTexBufferEXT(int target, int internalformat, int buffer);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES31Ext.glTexBufferRangeEXT([int target, int internalformat, int buffer, int offset, int size]);
     * 
     *  C function void glTexBufferRangeEXT ( GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size )

     * */
    public void glTexBufferRangeEXT(int target, int internalformat, int buffer, int offset, int size) {
        GLES31ExtPipeline.nGLTexBufferRangeEXT(target, internalformat, buffer, offset, size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES31Ext.glTexBufferRangeEXT([int target, int internalformat, int buffer, int offset, int size]);
     * 
     *  C function void glTexBufferRangeEXT ( GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size )

     * */
    private static native void nGLTexBufferRangeEXT(int target, int internalformat, int buffer, int offset, int size);
}