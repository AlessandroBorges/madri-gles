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

// This source file is automatically generated

package gles.internal;


import android.graphics.SurfaceTexture;
import android.opengl.*;
import android.view.Surface;
import android.view.SurfaceHolder;
import gles.emulator.CanvasEGL;
//import gles.view.Surface;
import gles.view.SurfaceView;
//import gles.view.SurfaceHolder;
import static gles.internal.EGLUtil.*;

/**
 * EGL 1.4
 *
 */
public class EGL14Pipeline implements Pipeline {
    /* 
     * CPP codes
     */
    //@off
    /*JNI
        #define EGL_EGLEXT_PROTOTYPES   
        #include <EGL/egl.h>
        #include <EGL/eglext.h> 
        #include <KHR/khrplatform.h>
        
        #include <stdio.h>
        #include <stdlib.h>
        #include <angle.h>
          
        using namespace std;
        
        /////////////////////////////////////////////// 
      */
  
    /** 
     * Accepted as the <platform> argument of eglGetPlatformDisplayEXT: */
    public final static int      EGL_PLATFORM_ANGLE_ANGLE                       = 0x3201;
    /** 
     * Accepted as an attribute name in the <attrib_list> argument 
     * of   eglGetPlatformDisplayEXT:
     */
    public final static int      EGL_PLATFORM_ANGLE_TYPE_ANGLE                  = 0x3202;
     /** 
      * Accepted as values for the EGL_PLATFORM_ANGLE_TYPE_ANGLE attribute:
      */
    public final static int      EGL_PLATFORM_ANGLE_TYPE_DEFAULT_ANGLE          = 0x3203;

    /**
     * Accepted as an attribute name in the <attrib_list> argument of
     * eglGetPlatformDisplayEXT:
     */
    public final static int      EGL_PLATFORM_ANGLE_MAX_VERSION_MAJOR_ANGLE     = 0x3204;
    public final static int      EGL_PLATFORM_ANGLE_MAX_VERSION_MINOR_ANGLE     = 0x3205;

   /** 
    * Accepted as values for the EGL_PLATFORM_ANGLE_TYPE_ANGLE attribute:
    */

    public final static int      EGL_PLATFORM_ANGLE_TYPE_D3D9_ANGLE             = 0x3207;
    public final static int      EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE            = 0x3208;

     /**Accepted as an attribute name in the <attrib_list> argument of
    * eglGetPlatformDisplayEXT:
*/
    public final static int      EGL_PLATFORM_ANGLE_DEVICE_TYPE_ANGLE           = 0x3209;
    public final static int      EGL_PLATFORM_ANGLE_ENABLE_AUTOMATIC_TRIM_ANGLE = 0x320F;

    // Accepted as values for the EGL_PLATFORM_ANGLE_DEVICE_TYPE_ANGLE attribute:

    public final static int      EGL_PLATFORM_ANGLE_DEVICE_TYPE_HARDWARE_ANGLE  = 0x320A;
    public final static int      EGL_PLATFORM_ANGLE_DEVICE_TYPE_WARP_ANGLE      = 0x320B;
    public final static int      EGL_PLATFORM_ANGLE_DEVICE_TYPE_REFERENCE_ANGLE = 0x320C;
    
    /**
     * The singleton
     */
    private static EGL14Pipeline singleton;
    /**
     * private constructor
     */
    private EGL14Pipeline(){}
    
  /**
   * initialize native variables.
   */
    public static native void nativeClassInit();/*
     // do nothing, meanwhile
    */
    
    static {
       // nativeClassInit();
    }
    
    /**
     * eglGetError returns the error of the last called EGL function in the
     * current thread. Initially, the error is set to EGL_SUCCESS. get last
     * error.
     * <p> 
     * The following errors are currently defined:
     * </p>
     * <li> EGL_SUCCESS -  The last function succeeded without error.   
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
     * Prototype:
     * C function EGLint eglGetError ( void )  
     * 
     * @return last error
     */
    public int eglGetError(){
        return nEGLGetError();
    }
    
    private static native int nEGLGetError();/*
        return (jint) eglGetError();
    */

    
    // C function EGLDisplay eglGetDisplay ( EGLNativeDisplayType display_id )
    /**
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
    public  EGLDisplay eglGetDisplay(int displayID){
        long handle = eglGetDisplay0((long)displayID);
    	return createEGLDisplay(handle);
    }
    
    /**
     * <pre>
     * Get a EGLDisplay from Google Angle.
     * Example:
     *   int displayAttributes[] = {   
     *   EGL_PLATFORM_ANGLE_TYPE_ANGLE, EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE,
     *   EGL_PLATFORM_ANGLE_MAX_VERSION_MAJOR_ANGLE, 9,
     *   EGL_PLATFORM_ANGLE_MAX_VERSION_MINOR_ANGLE, 3,
     *   EGL_NONE,
     *  };
     *   
     *   int platform = EGL_PLATFORM_ANGLE_TYPE_ANGLE;
     *   EGLDisplay mEGLDisplay = EGL14.EGL_DEFAULT_DISPLAY;
     *   
     *   mEglDisplay = eglGetPlatformDisplayEXT(platform,
     *                                          mEGLDisplay, 
     *                                          displayAttributes); 
     *  ////////////////////////////////
     *  
     *  If no <attrib_list> is specified, the value of 
     *  EGL_PLATFORM_ANGLE_TYPE_ANGLE is implicitly set to
     *  EGL_PLATFORM_ANGLE_TYPE_DEFAULT_ANGLE.
     *  
     *  Otherwise, the value of EGL_PLATFORM_ANGLE_TYPE_ANGLE should be:
     *       - EGL_PLATFORM_ANGLE_TYPE_DEFAULT_ANGLE for an implementation dependent
     *         display, equivalent to using a <native_display> of EGL_DEFAULT_DISPLAY,
     *       - EGL_PLATFORM_ANGLE_TYPE_D3D9_ANGLE for a D3D9 display which translates
     *         to OpenGL ES;
     *       - EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE for a D3D11 display which
     *         translates to OpenGL ES;
     *       - EGL_PLATFORM_ANGLE_TYPE_D3D11_WARP_ANGLE a D3D11 WARP display which
     *         translates to OpenGL ES;
     *       - EGL_PLATFORM_ANGLE_TYPE_OPENGL_ANGLE for an OpenGL display which
     *         translates to OpenGL ES;
     *       - EGL_PLATFORM_ANGLE_TYPE_OPENGLES_ANGLE for a native OpenGL ES display;
     * 
     * </pre>
     * 
     * @param platform - EGL_PLATFORM_ANGLE_ANGLE
     * @param display - EGLNativeDisplayType  value or EGL_DEFAULT_DISPLAY
     * @param displayAttributes - int[] with requested attributes
     * 
     * @return EGLDisplay
     */
    public   EGLDisplay eglGetPlatformDisplayEXT(int platform, 
                                                   long eglNativeDisplayType, 
                                                   int[] displayAttributes){
        if(displayAttributes==null){
            int[] val = {EGL_PLATFORM_ANGLE_TYPE_ANGLE, EGL_PLATFORM_ANGLE_TYPE_DEFAULT_ANGLE,
                         EGL_PLATFORM_ANGLE_MAX_VERSION_MAJOR_ANGLE, 9,
                         EGL_PLATFORM_ANGLE_MAX_VERSION_MINOR_ANGLE, 3,
                         EGL14.EGL_NONE, 0};
            displayAttributes = val;
        }
        
        long handle = eglGetPlatformDisplayEXT0(platform, eglNativeDisplayType, displayAttributes);
        EGLDisplay angleDisplay = EGLUtil.createEGLDisplay(handle);
        return angleDisplay;
    }
    
