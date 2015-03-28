package gles.emulator;

import java.awt.Canvas;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

public class CanvasEGL extends Canvas {/*
 //@off
  // Canvas3D 
  
*/
	
	/**
	 * EGLDisplay binding
	 */
	//private EGLDisplay myEGLDisplay = null;

	public CanvasEGL() {		
	}/*
	// test it
	*/
	
	
	/**
	 * Get the native handler of this Canvas 3D
	 * @return
	 */
	private  long getHDC(){
		return -1;
	}
	
	/**
	 * get or create a {@link EGLDisplay} for this canvas instance
	 * @return EGLDisplay of this 
	 */
	/*
	public EGLDisplay getEGLDisplay(){
		if(null==myEGLDisplay){
			long display_id = getHDC();
			myEGLDisplay = EGL14.eglGetDisplay(display_id);
		}
		
		return myEGLDisplay;
	}
	
	*/
	
	
	

}
