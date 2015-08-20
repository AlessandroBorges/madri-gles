package builder;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;

public class CanvasBuilder {

    static final boolean buildIt = true;
    static final boolean createBuild = true;
    static final boolean generateCPP = false;
    static final boolean packIt = true;
    static final boolean buildLinux = false;
    
  
    protected enum SDK_Build {
	ADRENO, ANGLE, PowerVR, MALI
    };

 // Adreno Stuff
    private static String ADRENO_INC = "C:/Projetos/Android/Builder/Adreno/inc/";
    private static String ADRENO_LIB_X86 = "C:/Projetos/Android/Builder/Adreno/x86/";
    private static String ADRENO_LIB_X64 = "C:/Projetos/Android/Builder/Adreno/x64/";
    
 // Angle Stuff
    private static String ANGLE_INC = "C:/Projetos/Android/Builder/Angle/inc";
    private static String ANGLE_LIB_X86 = "C:/Projetos/Android/Builder/Angle/x86/libs";
    private static String ANGLE_LIB_X64 = "C:/Projetos/Android/Builder/Angle/x64/libs";      

    // Mali Stuff
    private static String MALI_INC = "C:/Projetos/Android/Builder/Mali/inc/";
    private static String MALI_LIB_X86 = "C:/Projetos/Android/Builder/Mali/x86/";
    private static String MALI_LIB_X64 = "C:/Projetos/Android/Builder/Mali/x64/";

    // PowerVR Stuff
    private static String PowerVR_INC = "C:/Projetos/Android/Builder/PowerVR/inc/";
    private static String PowerVR_LIB_X86 = "C:/Projetos/Android/Builder/PowerVR/x86/";
    private static String PowerVR_LIB_X64 = "C:/Projetos/Android/Builder/PowerVR/x64/";

