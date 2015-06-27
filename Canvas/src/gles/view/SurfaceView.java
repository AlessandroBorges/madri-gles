package gles.view;

import gles.emulator.CanvasEGL;
import android.opengl.AttributeSet;
import android.opengl.Context;

/**
 * This class will extends AWT.Canvas
 * TODO - better bridge to CanvasEGL
 * @author Alessandro Borges
 *
 */
public class SurfaceView {
    
    Context ctx;
    AttributeSet attrs;
    SurfaceHolder sHolder;
    CanvasEGL mCanvas;
    
        public  SurfaceView(CanvasEGL canvas){
            this.mCanvas = canvas;
        }
    
	public SurfaceView(Context context) {
		this.ctx = context;
	}

	public SurfaceView(Context context, AttributeSet attrs) {
	    this.ctx = context;
	    this.attrs = attrs;

	}

	public SurfaceHolder getHolder() {
	        sHolder =  mCanvas.getHolder();
		return sHolder;
	}

	protected void onAttachedToWindow() {
		// TODO Auto-generated method stub
		
	}

	protected void onDetachedFromWindow() {
		// TODO Auto-generated method stub
		
	}

}
