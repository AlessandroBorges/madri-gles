package gles.emulator.util;

/**
 *  Our DrawingSurfaceInfo Wrapper
 * @author Alessandro Borges
 *
 */
public class DrawingSurface extends ObjectHandler{
    


     //@off
      /*JNI
  	  
      #include <madrigles.h>
      #include <assert.h>
      #include <stdlib.h> 
      #include <jni.h>
      #include <jawt.h>  
        
*/
    /**
     * AWT reference
     */
    private JAWT awt;
    
    protected DrawingSurface(int handle, JAWT awt) {
	super(handle);	
	this.awt = awt;
    }
    
    protected DrawingSurface(long handle) {
	super(handle);	
	this.awt = awt;
    }
    
/**
 * Lock AWT DrawingSurface. Call it before OpenGL call.
 * 
 * @return true if it is locked , false otherwise
 */
public boolean lock() {
    return JAWT.lock0(this.getNativeHandle());
}
    


/**
 * Unlock this drawing surface after OpenGL Draw
 *	 
 */
public boolean unlock() {
    return JAWT.unlock0(getNativeHandle());
}

    
}
