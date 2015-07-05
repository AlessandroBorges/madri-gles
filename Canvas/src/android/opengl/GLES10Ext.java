/*

**    Place holder for disclaimer.
*/

package android.opengl;

import gles.internal.GLES10ExtPipeline;
import gles.internal.Sys;

public class GLES10Ext extends GLES10 {
	
   /**
    * Local instance of pipeline	
    */
   private static GLES10ExtPipeline pipeline;
    
   /**
    * Get the pipeline from Sys.
    * All logic from selecting undelying API implementation 
    * is provided by Sys class.
    * 
    * @return Pipeline instance for this OpenGL ES
    */
    private static GLES10ExtPipeline getPipeline(){
    	if(pipeline==null){
    		pipeline = (GLES10ExtPipeline) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES10Ext);
    	}
    	return pipeline;
    }
    

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext._nativeClassInit();
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static void _nativeClassInit() {
        getPipeline().GLES10ExtClassInit();
    }

    static {
        _nativeClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES([int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public static int glQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset) {
        return getPipeline().glQueryMatrixxOES(mantissa, mantissaOffset, exponent, exponentOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES([java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public static int glQueryMatrixxOES(java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent) {
        return getPipeline().glQueryMatrixxOES(mantissa, exponent);
    }
}
