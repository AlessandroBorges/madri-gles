#include <gles.emulator.util.DrawingSurface.h>

//@line:13

  	  
      #include <madrigles.h>
      #include <assert.h>
      #include <stdlib.h> 
      #include <jni.h>
      #include <jawt.h>  
        
JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurface_lock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:47
 	  
	    
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	jint lock;

    	ds->env = env;
    	lock = ds->Lock(ds);

    	if ((lock & JAWT_LOCK_ERROR) != 0) {
        	return JNI_FALSE;
    	} 
    	else 
    	if ((lock & JAWT_LOCK_SURFACE_CHANGED) != 0) {
	    ds->Unlock(ds);
            return JNI_FALSE;
    	} else 
        return JNI_TRUE;
    	
    	
      

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurface_unlock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:81
	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
	ds->env = env;
	ds->Unlock(ds);
	        
        return JNI_TRUE;


}

