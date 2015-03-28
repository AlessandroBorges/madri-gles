/**
 * 
 */
package gles.emulator.util;

import java.awt.Component;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

/**
 * Utility class to handle Native AWT stuff
 * @author Alessandro Borges
 *
 */
public class JAWT {
    static{
	new JniGenSharedLibraryLoader("libs/GLES-natives.jar").load("GLES");
}
    
    
    
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
	
	private Component c;
	/** AWT Handle */
	private long awtHandle = 0;
	
	
	/** JAWT_DrawingSurface handle */
	private DrawingSurface ds=null;
	//private long dsHandle=0;
	
	/** JAWT_DrawingSurfaceInfo handle */
	private DrawingSurfaceInfo dsi = null;
	//private long dsiHandle=0;
	
	/**
	 * status of DrawingSurface locking
	 */
	private boolean gotDsiLock = false;
	
	
	public JAWT(Component componentAWT){
		this.c = componentAWT;
	}
	
	
	public long getAwtHandler(){
	    if(awtHandle==0){
		awtHandle = getAWT0();
	    }
	    return awtHandle;
	}
	/**
	 * get the AWT handler
	 * @return
	 */
	private static native long getAWT0();/*
	
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
	    
	 */
	
	
    /**
     * Get the drawing surface info. The value returned may be cached, but the
     * values may change if additional calls to Lock() or Unlock() are made.
     * Lock() must be called before this can return a valid value. Returns NULL
     * if an error has occurred. When finished with the returned value,
     * FreeDrawingSurfaceInfo must be called.
     * 
     * 
     * @param drawingSurface
     * @return
     */
	public DrawingSurfaceInfo getDrawingSurfaceInfo(){
	    final DrawingSurface drawingSurface = getDrawingSurface();
	    long handle = getDrawingSurfaceInfo0(drawingSurface.getNativeHandle());
	    if(dsi==null){
		dsi = new DrawingSurfaceInfo(handle);
	    }else{
		// check handler against old value.
		if(handle != dsi.getNativeHandle()){
		    // then  reset dsi !!
		}
	    }
	    
	    return dsi;	    
	}
	
	/**
	 * Get DrawingSurfaceInfo handler
	 * @param dsObj
	 * @return
	 */
	private static native long getDrawingSurfaceInfo0(long dsObj);/*
	
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
      */
	
	
	
	
	
	/**
	 * get Component's DrawingSurface
	 * @return drawing surface
	 */
	public DrawingSurface getDrawingSurface(){
	    if(null == this.c){
		throw new RuntimeException("AWT Component is null.");
	    }
	    if(ds==null){
		long handle = getDrawingSurfaceAWT0(this.c, getAwtHandler());
		ds = new DrawingSurface(handle);
	    }
	    return ds;
	}
	
	private static  native long getDrawingSurfaceAWT0(Component canvas, long awtObj);/*
	JAWT *awt = (JAWT*) awtObj;
      	JAWT_DrawingSurface *ds;

      	ds = awt->GetDrawingSurface(env, canvas);
      	if (ds == NULL) {
	    fprintf(stderr, "NULL drawing surface\n");
	    return 0;
      	}
      	return (jlong)ds;
	*/
	
	/**
	 * Get windows HWND handler ( nice !) 
	 * @param canvas AWT Component 
	 * @param dsObj DrawingSurface handler
	 * @param dsiObj DrawingSurfaceInfo handler
	 * @param display 
	 * @param screen
	 * @return
	 */
	private static native long getDrawingSurfaceWindowIdAWT(Component canvas, 
			long dsObj, 
			long dsiObj, 
			long display, 
			int screen);/*
			
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
	*/
	
	/**
	 * performs a AWT lock
	 * @return
	 */
	public boolean awtLock(){
	    long handler = getAwtHandler();
	    if(handler != 0)
		return lockGlobal0(getAwtHandler());
	    else
		return false;
	}
	/**
	 * Lock AWT	
	 * @param awt AWT handler
	 */
	private static native boolean lockGlobal0(long awt);/*
	   ((JAWT *) awt)->Lock(env);
	   return JNI_TRUE;
	*/

	
    /**
     * performs a AWT lock
     * 
     * @return
     */
    public boolean awtUnlock() {
	long handler = getAwtHandler();
	if (handler != 0)
	    return unlockGlobal0(getAwtHandler());
	else
	    return false;
    }
    /**
     * unlock AWT
     * 
     * @param awt - AWT handler
     */
    private static native boolean  unlockGlobal0(long awt);/*
          ((JAWT *) awt)->Unlock(env);
           return JNI_TRUE;
    */
	
    /**
     * Free all resources
     * @param awtObj the AWT component handler
     * @param drawingSurface the DrawingSurface handler
     * @param drawingSurfaceInfo the DrawingSurfaceInfo handler
     */
	public static native void freeResource(long awtObj, long drawingSurface, long drawingSurfaceInfo);/*
	    JAWT *awt = (JAWT*) awtObj;
	    JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) drawingSurfaceInfo;
    
    	ds->env = env;
    	ds->FreeDrawingSurfaceInfo(dsi);
    	awt->FreeDrawingSurface(ds);	
	*/
	
	/**
	 * check Drawing Surface lock status
	 * @return
	 */
	public synchronized boolean isLocked() {
		return gotDsiLock;
	}

	public synchronized void contextValidated() {
	       // canvas.validCtx = true;
	    }
	
	/**
	 * Request lock for rendering
	 * @return
	 */
    public synchronized boolean dsLock() {
	if (ds == null) {
	    return false;
	} else {
	    if (ds.lock()) {
		gotDsiLock = true;
		return true;
	    } else
		return false;

	}
    }
    
    public synchronized boolean dsUnlock() {
	if (ds == null) {
	    return false;
	} else {
	    if (ds.unlock()) {
		gotDsiLock = true;
		return true;
	    } else
		return false;

	}
    }
}




