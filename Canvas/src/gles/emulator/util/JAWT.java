/**
 * 
 */
package gles.emulator.util;

import gles.emulator.Sys;
import gles.internal.EGLUtil;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

/**
 * Utility class to handle Native AWT stuff
 * @author Alessandro Borges
 *
 */
public class JAWT {
   //@off
   /*JNI 
    #include "madrigles.h"
    #include <assert.h>
    #include <stdlib.h> 
    #include <jni.h>
    #include <jawt.h>  
    #include "jawt_md.h"  
     
    using namespace std;
    
     
   // static JAWT *mAWT = NULL;

 /////////////////////////////////////////   
    */
    
    static{
        
        Sys.loadNativeLibs();
        
//        System.out.println("Library path" + System.getProperty("java.library.path"));
//        new JniGenSharedLibraryLoader("libs/GLES-natives.jar").load("GLES");
//        System.load("C:/Users/Livia/workspace/Canvas/libs/TextureConverter.dll");
//        System.load("C:/Users/Livia/workspace/Canvas/libs/log4cplus.dll");
//        System.load("C:/Users/Livia/workspace/Canvas/libs/libMaliEmulator.dll");
//      
//        System.load("C:/Users/Livia/workspace/Canvas/libs/angle/d3dcompiler_46.dll");
//        System.load("C:/Users/Livia/workspace/Canvas/libs/angle/libGLESv2.dll");
//        System.load("C:/Users/Livia/workspace/Canvas/libs/angle/libEGL.dll");
//        
//        System.load("C:/Users/Livia/workspace/Canvas/libs/GLES64.dll");
        }
	
	private Component c;
	/** AWT Handle */
	private long awtHandle = 0;
	
	
	/** JAWT_DrawingSurface handle */
	private DrawingSurface m_ds=null;
	//private long dsHandle=0;
	
	/** JAWT_DrawingSurfaceInfo handle */
	private DrawingSurfaceInfo m_dsi = null;
	//private long dsiHandle=0;
	
	/**
	 * status of DrawingSurface locking
	 */
	private boolean gotDsiLock = false;
	
	
	public JAWT(Component componentAWT){
		this.c = componentAWT;
	}
	
     /**
     * get native AWT handler
     * @return native handler
     */	
   public long getAwtHandler(){
	    if(awtHandle==0){
		awtHandle = getAWT0();
	    }
	    return awtHandle;
	}
	/**
	 * get native AWT handler
	 * @return native handler
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

	    return (jlong) awt;	    
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
     * @return dsi instance
     */
	public DrawingSurfaceInfo getDrawingSurfaceInfo(){
	    final DrawingSurface drawingSurface = getDrawingSurface();
	    long handle = getDrawingSurfaceInfo0(drawingSurface.getNativeHandle());
	    if(m_dsi==null){
		m_dsi = new DrawingSurfaceInfo(handle, this, drawingSurface);
	    }	    
	    return m_dsi;	    
	}
	
	/**
	 * Releases DrawingSurfaceInfo.<br>
	 * Same as {@link DrawingSurface#freeDrawingSurfaceInfo(DrawingSurfaceInfo)}
	 * @param dsi DrawingSurfaceInfo to release
	 * @return true if dsi was freed.false if dsi was null or failed to release
	 */
	public boolean freeDrawingSurfaceInfo(DrawingSurfaceInfo dsi){
	    if(dsi == null) return false;
	    final DrawingSurface ds = dsi.getDrawingSurface();
	    //ds.freeDrawingSurfaceInfo(dsi);
	    boolean ok =  freeDrawingSurfaceInfo0(ds.getNativeHandle(), dsi.getNativeHandle());
	    if(ok){
	        dsi.release();
	        // releasing local m_dsi
	        if(this.m_dsi != null && dsi.getNativeHandle() == m_dsi.getNativeHandle()){
	            this.m_dsi = null;
	        }
	    }	        
	    return ok;
	}
	
