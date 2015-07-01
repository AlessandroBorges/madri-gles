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
	
      public static boolean DEBUG = true;
      
      /**
       * Possible SDK to be used with GLES.<br>
       * One of ADRENO, ANGLE, PowerVR, MALI.
       * @author Alessandro Borges
       *
       */
      public enum SDK {
          ADRENO, ANGLE, PowerVR, MALI
      };
      
      /**
       * Current SDK
       */
      public SDK currentSDK = SDK.ADRENO;
      
      /**
       * Enumeration of OpenGL ES pipelines.<br>
       * Not all pipes will be availble on all platform/renderers
       *
       */
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
    private static EGL14Pipeline  eglPipeline    = null;

    /**
     * display metrics for this instance of Emulator
     */
    private static DisplayMetrics displayMetrics = null;

    /**
     * Enumeration of EGL pipelines.<br>
     * Not all pipes will be availble on all platform/renderers
     *
     */
    public enum EGL_PIPE {
        EGL14
    }

    /**
     * Get a OpenGL ES Pipeline
     * @param mode - one of {@link GL_PIPE}
     * @return a Pipeline
     */
    public static Pipeline getPipelineInstance(GL_PIPE mode) {
        
        switch (mode) {
            case GLES10:    return GLES10Pipeline.getPipelineInstance();
            case GLES10Ext: return GLES10ExtPipeline.getPipelineInstance();            
            case GLES11:    return GLES11Pipeline.getPipelineInstance();
            case GLES11Ext: return GLES11ExtPipeline.getPipelineInstance();
            case GLES20:    return GLES20Pipeline.getPipelineInstance();
            case GLES30:    return GLES30Pipeline.getPipelineInstance();
            case GLES31Ext: return GLES31ExtPipeline.getPipelineInstance();

            default:
                break;
        }
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
