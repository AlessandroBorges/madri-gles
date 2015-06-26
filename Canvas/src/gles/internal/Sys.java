/**
 * 
 */
package gles.internal;

import android.util.DisplayMetrics;

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
	
	/**
	 * singleton EGLPipeline
	 */
	private static EGL14Pipeline eglPipeline = null;
	
	
	/**
	 * display metrics for this instance of Emulator
	 */
  private static DisplayMetrics displayMetrics =null;
	
    public enum EGL_PIPE {
        EGL14
    }

    public static Pipeline getPipelineInstance(GL_PIPE mode) {
        return null;
    }

    public static Pipeline getEGLPipelineInstance(EGL_PIPE mode) {
        if(null==eglPipeline){
            eglPipeline = EGL14Pipeline.getPipelineInstance();
        }
        return eglPipeline;
    }

    /**
     * return true if current GLES mode is GL10
     * @return
     */
    public static boolean isGL10() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public static boolean isGL20() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public static boolean isGL30() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public static boolean isGL31() {
        // TODO Auto-generated method stub
        return false;
    }

    public static DisplayMetrics getDisplayMetrics() {
         if(displayMetrics == null){
             throw new UnsupportedOperationException("not implemented yet");
         }
         
         return displayMetrics;  
    }

}