	/**
	 * Get DrawingSurfaceInfo handler
	 * @param dsObj
	 * @return
	 */
	protected static native long getDrawingSurfaceInfo0(long dsObj);/*	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsObj;
      	JAWT_DrawingSurfaceInfo *dsi;
       	jint lock;

        ds->env = env;
        lock = ds->Lock(ds);
        if ((lock & JAWT_LOCK_ERROR) != 0) {
	       fprintf(stderr, "Error locking surface. Try again...\n");
	       //try again
	       ds->Unlock(ds);
	       lock = ds->Lock(ds);
	       // check 
	       if ((lock & JAWT_LOCK_ERROR) != 0) {
	        fprintf(stderr, "Error locking surface #2. Give up!\n");
	         return 0;
	       }
        }

       dsi = ds->GetDrawingSurfaceInfo(ds);

       if (dsi == NULL) {
	     fprintf(stderr, "Error GetDrawingSurfaceInfo\n");
	     ds->Unlock(ds);
	     return 0;
       }
       //unlock
       ds->Unlock(ds);
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
	    if(m_ds==null){
		long handle = getDrawingSurfaceAWT0(this.c, getAwtHandler());
		m_ds = new DrawingSurface(handle);
	    }
	    return m_ds;
	}
	
    /**
     * Get Canvas's DrawingSurface handle
     * @param canvas - Canvas instance
     * @param awtObj - awt handle
     * @return
     */
	private static  native long getDrawingSurfaceAWT0(Component canvas, long awtHandle);/*
	    JAWT *awt = (JAWT*) awtHandle;
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
	 * @param dsHandle DrawingSurface handler
	 * @param dsiHandle DrawingSurfaceInfo handler
	 * @param display display handle
	 * @param screen screen id
	 * 
	 * @return HWND handler
	 */
	private static native long getDrawingSurfaceWindowIdAWT(Component canvas, 
			long dsHandle, 
			long dsiHandle, 
			long display, 
			int screen);/*
			
      JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsHandle;
      JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) dsiHandle;
      jint lock;
      jlong window;
      //update JNI's env*
      
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
	*/
	
