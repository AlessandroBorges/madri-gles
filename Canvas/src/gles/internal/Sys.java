/**
 * 
 */
package gles.internal;

import java.util.HashSet;
import java.util.Set;

import android.opengl.Log;
import android.util.DisplayMetrics;

/**
 * @author Alessandro Borges
 *
 */
public class Sys {
      private static String TAG="gles.internal.Sys";	
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
       * Current SDK.
       * Once set it can not be changed.
       */
      private static SDK selectedSDK = null;//SDK.ADRENO;
      
      /**
       * flag for native libs load
       */
      private static boolean nativeLibsLoaded = false;
      
      private static Set<GL_PIPE> glPipeLoaded = new HashSet<Sys.GL_PIPE>(4);
      /**
       * Enumeration of OpenGL ES pipelines.<br>
       * Not all pipes will be availble on all platform/renderers.
       *
       */
       public enum GL_PIPE{
		GLES10(10),
		GLES10Ext(10),
		GLES11(11),
		GLES11Ext(12),
		GLES20(20),
		GLES30(30),
		GLES31(31),
		GLES31Ext(32);
		
		private int ver;
		private GL_PIPE(int ver){
		    this.ver = ver;
		}
		/**
		 * internal value of GL
		 * @return
		 */
		public int getInternalValue(){
		    return ver;
		}
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
     * Get a OpenGL ES Pipeline.
     * TODO - deal to not load  FFP and Programable pipelines
     * @param mode - one of {@link GL_PIPE}
     * @return a Pipeline
     */
    public static Pipeline getGLPipelineInstance(GL_PIPE mode) {
        Log.i(TAG, "getPipelineInstance: " + mode);
        
        if(!nativeLibsLoaded){
            loadDefaultNativeLibs();
        }
        
        glPipeLoaded.add(mode);
        
        switch (mode) {
            case GLES10:    return GLES10Pipeline.getPipelineInstance();
            case GLES10Ext: return GLES10ExtPipeline.getPipelineInstance();            
            case GLES11:    return GLES11Pipeline.getPipelineInstance();
            case GLES11Ext: return GLES11ExtPipeline.getPipelineInstance();
            case GLES20:    return GLES20Pipeline.getPipelineInstance();
            case GLES30:    return GLES30Pipeline.getPipelineInstance();
            case GLES31Ext: return GLES31ExtPipeline.getPipelineInstance();

            default:
                throw new UnsupportedOperationException("Unable to load GLPipeline");          
        }
    }

    /**
     * get EGL Pipeline instance
     * @param mode
     * @return
     */
    public static Pipeline getEGLPipelineInstance(EGL_PIPE mode) {
        Log.i(TAG, "getEGLPipelineInstance : " + mode);
        if(null==eglPipeline){
            if(!nativeLibsLoaded){
                loadDefaultNativeLibs();
            }
            eglPipeline = EGL14Pipeline.getPipelineInstance();
        }
        return eglPipeline;
    }

    /**
     * Set SDK. <br>
     * Call it before loading native libs.
     * 
     * @see SDK
     * @see #loadNativeLibs()
     * 
     * @param type - SDK type. One of ADRENO, ANGLE, PowerVR or MALI
     * @throws UnsupportedOperationException if called more than one time.
     */
    public static void setSDK(SDK type){
        if(selectedSDK == null){
            selectedSDK = type;
        }else{
            if(selectedSDK != type)
            throw new UnsupportedOperationException("SDK already set as [" + selectedSDK+
                    "]. SDK can be set only once.");
        }
    }
    
    /**
     * Get the selected SDK
     * @return SDK
     */
    public static SDK getSDK(){
        return selectedSDK;
    }
    
    /**
     * <pre>
     * Load default native libs.
     * Default SDK is SDK.ANGLE.
     * Default GL_PIPE is GLES20 
     * Same as : 
     *  loadNativeLibs(SDK.ANGLE, GL_PIPE.GLES20)
     *  </pre>
     *  @see SDK
     *  @see GL_PIPE
     *  @see Sys#loadNativeLibs(SDK, GL_PIPE)
     *  
     *  @return true if native libs as loaded 
     */
    public static boolean loadDefaultNativeLibs(){
        if(nativeLibsLoaded) return true;
        if(!nativeLibsLoaded){
            Log.i(TAG, "loadDefaultNativeLibs");
            try{
                loadNativeLibs(SDK.ANGLE, GL_PIPE.GLES20);
                return true;
            }catch(Throwable tr){
                android.util.Log.e(TAG, "failed to load native libs", tr);
            }
        }
        return false;
    }
    
    /**
     * Load an previouly define SDK and GLES20 pipeline.
     * @return true if ok
     */
    public static boolean loadNativeLibs(){
        if(nativeLibsLoaded) return true;
        if(selectedSDK==null){
           setSDK(SDK.ANGLE);   
        }
        loadNativeLibs(selectedSDK, GL_PIPE.GLES20);
               
        return true;
    }
    
