/**
 * 
 */
package gles.emulator;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import android.opengl.*;

/**
 * The emulator Window
 * @author Alessandro Borges
 *
 */
public class Emulator extends JFrame {

   
    protected static String SUB_TITLE = "GLES Emulator"; 
    protected static String DIV = " - ";
    protected CanvasEGL myCanvasEGL;
    protected JPanel controlPanel;
    
    /**
     * Window Size
     */
    protected int mHeight = 480, mWidth=512;

    public Emulator(String title) throws HeadlessException {
        super(SUB_TITLE + DIV + title);
        jbInit();
    }
    
    public Emulator(GraphicsConfiguration gc) {
        super(SUB_TITLE,gc);
        jbInit();
    }
    
    public Emulator(String title, GraphicsConfiguration gc, int width, int height) {
        super(SUB_TITLE + DIV +  title, gc);  
        this.mHeight = height;
        this.mWidth = width;
        jbInit();
    }

   
    protected void jbInit(){        
        Dimension size = new Dimension(mWidth, mHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCanvasEGL = new CanvasEGL();
        myCanvasEGL.setPreferredSize(size);
        
        setLayout(new BorderLayout());
        add(myCanvasEGL,BorderLayout.CENTER);
        pack();
        
        addWindowListener(myWindowAdapter);
        this.setVisible(true);
        
      //  checkWM();
    }
    
    /**
     * Called when window is closing.
     */
    protected void closing(){
        System.out.println("Window closing");
    }
    
    /**
     * Called when windows is opened, it calls a invoke later 
     * CanvasEGL.nativeBinding(); 
     */
   protected void opened(){
       System.out.println("Window opened");
       SwingUtilities.invokeLater(runJAWT);
       
    }
    
    final WindowAdapter myWindowAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            closing();
        }
        