    /**
     * 
     * From eglGetPlatformDisplayEXT
     * Prototype:
     * EGLAPI EGLDisplay EGLAPIENTRY eglGetPlatformDisplayEXT (EGLenum platform, 
     *                    void *native_display, 
     *                    const EGLint *attrib_list);
     * 
     * @param platform
     * @param display
     * @param displayAttributes
     * @return
     */
    static protected native long eglGetPlatformDisplayEXT0(int platform, 
                                                    long display, 
                                                    int[] displayAttributes);/*
//    const EGLint displayAttributes[] =
//    {   
//        EGL_PLATFORM_ANGLE_TYPE_ANGLE, EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE,
//        EGL_PLATFORM_ANGLE_MAX_VERSION_MAJOR_ANGLE, 9,
//        EGL_PLATFORM_ANGLE_MAX_VERSION_MINOR_ANGLE, 3,
//        EGL_NONE,
//      };

    PFNEGLGETPLATFORMDISPLAYEXTPROC eglGetPlatformDisplayEXT = 
     reinterpret_cast<PFNEGLGETPLATFORMDISPLAYEXTPROC>(eglGetProcAddress("eglGetPlatformDisplayEXT"));

    if (!eglGetPlatformDisplayEXT){
        //throw Exception::CreateException(E_FAIL, L"Failed to get function eglGetPlatformDisplayEXT");
        printf(" eglGetPlatformDisplayEXT - Failed to get function eglGetPlatformDisplayEXT");
        return (jlong) 0;
    }
    
    EGLDisplay mEglDisplay = NULL;
   // mEglDisplay = eglGetPlatformDisplayEXT(EGL_PLATFORM_ANGLE_ANGLE, EGL_DEFAULT_DISPLAY, displayAttributes);
     mEglDisplay = eglGetPlatformDisplayEXT((EGLenum) platform,
                                             (void *) display, 
                                             (EGLint *)displayAttributes); 
    if (mEglDisplay == EGL_NO_DISPLAY){
        //throw Exception::CreateException(E_FAIL, L"Failed to get EGL display");
        printf("eglGetPlatformDisplayEXT - Failed to get EGL display");
        return (jlong)0;
    }
    
    if (eglInitialize(mEglDisplay, NULL, NULL) == EGL_FALSE){
        //throw Exception::CreateException(E_FAIL, L"Failed to initialize EGL");
        printf("eglGetPlatformDisplayEXT - Failed to initialize EGL");
        return (jlong)0;
    }
    
    return (jlong)mEglDisplay;
    */
    
    /**
     * native version of eglDisplay
     * @param display_id handler of display
     * @return handler created for 
     */
    private static native long eglGetDisplay0(long display_id);/*
          return (jlong) eglGetDisplay((EGLNativeDisplayType)display_id);
    */

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
    public EGLDisplay eglGetDisplay(long displayID){
    	long handle = eglGetDisplay0(displayID);
    	return createEGLDisplay(handle);
    }
    
     
    

    // C function EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )

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
     * @return true if successful
     */
    public boolean eglInitialize(
	        EGLDisplay dpy,
	        int[] major, int majorOffset,
	        int[] minor, int minorOffset)
    {        
        checkArray(major, majorOffset, "major");
        checkArray(minor, minorOffset, "minor");                
        long dpyHandle = check(dpy);
        return eglInitialize0(dpyHandle, major, majorOffset, minor, minorOffset);
    }
    
    /**
     * Native side.
     * 
     * @param dpy
     * @param major
     * @param majorOffset
     * @param minor
     * @param minorOffset
     * @return
     */
    private static native boolean eglInitialize0(
        long dpy,
        int[] major, int majorOffset,
        int[] minor, int minorOffset
    );/*
        //EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )
        return (jboolean) eglInitialize((EGLDisplay) dpy, 
                                        (EGLint *) (major + majorOffset), 
                                        (EGLint *) (minor + minorOffset));
    */

    /**
     * Prototype: C function EGLBoolean eglTerminate ( EGLDisplay dpy )<br>
     * 
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
     * @return EGL_FALSE is returned if eglTerminate fails, EGL_TRUE otherwise.
     */

    public boolean eglTerminate(EGLDisplay display) {
        long nativeHandler = check(display);
        return eglTerminate0(nativeHandler);
    }
    /**
     * native version of {@link #eglTerminate(EGLDisplay)}
     * @param dpy 
     * @return
     */
    private static native boolean eglTerminate0(long dpy);/*
       // C function EGLBoolean eglTerminate ( EGLDisplay dpy )        
         return (jboolean) eglTerminate ( (EGLDisplay) dpy );        
    */

  

    /**
     * Prototype: C function const char * eglQueryString ( EGLDisplay dpy,
     * EGLint name )<br>
     * <p>
     * eglQueryString returns a string describing an EGL display connection.
     * Parameter name can be one of the following:
     * </p>
     * <br>
     *
     * <li>EGL_CLIENT_APIS Returns a string describing which client rendering
     * APIs are supported. The string contains a space-separate list of API
     * names. The list must include at least one of OpenGL, OpenGL_ES, or
     * OpenVG. These strings correspond respectively to values EGL_OPENGL_API,
     * EGL_OPENGL_ES_API, and EGL_OPENVG_API of the eglBindAPI, api argument.
     * 
     * <li>EGL_VENDOR Returns the company responsible for this EGL
     * implementation. This name does not change from release to release.
     * 
     * <li>EGL_VERSION Returns a version or release number. The EGL_VERSION
     * string is laid out as follows:
     * 
     * major_version.minor_version space vendor_specific_info
     * 
     * <li>EGL_EXTENSIONS Returns a space separated list of supported extensions
     * to EGL.
     * 
     * <b>Error:</B> NULL is returned on failure.
     * 
     * EGL_BAD_DISPLAY is generated if display is not an EGL display connection.
     * 
     * EGL_NOT_INITIALIZED is generated if display has not been initialized.
     * 
     * EGL_BAD_PARAMETER is generated if name is not an accepted value.
     * 
     * </pre>
     * 
     * @param dpy
     *        Specifies the EGL display connection.
     * @param name
     *        Specifies a symbolic constant, one of EGL_CLIENT_APIS,
     *        EGL_VENDOR, EGL_VERSION, or EGL_EXTENSIONS.
     * 
     * @return
     */
    public  String eglQueryString(EGLDisplay dpy, int name) {       
        long nativeHandler =  check(dpy);
        return eglQueryString0(nativeHandler, name);
    }
    
