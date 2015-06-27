/*
** Copyright 2012, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/

package android.opengl;

import android.graphics.SurfaceTexture;
import gles.internal.EGL14Pipeline;
import gles.internal.EGLUtil;
import gles.internal.Sys;
import gles.view.Surface;
import gles.view.SurfaceHolder;
import gles.view.SurfaceView;



/**
 * EGL 1.4
 *
 */
public class EGL14 {
    
    public static final int EGL_DEFAULT_DISPLAY            = 0;
    public static EGLContext EGL_NO_CONTEXT                = null;
    public static EGLDisplay EGL_NO_DISPLAY                = null;
    public static EGLSurface EGL_NO_SURFACE                = null;

    public static final int EGL_FALSE                          = 0;
    public static final int EGL_TRUE                           = 1;
    public static final int EGL_SUCCESS                        = 0x3000;
    public static final int EGL_NOT_INITIALIZED                = 0x3001;
    public static final int EGL_BAD_ACCESS                     = 0x3002;
    public static final int EGL_BAD_ALLOC                      = 0x3003;
    public static final int EGL_BAD_ATTRIBUTE                  = 0x3004;
    public static final int EGL_BAD_CONFIG                     = 0x3005;
    public static final int EGL_BAD_CONTEXT                    = 0x3006;
    public static final int EGL_BAD_CURRENT_SURFACE            = 0x3007;
    public static final int EGL_BAD_DISPLAY                    = 0x3008;
    public static final int EGL_BAD_MATCH                      = 0x3009;
    public static final int EGL_BAD_NATIVE_PIXMAP              = 0x300A;
    public static final int EGL_BAD_NATIVE_WINDOW              = 0x300B;
    public static final int EGL_BAD_PARAMETER                  = 0x300C;
    public static final int EGL_BAD_SURFACE                    = 0x300D;
    public static final int EGL_CONTEXT_LOST                   = 0x300E;
    public static final int EGL_BUFFER_SIZE                    = 0x3020;
    public static final int EGL_ALPHA_SIZE                     = 0x3021;
    public static final int EGL_BLUE_SIZE                      = 0x3022;
    public static final int EGL_GREEN_SIZE                     = 0x3023;
    public static final int EGL_RED_SIZE                       = 0x3024;
    public static final int EGL_DEPTH_SIZE                     = 0x3025;
    public static final int EGL_STENCIL_SIZE                   = 0x3026;
    public static final int EGL_CONFIG_CAVEAT                  = 0x3027;
    public static final int EGL_CONFIG_ID                      = 0x3028;
    public static final int EGL_LEVEL                          = 0x3029;
    public static final int EGL_MAX_PBUFFER_HEIGHT             = 0x302A;
    public static final int EGL_MAX_PBUFFER_PIXELS             = 0x302B;
    public static final int EGL_MAX_PBUFFER_WIDTH              = 0x302C;
    public static final int EGL_NATIVE_RENDERABLE              = 0x302D;
    public static final int EGL_NATIVE_VISUAL_ID               = 0x302E;
    public static final int EGL_NATIVE_VISUAL_TYPE             = 0x302F;
    public static final int EGL_SAMPLES                        = 0x3031;
    public static final int EGL_SAMPLE_BUFFERS                 = 0x3032;
    public static final int EGL_SURFACE_TYPE                   = 0x3033;
    public static final int EGL_TRANSPARENT_TYPE               = 0x3034;
    public static final int EGL_TRANSPARENT_BLUE_VALUE         = 0x3035;
    public static final int EGL_TRANSPARENT_GREEN_VALUE        = 0x3036;
    public static final int EGL_TRANSPARENT_RED_VALUE          = 0x3037;
    public static final int EGL_NONE                           = 0x3038;
    public static final int EGL_BIND_TO_TEXTURE_RGB            = 0x3039;
    public static final int EGL_BIND_TO_TEXTURE_RGBA           = 0x303A;
    public static final int EGL_MIN_SWAP_INTERVAL              = 0x303B;
    public static final int EGL_MAX_SWAP_INTERVAL              = 0x303C;
    public static final int EGL_LUMINANCE_SIZE                 = 0x303D;
    public static final int EGL_ALPHA_MASK_SIZE                = 0x303E;
    public static final int EGL_COLOR_BUFFER_TYPE              = 0x303F;
    public static final int EGL_RENDERABLE_TYPE                = 0x3040;
    public static final int EGL_MATCH_NATIVE_PIXMAP            = 0x3041;
    public static final int EGL_CONFORMANT                     = 0x3042;
    public static final int EGL_SLOW_CONFIG                    = 0x3050;
    public static final int EGL_NON_CONFORMANT_CONFIG          = 0x3051;
    public static final int EGL_TRANSPARENT_RGB                = 0x3052;
    public static final int EGL_RGB_BUFFER                     = 0x308E;
    public static final int EGL_LUMINANCE_BUFFER               = 0x308F;
    public static final int EGL_NO_TEXTURE                     = 0x305C;
    public static final int EGL_TEXTURE_RGB                    = 0x305D;
    public static final int EGL_TEXTURE_RGBA                   = 0x305E;
    public static final int EGL_TEXTURE_2D                     = 0x305F;
    public static final int EGL_PBUFFER_BIT                    = 0x0001;
    public static final int EGL_PIXMAP_BIT                     = 0x0002;
    public static final int EGL_WINDOW_BIT                     = 0x0004;
    public static final int EGL_VG_COLORSPACE_LINEAR_BIT       = 0x0020;
    public static final int EGL_VG_ALPHA_FORMAT_PRE_BIT        = 0x0040;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX_BIT    = 0x0200;
    public static final int EGL_SWAP_BEHAVIOR_PRESERVED_BIT    = 0x0400;
    public static final int EGL_OPENGL_ES_BIT                  = 0x0001;
    public static final int EGL_OPENVG_BIT                     = 0x0002;
    public static final int EGL_OPENGL_ES2_BIT                 = 0x0004;
    public static final int EGL_OPENGL_BIT                     = 0x0008;
    public static final int EGL_VENDOR                         = 0x3053;
    public static final int EGL_VERSION                        = 0x3054;
    public static final int EGL_EXTENSIONS                     = 0x3055;
    public static final int EGL_CLIENT_APIS                    = 0x308D;
    public static final int EGL_HEIGHT                         = 0x3056;
    public static final int EGL_WIDTH                          = 0x3057;
    public static final int EGL_LARGEST_PBUFFER                = 0x3058;
    public static final int EGL_TEXTURE_FORMAT                 = 0x3080;
    public static final int EGL_TEXTURE_TARGET                 = 0x3081;
    public static final int EGL_MIPMAP_TEXTURE                 = 0x3082;
    public static final int EGL_MIPMAP_LEVEL                   = 0x3083;
    public static final int EGL_RENDER_BUFFER                  = 0x3086;
    public static final int EGL_VG_COLORSPACE                  = 0x3087;
    public static final int EGL_VG_ALPHA_FORMAT                = 0x3088;
    public static final int EGL_HORIZONTAL_RESOLUTION          = 0x3090;
    public static final int EGL_VERTICAL_RESOLUTION            = 0x3091;
    public static final int EGL_PIXEL_ASPECT_RATIO             = 0x3092;
    public static final int EGL_SWAP_BEHAVIOR                  = 0x3093;
    public static final int EGL_MULTISAMPLE_RESOLVE            = 0x3099;
    public static final int EGL_BACK_BUFFER                    = 0x3084;
    public static final int EGL_SINGLE_BUFFER                  = 0x3085;
    public static final int EGL_VG_COLORSPACE_sRGB             = 0x3089;
    public static final int EGL_VG_COLORSPACE_LINEAR           = 0x308A;
    public static final int EGL_VG_ALPHA_FORMAT_NONPRE         = 0x308B;
    public static final int EGL_VG_ALPHA_FORMAT_PRE            = 0x308C;
    public static final int EGL_DISPLAY_SCALING                = 10000;
    public static final int EGL_BUFFER_PRESERVED               = 0x3094;
    public static final int EGL_BUFFER_DESTROYED               = 0x3095;
    public static final int EGL_OPENVG_IMAGE                   = 0x3096;
    public static final int EGL_CONTEXT_CLIENT_TYPE            = 0x3097;
    public static final int EGL_CONTEXT_CLIENT_VERSION         = 0x3098;
    public static final int EGL_MULTISAMPLE_RESOLVE_DEFAULT    = 0x309A;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX        = 0x309B;
    public static final int EGL_OPENGL_ES_API                  = 0x30A0;
    public static final int EGL_OPENVG_API                     = 0x30A1;
    public static final int EGL_OPENGL_API                     = 0x30A2;
    public static final int EGL_DRAW                           = 0x3059;
    public static final int EGL_READ                           = 0x305A;
    public static final int EGL_CORE_NATIVE_ENGINE             = 0x305B;

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14._nativeClassInit();
     * 
     *  C function EGLint eglGetError ( void )

