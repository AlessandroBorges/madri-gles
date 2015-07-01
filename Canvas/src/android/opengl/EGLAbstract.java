/**
 * 
 */
package android.opengl;

import gles.internal.EGL14Pipeline;
import gles.internal.Sys;
import gles.internal.Sys.EGL_PIPE;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/**
 * Fazer Delegate com EGL14
 * @author Alessandro Borges
 *
 */
public abstract class EGLAbstract
implements EGL10 
{
	private static EGLAbstract egl = null;
	
	/**
	 * protected constructor
	 */
	protected EGLAbstract(){}
	
	public static EGLAbstract getInstance(){
		//initialize egl
		return egl;
	}

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglChooseConfig(javax.microedition.khronos.egl.EGLDisplay, int[], javax.microedition.khronos.egl.EGLConfig[], int, int[])
	 */
	@Override
	public abstract boolean eglChooseConfig(EGLDisplay display, int[] attrib_list,
			                        EGLConfig[] configs, int config_size, int[] num_config);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglCopyBuffers(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface, java.lang.Object)
	 */
	@Override
	public abstract boolean eglCopyBuffers(EGLDisplay display, EGLSurface surface,
			Object native_pixmap) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglCreateContext(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, javax.microedition.khronos.egl.EGLContext, int[])
	 */
	@Override
	public abstract EGLContext eglCreateContext(EGLDisplay display, EGLConfig config,
			EGLContext share_context, int[] attrib_list);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, int[])
	 */
	@Override
	public abstract EGLSurface eglCreatePbufferSurface(EGLDisplay display,
			EGLConfig config, int[] attrib_list);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, java.lang.Object, int[])
	 */
	@Override
	public abstract EGLSurface eglCreatePixmapSurface(EGLDisplay display,
			EGLConfig config, Object native_pixmap, int[] attrib_list) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, java.lang.Object, int[])
	 */
	@Override
	public abstract EGLSurface eglCreateWindowSurface(EGLDisplay display,
			EGLConfig config, Object native_window, int[] attrib_list);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglDestroyContext(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLContext)
	 */
	@Override
	public abstract boolean eglDestroyContext(EGLDisplay display, EGLContext context);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglDestroySurface(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface)
	 */
	@Override
	public abstract boolean eglDestroySurface(EGLDisplay display, EGLSurface surface);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetConfigAttrib(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig, int, int[])
	 */
	@Override
	public abstract boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config,
			int attribute, int[] value) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetConfigs(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[], int, int[])
	 */
	@Override
	public abstract boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs,
			int config_size, int[] num_config) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentContext()
	 */
	@Override
	public abstract EGLContext eglGetCurrentContext();

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentDisplay()
	 */
	@Override
	public abstract EGLDisplay eglGetCurrentDisplay() ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetCurrentSurface(int)
	 */
	@Override
	public abstract EGLSurface eglGetCurrentSurface(int readdraw);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetDisplay(java.lang.Object)
	 */
	@Override
	public abstract EGLDisplay eglGetDisplay(Object native_display);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglGetError()
	 */
	@Override
	public abstract int eglGetError(); 

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglInitialize(javax.microedition.khronos.egl.EGLDisplay, int[])
	 */
	@Override
	public abstract boolean eglInitialize(EGLDisplay display, int[] major_minor);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglMakeCurrent(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface, javax.microedition.khronos.egl.EGLSurface, javax.microedition.khronos.egl.EGLContext)
	 */
	@Override
	public abstract boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw,
			EGLSurface read, EGLContext context) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglQueryContext(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLContext, int, int[])
	 */
	@Override
	public abstract boolean eglQueryContext(EGLDisplay display, EGLContext context,
			int attribute, int[] value) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglQueryString(javax.microedition.khronos.egl.EGLDisplay, int)
	 */
	@Override
	public abstract String eglQueryString(EGLDisplay display, int name);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglQuerySurface(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface, int, int[])
	 */
	@Override
	public abstract boolean eglQuerySurface(EGLDisplay display, EGLSurface surface,
			int attribute, int[] value) ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglReleaseThread()
	 */
	@Override
	public abstract boolean eglReleaseThread() ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglSwapBuffers(javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLSurface)
	 */
	@Override
	public abstract boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglTerminate(javax.microedition.khronos.egl.EGLDisplay)
	 */
	@Override
	public abstract boolean eglTerminate(EGLDisplay display);

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglWaitGL()
	 */
	@Override
	public abstract boolean eglWaitGL() ;

	/* (non-Javadoc)
	 * @see javax.microedition.khronos.egl.EGL10#eglWaitNative(int, java.lang.Object)
	 */
	@Override
	public abstract boolean eglWaitNative(int engine, Object bindTarget) ;

}
/**
 * Delegate class to EGL14
 * @author Alessandro Borges
 *
 */
class EGLAbstractImpl extends EGLAbstract{
    
    static EGL14Pipeline egl14pipe;
    
    static{
        egl14pipe = (EGL14Pipeline)Sys.getEGLPipelineInstance(EGL_PIPE.EGL14);
    }

    @Override
    public boolean eglChooseConfig(EGLDisplay display,
                                   int[] attrib_list,
                                   EGLConfig[] configs,
                                   int config_size,
                                   int[] num_config) {
        
        boolean res = egl14pipe.eglChooseConfig((android.opengl.EGLDisplay)display, 
                                  attrib_list, 0, 
                                  (android.opengl.EGLConfig[])configs, 0, 
                                  config_size, num_config, 0);       
        return res;
    }

    @Override
    public boolean eglCopyBuffers(EGLDisplay display, EGLSurface surface, Object native_pixmap) {
        long target = 0L;
        if(native_pixmap instanceof EGLObjectHandle){
            target = ((EGLObjectHandle)native_pixmap).getNativeHandle();
        }else if(native_pixmap instanceof Number){
            target = ((Number)native_pixmap).longValue();            
        }
        
        boolean res = egl14pipe.eglCopyBuffers((android.opengl.EGLDisplay)display, 
                                               (android.opengl.EGLSurface) surface, 
                                               target);
        return res;
    }

    @Override
    public EGLContext eglCreateContext(EGLDisplay display, 
                                       EGLConfig config, 
                                       EGLContext share_context, 
                                       int[] attrib_list) {
        
        EGLContext ctx = egl14pipe.eglCreateContext((android.opengl.EGLDisplay)display, 
                (android.opengl.EGLConfig)config, 
                (android.opengl.EGLContext)share_context, 
                               attrib_list, 0);
        return ctx;
    }

    @Override
    public EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attrib_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EGLSurface eglCreatePixmapSurface(EGLDisplay display,
                                             EGLConfig config,
                                             Object native_pixmap,
                                             int[] attrib_list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EGLSurface eglCreateWindowSurface(EGLDisplay display,
                                             EGLConfig config,
                                             Object native_window,
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
    public boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config, int attribute, int[] value) {
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
    public int eglGetError() {
        // TODO Auto-generated method stub
        return 0;
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
    public String eglQueryString(EGLDisplay display, int name) {
        // TODO Auto-generated method stub
        return null;
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
    public boolean eglTerminate(EGLDisplay display) {
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
    
}
