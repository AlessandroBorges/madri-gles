package gles.view;

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
    

}
