#include <gles.emulator.util.DrawingSurface.h>

//@line:13

  	  
      #define WIN32_LEAN_AND_MEAN
      #define VC_EXTRALEAN
      
      #include <windows.h>
      #include <assert.h>
      #include <stdlib.h> 
      #include <jni.h>
      #include <jawt.h>  
      #include "jawt_md.h"
      #include "main.h"
JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurface_lock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:44
 	  
	    
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	jint lock;

    	ds->env = env;
    	lock = ds->Lock(ds);

    	if ((lock & JAWT_LOCK_ERROR) != 0) {
        	return JNI_FALSE;
    	} else if ((lock & JAWT_LOCK_SURFACE_CHANGED) != 0) {
			ds->Unlock(ds);
        	return JNI_FALSE;
    	} else {
        return JNI_TRUE;
    	}
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurface_unlock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:75

	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
	ds->env = env;
	ds->Unlock(ds);
	        
        return JNI_TRUE;


}

