/**
 * 
 */
package gles.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

import android.opengl.GLSurfaceView.EGLConfigChooser;

/**
 * @author Alessandro Borges
 *
 */
public class GlesEGLConfigChooser 
extends ComponentSizeChooser 
implements EGLConfigChooser {

    /**
     * value to set when you dont care about the result
     */
    public static final boolean DONT_CARE = false;
    
    protected boolean force16BitColor; 
    protected boolean force16bitDepth;
    protected boolean chooseAlpha;
    protected boolean chooseStencil; 
    protected boolean choose4xSample;
    protected boolean choose2xSample;
    protected int mEGLContextClientVersion;
    protected boolean printConfigs = false;
    
    
    
    /**
     * Creates an EGLConfigChooser with a simplified options.
     * 
     * @param force16BitColor - set true to get a RGB565 color buffer, false to get RGB_888_ color buffer.
     * @param force16bitDepth - set true to force a 16bits depth buffer. DONT_CARE may return 24 or 16bit depth buffer  
     * @param forceAlpha - set true to get at least 1bit  Alpha. 
     * @param forceStencil - set true to get some at least 1bit stencil. 
     * @param choose4xSample - set true to get 4x Sample.  
     * @param choose2xSample - set true to get a 2x samples
     * @param eglContextClientVersion - set 1 for GL-ES 1.x; 2 for GL-ES 2.0 or 3 for GL-ES 3.x
     */
    public GlesEGLConfigChooser(final boolean force16BitColor, 
                                final boolean force16bitDepth, 
                                final boolean forceAlpha,
                                final boolean forceStencil, 
                                final boolean choose4xSample, 
                                final boolean choose2xSample,
                                final int eglContextClientVersion) {
        super(force16BitColor ? 5:8 ,
              force16BitColor ? 6:8,
              force16BitColor ? 5:8,
              forceAlpha ? 1 : 0,  
              16, // choose16bitDepth 16/24
              forceStencil ? 1 : 0,
              eglContextClientVersion);
        
        this.force16BitColor = force16BitColor;
        this.force16bitDepth = force16bitDepth;
        this.chooseStencil = forceStencil;
        this.choose4xSample = choose4xSample;
        this.choose2xSample = choose2xSample;
        this.mEGLContextClientVersion = eglContextClientVersion;
    }

    /**
     * choose a config based on ctor parameters
     * @return a valid EGLConfigChooser, if available. Otherwise return null 
     */
    @Override
    public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display, EGLConfig[] configs) {
        
        if(printConfigs){
            System.out.println("print all EGLConfig available (" + configs.length +"):" );
            for (EGLConfig config : configs) {
                EGLConfigInfo info = new EGLConfigInfo((android.opengl.EGLConfig)config, (android.opengl.EGLDisplay)display);
                System.out.println(info);
            }
            
        }
        
        for (EGLConfig config : configs) {
        
            int d = findConfigAttrib(egl, display, config, EGL10.EGL_DEPTH_SIZE, 0);
            int s = findConfigAttrib(egl, display, config, EGL10.EGL_STENCIL_SIZE, 0);
            int a = findConfigAttrib(egl, display, config, EGL10.EGL_ALPHA_SIZE, 0);
            
            int samples = findConfigAttrib(egl, display, config, EGL10.EGL_SAMPLES, 0);
            
            boolean samplesTest = (choose4xSample == DONT_CARE && choose2xSample==DONT_CARE) || (choose4xSample && samples == 4) || (choose2xSample && samples == 2) ;            
            
            boolean depthTest = (force16bitDepth && d==16) || (force16bitDepth == DONT_CARE && d>=16);  
            
            if (depthTest && samplesTest && (s >= mStencilSize) && a >= mAlphaSize) {
                int r = findConfigAttrib(egl, display, config, EGL10.EGL_RED_SIZE, 0);
                int g = findConfigAttrib(egl, display, config, EGL10.EGL_GREEN_SIZE, 0);
                int b = findConfigAttrib(egl, display, config, EGL10.EGL_BLUE_SIZE, 0);               
                
                if ((r == mRedSize) && 
                    (g == mGreenSize)&& 
                    (b == mBlueSize))  {
                    
                    if(printConfigs){
                        System.out.println("GlesEGLConfigChooser:: The choosed EGLConfig is the following: ");
                        EGLConfigInfo info = new EGLConfigInfo((android.opengl.EGLConfig)config, (android.opengl.EGLDisplay)display);
                        System.out.println(info);
                    }
                    
                    return config;
                }
            }
        }// foreach
     
        return null;
    }
    
    /**
     * Print EGLCOnfigs, when running  {@link #chooseConfig(EGL10, EGLDisplay, EGLConfig[])}
     * @param printIt true to print all EGLConfig available
     */
    public void printConfigs(boolean printIt){
        this.printConfigs = printIt;
    }
    
    
}//end GlesEGLConfigChooser

