package gles.emulator;

import java.util.ArrayList;
import java.util.List;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;

/**
 * Class to query EGLConfig info.<br>
 * <pre>
 * Output sample
 * =============
 * Config id: 12
 * Color: RGB888 Depth: 16 Stencil: 8
 * Caveat: 
 * Renderable type:  
 * Surface type: Window, PBuffer
 * Sample buffers 1 Samples 4
 * </pre>
 * 
 * Based on 
 *  https://raw.githubusercontent.com/SaschaWillems/glEsCapsViewer/master/app/src/main/java/de/saschawillems/glescapsviewer/GLESInfo.java
 * @author Alessandro Borges
 *
 */
public class EGLConfigInfo {
    /**
     * EGLConfig ID
     */
    public int id;
    /**
     * color bitness
     */
    public int redBits, greenBits, blueBits, alphaBits, bufferBits, luminanceBits, luminanceBufferBits;
    
    /**
     * Anciliary buffers bits
     */
    public int depthBits, stencilBits;
    
    /**
     * Samples
     */
    public int sampleBuffers, samplesPixel;
    
    /**
     * Type
     */
    public boolean isLuminanceType, isNonConformantingType, isSlowConfig;
    
    /**
     * GLES Support
     */
    public boolean supportES1, supportES2, supportesES3;
    
    /**
     * Surface type
     */
    public boolean supportPBuffer, supportPixmap,supportVG, supportWindow;
    
    /**
     * renderable type
     */
    public int renderableType;
    
    public String renderableTypeString;
    
    public static final int EGL_OPENGL_ES3_BIT = 0x00000040;
    
    /**
     * EGLConfig instance
     */
    private EGLConfig eglConfig;
    /**
     * EGLDisplay instance
     */
    private EGLDisplay eglDisplay;
    
    
    /**
     * initialize info
     * @param config EGLConfig to query
     * @param display EGLDisplay to help query
     */
    public EGLConfigInfo(EGLConfig config, EGLDisplay display){
        this.eglConfig = config;
        getFromEGLConfig(display, config);
    }
    
    private void getFromEGLConfig (EGLDisplay display, EGLConfig config) {
            int[] value = new int[1];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_CONFIG_ID, value, 0);
            id = value[0];   
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_BUFFER_SIZE, value, 0);
            bufferBits = value[0];  
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_LUMINANCE_BUFFER, value, 0);
            luminanceBufferBits = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_RED_SIZE, value, 0);
            redBits = value[0];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_GREEN_SIZE, value, 0);
            greenBits = value[0];

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_BLUE_SIZE, value, 0);
            blueBits = value[0];
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_ALPHA_SIZE, value, 0);
            alphaBits = value[0];
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_DEPTH_SIZE, value, 0);
            depthBits = value[0];                           

            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_STENCIL_SIZE, value, 0);
            stencilBits = value[0];     
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_LUMINANCE_SIZE, value, 0);
            luminanceBits = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_SAMPLE_BUFFERS, value, 0);
            sampleBuffers = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_SAMPLES, value, 0);
            samplesPixel = value[0]; 
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_SURFACE_TYPE, value, 0);
            int surfaceType = value[0];
            if((surfaceType & EGL14.EGL_WINDOW_BIT)==EGL14.EGL_WINDOW_BIT){
                supportWindow = true;
            }
            if((surfaceType & EGL14.EGL_PBUFFER_BIT)==EGL14.EGL_PBUFFER_BIT){
                supportPBuffer = true;
            }
            if((surfaceType & EGL14.EGL_PIXMAP_BIT)==EGL14.EGL_PIXMAP_BIT){
                supportPixmap = true;
            }
            if((surfaceType & EGL14.EGL_OPENVG_BIT)==EGL14.EGL_OPENVG_BIT){
                supportVG = true;
            }
            
            
            EGL14.eglGetConfigAttrib(display, config, EGL14.EGL_RENDERABLE_TYPE, value, 0);
            renderableType = value[0];
            
            renderableTypeString = "";
            
            if ((renderableType & EGL14.EGL_OPENGL_ES_BIT) == EGL14.EGL_OPENGL_ES_BIT)   {
                    renderableTypeString = "GLES";
                    supportES1 = true;
            }
                            
            if ((renderableType & EGL14.EGL_OPENGL_ES2_BIT) == EGL14.EGL_OPENGL_ES2_BIT)   {
                    renderableTypeString += " GLES2";
                    supportES2 = true;
            }
            
            if ((renderableType & EGL_OPENGL_ES3_BIT) == EGL_OPENGL_ES3_BIT)   {
                renderableTypeString += " GLES3";
                supportesES3 = true;
        }
            
            if ((renderableType & EGL14.EGL_OPENVG_BIT) == EGL14.EGL_OPENVG_BIT)   {
                    renderableTypeString += " OpenVG";
                    supportVG = true;
            }                               
            renderableTypeString = renderableTypeString.trim().replace(" ", ", ");              
    }
    
    /**
     * The EGLConfig handler for this Info
     * @return the eglConfig 
     */
    public EGLConfig getEGLConfig() {
        return eglConfig;
    }

    /**
     * The EGLDisplay handler for this Info
     * @return the eglDisplay
     */
    public EGLDisplay getEglDisplay() {
        return eglDisplay;
    }

    /**
     * Return color in human readable format, as RGB565, L8, RGB888, etc
     * @return string format color
     */
    public String getColorString(){
        StringBuilder color = new StringBuilder(8);
        if(redBits>0)   color.append('R');         
        if(greenBits>0) color.append('G');
        if(blueBits>0)  color.append('B');
        if(alphaBits>0) color.append('A');
        if(luminanceBits>0) color.append('L');
        
        if(redBits>0)   color.append(redBits);         
        if(greenBits>0) color.append(greenBits);
        if(blueBits>0)  color.append(blueBits);
        if(alphaBits>0) color.append(alphaBits);
        if(luminanceBits>0) color.append(luminanceBits);
        return color.toString();        
    }
    
    /**
     * String array of
     * supportPBuffer, supportPixmap,supportVG, supportWindow
     * @return
     */
    public List<String> getSurfaceTypeStrings(){
        List<String> types = new ArrayList<String>(4);
        if(supportWindow)  types.add("Window");
        if(supportPBuffer) types.add("PBuffer");
        if(supportPixmap)  types.add("Pixmap");
        if(supportVG)      types.add("VG");
        
        return types;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EGLConfigInfo id: ");
        sb.append(id);        
        sb.append("\n Color buffer: ").append(bufferBits).append(" bits");
        sb.append("\n Color: ").append(getColorString()); 
                
        sb.append(" Depth:");
        sb.append(depthBits);
        sb.append("  Stencil:");
        sb.append(stencilBits);
        
        sb.append("\n Renderable type: ").append(renderableTypeString);
        
        sb.append("\n Surface type: ");
        List<String> surfaces = getSurfaceTypeStrings();        
        for(String s : surfaces){
            sb.append(s).append(", ");
        }        
        
        sb.append("\n Sample Buffers: ").append(sampleBuffers);        
        sb.append(" Samples:").append(samplesPixel);
        
        sb.append('\n');
        if (renderableTypeString != null) {
            sb.append(" Renderable type: ");
            sb.append(renderableTypeString);
        }
        sb.append("\n");
        return sb.toString();
    }
    
}