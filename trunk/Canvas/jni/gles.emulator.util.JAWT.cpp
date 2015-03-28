#include <gles.emulator.util.JAWT.h>

//@line:23

	  
    #define WIN32_LEAN_AND_MEAN
    #define VC_EXTRALEAN
    
    #include <windows.h>
    #include <assert.h>
    #include <stdlib.h> 
    #include <jni.h>
    #include <jawt.h>  
    #include "jawt_md.h"
    #include "main.h"

 
   
    JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getAWT0(JNIEnv* env, jclass clazz) {


//@line:74

	
	    JAWT *awt;
	    awt = (JAWT*) malloc(sizeof(JAWT));
	    if (awt == NULL) {
		 fprintf(stderr, "malloc failed\n");
		 return 0;
	    }

	    awt->version = JAWT_VERSION_1_4;

	    if (JAWT_GetAWT(env, awt) == JNI_FALSE) {
		fprintf(stderr, "AWT not found\n");
		return 0;
	    }

	    return (jlong)awt;
	    
	 

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsObj) {


//@line:126

	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsObj;
      	JAWT_DrawingSurfaceInfo *dsi;
       	jint lock;

       ds->env = env;
       lock = ds->Lock(ds);
       if ((lock & JAWT_LOCK_ERROR) != 0) {
	       fprintf(stderr, "Error locking surface\n");
	       return 0;
       }

       dsi = ds->GetDrawingSurfaceInfo(ds);

       if (dsi == NULL) {
	     fprintf(stderr, "Error GetDrawingSurfaceInfo\n");
	     ds->Unlock(ds);
	     return 0;
       }
       
      return (jlong)dsi;
      

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceAWT0(JNIEnv* env, jclass clazz, jobject canvas, jlong awtObj) {


//@line:169

	JAWT *awt = (JAWT*) awtObj;
      	JAWT_DrawingSurface *ds;

      	ds = awt->GetDrawingSurface(env, canvas);
      	if (ds == NULL) {
	    fprintf(stderr, "NULL drawing surface\n");
	    return 0;
      	}
      	return (jlong)ds;
	

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceWindowIdAWT(JNIEnv* env, jclass clazz, jobject canvas, jlong dsObj, jlong dsiObj, jlong display, jint screen) {


//@line:194

			
      JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsObj;
      JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) dsiObj;
      jlong window;
      
      // win32 only !
      JAWT_Win32DrawingSurfaceInfo *wds = (JAWT_Win32DrawingSurfaceInfo*) dsi->platformInfo;
      window = (jlong)wds->hdc;    
     
     // Don't free DrawingSurfaceInfo here, otherwise
     // HDC will free in windows JDK1.4 and window
     // is invalid.
     
      ds->env = env;
      ds->Unlock(ds);

       return window;      
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_lockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:229

	   ((JAWT *) awt)->Lock(env);
	   return JNI_TRUE;
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_unlockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:252

          ((JAWT *) awt)->Unlock(env);
           return JNI_TRUE;
    

}

JNIEXPORT void JNICALL Java_gles_emulator_util_JAWT_freeResource(JNIEnv* env, jclass clazz, jlong awtObj, jlong drawingSurface, jlong drawingSurfaceInfo) {


//@line:263

	    JAWT *awt = (JAWT*) awtObj;
	    JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) drawingSurfaceInfo;
    
    	ds->env = env;
    	ds->FreeDrawingSurfaceInfo(dsi);
    	awt->FreeDrawingSurface(ds);	
	

}

