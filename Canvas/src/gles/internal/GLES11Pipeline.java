/*

**    Place holder for disclaimer.
*/

package gles.internal;

public class GLES11Pipeline 
	extends GLES10Pipeline 
	implements Pipeline {

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
	public  Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES11Pipeline();
		}        
        return instance;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11._nativeClassInit();
     * 
     *  C function void glBindBuffer ( GLenum target, GLuint buffer )

     * */
    public void GLES11ClassInit() {
        GLES11Pipeline.nGLES11ClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11._nativeClassInit();
     * 
     *  C function void glBindBuffer ( GLenum target, GLuint buffer )

     * */
    private static native void nGLES11ClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer ( GLenum target, GLuint buffer )

     * */
    public void glBindBuffer(int target, int buffer) {
        GLES11Pipeline.nGLBindBuffer(target, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer ( GLenum target, GLuint buffer )

     * */
    private static native void nGLBindBuffer(int target, int buffer);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData ( GLenum target, GLsizeiptr size, const GLvoid *data, GLenum usage )

     * */
    public void glBufferData(int target, int size, java.nio.Buffer data, int usage) {
        GLES11Pipeline.nGLBufferData(target, size, data, usage);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData ( GLenum target, GLsizeiptr size, const GLvoid *data, GLenum usage )

     * */
    private static native void nGLBufferData(int target, int size, java.nio.Buffer data, int usage);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData ( GLenum target, GLintptr offset, GLsizeiptr size, const GLvoid *data )

     * */
    public void glBufferSubData(int target, int offset, int size, java.nio.Buffer data) {
        GLES11Pipeline.nGLBufferSubData(target, offset, size, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData ( GLenum target, GLintptr offset, GLsizeiptr size, const GLvoid *data )

     * */
    private static native void nGLBufferSubData(int target, int offset, int size, java.nio.Buffer data);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glClipPlanef([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanef ( GLenum plane, const GLfloat *equation )

     * */
    public void glClipPlanef(int plane, float[] equation, int offset) {
        GLES11Pipeline.nGLClipPlanef(plane, equation, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glClipPlanef([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanef ( GLenum plane, const GLfloat *equation )

     * */
    private static native void nGLClipPlanef(int plane, float[] equation, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glClipPlanef([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanef ( GLenum plane, const GLfloat *equation )

     * */
    public void glClipPlanef(int plane, java.nio.FloatBuffer equation) {
        GLES11Pipeline.nGLClipPlanef(plane, equation);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glClipPlanef([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanef ( GLenum plane, const GLfloat *equation )

     * */
    private static native void nGLClipPlanef(int plane, java.nio.FloatBuffer equation);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glClipPlanex([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanex ( GLenum plane, const GLfixed *equation )

     * */
    public void glClipPlanex(int plane, int[] equation, int offset) {
        GLES11Pipeline.nGLClipPlanex(plane, equation, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glClipPlanex([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanex ( GLenum plane, const GLfixed *equation )

     * */
    private static native void nGLClipPlanex(int plane, int[] equation, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glClipPlanex([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanex ( GLenum plane, const GLfixed *equation )

     * */
    public void glClipPlanex(int plane, java.nio.IntBuffer equation) {
        GLES11Pipeline.nGLClipPlanex(plane, equation);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glClipPlanex([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanex ( GLenum plane, const GLfixed *equation )

     * */
    private static native void nGLClipPlanex(int plane, java.nio.IntBuffer equation);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glColor4ub([byte red, byte green, byte blue, byte alpha]);
     * 
     *  C function void glColor4ub ( GLubyte red, GLubyte green, GLubyte blue, GLubyte alpha )

     * */
    public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        GLES11Pipeline.nGLColor4ub(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glColor4ub([byte red, byte green, byte blue, byte alpha]);
     * 
     *  C function void glColor4ub ( GLubyte red, GLubyte green, GLubyte blue, GLubyte alpha )

     * */
    private static native void nGLColor4ub(byte red, byte green, byte blue, byte alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glColorPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glColorPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    public void glColorPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLColorPointer(size, type, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glColorPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glColorPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    private static native void nGLColorPointer(int size, int type, int stride, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    public void glDeleteBuffers(int n, int[] buffers, int offset) {
        GLES11Pipeline.nGLDeleteBuffers(n, buffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, int[] buffers, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    public void glDeleteBuffers(int n, java.nio.IntBuffer buffers) {
        GLES11Pipeline.nGLDeleteBuffers(n, buffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    private static native void nGLDeleteBuffers(int n, java.nio.IntBuffer buffers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, GLint offset )

     * */
    public void glDrawElements(int mode, int count, int type, int offset) {
        GLES11Pipeline.nGLDrawElements(mode, count, type, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, GLint offset )

     * */
    private static native void nGLDrawElements(int mode, int count, int type, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    public void glGenBuffers(int n, int[] buffers, int offset) {
        GLES11Pipeline.nGLGenBuffers(n, buffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    private static native void nGLGenBuffers(int n, int[] buffers, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    public void glGenBuffers(int n, java.nio.IntBuffer buffers) {
        GLES11Pipeline.nGLGenBuffers(n, buffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    private static native void nGLGenBuffers(int n, java.nio.IntBuffer buffers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    public void glGetBooleanv(int pname, boolean[] params, int offset) {
        GLES11Pipeline.nGLGetBooleanv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    private static native void nGLGetBooleanv(int pname, boolean[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    public void glGetBooleanv(int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetBooleanv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    private static native void nGLGetBooleanv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetBufferParameteriv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetBufferParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetBufferParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetClipPlanef([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanef ( GLenum pname, GLfloat *eqn )

     * */
    public void glGetClipPlanef(int pname, float[] eqn, int offset) {
        GLES11Pipeline.nGLGetClipPlanef(pname, eqn, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetClipPlanef([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanef ( GLenum pname, GLfloat *eqn )

     * */
    private static native void nGLGetClipPlanef(int pname, float[] eqn, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetClipPlanef([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanef ( GLenum pname, GLfloat *eqn )

     * */
    public void glGetClipPlanef(int pname, java.nio.FloatBuffer eqn) {
        GLES11Pipeline.nGLGetClipPlanef(pname, eqn);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetClipPlanef([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanef ( GLenum pname, GLfloat *eqn )

     * */
    private static native void nGLGetClipPlanef(int pname, java.nio.FloatBuffer eqn);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetClipPlanex([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanex ( GLenum pname, GLfixed *eqn )

     * */
    public void glGetClipPlanex(int pname, int[] eqn, int offset) {
        GLES11Pipeline.nGLGetClipPlanex(pname, eqn, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetClipPlanex([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanex ( GLenum pname, GLfixed *eqn )

     * */
    private static native void nGLGetClipPlanex(int pname, int[] eqn, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetClipPlanex([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanex ( GLenum pname, GLfixed *eqn )

     * */
    public void glGetClipPlanex(int pname, java.nio.IntBuffer eqn) {
        GLES11Pipeline.nGLGetClipPlanex(pname, eqn);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetClipPlanex([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanex ( GLenum pname, GLfixed *eqn )

     * */
    private static native void nGLGetClipPlanex(int pname, java.nio.IntBuffer eqn);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetFixedv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedv ( GLenum pname, GLfixed *params )

     * */
    public void glGetFixedv(int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetFixedv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetFixedv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedv ( GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetFixedv(int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetFixedv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedv ( GLenum pname, GLfixed *params )

     * */
    public void glGetFixedv(int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetFixedv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetFixedv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedv ( GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetFixedv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    public void glGetFloatv(int pname, float[] params, int offset) {
        GLES11Pipeline.nGLGetFloatv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetFloatv(int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    public void glGetFloatv(int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLGetFloatv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetFloatv(int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glGetLightfv ( GLenum light, GLenum pname, GLfloat *params )

     * */
    public void glGetLightfv(int light, int pname, float[] params, int offset) {
        GLES11Pipeline.nGLGetLightfv(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glGetLightfv ( GLenum light, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetLightfv(int light, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetLightfv ( GLenum light, GLenum pname, GLfloat *params )

     * */
    public void glGetLightfv(int light, int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLGetLightfv(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetLightfv ( GLenum light, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetLightfv(int light, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxv ( GLenum light, GLenum pname, GLfixed *params )

     * */
    public void glGetLightxv(int light, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetLightxv(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxv ( GLenum light, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetLightxv(int light, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxv ( GLenum light, GLenum pname, GLfixed *params )

     * */
    public void glGetLightxv(int light, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetLightxv(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxv ( GLenum light, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetLightxv(int light, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glGetMaterialfv ( GLenum face, GLenum pname, GLfloat *params )

     * */
    public void glGetMaterialfv(int face, int pname, float[] params, int offset) {
        GLES11Pipeline.nGLGetMaterialfv(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glGetMaterialfv ( GLenum face, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetMaterialfv(int face, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetMaterialfv ( GLenum face, GLenum pname, GLfloat *params )

     * */
    public void glGetMaterialfv(int face, int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLGetMaterialfv(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetMaterialfv ( GLenum face, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetMaterialfv(int face, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxv ( GLenum face, GLenum pname, GLfixed *params )

     * */
    public void glGetMaterialxv(int face, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetMaterialxv(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxv ( GLenum face, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetMaterialxv(int face, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxv ( GLenum face, GLenum pname, GLfixed *params )

     * */
    public void glGetMaterialxv(int face, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetMaterialxv(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxv ( GLenum face, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetMaterialxv(int face, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnvfv([int env, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexEnvfv ( GLenum env, GLenum pname, GLfloat *params )

     * */
    public void glGetTexEnvfv(int env, int pname, float[] params, int offset) {
        GLES11Pipeline.nGLGetTexEnvfv(env, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnvfv([int env, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexEnvfv ( GLenum env, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexEnvfv(int env, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnvfv([int env, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexEnvfv ( GLenum env, GLenum pname, GLfloat *params )

     * */
    public void glGetTexEnvfv(int env, int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLGetTexEnvfv(env, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnvfv([int env, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexEnvfv ( GLenum env, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexEnvfv(int env, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnviv([int env, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnviv ( GLenum env, GLenum pname, GLint *params )

     * */
    public void glGetTexEnviv(int env, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetTexEnviv(env, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnviv([int env, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnviv ( GLenum env, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexEnviv(int env, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnviv([int env, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnviv ( GLenum env, GLenum pname, GLint *params )

     * */
    public void glGetTexEnviv(int env, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetTexEnviv(env, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnviv([int env, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnviv ( GLenum env, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexEnviv(int env, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnvxv([int env, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxv ( GLenum env, GLenum pname, GLfixed *params )

     * */
    public void glGetTexEnvxv(int env, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetTexEnvxv(env, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnvxv([int env, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxv ( GLenum env, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetTexEnvxv(int env, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexEnvxv([int env, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxv ( GLenum env, GLenum pname, GLfixed *params )

     * */
    public void glGetTexEnvxv(int env, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetTexEnvxv(env, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexEnvxv([int env, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxv ( GLenum env, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetTexEnvxv(int env, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    public void glGetTexParameterfv(int target, int pname, float[] params, int offset) {
        GLES11Pipeline.nGLGetTexParameterfv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexParameterfv(int target, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    public void glGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLGetTexParameterfv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    private static native void nGLGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetTexParameteriv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetTexParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public void glGetTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetTexParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    private static native void nGLGetTexParameteriv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxv ( GLenum target, GLenum pname, GLfixed *params )

     * */
    public void glGetTexParameterxv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLGetTexParameterxv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxv ( GLenum target, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetTexParameterxv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glGetTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxv ( GLenum target, GLenum pname, GLfixed *params )

     * */
    public void glGetTexParameterxv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLGetTexParameterxv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glGetTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxv ( GLenum target, GLenum pname, GLfixed *params )

     * */
    private static native void nGLGetTexParameterxv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glIsBuffer([int buffer]);
     * 
     *  C function GLboolean glIsBuffer ( GLuint buffer )

     * */
    public boolean glIsBuffer(int buffer) {
       return GLES11Pipeline.nGLIsBuffer(buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glIsBuffer([int buffer]);
     * 
     *  C function GLboolean glIsBuffer ( GLuint buffer )

     * */
    private static native boolean nGLIsBuffer(int buffer);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glIsEnabled([int cap]);
     * 
     *  C function GLboolean glIsEnabled ( GLenum cap )

     * */
    public boolean glIsEnabled(int cap) {
       return  GLES11Pipeline.nGLIsEnabled(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glIsEnabled([int cap]);
     * 
     *  C function GLboolean glIsEnabled ( GLenum cap )

     * */
    private static native boolean nGLIsEnabled(int cap);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glIsTexture([int texture]);
     * 
     *  C function GLboolean glIsTexture ( GLuint texture )

     * */
    public boolean glIsTexture(int texture) {
       return GLES11Pipeline.nGLIsTexture(texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glIsTexture([int texture]);
     * 
     *  C function GLboolean glIsTexture ( GLuint texture )

     * */
    private static native boolean nGLIsTexture(int texture);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glNormalPointer([int type, int stride, int offset]);
     * 
     *  C function void glNormalPointer ( GLenum type, GLsizei stride, GLint offset )

     * */
    public void glNormalPointer(int type, int stride, int offset) {
        GLES11Pipeline.nGLNormalPointer(type, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glNormalPointer([int type, int stride, int offset]);
     * 
     *  C function void glNormalPointer ( GLenum type, GLsizei stride, GLint offset )

     * */
    private static native void nGLNormalPointer(int type, int stride, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterf([int pname, float param]);
     * 
     *  C function void glPointParameterf ( GLenum pname, GLfloat param )

     * */
    public void glPointParameterf(int pname, float param) {
        GLES11Pipeline.nGLPointParameterf(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterf([int pname, float param]);
     * 
     *  C function void glPointParameterf ( GLenum pname, GLfloat param )

     * */
    private static native void nGLPointParameterf(int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterfv([int pname, float[] params, int offset]);
     * 
     *  C function void glPointParameterfv ( GLenum pname, const GLfloat *params )

     * */
    public void glPointParameterfv(int pname, float[] params, int offset) {
        GLES11Pipeline.nGLPointParameterfv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterfv([int pname, float[] params, int offset]);
     * 
     *  C function void glPointParameterfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLPointParameterfv(int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glPointParameterfv ( GLenum pname, const GLfloat *params )

     * */
    public void glPointParameterfv(int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLPointParameterfv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glPointParameterfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLPointParameterfv(int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterx([int pname, int param]);
     * 
     *  C function void glPointParameterx ( GLenum pname, GLfixed param )

     * */
    public void glPointParameterx(int pname, int param) {
        GLES11Pipeline.nGLPointParameterx(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterx([int pname, int param]);
     * 
     *  C function void glPointParameterx ( GLenum pname, GLfixed param )

     * */
    private static native void nGLPointParameterx(int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterxv([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxv ( GLenum pname, const GLfixed *params )

     * */
    public void glPointParameterxv(int pname, int[] params, int offset) {
        GLES11Pipeline.nGLPointParameterxv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterxv([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLPointParameterxv(int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointParameterxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxv ( GLenum pname, const GLfixed *params )

     * */
    public void glPointParameterxv(int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLPointParameterxv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointParameterxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLPointParameterxv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glPointSizePointerOESBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glPointSizePointerOES ( GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    public void glPointSizePointerOESBounds(int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES11Pipeline.nGLPointSizePointerOESBounds(type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glPointSizePointerOESBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glPointSizePointerOES ( GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static native void nGLPointSizePointerOESBounds(int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexCoordPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glTexCoordPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    public void glTexCoordPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLTexCoordPointer(size, type, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexCoordPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glTexCoordPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    private static native void nGLTexCoordPointer(int size, int type, int stride, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexEnvi([int target, int pname, int param]);
     * 
     *  C function void glTexEnvi ( GLenum target, GLenum pname, GLint param )

     * */
    public void glTexEnvi(int target, int pname, int param) {
        GLES11Pipeline.nGLTexEnvi(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexEnvi([int target, int pname, int param]);
     * 
     *  C function void glTexEnvi ( GLenum target, GLenum pname, GLint param )

     * */
    private static native void nGLTexEnvi(int target, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexEnviv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnviv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexEnviv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLTexEnviv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexEnviv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnviv ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexEnviv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexEnviv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnviv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexEnviv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLTexEnviv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexEnviv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnviv ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexEnviv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public void glTexParameterfv(int target, int pname, float[] params, int offset) {
        GLES11Pipeline.nGLTexParameterfv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLTexParameterfv(int target, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public void glTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        GLES11Pipeline.nGLTexParameterfv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLTexParameterfv(int target, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri ( GLenum target, GLenum pname, GLint param )

     * */
    public void glTexParameteri(int target, int pname, int param) {
        GLES11Pipeline.nGLTexParameteri(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri ( GLenum target, GLenum pname, GLint param )

     * */
    private static native void nGLTexParameteri(int target, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexParameteriv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLTexParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public void glTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLTexParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    private static native void nGLTexParameteriv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public void glTexParameterxv(int target, int pname, int[] params, int offset) {
        GLES11Pipeline.nGLTexParameterxv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameterxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLTexParameterxv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public void glTexParameterxv(int target, int pname, java.nio.IntBuffer params) {
        GLES11Pipeline.nGLTexParameterxv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glTexParameterxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLTexParameterxv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11.glVertexPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    public void glVertexPointer(int size, int type, int stride, int offset) {
        GLES11Pipeline.nGLVertexPointer(size, type, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES11.glVertexPointer([int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexPointer ( GLint size, GLenum type, GLsizei stride, GLint offset )

     * */
    private static native void nGLVertexPointer(int size, int type, int stride, int offset);
}
