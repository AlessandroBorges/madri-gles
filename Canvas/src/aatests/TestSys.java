package aatests;

import gles.emulator.Sys;
import gles.internal.GLES10Pipeline;
import gles.internal.GLES20Pipeline;

public class TestSys {

    public static void main(String[] args) {
       Sys.setSDK(Sys.SDK.PowerVR);
       System.out.println("before: " + Sys.asString());
       Sys.setSDK(Sys.SDK.ANGLE);
       GLES10Pipeline pipe10 = (GLES10Pipeline)Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES10);
       
       //Sys.setSDK(Sys.SDK.PowerVR);
       System.out.println("after: " + Sys.asString());
       GLES20Pipeline pipe = (GLES20Pipeline)Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES20);
       System.out.println("pipe: " + pipe);
       System.out.println(Sys.asString());

    }

}
