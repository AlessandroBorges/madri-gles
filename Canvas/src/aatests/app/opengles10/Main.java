/**
 * 
 */
package aatests.app.opengles10;

import android.app.Activity;
import gles.emulator.Emulator;
import gles.emulator.Sys;

/**
 * @author Alessandro Borges
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Sys.setSDK(Sys.SDK.PowerVR);
        Sys.setGLPipe(Sys.GL_PIPE.GLES10);
        Activity app = new OpenGLES10Activity();
        Emulator em = new Emulator("GLES 10 example", app,640,480);
        
    }

}
