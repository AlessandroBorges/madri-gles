package gles.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.SurfaceView;
@Deprecated
public class SurfaceHolder 
    implements 
      android.view.SurfaceHolder {

    protected Surface surface;
    
    
    public SurfaceHolder(){
        
    }

	public interface Callback {

	}

	public Surface getSurface() {
		return surface;
	}

	public void addCallback(SurfaceView glSurfaceView) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void addCallback(android.view.SurfaceHolder.Callback callback) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeCallback(android.view.SurfaceHolder.Callback callback) {
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
    public Canvas lockCanvas() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public Canvas lockCanvas(Rect dirty) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void unlockCanvasAndPost(Canvas canvas) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Rect getSurfaceFrame() {
		// TODO Auto-generated method stub
        return null;
		
	}

}
