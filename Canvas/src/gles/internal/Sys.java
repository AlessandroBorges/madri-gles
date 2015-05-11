/**
 * 
 */
package gles.internal;

/**
 * @author Alessandro Borges
 *
 */
public class Sys {
	
	public enum GL_PIPE{
		GLES10,
		GLES10Ext,
		GLES11,
		GLES11Ext,
		GLES20,
		GLES30,
		GLES31,
		GLES31Ext
	}
	
    public enum EGL_PIPE {
        EGL14
    }

    public static Pipeline getPipelineInstance(GL_PIPE mode) {
        return null;
    }

    public static Pipeline getEGLPipelineInstance(EGL_PIPE mode) {
        return null;
    }

    /**
     * return true if current GLES mode is GL10
     * @return
     */
    public static boolean isGL10() {
        // TODO Auto-generated method stub
        return false;
    }

}
