 package gles.emulator;

public abstract class Pipeline {

	public Pipeline() {
		// TODO Auto-generated constructor stub
	}
	
	
    // Methods to get native WS display and screen
  //  abstract int getScreen(GraphicsDevice graphicsDevice);
	
    // Method to construct a new DrawingSurfaceObject
  //  abstract DrawingSurfaceObject createDrawingSurfaceObject(Canvas3D cv);

    // Method to free the drawing surface object
 //   abstract void freeDrawingSurface(Canvas3D cv, DrawingSurfaceObject drawingSurfaceObject);

    // Method to free the native drawing surface object
    abstract void freeDrawingSurfaceNative(Object o);

}
