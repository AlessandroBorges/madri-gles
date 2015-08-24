/**
 * 
 */
package gles.sample;

import javax.swing.SwingUtilities;

import android.app.Activity;
import gles.emulator.*;

/**
 * @author Alessandro Borges
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Sys.setSDK(Sys.SDK.ANGLE);
        final Activity app = new OpenGLES20Example();
        Runnable doRun = new Runnable() {            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Emulator em = new Emulator("Lesson one", app,640,480);                
            }
        };
        SwingUtilities.invokeLater(doRun);
    }
}