    /**
     * native version of {@link #eglQueryString(EGLDisplay, int)}
     * @param dpy
     * @param name
     * @return
     */
    private static native String eglQueryString0(long dpy, int name);/*
       const char * nativeString = eglQueryString ( (EGLDisplay) dpy, (EGLint) name );
       return env->NewStringUTF(nativeString);
    */
    
    
    
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
     * Use {@link #eglGetConfigAttrib(EGLDisplay, EGLConfig, int, int[], int)} to retrieve 
     * individual attribute values of a frame
     * buffer configuration.
     * </p>
     * <pre>
     * <b>Errors:</b>
     * <li> EGL_BAD_DISPLAY is generated if display is not an EGL display connection.
     * <li> EGL_NOT_INITIALIZED is generated if display has not been initialized.
     * <li> EGL_BAD_PARAMETER is generated if num_config is NULL.
     * 
     * @param display
     *            - Specifies the EGL display connection.
     * @param configs
     *            - Returns a list of configs.
     * @param configsOffset
     *            - offset on configs array
     * @param config_size
     *            - Specifies the size of the list of configs.
     * @param num_config
     *            - number on
     * @param num_configOffset
     * @return EGL_FALSE is returned on failure, EGL_TRUE otherwise. 
     *  configs and num_config are not modified when EGL_FALSE is returned.
     */
    public boolean eglGetConfigs(EGLDisplay display,
                                 EGLConfig[] configs,
                                 int configsOffset, int config_size,
                                 int[] num_config, int num_configOffset) {
    	              
        if(null == configs) throw new IllegalArgumentException("configs == null");        
        if(null == num_config) throw new IllegalArgumentException("num_config == null");        
        if(configsOffset < 0) throw new IllegalArgumentException("configsOffser < 0");        
        if(configs.length - configsOffset < config_size)
            throw new IllegalArgumentException("length - configsOffset < config_size < needed");        
        if(num_configOffset < 0)
            throw new IllegalArgumentException("num_configOffset < 0");        
        if(num_config.length - num_configOffset < 1)
            throw new IllegalArgumentException("length - num_configOffset < 1 < needed");
        
    	     	
    	// prepare new parameters without offset thing
    	long[] eglConfigs = new long[configs.length-configsOffset];    	
    	config_size = eglConfigs.length;
    	int[] pNum_config = new int[1];
    	
    	long eglDisplay = check(display);
    	
    	boolean val = eglGetConfigs0(eglDisplay, eglConfigs, config_size, pNum_config);

    	// fill back num_config
    	int numConfigs = pNum_config[0];
    	num_config[num_configOffset] = numConfigs;
    	
    	// fill back configs arrays
    	 for(int i = 0; i <= numConfigs; i++){
    	     long handle = eglConfigs[i];
    	     EGLConfig cfg = createEGLConfig(handle);
    	     configs[i+configsOffset] =  cfg;
    	 }   	
    	
    	return val;
    }
    /**
     * native version of {@link #eglGetConfigs(EGLDisplay, EGLConfig[], int, int, int[], int)}
     * @param eglDisplay
     * @param configs
     * @param config_size
     * @param num_config
     * @return
     */
    private static native boolean eglGetConfigs0(long eglDisplay,
                                                 long[] configs,
                                                 int config_size,
                                                 int[] num_config);/*        
        // C function EGLBoolean eglGetConfigs ( EGLDisplay dpy, EGLConfig *configs, EGLint config_size, EGLint *num_config )
           return (jboolean)  eglGetConfigs ( (EGLDisplay) eglDisplay, 
                                             (EGLConfig *) configs, 
                                             (EGLint)  config_size, 
                                             (EGLint *) num_config );           
      
        */

    
    
    
    
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
  * @return true if i
  */
    public  boolean eglChooseConfig(
	        EGLDisplay display,
	        int[] attrib_list,   int attrib_listOffset,
	        EGLConfig[] configs, int configsOffset,
	        int config_size,
	        int[] num_config, int num_configOffset)
    {
            
            checkAttrib(attrib_list, attrib_listOffset);            
            // configs check
            String error = null;
            if (configs == null) error = "configs == null";
            if (configsOffset < 0) error = "configsOffset < 0";            
            int remaining = attrib_list.length - attrib_listOffset;
            if (remaining < config_size) error = "length - configsOffset < config_size < needed";
          
            if (error != null) { 
                throw new IllegalArgumentException(error); 
            }   
            
         // num_config checks
            checkArray(num_config, num_configOffset, "num_config");            
            int num_configRemaining = num_config.length - num_configOffset;
        
            long displayHandler = check(display);	
            long[] configHandlers = new long[num_configRemaining];
            boolean val=true;
	
            val = eglChooseConfig0(displayHandler, 
	                       attrib_list, attrib_listOffset, 
	                       configHandlers, num_configRemaining, 
	                       config_size, 
	                       num_config, num_configOffset);
	
            // prepare returning EGLConfig array
            for (int i = 0; i < num_configRemaining; i++) {
                long handle = configHandlers[i];
                EGLConfig eglConfig = createEGLConfig(handle);
                configs[i + configsOffset] = eglConfig;
             }
           
           return val;
    }
    
   
    
    /**
     * <p>
     * Prototype: C function EGLBoolean eglChooseConfig ( EGLDisplay dpy, const
     * EGLint *attrib_list, EGLConfig *configs, EGLint config_size, EGLint
     * *num_config )
     * </p>
     * 
     * @param dpy EGLDisplay handler
     * @param attrib_list
     * @param attrib_listOffset
     * @param configs
     * @param configsOffset
     * @param config_size
     * @param num_config
     * @param num_configOffset
     * @return
     */
    private static native boolean eglChooseConfig0(long display,
                                                   int[] attrib_list, int attrib_listOffset,
                                                   long[] configsHandler, int configLength,
                                                   int config_size,
                                                   int[] num_config, int num_configOffset
            );/*
            
	    EGLConfig * configs = new EGLConfig[configLength]; 
	    EGLBoolean val = eglChooseConfig((EGLDisplay) display,
	      	                             (EGLint *) (attrib_list + attrib_listOffset), 
	      	                             configs,
	      	                             (EGLint) config_size,
	      	                             (EGLint *) (num_config + num_configOffset));
	      
	     // cast EGLConfig objects to jlong 
	     // they can be 32 or 64 bits, so lets cast it one by one to jlong 
	     if (configs) {
	         for (int i = 0; i < configLength; i++) {
	                    configsHandler[i] = (jlong) configs[i];
	          }
              delete[] configs;
              }
	      
	      return (jboolean) val;
    */

    // 

    public   boolean eglGetConfigAttrib(EGLDisplay dpy,
                                        EGLConfig config,
                                        int attribute,
                                        int[] value, int offset){
        
        long dpyHandle = check(dpy);
        long configHandle = check(config);
        checkArray(value, offset, "value");
        
        return eglGetConfigAttrib0(dpyHandle, configHandle, attribute, value, offset);        
    }
    
    /**
     *  C function EGLBoolean eglGetConfigAttrib(EGLDisplay dpy, 
     *                                           EGLConfig config, 
     *                                           EGLint attribute, 
     *                                           EGLint *value )
     *  
     * @param dpy
     * @param config
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    private static native boolean eglGetConfigAttrib0(long dpy,
                                                    long config,
                                                    int attribute,
                                                    int[] value, int offset);/*
                                                    
       EGLBoolean res = eglGetConfigAttrib((EGLDisplay) dpy, 
                                     (EGLConfig) config, 
                                     (EGLint) attribute, 
                                     (EGLint *)(value + offset) );
                       
        return (jboolean) res;                      
      */


    /**
     * C function EGLSurface eglCreateWindowSurface ( EGLDisplay dpy, EGLConfig config, EGLNativeWindowType win, const EGLint *attrib_list ) 
     * Returns a EGLSurface handler
     * @param dpy - EGLDisplay handle
     * @param config - EGLConfig handle
     * @param win - EGLNativeWindowType handle
     * @param attrib_list
     * @param offset
     * @return  EGLSurface handle 
     */
    private static native long eglCreateWindowSurface0(long dpy,
                                                       long config,
                                                                       long win,
                                                                       int[] attrib_list,
                                                       int offset);/*                
                
                EGLSurface surface = eglCreateWindowSurface((EGLDisplay) dpy,
                                                            (EGLConfig) config,
                                                            (EGLNativeWindowType) win,
                                                             (EGLint *) (attrib_list + offset) );
                
                return (jlong) surface;
       */
    
    /**
     * Returns a EGLSurface handler
     * @param dpy - EGLDisplay handle
     * @param config - EGLConfig handle
     * @param win - EGLNativeWindowType handle
     * @param attrib_list 
     * @param offset
     * @return
     */

    public EGLSurface eglCreateWindowSurfaceTexture(EGLDisplay dpy,
                                                    EGLConfig config,
                                                    Object win,
                                                    int[] attrib_list,
                                                    int offset) {

        long dpyHandle = check(dpy);
        long configHandle = check(config);
        checkAttrib(attrib_list, offset);
        
        if (win == null) throw new IllegalArgumentException("win == null");

        long winHandle = ((Surface) win).getNativeHandle();
        long handle = eglCreateWindowSurfaceTexture0(dpyHandle, configHandle, winHandle, attrib_list, offset);
        EGLSurface surface = createEGLSurface(handle);
        return surface;
    }
    
   
    
    /**
     * Returns a EGLSurface handler
     * @param dpy - EGLDisplay handle
     * @param config - EGLConfig handle
     * @param win - EGLNativeWindowType handle
     * @param attrib_list
     * @param offset
     * @return
     */
    private static native long eglCreateWindowSurfaceTexture0(
        long  dpy, // EGLDisplay
        long  config, // EGLConfig
        long win, // EGLNativeWindowType
        int[] attrib_list,
        int offset);/*    
    
       EGLSurface  surface = eglCreateWindowSurface(
                                            (EGLDisplay)dpy,
                                            (EGLConfig)config,
                                            (EGLNativeWindowType) win,
                                            (EGLint *)(attrib_list + offset) );
    
       return (jlong) surface;
    */

    /**
     * TODO - fix the Surface/Win vs Canvas relationship
     * 
     * @param dpy
     * @param config
     * @param win
     * @param attrib_list
     * @param offset
     * @return
     */
    public EGLSurface eglCreateWindowSurface(EGLDisplay dpy, 
                                                    EGLConfig config,  
                                                    Object win,
                                                    int[] attrib_list, int offset)
    {
        
        long dpyHandle = check(dpy);
        long configHandle = check(config);   
        if(null == attrib_list){
            int[] tmp = {EGL14.EGL_NONE};
            attrib_list = tmp;
            offset = 0;
        }
        checkAttrib(attrib_list, offset);
        
        if(null == win){
            throw new IllegalArgumentException("Make sure the SurfaceView or associated SurfaceHolder has a valid Surface");
        }
        
        Surface sur = null;
        if(win instanceof CanvasEGL){
            CanvasEGL canvasEGL = (CanvasEGL)win;            
            sur = canvasEGL.getHolder().getSurface();
        }else
        if (win instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView)win;
            sur = surfaceView.getHolder().getSurface();
        } else if (win instanceof SurfaceHolder) {
            SurfaceHolder holder = (SurfaceHolder)win;
            sur = holder.getSurface();
        } else if (win instanceof Surface) {
            sur = (Surface) win;
        }

        EGLSurface surface;
        if (sur != null) {
            long handle = eglCreateWindowSurface0(dpyHandle, configHandle, sur.getNativeHandle(), attrib_list, offset); 
            surface = createEGLSurface(handle);
        } else if (win instanceof SurfaceTexture) {
            SurfaceTexture surTex = (SurfaceTexture) win;
            long handle = eglCreateWindowSurfaceTexture0(dpyHandle, configHandle, surTex.getNativeHandle(), attrib_list, offset); 
            surface = createEGLSurface(handle);
        } else {
            throw new java.lang.UnsupportedOperationException(
                "eglCreateWindowSurface() can only be called with an instance of " +
                "Surface, SurfaceView, SurfaceTexture or SurfaceHolder at the moment, " +
                "this will be fixed later.");
        }

        return surface;
    }
    
    
    // 
    /**
     * Prototype: C function EGLSurface eglCreatePbufferSurface ( EGLDisplay dpy, EGLConfig config, const EGLint *attrib_list )
     *  
     * @param dpy
     * @param config
     * @param attrib_list
     * @param offset
     * @return
     */
    public EGLSurface eglCreatePbufferSurface(EGLDisplay dpy,
                                              EGLConfig config,
                                              int[] attrib_list, int offset) 
    {
        checkAttrib(attrib_list, offset);
        long dpyHandle = check(dpy);
        long configHandle = check(config);        
        long surfaceHandle = eglCreatePbufferSurface0(dpyHandle, configHandle, attrib_list, offset);        
        EGLSurface surface = createEGLSurface(surfaceHandle);        
        return surface;
    }
    
