package gles.emulator;

import gles.emulator.util.JAWT;

import java.awt.Canvas;

import android.graphics.Rect;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

import android.view.Surface;
import android.view.SurfaceHolder;

public class CanvasEGL 
       extends Canvas
       implements SurfaceHolder
       {
	
    protected JAWT jawt;
	
	/**
	 * EGLDisplay binding
	 */
	protected EGLDisplay myEGLDisplay = null;
	protected Surface msurface = null;

	public CanvasEGL() {		
	    
	}
	
	
	/**
	 * Get the native handler of this Canvas 3D
	 * @return
	 */
	private  long getHDC(){
		return -1;
	}


    @Override
    public void addCallback(Callback callback) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void removeCallback(Callback callback) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public boolean isCreating() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public void setType(int type) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setFixedSize(int width, int height) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setSizeFromLayout() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setFormat(int format) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void setKeepScreenOn(boolean screenOn) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public android.graphics.Canvas lockCanvas() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public android.graphics.Canvas lockCanvas(Rect dirty) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public Rect getSurfaceFrame() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Surface getSurface() {        
        return msurface;
    }
	
	/**
	 * get or create a {@link EGLDisplay} for this canvas instance
	 * @return EGLDisplay of this 
	 */
	public EGLDisplay getEGLDisplay(){
		if(null==myEGLDisplay){
			long display_id = getHDC();
			myEGLDisplay = EGL14.eglGetDisplay(display_id);
		}
		
		return myEGLDisplay;
	}
	
	
	
	

}
