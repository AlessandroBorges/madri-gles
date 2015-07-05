package gles.emulator;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;

/**
 * Class to query EGLConfig info.<br>
 * Based on 
 *  https://raw.githubusercontent.com/SaschaWillems/glEsCapsViewer/master/app/src/main/java/de/saschawillems/glescapsviewer/GLESInfo.java
 * @author Alessandro Borges
 *
 */
public class EGLConfigInfo {
    public int id;
    public int redSize; 
    public int greenSize; 
    public int blueSize;
    public int alphaSize;
    public int depthSize;
    public int stencilSize;
    
    //EGL_SAMPLE_BUFFERS - Returns the number of multisample buffers.
    public int sampleBuffers;    
    //EGL_SAMPLES -  Returns the number of samples per pixel.
    public int samplesPixel;
    
    public String renderableType;
    
    public static final int EGL_OPENGL_ES3_BIT = 0x00000040;
    
    private EGLConfig config;
    private EGLDisplay display;
    
    /**
     * initialize info
     * @param config EGLConfig to query
     * @param display EGLDisplay to help query
     */
    public EGLConfigInfo(EGLConfig config, EGLDisplay display){
        this.config = config;
        getFromEGLConfig(display, config);
    }
    
    private void getFromEGLConfig (EGLDisplay display, EGLConfig config) {
            int[] value = new int[1];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_CONFIG_ID, value, 0);
            id = value[0];          
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_RED_SIZE, value, 0);
            redSize = value[0];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_GREEN_SIZE, value, 0);
            greenSize = value[0];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_BLUE_SIZE, value, 0);
            blueSize = value[0];
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_ALPHA_SIZE, value, 0);
            alphaSize = value[0];
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_DEPTH_SIZE, value, 0);
            depthSize = value[0];                           

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_STENCIL_SIZE, value, 0);
            stencilSize = value[0];                         
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_SAMPLE_BUFFERS, value, 0);
            sampleBuffers = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_SAMPLES, value, 0);
            samplesPixel = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_RENDERABLE_TYPE, value, 0);
            
            renderableType = "";
            
            if ((value[0] & EGL14.EGL_OPENGL_ES_BIT) == EGL14.EGL_OPENGL_ES_BIT)   {
                    renderableType = "GLES";
            }
                            
            if ((value[0] & EGL14.EGL_OPENGL_ES2_BIT) == EGL14.EGL_OPENGL_ES2_BIT)   {
                    renderableType += " GLES2";
            }
            
            if ((value[0] & EGL_OPENGL_ES3_BIT) == EGL_OPENGL_ES3_BIT)   {
                renderableType += " GLES3";
        }
            
            if ((value[0] & EGL14.EGL_OPENVG_BIT) == EGL14.EGL_OPENVG_BIT)   {
                    renderableType += " OpenVG";
            }                               
            renderableType = renderableType.trim().replace(" ", ", ");              
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EGLConfigInfo [id=");
        builder.append(id);
        builder.append(", redSize=");
        builder.append(redSize);
        builder.append(", greenSize=");
        builder.append(greenSize);
        builder.append(", blueSize=");
        builder.append(blueSize);
        builder.append(", alphaSize=");
        builder.append(alphaSize);
        builder.append(", depthSize=");
        builder.append(depthSize);
        builder.append(", stencilSize=");
        builder.append(stencilSize);
        
        builder.append(", sampleBuffers=");
        builder.append(sampleBuffers);
        
        builder.append(", samplesPixel=");
        builder.append(samplesPixel);
        
        builder.append(", ");
        if (renderableType != null) {
            builder.append("renderableType=");
            builder.append(renderableType);
        }
        builder.append("]");
        return builder.toString();
    }
    
}