    /**
     * native implementation
     * 
     * @param dpy
     * @param config
     * @param attrib_list
     * @param offset
     * @return
     */
    private static native long eglCreatePbufferSurface0(long dpy,
                                                        long config,
                                                        int[] attrib_list,
                                                        int offset
            );/*
       EGLSurface  surface = eglCreatePbufferSurface(
                                (EGLDisplay)dpy,
                                (EGLConfig)config,
                                (EGLint *)(attrib_list + offset));
                                
        return (jlong) surface;  
    */

    //
    /**
     * prototype  C function EGLSurface eglCreatePixmapSurface( EGLDisplay dpy, EGLConfig config, EGLNativePixmapType pixmap, const EGLint *attrib_list )
     * 
     * @param dpy
     * @param config
     * @param pixmap
     * @param attrib_list
     * @param offset
     * @return
     */
    public EGLSurface eglCreatePixmapSurface(EGLDisplay dpy,
                                             EGLConfig config,
                                             int pixmap,
                                             int[] attrib_list,
                                             int offset
            ) {
        throw new UnsupportedOperationException("eglCreatePixmapSurface");
        //if( null == dpy) throw new IllegalArgumentException(ERROR_EGLDISPLAY_NULL);
        //if( null == config) throw new IllegalArgumentException(ERROR_EGLSURFACE_NULL);
        
        //return createEGLSurface(0);
    }

