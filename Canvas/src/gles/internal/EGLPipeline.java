package gles.internal;

import android.opengl.*;
import static gles.internal.EGLUtil.*;

/**
 * THIS IS A TEMPLATE
 ***/
@Deprecated
public class EGLPipeline implements Pipeline {
    /* 
     * CPP codes
     */
    //@off
    /*JNI  
        #include <stdio>
        #include <EGL/egl.h>
        #include <EGL/eglext.h> 
        #include <stdio.h>
        #include <stdlib.h>
        #include <vector>
          
        using namespace std;
        
        /////////////////////////////////////////////// 
      */
    
    
    /**
     * Private Constructor
     */
    private EGLPipeline(){}
    
    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._nativeClassInit();
     * 
     *
     **/
    public void EGL14ClassInit() {
        EGLPipeline.nEGL14ClassInit();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._nativeClassInit();
     * 
     *
     **/
    private static native void nEGL14ClassInit();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetError();
     * 
     *
     **/
    public int eglGetError() {
        return EGLPipeline.nEGLGetError();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetError();
     * 
     *
     **/
    private static native int nEGLGetError();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetDisplay([int display_id]);
     * 
     *
     **/
    public EGLDisplay eglGetDisplay(int displayID) {
        int handle = nEGLGetDisplay(displayID);
        EGLDisplay eglDisplay = createEGLDisplay(handle);
        return eglDisplay;
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetDisplay([int display_id]);
     * 
     * native version of eglDisplay
     * @param display_id handler of display
     * @return handler created for 
     */
    private static native int nEGLGetDisplay(int display_id);/*
          return (jint) eglGetDisplay( (NativeDisplayType)display_id);
    */

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetDisplay([long display_id]);
     * 
     *
     *
     * {@hide}
     */
    public EGLDisplay eglGetDisplay(long display_id) {
        return EGLPipeline.nEGLGetDisplay(display_id);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetDisplay([long display_id]);
     * 
     *
     *
     * {@hide}
     */
    private static native EGLDisplay nEGLGetDisplay(long display_id);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglInitialize([EGLDisplay dpy, int[] major,
     * int majorOffset, int[] minor, int minorOffset]);
     * 
     *
     **/
    public boolean eglInitialize(EGLDisplay dpy, int[] major, int majorOffset, int[] minor, int minorOffset) {
        return EGLPipeline.nEGLInitialize(dpy, major, majorOffset, minor, minorOffset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglInitialize([EGLDisplay dpy, int[] major,
     * int majorOffset, int[] minor, int minorOffset]);
     * 
     *
     **/
    private static native boolean nEGLInitialize(
                                                 EGLDisplay dpy,
                                                 int[] major,
                                                 int majorOffset,
                                                 int[] minor,
                                                 int minorOffset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglTerminate([EGLDisplay dpy]);
     * 
     *
     **/
    public boolean eglTerminate(EGLDisplay dpy) {
        return EGLPipeline.nEGLTerminate(dpy);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglTerminate([EGLDisplay dpy]);
     * 
     *
     **/
    private static native boolean nEGLTerminate(EGLDisplay dpy);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryString([EGLDisplay dpy, int name]);
     * 
     *
     **/
    public String eglQueryString(EGLDisplay dpy, int name) {
        return EGLPipeline.nEGLQueryString(dpy, name);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryString([EGLDisplay dpy, int name]);
     * 
     *
     **/
    private static native String nEGLQueryString(EGLDisplay dpy, int name);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetConfigs([EGLDisplay dpy, EGLConfig[]
     * configs, int configsOffset, int config_size, int[] num_config, int
     * num_configOffset]);
     * 
     *
     **/
    public boolean eglGetConfigs(
                                 EGLDisplay dpy,
                                 EGLConfig[] configs,
                                 int configsOffset,
                                 int config_size,
                                 int[] num_config,
                                 int num_configOffset) {
        return EGLPipeline.nEGLGetConfigs(dpy, configs, configsOffset, config_size, num_config, num_configOffset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetConfigs([EGLDisplay dpy, EGLConfig[]
     * configs, int configsOffset, int config_size, int[] num_config, int
     * num_configOffset]);
     * 
     *
     **/
    private static native boolean nEGLGetConfigs(
                                                 EGLDisplay dpy,
                                                 EGLConfig[] configs,
                                                 int configsOffset,
                                                 int config_size,
                                                 int[] num_config,
                                                 int num_configOffset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglChooseConfig([EGLDisplay dpy, int[]
     * attrib_list, int attrib_listOffset, EGLConfig[] configs, int
     * configsOffset, int config_size, int[] num_config, int num_configOffset]);
     * 
     *
     **/
    public boolean eglChooseConfig(
                                   EGLDisplay dpy,
                                   int[] attrib_list,
                                   int attrib_listOffset,
                                   EGLConfig[] configs,
                                   int configsOffset,
                                   int config_size,
                                   int[] num_config,
                                   int num_configOffset) {
        return EGLPipeline.nEGLChooseConfig(dpy, attrib_list, attrib_listOffset, configs, configsOffset, config_size,
                num_config, num_configOffset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglChooseConfig([EGLDisplay dpy, int[]
     * attrib_list, int attrib_listOffset, EGLConfig[] configs, int
     * configsOffset, int config_size, int[] num_config, int num_configOffset]);
     * 
     *
     **/
    private static native boolean nEGLChooseConfig(
                                                   EGLDisplay dpy,
                                                   int[] attrib_list,
                                                   int attrib_listOffset,
                                                   EGLConfig[] configs,
                                                   int configsOffset,
                                                   int config_size,
                                                   int[] num_config,
                                                   int num_configOffset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetConfigAttrib([EGLDisplay dpy, EGLConfig
     * config, int attribute, int[] value, int offset]);
     * 
     *
     **/
    public boolean eglGetConfigAttrib(EGLDisplay dpy, EGLConfig config, int attribute, int[] value, int offset) {
        return EGLPipeline.nEGLGetConfigAttrib(dpy, config, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetConfigAttrib([EGLDisplay dpy, EGLConfig
     * config, int attribute, int[] value, int offset]);
     * 
     *
     **/
    private static native boolean nEGLGetConfigAttrib(
                                                      EGLDisplay dpy,
                                                      EGLConfig config,
                                                      int attribute,
                                                      int[] value,
                                                      int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._eglCreateWindowSurface([EGLDisplay dpy,
     * EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *
     **/
    public EGLSurface _eglCreateWindowSurface(
                                              EGLDisplay dpy,
                                              EGLConfig config,
                                              Object win,
                                              int[] attrib_list,
                                              int offset) {
        return EGLPipeline.n_eglCreateWindowSurface(dpy, config, win, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._eglCreateWindowSurface([EGLDisplay dpy,
     * EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *
     **/
    private static native EGLSurface n_eglCreateWindowSurface(
                                                              EGLDisplay dpy,
                                                              EGLConfig config,
                                                              Object win,
                                                              int[] attrib_list,
                                                              int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._eglCreateWindowSurfaceTexture([EGLDisplay
     * dpy, EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *
     **/
    public EGLSurface _eglCreateWindowSurfaceTexture(
                                                     EGLDisplay dpy,
                                                     EGLConfig config,
                                                     Object win,
                                                     int[] attrib_list,
                                                     int offset) {
        return EGLPipeline.n_eglCreateWindowSurfaceTexture(dpy, config, win, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14._eglCreateWindowSurfaceTexture([EGLDisplay
     * dpy, EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *
     **/
    private static native EGLSurface n_eglCreateWindowSurfaceTexture(
                                                                     EGLDisplay dpy,
                                                                     EGLConfig config,
                                                                     Object win,
                                                                     int[] attrib_list,
                                                                     int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferSurface([EGLDisplay dpy,
     * EGLConfig config, int[] attrib_list, int offset]);
     * 
     *
     **/
    public EGLSurface eglCreatePbufferSurface(EGLDisplay dpy, EGLConfig config, int[] attrib_list, int offset) {
        return EGLPipeline.nEGLCreatePbufferSurface(dpy, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferSurface([EGLDisplay dpy,
     * EGLConfig config, int[] attrib_list, int offset]);
     * 
     *
     **/
    private static native EGLSurface nEGLCreatePbufferSurface(
                                                              EGLDisplay dpy,
                                                              EGLConfig config,
                                                              int[] attrib_list,
                                                              int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePixmapSurface([EGLDisplay dpy,
     * EGLConfig config, int pixmap, int[] attrib_list, int offset]);
     * 
     *
     **/
    public EGLSurface eglCreatePixmapSurface(EGLDisplay dpy, EGLConfig config, int pixmap, int[] attrib_list, int offset) {
        return EGLPipeline.nEGLCreatePixmapSurface(dpy, config, pixmap, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePixmapSurface([EGLDisplay dpy,
     * EGLConfig config, int pixmap, int[] attrib_list, int offset]);
     * 
     *
     **/
    private static native EGLSurface nEGLCreatePixmapSurface(
                                                             EGLDisplay dpy,
                                                             EGLConfig config,
                                                             int pixmap,
                                                             int[] attrib_list,
                                                             int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglDestroySurface([EGLDisplay dpy, EGLSurface
     * surface]);
     * 
     *
     **/
    public boolean eglDestroySurface(EGLDisplay dpy, EGLSurface surface) {
        return EGLPipeline.nEGLDestroySurface(dpy, surface);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglDestroySurface([EGLDisplay dpy, EGLSurface
     * surface]);
     * 
     *
     **/
    private static native boolean nEGLDestroySurface(EGLDisplay dpy, EGLSurface surface);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQuerySurface([EGLDisplay dpy, EGLSurface
     * surface, int attribute, int[] value, int offset]);
     * 
     *
     **/
    public boolean eglQuerySurface(EGLDisplay dpy, EGLSurface surface, int attribute, int[] value, int offset) {
        return EGLPipeline.nEGLQuerySurface(dpy, surface, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQuerySurface([EGLDisplay dpy, EGLSurface
     * surface, int attribute, int[] value, int offset]);
     * 
     *
     **/
    private static native boolean nEGLQuerySurface(
                                                   EGLDisplay dpy,
                                                   EGLSurface surface,
                                                   int attribute,
                                                   int[] value,
                                                   int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglBindAPI([int api]);
     * 
     *
     **/
    public boolean eglBindAPI(int api) {
        return EGLPipeline.nEGLBindAPI(api);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglBindAPI([int api]);
     * 
     *
     **/
    private static native boolean nEGLBindAPI(int api);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryAPI();
     * 
     *
     **/
    public int eglQueryAPI() {
        return EGLPipeline.nEGLQueryAPI();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryAPI();
     * 
     *
     **/
    private static native int nEGLQueryAPI();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitClient();
     * 
     *
     **/
    public boolean eglWaitClient() {
        return EGLPipeline.nEGLWaitClient();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitClient();
     * 
     *
     **/
    private static native boolean nEGLWaitClient();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglReleaseThread();
     * 
     *
     **/
    public boolean eglReleaseThread() {
        return EGLPipeline.nEGLReleaseThread();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglReleaseThread();
     * 
     *
     **/
    private static native boolean nEGLReleaseThread();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay
     * dpy, int buftype, int buffer, EGLConfig config, int[] attrib_list, int
     * offset]);
     * 
     *
     **/
    public EGLSurface eglCreatePbufferFromClientBuffer(
                                                       EGLDisplay dpy,
                                                       int buftype,
                                                       int buffer,
                                                       EGLConfig config,
                                                       int[] attrib_list,
                                                       int offset) {
        return EGLPipeline.nEGLCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay
     * dpy, int buftype, int buffer, EGLConfig config, int[] attrib_list, int
     * offset]);
     * 
     *
     **/
    private static native EGLSurface nEGLCreatePbufferFromClientBuffer(
                                                                       EGLDisplay dpy,
                                                                       int buftype,
                                                                       int buffer,
                                                                       EGLConfig config,
                                                                       int[] attrib_list,
                                                                       int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay
     * dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int
     * offset]);
     * 
     *
     *
     * {@hide}
     */
    public EGLSurface eglCreatePbufferFromClientBuffer(
                                                       EGLDisplay dpy,
                                                       int buftype,
                                                       long buffer,
                                                       EGLConfig config,
                                                       int[] attrib_list,
                                                       int offset) {
        return EGLPipeline.nEGLCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay
     * dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int
     * offset]);
     * 
     *
     *
     * {@hide}
     */
    private static native EGLSurface nEGLCreatePbufferFromClientBuffer(
                                                                       EGLDisplay dpy,
                                                                       int buftype,
                                                                       long buffer,
                                                                       EGLConfig config,
                                                                       int[] attrib_list,
                                                                       int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSurfaceAttrib([EGLDisplay dpy, EGLSurface
     * surface, int attribute, int value]);
     * 
     *
     **/
    public boolean eglSurfaceAttrib(EGLDisplay dpy, EGLSurface surface, int attribute, int value) {
        return EGLPipeline.nEGLSurfaceAttrib(dpy, surface, attribute, value);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSurfaceAttrib([EGLDisplay dpy, EGLSurface
     * surface, int attribute, int value]);
     * 
     *
     **/
    private static native boolean nEGLSurfaceAttrib(EGLDisplay dpy, EGLSurface surface, int attribute, int value);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglBindTexImage([EGLDisplay dpy, EGLSurface
     * surface, int buffer]);
     * 
     *
     **/
    public boolean eglBindTexImage(EGLDisplay dpy, EGLSurface surface, int buffer) {
        return EGLPipeline.nEGLBindTexImage(dpy, surface, buffer);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglBindTexImage([EGLDisplay dpy, EGLSurface
     * surface, int buffer]);
     * 
     *
     **/
    private static native boolean nEGLBindTexImage(EGLDisplay dpy, EGLSurface surface, int buffer);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglReleaseTexImage([EGLDisplay dpy,
     * EGLSurface surface, int buffer]);
     * 
     *
     **/
    public boolean eglReleaseTexImage(EGLDisplay dpy, EGLSurface surface, int buffer) {
        return EGLPipeline.nEGLReleaseTexImage(dpy, surface, buffer);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglReleaseTexImage([EGLDisplay dpy,
     * EGLSurface surface, int buffer]);
     * 
     *
     **/
    private static native boolean nEGLReleaseTexImage(EGLDisplay dpy, EGLSurface surface, int buffer);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSwapInterval([EGLDisplay dpy, int
     * interval]);
     * 
     *
     **/
    public boolean eglSwapInterval(EGLDisplay dpy, int interval) {
        return EGLPipeline.nEGLSwapInterval(dpy, interval);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSwapInterval([EGLDisplay dpy, int
     * interval]);
     * 
     *
     **/
    private static native boolean nEGLSwapInterval(EGLDisplay dpy, int interval);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreateContext([EGLDisplay dpy, EGLConfig
     * config, EGLContext share_context, int[] attrib_list, int offset]);
     * 
     *
     **/
    public EGLContext eglCreateContext(
                                       EGLDisplay dpy,
                                       EGLConfig config,
                                       EGLContext share_context,
                                       int[] attrib_list,
                                       int offset) {
        return EGLPipeline.nEGLCreateContext(dpy, config, share_context, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCreateContext([EGLDisplay dpy, EGLConfig
     * config, EGLContext share_context, int[] attrib_list, int offset]);
     * 
     *
     **/
    private static native EGLContext nEGLCreateContext(
                                                       EGLDisplay dpy,
                                                       EGLConfig config,
                                                       EGLContext share_context,
                                                       int[] attrib_list,
                                                       int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglDestroyContext([EGLDisplay dpy, EGLContext
     * ctx]);
     * 
     *
     **/
    public boolean eglDestroyContext(EGLDisplay dpy, EGLContext ctx) {
        return EGLPipeline.nEGLDestroyContext(dpy, ctx);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglDestroyContext([EGLDisplay dpy, EGLContext
     * ctx]);
     * 
     *
     **/
    private static native boolean nEGLDestroyContext(EGLDisplay dpy, EGLContext ctx);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglMakeCurrent([EGLDisplay dpy, EGLSurface
     * draw, EGLSurface read, EGLContext ctx]);
     * 
     *
     **/
    public boolean eglMakeCurrent(EGLDisplay dpy, 
                                  EGLSurface draw, 
                                  EGLSurface read, 
                                  EGLContext ctx) {
        return EGLPipeline.nEGLMakeCurrent(dpy, draw, read, ctx);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglMakeCurrent([EGLDisplay dpy, EGLSurface
     * draw, EGLSurface read, EGLContext ctx]);
     * 
     *
     **/
    private static native boolean nEGLMakeCurrent(EGLDisplay dpy, 
                                                  EGLSurface draw, 
                                                  EGLSurface read, 
                                                  EGLContext ctx);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentContext();
     * 
     *
     **/
    public EGLContext eglGetCurrentContext() {
        return EGLPipeline.nEGLGetCurrentContext();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentContext();
     * 
     *
     **/
    private static native EGLContext nEGLGetCurrentContext();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentSurface([int readdraw]);
     * 
     *
     **/
    public EGLSurface eglGetCurrentSurface(int readdraw) {
        return EGLPipeline.nEGLGetCurrentSurface(readdraw);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentSurface([int readdraw]);
     * 
     *
     **/
    private static native EGLSurface nEGLGetCurrentSurface(int readdraw);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentDisplay();
     * 
     *
     **/
    public EGLDisplay eglGetCurrentDisplay() {
        return EGLPipeline.nEGLGetCurrentDisplay();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglGetCurrentDisplay();
     * 
     *
     **/
    private static native EGLDisplay nEGLGetCurrentDisplay();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryContext([EGLDisplay dpy, EGLContext
     * ctx, int attribute, int[] value, int offset]);
     * 
     *
     **/
    public boolean eglQueryContext(EGLDisplay dpy, 
                                   EGLContext ctx, 
                                   int attribute, 
                                   int[] value, 
                                   int offset) {
        return EGLPipeline.nEGLQueryContext(dpy, ctx, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglQueryContext([EGLDisplay dpy, EGLContext
     * ctx, int attribute, int[] value, int offset]);
     * 
     *
     **/
    private static native boolean nEGLQueryContext(
                                                   EGLDisplay dpy,
                                                   EGLContext ctx,
                                                   int attribute,
                                                   int[] value,
                                                   int offset);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitGL();
     * 
     *
     **/
    public boolean eglWaitGL() {
        return EGLPipeline.nEGLWaitGL();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitGL();
     * 
     *
     **/
    private static native boolean nEGLWaitGL();

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitNative([int engine]);
     * 
     *
     **/
    public boolean eglWaitNative(int engine) {
        return EGLPipeline.nEGLWaitNative(engine);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglWaitNative([int engine]);
     * 
     *
     **/
    private static native boolean nEGLWaitNative(int engine);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSwapBuffers([EGLDisplay dpy, EGLSurface
     * surface]);
     * 
     *
     **/
    public boolean eglSwapBuffers(EGLDisplay dpy, EGLSurface surface) {
        return EGLPipeline.nEGLSwapBuffers(dpy, surface);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglSwapBuffers([EGLDisplay dpy, EGLSurface
     * surface]);
     * 
     *
     **/
    private static native boolean nEGLSwapBuffers(EGLDisplay dpy, EGLSurface surface);

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCopyBuffers([EGLDisplay dpy, EGLSurface
     * surface, int target]);
     * 
     *
     **/
    public boolean eglCopyBuffers(EGLDisplay dpy, 
                                  EGLSurface surface, 
                                  int target) {
        return EGLPipeline.nEGLCopyBuffers(dpy, surface, target);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGL14.eglCopyBuffers([EGLDisplay dpy, EGLSurface
     * surface, int target]);
     * 
     *
     **/
    private static native boolean nEGLCopyBuffers(EGLDisplay dpy, 
                                                  EGLSurface surface, 
                                                  int target);

    /**
     * MACHINE GENERATED!
     * Method generated from EGLExt._nativeClassInit();
     * 
     *
     **/
    public void EGLExtClassInit() {
        EGLPipeline.nEGLExtClassInit();
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGLExt._nativeClassInit();
     * 
     *
     **/
    private static native void nEGLExtClassInit();

    /**
     * MACHINE GENERATED!
     * Method generated from EGLExt.eglPresentationTimeANDROID([EGLDisplay dpy,
     * EGLSurface sur, long time]);
     * 
     *
     **/
    public boolean eglPresentationTimeANDROID(EGLDisplay dpy, 
                                              EGLSurface sur, 
                                              long time) {
        return EGLPipeline.nEGLPresentationTimeANDROID(dpy, sur, time);
    }

    /**
     * MACHINE GENERATED!
     * Method generated from EGLExt.eglPresentationTimeANDROID([EGLDisplay dpy,
     * EGLSurface sur, long time]);
     * 
     *
     **/
    private static native boolean nEGLPresentationTimeANDROID(EGLDisplay dpy, 
                                                              EGLSurface sur, 
                                                              long time);

    
    public Pipeline getPipelineInstance() {
        // TODO Auto-generated method stub
        return null;
    }

}
