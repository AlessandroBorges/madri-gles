package android.content.res;

import java.io.InputStream;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import gles.internal.Sys;

/**
 * implementation of Resources
 * @author Alessandro Borges
 *
 */
public class Resources {
    
    Context ctx;
    
    protected Resources(){}
    
    public Resources(Context ctx){
        this.ctx = ctx;
    }

    public DisplayMetrics getDisplayMetrics() {
        return Sys.getDisplayMetrics();

    }

    public InputStream openRawResource(int id, TypedValue value) {
        // TODO Auto-generated method stub
        return null;
    }

    public InputStream openRawResource(int resourceId) {
        // TODO Auto-generated method stub
        return null;
    }

}
