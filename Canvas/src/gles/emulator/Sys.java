/**
 * 
 */
package gles.emulator;

import gles.internal.EGL14Pipeline;
import gles.internal.GLES10ExtPipeline;
import gles.internal.GLES10Pipeline;
import gles.internal.GLES11ExtPipeline;
import gles.internal.GLES11Pipeline;
import gles.internal.GLES20Pipeline;
import gles.internal.GLES30Pipeline;
import gles.internal.GLES31ExtPipeline;
import gles.internal.GLESCommonPipeline;
import gles.internal.Pipeline;
import gles.util.NativeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.util.Log;
import android.util.DisplayMetrics;
import android.view.SurfaceView;

/**
 * 
 * This class is used to define the native GL-ES render.<br>
 * Current version supports the following GL-ES renderers:<br>
 * <li>PowerVR Emulator 
 * <li>Google ANGLE
 * 
 * <h2>PowerVR SDK Emulator</h2>
 * Supports:  
 * <pre>
 *   _____________________________________
 *  |    Target     |     Requeriments    |
 *  |---------------|---------------------|
 *  | OpenGL-ES 1.1 |  OpenGL 1.5+        |
 *  | OpenGL-ES 2.0 |  OpenGL 2.0+        |
 *  | OpenGL-ES 3.0 |  OpenGL 3.3+        |
 *  | OpenGL-ES 3.1 |  OpenGL 4.3+        |
 *  |---------------|---------------------|
 * </pre>
 * <p>This native OpenGL-ES driver from <b>Imagination Technologies&trade;</b> is one of 
 * the most stable and reliable OpenGL-ES platforms available today.</p>
 * <p>
 * The maker of GPUs used by Ipads and Iphones, as well many GPUs for by mobile 
 * Intel Atom series, also makes great tools for developments targeting mobile market.</p>
 * <p>
 * Developers can join the PowerVR Insider programme and interact with the
 * community through online forums at <a href="www.powervrinsider.com">www.powervrinsider.com</a> 
 * </p><p>
 *  PowerVR SDK  support several platforms, as Windows, Linux and IOS.<br>
 *  In our current <b>Madri-GLES</b>  versions, we will use the <i>Windows</i> x86 and x64 
 *  OpenGL-ES drivers from Imagination PowerVR. Other platforms will be added on next releases.<br>
 *   
 *  
 * </p>
 * <h2>Google ANGLE- Almost Native Graphics Layer Engine</h2>
 Supports:  
 * <pre>
 *   _______________________________________________
 *  |    Target     |          Requeriments         |
 *  |---------------|-------------------------------|
 *  | OpenGL-ES 2.0 |  DirectX 9.0c or DirectX 11.0 |
 *  |---------------|-------------------------------|
 * </pre>
 * <p><b>ANGLE (Almost Native Graphics Layer Engine)</b> is an <b><i>open source</i></b>, 
 * <b><i>BSD-licensed graphics</i></b> engine abstraction layer developed by Google.The API is mainly designed to bring high 
 * performance OpenGL compatibility to Windows desktops and to Web Browsers such as 
 * Google Chromium by translating calls to Direct3D, which has much better driver support.
 * </p><p>
 * ANGLE is used as the default WebGL backend for both Google Chrome and Mozilla Firefox
 * on Windows platforms. Chrome uses ANGLE for all graphics rendering on Windows,
 * including the accelerated Canvas2D implementation and the Native Client sandbox
 * environment.</p>
 * 
 * @see <a href="http://community.imgtec.com/developers/powervr/graphics-sdk/">PowerVR
 *      SDK</a>
 * @see <a href="https://code.google.com/p/angleproject/">Google ANGLE Project</a>
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
         // ADRENO(false),
          //MALI(true),
          ANGLE(false), 
          PowerVR(true); 
        
          
          private boolean isFFP;
          
          private SDK(boolean ffp){
              isFFP = ffp;
          }
          
          public boolean isFFP(){ 
              return isFFP;
          }
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
      
      /**
       * Store GL pipes already loaded 
       */
      private static Set<GL_PIPE> glPipeLoaded = new HashSet<Sys.GL_PIPE>(5);
      
      /**
       * default GL pipe
       */
      private static GL_PIPE glPipeDefault = GL_PIPE.GLES20;
      
      /**
       * Enumeration of OpenGL ES pipelines.<br>
       * Not all pipes will be availble on all platform/renderers.
       *
       */
       public enum GL_PIPE{
                GLES_COMMON(0),
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
		public int version(){
		    return ver;
		}
		
		/**
		 * Return true if this Pipeline is GL-ES 1.x
		 * @return
		 */
		public boolean isFFP(){
		    return ver >= 10 && ver < 20; 
		}
		
		/**
		 * return true if thie pipeline is GL-ES 20 class
		 * @return
		 */
		public boolean isPPL(){
                    return ver >= 20; 
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
     * 
     */
    private static boolean allowFFPsdk=true;

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
     * @param requestPipeType - one of {@link GL_PIPE} enumeration
     * @return a Pipeline
     */
    public static Pipeline getGLPipelineInstance(GL_PIPE requestPipeType) {
        Log.i(TAG, "getPipelineInstance: " + requestPipeType);
        
        // avoid loading of forbidden combinations
        // GL-ES 1.x do not mix with GL-ES 20 and vice-versa
        // GLES_COMMON is neutral
        if(requestPipeType != GL_PIPE.GLES_COMMON && glPipeLoaded.size()>0){           
            boolean isGL20 = false;
            boolean isGL10 = false;
            
            // check GL20
            for (GL_PIPE gl_PIPE : glPipeLoaded) {
                if(gl_PIPE.version() >= GL_PIPE.GLES20.version()){
                    isGL20 = true;
                    break;
                }
            }
            
            // check GL1x
            for (GL_PIPE gl_PIPE : glPipeLoaded) {
                if( gl_PIPE.version() >= GL_PIPE.GLES10.version() 
                 && gl_PIPE.version() <= GL_PIPE.GLES11Ext.version()){
                    isGL10 = true;
                    break;
                }
            }
            
            boolean requestGL20 = requestPipeType.version()>=20;            
            if(isGL20 && !requestGL20){
                IllegalArgumentException exc = 
                        new IllegalArgumentException("Using GL-ES 20 driver. "
                                + "Unabled to load: " + requestPipeType.toString());
                Log.e(TAG, "Failed to load driver: " + requestPipeType, exc);
                throw exc;
            }            
            
            if(isGL10 && requestGL20){
                IllegalArgumentException exc = 
                        new IllegalArgumentException("Using GL-ES 1.x driver. "
                                + "Unabled to load: " + requestPipeType.toString());
                Log.e(TAG, "Failed to load driver: " + requestPipeType, exc);
                throw exc;
            }
        }
        // now, we have only valid GLES pipes combos
        glPipeLoaded.add(requestPipeType);
        // able to loaded natives then !
        if(!nativeLibsLoaded){
            loadNativeLibs();
        }
        
        switch (requestPipeType) {
            case GLES_COMMON:    return GLESCommonPipeline.getPipelineInstance();
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
        Log.i(TAG, "getEGLPipelineInstance() : " + mode);
        if(null==eglPipeline){
            if(!nativeLibsLoaded){
                loadNativeLibs();
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
     * @throws UnsupportedOperationException if called after native libs are already loaded
     */
    public static boolean setSDK(SDK type){
        if(selectedSDK == null || !nativeLibsLoaded){
            selectedSDK = type;
            return true;
        }else{
            if(selectedSDK != type){
           String msg = "SDK native libs already loaded."
                    + " SDK can't  be changed after dynamic linking."
                    + " Using SDK " + selectedSDK+   ".";
           Log.e(TAG, msg);
           //throw new UnsupportedOperationException(msg);
            return false;
            }
            return true;
        }       
    }
    
    /**
     * Set default GL_PIPE. <br>
     * If unset, it uses {@link GL_PIPE#GLES20} <br>
     * Call it before loading native libs.
     * 
     * @see GL_PIPE
     * @see SDK
     * @see #loadNativeLibs()
     * 
     * @param pipe - All GL_PIPE enumeration, except GL_COMMON
     * @return <b>true</b> if pipe mode sucessfully set and <b>false</b> if native 
     * libs were already loaded or try to set GL_COMMON 
     */
    public static boolean setGLPipe(GL_PIPE pipe){
        if(pipe==GL_PIPE.GLES_COMMON)
            return false;
        
        if(glPipeDefault == null || !nativeLibsLoaded){
            glPipeDefault = pipe;
            Log.i(TAG, "default glPipe is " + pipe);
            return true;
        }
        if(glPipeDefault != pipe || nativeLibsLoaded){
          return false;        
        }
        return false;        
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
     * If undefined SDK, loads Google's ANGLE and GLES20 pipeline
     * @return true if ok
     */
    public static synchronized boolean loadNativeLibs(){
        if(nativeLibsLoaded) return true;
        if(selectedSDK==null){
           setSDK(SDK.ANGLE);   
        }
        loadNativeLibs(selectedSDK, glPipeDefault);
               
        return true;
    }
    
    /**
     * Load native libs.
     * Call setSDK before you call this method.
     * @see setSDK
     * 
     * @param sdk - SDK to run. One of  ADRENO, ANGLE, PowerVR, MALI
     * @param GL_PIPE - one of GL_PIPE GLES10, GLES10Ext, GLES11,  GLES11Ext,  
     *                  GLES20,  GLES30,  GLES31,  GLES31Ext<br> <b>except GL_COMMON</b>
     * 
     * @throws UnsupportedOperationException if native libs are already loaded.
     * 
     */
    public static synchronized void loadNativeLibs(SDK sdk, GL_PIPE pipeline){
        if(nativeLibsLoaded){
            String pipes = Arrays.toString(glPipeLoaded.toArray());
            Log.i(TAG, "loadNativeLibs()- libs already loaded " + selectedSDK +", " + pipes);
            return;
        }        
        Log.i(TAG, "loadNativeLibs() : " + sdk +", " + pipeline);        
        setSDK(sdk);
        loadLibs(pipeline);      
    }
    
    /**
     * load native libs, as requested pipeline.
     * TODO - Deal with VM bitness, i.e., 32bit vs 64bit mode
     * TODO - Deal with GLES_CM / GLES_CM64 main lib
     * 
     * @see GL_PIPE
     * @param pipelineMode one of GL_PIPE enumeration
     */
    private static synchronized void loadLibs(GL_PIPE pipelineMode) {
        Log.i(TAG, "loadLibs() : "  + pipelineMode);
        
        if(pipelineMode == null || pipelineMode==GL_PIPE.GLES_COMMON){
            Log.i(TAG, "loadLibs(): there is no native libs for "  + pipelineMode);
            return;
        }
        String basePath = "C:/Users/Livia/Documents/GitHub/madri-gles/Canvas/libs/native";
        String dllJNIPath = "C:/Users/Livia/Documents/GitHub/madri-gles/Canvas/libs/";
        Log.i(TAG, "loadLibs using basePath as:"  + basePath);
        
        // pipelineMode has higher priority than SDK
        if (allowFFPsdk) {
            if (pipelineMode.isFFP() && !selectedSDK.isFFP()) {
                for (SDK sdk : SDK.values()) {
                    if (sdk.isFFP()) {
                        selectedSDK = sdk;
                        break;
                    }
                }
            }
        }
        
        // build the path !
        
        String pathJar="/native/";        
        boolean is64bit = is64Bit();
        Log.i(TAG, "System is 64bit ?: "  + is64bit);
        pathJar += is64bit ? "x64/" : "x86/";
        
        
        try {
            glPipeLoaded.add(pipelineMode);
            Log.i(TAG, "loadLibs() - loading SDK: "  + selectedSDK);
            /*
             * ADRENO is Unsupported in current release
            if (SDK.ADRENO == selectedSDK) {
                System.load(basePath + "adreno/TextureConverter.dll");
                System.load(basePath + "adreno/libGLESv2.dll");
                System.load(basePath + "adreno/libEGL.dll");
            } else
            */
            if (SDK.ANGLE == selectedSDK) {
                //pathJar = pathJar + "ANGLE/";
                pathJar = pathJar + "MS-TECH/";
                NativeUtils.load("d3dcompiler_47", pathJar, basePath + pathJar);
                NativeUtils.load("libGLESv2", pathJar, basePath + pathJar);
                NativeUtils.load("libEGL", pathJar, basePath + pathJar);
                //System.load(basePath + "angle/d3dcompiler_46.dll");
                //System.load(basePath + "angle/libGLESv2.dll");
                //System.load(basePath + "angle/libEGL.dll");
            } else 
            
            if (SDK.PowerVR == selectedSDK) {
                pathJar = pathJar + "PowerVR/";
                
                if (pipelineMode.isFFP()) {
                    NativeUtils.load("libGLES_CM", pathJar, basePath + pathJar);
                    //System.load(basePath + "PowerVR/libGLES_CM.dll");                 
                } else {                                   
                    NativeUtils.load("libGLESv2", pathJar, basePath + pathJar);
                    NativeUtils.load("libEGL", pathJar, basePath + pathJar);
                    //System.load(basePath + "PowerVR/libGLESv2.dll");
                    //System.load(basePath + "PowerVR/libEGL.dll");
                }
            } 
            /*
             // MALI is unsupported in current release
            else 
                if (SDK.MALI == selectedSDK) {
                System.load(basePath + "Mali/log4cplus.dll");
                System.load(basePath + "Mali/libMaliEmulator.dll");
                setMaliCompilerPath(basePath);
                if (pipelineMode.isFFP()) {
                    System.load(basePath + "Mali/libGLES_CM.dll");
                } else {
                    System.load(basePath + "Mali/libGLESv2.dll");
                    System.load(basePath + "Mali/libEGL.dll");
                }
            }
            */
            // Now the main DLL
            if (pipelineMode.version() < 20) {
                if(is64bit){
                    NativeUtils.load("GLES_CM64", "/native/", dllJNIPath);
                }else{
                    NativeUtils.load("GLES_CM", "/native/", dllJNIPath);
                }
               // System.load(basePath + "GLES_CM64.dll");
            }else{
                if(is64bit){
                    NativeUtils.load("GLES64", "/native/", dllJNIPath);
                }else{
                    NativeUtils.load("GLES", "/native/", dllJNIPath);
                }
               // System.load(basePath + "GLES64.dll");
            }
            
            nativeLibsLoaded = true;
            
        } catch (RuntimeException e) {            
           Log.e(TAG, "Unable to load native libs for " + pipelineMode, e);
           glPipeLoaded.remove(pipelineMode);           
           e.printStackTrace();
           throw e;
        } 
        
        Log.i(TAG, "loadLibs() : success loading SDK: "+ selectedSDK + " and pipeline " + pipelineMode); 
        
    }
    
    private static void setMaliCompilerPath(String s){
        String envVar = "MALI_EMULATOR_COMPILER_MANAGER_PATH";
        String envMali = System.getenv(envVar);
        System.out.println("MALI compiler: " + envMali);
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

    /**
     * return SDK info
     * @return
     */
    public static String getSDKInfo() {
        String info = "SDK: " + selectedSDK.name();
        info += "GL-ES pipelines loaded: ";
        for(GL_PIPE pipe : glPipeLoaded){
            info += pipe.toString();
            info += " ";
        }
        return info;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
   
    public static String asString() {        
        String s = "Sys [";
        s += " selectedSDK: " + selectedSDK;
        s += ", is64Bits: " + is64Bit();
        s += ", isGL10: " + isGL10();
        s += ", isGL20: " + isGL20();
        s += ", isGL30: " + isGL30();
        s += ", isGL31: " + isGL31();
        s += ", nativeLibsLoaded:" + nativeLibsLoaded;
        s += ", glPipeLoaded: " + Arrays.toString(glPipeLoaded.toArray());        
        s += "]";
        return s;        
    }

    public static boolean isNativeLibsLoaded() {
        // TODO Auto-generated method stub
        return nativeLibsLoaded;
    }

    /**
     * recover the CanvasEGL instances to be used by EGL/GLES.<br> 
     * 
     * @param surfaceView a reference to where the canvas is going. Not used yet
     * @return first CanvasEGL available on Sys
     */
    public static CanvasEGL getCanvas(SurfaceView surfaceView) { 
        if(listCanvasEGL.size()==0) 
            return null;
        
        return listCanvasEGL.get(0);
    }
    
    public static boolean saveCanvas(CanvasEGL canvas){
       return  listCanvasEGL.add(canvas);
    }
    
    /**
     * Stores one or more CanvasEGL in instances.
     */
    private static List<CanvasEGL> listCanvasEGL = new ArrayList<CanvasEGL>(2);

}
