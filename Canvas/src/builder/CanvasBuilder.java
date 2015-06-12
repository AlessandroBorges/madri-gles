package builder;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;

public class CanvasBuilder {

    static final boolean buildIt = true;
    static final boolean createBuild = true;
    static final boolean generateCPP = true;
    static final boolean packIt = false;
    static final boolean buildLinux = false;
    
  
    public enum SDK {
	ADRENO, ANGLE, PowerVR, MALI
    };

 // Adreno Stuff
    public static String ADRENO_INC = "C:/Projetos/Android/Builder/Adreno/inc/";
    public static String ADRENO_LIB_X86 = "C:/Projetos/Android/Builder/Adreno/x86/";
    public static String ADRENO_LIB_X64 = "C:/Projetos/Android/Builder/Adreno/x64/";
    
 // Angle Stuff
    public static String ANGLE_INC = "C:/Projetos/Android/Builder/Angle/inc";
    public static String ANGLE_LIB_X86 = "C:/Projetos/Android/Builder/Angle/x86/libs";
    public static String ANGLE_LIB_X64 = "C:/Projetos/Android/Builder/Angle/x64/libs";      

    // Mali Stuff
    public static String MALI_INC = "C:/Projetos/Android/Builder/Mali/inc/";
    public static String MALI_LIB_X86 = "C:/Projetos/Android/Builder/Mali/x86/";
    public static String MALI_LIB_X64 = "C:/Projetos/Android/Builder/Mali/x64/";

    // PowerVR Stuff
    public static String PowerVR_INC = "C:/Projetos/Android/Builder/PowerVR/inc/";
    public static String PowerVR_LIB_X86 = "C:/Projetos/Android/Builder/PowerVR/x86/";
    public static String PowerVR_LIB_X64 = "C:/Projetos/Android/Builder/PowerVR/x64/";

