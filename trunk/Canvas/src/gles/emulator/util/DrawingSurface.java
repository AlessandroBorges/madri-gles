package gles.emulator.util;

/**
 *  Our DrawingSurfaceInfo Wrapper
 * @author Alessandro Borges
 *
 */
public class DrawingSurface extends ObjectHandler{
    


//@off
  	/*JNI
  	  
      #define WIN32_LEAN_AND_MEAN
      #define VC_EXTRALEAN
      
      #include <windows.h>
      #include <assert.h>
      #include <stdlib.h> 
      #include <jni.h>
      #include <jawt.h>  
      #include "jawt_md.h"
      #include "main.h"
*/
    protected DrawingSurface(int handle) {
	super(handle);		
    }
    
    protected DrawingSurface(long handle) {
	super(handle);		
    }
    
/**
 * Lock AWT DrawingSurface. Call it before OpenGL call.
 * 
 * @return true if it is locked , false otherwise
 */
public boolean lock() {
    return lock0(this.getNativeHandle());
}
    

private static native boolean lock0(long drawingSurface);/* 	  
	    
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
	*/

/**
 * Unlock this drawing surface after OpenGL Draw
 *	 
 */
public boolean unlock() {
    return unlock0(getNativeHandle());
}

/**
 * Unlock AWT after OpenGL Draw
 * @param drawingSurface - the unlocking DrawingSurface handler 
 *
 */
private static native boolean unlock0(long drawingSurface);/*
	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
	ds->env = env;
	ds->Unlock(ds);
	        
        return JNI_TRUE;
*/
    
}