/**
 * 
 */
package android.view;

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

}