    // SDKs paths
    public static SDKPath ADRENO_SDK = new SDKPath(ADRENO_INC, ADRENO_LIB_X86, ADRENO_LIB_X64);
    public static SDKPath ANGLE_SDK = new SDKPath(ANGLE_INC, ANGLE_LIB_X86, ANGLE_LIB_X64);
    public static SDKPath PowerVR_SDK = new SDKPath(PowerVR_INC, PowerVR_LIB_X86, PowerVR_LIB_X64);
    public static SDKPath MALI_SDK =  new SDKPath(MALI_INC, MALI_LIB_X86, MALI_LIB_X64);
    
    
    /**
     * 
     **/
    static public void main(String[] args) throws Exception {
        System.out.println(System.getenv("PATH"));

        String src = "src", bin = "bin", jni = "jni";

        boolean genFFP = false;

        SDK sdk = SDK.ADRENO;
      String[] exclude = {""
              
      };
      
      String[]	ffpSrc = { "**/gles/emulator/util/JAWT.java",
                           "**/gles/emulator/util/DrawingSurface.java",
                           "**/gles/emulator/util/DrawingSurfaceInfo.java",
                           "**/gles/internal/GLES10Pipeline.java", 
                           "**/gles/internal/GLES10ExtPipeline.java", 
                            "**/gles/internal/GLES11Pipeline.java",
			            	"**/gles/internal/GLES11ExtPipeline.java",
			            //	"**/android/opengl/EGL14.java", 
			            //	"**/android/opengl/EGLExt.java"
			            	};
      
      String[]  ppSrc =  {    		"**/gles/emulator/util/JAWT.java",
					"**/gles/emulator/util/DrawingSurface.java",
					"**/gles/emulator/util/DrawingSurfaceInfo.java",
					"**/gles/internal/EGL14Pipeline.java",
					"**/gles/internal/GLES20Pipeline.java",
					"**/gles/internal/GLES30Pipeline.java",
					"**/gles/internal/GLES31Pipeline.java",
					//"**/gles/internal/GLES31ExtPipeline.java",
					//"**/gles/internal/TesteGL.java",
				
					
    		  };
      
     
            
      String[] src2Natives = null;
      if(genFFP) {
	  src2Natives = ffpSrc; /* Fixed Pipeline */ 
      }else{ 
	  src2Natives = ppSrc;  /* Programable Pipeline */	
      };
      	
      
     
	if (generateCPP) {
	    System.out.println("\n\n### jnigen.generate...\n");
	    
	    NativeCodeGenerator jnigen = new NativeCodeGenerator();
	    jnigen.generate(src, // the .Java folder
		    bin, // the .class folder
		    jni, // output folder
		    src2Natives, // files/directories to parse and generate files *.h
		    null); // files/directores to exclude
	    System.out.println("end generation.");

	}

   if(buildIt){
       System.out.println("\n\n#### Build it ... \n");
	  // main Header
	  String[] headerDir = {};//{ "**/gles/headers/JAWT_Info.h"  };
	  String jawt_Lib32 = "C:\\NVPACK\\jdk1.7.0_45\\lib";
	  String jawt_Lib64 = "C:/JDK8_64/lib";
	  
	  
	  String[] libsWin32Dir={jawt_Lib32};
	  String[] libsWin64Dir={jawt_Lib64};
	  String[] libGLESAngle={"-llibGLESv2-x64"};
	  String[] libGLES={"-lGLESv2"};
	 
	  switch (sdk) {
	    case ADRENO:
		 headerDir = ADRENO_SDK.mergeInclude(headerDir);
		 libsWin32Dir = ADRENO_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = ADRENO_SDK.mergeWin64Lib(libsWin64Dir);
		 break;		 
		 
	    case ANGLE:
		 headerDir = ANGLE_SDK.mergeInclude(headerDir);
		 libsWin32Dir = ANGLE_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir= merge(libsWin64Dir, libGLES);
		 libsWin64Dir = ANGLE_SDK.mergeWin64Lib(libsWin64Dir);
		 break;		 
	    case MALI:
		 headerDir = MALI_SDK.mergeInclude(headerDir);
		 libsWin32Dir = MALI_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = MALI_SDK.mergeWin64Lib(libsWin64Dir);

		 break;
	    case PowerVR:
		 headerDir = PowerVR_SDK.mergeInclude(headerDir);
		 libsWin32Dir = PowerVR_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = PowerVR_SDK.mergeWin64Lib(libsWin64Dir);
		 break;
		 
	    default:
		break;
	    }
	     
	     String[] cIncludes = {"DLLMain.c",};
	    // Build Base
	    BuildTarget win32 = null;
	    win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
	    win32.cIncludes = cIncludes;
	    win32.compilerPrefix = "mingw32-";;
	    win32.cppFlags += " ";
	    win32.headerDirs = headerDir;//
	    win32.libraries = SDKPath.libPath(libsWin32Dir) 
		             + " -ljawt -luser32 -lGLESv2 "  ;
		              //"-ljawt -lwinmm -lgdi32 -lshell32 -luser32 -lkernel32 -lcomctl32 ";
	    win32.cFlags += " -D_WINGDI_ -D_JNI_IMPLEMENTATION_ -DBUILD_DLL";
        win32.linkerFlags = " -Wl,--kill-at -shared -static -static-libgcc -static-libstdc++ "; 
	   // win32.linkerFlags = " -Wl,-verbose ";
            
            ///////////////////////////////////////////////////////////////////////////
            
            BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
            win64.cIncludes = cIncludes;
            win64.compilerPrefix = "";// "mingw32-";
            win64.headerDirs = headerDir;// {"HEADERS HERE"};
            win64.libraries = SDKPath.libPath(libsWin64Dir) +
        	             " -ljawt -luser32 -llibGLESv2-x64 ";
            
            win64.cFlags +=  " -D_WINGDI_ -D_JNI_IMPLEMENTATION_ -DBUILD_DLL";
            win64.linkerFlags += win32.linkerFlags;
            
            BuildTarget linux32 = null;
            BuildTarget linux64 = null;
      if(buildLinux){
         linux32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
        linux32.cIncludes = win32.cIncludes;
        linux32.headerDirs = win32.headerDirs;
        linux32.libraries = win32.libraries;
        linux32.cFlags = win32.cFlags;
        linux32.linkerFlags = win32.linkerFlags;
        
        linux64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
     // BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);
   
      }  
            if (createBuild) {
        	System.out.println("\n\n#### Create Ant Build  ... \n");
		    BuildConfig config = new BuildConfig("GLES");
		    new AntScriptGenerator().generate(config, win32, win64);
		}
            
	    if (buildIt) {
		System.out.println("\n\n#### Run Ant Build  ... \n");
		//BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean postcompile");
		BuildExecutor.executeAnt("jni/build-windows64.xml", "-v -Dhas-compiler=true clean postcompile");
		//BuildExecutor.executeAnt("jni/build-linux32.xml",   "-v -Dhas-compiler=true clean postcompile");
		//BuildExecutor.executeAnt("jni/build-linux64.xml",  "-v -Dhas-compiler=true clean postcompile");
		// BuildExecutor.executeAnt("jni/build-macosx32.xml",
		// "-v -Dhas-compiler=true  clean postcompile");
		
	    }
	    if(packIt){
		System.out.println("\n\n#### Pack it  ... \n");
		BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
	    }
   }
  }
	/**
	 * Merge String Arrays
	 * @param a input array
	 * @param b input array
	 * @return output arrai with a + b;
	 */
	public static String[] merge(String[] a, String ... b) {
		String[] n = new String[a.length + b.length];
		System.arraycopy(a, 0, n, 0, a.length);
		System.arraycopy(b, 0, n, a.length, b.length);
		return n;
	}

}// end class

/**
 * Better organize paths
 * @author Alessandro Borges
 *
 */
class SDKPath {
    public String include;
    public String win32Lib;
    public String win64Lib;

    /**
     * 
     * @param include
     * @param win32Lib
     * @param win64Lib
     */
    public SDKPath(String include, String win32Lib, String win64Lib) {
	super();
	this.include = include;
	this.win32Lib = win32Lib;
	this.win64Lib = win64Lib;
    }

    public SDKPath() {
    }

    /**
     * Merge Include
     * @param inc
     * @return
     */
    public String[] mergeInclude(String[] inc){
	return merge(inc, include);
    }
    
    /**
     * merge Lib 32
     * @param lib32
     * @return
     */
    public String[] mergeWin32Lib(String[] lib32){
	return merge(lib32, win32Lib);
    }
    
    /**
     * merge lib 64
     * @param lib64
     * @return
     */
    public String[] mergeWin64Lib(String[] lib64){
	return merge(lib64, win64Lib);
    }
    
    /**
     * create lib path for gcc.
     * 
     * @param paths list os paths to 
     * @return
     */
    public static String libPath(String[] paths){
	
	StringBuilder sb = new StringBuilder();
	for(String p : paths){
	    sb.append(" -L").append(p).append(" ");
	}
	
	return sb.toString();
    }
    
    /**
     * Merge folders
     * @param a
     * @param b
     * @return
     */
    public static String[] merge(String[] a, String... b) {
	String[] n = new String[a.length + b.length];
	System.arraycopy(a, 0, n, 0, a.length);
	System.arraycopy(b, 0, n, a.length, b.length);
	return n;
    }

}
