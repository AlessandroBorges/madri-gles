package gles.emulator;

import gles.emulator.util.DrawingSurfaceInfo;
import gles.emulator.util.JAWT;
import gles.internal.Sys;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLObjectHandle;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CanvasEGL
        extends java.awt.Canvas
        
{

    protected final String TAG = "CanvasEGL";
    protected JAWT  jawt;

    /**
     * EGLDisplay binding
     */
    protected EGLDisplay mEGLDisplay = null;
    protected EGLSurface mEGLSurface = null;
    
    protected Surface    mSurface     = new MySurface(this);
    protected SurfaceView mSurfaveView = new SurfaceView(this);
    /**
     * Wrapper for Surface
     * @author Alessandro Borges
     *
     */
    class MySurface implements Surface{
        private CanvasEGL myCanvasEGL;
        
        public MySurface(CanvasEGL myCanvasEGL){
         this.myCanvasEGL = myCanvasEGL;    
        }
        
        /**
         * delegate call to CanvasEGL
         */
        @Override
        public android.graphics.Canvas lockCanvas(Rect dirty) {
           return myCanvasEGL.lockCanvas();
        }

        /**
         * delegate call to CanvasEGL
         */
        @Override
        public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
            myCanvasEGL.unlockCanvasAndPost(canvas);            
        }

        @Override
        public long getNativeHandle() {
            long winHandle = myCanvasEGL.getHWND(); 
            return winHandle;
        }        
    }// end MySurface
    
    private boolean mIsCreating = false;
    
    final ArrayList<SurfaceHolder.Callback> mCallbacks = 
            new ArrayList<SurfaceHolder.Callback>();
    
    boolean mRequestedVisible = false;
    boolean mWindowVisibility = false;
    boolean mViewVisibility = false;
    
    int mRequestedWidth = -1;
    int mRequestedHeight = -1;
    long mLastLockTime = 0;
    
    boolean DEBUG = true;
    boolean mDrawingStopped = false;
    final Rect mSurfaceFrame = new Rect();
    
    String mWindow;
    int mRequestedFormat;
    
    final ReentrantLock mSurfaceLock = new ReentrantLock();
    
    static final int KEEP_SCREEN_ON_MSG = 1;
    static final int GET_NEW_SURFACE_MSG = 2;
    static final int UPDATE_WINDOW_MSG = 3;

   protected  int mWindowType = 0;//WindowManager.LayoutParams.TYPE_APPLICATION_MEDIA;

   protected Component mParent = null;
   protected boolean mFirstTimeVisible = false;
   
    
    
    /**
     * Simple ctor
     */
    public CanvasEGL() {
        super();
        addListeners();
        Looper.prepare();
        mHandler = new MyHandler();
    }
    
    public void addListeners(){
        addMouseListener(new MyMouseListener(this));
        addMouseMotionListener(new MyMouseMotionListener(this));
        addComponentListener(new MyComponentListener(this));
        addKeyListener(new MyKeyListener(this));
    }
    
    /**
     * Get AWT Window which contains this Canvas. 
     * @return
     */
    public Component getWindow(){
        if(mParent==null){
            Component c = this;
            while(c != null && !(c instanceof java.awt.Window)){
                c = c.getParent();                
            }
            mParent = c;
        }
        return mParent;
    }

    /**
     * Get the native handler of this Canvas 3D
     * 
     * @return
     */
    protected long getHDC() {
        DrawingSurfaceInfo dsi = jawt.getDrawingSurfaceInfo();
        long hdc = dsi.getHDC();
        //jawt.freeDrawingSurfaceInfo(dsi);
        return hdc;
    }
    
    protected long getHWND(){
        DrawingSurfaceInfo dsi = jawt.getDrawingSurfaceInfo();
        long hwnd = dsi.getHWND();
       // jawt.freeDrawingSurfaceInfo(dsi);
        return hwnd;
    }

    protected Handler mHandler = null;
    class MyHandler extends Handler//  new Handler() {
    {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case KEEP_SCREEN_ON_MSG: {
                    mSurfaceHolder.setKeepScreenOn(msg.arg1 != 0);
                } break;
                case GET_NEW_SURFACE_MSG: {
                    handleGetNewSurface();
                } break;
                case UPDATE_WINDOW_MSG: {
                    updateWindow(false, false);
                } break;
            }
        }
    };
    

 
    public android.graphics.Canvas lockCanvas() {
        jawt.dsLock(); 
        return null;
    }


   
    public android.graphics.Canvas lockCanvas(Rect dirty) {
        jawt.dsLock(); 
        return null;
    }


  
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        jawt.dsUnlock();        
    }

 
    public Rect getSurfaceFrame() {        
        Rect rect = new Rect(this.getWidth(),this.getHeight());
        return rect;
    }


   
    public Surface getSurface() {        
        return mSurface;
    }

    /**
     * from SurfaceView.
     * call repaint()
     * @param force
     * @param redrawNeeded
     */
    protected void updateWindow(boolean force, boolean redrawNeeded) {
        repaint();
    }
    /**
     * from SurfaceView.
     * Does nothing
     
     */
    protected void requestLayout(){
        
    }
    
    void handleGetNewSurface() {
        updateWindow(false, false);
    }
    
    private boolean isAngle = true;
    /**
     * get or create a {@link EGLDisplay} for this canvas instance
     * TODO - Use Sys
     * @return EGLDisplay of this
     */
    public EGLDisplay getEGLDisplay() {
        
        if (null == mEGLDisplay || mEGLDisplay.getNativeHandle() == 0) {
            long display_id = getHDC();
            mEGLDisplay = EGL14.eglGetDisplay(display_id);
           if (eglErrorCheck(mEGLDisplay) == EGL14.EGL_SUCCESS) { 
                   //return mEGLDisplay; 
           }
           if (mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
                // try default display
                mEGLDisplay = EGL14.eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY);
                if (eglErrorCheck(mEGLDisplay) == EGL14.EGL_SUCCESS) { 
                    return mEGLDisplay; 
                 }
                
                if (isAngle && mEGLDisplay.getNativeHandle() == 0) {
                    int displayAttributes[] = {
                            EGL14.EGL_PLATFORM_ANGLE_TYPE_ANGLE, 
                            EGL14.EGL_PLATFORM_ANGLE_TYPE_D3D9_ANGLE,
                            EGL14.EGL_NONE};

                    int platform = EGL14.EGL_PLATFORM_ANGLE_TYPE_ANGLE;

                    mEGLDisplay = EGL14.eglGetPlatformDisplayEXT(platform,
                            display_id,
                            displayAttributes);
                    eglErrorCheck(mEGLDisplay);
                }
            }
        }
        return mEGLDisplay;
    }
	
    /**
     * Debug EGL
     * @return eglError
     */
    private int eglErrorCheck(EGLObjectHandle obj) {
        int eglError = EGL14.eglGetError();
        String err = EGL14LogWrapper.getErrorString(eglError);
        System.out.println("CanvasEGL.getEGLDisplay() = " + err + " " 
                              +(obj !=null?obj.toString():" null"));
        return eglError;
    }
    
    
    private class MyMouseListener implements MouseListener{
        
        protected  CanvasEGL canvasEGL = null;
        
        public MyMouseListener(CanvasEGL canvasEGL){
            this.canvasEGL = canvasEGL;
        }
        
        @Override
        public void mouseReleased(MouseEvent e) { 
        }
        
        @Override
        public void mousePressed(MouseEvent e) {                  
        }
        
        @Override
        public void mouseExited(MouseEvent e) {
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            
        }
    }
    
    /**
     * The listener interface for receiving mouse motion events on a component. (For
     * clicks and other mouse events, use the MouseListener.)
     * 
     * The class that is interested in processing a mouse motion event either implements
     * this interface (and all the methods it contains) or extends the abstract
     * MouseMotionAdapter class (overriding only the methods of interest).
     * 
     * The listener object created from that class is then registered with a component
     * using the component's addMouseMotionListener method. A mouse motion event is
     * generated when the mouse is moved or dragged. (Many such events will be generated).
     * When a mouse motion event occurs, the relevant method in the listener object is
     * invoked, and the MouseEvent is passed to it.
     * 
     * @author Alessandro Borges
     *
     */
    private class MyMouseMotionListener implements MouseMotionListener{

       protected  CanvasEGL canvasEGL = null;
        
        public MyMouseMotionListener(CanvasEGL canvasEGL){
            this.canvasEGL = canvasEGL;
        }
        
        @Override
        public void mouseDragged(MouseEvent e) {            
        }

        @Override
        public void mouseMoved(MouseEvent e) {            
        }
        
    }
    
    /**
     * The listener interface for receiving component events. The class that is interested
     * in processing a component event either implements this interface (and all the
     * methods it contains) or extends the abstract ComponentAdapter class (overriding
     * only the methods of interest). The listener object created from that class is then
     * registered with a component using the component's addComponentListener method. When
     * the component's size, location, or visibility changes, the relevant method in the
     * listener object is invoked, and the ComponentEvent is passed to it.
     * 
     * Component events are provided for notification purposes ONLY; The AWT will
     * automatically handle component moves and resizes internally so that GUI layout
     * works properly regardless of whether a program registers a ComponentListener or
     * not.
     * 
     * @author Alessandro Borges
     *
     */
    private class MyComponentListener implements ComponentListener{

       protected  CanvasEGL canvasEGL = null;
        
        public MyComponentListener(CanvasEGL canvasEGL){
            this.canvasEGL = canvasEGL;
        }
        @Override
        public void componentResized(ComponentEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void componentShown(ComponentEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            // TODO Auto-generated method stub            
        }
        
    }
    
    private class MyKeyListener implements KeyListener{
     protected  CanvasEGL canvasEGL = null;
        
        public MyKeyListener(CanvasEGL canvasEGL){
            this.canvasEGL = canvasEGL;
        }
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }
    
    /**
     * Reverence holder of this Canvas
     * @return
     */
    public SurfaceHolder getHolder(){
        return mSurfaceHolder;
    }
    
    private final SurfaceHolder mSurfaceHolder = new MySurfaceHolder();
    
    class MySurfaceHolder implements SurfaceHolder {

        private static final String LOG_TAG = "SurfaceHolder";
        

        @Override
        public boolean isCreating() {
            return mIsCreating;
        }

        @Override
        public void addCallback(Callback callback) {
            synchronized (mCallbacks) {
                // This is a linear search, but in practice we'll
                // have only a couple callbacks, so it doesn't matter.
                if (mCallbacks.contains(callback) == false) {
                    mCallbacks.add(callback);
                }
            }
        }

        @Override
        public void removeCallback(Callback callback) {
            synchronized (mCallbacks) {
                mCallbacks.remove(callback);
            }
        }

        @Override
        public void setFixedSize(int width, int height) {
            if (mRequestedWidth != width || mRequestedHeight != height) {
                mRequestedWidth = width;
                mRequestedHeight = height;
                requestLayout();
            }
        }

        @Override
        public void setSizeFromLayout() {
            if (mRequestedWidth != -1 || mRequestedHeight != -1) {
                mRequestedWidth = mRequestedHeight = -1;
                requestLayout();
            }
        }

        @Override
        public void setFormat(int format) {

            // for backward compatibility reason, OPAQUE always
            // means 565 for SurfaceView
            if (format == PixelFormat.OPAQUE)
                format = PixelFormat.RGB_565;

            mRequestedFormat = format;
            if (mWindow != null) {
                updateWindow(false, false);
            }
        }

        /**
         * @deprecated setType is now ignored.
         */
        @Override
        @Deprecated
        public void setType(int type) { }

        @Override
        public void setKeepScreenOn(boolean screenOn) {
            Message msg = mHandler.obtainMessage(KEEP_SCREEN_ON_MSG);
            msg.arg1 = screenOn ? 1 : 0;
            mHandler.sendMessage(msg);
        }

        /**
         * Gets a {@link Canvas} for drawing into the SurfaceView's Surface
         *
         * After drawing into the provided {@link Canvas}, the caller must
         * invoke {@link #unlockCanvasAndPost} to post the new contents to the surface.
         *
         * The caller must redraw the entire surface.
         * @return A canvas for drawing into the surface.
         */
        @Override
        public android.graphics.Canvas lockCanvas() {
            return internalLockCanvas(null);
        }

        /**
         * Gets a {@link Canvas} for drawing into the SurfaceView's Surface
         *
         * After drawing into the provided {@link Canvas}, the caller must
         * invoke {@link #unlockCanvasAndPost} to post the new contents to the surface.
         *
         * @param inOutDirty A rectangle that represents the dirty region that the caller wants
         * to redraw.  This function may choose to expand the dirty rectangle if for example
         * the surface has been resized or if the previous contents of the surface were
         * not available.  The caller must redraw the entire dirty region as represented
         * by the contents of the inOutDirty rectangle upon return from this function.
         * The caller may also pass <code>null</code> instead, in the case where the
         * entire surface should be redrawn.
         * @return A canvas for drawing into the surface.
         */
        @Override
        public android.graphics.Canvas lockCanvas(Rect inOutDirty) {
            return internalLockCanvas(inOutDirty);
        }

        private final android.graphics.Canvas internalLockCanvas(Rect dirty) {
            mSurfaceLock.lock();

            if (DEBUG) Log.i(TAG, "Locking canvas... stopped=" + mDrawingStopped + ", win=" + mWindow);

            android.graphics.Canvas c = null;
            if (!mDrawingStopped && mWindow != null) {
                try {
                    c = mSurface.lockCanvas(dirty);
                } catch (Exception e) {
                    Log.e(LOG_TAG, "Exception locking surface", e);
                }
            }

            if (DEBUG) Log.i(TAG, "Returned canvas: " + c);
            if (c != null) {
                mLastLockTime = System.currentTimeMillis();//SystemClock.uptimeMillis();
                return c;
            }

            // If the Surface is not ready to be drawn, then return null,
            // but throttle calls to this function so it isn't called more
            // than every 100ms.
            long now = System.currentTimeMillis();//SystemClock.uptimeMillis();
            long nextTime = mLastLockTime + 100;
            if (nextTime > now) {
                try {
                    Thread.sleep(nextTime-now);
                } catch (InterruptedException e) {
                }
                now = System.currentTimeMillis();//SystemClock.uptimeMillis();
            }
            mLastLockTime = now;
            mSurfaceLock.unlock();

            return null;
        }

        /**
         * Posts the new contents of the {@link Canvas} to the surface and
         * releases the {@link Canvas}.
         *
         * @param canvas The canvas previously obtained from {@link #lockCanvas}.
         */
       
        public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
            mSurface.unlockCanvasAndPost(canvas);
            mSurfaceLock.unlock();
        }

        @Override
        public Surface getSurface() {
            return mSurface;
        }

        @Override
        public Rect getSurfaceFrame() {
            return mSurfaceFrame;
        }
    }

    public void nativeBinding() {       
        jawt = new JAWT(this);
        
        //Rectangle r = jawt.getDrawingSurfaceInfo().getRectangle();
        //System.out.println("Bounds " +r);
        
       // long dspHandle = jawt.getEGLNativeDisplayType();
       // EGLDisplay dsp = EGL14.eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY);//dspHandle);
        
       // this.mEGLDisplay = dsp;
        
//        if(Sys.DEBUG){
//            System.out.println("myEGLDisplay: " + mEGLDisplay.getNativeHandle());
//            System.out.println("egl error: 0x" + Integer.toHexString(EGL14.eglGetError()));
//        }
        // TODO create EGLSurface
        //this.myEGLSurface = ...
        
    };
    

}