    /**
     * native impl.
     * 
     * @param dpy
     * @param config
     * @param pixmap
     * @param attrib_list
     * @param offset
     * @return
     */
    private static native EGLSurface eglCreatePixmapSurface0(
            long dpy,
            long config,
            int pixmap,
            int[] attrib_list,
            int offset
        );/*
        
         // no op
          return JNI_FALSE;
        
        */

    /**
     * 
     * Prototype: C function EGLBoolean eglDestroySurface ( EGLDisplay dpy, EGLSurface surface )
     * 
     * @param dpy
     * @param surface
     * @return
     */
    public boolean eglDestroySurface(EGLDisplay dpy, EGLSurface surface){        
        if( null == dpy) throw new IllegalArgumentException(ERROR_EGLDISPLAY_NULL);
        if( null == surface) throw new IllegalArgumentException(ERROR_EGLSURFACE_NULL);
        
        long dpyHandle = dpy.getNativeHandle();
        long surfaceHandle = surface.getNativeHandle();
        
        return eglDestroySurface0(dpyHandle, surfaceHandle);        
    }
    
    /**
     * native implementation
     * 
     * @param dpy
     * @param surface
     * @return
     */
    private static native boolean eglDestroySurface0(long dpy, long surface);/*                    
      return (jboolean) eglDestroySurface ( (EGLDisplay) dpy, (EGLSurface) surface );
     */


    
    /**
     * Prototype : C function EGLBoolean eglQuerySurface ( EGLDisplay dpy, EGLSurface surface, EGLint attribute, EGLint *value )
     * @param dpy
     * @param surface
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    public boolean eglQuerySurface(EGLDisplay dpy,
                                          EGLSurface surface,
                                          int attribute,
                                          int[] value,
                                          int offset
            ) {        
        checkArray(value, offset, "value");
        long dpyHandle = check(dpy);
        long surfaceHandle = check(surface);        
        boolean res = eglQuerySurface0(dpyHandle, surfaceHandle, attribute, value, offset);        
        return res;        
    }

    /**
     * Native implementation
     * 
     * @param dpy
     * @param surface
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    private static native boolean eglQuerySurface0(long dpy,
                                                   long surface,
                                                   int attribute,
                                                   int[] value,
                                                   int offset
            );/*
        
        return (jboolean) eglQuerySurface((EGLDisplay) dpy, 
                                          (EGLSurface) surface, 
                                          (EGLint) attribute, 
                                          (EGLint *)(value + offset));
         
      */
    
    
    
    /**
     *  Prototype C function EGLBoolean eglBindAPI ( EGLenum api ) 
     * @param api
     * @return
     */
    public boolean eglBindAPI(int api){
        return eglBindAPI0(api);
    }
    
    /**
     * native implementation
     * @param api
     * @return
     */
    private static native boolean eglBindAPI0(int api);/*
       return (jboolean) eglBindAPI((EGLenum) api);
    */


    /**
     * Prototype: C function EGLenum eglQueryAPI ( void )
     * 
     * @return
     */
    public int eglQueryAPI(){
        return eglQueryAPI0();
    }
    
    /**
     * Native implementation
     * @return
     */
    private static native int eglQueryAPI0();/*
         return (jint) eglQueryAPI();
    */
    
   
  /**
   * 
   * prototype  C function EGLBoolean eglWaitClient ( void )
   * 
   * @return
   */
    public boolean eglWaitClient(){
        return eglWaitClient0();
    }
    
    /**
     * 
     * @return
     */
    private static native boolean eglWaitClient0();/*
      return (jboolean) eglWaitClient();
    */

    /**
     * C function EGLBoolean eglReleaseThread ( void )
     * @return
     */
    public boolean eglReleaseThread(){
        return eglReleaseThread0();
    }
    
    /**
     * native impl
     * C function EGLBoolean eglReleaseThread ( void )
     * @return
     */
    private static native boolean eglReleaseThread0();/*
      return (jboolean) eglReleaseThread();
    */

   
    // TODO Deprecate the below method
    /**
     *  C function EGLSurface eglCreatePbufferFromClientBuffer ( EGLDisplay dpy, 
     *                                                           EGLenum buftype, 
     *                                                           EGLClientBuffer buffer, 
     *                                                           EGLConfig config, 
     *                                                           const EGLint *attrib_list )
     * @param dpy
     * @param buftype
     * @param buffer
     * @param config
     * @param attrib_list
     * @param offset
     * @return
     */
    @Deprecated
    public EGLSurface eglCreatePbufferFromClientBuffer(
        EGLDisplay dpy,
        int buftype,
        int buffer,
        EGLConfig config,
        int[] attrib_list,
        int offset
    ){
        long bufferLong = buffer;
        EGLSurface surface = eglCreatePbufferFromClientBuffer(dpy, 
                                                              buftype,
                                                              bufferLong, 
                                                              config, 
                                                              attrib_list, offset);        
        return surface;
    }
    
    
    /**
      *  C function EGLSurface eglCreatePbufferFromClientBuffer ( EGLDisplay dpy, 
     *                                                           EGLenum buftype, 
     *                                                           EGLClientBuffer buffer, 
     *                                                           EGLConfig config, 
     *                                                           const EGLint *attrib_list )
     * @param dpy
     * @param buftype
     * @param buffer_long
     * @param config
     * @param attrib_list
     * @param offset
     * @return
     */
    public EGLSurface eglCreatePbufferFromClientBuffer(EGLDisplay dpy,
                                                       int buftype,
                                                       long buffer_long,
                                                       EGLConfig config,
                                                       int[] attrib_list,  int offset) 
    {
        long dpyHandle = check(dpy);  
        long configHandle = check(config);
        checkAttrib(attrib_list, offset);
        long surfaceHandle = eglCreatePbufferFromClientBuffer0(dpyHandle, 
                                                               buftype, 
                                                               buffer_long, 
                                                               configHandle, 
                                                               attrib_list, offset);        
        EGLSurface surface = createEGLSurface(surfaceHandle);
        return surface;
    }
    