     * */
    public static void nativeClassInit() {
        getPipeline().nativeClassInit();
    }

    static {
        EGL_NO_CONTEXT = EGLUtil.createEGLContext(0);
        EGL_NO_DISPLAY = EGLUtil.createEGLDisplay(0);
        EGL_NO_SURFACE = EGLUtil.createEGLSurface(0);
       // nativeClassInit();
    }
    
    /**
     * private constructor
     */
    private EGL14(){}
    
    /**
     * Local instance of pipeline       
     */
    private static EGL14Pipeline pipeline;
    
    /**
     * Get the pipeline from Sys.
     * All logic from selecting undelying API implementation 
     * is provided by Sys class.
     * 
     * @return Pipeline instance for this OpenGL ES
     */
     private static EGL14Pipeline getPipeline(){
        if(pipeline==null){
                pipeline = (EGL14Pipeline) Sys.getEGLPipelineInstance(Sys.EGL_PIPE.EGL14);
        }
        return pipeline;
     }

     /**
      * Prototype C function EGLint eglGetError ( void )<br>
      * 
      * eglGetError returns the error of the last called EGL function in the
      * current thread. Initially, the error is set to EGL_SUCCESS.
      * 
      * <p> 
      * The following errors are currently defined:
      * </p>
      * <li>EGL_SUCCESS -  The last function succeeded without error.   
      * <li>EGL_NOT_INITIALIZED  - EGL is not initialized, or could not be initialized, for the specified EGL display connection.
      * <li>EGL_BAD_ACCESS -  EGL cannot access a requested resource (for example a context is bound in another thread).
      * <li> EGL_BAD_ALLOC -  EGL failed to allocate resources for the requested operation.
      * <li>EGL_BAD_ATTRIBUTE - An unrecognized attribute or attribute value was passed in the attribute list.
      * <li>EGL_BAD_CONTEXT - An EGLContext argument does not name a valid EGL rendering context.
      * <li>EGL_BAD_CONFIG
      * An EGLConfig argument does not name a valid EGL frame buffer configuration.
      * <li>EGL_BAD_CURRENT_SURFACE
      * The current surface of the calling thread is a window, pixel buffer or pixmap that is no longer valid.
      * <li>EGL_BAD_DISPLAY
      * An EGLDisplay argument does not name a valid EGL display connection.
      * <li>EGL_BAD_SURFACE
      * An EGLSurface argument does not name a valid surface (window, pixel buffer or pixmap) configured for GL rendering.
      * <li>EGL_BAD_MATCH
      * Arguments are inconsistent (for example, a valid context requires buffers not supplied by a valid surface).
      * <li>EGL_BAD_PARAMETER
      * One or more argument values are invalid.
      * <li>EGL_BAD_NATIVE_PIXMAP
      * A NativePixmapType argument does not refer to a valid native pixmap.
      * <li>EGL_BAD_NATIVE_WINDOW
      * A NativeWindowType argument does not refer to a valid native window.
      * <li>EGL_CONTEXT_LOST
      * A power management event has occurred. The application must destroy all contexts and reinitialise OpenGL ES state and objects to continue rendering.
      *
      * 
      * @return last error
      */    
    public static int eglGetError() {
       return getPipeline().eglGetError();
    }

