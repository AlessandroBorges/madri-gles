package gles.emulator.util;

/**
	 * Our DrawingSurfaceInfo Wrapper
	 * @author Alessandro Borges
	 *
	 */
	public class DrawingSurfaceInfo extends ObjectHandler{
	  //@off
		/*JNI
		  
	    #include <madrigles.h>	    
	    #include <assert.h>
	    #include <stdlib.h> 
	    #include <jni.h>
	    #include <jawt.h>  
	    #include "jawt_md.h"	    
	  */
	    private DrawingSurface ds;
	    private JAWT awt;
	    public boolean alwaysUpdate = true;
	    
	    /**
	     * Index of EGLNativeDisplayType handler.
	     */
	    protected static final int EGLNativeDisplayType_index = 0;
	    /**
	     * Index of EGLNativePixmapType handler.
	     */
	    protected static final int EGLNativePixmapType_index = 1;
	    /**
	     * Index of EGLNativeWindowType handler.
	     */
	    protected static final int EGLNativeWindowType_index = 2;
	    
	    /**
	     * <pre>
	     * This long array will store the handlers for some EGL types.
	     *  Below are the corresponding native pointers:	     
	     *  ┌----------------------┬------------┬------------┐  
	     *  | EGL type             | Win32 type |  X11 unix  |
	     *  ├----------------------┼------------┼------------┤    
	     *  | EGLNativeDisplayType |   HDC      |  Display * |
	     *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
	     *  | EGLNativeWindowType  |   HWND     |  Window    |
	     *  └----------------------┴------------┴------------┘ 
	     *  
	     *  ┌----------------------┬---------------------┬----------------------┐  
	     *  | EGL type             |     Android         |  Apple IOS MACOS     |
	     *  ├----------------------┼---------------------┼----------------------┤    
	     *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
	     *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
	     *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
	     *  └----------------------┴---------------------┴----------------------┘
	     *   For IOS / Mac EGL handlers, 
	     *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
	     *  </pre>
	     * 
	     */
	    private long[] egl_handlers = null;
	    
	/**
	 * Pointer to the platform-specific information. This can be safely cast
	 * to a JAWT_Win32DrawingSurfaceInfo on Windows or a
	 * JAWT_X11DrawingSurfaceInfo on Solaris., when using the native Cocoa
	 * toolkit this is a pointer to a NSObject pointer to a NSObject / that
	 * conforms to the JAWT_SurfaceLayers protocol. 
	 * See jawt_md.h for
	 * details.
	 */    
	    private long platformInfo;
	    
	    /** Cached pointer to the underlying drawing surface */
	    private long  cachedDrawingSurface;
	    
	    /* Bounding rectangle of the drawing surface */
	    private JAWT_Rectangle bounds = null;
	    
	    /* Number of rectangles in the clip */
	    private int clipSize=0;
	    
	    /* Clip rectangle array */
	    private JAWT_Rectangle[] clip;
	    
	    /**
	     * the place holders for HWND and HDC
	     */
	    private long[] hwnd_hdc = new long[2];
	    
	    
	    
	    protected DrawingSurfaceInfo(int handle, JAWT awt, DrawingSurface ds) {
		super(handle);	
		this.awt = awt;
                this.ds = ds;
	    }
	    
	    protected DrawingSurfaceInfo(long handle, JAWT awt, DrawingSurface ds) {
		super(handle);		
		this.awt = awt;
		this.ds = ds;
	    }
	    
	   
	    
	    /**
	     * Get the native handler of <b>EGLNativeDisplayType</b>
	     * <pre>
	     * The EGL types are the following.
	     *  Below are the corresponding native pointers:	     
	     *  ┌----------------------┬------------┬------------┐  
	     *  | EGL type             | Win32 type |  X11 unix  |
	     *  ├----------------------┼------------┼------------┤    
	     *  | EGLNativeDisplayType |   HDC      |  Display * |
	     *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
	     *  | EGLNativeWindowType  |   HWND     |  Window    |
	     *  └----------------------┴------------┴------------┘ 
	     *  
	     *  ┌----------------------┬---------------------┬----------------------┐  
	     *  | EGL type             |     Android         |  Apple IOS MACOS     |
	     *  ├----------------------┼---------------------┼----------------------┤    
	     *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
	     *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
	     *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
	     *  └----------------------┴---------------------┴----------------------┘
	     *   For IOS / Mac EGL handlers, 
	     *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
	     *   
	     *  </pre>
	     *	 @see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h   
	     * @return nstive handler of EGLNativeDisplayType
	     */
	    public long getEGLNativeDisplayType(){
		if(null == egl_handlers || alwaysUpdate){
		    updateEGLhandlers();
		}
		return egl_handlers[EGLNativeDisplayType_index];
	    }
	    
	    /**
	     * Get the native handler of <b>EGLNativePixmapType</b>
	     * <pre>
	     * The EGL types are the following.
	     *  Below are the corresponding native pointers:	     
	     *  ┌----------------------┬------------┬------------┐  
	     *  | EGL type             | Win32 type |  X11 unix  |
	     *  ├----------------------┼------------┼------------┤    
	     *  | EGLNativeDisplayType |   HDC      |  Display * |
	     *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
	     *  | EGLNativeWindowType  |   HWND     |  Window    |
	     *  └----------------------┴------------┴------------┘ 
	     *  
	     *  ┌----------------------┬---------------------┬----------------------┐  
	     *  | EGL type             |     Android         |  Apple IOS MACOS     |
	     *  ├----------------------┼---------------------┼----------------------┤    
	     *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
	     *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
	     *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
	     *  └----------------------┴---------------------┴----------------------┘
	     *   For IOS / Mac EGL handlers, 
	     *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
	     *  </pre>
	     *	    
	     * @return nstive handler of EGLNativePixmapType
	     */
	    public long getEGLNativePixmapType(){
		if(null == egl_handlers|| alwaysUpdate){
		    updateEGLhandlers();
		}
		return egl_handlers[EGLNativePixmapType_index];
	    }
	    
	    /**
	     * Get the native handler of <b>EGLNativeWindowType</b>
	     * <pre>
	     * The EGL types are the following:	     
	     *  ┌----------------------┬------------┬------------┐  
	     *  | EGL type             | Win32 type |  X11 unix  |
	     *  ├----------------------┼------------┼------------┤    
	     *  | EGLNativeDisplayType |   HDC      |  Display * |
	     *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
	     *  | EGLNativeWindowType  |   HWND     |  Window    |
	     *  └----------------------┴------------┴------------┘ 
	     *  
	     *  ┌----------------------┬---------------------┬----------------------┐  
	     *  | EGL type             |     Android         |  Apple IOS MACOS     |
	     *  ├----------------------┼---------------------┼----------------------┤    
	     *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
	     *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
	     *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
	     *  └----------------------┴---------------------┴----------------------┘
	     *   For IOS / Mac EGL handlers, 
	     *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
	     *  </pre>
	     *	    
	     * @return nstive handler of EGLNativeWindowType
	     */
	    public long getEGLNativeWindowType(){
		if(null == egl_handlers || alwaysUpdate){
		    updateEGLhandlers();
		}
		return egl_handlers[EGLNativeWindowType_index];
	    }
	    
	    /**
	     * update EGL native handlers. 
	     */
	    private void updateEGLhandlers(){
		if(this.egl_handlers == null){
		    egl_handlers = new long[3];
		}
        JAWT.updateDSIEGLhandlers0(// awt.getAwtHandler(),
		                   ds.getNativeHandle(),
		                   getNativeHandle(),
		                   egl_handlers);
	    }
	    
	    /**
	     * get HWND 
	     * @return
	     */
	    public long getHWND(){
		if(JAWT.getHWND(ds.getNativeHandle(), getNativeHandle(), hwnd_hdc)){
		    return hwnd_hdc[0];
		}else{
		    return 0;
		}
	    }
	    
	    /**
	     * get HDC
	     * @return
	     */
	    public long getHDC(){
		if(JAWT.getHWND(ds.getNativeHandle(), getNativeHandle(), hwnd_hdc)){
		    return hwnd_hdc[1];
		}else{
		    return 0;
		}
	    }
	    
	    /**
	     * Get native dimensions
	     * @return native dimensions
	     */
	    public JAWT_Rectangle getRectangle(){
		JAWT_Rectangle rect = new JAWT_Rectangle();
		int[] val = new int[4];
        if (JAWT.getRectangle0(ds.getNativeHandle(), this.getNativeHandle(),
                val)) {
		  rect.x = val[0];
		  rect.y = val[1];
		  rect.width = val[2];
		  rect.height = val[3];
		}
		return rect;
	    }
	    
	  
	    
   } // class  
 