    /**
     * Native impl
     *  C function EGLSurface eglCreatePbufferFromClientBuffer ( EGLDisplay dpy, 
     *                                                           EGLenum buftype, 
     *                                                           EGLClientBuffer buffer, 
     *                                                           EGLConfig config, 
     *                                                           const EGLint *attrib_list )
     * @param dpy
     * @param buftype
     * @param buffer
     * @param config
     * @param attrib_list
     * @param offset
     * @return
     */
    private static native long eglCreatePbufferFromClientBuffer0(
            long dpy,
            int buftype,
            long buffer,
            long config,
            int[] attrib_list,
            int offset
        );/*
        
        EGLSurface surface = eglCreatePbufferFromClientBuffer ( (EGLDisplay) dpy, 
                                                      (EGLenum) buftype, 
                                                      reinterpret_cast<EGLClientBuffer>(buffer),
                                                      (EGLConfig) config, 
                                                      (EGLint *) attrib_list );
        return (jlong) surface;
        */

    // 

    /**
     * C function EGLBoolean eglSurfaceAttrib ( EGLDisplay dpy, 
     *                                          EGLSurface surface, 
     *                                          EGLint attribute, 
     *                                          EGLint value )
     * 
     * @param dpy
     * @param surface
     * @param attribute
     * @param value
     * @return
     */
    public boolean eglSurfaceAttrib(EGLDisplay dpy,
                                    EGLSurface surface,
                                    int attribute,
                                    int value) 
    {       
        long dpyHandle = check(dpy);        
        long surfaceHandle = check(surface);        
        return eglSurfaceAttrib0(dpyHandle, surfaceHandle, attribute, value);        
    }

    /**
     * native impl
     * @param dpy
     * @param surface
     * @param attribute
     * @param value
     * @return
     */
    private static native boolean eglSurfaceAttrib0(long dpy,
                                                    long surface,
                                                    int attribute,
                                                    int value);/*        
        return (jboolean) eglSurfaceAttrib((EGLDisplay) dpy, 
                                           (EGLSurface) surface, 
                                           (EGLint) attribute, 
                                           (EGLint) value );
        
        */

 
    /**
     * C function EGLBoolean eglBindTexImage ( EGLDisplay dpy, EGLSurface surface, EGLint buffer )
     * @param dpy
     * @param surface
     * @param buffer
     * @return
     */
    public boolean eglBindTexImage(EGLDisplay dpy,
                                   EGLSurface surface,
                                   int buffer) {       
        long dpyHandle = check(dpy);        
        long surfaceHandle = check(surface);        
        return eglBindTexImage0(dpyHandle, surfaceHandle, buffer);
    }

    /**
     * native impl
     * @param dpy
     * @param surface
     * @param buffer
     * @return
     */
    private static native boolean eglBindTexImage0(long dpy,
                                                   long surface,
                                                   int buffer);/*        
        return (jboolean) eglBindTexImage( (EGLDisplay) dpy, (EGLSurface) surface, (EGLint) buffer );        
        */
   
    /**
     *  C function EGLBoolean eglReleaseTexImage ( EGLDisplay dpy, EGLSurface surface, EGLint buffer )
     *  
     * @param dpy
     * @param surface
     * @param buffer
     * @return
     */
    public boolean eglReleaseTexImage(EGLDisplay dpy,
                                      EGLSurface surface,
                                      int buffer) 
    {       
        long dpyHandle = check(dpy);        
        long surfaceHandle = check(surface);        
        return eglReleaseTexImage0(dpyHandle, surfaceHandle, buffer);
    }

    /**
     * C function EGLBoolean eglReleaseTexImage ( EGLDisplay dpy, EGLSurface surface, EGLint buffer )
     * @param dpy
     * @param surface
     * @param buffer
     * @return
     */
    private static native boolean eglReleaseTexImage0(long /* EGLDisplay */dpy,
                                                      long /* EGLSurface */surface,
                                                      int buffer);/*
        return (jboolean) eglReleaseTexImage((EGLDisplay) dpy, 
                                             (EGLSurface) surface, 
                                             (EGLint) buffer );
        
        */
   

    /**
     * C function EGLBoolean eglSwapInterval ( EGLDisplay dpy, EGLint interval )
     * @param dpy
     * @param interval
     * @return
     */
    public boolean eglSwapInterval(EGLDisplay dpy,
                                   int interval) 
    {
        long dpyHandle = check(dpy);        
        return eglSwapInterval0(dpyHandle, interval);        
    }
    
    /**
     * native impl
     * @param dpy
     * @param interval
     * @return
     */
    private static native boolean eglSwapInterval0(long dpy, int interval);/*
         return (jboolean) eglSwapInterval((EGLDisplay) dpy, (EGLint) interval);
           
        */

    // 

    /**
     * C function EGLContext eglCreateContext(EGLDisplay dpy, 
     *                                        EGLConfig config, 
     *                                        EGLContext share_context, 
     *                                        const EGLint *attrib_list) 
     * @param dpy
     * @param config
     * @param share_context
     * @param attrib_list
     * @param offset
     * @return
     */
    public EGLContext eglCreateContext(EGLDisplay dpy,
                                       EGLConfig config,
                                       EGLContext share_context,
                                       int[] attrib_list,
                                       int offset) {
        long dpyHandle = check(dpy);
        long configHandle = check(config);
        long share_contextHandle = check(share_context);
              
        checkAttrib(attrib_list, offset);
        
        long handle = eglCreateContext0(dpyHandle, 
                                        configHandle, 
                                        share_contextHandle, 
                                        attrib_list, offset);        
        return createEGLContext(handle);        
    }
    