    // SDKs paths
    private static SDKPath ADRENO_SDK = new SDKPath(ADRENO_INC, ADRENO_LIB_X86, ADRENO_LIB_X64);
    private static SDKPath ANGLE_SDK = new SDKPath(ANGLE_INC, ANGLE_LIB_X86, ANGLE_LIB_X64);
    private static SDKPath PowerVR_SDK = new SDKPath(PowerVR_INC, PowerVR_LIB_X86, PowerVR_LIB_X64);
    private static SDKPath MALI_SDK =  new SDKPath(MALI_INC, MALI_LIB_X86, MALI_LIB_X64);
    
    
    /**
     * 
     **/
    static public void main(String[] args) throws Exception {
        System.out.println(System.getenv("PATH"));

        String src = "src", bin = "bin", jni = "jni";

        boolean genFFP = false;

        SDK_Build sdk = SDK_Build.ADRENO;
      
      
      String[] ffpExclude ={  "**/gles/internal/GLES20Pipeline.java",
			   "**/gles/internal/GLES30Pipeline.java",
			   "**/gles/internal/GLES31Pipeline.java", 
     };
      
      String[] ppExclude ={ "**/gles/internal/GLES10Pipeline.java", 
                           "**/gles/internal/GLES10ExtPipeline.java", 
                           "**/gles/internal/GLES11Pipeline.java",
			   "**/gles/internal/GLES11ExtPipeline.java",
      };
      
       String[] ffpcExclude ={ "gles.internal.GLES20Pipeline.cpp",
			       "gles.internal.GLES30Pipeline.cpp",
			       "gles.internal.GLES31Pipeline.cpp", 
     };
      
      String[] ppcExclude ={ "gle.internal.GLES10Pipeline.cpp", 
                             "gles.internal.GLES10ExtPipeline.cpp", 
                             "gles.internal.GLES11Pipeline.cpp",
			     "gles.internal.GLES11ExtPipeline.cpp",
      };
      
      
      String[]	ffpSrc = { "**/gles/emulator/util/JAWT.java",                           
                           "**/gles/internal/GLES10Pipeline.java", 
                           "**/gles/internal/GLES10ExtPipeline.java", 
                           "**/gles/internal/GLES11Pipeline.java",
			   "**/gles/internal/GLES11ExtPipeline.java",
			   "**/gles/internal/EGL14Pipeline.java",			  
                           "**/gles/internal/UtilPipeline.java",
			            	};
      
      String[]  ppSrc =  { "**/gles/emulator/util/JAWT.java",					
			   "**/gles/internal/EGL14Pipeline.java",
			   "**/gles/internal/GLES20Pipeline.java",
			   "**/gles/internal/GLES30Pipeline.java",
			   "**/gles/internal/GLES31Pipeline.java",
			   "**/gles/internal/UtilPipeline.java",
			   "**/gles/internal/GLES31ExtPipeline.java",
			//"**/gles/internal/TesteGL.java",					
    		  };
      
     
      String[] exclude = null;   
      String[] cExcludes = null;
      String[] src2Natives = null;
      
      if(genFFP) {
	  src2Natives = ffpSrc; /* Fixed Pipeline */ 
          exclude = ffpExclude;
          cExcludes = ffpcExclude;
      }else{ 
	  src2Natives = ppSrc;  /* Programable Pipeline */	
          exclude = ppExclude;
          cExcludes = ppcExclude;
      };
      
   
     
	if (generateCPP) {
	    System.out.println("\n\n### jnigen.generate...\n");
	    
	    NativeCodeGenerator jnigen = new NativeCodeGenerator();
	    jnigen.generate(src, // the .Java folder
		    bin, // the .class folder
		    jni, // output folder
		    src2Natives, // files/directories to parse and generate files *.h
		    exclude); // files/directores to exclude
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
	  String libGLESAngle64 =" -llibGLESv2-x64 ";
	  String libGLESAngle86 =" -llibGLESv2 ";
	  String libEGL = " -lEGL";
	  String libGLES=" -lGLESv2 ";
	  String libGLES_CM=" -lGLES_CM";
	  String libMaliEMulator =" -lMaliEmulator ";
	 
	  switch (sdk) {
	    case ADRENO:
		 headerDir = ADRENO_SDK.mergeInclude(headerDir);
		 libsWin32Dir = ADRENO_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = ADRENO_SDK.mergeWin64Lib(libsWin64Dir);
		 break;		 
		 
	    case ANGLE:
		 headerDir = ANGLE_SDK.mergeInclude(headerDir);
		 libsWin32Dir = ANGLE_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = ANGLE_SDK.mergeWin64Lib(libsWin64Dir);
		 break;		 
	    case MALI:
		 headerDir = MALI_SDK.mergeInclude(headerDir);
		 libsWin32Dir = MALI_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = MALI_SDK.mergeWin64Lib(libsWin64Dir);
		 libsWin64Dir = merge(libsWin64Dir, libMaliEMulator);

		 break;
	    case PowerVR:
		 headerDir = PowerVR_SDK.mergeInclude(headerDir);
		 libsWin32Dir = PowerVR_SDK.mergeWin32Lib(libsWin32Dir);
		 libsWin64Dir = PowerVR_SDK.mergeWin64Lib(libsWin64Dir);
		 break;
		 
	    default:
		break;
	    }
	  
	  String GLES_LIB="";
	  if(genFFP){
	      GLES_LIB = libGLES_CM;	      
	  }else{
	      GLES_LIB =  libEGL + (sdk==SDK_Build.ANGLE ? libGLESAngle64 : libGLES); 	     
	  }
	  
	     String[] cIncludes = {"DLLMain.c",};
	    // Build Base
	    BuildTarget win32 = null;
	    win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
	    win32.cIncludes = cIncludes;
            win32.cppExcludes = exclude;
	    win32.compilerPrefix = "mingw32-";
	    win32.cppFlags += " ";
	    win32.headerDirs = headerDir;//
	    win32.libraries = SDKPath.libPath(libsWin32Dir) 
		             + " -ljawt -luser32 " + GLES_LIB  ;
		              //"-ljawt -lwinmm -lgdi32 -lshell32 -luser32 -lkernel32 -lcomctl32 ";
	    win32.cFlags += " -D_WINGDI_ -D_JNI_IMPLEMENTATION_ -DBUILD_DLL";
            win32.linkerFlags = " -Wl,--kill-at -shared -static -static-libgcc -static-libstdc++ "; 
	   // win32.linkerFlags = " -Wl,-verbose ";
            
            ///////////////////////////////////////////////////////////////////////////
            
            BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
            win64.cIncludes = cIncludes;
            win64.cppExcludes = cExcludes;
            win64.compilerPrefix = "";// "mingw32-";
            win64.headerDirs = headerDir;// {"HEADERS HERE"};
            win64.libraries = SDKPath.libPath(libsWin64Dir) +
                              "-ljawt -luser32 " + GLES_LIB;        	          
            
            win64.cFlags +=  " -D_WINGDI_ -D_JNI_IMPLEMENTATION_ -DBUILD_DLL";
            win64.linkerFlags += win32.linkerFlags;
            
            BuildTarget linux32 = null;
            BuildTarget linux64 = null;

            if (buildLinux) {
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
                if(genFFP){    
                    System.out.println("\n\n#### Create Ant Build  ... \n");
		    BuildConfig config = new BuildConfig("GLES_CM");
		    new AntScriptGenerator().generate(config, win32, win64);
                }else{
                    System.out.println("\n\n#### Create Ant Build  ... \n");
		    BuildConfig config = new BuildConfig("GLES");
		    new AntScriptGenerator().generate(config, win32, win64);                  
                }
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
	    
	    
    } //buildIt
   
   if(packIt){
       System.out.println("\n\n#### Pack it  ... \n");
       BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
       BuildExecutor.executeAnt("libs/buildNativeJar.xml", "-v pack-natives");
   }
   
  } // main
    
    
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
	    p = p.trim();
	    if(p.length()>1){
	        sb.append(" -L").append(p).append(" ");
	    }
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
