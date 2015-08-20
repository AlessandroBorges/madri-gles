/**
 * 
 */
package gles.internal;

import gles.emulator.Sys;

import java.nio.Buffer;
import java.nio.IntBuffer;

/**
 * This class delegates some common functions from GLES20Pipeline
 * to be used as GLES10 pipeline. <br>
 * Not all SDK GL ES Emulators implements GL-ES 1.X, but we need it to
 * run basic tasks on GLSurfaceView
 * 
 * @author Alessandro Borges
 * @see gles.emulator.Sys
 */
public class GLESCommonPipeline implements Pipeline, GLCommon {
    GLCommon glES_Common;

    private static GLESCommonPipeline pipeline;
    
    /**
     * Creates a Common Pipeline.
     * On GLES20 only environment int uses GLES20 pipeline.
     * Otherwise, use GL10 Pipeline.
     *    
     */
    public static GLESCommonPipeline getPipelineInstance(){
        if(pipeline==null){
            pipeline = new GLESCommonPipeline();
        }
        return pipeline;
    }
    
    /**
     * Creates a Common Pipeline.
     * On GLES20 only environment it uses the GLES20 pipeline.
     * Otherwise, use GL10 Pipeline.
     *    
     */
    private GLESCommonPipeline() {         
        if (Sys.isGL20()) {            
            glES_Common = (GLES20Pipeline) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES20);
        } else // fallback to GLES10
        if (Sys.isGL10()) {
            glES_Common = (GLCommon) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES10);
        }
    }

    /**
     * @param texture
     * @see gles.internal.GLES20Pipeline#glActiveTexture(int)
     */
    public void glActiveTexture(int texture) {
        glES_Common.glActiveTexture(texture);
    }

    /**
     * @param target
     * @param texture
     * @see gles.internal.GLES20Pipeline#glBindTexture(int, int)
     */
    public void glBindTexture(int target, int texture) {
        glES_Common.glBindTexture(target, texture);
    }

    /**
     * @param sfactor
     * @param dfactor
     * @see gles.internal.GLES20Pipeline#glBlendFunc(int, int)
     */
    public void glBlendFunc(int sfactor, int dfactor) {
        glES_Common.glBlendFunc(sfactor, dfactor);
    }

    /**
     * @param mask
     * @see gles.internal.GLES20Pipeline#glClear(int)
     */
    public void glClear(int mask) {
        glES_Common.glClear(mask);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES20Pipeline#glClearColor(float, float, float, float)
     */
    public void glClearColor(float red, float green, float blue, float alpha) {
        glES_Common.glClearColor(red, green, blue, alpha);
    }

    /**
     * @param depth
     * @see gles.internal.GLES20Pipeline#glClearDepthf(float)
     */
    public void glClearDepthf(float depth) {
        glES_Common.glClearDepthf(depth);
    }

    /**
     * @param s
     * @see gles.internal.GLES20Pipeline#glClearStencil(int)
     */
    public void glClearStencil(int s) {
        glES_Common.glClearStencil(s);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES20Pipeline#glColorMask(boolean, boolean, boolean, boolean)
     */
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        glES_Common.glColorMask(red, green, blue, alpha);
    }

    /**
     * @param target
     * @param level
     * @param internalformat
     * @param width
     * @param height
     * @param border
     * @param imageSize
     * @param data
     * @see gles.internal.GLES20Pipeline#glCompressedTexImage2D(int, int, int, int, int,
     *      int, int, java.nio.Buffer)
     */
    public void glCompressedTexImage2D(int target,
                                       int level,
                                       int internalformat,
                                       int width,
                                       int height,
                                       int border,
                                       int imageSize,
                                       Buffer data) {
        glES_Common.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /**
     * @param target
     * @param level
     * @param xoffset
     * @param yoffset
     * @param width
     * @param height
     * @param format
     * @param imageSize
     * @param data
     * @see gles.internal.GLES20Pipeline#glCompressedTexSubImage2D(int, int, int, int,
     *      int, int, int, int, java.nio.Buffer)
     */
    public void glCompressedTexSubImage2D(int target,
                                          int level,
                                          int xoffset,
                                          int yoffset,
                                          int width,
                                          int height,
                                          int format,
                                          int imageSize,
                                          Buffer data) {
        glES_Common.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * @param target
     * @param level
     * @param internalformat
     * @param x
     * @param y
     * @param width
     * @param height
     * @param border
     * @see gles.internal.GLES20Pipeline#glCopyTexImage2D(int, int, int, int, int, int,
     *      int, int)
     */
    public void glCopyTexImage2D(int target,
                                 int level,
                                 int internalformat,
                                 int x,
                                 int y,
                                 int width,
                                 int height,
                                 int border) {
        glES_Common.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    /**
     * @param target
     * @param level
     * @param xoffset
     * @param yoffset
     * @param x
     * @param y
     * @param width
     * @param height
     * @see gles.internal.GLES20Pipeline#glCopyTexSubImage2D(int, int, int, int, int, int,
     *      int, int)
     */
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        glES_Common.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     * @param mode
     * @see gles.internal.GLES20Pipeline#glCullFace(int)
     */
    public void glCullFace(int mode) {
        glES_Common.glCullFace(mode);
    }

    /**
     * @param n
     * @param textures
     * @param offset
     * @see gles.internal.GLES20Pipeline#glDeleteTextures(int, int[], int)
     */
    public void glDeleteTextures(int n, int[] textures, int offset) {
        glES_Common.glDeleteTextures(n, textures, offset);
    }

    /**
     * @param n
     * @param textures
     * @see gles.internal.GLES20Pipeline#glDeleteTextures(int, java.nio.IntBuffer)
     */
    public void glDeleteTextures(int n, IntBuffer textures) {
        glES_Common.glDeleteTextures(n, textures);
    }

    /**
     * @param func
     * @see gles.internal.GLES20Pipeline#glDepthFunc(int)
     */
    public void glDepthFunc(int func) {
        glES_Common.glDepthFunc(func);
    }

    /**
     * @param flag
     * @see gles.internal.GLES20Pipeline#glDepthMask(boolean)
     */
    public void glDepthMask(boolean flag) {
        glES_Common.glDepthMask(flag);
    }

    /**
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES20Pipeline#glDepthRangef(float, float)
     */
    public void glDepthRangef(float zNear, float zFar) {
        glES_Common.glDepthRangef(zNear, zFar);
    }

    /**
     * @param cap
     * @see gles.internal.GLES20Pipeline#glDisable(int)
     */
    public void glDisable(int cap) {
        glES_Common.glDisable(cap);
    }

    /**
     * @param mode
     * @param first
     * @param count
     * @see gles.internal.GLES20Pipeline#glDrawArrays(int, int, int)
     */
    public void glDrawArrays(int mode, int first, int count) {
        glES_Common.glDrawArrays(mode, first, count);
    }

    /**
     * @param mode
     * @param count
     * @param type
     * @param indices
     * @see gles.internal.GLES20Pipeline#glDrawElements(int, int, int, java.nio.Buffer)
     */
    public void glDrawElements(int mode, int count, int type, Buffer indices) {
        glES_Common.glDrawElements(mode, count, type, indices);
    }

    /**
     * @param cap
     * @see gles.internal.GLES20Pipeline#glEnable(int)
     */
    public void glEnable(int cap) {
        glES_Common.glEnable(cap);
    }

    /**
     * 
     * @see gles.internal.GLES20Pipeline#glFinish()
     */
    public void glFinish() {
        glES_Common.glFinish();
    }

    /**
     * 
     * @see gles.internal.GLES20Pipeline#glFlush()
     */
    public void glFlush() {
        glES_Common.glFlush();
    }

    /**
     * @param mode
     * @see gles.internal.GLES20Pipeline#glFrontFace(int)
     */
    public void glFrontFace(int mode) {
        glES_Common.glFrontFace(mode);
    }

    /**
     * @param n
     * @param textures
     * @param offset
     * @see gles.internal.GLES20Pipeline#glGenTextures(int, int[], int)
     */
    public void glGenTextures(int n, int[] textures, int offset) {
        glES_Common.glGenTextures(n, textures, offset);
    }

    /**
     * @param n
     * @param textures
     * @see gles.internal.GLES20Pipeline#glGenTextures(int, java.nio.IntBuffer)
     */
    public void glGenTextures(int n, IntBuffer textures) {
        glES_Common.glGenTextures(n, textures);
    }

    /**
     * @return
     * @see gles.internal.GLES20Pipeline#glGetError()
     */
    public int glGetError() {
        return glES_Common.glGetError();
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES20Pipeline#glGetIntegerv(int, int[], int)
     */
    public void glGetIntegerv(int pname, int[] params, int offset) {
        glES_Common.glGetIntegerv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES20Pipeline#glGetIntegerv(int, java.nio.IntBuffer)
     */
    public void glGetIntegerv(int pname, IntBuffer params) {
        glES_Common.glGetIntegerv(pname, params);
    }

    /**
     * @param target
     * @param mode
     * @see gles.internal.GLES20Pipeline#glHint(int, int)
     */
    public void glHint(int target, int mode) {
        glES_Common.glHint(target, mode);
    }

    /**
     * @param width
     * @see gles.internal.GLES20Pipeline#glLineWidth(float)
     */
    public void glLineWidth(float width) {
        glES_Common.glLineWidth(width);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES20Pipeline#glPixelStorei(int, int)
     */
    public void glPixelStorei(int pname, int param) {
        glES_Common.glPixelStorei(pname, param);
    }

    /**
     * @param factor
     * @param units
     * @see gles.internal.GLES20Pipeline#glPolygonOffset(float, float)
     */
    public void glPolygonOffset(float factor, float units) {
        glES_Common.glPolygonOffset(factor, units);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @param format
     * @param type
     * @param pixels
     * @see gles.internal.GLES20Pipeline#glReadPixels(int, int, int, int, int, int,
     *      java.nio.Buffer)
     */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
        glES_Common.glReadPixels(x, y, width, height, format, type, pixels);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @see gles.internal.GLES20Pipeline#glScissor(int, int, int, int)
     */
    public void glScissor(int x, int y, int width, int height) {
        glES_Common.glScissor(x, y, width, height);
    }

    /**
     * @param func
     * @param ref
     * @param mask
     * @see gles.internal.GLES20Pipeline#glStencilFunc(int, int, int)
     */
    public void glStencilFunc(int func, int ref, int mask) {
        glES_Common.glStencilFunc(func, ref, mask);
    }

    /**
     * @param mask
     * @see gles.internal.GLES20Pipeline#glStencilMask(int)
     */
    public void glStencilMask(int mask) {
        glES_Common.glStencilMask(mask);
    }

    /**
     * @param fail
     * @param zfail
     * @param zpass
     * @see gles.internal.GLES20Pipeline#glStencilOp(int, int, int)
     */
    public void glStencilOp(int fail, int zfail, int zpass) {
        glES_Common.glStencilOp(fail, zfail, zpass);
    }

    /**
     * @param target
     * @param level
     * @param internalformat
     * @param width
     * @param height
     * @param border
     * @param format
     * @param type
     * @param pixels
     * @see gles.internal.GLES20Pipeline#glTexImage2D(int, int, int, int, int, int, int,
     *      int, java.nio.Buffer)
     */
    public void glTexImage2D(int target,
                             int level,
                             int internalformat,
                             int width,
                             int height,
                             int border,
                             int format,
                             int type,
                             Buffer pixels) {
        glES_Common.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES20Pipeline#glTexParameterf(int, int, float)
     */
    public void glTexParameterf(int target, int pname, float param) {
        glES_Common.glTexParameterf(target, pname, param);
    }

    /**
     * @param target
     * @param level
     * @param xoffset
     * @param yoffset
     * @param width
     * @param height
     * @param format
     * @param type
     * @param pixels
     * @see gles.internal.GLES20Pipeline#glTexSubImage2D(int, int, int, int, int, int,
     *      int, int, java.nio.Buffer)
     */
    public void glTexSubImage2D(int target,
                                int level,
                                int xoffset,
                                int yoffset,
                                int width,
                                int height,
                                int format,
                                int type,
                                Buffer pixels) {
        glES_Common.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @see gles.internal.GLES20Pipeline#glViewport(int, int, int, int)
     */
    public void glViewport(int x, int y, int width, int height) {
        glES_Common.glViewport(x, y, width, height);
    }

    @Override
    public String glGetString(int name) {
        return glES_Common.glGetString(name);
    }

}