    /**
     * 
     * @param dpy
     * @param config
     * @param share_context
     * @param attrib_list
     * @param offset
     * @return
     */
    private static native long eglCreateContext0(long dpy,
                                                     long config,
                                                     long share_context,
                                                     int[] attrib_list,
                                                     int offset);/*
                                                     
       return (jlong) eglCreateContext((EGLDisplay) dpy, 
                                        (EGLConfig) config, 
                                        (EGLContext) share_context, 
                                        (EGLint *)(attrib_list+offset)); 
                                                     
      */

    // 

    /**
     * C function EGLBoolean eglDestroyContext ( EGLDisplay dpy, EGLContext ctx )
     * 
     * @param dpy
     * @param ctx
     * @return
     */
    public boolean eglDestroyContext(EGLDisplay dpy, EGLContext ctx){
        long dpyHandle = check(dpy);
        long ctxHandle = check(ctx);
        
        return eglDestroyContext0(dpyHandle, ctxHandle);
        
    }
    
    /**
     * C function EGLBoolean eglDestroyContext ( EGLDisplay dpy, EGLContext ctx )
     * @param dpy
     * @param ctx
     * @return
     */
    private static native boolean eglDestroyContext0(long dpy, long ctx);/*
     return (jboolean) eglDestroyContext((EGLDisplay) dpy, (EGLContext) ctx);
    */
    

    // 
    /**
     * C function EGLBoolean eglMakeCurrent(EGLDisplay dpy, 
     *                                      EGLSurface draw, 
     *                                      EGLSurface read, 
     *                                      EGLContext ctx )
     * 
     * @param dpy
     * @param draw
     * @param read
     * @param ctx
     * @return
     */
    public boolean eglMakeCurrent(EGLDisplay dpy,
                                  EGLSurface draw,
                                  EGLSurface read,
                                  EGLContext ctx) {
        long dpyHandle = check(dpy);
        long drawHandle = check(draw);
        long readHandle = check(read);
        long ctxHandle = check(ctx);        
        return eglMakeCurrent0(dpyHandle, drawHandle, readHandle, ctxHandle);        
    }
    
    /**
     * 
     * @param dpy
     * @param draw
     * @param read
     * @param ctx
     * @return
     */
    private static native boolean eglMakeCurrent0(long dpy,
                                                long draw,
                                                long  read,
                                                long  ctx);/*
                                                
       return (jboolean) eglMakeCurrent((EGLDisplay) dpy, 
                                        (EGLSurface) draw, 
                                        (EGLSurface) read, 
                                        (EGLContext) ctx );                             
     */

  

    /**
     * C function EGLContext eglGetCurrentContext ( void )
     * @return
     */
    public EGLContext eglGetCurrentContext(){        
        long ctxHandle = eglGetCurrentContext0();
        EGLContext ctx = createEGLContext(ctxHandle);        
        return ctx;
    }

    /**
     * 
     * @return
     */
    private static native long eglGetCurrentContext0();/*
       return (jlong) eglGetCurrentContext();
    */

    // C function EGLSurface eglGetCurrentSurface ( EGLint readdraw )

    /**
     *  C function EGLSurface eglGetCurrentSurface ( EGLint readdraw )
     * TODO fix me
     * @param readdraw
     * @return
     */
    public EGLSurface eglGetCurrentSurface(int readdraw){        
        long handle = eglGetCurrentSurface0(readdraw); 
        EGLSurface surface = (handle==0) ? null : createEGLSurface(handle);
        return surface;        
    }
    
    /**
     * Native side of {@link #eglGetCurrentSurface(int)}
     * @param readdraw
     * @return
     */
    private static native long eglGetCurrentSurface0(int readdraw);/*
        return (jlong) eglGetCurrentSurface((EGLint)readdraw);     
    */


    /**
     *  C function EGLDisplay eglGetCurrentDisplay ( void )
     *  
     * @return current EGL Display
     */
    public EGLDisplay eglGetCurrentDisplay(){
        long handle = eglGetCurrentDisplay0();
        EGLDisplay dsp = createEGLDisplay(handle);        
        return dsp;
    }
    
    private static native long eglGetCurrentDisplay0();/*        
       return (jlong) eglGetCurrentDisplay();
    */

    //

    /**
     * C function EGLBoolean eglQueryContext ( EGLDisplay dpy, 
     *                                         EGLContext ctx, 
     *                                         EGLint attribute, 
     *                                         EGLint *value )
     *  
     * @param dpy
     * @param ctx
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    public boolean eglQueryContext(EGLDisplay dpy,
                                          EGLContext ctx,
                                          int attribute,
                                          int[] value, int offset) {
        checkArray(value, offset, "value");
        long dpyHandle = check(dpy);
        long ctxHandle = check(ctx);
        return eglQueryContext0(dpyHandle, ctxHandle, attribute, value, offset);                
    }
    
    /**
     * 
     * @param dpy
     * @param ctx
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    private static native boolean eglQueryContext0(long dpy,
                                                   long ctx,
                                                   int attribute,
                                                   int[] value,
                                                   int offset);/*
         return (jboolean) eglQueryContext((EGLDisplay)dpy,
                                             (EGLContext)ctx,
                                             (EGLint) attribute,
                                             (EGLint *)(value + offset));                            
       */


    // 
    /**
     * C function EGLBoolean eglWaitGL ( void )
     * @return
     */
    public boolean eglWaitGL(){
        return eglWaitGL0();
    }
    
    /**
     * 
     * @return
     */
    private static native boolean eglWaitGL0(
    );/*
        return (jboolean) eglWaitGL();
    */

    // C function EGLBoolean eglWaitNative ( EGLint engine )
    public boolean eglWaitNative(int engine) {
        return eglWaitNative0(engine);
    }
    
    /**
     * native implementation
     * @param engine
     * @return
     */
    private static native boolean eglWaitNative0(int engine);/*        
        return (jboolean) eglWaitNative((EGLint) engine);        
     */
    

  
    /**
     * C function EGLBoolean eglSwapBuffers ( EGLDisplay dpy, EGLSurface surface )
     * @param dpy
     * @param surface
     * @return
     */
    public boolean eglSwapBuffers(EGLDisplay dpy,
                                  EGLSurface surface) {
        long dpyHandle = check(dpy);
        long surfaceHandle = check(surface);        
        return eglSwapBuffers0(dpyHandle, surfaceHandle);
    }
    
    /**
     * C function EGLBoolean eglSwapBuffers ( EGLDisplay dpy, EGLSurface surface )
     * @param dpy
     * @param surface
     * @return
     */
    private static native boolean eglSwapBuffers0(long dpy, long surface);/* 
        return (jboolean) eglSwapBuffers ( (EGLDisplay) dpy, (EGLSurface) surface );        
       */
    
