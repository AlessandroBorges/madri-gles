package gles.util;

import android.opengl.GLSurfaceView.EGLConfigChooser;

public class TestExt extends ComponentSizeChooser implements EGLConfigChooser {

    public TestExt(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize,
            int eglContextClientVersion) {
        super(redSize, greenSize, blueSize, alphaSize, depthSize, stencilSize, eglContextClientVersion);
        // TODO Auto-generated constructor stub
    }

}
