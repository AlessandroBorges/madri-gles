/**
 * 
 */
package android.app;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.SurfaceView;

/**
 * @author Alessandro Borges
 *
 */
public class Activity extends Context{

    protected SurfaceView mSurfaceView2;    
    protected ActivityManager  mActivityManager = new ActivityManager();
    
    
    public Activity(){
       
    }
    
    protected void onCreate(Bundle savedInstanceState){       
    }

    protected void onStart(){        
    }

    protected void onRestart(){        
    }

    protected void onResume(){        
    }

    protected void onPause(){        
    }

    protected void onStop(){        
    }

    protected void onDestroy(){        
    }
    
    public void setContentView(SurfaceView surfaceView2) {
      this.mSurfaceView2 = surfaceView2;
        
    }
    
    public Object getSystemService(String name) {
        //(ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if(name==Context.ACTIVITY_SERVICE){
            return mActivityManager;
        }
        return null;
        
//                if (getBaseContext() == null) {
//                    throw new IllegalStateException(
//                            "System services not available to Activities before onCreate()");
//                }
//        
//                if (WINDOW_SERVICE.equals(name)) {
//                    return mWindowManager;
//                } else if (SEARCH_SERVICE.equals(name)) {
//                    ensureSearchManager();
//                    return mSearchManager;
//                }
//                return super.getSystemService(name);
            }
    
    
   

    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
