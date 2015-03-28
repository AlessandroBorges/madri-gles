/*

**    Place holder for disclaimer.
*/

package gles.internal;

public class GLES10ExtPipeline implements Pipeline {
	
	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	protected GLES10ExtPipeline(){}

	/**
	 * 
	 */
	private static Pipeline instance;
	
	/**
	 * Get a instance of this Pipeline implementation
	 * @return a live instance of GLES10EXT
	 */
	public  Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES10ExtPipeline();
		}        
        return instance;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext._nativeClassInit();
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public void GLES10ExtClassInit() {
        GLES10ExtPipeline.nGLES10ExtClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10Ext._nativeClassInit();
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static native void nGLES10ExtClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES([int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public int glQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset) {
        return GLES10ExtPipeline.nGLQueryMatrixxOES(mantissa, mantissaOffset, exponent, exponentOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10Ext.glQueryMatrixxOES([int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static native int nGLQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES([java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public int glQueryMatrixxOES(java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent) {
       return GLES10ExtPipeline.nGLQueryMatrixxOES(mantissa, exponent);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10Ext.glQueryMatrixxOES([java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static native int nGLQueryMatrixxOES(java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent);
}
