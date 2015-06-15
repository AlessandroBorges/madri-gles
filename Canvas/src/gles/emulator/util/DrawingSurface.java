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
    
    /**
     * status of locking
     */
    private boolean isLocked = false;
    
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
        isLocked = JAWT.lock0(this.getNativeHandle()); 
        return  isLocked;
    }

    /**
     * Unlock this drawing surface after OpenGL Draw
     *
     */
    public boolean unlock() {
        isLocked = !JAWT.unlock0(getNativeHandle()); 
        return isLocked;
    }
    
    public boolean isLocked(){
        return isLocked;
    }

    /**
     * Release DrawingSurfaceInfo dsi.
     * Call it before release()
     * @see #getDrawingSurfaceInfo()
     * @see #release()
     * 
     * @param dsi
     * @return true if freeing dsi was success
     * 
     */
    public boolean freeDrawingSurfaceInfo(DrawingSurfaceInfo dsi) {
        return JAWT.freeDrawingSurfaceInfo0(this.getNativeHandle(), dsi.getNativeHandle());
    }
    
    /**
     * Get DrawingSurfaceInfo related to this DS.<br> 
     * It calls lock() / unlock() before and after executing this method. 
     * 
     * @return
     */
    public DrawingSurfaceInfo getDrawingSurfaceInfo(){
        DrawingSurfaceInfo dsi=null;
        long dsiHandle = JAWT.getDrawingSurfaceInfo0(this.getNativeHandle());
        dsi = new DrawingSurfaceInfo(dsiHandle, awt, this);
        return  dsi;
    }
    
    /**
     * Release this DS.
     * DrawingSurfaceInfo related to this must be released *BEFORE* you call this method.
     * 
     */
    public void release(){
        super.release();
        this.awt = null;
    }
    

}
