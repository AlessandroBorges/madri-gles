/*

**    Place holder for disclaimer.
*/

package gles.internal;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.*;

public class GLES11Pipeline 
	extends GLES10Pipeline 
	implements Pipeline {

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
    
    private final String EQN = "eqn";
    private final String EQUATION = "equation";
    private final String BUFFERS = "buffers";
    
	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	private GLES11Pipeline(){}

	/**
	 * 
	 */
	private static Pipeline instance;
	
	/**
	 * Get a instance of this Pipeline implementation
	 * @return a live instance of GLES10EXT
	 */
	public static  Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES11Pipeline();
		}        
        return instance;
    }

    /**
     * <pre>
     * Delegate Method generated from GLES11._nativeClassInit();
     * 
     *  C function void glBindBuffer((GLenum)  target, (GLuint ) buffer )

     * */
    public void GLES11ClassInit() {
        GLES11Pipeline.nGLES11ClassInit();
    }

    /**
     * <pre>
     * Native method generated from GLES11._nativeClassInit();
     * 
     *  

     * */
    private static native void nGLES11ClassInit();/*
      // no op
     */
    

    /**
     * <pre>
     * Delegate Method generated from GLES11.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer((GLenum)  target, (GLuint ) buffer )

     * */
    public void glBindBuffer(int target, int buffer) {
        GLES11Pipeline.nGLBindBuffer(target, buffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer((GLenum)  target, (GLuint ) buffer )

     * */
    private static native void nGLBindBuffer(int target, int buffer);/*
       glBindBuffer((GLenum)  target, (GLuint ) buffer );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData((GLenum)  target, (GLsizei) ptr size,(GLvoid *)data,  (GLenum)  usage )

     * */
    public void glBufferData(int target, int size, java.nio.Buffer data, int usage) {
        checkBuffer(data, size, DATA);
        int offset = getOffset(data);
        if(data.isDirect()){
            GLES11Pipeline.nGLBufferData(target, size, data, offset, usage);    
        }else{
            if(data instanceof FloatBuffer){
                FloatBuffer buff = (FloatBuffer)data; 
                float[] array = buff.array();
                offset = getOffset(buff);
                GLES11Pipeline.nGLBufferData(target, size, array, offset, usage); 
                return;
            }else if(data instanceof ShortBuffer){
                ShortBuffer buff = (ShortBuffer)data; 
                short[] array = buff.array();                
                offset = getOffset(buff);
                GLES11Pipeline.nGLBufferData(target, size, array, offset, usage);
                return;
            }else if(data instanceof IntBuffer){
                IntBuffer buff = ((IntBuffer)data);
                int[] array = buff.array();
                offset = getOffset(buff);
                GLES11Pipeline.nGLBufferData(target, size, array, offset, usage);
                return;
            }else if(data instanceof ByteBuffer){
                ByteBuffer buff = ((ByteBuffer)data); 
                byte[] array = buff.array();
                offset = getOffset(buff);
                GLES11Pipeline.nGLBufferData(target, size, array, offset, usage);
                return;
            }            
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES11.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)data,  (GLenum)  usage )

     * */
    private static native void nGLBufferData(int target, int size, java.nio.Buffer data, int offset, int usage);/*
        glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    */
    
    /**
     * 
     * @param target
     * @param size
     * @param data
     * @param offset
     * @param usage
     */
    private static native void nGLBufferData(int target, int size, byte[] data, int offset, int usage);/*
       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    */
    
    /**
     * 
     * @param target
     * @param size
     * @param data
     * @param offset
     * @param usage
     */
    private static native void nGLBufferData(int target, int size, short[] data, int offset, int usage);/*
       glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    */
    
    /**
     * 
     * @param target
     * @param size
     * @param data
     * @param offset
     * @param usage
     */
    private static native void nGLBufferData(int target, int size, float[] data, int offset, int usage);/*
      glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
    */
    
    /**
     * 
     * @param target
     * @param size
     * @param data
     * @param offset
     * @param usage
     */
    private static native void nGLBufferData(int target, int size, int[] data, int offset, int usage);/*
     glBufferData((GLenum)  target, (GLsizeiptr) size,(GLvoid *)(data + offset),  (GLenum)  usage );
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData((GLenum)  target,  (GLint) ptr offset, (GLsizei) ptr size,(GLvoid *)data )

     * */
    public void glBufferSubData(int target, int offset, int size, java.nio.Buffer data) {
        checkBuffer(data, size, DATA);
        int dataOffset = getOffset(data);
        
        if(data.isDirect()){            
            GLES11Pipeline.nGLBufferSubData(target, offset, size, data, dataOffset);
        }else{
            if(data instanceof FloatBuffer){
                FloatBuffer buff = (FloatBuffer)data; 
                float[] array = buff.array();
                dataOffset = getOffset(buff);
                GLES11Pipeline.nGLBufferSubData(target, offset, size, array, dataOffset);
                return;
            }else if(data instanceof ShortBuffer){
                ShortBuffer buff = (ShortBuffer)data; 
                short[] array = buff.array();                
                dataOffset = getOffset(buff);
                GLES11Pipeline.nGLBufferSubData(target, offset, size, array, dataOffset);
                return;
            }else if(data instanceof IntBuffer){
                IntBuffer buff = ((IntBuffer)data);
                int[] array = buff.array();
                dataOffset = getOffset(buff);
                GLES11Pipeline.nGLBufferSubData(target, offset, size, array, dataOffset);
                return;
            }else if(data instanceof ByteBuffer){
                ByteBuffer buff = ((ByteBuffer)data); 
                byte[] array = buff.array();
                dataOffset = getOffset(buff);
                GLES11Pipeline.nGLBufferSubData(target, offset, size, array, dataOffset);
                return;
            }            
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData((GLenum)  target,  (GLint) ptr offset, (GLsizei) ptr size,(GLvoid *)data )

     * */
    private static native void nGLBufferSubData(int target, int offset, int size, java.nio.Buffer data, int dataOffset);/*
      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    */
    
    private static native void nGLBufferSubData(int target, int offset, int size, byte[] data, int dataOffset);/*
      glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
    */

    private static native void nGLBufferSubData(int target, int offset, int size, short[] data, int dataOffset);/*
    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  */
    
    private static native void nGLBufferSubData(int target, int offset, int size, int[] data, int dataOffset);/*
    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  */
    
    private static native void nGLBufferSubData(int target, int offset, int size, float[] data, int dataOffset);/*
    glBufferSubData((GLenum)  target,  (GLintptr) offset, (GLsizeiptr)size, (GLvoid *)(data + dataOffset) );
  */
    
    /**
     * <pre>
     * Delegate Method generated from GLES11.glClipPlanef([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanef((GLenum)  plane,(GLfloat *) equation )

     * */
    public void glClipPlanef(int plane, float[] equation, int offset) {
        checkArray(equation, offset, 4, "equation");
        GLES11Pipeline.nGLClipPlanef(plane, equation, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glClipPlanef([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanef((GLenum)  plane,(GLfloat *) equation )

     * */
    private static native void nGLClipPlanef(int plane, float[] equation, int offset);/*
      glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glClipPlanef([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanef((GLenum)  plane,(GLfloat *) equation )

     * */
    public void glClipPlanef(int plane, java.nio.FloatBuffer equation) {
        checkBuffer(equation, 4, "equation");
        int offset = getOffset(equation);
        if(equation.isDirect()){
            GLES11Pipeline.nGLClipPlanef(plane, equation, offset);
        }else{
            float[] array = equation.array();
            GLES11Pipeline.nGLClipPlanef(plane, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glClipPlanef([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanef((GLenum)  plane,(GLfloat *) equation )

     * */
    private static native void nGLClipPlanef(int plane, java.nio.FloatBuffer equation, int offset);/*
        glClipPlanef((GLenum)  plane,(GLfloat *) (equation + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glClipPlanex([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanex((GLenum)  plane,  (GLfixed *) equation )

     * */
    public void glClipPlanex(int plane, int[] equation, int offset) {
        checkArray(equation, offset, 4, "equation");
        GLES11Pipeline.nGLClipPlanex(plane, equation, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glClipPlanex([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanex((GLenum)  plane,  (GLfixed *) equation )

     * */
    private static native void nGLClipPlanex(int plane, int[] equation, int offset);/*
        glClipPlanex((GLenum)  plane,  (GLfixed *) (equation + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glClipPlanex([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanex((GLenum)  plane,  (GLfixed *) equation )

     * */
    public void glClipPlanex(int plane, java.nio.IntBuffer equation) {
        checkBuffer(equation, 4, "equation");
        int offset = getOffset(equation);
        if(equation.isDirect()){
            GLES11Pipeline.nGLClipPlanex(plane, equation, offset);    
        }else{
            int[] array = equation.array();
            GLES11Pipeline.nGLClipPlanex(plane, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glClipPlanex([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanex((GLenum)  plane,  (GLfixed *) equation )

     * */
    private static native void nGLClipPlanex(int plane, java.nio.IntBuffer equation, int offset);/*
            glClipPlanex((GLenum)  plane,  (GLfixed *)(equation + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glColor4ub([byte red, byte green, byte blue, byte alpha]);
     * 
     *  C function void glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha )

     * */
    public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        GLES11Pipeline.nGLColor4ub(red, green, blue, alpha);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glColor4ub([byte red, byte green, byte blue, byte alpha]);
     * 
     *  C function void glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha )

     * */
    private static native void nGLColor4ub(byte red, byte green, byte blue, byte alpha);/*
         glColor4ub((GLubyte)  red, (GLubyte)  green, (GLubyte)  blue, (GLubyte)  alpha );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glColorPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glColorPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    public void glColorPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLColorPointer(size, type, stride, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glColorPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glColorPointer((GLint)  size,  
     *                                 (GLenum)  type, 
     *                                 (GLsizei)  stride,  
     *                                 (GLint)  offset )
     * */
    private static native void nGLColorPointer(int size, int type, int stride, int offset);/*
         glColorPointer((GLint)  size,  
                        (GLenum)  type, 
                        (GLsizei)  stride,  
                        reinterpret_cast<GLvoid *>(offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers((GLsizei)  n, const (GLuint ) *buffers )

     * */
    public void glDeleteBuffers(int n, int[] buffers, int offset) {
        checkArray(buffers, offset, n, BUFFERS);
        GLES11Pipeline.nGLDeleteBuffers(n, buffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers((GLsizei)  n, const (GLuint ) *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, int[] buffers, int offset);/*
        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers((GLsizei)  n, const (GLuint ) *buffers )

     * */
    public void glDeleteBuffers(int n, java.nio.IntBuffer buffers) {
        checkBuffer(buffers, n, BUFFERS);
        int offset = getOffset(buffers);
        if(buffers.isDirect()){
            GLES11Pipeline.nGLDeleteBuffers(n, buffers, offset);
        }else{
            int[] array = buffers.array();
            GLES11Pipeline.nGLDeleteBuffers(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers((GLsizei)  n, const (GLuint ) *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, java.nio.IntBuffer buffers, int offset);/*
        glDeleteBuffers((GLsizei)  n, (GLuint *)(buffers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  (GLint)  offset )

     * */
    public void glDrawElements(int mode, int count, int type, int offset) {
        GLES11Pipeline.nGLDrawElements(mode, count, type, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  (GLint)  offset )

     * */
    private static native void nGLDrawElements(int mode, int count, int type, int offset);/*
       glDrawElements((GLenum)  mode, (GLsizei)  count,  (GLenum)  type,  reinterpret_cast<GLvoid *>(offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers((GLsizei)  n, (GLuint ) *buffers )

     * */
    public void glGenBuffers(int n, int[] buffers, int offset) {
        checkArray(buffers, offset, n, BUFFERS);
        GLES11Pipeline.nGLGenBuffers(n, buffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers((GLsizei)  n, (GLuint ) *buffers )

     * */
    private static native void nGLGenBuffers(int n, int[] buffers, int offset);/*
        glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers((GLsizei)  n, (GLuint ) *buffers )

     * */
    public void glGenBuffers(int n, java.nio.IntBuffer buffers) {
        checkBuffer(buffers, n, BUFFERS);
        int offset = getOffset(buffers);
        if(buffers.isDirect()){
            GLES11Pipeline.nGLGenBuffers(n, buffers, offset);
        }else{
            int[] array = buffers.array();
            GLES11Pipeline.nGLGenBuffers(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers((GLsizei)  n, (GLuint ) *buffers )

     * */
    private static native void nGLGenBuffers(int n, java.nio.IntBuffer buffers, int offset);/*
       glGenBuffers((GLsizei)  n, (GLuint *)(buffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv((GLenum)  pname, (GLboolean *) params )

     * */
    public void glGetBooleanv(int pname, boolean[] params, int offset) {
        int needed = getNeededCount(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetBooleanv(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv((GLenum)  pname, (GLboolean *) params )

     * */
    private static native void nGLGetBooleanv(int pname, boolean[] params, int offset);/*
       glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    */
    
    private static native void nGLGetBooleanv(int pname, int[] params, int offset);/*
      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv((GLenum)  pname, (GLboolean *) params )

     * */
    public void glGetBooleanv(int pname, java.nio.IntBuffer params) {
        int needed = getNeededCount(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
           GLES11Pipeline.nGLGetBooleanv(pname, params, offset);
        }else{
            int[] array = params.array();            
            GLES11Pipeline.nGLGetBooleanv(pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv((GLenum)  pname, (GLboolean *) params )

     * */
    private static native void nGLGetBooleanv(int pname, java.nio.IntBuffer params, int offset);/*
      glGetBooleanv((GLenum)  pname, (GLboolean *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetBufferParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLGetBufferParameteriv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, int[] params, int offset);/*
       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetBufferParameteriv(target, pname, params, offset);
        }else{
           int[] array = params.array();
           GLES11Pipeline.nGLGetBufferParameteriv(target, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
       glGetBufferParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetClipPlanef([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanef((GLenum)  pname, (GLfloat *)eqn )

     * */
    public void glGetClipPlanef(int pname, float[] eqn, int offset) {
        checkArray(eqn, offset, 4, EQN);
        GLES11Pipeline.nGLGetClipPlanef(pname, eqn, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetClipPlanef([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanef((GLenum)  pname, (GLfloat *)eqn )

     * */
    private static native void nGLGetClipPlanef(int pname, float[] eqn, int offset);/*
        glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetClipPlanef([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanef((GLenum)  pname, (GLfloat *)eqn )

     * */
    public void glGetClipPlanef(int pname, java.nio.FloatBuffer eqn) {
        checkBuffer(eqn, 4, EQN);
        int offset = getOffset(eqn);
        if(eqn.isDirect()){
            GLES11Pipeline.nGLGetClipPlanef(pname, eqn, offset);
        }else{
            float[] array = eqn.array();
            GLES11Pipeline.nGLGetClipPlanef(pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetClipPlanef([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanef((GLenum)  pname, (GLfloat *)eqn )

     * */
    private static native void nGLGetClipPlanef(int pname, java.nio.FloatBuffer eqn, int offset);/*
          glGetClipPlanef((GLenum)  pname, (GLfloat *)(eqn + offset));
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetClipPlanex([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanex((GLenum)  pname, (GLfixed)  *eqn )

     * */
    public void glGetClipPlanex(int pname, int[] eqn, int offset) {
        checkArray(eqn, offset, 4, EQN);
        GLES11Pipeline.nGLGetClipPlanex(pname, eqn, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetClipPlanex([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanex((GLenum)  pname, (GLfixed)  *eqn )

     * */
    private static native void nGLGetClipPlanex(int pname, int[] eqn, int offset);/*
        glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetClipPlanex([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanex((GLenum)  pname, (GLfixed)  *eqn )

     * */
    public void glGetClipPlanex(int pname, java.nio.IntBuffer eqn) {
        checkBuffer(eqn, 4, EQN);
        int offset = getOffset(eqn);
        if(eqn.isDirect()){
            GLES11Pipeline.nGLGetClipPlanex(pname, eqn, offset);
        }else{
            int[] array = eqn.array();
            GLES11Pipeline.nGLGetClipPlanex(pname, array, offset);            
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetClipPlanex([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanex((GLenum)  pname, (GLfixed)  *eqn )

     * */
    private static native void nGLGetClipPlanex(int pname, java.nio.IntBuffer eqn, int offset);/*
       glGetClipPlanex((GLenum)  pname, (GLfixed *)(eqn + offset));
     */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetFixedv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedv((GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetFixedv(int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLGetFixedv(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetFixedv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedv((GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetFixedv(int pname, int[] params, int offset);/*
         glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetFixedv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedv((GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetFixedv(int pname, java.nio.IntBuffer params) {
        int needed = getNeededCount(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetFixedv(pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetFixedv(pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetFixedv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedv((GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetFixedv(int pname, java.nio.IntBuffer params, int offset);/*
       glGetFixedv((GLenum)  pname, (GLfixed *)(params + offset));
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv((GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetFloatv(int pname, float[] params, int offset) {
        int needed = getNeededCount(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetFloatv(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv((GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetFloatv(int pname, float[] params, int offset);/*
       glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv((GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetFloatv(int pname, java.nio.FloatBuffer params) {
        int needed = getNeededCount(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetFloatv(pname, params,offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLGetFloatv(pname, array,offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv((GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetFloatv(int pname, java.nio.FloatBuffer params, int offset);/*
         glGetFloatv((GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetLightfv(int light, int pname, float[] params, int offset) {
        int needed = getNeededLight(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetLightfv(light, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetLightfv(int light, int pname, float[] params, int offset);/*
        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetLightfv(int light, int pname, java.nio.FloatBuffer params) {
        int needed = getNeededLight(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetLightfv(light, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLGetLightfv(light, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetLightfv(int light, int pname, java.nio.FloatBuffer params, int offset);/*
        glGetLightfv((GLenum)  light,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetLightxv(int light, int pname, int[] params, int offset) {
        int needed = getNeededLight(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetLightxv(light, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetLightxv(int light, int pname, int[] params, int offset);/*
         glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetLightxv(int light, int pname, java.nio.IntBuffer params) {
        int needed = getNeededLight(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetLightxv(light, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetLightxv(light, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetLightxv(int light, int pname, java.nio.IntBuffer params, int offset);/*
       glGetLightxv((GLenum)  light,  (GLenum)  pname, (GLfixed *)( params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetMaterialfv(int face, int pname, float[] params, int offset) {
        int needed = getNeededMaterial(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetMaterialfv(face, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetMaterialfv(int face, int pname, float[] params, int offset);/*
          glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetMaterialfv(int face, int pname, java.nio.FloatBuffer params) {
        int needed = getNeededLight(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetMaterialfv(face, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLGetMaterialfv(face, pname, array, offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetMaterialfv(int face, int pname, java.nio.FloatBuffer params, int offset);/*
        glGetMaterialfv((GLenum)  face,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetMaterialxv(int face, int pname, int[] params, int offset) {
        int needed = getNeededMaterial(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetMaterialxv(face, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetMaterialxv(int face, int pname, int[] params, int offset);/*
        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetMaterialxv(int face, int pname, java.nio.IntBuffer params) {
        int needed = getNeededLight(pname);
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetMaterialxv(face, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetMaterialxv(face, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetMaterialxv(int face, 
                                                int pname, 
                                                java.nio.IntBuffer params, 
                                                int offset);/*
        glGetMaterialxv((GLenum)  face,  (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnvfv([int envir, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexEnvfv(int envir, int pname, float[] params, int offset) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetTexEnvfv(envir, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnvfv([int envir, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexEnvfv(int envir, int pname, float[] params, int offset);/*
          glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnvfv([int envir, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexEnvfv(int envir, int pname, java.nio.FloatBuffer params) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexEnvfv(envir, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLGetTexEnvfv(envir, pname, array, offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnvfv([int envir, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexEnvfv(int envir, int pname, java.nio.FloatBuffer params, int offset);/*
        glGetTexEnvfv((GLenum)  envir,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnviv([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetTexEnviv(int envir, int pname, int[] params, int offset) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetTexEnviv(envir, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnviv([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetTexEnviv(int envir, int pname, int[] params, int offset);/*
        glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnviv([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetTexEnviv(int envir, int pname, java.nio.IntBuffer params) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexEnviv(envir, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetTexEnviv(envir, pname, array, offset);
        }    
       // GLES11Pipeline.nGLGetTexEnviv(envir, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnviv([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetTexEnviv(int envir, int pname, java.nio.IntBuffer params, int offset);/*
       glGetTexEnviv((GLenum)  envir,  (GLenum)  pname,  (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnvxv([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetTexEnvxv(int envir, int pname, int[] params, int offset) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        GLES11Pipeline.nGLGetTexEnvxv(envir, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnvxv([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetTexEnvxv(int envir, int pname, int[] params, int offset);/*
        glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexEnvxv([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetTexEnvxv(int envir, int pname, java.nio.IntBuffer params) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexEnvxv(envir, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetTexEnvxv(envir, pname, array, offset);
        }    
       // GLES11Pipeline.nGLGetTexEnvxv(envir, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexEnvxv([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetTexEnvxv(int envir, int pname, java.nio.IntBuffer params, int offset);/*
             glGetTexEnvxv((GLenum)  envir,  (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexParameterfv(int target, int pname, float[] params, int offset) {        
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLGetTexParameterfv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexParameterfv(int target, int pname, float[] params, int offset);/*
         glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {        
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexParameterfv(target, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLGetTexParameterfv(target, pname, array, offset);
        }  
       // GLES11Pipeline.nGLGetTexParameterfv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params, int offset);/*
        glGetTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetTexParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLGetTexParameteriv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, int[] params, int offset);/*
      glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    public void glGetTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexParameteriv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetTexParameteriv(target, pname, array, offset);
        }  
       // GLES11Pipeline.nGLGetTexParameteriv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint)  *params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
           glGetTexParameteriv((GLenum)  target,  (GLenum)  pname,  (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetTexParameterxv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLGetTexParameterxv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetTexParameterxv(int target, int pname, int[] params, int offset);/*
        glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glGetTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed)  *params )

     * */
    public void glGetTexParameterxv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLGetTexParameterxv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLGetTexParameterxv(target, pname, array, offset);
        }  
        //GLES11Pipeline.nGLGetTexParameterxv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glGetTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxv((GLenum)  target,  (GLenum)  pname, (GLfixed)  *params )

     * */
    private static native void nGLGetTexParameterxv(int target, int pname, java.nio.IntBuffer params, int offset);/*
            glGetTexParameterxv( (GLenum)target,
                    (GLenum)pname,
                    (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glIsBuffer([int buffer]);
     * 
     *  C function GLboolean glIsBuffer((GLuint ) buffer )

     * */
    public boolean glIsBuffer(int buffer) {
       return GLES11Pipeline.nGLIsBuffer(buffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glIsBuffer([int buffer]);
     * 
     *  C function GLboolean glIsBuffer((GLuint ) buffer )

     * */
    private static native boolean nGLIsBuffer(int buffer);/*
      GLboolean _returnValue = glIsBuffer( (GLuint)buffer);
      return (jboolean)_returnValue;
    */
    
    /**
     * <pre>
     * Delegate Method generated from GLES11.glIsEnabled([int cap]);
     * 
     *  C function GLboolean glIsEnabled((GLenum)  cap )

     * */
    public boolean glIsEnabled(int cap) {
       return  GLES11Pipeline.nGLIsEnabled(cap);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glIsEnabled([int cap]);
     * 
     *  C function GLboolean glIsEnabled((GLenum)  cap )

     * */
    private static native boolean nGLIsEnabled(int cap);/*
       GLboolean _returnValue = glIsEnabled((GLenum)cap);
       return (jboolean)_returnValue;
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glIsTexture([int texture]);
     * 
     *  C function GLboolean glIsTexture((GLuint ) texture )

     * */
    public boolean glIsTexture(int texture) {
       return GLES11Pipeline.nGLIsTexture(texture);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glIsTexture([int texture]);
     * 
     *  C function GLboolean glIsTexture((GLuint ) texture )

     * */
    private static native boolean nGLIsTexture(int texture);/*
      GLboolean val = glIsTexture( (GLuint)texture);
      return (jboolean)val;
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glNormalPointer([int type, int stride, int offset]);
     * 
     *  C function void glNormalPointer((GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    public void glNormalPointer(int type, int stride, int offset) {
        GLES11Pipeline.nGLNormalPointer(type, stride, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glNormalPointer([int type, int stride, int offset]);
     * 
     *  C function void glNormalPointer((GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    private static native void nGLNormalPointer(int type, int stride, int offset);/*
        glNormalPointer( (GLenum)  type, 
                         (GLsizei)  stride,  
                         reinterpret_cast<GLvoid *> (offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterf([int pname, float param]);
     * 
     *  C function void glPointParameterf((GLenum)  pname, (GLfloat) param )

     * */
    public void glPointParameterf(int pname, float param) {
        GLES11Pipeline.nGLPointParameterf(pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterf([int pname, float param]);
     * 
     *  C function void glPointParameterf((GLenum)  pname, (GLfloat) param )

     * */
    private static native void nGLPointParameterf(int pname, float param);/*
         glPointParameterf((GLenum)  pname, (GLfloat) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterfv([int pname, float[] params, int offset]);
     * 
     *  C function void glPointParameterfv((GLenum)  pname,(GLfloat *) params )

     * */
    public void glPointParameterfv(int pname, float[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLPointParameterfv(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterfv([int pname, float[] params, int offset]);
     * 
     *  C function void glPointParameterfv((GLenum)  pname,(GLfloat *) params )

     * */
    private static native void nGLPointParameterfv(int pname, float[] params, int offset);/*
         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glPointParameterfv((GLenum)  pname,(GLfloat *) params )

     * */
    public void glPointParameterfv(int pname, java.nio.FloatBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLPointParameterfv(pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLPointParameterfv(pname, array, offset);
        }  
        // GLES11Pipeline.nGLPointParameterfv(pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glPointParameterfv((GLenum)  pname,(GLfloat *) params )

     * */
    private static native void nGLPointParameterfv(int pname, java.nio.FloatBuffer params, int offset);/*
         glPointParameterfv((GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterx([int pname, int param]);
     * 
     *  C function void glPointParameterx((GLenum)  pname, (GLfixed)  param )

     * */
    public void glPointParameterx(int pname, int param) {
        GLES11Pipeline.nGLPointParameterx(pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterx([int pname, int param]);
     * 
     *  C function void glPointParameterx((GLenum)  pname, (GLfixed)  param )

     * */
    private static native void nGLPointParameterx(int pname, int param);/*
         glPointParameterx((GLenum)  pname, (GLfixed)  param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterxv([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxv((GLenum)  pname,  (GLfixed *) params )

     * */
    public void glPointParameterxv(int pname, int[] params, int offset) {
        GLES11Pipeline.nGLPointParameterxv(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterxv([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxv((GLenum)  pname,  (GLfixed *) params )

     * */
    private static native void nGLPointParameterxv(int pname, int[] params, int offset);/*
         glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointParameterxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxv((GLenum)  pname,  (GLfixed *) params )

     * */
    public void glPointParameterxv(int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLPointParameterxv(pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLPointParameterxv(pname, array, offset);
        }         
        // GLES11Pipeline.nGLPointParameterxv(pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointParameterxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxv((GLenum)  pname,  (GLfixed *) params )

     * */
    private static native void nGLPointParameterxv(int pname, java.nio.IntBuffer params, int offset);/*
       glPointParameterxv((GLenum)  pname,  (GLfixed *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glPointSizePointerOESBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)pointer )

     * */
    public void glPointSizePointerOESBounds(int type, int stride, java.nio.Buffer pointer, int remaining) {
        checkBuffer(pointer, 1, POINTER);
        int offset = getOffset(pointer);
        if(pointer.isDirect()){
            GLES11Pipeline.nGLPointSizePointerOESBounds(type, stride, pointer, offset, remaining);
        }else{
            throw new IllegalArgumentException("pointer is not direct buffer.");
        }    
       // GLES11Pipeline.nGLPointSizePointerOESBounds(type, stride, pointer, remaining);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glPointSizePointerOESBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)pointer )

     * */
    private static native void nGLPointSizePointerOESBounds(int type, int stride, java.nio.Buffer pointer, int offset, int remaining);/*
       glPointSizePointerOES((GLenum)  type, (GLsizei)  stride,(GLvoid *)(pointer + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexCoordPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    public void glTexCoordPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLTexCoordPointer(size, type, stride, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexCoordPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    private static native void nGLTexCoordPointer(int size, int type, int stride, int offset);/*
         glTexCoordPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,   reinterpret_cast<GLvoid *>(offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexEnvi([int target, int pname, int param]);
     * 
     *  C function void glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param )

     * */
    public void glTexEnvi(int target, int pname, int param) {
        GLES11Pipeline.nGLTexEnvi(target, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexEnvi([int target, int pname, int param]);
     * 
     *  C function void glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param )

     * */
    private static native void nGLTexEnvi(int target, int pname, int param);/*
       glTexEnvi((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexEnviv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnviv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    public void glTexEnviv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLTexEnviv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexEnviv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnviv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    private static native void nGLTexEnviv(int target, int pname, int[] params, int offset);/*
        glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexEnviv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnviv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    public void glTexEnviv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLTexEnviv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLTexEnviv(target, pname, array, offset);
        }    
        //GLES11Pipeline.nGLTexEnviv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexEnviv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnviv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    private static native void nGLTexEnviv(int target, int pname, java.nio.IntBuffer params, int offset);/*
           glTexEnviv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) params )

     * */
    public void glTexParameterfv(int target, int pname, float[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLTexParameterfv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) params )

     * */
    private static native void nGLTexParameterfv(int target, int pname, float[] params, int offset);/*
          glTexParameterfv((GLenum)  target,  (GLenum)  pname, (GLfloat *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) params )

     * */
    public void glTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLTexParameterfv(target, pname, params, offset);
        }else{
            float[] array = params.array();
            GLES11Pipeline.nGLTexParameterfv(target, pname, array, offset);
        }    
        //GLES11Pipeline.nGLTexParameterfv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) params )

     * */
    private static native void nGLTexParameterfv(int target, int pname, java.nio.FloatBuffer params, int offset);/*
        glTexParameterfv((GLenum)  target,  (GLenum)  pname,(GLfloat *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param )

     * */
    public void glTexParameteri(int target, int pname, int param) {
        GLES11Pipeline.nGLTexParameteri(target, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param )

     * */
    private static native void nGLTexParameteri(int target, int pname, int param);/*
         glTexParameteri((GLenum)  target,  (GLenum)  pname,  (GLint)  param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    public void glTexParameteriv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLTexParameteriv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, int[] params, int offset);/*
            glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    public void glTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLTexParameteriv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLTexParameteriv(target, pname, array, offset);
        }  
        //GLES11Pipeline.nGLTexParameteriv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv((GLenum)  target,  (GLenum)  pname, const  (GLint)  *params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, java.nio.IntBuffer params, int offset);/*
           glTexParameteriv((GLenum)  target,  (GLenum)  pname, (GLint *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) params )

     * */
    public void glTexParameterxv(int target, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES11Pipeline.nGLTexParameterxv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) params )

     * */
    private static native void nGLTexParameterxv(int target, int pname, int[] params, int offset);/*
        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) params )

     * */
    public void glTexParameterxv(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            GLES11Pipeline.nGLTexParameterxv(target, pname, params, offset);
        }else{
            int[] array = params.array();
            GLES11Pipeline.nGLTexParameterxv(target, pname, array, offset);
        }  
       // GLES11Pipeline.nGLTexParameterxv(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) params )

     * */
    private static native void nGLTexParameterxv(int target, int pname, java.nio.IntBuffer params, int offset);/*
        glTexParameterxv((GLenum)  target,  (GLenum)  pname,  (GLfixed *) (params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11.glVertexPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    public void glVertexPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLVertexPointer(size, type, stride, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11.glVertexPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  (GLint)  offset )

     * */
    private static native void nGLVertexPointer(int size, int type, int stride, int offset);/*
         glVertexPointer((GLint)  size,  (GLenum)  type, (GLsizei)  stride,  reinterpret_cast<GLvoid *>(offset));
    */
    
    
    
}
