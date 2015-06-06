/*

**    Place holder for disclaimer.
*/

package gles.internal;

import static gles.internal.GLES10Pipeline.checkArray;
import static gles.internal.GLES10Pipeline.checkBuffer;
import static gles.internal.GLES10Pipeline.getOffset;

public class GLES10ExtPipeline implements Pipeline {
	
    /** Includes **/
    //@off
    /*JNI
      #define GL_GLEXT_PROTOTYPES
      #include <GLES/gl.h>
      #include <GLES/glext.h>
      #include <GLES/egl.h>
          
      #include <stdio.h>
      #include <stdlib.h>
      #include <vector>
      
      using namespace std;
      
      ////////////////////////////////////////
     */
    
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
    private static native void nGLES10ExtClassInit();/*
     // no op
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES([int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    public int glQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset) {
        checkArray(mantissa,mantissaOffset,16,"mantissa");
        checkArray(exponent, exponentOffset, 16, "exponent");
        return GLES10ExtPipeline.nGLQueryMatrixxOES(mantissa, mantissaOffset, exponent, exponentOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10Ext.glQueryMatrixxOES([int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static native int nGLQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset);/*     
     jint val = 0;
     val = (jint) glQueryMatrixxOES((GLfixed *)(mantissa + mantissaOffset), 
                                    (GLint *)(exponent + exponentOffset));
    
     return val;
      */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10Ext.glQueryMatrixxOES(
     * [java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )
     * */
    public int glQueryMatrixxOES(java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent) {
       checkBuffer(mantissa, 16, "mantissa");
       checkBuffer(exponent, 16, "exponent");
       int mantissaOffset = getOffset(mantissa);
       int exponentOffset = getOffset(exponent);
       if(mantissa.isDirect() && exponent.isDirect()){
           return GLES10ExtPipeline.nGLQueryMatrixxOES(mantissa, mantissaOffset, exponent, exponentOffset);
       }else{
           int[] array = mantissa.array();
           int[] array2 = exponent.array();
           return GLES10ExtPipeline.nGLQueryMatrixxOES(array, mantissaOffset, array2, exponentOffset);
       }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10Ext.glQueryMatrixxOES([java.nio.IntBuffer mantissa, java.nio.IntBuffer exponent]);
     * 
     *  C function GLbitfield glQueryMatrixxOES ( GLfixed *mantissa, GLint *exponent )

     * */
    private static native int nGLQueryMatrixxOES(java.nio.IntBuffer mantissa, int mantissaOffset, java.nio.IntBuffer exponent, int exponentOffset);/*
       jint val = 0;
       val = (jint) glQueryMatrixxOES((GLfixed *)(mantissa + mantissaOffset), 
                                    (GLint *)(exponent + exponentOffset));    
       return val;
    */
}
