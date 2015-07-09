/**
 * Disclaimer
 */
package gles.internal;

import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

import android.opengl.EGL14;

/**
 * Implementation of javax.microedition.khronos.egl.EGL10
 * @author Alessandro Borges
 *
 */
public class EGL10Impl implements EGL, EGL10, EGL11 {
    
    private static final int offset = 0;

    private static android.opengl.EGLConfig fix(EGLConfig config) {
        EGLConfigImpl conf = (EGLConfigImpl) (config);
        return conf;
    }

    private static android.opengl.EGLDisplay fix(EGLDisplay display) {
        return (android.opengl.EGLDisplay) display;
    }

    private static android.opengl.EGLConfig[] fix(EGLConfig[] config) {
        if (config == null) return null;
        return (android.opengl.EGLConfig[]) config;
    }
    
    private static android.opengl.EGLSurface fix(EGLSurface surface) {
        return (android.opengl.EGLSurface) surface;
    }
    
    private static android.opengl.EGLContext fix(EGLContext context) {
        if(context == null || context.equals(EGL_NO_CONTEXT)){
            return EGL14.EGL_NO_CONTEXT;
        }        
        long handle = ((EGLContextImpl)context).mEGLContext;        
        return (android.opengl.EGLContext) EGLUtil.createEGLContext(handle);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglChooseConfig(javax.microedition
     * .khronos.egl.EGLDisplay, int[],
     * javax.microedition.khronos.egl.EGLConfig[], int, int[])
     */
    @Override
    public boolean eglChooseConfig(
                                   EGLDisplay display,
                                   int[] attrib_list,
                                   EGLConfig[] configs,
                                   int config_size,
                                   int[] num_config) {
        
        return EGL14.eglChooseConfig(fix(display), 
                                     attrib_list, 0, 
                                     fix(configs), 0, 
                                     config_size, 
                                     num_config, 0);        
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglCopyBuffers(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface,
     * java.lang.Object)
     * prototype:
     *  EGLBoolean eglCopyBuffers ( EGLDisplay dpy, EGLSurface surface, EGLNativePixmapType target )
     */
    @Override
    public boolean eglCopyBuffers(EGLDisplay display, EGLSurface surface, Object native_pixmap) {      
        int target = 0;
        if(native_pixmap instanceof Number){
            target = ((Number)native_pixmap).intValue();
        }else {
            throw new IllegalArgumentException("Unsupported pointer to native_pixmap");
        }   
        return EGL14.eglCopyBuffers(fix(display), fix(surface),  target);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglCreateContext(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig,
     * javax.microedition.khronos.egl.EGLContext, int[])
     */
    @Override
    public EGLContext eglCreateContext(EGLDisplay display, 
                                       EGLConfig config, 
                                       EGLContext share_context, 
                                       int[] attrib_list) {
      
        android.opengl.EGLContext ctx = EGL14.eglCreateContext( fix(display), 
                                                                fix(config), 
                                                                fix(share_context), 
                                                                attrib_list, 0);
        
        EGLContext egl10Ctx = new EGLContextImpl(ctx.getNativeHandle()) ;
        return egl10Ctx;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglCreatePbufferSurface(javax.
     * microedition.khronos.egl.EGLDisplay,
     * javax.microedition.khronos.egl.EGLConfig, int[])
     */
    @Override
    public EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attrib_list) {       
        return EGL14.eglCreatePbufferSurface(fix(display), fix(config), attrib_list, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglCreatePixmapSurface(javax.
     * microedition.khronos.egl.EGLDisplay,
     * javax.microedition.khronos.egl.EGLConfig, java.lang.Object, int[])
     */
    @Override
    public EGLSurface eglCreatePixmapSurface(
                                             EGLDisplay display,
                                             EGLConfig config,
                                             Object native_pixmap,
                                             int[] attrib_list) {    
        int pixmap = 0;
        if(native_pixmap instanceof Number){
            pixmap = ((Number)native_pixmap).intValue();
        }else {
            throw new IllegalArgumentException("Unsupported pointer to native_pixmap");
        }   
        return EGL14.eglCreatePixmapSurface(fix(display), fix(config), pixmap, attrib_list, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglCreateWindowSurface(javax.
     * microedition.khronos.egl.EGLDisplay,
     * javax.microedition.khronos.egl.EGLConfig, java.lang.Object, int[])
     */
    @Override
    public EGLSurface eglCreateWindowSurface(
                                             EGLDisplay display,
                                             EGLConfig config,
                                             Object native_window,
                                             int[] attrib_list) {
        return EGL14.eglCreateWindowSurface( fix(display), 
                                             fix(config), 
                                             native_window, 
                                             attrib_list, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglDestroyContext(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLContext)
     */
    @Override
    public boolean eglDestroyContext(EGLDisplay display, EGLContext context) {       
        return EGL14.eglDestroyContext(fix(display), fix(context));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglDestroySurface(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface)
     */
    @Override
    public boolean eglDestroySurface(EGLDisplay display, EGLSurface surface) {        
        return EGL14.eglDestroySurface(fix(display), fix(surface));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglGetConfigAttrib(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, int,
     * int[])
     */
    @Override
    public boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config, int attribute, int[] value) {        
        return EGL14.eglGetConfigAttrib(fix(display), fix(config), attribute, value, attribute);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglGetConfigs(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[], int,
     * int[])
     */
    @Override
    public boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs, int config_size, int[] num_config) {
        
        return EGL14.eglGetConfigs(fix(display), fix(configs), offset, config_size, num_config, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentContext()
     */
    @Override
    public EGLContext eglGetCurrentContext() {
        EGLContext egl10ctx;
        
        android.opengl.EGLContext ctx = EGL14.eglGetCurrentContext();
        if(ctx.equals(EGL14.EGL_NO_CONTEXT)){
            egl10ctx = EGL10.EGL_NO_CONTEXT;
        }else{
            egl10ctx = new EGLContextImpl(ctx.getNativeHandle());
        }
        return egl10ctx;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentDisplay()
     */
    @Override
    public EGLDisplay eglGetCurrentDisplay() {      
        return EGL14.eglGetCurrentDisplay();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentSurface(int)
     */
    @Override
    public EGLSurface eglGetCurrentSurface(int readdraw) {        
        return EGL14.eglGetCurrentSurface(readdraw);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetDisplay(java.lang.Object)
     */
    @Override
    public EGLDisplay eglGetDisplay(Object native_display) {
        int display_id = 0;
        if(native_display == null || native_display == EGL10.EGL_DEFAULT_DISPLAY){
            display_id = EGL14.EGL_DEFAULT_DISPLAY;
        } else if(native_display instanceof Number){
            display_id = ((Number)native_display).intValue();            
        }
        return EGL14.eglGetDisplay(display_id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetError()
     */
    @Override
    public int eglGetError() {        
        return EGL14.eglGetError();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglInitialize(javax.microedition
     * .khronos.egl.EGLDisplay, int[])
     */
    @Override
    public boolean eglInitialize(EGLDisplay display, int[] major_minor) {        
        int[] mm = new int[2];
        boolean success = EGL14.eglInitialize(fix(display), mm,0, mm, 1);
        if (success && major_minor != null) {
            int len = major_minor.length;
            if (len>0) {
                // we're exposing only EGL 1.0                
                if (len >= 1) major_minor[0] = 1;
                if (len >= 2) major_minor[1] = 0;                
            } 
        }
        return success;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglMakeCurrent(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface,
     * javax.microedition.khronos.egl.EGLSurface,
     * javax.microedition.khronos.egl.EGLContext)
     */
    @Override
    public boolean eglMakeCurrent( EGLDisplay display, 
                                   EGLSurface draw, 
                                   EGLSurface read, 
                                   EGLContext context) {
        return EGL14.eglMakeCurrent(fix(display), fix(draw), fix(read), fix(context));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglQueryContext(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLContext, int,
     * int[])
     */
    @Override
    public boolean eglQueryContext(EGLDisplay display, EGLContext context, int attribute, int[] value) {       
        return EGL14.eglQueryContext(fix(display), fix(context), attribute, value, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglQueryString(javax.microedition
     * .khronos.egl.EGLDisplay, int)
     */
    @Override
    public String eglQueryString(EGLDisplay display, int name) {        
        return EGL14.eglQueryString(fix(display), name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglQuerySurface(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface, int,
     * int[])
     */
    @Override
    public boolean eglQuerySurface(EGLDisplay display, EGLSurface surface, int attribute, int[] value) {
        return EGL14.eglQuerySurface(fix(display), fix(surface), attribute, value, offset); 
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglReleaseThread()
     */
    @Override
    public boolean eglReleaseThread() {       
        return EGL14.eglReleaseThread();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglSwapBuffers(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface)
     */
    @Override
    public boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface) {        
        return EGL14.eglSwapBuffers(fix(display), fix(surface));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglTerminate(javax.microedition.
     * khronos.egl.EGLDisplay)
     */
    @Override
    public boolean eglTerminate(EGLDisplay display) {        
        return EGL14.eglTerminate(fix(display));
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglWaitGL()
     */
    @Override
    public boolean eglWaitGL() {       
        return EGL14.eglWaitGL();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglWaitNative(int,
     * java.lang.Object)
     */
    @Override
    public boolean eglWaitNative(int engine, Object bindTarget) {        
        return EGL14.eglWaitNative(engine);
    }

}
