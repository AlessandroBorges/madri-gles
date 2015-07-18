package aatests.app;
//package ri.blog.opengl001;

import android.content.Context;
import android.opengl.GLSurfaceView;
 
public class GLSurf extends GLSurfaceView {
 
    private final GLRenderer mRenderer;
 
    public GLSurf(Context context) {
        super(context);
 
        // Create an OpenGL ES 2.0 context.
        setEGLContextClientVersion(2);
 
        // Set the Renderer for drawing on the GLSurfaceView
        mRenderer = new GLRenderer(context);
        setRenderer(mRenderer);
   
        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }
 
    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        mRenderer.onPause();
    }
 
    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        mRenderer.onResume();
    }
 
}