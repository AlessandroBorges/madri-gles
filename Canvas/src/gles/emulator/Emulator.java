/**
 * 
 */
package gles.emulator;

import gles.internal.Sys;
import gles.internal.Sys.SDK;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        EGL14LogWrapper egl = new EGL14LogWrapper(false, false, System.out);
        EGLDisplay eglDisplay = myCanvasEGL.getEGLDisplay();
        if(eglDisplay==null){
            eglDisplay = egl.eglGetCurrentDisplay();
        }        
        EGLContext eglCtx = (EGLContext)egl.eglGetCurrentContext();
        egl.eglDestroyContext(eglDisplay, eglCtx);
        egl.eglTerminate(eglDisplay);
    }
    
    /**
     * Called when windows is opened, it calls a invoke later 
     * CanvasEGL.nativeBinding(); 
     */
   protected void opened(){
       System.out.println("Window opened");
       this.setAutoRequestFocus(true);
       this.toFront();
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
            GLESInfo info = new GLESInfo();
            System.out.println(info.toString());
        }
    };
    
    
    private void checkEGL(){
        /*
         * Get an EGL instance
         */
        EGL14LogWrapper egl = new EGL14LogWrapper(false, false, System.out);        
        
        EGLDisplay mEglDisplay = myCanvasEGL.getEGLDisplay();
        
        int[] major = new int[1];
        int[] minor = new int[1];
        
        boolean ok = egl.eglInitialize(mEglDisplay, major, 0, minor, 0);        
        if(ok){
            System.out.println("### initialize OK !");
           queryEGL(mEglDisplay);          
        }else{
            System.err.println("### failed to initialize");
        }
        
        ok = egl.eglBindAPI(EGL14.EGL_OPENGL_ES_API);        
        
        EGLConfig[] configs = chooseEGLConfig(true, mEglDisplay, egl);
              
        EGLConfig mEglConfig = configs[0];
        ////////////////////////////////////////////////////
        int ctxattr[] = {
                EGL14.EGL_CONTEXT_CLIENT_VERSION, 2,
                EGL14.EGL_NONE
        };

        EGLContext mEglContext = null;//(EGLContext)egl.eglGetCurrentContext();
        
        if(mEglContext == null || mEglContext == EGL14.EGL_NO_CONTEXT)
            mEglContext = egl.eglCreateContext(mEglDisplay,
                                               mEglConfig,
                                               EGL14.EGL_NO_CONTEXT, ctxattr);
        if (mEglContext == EGL14.EGL_NO_CONTEXT) {
            System.out.println("### mEglContext == EGL_NO_CONTEXT !");
            mEglContext = (EGLContext)egl.eglGetCurrentContext();
            System.out.println("### eglGetCurrentContext: " + mEglContext);
           // return;
        }
        
        ///////////////////////////////////////////////////////////////////////
        EGLSurface mEglSurface = egl.eglCreateWindowSurface(mEglDisplay,
                                                            mEglConfig,
                                                            myCanvasEGL,
                                                            null);
        System.out.println("EGLSurface: " + mEglSurface);
        if (mEglSurface == EGL14.EGL_NO_SURFACE) {
            System.err.println("### mEglSurface is an EGL_NO_SURFACE: " + mEglSurface);
            // return;
        } else {
            System.out.println("### mEglSurface is : " + mEglSurface);
            int[] value = new int[4];
            // EGL_HORIZONTAL_RESOLUTION EGL_VERTICAL_RESOLUTION
            EGL14.eglQuerySurface(mEglDisplay, mEglSurface, EGL14.EGL_WIDTH, value, 0);
            EGL14.eglQuerySurface(mEglDisplay, mEglSurface, EGL14.EGL_HEIGHT, value, 1);

            EGL14.eglQuerySurface(mEglDisplay, mEglSurface, EGL14.EGL_HORIZONTAL_RESOLUTION, value, 2);
            EGL14.eglQuerySurface(mEglDisplay, mEglSurface, EGL14.EGL_VERTICAL_RESOLUTION, value, 3);

            System.out.println("Surface width:" + value[0]);
            System.out.println("Surface height:" + value[1]);

            System.out.println("Surface EGL_HORIZONTAL_RESOLUTION:" + value[2]);
            System.out.println("Surface EGL_VERTICAL_RESOLUTION:" + value[3]);

        }
        
        System.out.println("EGLContext: " + mEglContext);
        if (!egl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext)) {
            System.err.println("failed to MakeCurrent");
        } else {
            System.out.println("### MakeCurrent !!!");
            queryGL();
            GLES20.glClearColor(0.2f, 0.2f, .8f, 0.5f);
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
            GLES20.glFlush();
            egl.eglSwapBuffers(mEglDisplay, mEglSurface);
        }        
    }
    
    /**
     * Query EGL Vendor, Version, EGL APIS, EGL Extensions
     * @param mEglDisplay current EGLDisplay 
     */
    protected void queryEGL(EGLDisplay mEglDisplay){
        System.out.println("Vendor: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_VENDOR));
        System.out.println("Version: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_VERSION));
        System.out.println("EGL APIS: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_CLIENT_APIS));
        System.out.println("Extensions: " );
        String glExtensions = EGL14.eglQueryString(mEglDisplay, EGL14.EGL_EXTENSIONS);
        String[] extensions = glExtensions.split(" ");
        Arrays.sort(extensions);
        for (String ext : extensions) {
         print('\t' + ext);
         }
    }
    
    
    private EGLConfig[] chooseEGLConfig(boolean tryES3, EGLDisplay mEglDisplay, EGL14LogWrapper egl){
        int[] num_config = new int[1];
        int EGL_OPENGL_ES3_BIT = 0x00000040;
        int renderType = tryES3 ? EGL_OPENGL_ES3_BIT : EGL14.EGL_OPENGL_ES2_BIT;
        if(tryES3){
            
        }
     // typical high-quality attrib list
        int configSpec[] = {
        // colors
                EGL14.EGL_RED_SIZE,   5,
                EGL14.EGL_GREEN_SIZE, 6,
                EGL14.EGL_BLUE_SIZE,  5,
        // at least 16 bit depth
                EGL14.EGL_DEPTH_SIZE, 16,
                EGL14.EGL_SURFACE_TYPE, EGL14.EGL_WINDOW_BIT,
        // want opengl-es 2.x conformant CONTEXT
                EGL14.EGL_RENDERABLE_TYPE, renderType , 
                EGL14.EGL_NONE
        };           
             
        egl.eglChooseConfig(mEglDisplay, configSpec, null, 0, num_config);
        System.out.println("### num available Configs(ES3/ES2): " + num_config[0]);
        
        // failed to get Config
        if(num_config[0]==0){
            System.out.println("Failed to get ES3. Try ES2...");
            configSpec[11] = EGL14.EGL_OPENGL_ES2_BIT; 
            egl.eglChooseConfig(mEglDisplay, configSpec, null, 1, num_config);
            System.out.println("### num available Configs (ES2): " + num_config[0]);
        }
        
        int avail_configs = num_config[0];
        EGLConfig[] configs = new EGLConfig[avail_configs];   
        egl.eglChooseConfig(mEglDisplay, configSpec, configs, avail_configs, num_config);
        System.out.println("### returned EGLConfigs: " + num_config[0]);
        return configs;
    }
    
    
    /**
     * Query GL_VENDOR, GL_RENDERER, GL_VERSION, GL_SHADING_LANGUAGE_VERSION, or GL_EXTENSIONS.
     */
    protected void queryGL(){
        //GL_VENDOR, GL_RENDERER, GL_VERSION, GL_SHADING_LANGUAGE_VERSION, or GL_EXTENSIONS.
       print("GL_VENDOR: " + GLES20.glGetString(GLES20.GL_VENDOR));
       print("GL_RENDERER: " + GLES20.glGetString(GLES20.GL_RENDERER));
       print("GL_VERSION: " + GLES20.glGetString(GLES20.GL_VERSION));
       print("GL_SHADING_LANGUAGE_VERSION: " + GLES20.glGetString(GLES20.GL_SHADING_LANGUAGE_VERSION));
       print("GL_EXTENSIONS: ");
       
       String glExtensions =   GLES20.glGetString(GLES20.GL_EXTENSIONS);
       String[] extensions = glExtensions.split(" ");
       Arrays.sort(extensions);
       for (String ext : extensions) {
        print('\t' + ext);
        }
      // Compressed formats 
      int[] params = new int[1]; 
      GLES20.glGetIntegerv(GLES20.GL_NUM_COMPRESSED_TEXTURE_FORMATS, params, 0);
      int numCompressedFormats = params[0];
      int[] compFormatsList = new int[numCompressedFormats];
      GLES20.glGetIntegerv(GLES20.GL_COMPRESSED_TEXTURE_FORMATS, compFormatsList, 0);
      print("");
      print("GL_NUM_COMPRESSED_TEXTURE_FORMATS: " + numCompressedFormats);
      print("GL_COMPRESSED_TEXTURE_FORMATS: ");
      Arrays.sort(compFormatsList);
        for (int i = 0; i < compFormatsList.length; i++) {
            int format = compFormatsList[i];
            String name = getCompressedFormatName(format);
            if(name==null) name = "unknow";
            print('\t' + name + " (0x" + Integer.toHexString(format) + ")");
        }
    }
    
    private void print(Object obj){
        System.out.println(obj);
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
    
    public static String getCompressedFormatName(int formatID){
        switch(formatID){
        case 0x8225 : return "GL_COMPRESSED_RED";
        case 0x8226 : return "GL_COMPRESSED_RG";
        case 0x83f0 : return "GL_COMPRESSED_RGB_S3TC_DXT1_EXT";
        case 0x83f1 : return "GL_COMPRESSED_RGBA_S3TC_DXT1_EXT";
        case 0x83f2 : return "GL_COMPRESSED_RGBA_S3TC_DXT3_EXT";
        case 0x83f3 : return "GL_COMPRESSED_RGBA_S3TC_DXT5_EXT";
        case 0x84e9 : return "GL_COMPRESSED_ALPHA_ARB";
        case 0x84ea : return "GL_COMPRESSED_LUMINANCE_ARB";
        case 0x84eb : return "GL_COMPRESSED_LUMINANCE_ALPHA_ARB";
        case 0x84ec : return "GL_COMPRESSED_INTENSITY_ARB";
        case 0x84ed : return "GL_COMPRESSED_RGB_ARB";
        case 0x84ee : return "GL_COMPRESSED_RGBA_ARB";
        case 0x86a3 : return "GL_COMPRESSED_TEXTURE_FORMATS_ARB";
        case 0x86b0 : return "GL_COMPRESSED_RGB_FXT1_3DFX";
        case 0x86b1 : return "GL_COMPRESSED_RGBA_FXT1_3DFX";
        case 0x87ee : return "ATC_RGBA_INTERPOLATED_ALPHA_AMD";
        case 0x87f9 : return "3DC_X_AMD";
        case 0x87fa : return "3DC_XY_AMD";
        case 0x8b90 : return "GL_PALETTE4_RGB8_OES";
        case 0x8b91 : return "GL_PALETTE4_RGBA8_OES";
        case 0x8b92 : return "GL_PALETTE4_R5_G6_B5_OES";
        case 0x8b93 : return "GL_PALETTE4_RGBA4_OES";
        case 0x8b94 : return "GL_PALETTE4_RGB5_A1_OES";
        case 0x8b95 : return "GL_PALETTE8_RGB8_OES";
        case 0x8b96 : return "GL_PALETTE8_RGBA8_OES";
        case 0x8b97 : return "GL_PALETTE8_R5_G6_B5_OES";
        case 0x8b98 : return "GL_PALETTE8_RGBA4_OES";
        case 0x8b99 : return "GL_PALETTE8_RGB5_A1_OES";
        case 0x8c00 : return "COMPRESSED_RGB_PVRTC_4BPPV1_IMG";
        case 0x8c01 : return "COMPRESSED_RGB_PVRTC_2BPPV1_IMG";
        case 0x8c02 : return "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG";
        case 0x8c03 : return "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG";
        case 0x8c48 : return "GL_COMPRESSED_SRGB_EXT";
        case 0x8c49 : return "GL_COMPRESSED_SRGB_ALPHA_EXT";
        case 0x8c4a : return "GL_COMPRESSED_SLUMINANCE_EXT";
        case 0x8c4b : return "GL_COMPRESSED_SLUMINANCE_ALPHA_EXT";
        case 0x8c4c : return "GL_COMPRESSED_SRGB_S3TC_DXT1_EXT";
        case 0x8c4d : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT";
        case 0x8c4e : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT";
        case 0x8c4f : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT";
        case 0x8c70 : return "GL_COMPRESSED_LUMINANCE_LATC1_EXT";
        case 0x8c71 : return "GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT";
        case 0x8c72 : return "GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT";
        case 0x8c73 : return "GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT";
        case 0x8c92 : return "ATC_RGB_AMD";
        case 0x8c93 : return "ATC_RGBA_EXPLICIT_ALPHA_AMD";
        case 0x8d64 : return "ETC1_RGB8_OES";
        case 0x8dbb : return "GL_COMPRESSED_RED_RGTC1_EXT";
        case 0x8dbc : return "GL_COMPRESSED_SIGNED_RED_RGTC1_EXT";
        case 0x8dbd : return "GL_COMPRESSED_RED_GREEN_RGTC2_EXT";
        case 0x8dbe : return "GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT";
        case 0x8e8c : return "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB";
        case 0x8e8d : return "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB";
        case 0x8e8e : return "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB";
        case 0x8e8f : return "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB";
        case 0x9137 : return "COMPRESSED_RGBA_PVRTC_2BPPV2_IMG";
        case 0x9138 : return "COMPRESSED_RGBA_PVRTC_4BPPV2_IMG";
        case 0x9270 : return "GL_COMPRESSED_R11_EAC";
        case 0x9271 : return "GL_COMPRESSED_SIGNED_R11_EAC";
        case 0x9272 : return "GL_COMPRESSED_RG11_EAC";
        case 0x9273 : return "GL_COMPRESSED_SIGNED_RG11_EAC";
        case 0x9274 : return "GL_COMPRESSED_RGB8_ETC2";
        case 0x9275 : return "GL_COMPRESSED_SRGB8_ETC2";
        case 0x9276 : return "GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2";
        case 0x9277 : return "GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2";
        case 0x9278 : return "GL_COMPRESSED_RGBA8_ETC2_EAC";
        case 0x9279 : return "GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC";
        case 0x93b0 : return "GL_COMPRESSED_RGBA_ASTC_4x4_KHR";
        case 0x93b1 : return "GL_COMPRESSED_RGBA_ASTC_5x4_KHR";
        case 0x93b2 : return "GL_COMPRESSED_RGBA_ASTC_5x5_KHR";
        case 0x93b3 : return "GL_COMPRESSED_RGBA_ASTC_6x5_KHR";
        case 0x93b4 : return "GL_COMPRESSED_RGBA_ASTC_6x6_KHR";
        case 0x93b5 : return "GL_COMPRESSED_RGBA_ASTC_8x5_KHR";
        case 0x93b6 : return "GL_COMPRESSED_RGBA_ASTC_8x6_KHR";
        case 0x93b7 : return "GL_COMPRESSED_RGBA_ASTC_8x8_KHR";
        case 0x93b8 : return "GL_COMPRESSED_RGBA_ASTC_10x5_KHR";
        case 0x93b9 : return "GL_COMPRESSED_RGBA_ASTC_10x6_KHR";
        case 0x93ba : return "GL_COMPRESSED_RGBA_ASTC_10x8_KHR";
        case 0x93bb : return "GL_COMPRESSED_RGBA_ASTC_10x10_KHR";
        case 0x93bc : return "GL_COMPRESSED_RGBA_ASTC_12x10_KHR";
        case 0x93bd : return "GL_COMPRESSED_RGBA_ASTC_12x12_KHR";
        case 0x93c0 : return "GL_COMPRESSED_RGBA_ASTC_3x3x3_OES";
        case 0x93c1 : return "GL_COMPRESSED_RGBA_ASTC_4x3x3_OES";
        case 0x93c2 : return "GL_COMPRESSED_RGBA_ASTC_4x4x3_OES";
        case 0x93c3 : return "GL_COMPRESSED_RGBA_ASTC_4x4x4_OES";
        case 0x93c4 : return "GL_COMPRESSED_RGBA_ASTC_5x4x4_OES";
        case 0x93c5 : return "GL_COMPRESSED_RGBA_ASTC_5x5x4_OES";
        case 0x93c6 : return "GL_COMPRESSED_RGBA_ASTC_5x5x5_OES";
        case 0x93c7 : return "GL_COMPRESSED_RGBA_ASTC_6x5x5_OES";
        case 0x93c8 : return "GL_COMPRESSED_RGBA_ASTC_6x6x5_OES";
        case 0x93c9 : return "GL_COMPRESSED_RGBA_ASTC_6x6x6_OES";
        case 0x93d0 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR";
        case 0x93d1 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR";
        case 0x93d2 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR";
        case 0x93d3 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR";
        case 0x93d4 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR";
        case 0x93d5 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR";
        case 0x93d6 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR";
        case 0x93d7 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR";
        case 0x93d8 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR";
        case 0x93d9 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR";
        case 0x93da : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR";
        case 0x93db : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR";
        case 0x93dc : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR";
        case 0x93dd : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR";
        case 0x93e0 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_3x3x3_OES";
        case 0x93e1 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x3x3_OES";
        case 0x93e2 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x3_OES";
        case 0x93e3 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x4_OES";
        case 0x93e4 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4x4_OES";
        case 0x93e5 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x4_OES";
        case 0x93e6 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x5_OES";
        case 0x93e7 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5x5_OES";
        case 0x93e8 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x5_OES";
        case 0x93e9 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x6_OES";
        default:
            return "0x" + Integer.toHexString(formatID);
        }
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
      
        final Runnable doRun =  new Runnable() {
            public void run() {
                Sys.setSDK(SDK.MALI);
                final Emulator emulator = new Emulator("Emulator");
                
            }
        };
        
        SwingUtilities.invokeLater(doRun);

    }

    
}
