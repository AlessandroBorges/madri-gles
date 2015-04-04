/**
 * Disclaimer
 */
package gles.internal;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/**
 * Implementation of javax.microedition.khronos.egl.EGL10
 * @author Alessandro Borges
 *
 */
public class EGL10Impl implements EGL10, EGL11 {

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
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.microedition.khronos.egl.EGL10#eglCopyBuffers(javax.microedition
     * .khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface,
     * java.lang.Object)
     */
    @Override
    public boolean eglCopyBuffers(EGLDisplay display, EGLSurface surface, Object native_pixmap) {
        // TODO Auto-generated method stub
        return false;
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
    public EGLContext eglCreateContext(EGLDisplay display, EGLConfig config, EGLContext share_context, int[] attrib_list) {
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentContext()
     */
    @Override
    public EGLContext eglGetCurrentContext() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentDisplay()
     */
    @Override
    public EGLDisplay eglGetCurrentDisplay() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentSurface(int)
     */
    @Override
    public EGLSurface eglGetCurrentSurface(int readdraw) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetDisplay(java.lang.Object)
     */
    @Override
    public EGLDisplay eglGetDisplay(Object native_display) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglGetError()
     */
    @Override
    public int eglGetError() {
        // TODO Auto-generated method stub
        return 0;
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
        // TODO Auto-generated method stub
        return false;
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
    public boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw, EGLSurface read, EGLContext context) {
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglReleaseThread()
     */
    @Override
    public boolean eglReleaseThread() {
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
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
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglWaitGL()
     */
    @Override
    public boolean eglWaitGL() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.microedition.khronos.egl.EGL10#eglWaitNative(int,
     * java.lang.Object)
     */
    @Override
    public boolean eglWaitNative(int engine, Object bindTarget) {
        // TODO Auto-generated method stub
        return false;
    }

}
