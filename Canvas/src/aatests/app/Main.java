/**
 * 
 */
package aatests.app;

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
        Activity app = new MainActivity();
        Emulator em = new Emulator("Lesson one", app,640,480);
        
    }

}
