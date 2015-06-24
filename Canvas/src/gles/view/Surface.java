package gles.view;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Surface class
 * @author Alessandro Borges
 *
 */
public class Surface implements android.view.Surface {
    
    protected long handle;
    
    public long getNativeHandle(){
        return handle;
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
    

}