    // 
    /**
     * Prototype C function EGLDisplay eglGetDisplay ( EGLNativeDisplayType display_id )
     * 
     * eglGetDisplay obtains the EGL display connection for the native display
     * native_display.<br>  
     * If display_id is EGL_DEFAULT_DISPLAY, a default display connection is
     * returned. <br>
     * If no display connection matching native_display is available,
     * EGL_NO_DISPLAY is returned. No error is generated.
     * 
     * Use eglInitialize to initialize the display connection.
     * 
     * @see #eglInitialize(EGLDisplay, int[], int, int[], int)
     * @param display_id
     *            Specifies the display to connect to. EGL_DEFAULT_DISPLAY
     *            indicates the default display.
     * @return
     */
    public static EGLDisplay eglGetDisplay(int display_id) {
        return  getPipeline().eglGetDisplay(display_id);
    }

    /**
     * In an OpenGL ES 2.0 application, use the eglGetDisplay() call to create a window 
     * that displays the rendered output from the Open GL ES Emulator.<br>
     *  You must pass to this function either the:<br> 
     *  <li>value EGL_DEFAULT_DISPLAY - ( see {@link #EGL_DEFAULT_DISPLAY} ) 
     *  <li>Handle of the Device Context (HDC).     
     *  <br>
     *  
     * <P> Usage Example</p>
     * <pre>
     * // Example 5.1
     * EGLDisplay sEGLDisplay;
     * // EGL 
     * init.sEGLDisplay = eglGetDisplay((EGLNativeDisplayType) EGL_DEFAULT_DISPLAY);
     * eglInitialize(sEGLDisplay, NULL, NULL);
     * 
     *  //************************************
     * 
     *  // Example 5.2
     *   EGLDisplay sEGLDisplay;
     *   ... 
     *   // Create windowsWindow = CreateWindowEx(... 
     *   // EGL init.sEGLDisplay = eglGetDisplay(GetDC(sWindow));
     *   eglInitialize(sEGLDisplay, NULL, NULL);
     *   
     * </pre>
     */
    public static EGLDisplay eglGetDisplay(long display_id) {
        return  getPipeline().eglGetDisplay(display_id);
    }