    /**
     * C function EGLBoolean eglCopyBuffers ( EGLDisplay dpy, EGLSurface surface, EGLNativePixmapType target )
     * 
     * @param dpy
     * @param surface
     * @param target
     * @return
     */
    public boolean eglCopyBuffers(EGLDisplay dpy,
                                  EGLSurface surface,
                                  long target) {      
        long dpyHandle = check(dpy);
        long surfaceHandle = check(surface);        
        return eglCopyBuffers0(dpyHandle, surfaceHandle, target);
    }
   
    /**
     * C function EGLBoolean eglCopyBuffers ( EGLDisplay dpy, 
     *                                        EGLSurface surface, 
     *                                        EGLNativePixmapType target )
     * 
     * @param dpy
     * @param surface
     * @param target
     * @return
     */
    private static native boolean eglCopyBuffers0(
            long dpy,
            long surface,
            long target
        );/*        
       return (jboolean) eglCopyBuffers((EGLDisplay) dpy, 
                                        (EGLSurface) surface, 
                                        (EGLNativePixmapType) target);  
       */
    
    /**
     * Often when rendering a sequence of images, there is some time at which
     * each image is intended to be presented to the viewer. This extension allows
     * this desired presentation time to be specified for each frame rendered to
     * an EGLSurface, allowing the native window system to use it.
     * 
     * @param dpy
     * @param sur
     * @param time
     * @return
     */
    public  boolean eglPresentationTimeANDROID(EGLDisplay dpy,
                                                            EGLSurface sur,
                                                            long time){        
        long dpyHandle = check(dpy);
        long surHandle = check(sur);
        return eglPresentationTimeANDROID0(dpyHandle, surHandle, time);        
    }
    

    /**
     * 
     * @param dpy
     * @param sur
     * @param time
     * @return
     */
    public static native boolean eglPresentationTimeANDROID0(long dpy,
                                                             long sur,
                                                             long time);/*
        #ifdef   eglPresentationTimeANDROID                                                   
        return (jboolean) eglPresentationTimeANDROID((EGLDisplay) dpy,
                                                     (EGLSurface) sur,
                                                     (EGLnsecsANDROID)  time); 
         #else
          return JNI_FALSE;
         #endif                                                                        
      */
    
   
    
    /////////////////////////////////////////////////////////////////////////////////
    /// Error Checking
    ////////////////////////////////////////////////////////////////////////////////
    
    private static String ERROR_EGLDISPLAY_NULL = "EGLDisplay == null";
    private static String ERROR_EGLSURFACE_NULL = "EGLSurface == null";

    /**
     * Check EGLObjectHandle
     * @param dpy EGLDisplay instance
     * @return EGLDisplay handle
     *
     */
    private static long check(EGLObjectHandle dpy){
        if (null==dpy) return 0L;
        return dpy.getNativeHandle();
    }
     
    /**
     * Check EGLDisplay
     * @param dpy EGLDisplay instance
     * @return EGLDisplay handle
     * @throws IllegalArgumentException if display is null
     */
    private static long check(EGLDisplay dpy){
        if (null==dpy) return 0L; 
            //throw new IllegalArgumentException(ERROR_EGLDISPLAY_NULL);
        return dpy.getNativeHandle();
    }
    
    /**
     * Check EGLConfig
     * @param config - EGLConfig instance
     * @return EGLConfig handle
     * @throws IllegalArgumentException if config is null
     */
    private static long check(EGLConfig config){
        if (null==config) return 0L; 
            //throw new IllegalArgumentException("EGLConfig == null");
        return config.getNativeHandle();
    }
    
    /**
     * Check EGLSurface
     * @param surface EGLSurface instance
     * @return EGLSurface handle
     * @throws IllegalArgumentException if surface is null
     */
    private static long check(EGLSurface surface){
        if (null==surface) return 0L; 
            //throw new IllegalArgumentException("EGLSurface == null");
        return surface.getNativeHandle();
    }

    /**
     * 
     * @param ctx EGLContext instance
     * @return ctx handle
     * @throws  IllegalArgumentException if ctx is null
     */
    private static long check(EGLContext ctx){
        if (null==ctx) return 0L; 
            //throw new IllegalArgumentException("EGLContext == null");
        return ctx.getNativeHandle();
    }
    
    /**
     * check if attrib_list array contains EGL_NOME
     * 
     * @param attrib_list attrib list
     * @param attrib_listOffset offset
     * @return true if attrib list contains EGL_NONE 
     */
    private static boolean checkEGLNONE(int[] attrib_list, int attrib_listOffset){
        boolean attrib_list_sentinel = false;
        
        int remaining = attrib_list.length - attrib_listOffset;
        for (int i = remaining - 1; i >= 0; i--)  {
            if (attrib_list[i] == EGL14.EGL_NONE){
                attrib_list_sentinel = true;
                break;
            }
        }
        return attrib_list_sentinel;
    }  
    
    /**
     * Check attrib_list properies, inclusive  checkEGLNONE().
     *      * 
     * @see #checkEGLNONE(int[], int)
     * 
     * @param attrib_list int[] with attributes
     * @param attrib_listOffset offset of attrib_list
     * @throws IllegalArgumentException in following cases:
     *  <li>if attrib is null;
     *  <li>if offset < 0;
     *  <li>if length of attrib_list is < 1.
     * 
     */
    private static void checkAttrib(int[] attrib_list, int attrib_listOffset) {
        if (null == attrib_list) throw new IllegalArgumentException("attrib_list == null");
        if (attrib_listOffset < 0) throw new IllegalArgumentException("attrib_listOffset < 0");

        if (attrib_list.length - attrib_listOffset < 1)
            throw new IllegalArgumentException("length - Offset < 1 < needed");
        if (!checkEGLNONE(attrib_list, attrib_listOffset)) { 
            throw new IllegalArgumentException("attrib_list must contain EGL_NONE!"); 
            }
    }
    
    /**
     * Check a parameter array
     * @param array
     * @param offset
     * 
     *  @throws IllegalArgumentException in following cases:
     *  <li>if array is null;
     *  <li>if offset < 0;
     *  <li>if array length < 1.
     */
    private static void checkArray(int[] array, int offset, String arrayName){
        if (null == array) throw new IllegalArgumentException(arrayName + " == null");
        if (offset < 0) throw new IllegalArgumentException(arrayName + "offset < 0");
        if (array.length - offset < 1)
            throw new IllegalArgumentException(arrayName+".length - offset < 1 < needed");        
    }

    
 
    public static EGL14Pipeline getPipelineInstance() {
        if(null == singleton){
            singleton = new EGL14Pipeline();
        }
        return singleton;
    }

}
