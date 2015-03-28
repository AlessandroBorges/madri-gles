/*

**    Place holder for disclaimer.
*/

package gles.internal;

public class GLES10Pipeline implements Pipeline {
	
	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	protected GLES10Pipeline(){}

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
			instance = new GLES10Pipeline();
		}        
        return instance;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10._nativeClassInit();
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    public void GLES10ClassInit() {
        GLES10Pipeline.nGLES10ClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10._nativeClassInit();
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    private static native void nGLES10ClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    public void glActiveTexture(int texture) {
        GLES10Pipeline.nGLActiveTexture(texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    private static native void nGLActiveTexture(int texture);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glAlphaFunc([int func, float ref]);
     * 
     *  C function void glAlphaFunc ( GLenum func, GLclampf ref )

     * */
    public void glAlphaFunc(int func, float ref) {
        GLES10Pipeline.nGLAlphaFunc(func, ref);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glAlphaFunc([int func, float ref]);
     * 
     *  C function void glAlphaFunc ( GLenum func, GLclampf ref )

     * */
    private static native void nGLAlphaFunc(int func, float ref);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glAlphaFuncx([int func, int ref]);
     * 
     *  C function void glAlphaFuncx ( GLenum func, GLclampx ref )

     * */
    public void glAlphaFuncx(int func, int ref) {
        GLES10Pipeline.nGLAlphaFuncx(func, ref);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glAlphaFuncx([int func, int ref]);
     * 
     *  C function void glAlphaFuncx ( GLenum func, GLclampx ref )

     * */
    private static native void nGLAlphaFuncx(int func, int ref);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture ( GLenum target, GLuint texture )

     * */
    public void glBindTexture(int target, int texture) {
        GLES10Pipeline.nGLBindTexture(target, texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture ( GLenum target, GLuint texture )

     * */
    private static native void nGLBindTexture(int target, int texture);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc ( GLenum sfactor, GLenum dfactor )

     * */
    public void glBlendFunc(int sfactor, int dfactor) {
        GLES10Pipeline.nGLBlendFunc(sfactor, dfactor);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc ( GLenum sfactor, GLenum dfactor )

     * */
    private static native void nGLBlendFunc(int sfactor, int dfactor);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClear([int mask]);
     * 
     *  C function void glClear ( GLbitfield mask )

     * */
    public void glClear(int mask) {
        GLES10Pipeline.nGLClear(mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClear([int mask]);
     * 
     *  C function void glClear ( GLbitfield mask )

     * */
    private static native void nGLClear(int mask);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public void glClearColor(float red, float green, float blue, float alpha) {
        GLES10Pipeline.nGLClearColor(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    private static native void nGLClearColor(float red, float green, float blue, float alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClearColorx([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorx ( GLclampx red, GLclampx green, GLclampx blue, GLclampx alpha )

     * */
    public void glClearColorx(int red, int green, int blue, int alpha) {
        GLES10Pipeline.nGLClearColorx(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClearColorx([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorx ( GLclampx red, GLclampx green, GLclampx blue, GLclampx alpha )

     * */
    private static native void nGLClearColorx(int red, int green, int blue, int alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf ( GLclampf depth )

     * */
    public void glClearDepthf(float depth) {
        GLES10Pipeline.nGLClearDepthf(depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf ( GLclampf depth )

     * */
    private static native void nGLClearDepthf(float depth);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClearDepthx([int depth]);
     * 
     *  C function void glClearDepthx ( GLclampx depth )

     * */
    public void glClearDepthx(int depth) {
        GLES10Pipeline.nGLClearDepthx(depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClearDepthx([int depth]);
     * 
     *  C function void glClearDepthx ( GLclampx depth )

     * */
    private static native void nGLClearDepthx(int depth);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClearStencil([int s]);
     * 
     *  C function void glClearStencil ( GLint s )

     * */
    public void glClearStencil(int s) {
        GLES10Pipeline.nGLClearStencil(s);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClearStencil([int s]);
     * 
     *  C function void glClearStencil ( GLint s )

     * */
    private static native void nGLClearStencil(int s);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glClientActiveTexture([int texture]);
     * 
     *  C function void glClientActiveTexture ( GLenum texture )

     * */
    public void glClientActiveTexture(int texture) {
        GLES10Pipeline.nGLClientActiveTexture(texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glClientActiveTexture([int texture]);
     * 
     *  C function void glClientActiveTexture ( GLenum texture )

     * */
    private static native void nGLClientActiveTexture(int texture);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glColor4f([float red, float green, float blue, float alpha]);
     * 
     *  C function void glColor4f ( GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha )

     * */
    public void glColor4f(float red, float green, float blue, float alpha) {
        GLES10Pipeline.nGLColor4f(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glColor4f([float red, float green, float blue, float alpha]);
     * 
     *  C function void glColor4f ( GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha )

     * */
    private static native void nGLColor4f(float red, float green, float blue, float alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glColor4x([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4x ( GLfixed red, GLfixed green, GLfixed blue, GLfixed alpha )

     * */
    public void glColor4x(int red, int green, int blue, int alpha) {
        GLES10Pipeline.nGLColor4x(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glColor4x([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4x ( GLfixed red, GLfixed green, GLfixed blue, GLfixed alpha )

     * */
    private static native void nGLColor4x(int red, int green, int blue, int alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask ( GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha )

     * */
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GLES10Pipeline.nGLColorMask(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask ( GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha )

     * */
    private static native void nGLColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glColorPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glColorPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    public void glColorPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES10Pipeline.nGLColorPointerBounds(size, type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glColorPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glColorPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static native void nGLColorPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, const GLvoid *data )

     * */
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data) {
        GLES10Pipeline.nGLCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, const GLvoid *data )

     * */
    private static native void nGLCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glCompressedTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, const GLvoid *data )

     * */
    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data) {
        GLES10Pipeline.nGLCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glCompressedTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, const GLvoid *data )

     * */
    private static native void nGLCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border )

     * */
    public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        GLES10Pipeline.nGLCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border )

     * */
    private static native void nGLCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GLES10Pipeline.nGLCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    private static native void nGLCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glCullFace([int mode]);
     * 
     *  C function void glCullFace ( GLenum mode )

     * */
    public void glCullFace(int mode) {
        GLES10Pipeline.nGLCullFace(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glCullFace([int mode]);
     * 
     *  C function void glCullFace ( GLenum mode )

     * */
    private static native void nGLCullFace(int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public void glDeleteTextures(int n, int[] textures, int offset) {
        GLES10Pipeline.nGLDeleteTextures(n, textures, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    private static native void nGLDeleteTextures(int n, int[] textures, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public void glDeleteTextures(int n, java.nio.IntBuffer textures) {
        GLES10Pipeline.nGLDeleteTextures(n, textures);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    private static native void nGLDeleteTextures(int n, java.nio.IntBuffer textures);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc ( GLenum func )

     * */
    public void glDepthFunc(int func) {
        GLES10Pipeline.nGLDepthFunc(func);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc ( GLenum func )

     * */
    private static native void nGLDepthFunc(int func);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask ( GLboolean flag )

     * */
    public void glDepthMask(boolean flag) {
        GLES10Pipeline.nGLDepthMask(flag);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask ( GLboolean flag )

     * */
    private static native void nGLDepthMask(boolean flag);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef ( GLclampf zNear, GLclampf zFar )

     * */
    public void glDepthRangef(float zNear, float zFar) {
        GLES10Pipeline.nGLDepthRangef(zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef ( GLclampf zNear, GLclampf zFar )

     * */
    private static native void nGLDepthRangef(float zNear, float zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDepthRangex([int zNear, int zFar]);
     * 
     *  C function void glDepthRangex ( GLclampx zNear, GLclampx zFar )

     * */
    public void glDepthRangex(int zNear, int zFar) {
        GLES10Pipeline.nGLDepthRangex(zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDepthRangex([int zNear, int zFar]);
     * 
     *  C function void glDepthRangex ( GLclampx zNear, GLclampx zFar )

     * */
    private static native void nGLDepthRangex(int zNear, int zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDisable([int cap]);
     * 
     *  C function void glDisable ( GLenum cap )

     * */
    public void glDisable(int cap) {
        GLES10Pipeline.nGLDisable(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDisable([int cap]);
     * 
     *  C function void glDisable ( GLenum cap )

     * */
    private static native void nGLDisable(int cap);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDisableClientState([int array]);
     * 
     *  C function void glDisableClientState ( GLenum array )

     * */
    public void glDisableClientState(int array) {
        GLES10Pipeline.nGLDisableClientState(array);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDisableClientState([int array]);
     * 
     *  C function void glDisableClientState ( GLenum array )

     * */
    private static native void nGLDisableClientState(int array);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays ( GLenum mode, GLint first, GLsizei count )

     * */
    public void glDrawArrays(int mode, int first, int count) {
        GLES10Pipeline.nGLDrawArrays(mode, first, count);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays ( GLenum mode, GLint first, GLsizei count )

     * */
    private static native void nGLDrawArrays(int mode, int first, int count);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, const GLvoid *indices )

     * */
    public void glDrawElements(int mode, int count, int type, java.nio.Buffer indices) {
        GLES10Pipeline.nGLDrawElements(mode, count, type, indices);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, const GLvoid *indices )

     * */
    private static native void nGLDrawElements(int mode, int count, int type, java.nio.Buffer indices);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glEnable([int cap]);
     * 
     *  C function void glEnable ( GLenum cap )

     * */
    public void glEnable(int cap) {
        GLES10Pipeline.nGLEnable(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glEnable([int cap]);
     * 
     *  C function void glEnable ( GLenum cap )

     * */
    private static native void nGLEnable(int cap);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glEnableClientState([int array]);
     * 
     *  C function void glEnableClientState ( GLenum array )

     * */
    public void glEnableClientState(int array) {
        GLES10Pipeline.nGLEnableClientState(array);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glEnableClientState([int array]);
     * 
     *  C function void glEnableClientState ( GLenum array )

     * */
    private static native void nGLEnableClientState(int array);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFinish();
     * 
     *  C function void glFinish ( void )

     * */
    public void glFinish() {
        GLES10Pipeline.nGLFinish();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFinish();
     * 
     *  C function void glFinish ( void )

     * */
    private static native void nGLFinish();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFlush();
     * 
     *  C function void glFlush ( void )

     * */
    public void glFlush() {
        GLES10Pipeline.nGLFlush();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFlush();
     * 
     *  C function void glFlush ( void )

     * */
    private static native void nGLFlush();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogf([int pname, float param]);
     * 
     *  C function void glFogf ( GLenum pname, GLfloat param )

     * */
    public void glFogf(int pname, float param) {
        GLES10Pipeline.nGLFogf(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogf([int pname, float param]);
     * 
     *  C function void glFogf ( GLenum pname, GLfloat param )

     * */
    private static native void nGLFogf(int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogfv([int pname, float[] params, int offset]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    public void glFogfv(int pname, float[] params, int offset) {
        GLES10Pipeline.nGLFogfv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogfv([int pname, float[] params, int offset]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLFogfv(int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    public void glFogfv(int pname, java.nio.FloatBuffer params) {
        GLES10Pipeline.nGLFogfv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLFogfv(int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogx([int pname, int param]);
     * 
     *  C function void glFogx ( GLenum pname, GLfixed param )

     * */
    public void glFogx(int pname, int param) {
        GLES10Pipeline.nGLFogx(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogx([int pname, int param]);
     * 
     *  C function void glFogx ( GLenum pname, GLfixed param )

     * */
    private static native void nGLFogx(int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogxv([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    public void glFogxv(int pname, int[] params, int offset) {
        GLES10Pipeline.nGLFogxv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogxv([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLFogxv(int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFogxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    public void glFogxv(int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLFogxv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFogxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLFogxv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace ( GLenum mode )

     * */
    public void glFrontFace(int mode) {
        GLES10Pipeline.nGLFrontFace(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace ( GLenum mode )

     * */
    private static native void nGLFrontFace(int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFrustumf([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumf ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar) {
        GLES10Pipeline.nGLFrustumf(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFrustumf([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumf ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    private static native void nGLFrustumf(float left, float right, float bottom, float top, float zNear, float zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glFrustumx([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumx ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public void glFrustumx(int left, int right, int bottom, int top, int zNear, int zFar) {
        GLES10Pipeline.nGLFrustumx(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glFrustumx([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumx ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    private static native void nGLFrustumx(int left, int right, int bottom, int top, int zNear, int zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public void glGenTextures(int n, int[] textures, int offset) {
        GLES10Pipeline.nGLGenTextures(n, textures, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    private static native void nGLGenTextures(int n, int[] textures, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public void glGenTextures(int n, java.nio.IntBuffer textures) {
        GLES10Pipeline.nGLGenTextures(n, textures);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    private static native void nGLGenTextures(int n, java.nio.IntBuffer textures);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGetError();
     * 
     *  C function GLenum glGetError ( void )

     * */
    public int glGetError() {
       return GLES10Pipeline.nGLGetError();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGetError();
     * 
     *  C function GLenum glGetError ( void )

     * */
    private static native int nGLGetError();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public void glGetIntegerv(int pname, int[] params, int offset) {
        GLES10Pipeline.nGLGetIntegerv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    private static native void nGLGetIntegerv(int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public void glGetIntegerv(int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLGetIntegerv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    private static native void nGLGetIntegerv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString ( GLenum name )

     * */
    public String glGetString(int name) {
        return GLES10Pipeline.nGLGetString(name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString ( GLenum name )

     * */
    private static native String nGLGetString(int name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glHint([int target, int mode]);
     * 
     *  C function void glHint ( GLenum target, GLenum mode )

     * */
    public void glHint(int target, int mode) {
        GLES10Pipeline.nGLHint(target, mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glHint([int target, int mode]);
     * 
     *  C function void glHint ( GLenum target, GLenum mode )

     * */
    private static native void nGLHint(int target, int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelf([int pname, float param]);
     * 
     *  C function void glLightModelf ( GLenum pname, GLfloat param )

     * */
    public void glLightModelf(int pname, float param) {
        GLES10Pipeline.nGLLightModelf(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelf([int pname, float param]);
     * 
     *  C function void glLightModelf ( GLenum pname, GLfloat param )

     * */
    private static native void nGLLightModelf(int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelfv([int pname, float[] params, int offset]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    public void glLightModelfv(int pname, float[] params, int offset) {
        GLES10Pipeline.nGLLightModelfv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelfv([int pname, float[] params, int offset]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLLightModelfv(int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    public void glLightModelfv(int pname, java.nio.FloatBuffer params) {
        GLES10Pipeline.nGLLightModelfv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    private static native void nGLLightModelfv(int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelx([int pname, int param]);
     * 
     *  C function void glLightModelx ( GLenum pname, GLfixed param )

     * */
    public void glLightModelx(int pname, int param) {
        GLES10Pipeline.nGLLightModelx(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelx([int pname, int param]);
     * 
     *  C function void glLightModelx ( GLenum pname, GLfixed param )

     * */
    private static native void nGLLightModelx(int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelxv([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    public void glLightModelxv(int pname, int[] params, int offset) {
        GLES10Pipeline.nGLLightModelxv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelxv([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLLightModelxv(int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightModelxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    public void glLightModelxv(int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLLightModelxv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightModelxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    private static native void nGLLightModelxv(int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightf([int light, int pname, float param]);
     * 
     *  C function void glLightf ( GLenum light, GLenum pname, GLfloat param )

     * */
    public void glLightf(int light, int pname, float param) {
        GLES10Pipeline.nGLLightf(light, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightf([int light, int pname, float param]);
     * 
     *  C function void glLightf ( GLenum light, GLenum pname, GLfloat param )

     * */
    private static native void nGLLightf(int light, int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    public void glLightfv(int light, int pname, float[] params, int offset) {
        GLES10Pipeline.nGLLightfv(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLLightfv(int light, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    public void glLightfv(int light, int pname, java.nio.FloatBuffer params) {
        GLES10Pipeline.nGLLightfv(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLLightfv(int light, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightx([int light, int pname, int param]);
     * 
     *  C function void glLightx ( GLenum light, GLenum pname, GLfixed param )

     * */
    public void glLightx(int light, int pname, int param) {
        GLES10Pipeline.nGLLightx(light, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightx([int light, int pname, int param]);
     * 
     *  C function void glLightx ( GLenum light, GLenum pname, GLfixed param )

     * */
    private static native void nGLLightx(int light, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public void glLightxv(int light, int pname, int[] params, int offset) {
        GLES10Pipeline.nGLLightxv(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLLightxv(int light, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public void glLightxv(int light, int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLLightxv(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLLightxv(int light, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLineWidth([float width]);
     * 
     *  C function void glLineWidth ( GLfloat width )

     * */
    public void glLineWidth(float width) {
        GLES10Pipeline.nGLLineWidth(width);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLineWidth([float width]);
     * 
     *  C function void glLineWidth ( GLfloat width )

     * */
    private static native void nGLLineWidth(float width);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLineWidthx([int width]);
     * 
     *  C function void glLineWidthx ( GLfixed width )

     * */
    public void glLineWidthx(int width) {
        GLES10Pipeline.nGLLineWidthx(width);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLineWidthx([int width]);
     * 
     *  C function void glLineWidthx ( GLfixed width )

     * */
    private static native void nGLLineWidthx(int width);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLoadIdentity();
     * 
     *  C function void glLoadIdentity ( void )

     * */
    public void glLoadIdentity() {
        GLES10Pipeline.nGLLoadIdentity();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLoadIdentity();
     * 
     *  C function void glLoadIdentity ( void )

     * */
    private static native void nGLLoadIdentity();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLoadMatrixf([float[] m, int offset]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    public void glLoadMatrixf(float[] m, int offset) {
        GLES10Pipeline.nGLLoadMatrixf(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLoadMatrixf([float[] m, int offset]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    private static native void nGLLoadMatrixf(float[] m, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLoadMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    public void glLoadMatrixf(java.nio.FloatBuffer m) {
        GLES10Pipeline.nGLLoadMatrixf(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLoadMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    private static native void nGLLoadMatrixf(java.nio.FloatBuffer m);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLoadMatrixx([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    public void glLoadMatrixx(int[] m, int offset) {
        GLES10Pipeline.nGLLoadMatrixx(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLoadMatrixx([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    private static native void nGLLoadMatrixx(int[] m, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLoadMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    public void glLoadMatrixx(java.nio.IntBuffer m) {
        GLES10Pipeline.nGLLoadMatrixx(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLoadMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    private static native void nGLLoadMatrixx(java.nio.IntBuffer m);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glLogicOp([int opcode]);
     * 
     *  C function void glLogicOp ( GLenum opcode )

     * */
    public void glLogicOp(int opcode) {
        GLES10Pipeline.nGLLogicOp(opcode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glLogicOp([int opcode]);
     * 
     *  C function void glLogicOp ( GLenum opcode )

     * */
    private static native void nGLLogicOp(int opcode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialf([int face, int pname, float param]);
     * 
     *  C function void glMaterialf ( GLenum face, GLenum pname, GLfloat param )

     * */
    public void glMaterialf(int face, int pname, float param) {
        GLES10Pipeline.nGLMaterialf(face, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialf([int face, int pname, float param]);
     * 
     *  C function void glMaterialf ( GLenum face, GLenum pname, GLfloat param )

     * */
    private static native void nGLMaterialf(int face, int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    public void glMaterialfv(int face, int pname, float[] params, int offset) {
        GLES10Pipeline.nGLMaterialfv(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLMaterialfv(int face, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    public void glMaterialfv(int face, int pname, java.nio.FloatBuffer params) {
        GLES10Pipeline.nGLMaterialfv(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLMaterialfv(int face, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialx([int face, int pname, int param]);
     * 
     *  C function void glMaterialx ( GLenum face, GLenum pname, GLfixed param )

     * */
    public void glMaterialx(int face, int pname, int param) {
        GLES10Pipeline.nGLMaterialx(face, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialx([int face, int pname, int param]);
     * 
     *  C function void glMaterialx ( GLenum face, GLenum pname, GLfixed param )

     * */
    private static native void nGLMaterialx(int face, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public void glMaterialxv(int face, int pname, int[] params, int offset) {
        GLES10Pipeline.nGLMaterialxv(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLMaterialxv(int face, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public void glMaterialxv(int face, int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLMaterialxv(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLMaterialxv(int face, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMatrixMode([int mode]);
     * 
     *  C function void glMatrixMode ( GLenum mode )

     * */
    public void glMatrixMode(int mode) {
        GLES10Pipeline.nGLMatrixMode(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMatrixMode([int mode]);
     * 
     *  C function void glMatrixMode ( GLenum mode )

     * */
    private static native void nGLMatrixMode(int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultMatrixf([float[] m, int offset]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    public void glMultMatrixf(float[] m, int offset) {
        GLES10Pipeline.nGLMultMatrixf(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultMatrixf([float[] m, int offset]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    private static native void nGLMultMatrixf(float[] m, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    public void glMultMatrixf(java.nio.FloatBuffer m) {
        GLES10Pipeline.nGLMultMatrixf(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    private static native void nGLMultMatrixf(java.nio.FloatBuffer m);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultMatrixx([int[] m, int offset]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    public void glMultMatrixx(int[] m, int offset) {
        GLES10Pipeline.nGLMultMatrixx(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultMatrixx([int[] m, int offset]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    private static native void nGLMultMatrixx(int[] m, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    public void glMultMatrixx(java.nio.IntBuffer m) {
        GLES10Pipeline.nGLMultMatrixx(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    private static native void nGLMultMatrixx(java.nio.IntBuffer m);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultiTexCoord4f([int target, float s, float t, float r, float q]);
     * 
     *  C function void glMultiTexCoord4f ( GLenum target, GLfloat s, GLfloat t, GLfloat r, GLfloat q )

     * */
    public void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
        GLES10Pipeline.nGLMultiTexCoord4f(target, s, t, r, q);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultiTexCoord4f([int target, float s, float t, float r, float q]);
     * 
     *  C function void glMultiTexCoord4f ( GLenum target, GLfloat s, GLfloat t, GLfloat r, GLfloat q )

     * */
    private static native void nGLMultiTexCoord4f(int target, float s, float t, float r, float q);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glMultiTexCoord4x([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4x ( GLenum target, GLfixed s, GLfixed t, GLfixed r, GLfixed q )

     * */
    public void glMultiTexCoord4x(int target, int s, int t, int r, int q) {
        GLES10Pipeline.nGLMultiTexCoord4x(target, s, t, r, q);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glMultiTexCoord4x([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4x ( GLenum target, GLfixed s, GLfixed t, GLfixed r, GLfixed q )

     * */
    private static native void nGLMultiTexCoord4x(int target, int s, int t, int r, int q);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glNormal3f([float nx, float ny, float nz]);
     * 
     *  C function void glNormal3f ( GLfloat nx, GLfloat ny, GLfloat nz )

     * */
    public void glNormal3f(float nx, float ny, float nz) {
        GLES10Pipeline.nGLNormal3f(nx, ny, nz);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glNormal3f([float nx, float ny, float nz]);
     * 
     *  C function void glNormal3f ( GLfloat nx, GLfloat ny, GLfloat nz )

     * */
    private static native void nGLNormal3f(float nx, float ny, float nz);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glNormal3x([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3x ( GLfixed nx, GLfixed ny, GLfixed nz )

     * */
    public void glNormal3x(int nx, int ny, int nz) {
        GLES10Pipeline.nGLNormal3x(nx, ny, nz);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glNormal3x([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3x ( GLfixed nx, GLfixed ny, GLfixed nz )

     * */
    private static native void nGLNormal3x(int nx, int ny, int nz);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glNormalPointerBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glNormalPointer ( GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    public void glNormalPointerBounds(int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES10Pipeline.nGLNormalPointerBounds(type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glNormalPointerBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glNormalPointer ( GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static native void nGLNormalPointerBounds(int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glOrthof([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthof ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar) {
        GLES10Pipeline.nGLOrthof(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glOrthof([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthof ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    private static native void nGLOrthof(float left, float right, float bottom, float top, float zNear, float zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glOrthox([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glOrthox ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar) {
        GLES10Pipeline.nGLOrthox(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glOrthox([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glOrthox ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    private static native void nGLOrthox(int left, int right, int bottom, int top, int zNear, int zFar);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei ( GLenum pname, GLint param )

     * */
    public void glPixelStorei(int pname, int param) {
        GLES10Pipeline.nGLPixelStorei(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei ( GLenum pname, GLint param )

     * */
    private static native void nGLPixelStorei(int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPointSize([float size]);
     * 
     *  C function void glPointSize ( GLfloat size )

     * */
    public void glPointSize(float size) {
        GLES10Pipeline.nGLPointSize(size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPointSize([float size]);
     * 
     *  C function void glPointSize ( GLfloat size )

     * */
    private static native void nGLPointSize(float size);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPointSizex([int size]);
     * 
     *  C function void glPointSizex ( GLfixed size )

     * */
    public void glPointSizex(int size) {
        GLES10Pipeline.nGLPointSizex(size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPointSizex([int size]);
     * 
     *  C function void glPointSizex ( GLfixed size )

     * */
    private static native void nGLPointSizex(int size);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset ( GLfloat factor, GLfloat units )

     * */
    public void glPolygonOffset(float factor, float units) {
        GLES10Pipeline.nGLPolygonOffset(factor, units);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset ( GLfloat factor, GLfloat units )

     * */
    private static native void nGLPolygonOffset(float factor, float units);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPolygonOffsetx([int factor, int units]);
     * 
     *  C function void glPolygonOffsetx ( GLfixed factor, GLfixed units )

     * */
    public void glPolygonOffsetx(int factor, int units) {
        GLES10Pipeline.nGLPolygonOffsetx(factor, units);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPolygonOffsetx([int factor, int units]);
     * 
     *  C function void glPolygonOffsetx ( GLfixed factor, GLfixed units )

     * */
    private static native void nGLPolygonOffsetx(int factor, int units);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPopMatrix();
     * 
     *  C function void glPopMatrix ( void )

     * */
    public void glPopMatrix() {
        GLES10Pipeline.nGLPopMatrix();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPopMatrix();
     * 
     *  C function void glPopMatrix ( void )

     * */
    private static native void nGLPopMatrix();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glPushMatrix();
     * 
     *  C function void glPushMatrix ( void )

     * */
    public void glPushMatrix() {
        GLES10Pipeline.nGLPushMatrix();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glPushMatrix();
     * 
     *  C function void glPushMatrix ( void )

     * */
    private static native void nGLPushMatrix();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels ( GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLvoid *pixels )

     * */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels) {
        GLES10Pipeline.nGLReadPixels(x, y, width, height, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels ( GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLvoid *pixels )

     * */
    private static native void nGLReadPixels(int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glRotatef([float angle, float x, float y, float z]);
     * 
     *  C function void glRotatef ( GLfloat angle, GLfloat x, GLfloat y, GLfloat z )

     * */
    public void glRotatef(float angle, float x, float y, float z) {
        GLES10Pipeline.nGLRotatef(angle, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glRotatef([float angle, float x, float y, float z]);
     * 
     *  C function void glRotatef ( GLfloat angle, GLfloat x, GLfloat y, GLfloat z )

     * */
    private static native void nGLRotatef(float angle, float x, float y, float z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glRotatex([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatex ( GLfixed angle, GLfixed x, GLfixed y, GLfixed z )

     * */
    public void glRotatex(int angle, int x, int y, int z) {
        GLES10Pipeline.nGLRotatex(angle, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glRotatex([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatex ( GLfixed angle, GLfixed x, GLfixed y, GLfixed z )

     * */
    private static native void nGLRotatex(int angle, int x, int y, int z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage ( GLclampf value, GLboolean invert )

     * */
    public void glSampleCoverage(float value, boolean invert) {
        GLES10Pipeline.nGLSampleCoverage(value, invert);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage ( GLclampf value, GLboolean invert )

     * */
    private static native void nGLSampleCoverage(float value, boolean invert);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glSampleCoveragex([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragex ( GLclampx value, GLboolean invert )

     * */
    public void glSampleCoveragex(int value, boolean invert) {
        GLES10Pipeline.nGLSampleCoveragex(value, invert);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glSampleCoveragex([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragex ( GLclampx value, GLboolean invert )

     * */
    private static native void nGLSampleCoveragex(int value, boolean invert);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glScalef([float x, float y, float z]);
     * 
     *  C function void glScalef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    public void glScalef(float x, float y, float z) {
        GLES10Pipeline.nGLScalef(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glScalef([float x, float y, float z]);
     * 
     *  C function void glScalef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    private static native void nGLScalef(float x, float y, float z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glScalex([int x, int y, int z]);
     * 
     *  C function void glScalex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public void glScalex(int x, int y, int z) {
        GLES10Pipeline.nGLScalex(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glScalex([int x, int y, int z]);
     * 
     *  C function void glScalex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    private static native void nGLScalex(int x, int y, int z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public void glScissor(int x, int y, int width, int height) {
        GLES10Pipeline.nGLScissor(x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    private static native void nGLScissor(int x, int y, int width, int height);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glShadeModel([int mode]);
     * 
     *  C function void glShadeModel ( GLenum mode )

     * */
    public void glShadeModel(int mode) {
        GLES10Pipeline.nGLShadeModel(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glShadeModel([int mode]);
     * 
     *  C function void glShadeModel ( GLenum mode )

     * */
    private static native void nGLShadeModel(int mode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc ( GLenum func, GLint ref, GLuint mask )

     * */
    public void glStencilFunc(int func, int ref, int mask) {
        GLES10Pipeline.nGLStencilFunc(func, ref, mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc ( GLenum func, GLint ref, GLuint mask )

     * */
    private static native void nGLStencilFunc(int func, int ref, int mask);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask ( GLuint mask )

     * */
    public void glStencilMask(int mask) {
        GLES10Pipeline.nGLStencilMask(mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask ( GLuint mask )

     * */
    private static native void nGLStencilMask(int mask);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp ( GLenum fail, GLenum zfail, GLenum zpass )

     * */
    public void glStencilOp(int fail, int zfail, int zpass) {
        GLES10Pipeline.nGLStencilOp(fail, zfail, zpass);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp ( GLenum fail, GLenum zfail, GLenum zpass )

     * */
    private static native void nGLStencilOp(int fail, int zfail, int zpass);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexCoordPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glTexCoordPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    public void glTexCoordPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES10Pipeline.nGLTexCoordPointerBounds(size, type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexCoordPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glTexCoordPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static native void nGLTexCoordPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvf([int target, int pname, float param]);
     * 
     *  C function void glTexEnvf ( GLenum target, GLenum pname, GLfloat param )

     * */
    public void glTexEnvf(int target, int pname, float param) {
        GLES10Pipeline.nGLTexEnvf(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvf([int target, int pname, float param]);
     * 
     *  C function void glTexEnvf ( GLenum target, GLenum pname, GLfloat param )

     * */
    private static native void nGLTexEnvf(int target, int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public void glTexEnvfv(int target, int pname, float[] params, int offset) {
        GLES10Pipeline.nGLTexEnvfv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLTexEnvfv(int target, int pname, float[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public void glTexEnvfv(int target, int pname, java.nio.FloatBuffer params) {
        GLES10Pipeline.nGLTexEnvfv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    private static native void nGLTexEnvfv(int target, int pname, java.nio.FloatBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvx([int target, int pname, int param]);
     * 
     *  C function void glTexEnvx ( GLenum target, GLenum pname, GLfixed param )

     * */
    public void glTexEnvx(int target, int pname, int param) {
        GLES10Pipeline.nGLTexEnvx(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvx([int target, int pname, int param]);
     * 
     *  C function void glTexEnvx ( GLenum target, GLenum pname, GLfixed param )

     * */
    private static native void nGLTexEnvx(int target, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public void glTexEnvxv(int target, int pname, int[] params, int offset) {
        GLES10Pipeline.nGLTexEnvxv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLTexEnvxv(int target, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexEnvxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public void glTexEnvxv(int target, int pname, java.nio.IntBuffer params) {
        GLES10Pipeline.nGLTexEnvxv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexEnvxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    private static native void nGLTexEnvxv(int target, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexImage2D([int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D ( GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels) {
        GLES10Pipeline.nGLTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexImage2D([int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D ( GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    private static native void nGLTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf ( GLenum target, GLenum pname, GLfloat param )

     * */
    public void glTexParameterf(int target, int pname, float param) {
        GLES10Pipeline.nGLTexParameterf(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf ( GLenum target, GLenum pname, GLfloat param )

     * */
    private static native void nGLTexParameterf(int target, int pname, float param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexParameterx([int target, int pname, int param]);
     * 
     *  C function void glTexParameterx ( GLenum target, GLenum pname, GLfixed param )

     * */
    public void glTexParameterx(int target, int pname, int param) {
        GLES10Pipeline.nGLTexParameterx(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexParameterx([int target, int pname, int param]);
     * 
     *  C function void glTexParameterx ( GLenum target, GLenum pname, GLfixed param )

     * */
    private static native void nGLTexParameterx(int target, int pname, int param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels) {
        GLES10Pipeline.nGLTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    private static native void nGLTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTranslatef([float x, float y, float z]);
     * 
     *  C function void glTranslatef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    public void glTranslatef(float x, float y, float z) {
        GLES10Pipeline.nGLTranslatef(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTranslatef([float x, float y, float z]);
     * 
     *  C function void glTranslatef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    private static native void nGLTranslatef(float x, float y, float z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glTranslatex([int x, int y, int z]);
     * 
     *  C function void glTranslatex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public void glTranslatex(int x, int y, int z) {
        GLES10Pipeline.nGLTranslatex(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glTranslatex([int x, int y, int z]);
     * 
     *  C function void glTranslatex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    private static native void nGLTranslatex(int x, int y, int z);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glVertexPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    public void glVertexPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES10Pipeline.nGLVertexPointerBounds(size, type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glVertexPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static native void nGLVertexPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES10.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public void glViewport(int x, int y, int width, int height) {
        GLES10Pipeline.nGLViewport(x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES10.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    private static native void nGLViewport(int x, int y, int width, int height);
}