    /**
     * <pre>
     *  C function EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )
     * </pre>
     * 
     * <b>eglInitialize</b> — initialize an EGL display connection.<br>
     * eglInitialize initialized the EGL display connection obtained with
     * {@link #eglGetDisplay(long)}. <br>
     * Initializing an already initialized EGL display connection has no effect
     * besides returning the version numbers.<br>
     * <b>major</b> and <b>minor</b> do not return values if they are specified
     * as NULL.<br>
     * 
     * Use {@link #eglTerminate(EGLDisplay)} to release resources associated
     * with an EGL display connection. <br>
     * <br>
     * 
     * <P>
     * Errors:
     * </P>
     * 
     * <li>EGL_BAD_DISPLAY is generated if display is not an EGL display
     * connection. <li>EGL_NOT_INITIALIZED is generated if display cannot be
     * initialized.
     * 
     * @see #eglTerminate(EGLDisplay)
     * @see #eglGetDisplay(long)
     * 
     * @param dpy
     *        Specifies the EGL display connection to initialize.
     * @param major
     *        Returns the major version number of the EGL implementation.
     *        May be NULL.
     * @param majorOffset
     *        offset in major array
     * @param minor
     *        Returns the minor version number of the EGL implementation.
     *        May be NULL.
     * @param minorOffset
     *        offset in minorOffset
     * 
     * @return true is sucessful
     */
    public static boolean eglInitialize(EGLDisplay dpy, int[] major, int majorOffset, int[] minor, int minorOffset) {
        return  getPipeline().eglInitialize(dpy, major, majorOffset, minor, minorOffset);
    }

    /**
     * <pre>
     * Prototype: C function EGLBoolean eglTerminate ( EGLDisplay dpy )<br>
     * </pre>
     * eglTerminate releases resources associated with an EGL display
     * connection. Termination marks all EGL resources associated with the EGL
     * display connection for deletion. If contexts or surfaces associated with
     * display is current to any thread, they are not released until they are no
     * longer current as a result of eglMakeCurrent.<br>
     * 
     * Terminating an already terminated EGL display connection has no effect. A
     * terminated display may be re-initialized by calling eglInitialize again.<br><br>
     * 
     * EGL_BAD_DISPLAY is generated if display is not an EGL display connection.
     * 
     * @param display Specifies the EGL display connection to terminate.
     * 
     * @return false is returned if eglTerminate fails, true otherwise.
     */
    public static boolean eglTerminate(EGLDisplay dpy) {
        return   getPipeline().eglTerminate(dpy);
    }

