/**
 * Disclaimer
 */
package gles.internal;

import java.lang.reflect.Constructor;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;


/**
 * This class is used to access EGL objects, which are 
 * forbidden in default android environment.<br>
 * 
 * It also 
 * 
 * @author Alessandro Borges
 *
 */
public class EGLUtil {
        
    private static Constructor<EGLDisplay> ctorEGLDisplay;
    private static Constructor<EGLConfig> ctorEGLConfig;
    private static Constructor<EGLContext> ctorEGLContext;
    private static Constructor<EGLSurface> ctorEGLSurface;
    
    static{
        
        try {
            ctorEGLDisplay = EGLDisplay.class.getDeclaredConstructor(long.class);            
            ctorEGLConfig = EGLConfig.class.getDeclaredConstructor(long.class);
            ctorEGLContext = EGLContext.class.getDeclaredConstructor(long.class);
            ctorEGLSurface = EGLSurface.class.getDeclaredConstructor(long.class);
            
            ctorEGLDisplay.setAccessible(true);
            ctorEGLConfig.setAccessible(true);
            ctorEGLContext.setAccessible(true);
            ctorEGLSurface.setAccessible(true); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * create a instance of EGLDisplay
     * @param handle native long handle
     * @return EGLDisplay instance
     */
    public static EGLDisplay createEGLDisplay(long handle){
        if(handle==0)
            return EGLDisplay.getNullEGLDisplay();
        try{
            EGLDisplay dsp = ctorEGLDisplay.newInstance(handle);
            return dsp;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * create a instance of {@link EGLConfig}
     * @param handle native long handle
     * @return EGLConfig instance
     */
    public static EGLConfig createEGLConfig(long handle){
        if(handle==0)
            return null;
        try{
            EGLConfig cfg = ctorEGLConfig.newInstance(handle);
            return cfg;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * create a instance of  {@link #createEGLContext(long)}
     * @param handle native long handle
     * @return EGLConfig instance
     */
    public static EGLContext createEGLContext(long handle){
        if(handle==0){           
            return null;
        }
        try{
            EGLContext ctx = ctorEGLContext.newInstance(handle);
            return ctx;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * create a instance of  {@link #createEGLSurface(long)}
     * @param handle native long handle
     * @return EGLSurface instance
     */
    public static EGLSurface createEGLSurface(long handle){
        if(handle==0){           
            return null;
        }
        try{
            EGLSurface sur = ctorEGLSurface.newInstance(handle);
            return sur;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("EGLDisplay: " + createEGLDisplay(0));
        System.out.println("EGLConfig:" + createEGLConfig(1));
        System.out.println("EGLContext:" + createEGLContext(1));
        System.out.println("EGLSurface:" + createEGLSurface(1));
    }

}
