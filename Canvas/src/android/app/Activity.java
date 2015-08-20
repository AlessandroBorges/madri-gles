/**
 * 
 */
package android.app;

import gles.emulator.CanvasEGL;
import gles.emulator.Sys;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.SurfaceView;

/**
 * 
 * TODO bring android.app.ActivityTransitionState
 * @author Alessandro Borges
 *
 */
public class Activity extends Context{

    protected SurfaceView mSurfaceView2;    
    protected ActivityManager  mActivityManager = new ActivityManager();
    
    public enum ActivityStatus {
        NONE,
        CREATED,        
        STARTING,
        RUNNING,
        PAUSED,
        STOPPED,
        DESTROYED
    }
    
    /**
     * keep track of current status
     */
    public ActivityStatus currentStatus = ActivityStatus.NONE;
    
    public static boolean DEBUG = true;
    
    public Activity(){       
    }
    
    protected  ActivityStatus getCurrentState(){
        return currentStatus;
    }
    
    private void setCurrentState(ActivityStatus status){
        currentStatus = status;
    }
    
    protected void setContentView(SurfaceView surfaceView) {
        this.mSurfaceView2 = surfaceView;    
        if(mSurfaceView2 instanceof GLSurfaceView){
            GLSurfaceView glSurfaceView = (GLSurfaceView)mSurfaceView2;
           // CanvasEGL canvas = Sys.getCanvas(glSurfaceView);
          //  xxx
            
        }
      }
    
    private static void debug(String msg){
        System.out.println(msg);
    }
    
    protected void onCreate(Bundle savedInstanceState){   
        setCurrentState(ActivityStatus.CREATED);
        debug("onCreate()");
        
    }

    protected void onStart(){  
        setCurrentState(ActivityStatus.STARTING);
        debug("onStart()");
    }
    
    protected void onResume(){ 
        setCurrentState(ActivityStatus.RUNNING);
        debug("onResume()");
    }

    protected void onRestart(){  
        setCurrentState(ActivityStatus.RUNNING);
        debug("onRestart()");
    }

   
    protected void onPause(){  
        setCurrentState(ActivityStatus.PAUSED);
        debug("onPause()");
    }

    protected void onStop(){ 
        setCurrentState(ActivityStatus.STOPPED);
        debug("onStop()");
    }

    protected void onDestroy(){  
        setCurrentState(ActivityStatus.DESTROYED);
        debug("onDestroy()");
    }
    
    protected void onRestoredInstanceState(Bundle savedInstanceState){
      // setCurrentState(ActivityStatus.RUNNING);
   }
    

    protected void onSaveInstanceState(Bundle outState) {
       // setCurrentState(ActivityStatus.STOPPED);
        
    }
    
    public Object getSystemService(String name) {
        // (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if (name == Context.ACTIVITY_SERVICE) { return mActivityManager; }
        return null;
    }

    public void onSaveInstanceState() {
        
    }
    
    
}