    /**
     * <pre>
     * Prototype: C function const char * eglQueryString(EGLDisplay dpy,
     *                                                   EGLint name )
     *                                                   </pre>
     * <p>
     * <em>eglQueryString</em> returns a string describing an EGL
     * display connection. Parameter name can be one of the following:</p>
     *
     * <li>EGL_CLIENT_APIS - Returns a string describing which client 
     *  rendering APIs are supported. The string contains a space-separate 
     *  list of API names. The list must include at least one of OpenGL, 
     *  OpenGL_ES, or OpenVG. These strings correspond respectively to values 
     *  EGL_OPENGL_API, EGL_OPENGL_ES_API, and EGL_OPENVG_API of the 
     *  eglBindAPI, api argument.
     * 
     * <li> EGL_VENDOR - Returns the company responsible for this EGL 
     *  implementation. This name does not change from release to release.
     * 
     * <li> EGL_VERSION -  Returns a version or release number. 
     * The EGL_VERSION string is laid out as follows:<br> 
     *  major_version.minor_version space vendor_specific_info
     * 
     * <li>EGL_EXTENSIONS - Returns a space separated list of supported 
     *  extensions to EGL.
     *  
     * <pre>
     * <b>Error:</B>
     * NULL is returned on failure. 
     * EGL_BAD_DISPLAY is generated if display is not an EGL display connection. 
     * EGL_NOT_INITIALIZED is generated if display has not been initialized. 
     * EGL_BAD_PARAMETER is generated if name is not an accepted value.
     * </pre>
     * 
     * @param dpy - Specifies the EGL display connection.
     * @param name - Specifies a symbolic constant, one of EGL_CLIENT_APIS,
     *            EGL_VENDOR, EGL_VERSION, or EGL_EXTENSIONS.
     * 
     * @return
     */
    public static String eglQueryString(EGLDisplay dpy, int name) {
        return  getPipeline().eglQueryString(dpy, name);
    }

    /**
     * <p>
     * Prototype : C function EGLBoolean eglGetConfigs ( EGLDisplay dpy,
     * EGLConfig *configs, EGLint config_size, EGLint *num_config )
     * </P>
     * <p>
     * eglGetConfigs returns a list of all EGL frame buffer configurations that
     * are available for the specified display. The items in the list can be
     * used in any EGL function that requires an EGL frame buffer configuration.<br>
     * 
     * Parameter <em>configs</em> does not return values, if it is specified as NULL. This is
     * useful for querying just the number of all frame buffer configurations.<br>
     * 
     * Use {@link #eglGetConfigAttrib(EGLDisplay, EGLConfig, int, int[], int)}
     * to retrieve  individual attribute values of a frame
     * buffer configuration.
     * </p>
     * <b>Errors:</b><br>
     * <li> EGL_BAD_DISPLAY is generated if display is not an EGL display connection.
     * <li> EGL_NOT_INITIALIZED is generated if display has not been initialized.
     * <li> EGL_BAD_PARAMETER is generated if num_config is NULL.
     * 
     * @param display - Specifies the EGL display connection.
     * @param configs - Returns a list of configs.
     * @param configsOffset - offset of configs array
     * @param config_size - Specifies the size of the list of configs.
     * @param num_config  - number of configs returned on <b>EGLConfig[] configs</b>
     * @param num_configOffset - offset of num_config array
     * @return EGL_FALSE is returned on failure, EGL_TRUE otherwise. 
     *  configs and num_config are not modified when EGL_FALSE is returned.
     */
    public static boolean eglGetConfigs(EGLDisplay dpy, 
                                        EGLConfig[] configs, int configsOffset, 
                                        int config_size, 
                                        int[] num_config, int num_configOffset) {
        return   getPipeline().eglGetConfigs(dpy, 
                                             configs, configsOffset, 
                                             config_size, 
                                             num_config, num_configOffset);
    }

