/**
 * 
 */
package aatests.app.opengles20;

import javax.swing.SwingUtilities;

import android.app.Activity;
import gles.emulator.*;
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
        Sys.setSDK(Sys.SDK.ANGLE);
        final Activity app = new OpenGLES20Activity();
        Runnable doRun = new Runnable() {            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Emulator em = new Emulator("Lesson one", app,640,480);
                //GLESInfo info = new GLESInfo();
               // System.out.println(info.toString());
            }
        };
        SwingUtilities.invokeLater(doRun);
        
        
        
    }

}
