/**
 * 
 */
package gles.emulator;

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
            // EGL_CLIENT_APIS, EGL_VENDOR, EGL_VERSION, or EGL_EXTENSIONS.
            System.out.println("Vendor: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_VENDOR));
            System.out.println("Version: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_VERSION));
            System.out.println("EGL APIS: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_CLIENT_APIS));
            System.out.println("Extensions: " + EGL14.eglQueryString(mEglDisplay, EGL14.EGL_EXTENSIONS));
        }else{
            System.err.println("### failed to initialize");
           // return;
        }
        
        ok = egl.eglBindAPI(EGL14.EGL_OPENGL_ES_API);
        
        
        //EGLConfig[] config = new EGLConfig[10];
        int[] num_config = new int[1];
        
     // typical high-quality attrib list
        int configSpec[] = {
        // 32 bit color
                EGL14.EGL_RED_SIZE, 8,
                EGL14.EGL_GREEN_SIZE, 8,
                EGL14.EGL_BLUE_SIZE, 8,
        // at least 24 bit depth
                EGL14.EGL_DEPTH_SIZE, 0,
                EGL14.EGL_SURFACE_TYPE, EGL14.EGL_WINDOW_BIT,
        // want opengl-es 2.x conformant CONTEXT
                EGL14.EGL_RENDERABLE_TYPE, EGL14.EGL_OPENGL_ES2_BIT, 
                EGL14.EGL_NONE
        };      
      

        EGLConfig[] configs = new EGLConfig[1];
        
         ok = egl.eglChooseConfig(mEglDisplay, configSpec, configs, 1, num_config);
        EGLConfig mEglConfig = configs[0];
        if(ok){
            System.out.println("### good config: " + mEglConfig);
        }else{
            System.err.println("### BAD config: " + mEglConfig);
        }  
        
        ////////////////////////////////////////////////////
        int ctxattr[] = {
                EGL14.EGL_CONTEXT_CLIENT_VERSION, 2,
                EGL14.EGL_NONE
        };

        EGLContext mEglContext = (EGLContext)egl.eglGetCurrentContext();
        
        if(mEglContext == null || mEglContext == EGL14.EGL_NO_CONTEXT)
            mEglContext = egl.eglCreateContext(mEglDisplay,
                                               mEglConfig,
                                               EGL14.EGL_NO_CONTEXT, ctxattr);
        if (mEglContext == EGL14.EGL_NO_CONTEXT) {
            System.err.println("mEglContext == EGL_NO_CONTEXT !");
            return;
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
      
        for (int i = 0; i < compFormatsList.length; i++) {
            int format = compFormatsList[i];
            String name = getTextureCompresssedNames().get(format);
            if(name==null) name = "unknow";
            print(name + " (0x" + Integer.toHexString(format) + ")");
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
    
    /**
     * Get Compressed Texture names
     * @return
     */
    private Map<Integer,String> getTextureCompresssedNames(){
        if(compTextures==null){
            compTextures = new HashMap<Integer, String>(compressedTextureList.length);
            for (Object[] tuple : compressedTextureList) {
                String value = (String)tuple[0];
                Integer key = (Integer)tuple[1];
                compTextures.put(key, value);
            }
        }
        return compTextures;
    }
    
    private Map<Integer,String> compTextures = null;
    /**
     * Original list from 
     * http://fossies.org/linux/mesa-demos/src/xdemos/glinfo_common.c
     * 
      * Copyright (C) 1999-2014  Brian Paul   All Rights Reserved.
      * 
      * Permission is hereby granted, free of charge, to any person obtaining a
      * copy of this software and associated documentation files (the "Software"),
      * to deal in the Software without restriction, including without limitation
      * the rights to use, copy, modify, merge, publish, distribute, sublicense,
      * and/or sell copies of the Software, and to permit persons to whom the
      * Software is furnished to do so, subject to the following conditions:
     * 
     * The above copyright notice and this permission notice shall be included
     * in all copies or substantial portions of the Software.
     * 
     * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
     * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
     * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL
     * BRIAN PAUL BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN
     * AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
     * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
     */
    private Object compressedTextureList [][] = {
                   { "GL_COMPRESSED_ALPHA", 0x84E9 },
                   { "GL_COMPRESSED_LUMINANCE", 0x84EA },
                   { "GL_COMPRESSED_LUMINANCE_ALPHA", 0x84EB },
                   { "GL_COMPRESSED_INTENSITY", 0x84EC },
                   { "GL_COMPRESSED_RGB", 0x84ED },
                   { "GL_COMPRESSED_RGBA", 0x84EE },
                   { "GL_COMPRESSED_TEXTURE_FORMATS", 0x86A3 },
                   { "GL_COMPRESSED_RGB", 0x84ED },
                   { "GL_COMPRESSED_RGBA", 0x84EE },
                   { "GL_COMPRESSED_TEXTURE_FORMATS", 0x86A3 },
                   { "GL_COMPRESSED_ALPHA", 0x84E9 },
                   { "GL_COMPRESSED_LUMINANCE", 0x84EA },
                   { "GL_COMPRESSED_LUMINANCE_ALPHA", 0x84EB },
                   { "GL_COMPRESSED_INTENSITY", 0x84EC },
                   { "GL_COMPRESSED_SRGB", 0x8C48 },
                   { "GL_COMPRESSED_SRGB_ALPHA", 0x8C49 },
                   { "GL_COMPRESSED_SLUMINANCE", 0x8C4A },
                   { "GL_COMPRESSED_SLUMINANCE_ALPHA", 0x8C4B },
                   { "GL_COMPRESSED_RED", 0x8225 },
                   { "GL_COMPRESSED_RG", 0x8226 },
                   { "GL_COMPRESSED_RED_RGTC1", 0x8DBB },
                   { "GL_COMPRESSED_SIGNED_RED_RGTC1", 0x8DBC },
                   { "GL_COMPRESSED_RG_RGTC2", 0x8DBD },
                   { "GL_COMPRESSED_SIGNED_RG_RGTC2", 0x8DBE },
                   { "GL_COMPRESSED_RGB8_ETC2", 0x9274 },
                   { "GL_COMPRESSED_SRGB8_ETC2", 0x9275 },
                   { "GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2", 0x9276 },
                   { "GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2", 0x9277 },
                   { "GL_COMPRESSED_RGBA8_ETC2_EAC", 0x9278 },
                   { "GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC", 0x9279 },
                   { "GL_COMPRESSED_R11_EAC", 0x9270 },
                   { "GL_COMPRESSED_SIGNED_R11_EAC", 0x9271 },
                   { "GL_COMPRESSED_RG11_EAC", 0x9272 },
                   { "GL_COMPRESSED_SIGNED_RG11_EAC", 0x9273 },
                   { "GL_COMPRESSED_ALPHA_ARB", 0x84E9 },
                   { "GL_COMPRESSED_LUMINANCE_ARB", 0x84EA },
                   { "GL_COMPRESSED_LUMINANCE_ALPHA_ARB", 0x84EB },
                   { "GL_COMPRESSED_INTENSITY_ARB", 0x84EC },
                   { "GL_COMPRESSED_RGB_ARB", 0x84ED },
                   { "GL_COMPRESSED_RGBA_ARB", 0x84EE },
                   { "GL_COMPRESSED_TEXTURE_FORMATS_ARB", 0x86A3 },
                   { "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB", 0x8E8C },
                   { "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB", 0x8E8D },
                   { "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB", 0x8E8E },
                   { "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB", 0x8E8F },
                   { "GL_COMPRESSED_RGBA_ASTC_4x4_KHR", 0x93B0 },
                   { "GL_COMPRESSED_RGBA_ASTC_5x4_KHR", 0x93B1 },
                   { "GL_COMPRESSED_RGBA_ASTC_5x5_KHR", 0x93B2 },
                   { "GL_COMPRESSED_RGBA_ASTC_6x5_KHR", 0x93B3 },
                   { "GL_COMPRESSED_RGBA_ASTC_6x6_KHR", 0x93B4 },
                   { "GL_COMPRESSED_RGBA_ASTC_8x5_KHR", 0x93B5 },
                   { "GL_COMPRESSED_RGBA_ASTC_8x6_KHR", 0x93B6 },
                  { "GL_COMPRESSED_RGBA_ASTC_8x8_KHR", 0x93B7 },
                  { "GL_COMPRESSED_RGBA_ASTC_10x5_KHR", 0x93B8 },
                  { "GL_COMPRESSED_RGBA_ASTC_10x6_KHR", 0x93B9 },
                  { "GL_COMPRESSED_RGBA_ASTC_10x8_KHR", 0x93BA },
                  { "GL_COMPRESSED_RGBA_ASTC_10x10_KHR", 0x93BB },
                  { "GL_COMPRESSED_RGBA_ASTC_12x10_KHR", 0x93BC },
                  { "GL_COMPRESSED_RGBA_ASTC_12x12_KHR", 0x93BD },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR", 0x93D0 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR", 0x93D1 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR", 0x93D2 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR", 0x93D3 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR", 0x93D4 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR", 0x93D5 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR", 0x93D6 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR", 0x93D7 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR", 0x93D8 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR", 0x93D9 },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR", 0x93DA },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR", 0x93DB },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR", 0x93DC },
                  { "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR", 0x93DD },
                  { "GL_COMPRESSED_RGB_FXT1_3DFX", 0x86B0 },
                  { "GL_COMPRESSED_RGBA_FXT1_3DFX", 0x86B1 },
                  { "GL_COMPRESSED_LUMINANCE_LATC1_EXT", 0x8C70 },
                  { "GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT", 0x8C71 },
                  { "GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT", 0x8C72 },
                  { "GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT", 0x8C73 },
                  { "GL_COMPRESSED_RED_RGTC1_EXT", 0x8DBB },
                  { "GL_COMPRESSED_SIGNED_RED_RGTC1_EXT", 0x8DBC },
                  { "GL_COMPRESSED_RED_GREEN_RGTC2_EXT", 0x8DBD },
                  { "GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT", 0x8DBE },
                  { "GL_COMPRESSED_RGB_S3TC_DXT1_EXT", 0x83F0 },
                  { "GL_COMPRESSED_RGBA_S3TC_DXT1_EXT", 0x83F1 },
                  { "GL_COMPRESSED_RGBA_S3TC_DXT3_EXT", 0x83F2 },
                  { "GL_COMPRESSED_RGBA_S3TC_DXT5_EXT", 0x83F3 },
                  { "GL_COMPRESSED_SRGB_EXT", 0x8C48 },
                  { "GL_COMPRESSED_SRGB_ALPHA_EXT", 0x8C49 },
                  { "GL_COMPRESSED_SLUMINANCE_EXT", 0x8C4A },
                  { "GL_COMPRESSED_SLUMINANCE_ALPHA_EXT", 0x8C4B },
                  { "GL_COMPRESSED_SRGB_S3TC_DXT1_EXT", 0x8C4C },
                  { "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT", 0x8C4D },
                  { "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT", 0x8C4E },
                  { "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT", 0x8C4F },
                  { "GL_PALETTE4_RGB8_OES", 0x8B90 },
                  { "GL_PALETTE4_RGBA8_OES", 0x8B91 },
                  { "GL_PALETTE4_R5_G6_B5_OES", 0x8B92 },
                  { "GL_PALETTE4_RGBA4_OES", 0x8B93 },
                  { "GL_PALETTE4_RGB5_A1_OES", 0x8B94 },
                  { "GL_PALETTE8_RGB8_OES", 0x8B95 },
                  { "GL_PALETTE8_RGBA8_OES", 0x8B96 },
                  { "GL_PALETTE8_R5_G6_B5_OES", 0x8B97 },
                  { "GL_PALETTE8_RGBA4_OES", 0x8B98 },
                  { "GL_PALETTE8_RGB5_A1_OES", 0x8B99 }
               };
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