    /**
     * <p>
     * Prototype: C function EGLBoolean eglChooseConfig ( EGLDisplay dpy, const EGLint *attrib_list, EGLConfig *configs, EGLint config_size, EGLint *num_config )
     * </p>
     * 
     * eglChooseConfig — return a list of EGL frame buffer configurations that match specified attributes
     * 
     * @param display Specifies the EGL display connection.
     * @param attrib_list Specifies attributes required to match by configs.
     * @param attrib_listOffset offset of attrib_list
     * @param configs Returns an array of frame buffer configurations.
     * @param configsOffset offset of configs
     * @param config_size Specifies the size of the array of frame buffer configurations.
     * @param num_config Returns the number of frame buffer configurations returned.
     * @param num_configOffset offset  num_config array
     * 
     * @return true if sucessfull
     */
    public static boolean eglChooseConfig(EGLDisplay display, 
                                          int[] attrib_list, int attrib_listOffset, 
                                          EGLConfig[] configs, int configsOffset, 
                                          int config_size, 
                                          int[] num_config, int num_configOffset) {
        return  getPipeline().eglChooseConfig(display, 
                                              attrib_list, attrib_listOffset, 
                                              configs, configsOffset, 
                                              config_size, 
                                              num_config, num_configOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglGetConfigAttrib([EGLDisplay dpy, EGLConfig config, int attribute, int[] value, int offset]);
     * 
     *  C function EGLBoolean eglGetConfigAttrib ( EGLDisplay dpy, EGLConfig config, EGLint attribute, EGLint *value )

     * */
    public static boolean eglGetConfigAttrib(EGLDisplay dpy, EGLConfig config, int attribute, int[] value, int offset) {
        return  getPipeline().eglGetConfigAttrib(dpy, config, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14._eglCreateWindowSurface([EGLDisplay dpy, EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *  C function EGLSurface eglCreateWindowSurface ( EGLDisplay dpy, EGLConfig config, EGLNativeWindowType win, const EGLint *attrib_list )

     * */
    private static EGLSurface _eglCreateWindowSurface(EGLDisplay dpy, 
                                                      EGLConfig config, 
                                                      Object win, 
                                                      int[] attrib_list, int offset) {
        return  getPipeline().eglCreateWindowSurface(dpy, config, win, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14._eglCreateWindowSurfaceTexture([EGLDisplay dpy, EGLConfig config, Object win, int[] attrib_list, int offset]);
     * 
     *  C function EGLSurface eglCreatePbufferSurface ( EGLDisplay dpy, EGLConfig config, const EGLint *attrib_list )

     * */
    private static EGLSurface _eglCreateWindowSurfaceTexture(EGLDisplay dpy, 
                                                             EGLConfig config, 
                                                             Object win, 
                                                             int[] attrib_list, int offset) {
        return  getPipeline().eglCreateWindowSurfaceTexture(dpy, config, win, attrib_list, offset);
    }

    /**
     * 
     * @param dpy
     * @param config
     * @param win
     * @param attrib_list
     * @param offset
     * @return
     */
    public static EGLSurface eglCreateWindowSurface(EGLDisplay dpy,
                                                    EGLConfig config,
                                                    Object win,
                                                    int[] attrib_list, int offset) 
    {
//        Surface sur = null;
//        if (win instanceof SurfaceView) {
//            SurfaceView surfaceView = (SurfaceView) win;
//            sur = surfaceView.getHolder().getSurface();
//        } else if (win instanceof SurfaceHolder) {
//            SurfaceHolder holder = (SurfaceHolder) win;
//            sur = holder.getSurface();
//        } else if (win instanceof Surface) {
//            sur = (Surface) win;
//        }

        EGLSurface surface;
        if (win instanceof gles.emulator.CanvasEGL) {
            surface = _eglCreateWindowSurface(dpy, config, win, attrib_list, offset);
        } else if (win instanceof SurfaceTexture) {
            surface = _eglCreateWindowSurfaceTexture(dpy, config, win, attrib_list, offset);
        } else {
            throw new java.lang.UnsupportedOperationException("eglCreateWindowSurface() can only be called with an instance of " + "Surface, SurfaceView, SurfaceTexture or SurfaceHolder at the moment, " + "this will be fixed later.");
        }
        return surface;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreatePbufferSurface([EGLDisplay dpy, EGLConfig config, int[] attrib_list, int offset]);
     * 
     *  C function EGLSurface eglCreatePbufferSurface ( EGLDisplay dpy, EGLConfig config, const EGLint *attrib_list )

     * */
    public static EGLSurface eglCreatePbufferSurface(EGLDisplay dpy, EGLConfig config, int[] attrib_list, int offset) {
        return  getPipeline().eglCreatePbufferSurface(dpy, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreatePixmapSurface([EGLDisplay dpy, EGLConfig config, int pixmap, int[] attrib_list, int offset]);
     * 
     *  C function EGLSurface eglCreatePixmapSurface ( EGLDisplay dpy, EGLConfig config, EGLNativePixmapType pixmap, const EGLint *attrib_list )

     * */
    public static EGLSurface eglCreatePixmapSurface(EGLDisplay dpy, EGLConfig config, int pixmap, int[] attrib_list, int offset) {
        return getPipeline().eglCreatePixmapSurface(dpy, config, pixmap, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglDestroySurface([EGLDisplay dpy, EGLSurface surface]);
     * 
     *  C function EGLBoolean eglDestroySurface ( EGLDisplay dpy, EGLSurface surface )

     * */
    public static boolean eglDestroySurface(EGLDisplay dpy, EGLSurface surface) {
        return   getPipeline().eglDestroySurface(dpy, surface);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglQuerySurface([EGLDisplay dpy, EGLSurface surface, int attribute, int[] value, int offset]);
     * 
     *  C function EGLBoolean eglQuerySurface ( EGLDisplay dpy, EGLSurface surface, EGLint attribute, EGLint *value )

     * */
    public static boolean eglQuerySurface(EGLDisplay dpy, EGLSurface surface, int attribute, int[] value, int offset) {
        return  getPipeline().eglQuerySurface(dpy, surface, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglBindAPI([int api]);
     * 
     *  C function EGLBoolean eglBindAPI ( EGLenum api )

     * */
    public static boolean eglBindAPI(int api) {
        return   getPipeline().eglBindAPI(api);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglQueryAPI();
     * 
     *  C function EGLenum eglQueryAPI ( void )

     * */
    public static int eglQueryAPI() {
        return  getPipeline().eglQueryAPI();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglWaitClient();
     * 
     *  C function EGLBoolean eglWaitClient ( void )

     * */
    public static boolean eglWaitClient() {
        return  getPipeline().eglWaitClient();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglReleaseThread();
     * 
     *  C function EGLBoolean eglReleaseThread ( void )

     * */
    public static boolean eglReleaseThread() {
        return  getPipeline().eglReleaseThread();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay dpy, int buftype, int buffer, EGLConfig config, int[] attrib_list, int offset]);
     * 
     *  TODO Deprecate the below method

     * */
    @Deprecated
    public static EGLSurface eglCreatePbufferFromClientBuffer(EGLDisplay dpy, int buftype, int buffer, EGLConfig config, int[] attrib_list, int offset) {
        return  getPipeline().eglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int offset]);
     * 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int offset]);
     * 
     * 
     * {@hide}
     
     * 
     * {@hide}
     
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreatePbufferFromClientBuffer([EGLDisplay dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int offset]);
     * 
     * 
     * {@hide}
     
     * 
     * {@hide}
     */
    public static EGLSurface eglCreatePbufferFromClientBuffer(EGLDisplay dpy, int buftype, long buffer, EGLConfig config, int[] attrib_list, int offset) {
        return  getPipeline().eglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglSurfaceAttrib([EGLDisplay dpy, EGLSurface surface, int attribute, int value]);
     * 
     *  C function EGLBoolean eglSurfaceAttrib ( EGLDisplay dpy, EGLSurface surface, EGLint attribute, EGLint value )

     * */
    public static boolean eglSurfaceAttrib(EGLDisplay dpy, EGLSurface surface, int attribute, int value) {
        return  getPipeline().eglSurfaceAttrib(dpy, surface, attribute, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglBindTexImage([EGLDisplay dpy, EGLSurface surface, int buffer]);
     * 
     *  C function EGLBoolean eglBindTexImage ( EGLDisplay dpy, EGLSurface surface, EGLint buffer )

     * */
    public static boolean eglBindTexImage(EGLDisplay dpy, EGLSurface surface, int buffer) {
        return  getPipeline().eglBindTexImage(dpy, surface, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglReleaseTexImage([EGLDisplay dpy, EGLSurface surface, int buffer]);
     * 
     *  C function EGLBoolean eglReleaseTexImage ( EGLDisplay dpy, EGLSurface surface, EGLint buffer )

     * */
    public static boolean eglReleaseTexImage(EGLDisplay dpy, EGLSurface surface, int buffer) {
        return  getPipeline().eglReleaseTexImage(dpy, surface, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglSwapInterval([EGLDisplay dpy, int interval]);
     * 
     *  C function EGLBoolean eglSwapInterval ( EGLDisplay dpy, EGLint interval )

     * */
    public static boolean eglSwapInterval(EGLDisplay dpy, int interval) {
        return  getPipeline().eglSwapInterval(dpy, interval);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCreateContext([EGLDisplay dpy, EGLConfig config, EGLContext share_context, int[] attrib_list, int offset]);
     * 
     *  C function EGLContext eglCreateContext ( EGLDisplay dpy, EGLConfig config, EGLContext share_context, const EGLint *attrib_list )

     * */
    public static EGLContext eglCreateContext(EGLDisplay dpy, EGLConfig config, EGLContext share_context, int[] attrib_list, int offset) {
        return  getPipeline().eglCreateContext(dpy, config, share_context, attrib_list, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglDestroyContext([EGLDisplay dpy, EGLContext ctx]);
     * 
     *  C function EGLBoolean eglDestroyContext ( EGLDisplay dpy, EGLContext ctx )

     * */
    public static boolean eglDestroyContext(EGLDisplay dpy, EGLContext ctx) {
        return  getPipeline().eglDestroyContext(dpy, ctx);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglMakeCurrent([EGLDisplay dpy, EGLSurface draw, EGLSurface read, EGLContext ctx]);
     * 
     *  C function EGLBoolean eglMakeCurrent ( EGLDisplay dpy, EGLSurface draw, EGLSurface read, EGLContext ctx )

     * */
    public static boolean eglMakeCurrent(EGLDisplay dpy, EGLSurface draw, EGLSurface read, EGLContext ctx) {
        return  getPipeline().eglMakeCurrent(dpy, draw, read, ctx);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglGetCurrentContext();
     * 
     *  C function EGLContext eglGetCurrentContext ( void )

     * */
    public static EGLContext eglGetCurrentContext() {
        return  getPipeline().eglGetCurrentContext();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglGetCurrentSurface([int readdraw]);
     * 
     *  C function EGLSurface eglGetCurrentSurface ( EGLint readdraw )

     * */
    public static EGLSurface eglGetCurrentSurface(int readdraw) {
        return  getPipeline().eglGetCurrentSurface(readdraw);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglGetCurrentDisplay();
     * 
     *  C function EGLDisplay eglGetCurrentDisplay ( void )

     * */
    public static EGLDisplay eglGetCurrentDisplay() {
        return  getPipeline().eglGetCurrentDisplay();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglQueryContext([EGLDisplay dpy, EGLContext ctx, int attribute, int[] value, int offset]);
     * 
     *  C function EGLBoolean eglQueryContext ( EGLDisplay dpy, EGLContext ctx, EGLint attribute, EGLint *value )

     * */
    public static boolean eglQueryContext(EGLDisplay dpy, EGLContext ctx, int attribute, int[] value, int offset) {
        return  getPipeline().eglQueryContext(dpy, ctx, attribute, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglWaitGL();
     * 
     *  C function EGLBoolean eglWaitGL ( void )

     * */
    public static boolean eglWaitGL() {
        return getPipeline().eglWaitGL();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglWaitNative([int engine]);
     * 
     *  C function EGLBoolean eglWaitNative ( EGLint engine )

     * */
    public static boolean eglWaitNative(int engine) {
        return  getPipeline().eglWaitNative(engine);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglSwapBuffers([EGLDisplay dpy, EGLSurface surface]);
     * 
     *  C function EGLBoolean eglSwapBuffers ( EGLDisplay dpy, EGLSurface surface )

     * */
    public static boolean eglSwapBuffers(EGLDisplay dpy, EGLSurface surface) {
        return  getPipeline().eglSwapBuffers(dpy, surface);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from EGL14.eglCopyBuffers([EGLDisplay dpy, EGLSurface surface, int target]);
     * 
     *  C function EGLBoolean eglCopyBuffers ( EGLDisplay dpy, EGLSurface surface, EGLNativePixmapType target )

     * */
    public static boolean eglCopyBuffers(EGLDisplay dpy, EGLSurface surface, int target) {
        return  getPipeline().eglCopyBuffers(dpy, surface, target);
    }
}
