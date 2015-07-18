/**
 * 
 */
package aatests.app.opengles20;

import android.app.Activity;
import gles.emulator.Emulator;
import gles.internal.Sys;

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
        Activity app = new OpenGLES20Activity();
        Emulator em = new Emulator("Lesson one", app,640,480);
        
    }

}
