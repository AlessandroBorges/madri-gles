/**
 * 
 */
package android.app;

import gles.emulator.CanvasEGL;
import android.app.Activity.ActivityStatus;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;

/**
 * A thin wrapper around Activity
 * This class doesnot belong to Android framework.
 * 
 * 
 * @author Alessandro Borges
 *
 */
public class ActivityHelper {
    
    private Activity app;
    
    public ActivityHelper(Activity wrapApp){
        this.app = wrapApp;
    }
    
    /**
     * get the canvas EGL
     * TODO - find a  better way to get canvas
     * @return
     */
    public CanvasEGL getCanvasEGL(){
        return app.mSurfaceView2.getCanvasEGL();
    }

    /**
     * @return
     * @see android.content.Context#getResources()
     */
    public Resources getResources() {
        return app.getResources();
    }

    /**
     * @return
     * @see android.app.Activity#getCurrentState()
     */
    public ActivityStatus getCurrentState() {
        return app.getCurrentState();
    }

    /**
     * @param surfaceView2
     * @see android.app.Activity#setContentView(android.view.SurfaceView)
     */
    public void setContentView(SurfaceView surfaceView2) {
        app.setContentView(surfaceView2);
    }

    /**
     * @param savedInstanceState
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    public void onCreate(Bundle savedInstanceState) {
        app.onCreate(savedInstanceState);
    }

    /**
     * 
     * @see android.app.Activity#onStart()
     */
    public void onStart() {
        app.onStart();
    }

    /**
     * 
     * @see android.app.Activity#onResume()
     */
    public void onResume() {
        app.onResume();
    }

    /**
     * 
     * @see android.app.Activity#onRestart()
     */
    public void onRestart() {
        app.onRestart();
    }

    /**
     * @return
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return app.hashCode();
    }

    /**
     * 
     * @see android.app.Activity#onPause()
     */
    public void onPause() {
        app.onPause();
    }

    /**
     * 
     * @see android.app.Activity#onStop()
     */
    public void onStop() {
        app.onStop();
    }

    /**
     * 
     * @see android.app.Activity#onDestroy()
     */
    public void onDestroy() {
        app.onDestroy();
    }

    /**
     * @param savedInstanceState
     * @see android.app.Activity#onRestoredInstanceState(android.os.Bundle)
     */
    public void onRestoredInstanceState(Bundle savedInstanceState) {
        app.onRestoredInstanceState(savedInstanceState);
    }

    /**
     * @param outState
     * @see android.app.Activity#onSaveInstanceState(android.os.Bundle)
     */
    public void onSaveInstanceState(Bundle outState) {
        app.onSaveInstanceState(outState);
    }

    /**
     * @param name
     * @return
     * @see android.app.Activity#getSystemService(java.lang.String)
     */
    public Object getSystemService(String name) {
        return app.getSystemService(name);
    }

    /**
     * 
     * @see android.app.Activity#onSaveInstanceState()
     */
    public void onSaveInstanceState() {
        app.onSaveInstanceState();
    }

    /**
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        return app.equals(obj);
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return app.toString();
    }

    /**
     * forward touchevent to app's view
     * @param andMotionEvent
     */
    public void onTouch(MotionEvent andMotionEvent) {
        app.mSurfaceView2.onTouchEvent(andMotionEvent);
    }
    
    
    
    
    

}
