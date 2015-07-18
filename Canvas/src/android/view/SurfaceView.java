package android.view;

import gles.emulator.CanvasEGL;
import android.view.SurfaceHolder;//gles.view.SurfaceHolder;
import android.content.Context;
import android.opengl.AttributeSet;

/**
 * This class shall/should extends/WRAPs AWT.Canvas
 * TODO - better bridge to CanvasEGL
 * @author Alessandro Borges
 *
 */
public class SurfaceView extends View {
    
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
	
	public SurfaceView(CanvasEGL canvas, Context context, AttributeSet attrs) {
	    this.mCanvas = canvas;
	    this.ctx = context;
            this.attrs = attrs;
	}
	

	public android.view.SurfaceHolder getHolder() {
	        sHolder =  (SurfaceHolder) mCanvas.getHolder();
		return sHolder;
	}

	protected void onAttachedToWindow() {
		// TODO Auto-generated method stub
		
	}

	protected void onDetachedFromWindow() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This method does not bellpog to Android API.
	 * Called by emulator only
	 */
	public CanvasEGL getCanvasEGL(){
	    return mCanvas;
	}

    @Override
    public int getHeight() {
        if(mCanvas!= null){
            return mCanvas.getHeight();
        }
        return 0;
    }

    @Override
    public int getWidth() {
        if(mCanvas!= null){
            return mCanvas.getWidth();
        }
        return 0;
    }

}