        public void windowOpened(WindowEvent e){
             opened();
        }
        
    };
    
    /**
     * 
     */
    final Runnable runJAWT = new Runnable() {
        @Override
        public void run() {            
            myCanvasEGL.nativeBinding();
            checkEGL();
        }
    };
    
    
    private void checkEGL(){
        /*
         * Get an EGL instance
         */
       
        EGLDisplay mEglDisplay = myCanvasEGL.getEGLDisplay();
        
        EGL14LogWrapper egl = new EGL14LogWrapper(true, false, System.out);
        int[] major = new int[1];
        int[] minor = new int[1];
        
        boolean ok = egl.eglInitialize(mEglDisplay, major, 0, minor, 0);        
        if(ok){
            System.out.println("### initialize OK !");
        }else{
            System.err.println("### failed to initialize");
           // return;
        }
        
        ok = egl.eglBindAPI(EGL14.EGL_OPENGL_ES_API);
        if(ok){
            System.out.println("### bind API ok");
        }else{
            System.err.println("### bind API FAILED");
        }
        
        
        //EGLConfig[] config = new EGLConfig[10];
        int[] num_config = new int[1];
        

        
     // typical high-quality attrib list
        int configSpec[] = {
        // 32 bit color
                EGL14.EGL_RED_SIZE, 8,
                EGL14.EGL_GREEN_SIZE, 8,
                EGL14.EGL_BLUE_SIZE, 8,
        // at least 24 bit depth
                EGL14.EGL_DEPTH_SIZE, 16,
                EGL14.EGL_SURFACE_TYPE, EGL14.EGL_WINDOW_BIT,
        // want opengl-es 2.x conformant CONTEXT
                EGL14.EGL_RENDERABLE_TYPE, EGL14.EGL_OPENGL_ES2_BIT, 
                EGL14.EGL_NONE,0
        };      
      

        EGLConfig[] configs = new EGLConfig[4];
        
         ok = egl.eglChooseConfig(mEglDisplay, configSpec, configs, 4, num_config);
        EGLConfig mEglConfig = configs[0];
        if(ok){
            System.out.println("### good config: " + mEglConfig);
        }else{
            System.err.println("### BAD config: " + mEglConfig);
        }
        
        
        EGLSurface mEglSurface = egl.eglCreateWindowSurface(mEglDisplay, 
                                                            mEglConfig, 
                                                            myCanvasEGL, 
                                                            null);
        System.out.println("EGLSurface: " + mEglSurface);
        if(mEglSurface == EGL14.EGL_NO_SURFACE){
            System.err.println("### mEglSurface is an EGL_NO_SURFACE: " + mEglSurface);
            //return;
        }else{
            System.out.println("### mEglSurface is : " + mEglSurface);
        }
        
        int ctxattr[] = {
                EGL14.EGL_CONTEXT_CLIENT_VERSION, 2,
                EGL14.EGL_NONE
             };
        
        EGLContext mEglContext = egl.eglCreateContext(mEglDisplay, 
                mEglConfig, 
                EGL14.EGL_NO_CONTEXT, ctxattr);
        
        if(mEglContext == EGL14.EGL_NO_CONTEXT){
            System.err.println("mEglContext == EGL_NO_CONTEXT !");
            return;
        }
        
        System.out.println("EGLContext: " + mEglContext);
        if (!egl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext)){
            System.err.println("failed to MakeCurrent");
        }else{
            System.out.println("### MakeCurrent !!!");
            GLES20.glClearColor(0.2f, 0.2f, .8f, 0.5f);
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
            egl.eglSwapBuffers(mEglDisplay, mEglSurface);
        //    myCanvasEGL.repaint();
//            egl.eglSwapBuffers(mEglDisplay, mEglSurface);
//            egl.eglSwapBuffers(mEglDisplay, mEglSurface);
//            egl.eglSwapBuffers(mEglDisplay, mEglSurface);
            
        }
           ///
         //  glClearColor(0.5f, 0.5f, 0.5f, 0.0f);
        
    }
    
    
    private void checkWM() {
        Toolkit tk = this.getToolkit();
        if (!(tk.isFrameStateSupported(Frame.ICONIFIED))) {
            print("Your window manager doesn't support ICONIFIED.");
        } else print("Your window manager supports ICONIFIED.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_VERT))) {
            print("Your window manager doesn't support MAXIMIZED_VERT.");
        } else print("Your window manager supports MAXIMIZED_VERT.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_HORIZ))) {
            print("Your window manager doesn't support MAXIMIZED_HORIZ.");
        } else print("Your window manager supports MAXIMIZED_HORIZ.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_BOTH))) {
            print("Your window manager doesn't support MAXIMIZED_BOTH.");
        } else {
            print("Your window manager supports MAXIMIZED_BOTH.");
        }
    }
    
    void print(String msg) {
        //display.append(msg + newline);
        System.out.println(msg);
    }

    void displayStateMessage(String prefix, WindowEvent e) {
        int state = e.getNewState();
        int oldState = e.getOldState();
        String msg = prefix
                   + '\n' + ' '
                   + "New state: "
                   + convertStateToString(state)
                   + '\n' + ' '
                   + "Old state: "
                   + convertStateToString(oldState);
        print(msg);
    }
    
    String convertStateToString(int state) {
        if (state == Frame.NORMAL) {
            return "NORMAL";
        }
        String strState = " ";
        if ((state & Frame.ICONIFIED) != 0) {
            strState += "ICONIFIED";
        }
        //MAXIMIZED_BOTH is a concatenation of two bits, so
        //we need to test for an exact match.
        if ((state & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH) {
            strState += "MAXIMIZED_BOTH";
        } else {
            if ((state & Frame.MAXIMIZED_VERT) != 0) {
                strState += "MAXIMIZED_VERT";
            }
            if ((state & Frame.MAXIMIZED_HORIZ) != 0) {
                strState += "MAXIMIZED_HORIZ";
            }
            if (" ".equals(strState)){
                strState = "UNKNOWN";
            }
        }
        return strState.trim();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
      
        final Runnable doRun =  new Runnable() {
            public void run() {
                final Emulator emulator = new Emulator("Emulator");
            }
        };
        
        SwingUtilities.invokeLater(doRun);

    }

    
}
