package gles.view;

import android.opengl.AttributeSet;
import android.opengl.Context;

/**
 * This class will extends AWT.Canvas
 * 
 * @author Alessandro Borges
 *
 */
public class SurfaceView {
    
    Context ctx;
    AttributeSet attrs;
    SurfaceHolder sHolder;

	public SurfaceView(Context context) {
		this.ctx = context;
	}

	public SurfaceView(Context context, AttributeSet attrs) {
	    this.ctx = context;
	    this.attrs = attrs;

	}

	public SurfaceHolder getHolder() {
		return sHolder;
	}

	protected void onAttachedToWindow() {
		// TODO Auto-generated method stub
		
	}

	protected void onDetachedFromWindow() {
		// TODO Auto-generated method stub
		
	}

}
