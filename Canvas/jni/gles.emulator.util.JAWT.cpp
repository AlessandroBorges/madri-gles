#include <gles.emulator.util.JAWT.h>

//@line:17
 
    #include "madrigles.h"
    #include <assert.h>
    #include <stdlib.h> 
    #include <jni.h>
    #include <jawt.h>  
    #include "jawt_md.h"  

 /////////////////////////////////////////   
    JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getAWT0(JNIEnv* env, jclass clazz) {


//@line:66

	
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

	    return (jlong) awt;	    
	 

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsObj) {


//@line:117

	
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


//@line:158

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


//@line:183

			
      JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsObj;
      JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) dsiObj;
      jint lock;
      jlong window;
      
      ds->env = env;
      
      lock = ds->Lock(ds);
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
          printf("Error locking surface \n");
          ds->Unlock(ds);
          lock = ds->Lock(ds);
      }
      
      #ifdef OS_WIN32     
          JAWT_Win32DrawingSurfaceInfo *dsi_win = (JAWT_Win32DrawingSurfaceInfo*) dsi->platformInfo;
          window = (jlong)dsi_win->hwnd;
          //printf("releasing dsi \n");
          //ds->FreeDrawingSurfaceInfo(dsi);
          // Don't free DrawingSurfaceInfo here, otherwise
          // HDC will free in windows JDK1.4 and window
          // is invalid.
      
      #elif OS_UNIX
            jawt_X11DrawingSurfaceInfo *dsi_x11 = (jawt_X11DrawingSurfaceInfo*) dsi->platformInfo;
            window = (jint)dsi_x11->drawable;
            printf("releasing dsi \n");
            ds->FreeDrawingSurfaceInfo(dsi);
      #endif
    
      ds->Unlock(ds);

       return window;      
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_lockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:235

	   ((JAWT *) awt)->Lock(env);
	   return JNI_TRUE;
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_unlockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:258

          ((JAWT *) awt)->Unlock(env);
           return JNI_TRUE;
    

}

JNIEXPORT void JNICALL Java_gles_emulator_util_JAWT_freeResource(JNIEnv* env, jclass clazz, jlong awtObj, jlong drawingSurface, jlong drawingSurfaceInfo) {


//@line:269

	    JAWT *awt = (JAWT*) awtObj;
	    JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	    JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) drawingSurfaceInfo;
    
    	    ds->env = env;
    	    ds->FreeDrawingSurfaceInfo(dsi);
    	    awt->FreeDrawingSurface(ds);	
	

}

