package android.opengl;

import gles.graphics.SurfaceTexture;
import gles.view.Surface;
import gles.view.SurfaceHolder;
import gles.view.SurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class EGL15 extends EGLAbstract {
    
    
    public EGL15(int version){
	
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
     * 
     * @return last error
     */
    public int eglGetError(){
	return eglGetError0();
    }
    
    // C function EGLint eglGetError ( void )    
    private static native int eglGetError0();/*
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
    public EGLDisplay eglGetDisplay(int displayID){
    	int handle = eglGetDisplay0(displayID);
    	EGLDisplay eglDisplay = new android.opengl.EGLDisplay(handle);
    	return eglDisplay;
    }
    /**
     * native version of eglDisplay
     * @param display_id handler of display
     * @return handler created for 
     */
    private static native int eglGetDisplay0(int display_id);/*
          return (jint) eglGetDisplay( (NativeDisplayType)display_id);
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
    public static  EGLDisplay eglGetDisplay(long displayID){
    	long handle = eglGetDisplay0(displayID);
    	EGLDisplay eglDisplay = new android.opengl.EGLDisplay(handle);
    	return eglDisplay;
    }
    
    /**
     * native side of {@link #eglGetDisplay(long)}
     * @param display_id the ID of display
     * @return the pointer of EGLDisplay
     */
    private static native long eglGetDisplay0(long displayID);/*
                return (jlong) eglGetDisplay((EGLNativeDisplayType) displayID);
    */
    
    

    // C function EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )

    /**
     *  <pre>
     *  C function EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )
     *  </pre>
     * <b>eglInitialize</b> — initialize an EGL display connection.<br>
     * eglInitialize initialized the EGL display connection obtained with
     * {@link #eglGetDisplay(long)}. <br>
     * Initializing an already initialized EGL display connection
     * has no effect besides returning the version numbers.<br>
     * <b>major</b> and <b>minor</b> do not return values if they are specified as NULL.<br>
     * 
     * Use {@link #eglTerminate(EGLDisplay)} to release resources associated with an EGL display
     * connection.  <br><br>
     * 
     * <P>Errors:</P>
     * 
     * <li>EGL_BAD_DISPLAY is generated if display is not an EGL display connection. 
     * <li>EGL_NOT_INITIALIZED is generated if display cannot be initialized.
     * 
     * @see #eglTerminate(EGLDisplay)
     * @see  #eglGetDisplay(long)
     * 
     * @param dpy
     *            Specifies the EGL display connection to initialize.
     * @param major
     *            Returns the major version number of the EGL implementation.
     *            May be NULL.
     * @param majorOffset
     *            offset in major array
     * @param minor
     *            Returns the minor version number of the EGL implementation.
     *            May be NULL.
     * @param minorOffset
     *            offset in minorOffset
     * 
     * @return true is sucessful
     */
    public boolean eglInitialize(
	        EGLDisplay dpy,
	        int[] major,
	        int majorOffset,
	        int[] minor,
	        int minorOffset
	    ){	
	
	if(null == major) {
	    major = new int[1];
	    majorOffset = 0;
	}
	if(null==minor){
	    minor = new int[1];
	    minorOffset = 0;
	}
	long dpy_handler = ((android.opengl.EGLDisplay)dpy).getNativeHandle();
	return eglInitialize0(dpy_handler, major, majorOffset, minor, minorOffset);	
    }
    
    private static native boolean eglInitialize0(
        long dpy,
        int[] major,
        int majorOffset,
        int[] minor,
        int minorOffset
    );/*
        //EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )
        return (jboolean) eglInitialize ( (EGLDisplay) dpy, (EGLint*) major, (EGLint*) minor );
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

    public boolean eglTerminate(EGLDisplay display){
	long nativeHandler = ((android.opengl.EGLDisplay)display).getNativeHandle();	
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
     * eglQueryString returns a string describing an EGL
     * display connection. Parameter name can be one of the following:</p>
     *<br> 
     *
     * <li>EGL_CLIENT_APIS
     * Returns a string describing which client rendering APIs are supported. The string contains a space-separate list of API names. The list must include at least one of OpenGL, OpenGL_ES, or OpenVG. These strings correspond respectively to values EGL_OPENGL_API, EGL_OPENGL_ES_API, and EGL_OPENVG_API of the eglBindAPI, api argument.
     * 
     *<li> EGL_VENDOR
     * Returns the company responsible for this EGL implementation. This name does not change from release to release.
     * 
     *<li> EGL_VERSION
     * Returns a version or release number. The EGL_VERSION string is laid out as follows:
     * 
     * major_version.minor_version space vendor_specific_info
     * 
     * <li>EGL_EXTENSIONS
     * Returns a space separated list of supported extensions to EGL.
     * 
     * <b>Error:</B>
     * NULL is returned on failure.
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
     *            Specifies the EGL display connection.
     * @param name
     *            Specifies a symbolic constant, one of EGL_CLIENT_APIS,
     *            EGL_VENDOR, EGL_VERSION, or EGL_EXTENSIONS.
     * 
     * @return
     */
    public String eglQueryString(EGLDisplay dpy, int name){
	long nativeHandler = ((EGLObjectHandle)dpy).getNativeHandle();
	
	return eglQueryString0(nativeHandler, name);
    }
    
    /**
     * native version of {@link #eglQueryString(EGLDisplay, int)}
     * @param dpy
     * @param name
     * @return
     */
    private static native String eglQueryString0(long dpy, int name);/*
       const char *nativeString = eglQueryString ( (EGLDisplay) dpy, (EGLint) name );
       return env->NewStringUTF(nativeString);
         
    */
    
    
    // C function EGLBoolean eglGetConfigs ( EGLDisplay dpy, EGLConfig *configs, EGLint config_size, EGLint *num_config )

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
    public  boolean eglGetConfigs(
        EGLDisplay display,
        EGLConfig[] configs,
        int configsOffset,
        int config_size,
        int[] num_config,
        int num_configOffset){
    	
    	long eglDisplay = ((EGLObjectHandle) display).getNativeHandle(); 
    	// support null configs array
    	if(null==configs){
    	    configs = new EGLConfig[1];
    	    configsOffset = 0;
    	    config_size=1;
    	}
    	// prepare new parameters without offset thing
    	long[] eglConfigs = new long[configs.length-configsOffset];    	
    	config_size = eglConfigs.length;
    	int[] pNum_config = new int[1];
    	
    	boolean val = nEGLGetConfigs(eglDisplay, eglConfigs, config_size, pNum_config);

    	// fill back num_config
    	int numConfigs = pNum_config[0];
    	num_config[num_configOffset] = numConfigs;
    	
    	// fill back configs arrays
    	 for(int i = 0; i <= numConfigs; i++){
    	     long handler = eglConfigs[i];
    	     EGLConfig cfg = new android.opengl.EGLConfig(handler);
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
    private static native boolean nEGLGetConfigs( long eglDisplay, 
            long[] configs,            
            int config_size,
            int[] num_config);/*
        
        // C function EGLBoolean eglGetConfigs ( EGLDisplay dpy, EGLConfig *configs, EGLint config_size, EGLint *num_config )
           EGLint _num_config = num_config[0]; 
           EGLBoolean res =  eglGetConfigs ( (EGLDisplay) dpy, (EGLConfig *) configs, (EGLint) config_size, &_num_config );
           
      
        */

    // 
 /**
  * <p>
  * Prototype: C function EGLBoolean eglChooseConfig ( EGLDisplay dpy, const EGLint *attrib_list, EGLConfig *configs, EGLint config_size, EGLint *num_config )
  * </p>
  * 
  * eglChooseConfig — return a list of EGL frame buffer configurations that match specified attributes
  * 
  * @param display Specifies the EGL display connection.
  * @param attrib_list Specifies attributes required to match by configs.
  *  Must end with <b>EGL_NONE</b>.
  * @param attrib_listOffset offset of attrib_list
  * @param configs Returns an array of frame buffer configurations.
  * @param configsOffset offset of configs
  * @param configs_size lenght of configs
  * @param num_config
  * @param num_configOffset
  * 
  * @return 
  */
    public boolean eglChooseConfig(
	        EGLDisplay display,
	        int[] attrib_list,
	        int attrib_listOffset,
	        EGLConfig[] configs,
	        int configsOffset,
	        int configsSize,
	        int[] num_config,
	        int num_configOffset
	    ){
	
	// handlers
	long displayHandler = ((android.opengl.EGLDisplay)display).getNativeHandle();
	long[] configHandlers = null;
	
	// deal with null arrays - better in java than in native side
	if(attrib_list==null || attrib_list.length==0){
	    attrib_list = new int[1];
	    attrib_listOffset = 0;
	}
	
	if(configs == null || configs.length==0){
	    configHandlers = new long[1];
	    configsOffset = 0;
	    configsSize = 1;
	}else{
	    int len = configs.length - configsOffset;
	    configHandlers = new long[len]; // empty	   
	}
	
	if(null == num_config || num_config.length==0){
	    num_config = new int[1];
	    num_configOffset=0;
	}
	
	// perform native call
	boolean val = eglChooseConfig0(
		displayHandler,
		attrib_list, 
		attrib_listOffset, 
		configHandlers, 
		configsOffset, 
		configsSize, 
		num_config, 
		num_configOffset);
	
	// Wrap returning EGLConfig handlers	
	for(int i=0; i<configHandlers.length; i++){
	    long handle = configHandlers[i];
	    EGLConfig eglConfig = null;
	    
	    if(handle != 0) 		
		eglConfig = new android.opengl.EGLConfig(handle);
	    
	    configs[i + configsOffset] = eglConfig;
	}
		
	return val;
    }
    
    private static native boolean eglChooseConfig0(
        long dpy,
        int[] attrib_list,
        int attrib_listOffset,
        long[] configs,
        int configsOffset,
        int config_size,
        int[] num_config,
        int num_configOffset
    );/*
       
           // apply offset
	    EGLint const * _attrib_list = (EGLint const *) (attrib_list + attrib_listOffset);
	    EGLConfig *    _configs = (EGLConfig *)(configs + offset);
	    EGLint *       _num_config = (EGLint*) (num_config + num_configOffset);
	    
	      bool val = eglChooseConfig(
	      			(EGLDisplay) display, 
	       			_attrib_list, 	    
	       			_configs,	   
	      			(EGLint) config_size,
	       			_num_config);
	      
	      return (jboolean) val;  
       
    
    */
    
   /**
    * This is compatible with javax.microedition.opengl
    */
    @Override
    @Deprecated
    public boolean eglGetConfigAttrib(EGLDisplay display, 
	    EGLConfig config, 
	    int attribute, 
	    int[] value){
	return eglGetConfigAttrib(display, config, attribute, value, 0);
    }
        
    /**
     * 
     * @param display
     * @param config
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    public boolean eglGetConfigAttrib(EGLDisplay display, 
	    EGLConfig config, 
	    int attribute, 
	    int[] value,
	    int offset) {
	
	long displayHandler = ((EGLObjectHandle)display).getNativeHandle();
	long configHandler  = ((EGLObjectHandle)config).getNativeHandle();
	// holder for value return
	int[] _value = new int[1];
	
	boolean val = eglGetConfigAttrib0(displayHandler, configHandler, attribute, _value);
	// update returning attrib value
	value[offset] = _value[0];
	
	return val;
    }
    
    /**
     *  Native call to <br>
     *  C function EGLBoolean eglGetConfigAttrib ( EGLDisplay dpy, EGLConfig config, EGLint attribute, EGLint *value)
     * @param dpy
     * @param config
     * @param attribute
     * @param value
     * @param offset
     * @return
     */
    private static native boolean eglGetConfigAttrib0(
        long dpy,
        long config,
        int attribute,
        int[] value
    );/*
    
    // C function EGLBoolean eglGetConfigAttrib ( EGLDisplay dpy, EGLConfig config, EGLint attribute, EGLint *value)
           
     EGLboolean val =  eglGetConfigAttrib ( (EGLDisplay) dpy, 
      				(EGLConfig) config, 
      				(EGLint) attribute,  
      				 value );
      				
     return (jboolean) val; 				
    */

   

    private static native EGLSurface nEGLCreateWindowSurfaceTexture(
        EGLDisplay dpy,
        EGLConfig config,
        Object win,
        int[] attrib_list,
        int offset
    );

    /**
     * @TODO update it to support CanvasEGL
     * 
     * @param display
     * @param config
     * @param nativeWindowType
     * @param attrib_list
     * @param offset
     * @return
     */
 
    public EGLSurface eglCreateWindowSurface(EGLDisplay display, 
	                                     EGLConfig config,  
	                                     Object nativeWindowType,
                                             int[] attrib_list, 
                                             int offset)
    {
	long displayHandler = getNativeHandle(display);
	long configHandler = getNativeHandle(config);
	
	long nativeWindowTypeHandler = 0;
	// nativeWindowType as Wrapped long value
	if(nativeWindowType !=null && nativeWindowType instanceof Long){
	    nativeWindowTypeHandler = (Long)nativeWindowType;
	}
	// nativeWindowType as a Wrapped int value
	if (nativeWindowType != null && nativeWindowType instanceof Integer) {
	    nativeWindowTypeHandler = (Integer) nativeWindowType;
	}
	
	if(attrib_list==null || attrib_list.length==0){
	    attrib_list = new int[1];
	    offset = 0;
	}
	
	long eglSurfaceHandle = eglCreateWindowSurface0(
		displayHandler, 
		configHandler, 
		nativeWindowTypeHandler, 
		attrib_list,
		offset);
	
	EGLSurface eglSurface =  new android.opengl.EGLSurface(eglSurfaceHandle); 
		
	
	return eglSurface;
    }
    
    // C function EGLSurface eglCreateWindowSurface ( EGLDisplay dpy, EGLConfig config, EGLNativeWindowType win, const EGLint *attrib_list )

    private static native long eglCreateWindowSurface0(
        long /*EGLDisplay */ display,
        long /*EGLConfig */ config,
        long /*Object*/ native_win,
        int[] attrib_list,
        int offset);/*
    
    // EGLSurface eglCreateWindowSurface ( EGLDisplay dpy, EGLConfig config, EGLNativeWindowType win, const EGLint *attrib_list )
    
         const EGLint *_attrib_list =  (EGLint const *) (attrib_list + offset);
         EGLSurface eglSurface = eglCreateWindowSurface ( (EGLDisplay) dpy, 
         				     (EGLConfig) config, 
         				     (EGLNativeWindowType) win, 
         				     const EGLint *attrib_list );
         				     
       return (jlong) eglSurface; 				     
    
    */

    @Override
    public boolean eglChooseConfig(EGLDisplay display, int[] attrib_list, EGLConfig[] configs, int config_size,
	    int[] num_config) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglCopyBuffers(EGLDisplay display, EGLSurface surface, Object native_pixmap) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public EGLContext eglCreateContext(EGLDisplay display, EGLConfig config, EGLContext share_context, int[] attrib_list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attrib_list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLSurface eglCreatePixmapSurface(EGLDisplay display, EGLConfig config, Object native_pixmap,
	    int[] attrib_list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLSurface eglCreateWindowSurface(EGLDisplay display, EGLConfig config, Object native_window,
	    int[] attrib_list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean eglDestroyContext(EGLDisplay display, EGLContext context) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglDestroySurface(EGLDisplay display, EGLSurface surface) {
	// TODO Auto-generated method stub
	return false;
    }

   

    @Override
    public boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs, int config_size, int[] num_config) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public EGLContext eglGetCurrentContext() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLDisplay eglGetCurrentDisplay() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLSurface eglGetCurrentSurface(int readdraw) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public EGLDisplay eglGetDisplay(Object native_display) {
	// TODO Auto-generated method stub
	return null;
    }

   

    @Override
    public boolean eglInitialize(EGLDisplay display, int[] major_minor) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw, EGLSurface read, EGLContext context) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglQueryContext(EGLDisplay display, EGLContext context, int attribute, int[] value) {
	// TODO Auto-generated method stub
	return false;
    }

  

    @Override
    public boolean eglQuerySurface(EGLDisplay display, EGLSurface surface, int attribute, int[] value) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglReleaseThread() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface) {
	// TODO Auto-generated method stub
	return false;
    }

    

    @Override
    public boolean eglWaitGL() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean eglWaitNative(int engine, Object bindTarget) {
	// TODO Auto-generated method stub
	return false;
    }
    
    /**
     * Unwrapp EGL type
     * @param eglType a instance of EGLObjectHandle
     * @return wrapped native Handle
     */
    private static final long getNativeHandle(Object eglType){
	return ((EGLObjectHandle)eglType).getNativeHandle();
    }

}
