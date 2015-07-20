/**
 * 
 */
package android.view;

import javax.swing.SwingUtilities;

import android.os.Handler;

/**
 * @author Alessandro Borges
 *
 */
public abstract class View {

    public boolean onTouchEvent(MotionEvent e) {
        // TODO Auto-generated method stub
        return false;
    }
    
    public abstract int getHeight();
    
    public abstract int getWidth();
    
    /**
     * Causes the Runnable to be added to the message queue.
     * The runnable will be run on the user interface thread.
     *
     * @param action The Runnable that will be executed.
     *
     * @return Returns true if the Runnable was successfully placed in to the
     *         message queue.  Returns false on failure, usually because the
     *         looper processing the message queue is exiting.
     */
    public boolean post(Runnable action) {        
//        
           Handler handler;
//        if (mAttachInfo != null) {
//            handler = mAttachInfo.mHandler;
//        } else {
//            // Assume that post will succeed later
//            ViewRoot.getRunQueue().post(action);
//            return true;
//        }
//
//        return handler.post(action);
        SwingUtilities.invokeLater(action);
        return true;
        
    }

}