    /**
     * Load native libs.
     * Call setSDK before you call this method.
     * @see setSDK
     * 
     * @param sdk - SDK to run. One of  ADRENO, ANGLE, PowerVR, MALI
     * @param GL_PIPE - one of GL_PIPE GLES10, GLES10Ext, GLES11,  GLES11Ext,  
     *                  GLES20,  GLES30,  GLES31,  GLES31Ext
     * 
     * @throws UnsupportedOperationException if native libs are already loaded.
     * 
     */
    public static void loadNativeLibs(SDK sdk, GL_PIPE pipeline){
        if(nativeLibsLoaded) return;
        Log.i(TAG, "loadNativeLibs: " + sdk +", " + pipeline);
        
        setSDK(sdk);
        if(nativeLibsLoaded){
            throw new UnsupportedOperationException("native libs already loaded.");
        }        
        loadLibs(pipeline);
        nativeLibsLoaded = true;
    }
    
    /**
     * load native libs, as requested pipeline.
     * TODO - Deal with VM bitness, i.e., 32bit vs 64bit mode
     * TODO - Deal with GLES_CM / GLES_CM64 main lib
     * 
     * @see GL_PIPE
     * @param pipelineMode one of GL_PIPE enumeration
     */
    private static void loadLibs(GL_PIPE pipelineMode) {
        Log.i(TAG, "loadLibs:"  + pipelineMode);
        boolean is64bit = is64Bit();
        
        if (SDK.ADRENO == selectedSDK) {
            System.load("C:/Users/Livia/workspace/Canvas/libs/adreno/TextureConverter.dll");
            System.load("C:/Users/Livia/workspace/Canvas/libs/adreno/libGLESv2.dll");
            System.load("C:/Users/Livia/workspace/Canvas/libs/adreno/libEGL.dll");
        } else

        if (SDK.ANGLE == selectedSDK) {
            System.load("C:/Users/Livia/workspace/Canvas/libs/angle/d3dcompiler_46.dll");
            System.load("C:/Users/Livia/workspace/Canvas/libs/angle/libGLESv2.dll");
            System.load("C:/Users/Livia/workspace/Canvas/libs/angle/libEGL.dll");
        } else if (SDK.PowerVR == selectedSDK) {
            if (pipelineMode.getInternalValue() < 20) {
                System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/libGLES_CM.dll");
            } else {
                System.load("C:/Users/Livia/workspace/Canvas/libs/PowerVR/libGLESv2.dll");
                System.load("C:/Users/Livia/workspace/Canvas/libs/PowerVR/libEGL.dll");
            }
        } else if (SDK.MALI == selectedSDK) {
            System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/log4cplus.dll");
            System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/libMaliEmulator.dll");
            if (pipelineMode.getInternalValue() < 20) {
                System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/libGLES_CM.dll");
            } else {
                System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/libGLESv2.dll");
                System.load("C:/Users/Livia/workspace/Canvas/libs/Mali/libEGL.dll");
            }
        }
        
        // Now the main DLL
        if (pipelineMode.getInternalValue() < 20) {
            System.load("C:/Users/Livia/workspace/Canvas/libs/GLES_CM64.dll");
        }else{
            System.load("C:/Users/Livia/workspace/Canvas/libs/GLES64.dll");
        } 
    }
    
    /**
     * Check if VM is on 64BitsVM
     * @return true is a 64bits Virtual Machine
     */
    public static boolean is64Bit() {
        final String keys[] = { "sun.arch.data.model",
                                "com.ibm.vm.bitmode",
                                "os.arch" };
        
        for (String key : keys) {
            String property = System.getProperty(key);
            if (property != null && property.indexOf("64") >= 0){
                    return true;
            }
        }
        return false;
    }
    
    /**
     * return true if current GLES mode is GL10 or GL11 and extensions
     * @return true is there is GL10 available
     */
    public static boolean isGL10() {
        if(glPipeLoaded.contains(GL_PIPE.GLES10) 
            ||    glPipeLoaded.contains(GL_PIPE.GLES11)
            ||    glPipeLoaded.contains(GL_PIPE.GLES10Ext)
            ||    glPipeLoaded.contains(GL_PIPE.GLES11Ext)){
            return true;
        }
        return false;
    }
    
    /**
     * Check if the pipeline GLES20 is loaded
     * @return true, if GLES31 is loaded  
     */
    public static boolean isGL20() {
        if(glPipeLoaded.contains(GL_PIPE.GLES20) 
           ||    glPipeLoaded.contains(GL_PIPE.GLES30)
           ||    glPipeLoaded.contains(GL_PIPE.GLES31)){
                return true;
            }
        return false;
    }
    
    /**
     * Check if the pipeline GLES30 is already loaded
     * @return true, if GLES30 is loaded  
     */
    public static boolean isGL30() {
        if(glPipeLoaded.contains(GL_PIPE.GLES30) 
            ||    glPipeLoaded.contains(GL_PIPE.GLES31)){
            return true;
        }
        return false;
    }
    
    /**
     * Check if the pipeline GLES31 is already loaded
     * @return true, if GLES31 is loaded  
     */
    public static boolean isGL31() {
        if(glPipeLoaded.contains(GL_PIPE.GLES31)) {
            return true;
        }
        return false;
    }

    /**
     * TODO - init Display metrics
     * @return
     */
    public static DisplayMetrics getDisplayMetrics() {
         if(displayMetrics == null){
             displayMetrics = new DisplayMetrics();
             //throw new UnsupportedOperationException("not implemented yet");
         }
         
         return displayMetrics;  
    }

}