	/**
	 * performs a AWT lock
	 * @return
	 */
	public boolean awtLock(){
	    long handler = getAwtHandler();
	    if(handler != 0)
		return lockGlobal0(handler);
	    else
		return false;
	}
	/**
	 * Lock AWT	
	 * @param awt AWT handler
	 */
	private static native boolean lockGlobal0(long awt);/*
	  if(awt){
	   ((JAWT *) awt)->Lock(env);
	   return JNI_TRUE;
	   }else
	   return JNI_FALSE;
	*/

	
    /**
     * performs a AWT lock
     * 
     * @return
     */
    public boolean awtUnlock() {
	long handler = getAwtHandler();
	if (handler != 0)
            return unlockGlobal0(handler);
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
     * release all resources.
     */
    public void release(){
        
    }

	/**
	 * Request a lock for DrawingSurface.Lock();
	 * @return true if ok
	 */
    public synchronized boolean dsLock() {
        if (m_ds == null) {
            m_ds = getDrawingSurface();
        }
        if (m_ds.lock()) {
            gotDsiLock = true;
            return true;
        } else 
            return false;
    }
    
    /**
     * Request a DrawingSurface.Unlock()
     * @return true if ok
     */
    public synchronized boolean dsUnlock() {
        if (m_ds == null) {
            m_ds = getDrawingSurface();
        }
        if (m_ds.unlock()) {
            gotDsiLock = true;
            return true;
        } else 
            return false;
    }
    
    //////////////////////////////////////////////////////////////
    // Native Methods of Drawing Surface 
    //////////////////////////////////////////////////////////////

    /**
     * Lock AWT before OpenGL Draw. <br>
     * Native call:  ds->Lock(ds);
     * 
     * @param drawingSurface - DrawingSurface handle 
     * @return true if ok.
     */
   protected static native boolean lock0(long drawingSurface);/* 
        JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
        jint lock = 0;

        ds->env = env;
        lock = ds->Lock(ds);

        if ((lock & JAWT_LOCK_ERROR) != 0) {
            return JNI_FALSE;
        } 
        else 
        if ((lock & JAWT_LOCK_SURFACE_CHANGED) != 0) {
            ds->Unlock(ds);
            
            //try again !
            ds->Lock(ds);            
            if ((lock & JAWT_LOCK_ERROR) != 0) {
                 return JNI_FALSE;
             }else 
                return JNI_TRUE;            
            //return JNI_FALSE;
        } else
        return JNI_TRUE;
        
     */


    /**
     * Unlock AWT after OpenGL Draw. <br>
     * Native call:  ds->Unlock(ds);
     * 
     * @param drawingSurface - the unlocking DrawingSurface handler 
     *
     */
    protected static native boolean unlock0(long drawingSurface);/* 
        JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
                
        ds->env = env;
        ds->Unlock(ds);
                                
        return JNI_TRUE;
    */
    
    //////////////////////////////////////////////////////////////
    // Native Methods of DrawingSurfaceInfo 
    //////////////////////////////////////////////////////////////

    /**
     * Get HWND and HDC from DrawingSurfaceInfo
     * @param dsiHandler
     * @param val
     * @return array with val[0] = HWND and val[1] = HDC 
     */
    protected static native boolean getHWND(long dsHandle,
                                          long dsiHandle, 
                                          long[] val);/*        
      JAWT_DrawingSurface *ds;
          JAWT_DrawingSurfaceInfo* dsi;                
          jint lock;  
          
          #ifdef OS_WIN32
              JAWT_Win32DrawingSurfaceInfo *dsi_win;
          #else
              JAWT_X11DrawingSurfaceInfo *dsi_x11;
          #endif                
          
          ds  = (JAWT_DrawingSurface *) dsHandle;               
          ds->env = env;
          
          lock = ds->Lock(ds);
          
           if((lock & JAWT_LOCK_ERROR) != 0){
               printf("Error locking surface. Try again...\n");
               ds->Unlock(ds);
               lock = ds->Lock(ds);
               
               if((lock & JAWT_LOCK_ERROR) != 0){
                   printf("Error #2 locking surface. Give up. \n");
                   return JNI_FALSE;
               }
           }
          
           // update dsi
           dsi = ds->GetDrawingSurfaceInfo(ds);
           //ignore older  one             
           //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
                       
       // Get the platform-specific drawing info
       
       #ifdef OS_WIN32        
                dsi_win = (JAWT_Win32DrawingSurfaceInfo *)dsi->platformInfo;
                if(dsi_win == NULL) return JNI_FALSE;                
                val[0] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType
                val[1] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType             
        #elif OS_UNIX
                 dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
                 if(dsi_x11 == NULL) return JNI_FALSE;                 
                 val[0] = (jlong) dsi_x11->drawable;   // EGLNativeWindowType
                 val[1] = (jlong) dsi_x11->display;    // EGLNativeDisplayType 
        #endif   
        
        // release dsi       
        ds->FreeDrawingSurfaceInfo(dsi);
        
        // Unlock the drawing surface
        ds->Unlock(ds);
             
        return JNI_TRUE;                
    */
    
    protected static native boolean getRectangle0(long dsHandle, 
                                                   long dsiHandle, 
                                                   int[] val);/*        
         JAWT_DrawingSurface *ds;
         JAWT_DrawingSurfaceInfo* dsi;
         jint lock;
                  
         ds  = (JAWT_DrawingSurface *) dsHandle; 
          
         ds->env = env;
         lock = ds->Lock(ds);
         if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                  printf("Error locking surface \n");
                  return JNI_FALSE;
          }
             
         // update dsi
         dsi = ds->GetDrawingSurfaceInfo(ds);
         //ignore older  one             
         //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
                             
          val[0] = dsi->bounds.x;
              val[1] = dsi->bounds.y;
              val[2] = dsi->bounds.width;
              val[3] = dsi->bounds.height;
          
         // Free the drawing surface info
         ds->FreeDrawingSurfaceInfo(dsi);
        
          // unlock  the drawing surface
          ds->Unlock(ds);   
               
          return JNI_TRUE;
       */
    
    /**
     * update EGL native handlers. 
     * @param dsiHandler
     * @param handlers
     */
    protected static native boolean updateDSIEGLhandlers0(//long awtHandle, 
                                                     long dsHandle,
                                                     long dsiHandler, 
                                                     long[] EGLhandlers);/*
      jint lock;
      // JAWT *awt; 
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
      // awt = (JAWT *) awtHandle;
       
      #ifdef OS_WIN32
              JAWT_Win32DrawingSurfaceInfo* dsi_win;
      #else
              JAWT_X11DrawingSurfaceInfo* dsi_x11;
      #endif
         
      ds = (JAWT_DrawingSurface *)dsHandle;      
      ds->env = env;
      lock = ds->Lock(ds);
     
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
            printf("Error locking surface \n");
            return 0;
       }
          
       // update dsi
       dsi = ds->GetDrawingSurfaceInfo(ds);
       
       if (dsi == NULL) {
           printf("Error getting surface info\n");
           ds->Unlock(ds);
           //awt.FreeDrawingSurface(ds);
            return JNI_FALSE;
       }
       
       //ignore older  one         
       //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;              
                       
       // Get the platform-specific drawing info
       
       #ifdef OS_WIN32         
            dsi_win = (JAWT_Win32DrawingSurfaceInfo *) dsi->platformInfo;
            if(dsi_win == NULL){
                return JNI_FALSE;
            }
            EGLhandlers[0] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType_index 0L
            EGLhandlers[1] = (jlong) dsi_win->hbitmap; // EGLNativePixmapType_index  1L
            EGLhandlers[2] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType_index  2L
        #endif               
        #ifdef OS_UNIX
            dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
            if(dsi_x11 == NULL){
                  return JNI_FALSE;
              }            
             EGLhandlers[0] = (jlong) dsi_x11->display;    // EGLNativeDisplayType_index 0L
             EGLhandlers[1] = (jlong) dsi_x11->colormapID; // EGLNativePixmapType_index  1L
             EGLhandlers[2] = (jlong) dsi_x11->drawable;   // EGLNativeWindowType_index  2L             
         #endif   
         
         // Free the drawing surface info 
         ds->FreeDrawingSurfaceInfo(dsi);
         
         // unlock the drawing surface
         ds->Unlock(ds);
         return JNI_TRUE;
    */

    protected static native boolean freeDrawingSurfaceInfo0(long dsHandle, long dsiHandle);/*
      jint lock;
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
         
      ds = (JAWT_DrawingSurface *) dsHandle;
      ds->env = env;
      
      dsi =(JAWT_DrawingSurfaceInfo *) dsiHandle;
      
      // lock DS
      lock = ds->Lock(ds);
      if((lock & JAWT_LOCK_ERROR) != 0 ) {
            printf("Error locking surface \n");
            return JNI_FALSE;
       }
     
      // Free the drawing surface info 
      ds->FreeDrawingSurfaceInfo(dsi);
       
       // unlock the drawing surface
       ds->Unlock(ds);
       return JNI_TRUE; 
    */
    
    protected static native boolean getDSIBounds(long dsHandle, long dsiHandle, int[] val);/*
         JAWT_DrawingSurface *ds;
         JAWT_DrawingSurfaceInfo* dsi;
         jint lock;
                  
         ds  = (JAWT_DrawingSurface *) dsHandle; 
          
         ds->env = env;
         lock = ds->Lock(ds);
         if ((lock & JAWT_LOCK_ERROR) != 0 ) {
             printf("Error locking surface \n");
             return JNI_FALSE;    
          }
             
         // update dsi                    
         dsi = (JAWT_DrawingSurfaceInfo*)dsiHandle;
                             
              val[0] = dsi->bounds.x;
              val[1] = dsi->bounds.y;
              val[2] = dsi->bounds.width;
              val[3] = dsi->bounds.height;
          
          // unlock  the drawing surface
          ds->Unlock(ds);   
               
          return JNI_TRUE;    
    */

    /**
     * Get the Canvas EGLDisplay.<br>
     * On Windows, it returns HDC
     * @return HDC / Display* pointer
     */
    public long getEGLNativeDisplayType() {
        DrawingSurface ds = this.getDrawingSurface();
        DrawingSurfaceInfo dsi = ds.getDrawingSurfaceInfo();
        long eglNativeDisplayType = dsi.getEGLNativeDisplayType();
        
        return eglNativeDisplayType;
    }
    
    /**
     * Get the Canvas' EGLSurface 
     * @return
     */
    public long getEGLNativeWindowType() {
        DrawingSurface ds = this.getDrawingSurface();
        DrawingSurfaceInfo dsi = ds.getDrawingSurfaceInfo();
        long eglNativeWindowType = dsi.getEGLNativeWindowType();
      
        return eglNativeWindowType;
    }
    
    
   
    
}




