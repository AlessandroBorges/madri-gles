/**
 * 
 */
package gles.internal;

import gles.emulator.Sys;
import gles.emulator.Sys.GL_PIPE;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL10Ext;
import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11Ext;
import javax.microedition.khronos.opengles.GL11ExtensionPack;

import android.opengl.GLES10;
import android.opengl.GLES11;

/**
 * A implementation of javax.microedition.khronos.opengles GL interfaces.<br>
 * Implements:
 * <li>GL
 * <li>GL10
 * <li>GL10Ext
 * <li>GL11
 * <li>Gl11Ext
 * 
 * @author Alessandro Borges
 *
 */
public class GL11Impl 
  implements GL, GL10, GL10Ext, GL11, GL11Ext, GL11ExtensionPack 
  {
    private static final String TAG ="gles.internal.GL11Impl";
    
    private GLCommon glCommon;
    private GLES10Pipeline    gles10;
    private GLES10ExtPipeline gles10Ext;
    private GLES11Pipeline    gles11;
    private GLES11ExtPipeline gles11Ext;
    
    
    /**
     * From Android's GLImpl
     */
    Buffer          _colorPointer          = null;
    Buffer          _normalPointer         = null;
    Buffer          _texCoordPointer       = null;
    Buffer          _vertexPointer         = null;
    Buffer          _pointSizePointerOES   = null;
    Buffer          _matrixIndexPointerOES = null;
    Buffer          _weightPointerOES      = null;

    /**
     * From Android's GLImpl
     */
//    private boolean haveCheckedExtensions;
//    private boolean have_OES_blend_equation_separate;
//    private boolean have_OES_blend_subtract;
//    private boolean have_OES_framebuffer_object;
//    private boolean have_OES_texture_cube_map;
    
    private boolean isGL20 = false;
    
    /**
     * Basic ctor.
     */
    public GL11Impl(){       
    }
    
    /**
     * Delay as much as possible this operation.
     * It may never happens at all !
     */
    public void initialize(){
        if(!Sys.isNativeLibsLoaded()){
            Sys.loadNativeLibs();
        }
        
        if(Sys.isGL20()){
            glCommon = (GLCommon) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES_COMMON);
            isGL20 = true;
        }else if(Sys.isGL10()){
            gles10 = (GLES10Pipeline) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES10);
            glCommon = gles10;
            isGL20 = false;
        }
    }
   
    /**
     * 
     * @see gles.internal.GLES11Pipeline#GLES11ClassInit()
     */
    public void GLES11ClassInit() {
       // getGles11().GLES11ClassInit();
    }

    /**
     * @return the gles10
     */
    private GLES10Pipeline getGles10() {
        if (gles10 == null) {
            // try to initialize it
            if (glCommon == null) {
                initialize();
            }
            // there is no GL10 available
            if (isGL20) { 
                throw new UnsupportedOperationException("Forbidden mix of GL-ES 1.x calls"
                    + " on GL-ES 2.0. Sys info :" + Sys.getSDKInfo()); 
             }
        }
        return gles10;
    }

    private  GLCommon getGlCommon() {
        if(glCommon==null){
            initialize();
        }
        return glCommon;
    }

   
    /**
     * @return the gles10Ext
     */
    private GLES10ExtPipeline getGles10Ext() {
        if(gles10Ext == null){
            if(isGL20){
                throw new UnsupportedOperationException("Forbidden mix of GL-ES 1.x calls"
                        + " on GL-ES 2.0. Sys info :" + Sys.getSDKInfo() );
            }else{
                gles10Ext = (GLES10ExtPipeline) Sys.getGLPipelineInstance(GL_PIPE.GLES10Ext);
            }            
        }
        return gles10Ext;
    }

  

    /**
     * @return the gles11
     */
    private GLES11Pipeline getGles11() {
        if(gles11 == null){
            if(isGL20){
                throw new UnsupportedOperationException("Forbidden mix of GL-ES 1.x calls"
                        + " on GL-ES 2.0. Sys info :" + Sys.getSDKInfo() );
            }else{
                gles11 = (GLES11Pipeline) Sys.getGLPipelineInstance(GL_PIPE.GLES11);
            }            
        }
        return gles11;
    }

   
    /**
     * @return the gles11Ext
     */
    private GLES11ExtPipeline getGles11Ext() {
        if(gles11Ext == null){
            if(isGL20){
                throw new UnsupportedOperationException("Forbidden mix of GL-ES 1.x calls"
                        + " on GL-ES 2.0. Sys info :" + Sys.getSDKInfo() );
            }else{
                gles11Ext = (GLES11ExtPipeline) Sys.getGLPipelineInstance(GL_PIPE.GLES11Ext);
            }            
        }
        return gles11Ext;
    }
   

    /**
     * @param target
     * @param buffer
     * @see gles.internal.GLES11Pipeline#glBindBuffer(int, int)
     */
    public void glBindBuffer(int target, int buffer) {
        getGles11().glBindBuffer(target, buffer);
    }

    /**
     * @param target
     * @param size
     * @param data
     * @param usage
     * @see gles.internal.GLES11Pipeline#glBufferData(int, int, java.nio.Buffer, int)
     */
    public void glBufferData(int target, int size, Buffer data, int usage) {
        getGles11().glBufferData(target, size, data, usage);
    }

    /**
     * @param target
     * @param offset
     * @param size
     * @param data
     * @see gles.internal.GLES11Pipeline#glBufferSubData(int, int, int, java.nio.Buffer)
     */
    public void glBufferSubData(int target, int offset, int size, Buffer data) {
        getGles11().glBufferSubData(target, offset, size, data);
    }

    /**
     * @param plane
     * @param equation
     * @param offset
     * @see gles.internal.GLES11Pipeline#glClipPlanef(int, float[], int)
     */
    public void glClipPlanef(int plane, float[] equation, int offset) {
        getGles11().glClipPlanef(plane, equation, offset);
    }

    /**
     * @param plane
     * @param equation
     * @see gles.internal.GLES11Pipeline#glClipPlanef(int, java.nio.FloatBuffer)
     */
    public void glClipPlanef(int plane, FloatBuffer equation) {
        getGles11().glClipPlanef(plane, equation);
    }

    /**
     * @param plane
     * @param equation
     * @param offset
     * @see gles.internal.GLES11Pipeline#glClipPlanex(int, int[], int)
     */
    public void glClipPlanex(int plane, int[] equation, int offset) {
        getGles11().glClipPlanex(plane, equation, offset);
    }

    /**
     * @param plane
     * @param equation
     * @see gles.internal.GLES11Pipeline#glClipPlanex(int, java.nio.IntBuffer)
     */
    public void glClipPlanex(int plane, IntBuffer equation) {
        getGles11().glClipPlanex(plane, equation);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES11Pipeline#glColor4ub(byte, byte, byte, byte)
     */
    public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        getGles11().glColor4ub(red, green, blue, alpha);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param offset
     * @see gles.internal.GLES11Pipeline#glColorPointer(int, int, int, int)
     */
    public void glColorPointer(int size, int type, int stride, int offset) {
        getGles11().glColorPointer(size, type, stride, offset);
    }

    /**
     * @param n
     * @param buffers
     * @param offset
     * @see gles.internal.GLES11Pipeline#glDeleteBuffers(int, int[], int)
     */
    public void glDeleteBuffers(int n, int[] buffers, int offset) {
        getGles11().glDeleteBuffers(n, buffers, offset);
    }

    /**
     * @param n
     * @param buffers
     * @see gles.internal.GLES11Pipeline#glDeleteBuffers(int, java.nio.IntBuffer)
     */
    public void glDeleteBuffers(int n, IntBuffer buffers) {
        getGles11().glDeleteBuffers(n, buffers);
    }

    /**
     * @param mode
     * @param count
     * @param type
     * @param offset
     * @see gles.internal.GLES11Pipeline#glDrawElements(int, int, int, int)
     */
    public void glDrawElements(int mode, int count, int type, int offset) {
        getGles11().glDrawElements(mode, count, type, offset);
    }

    /**
     * @param n
     * @param buffers
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGenBuffers(int, int[], int)
     */
    public void glGenBuffers(int n, int[] buffers, int offset) {
        getGles11().glGenBuffers(n, buffers, offset);
    }

    /**
     * @param n
     * @param buffers
     * @see gles.internal.GLES11Pipeline#glGenBuffers(int, java.nio.IntBuffer)
     */
    public void glGenBuffers(int n, IntBuffer buffers) {
        getGles11().glGenBuffers(n, buffers);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetBooleanv(int, boolean[], int)
     */
    public void glGetBooleanv(int pname, boolean[] params, int offset) {
        getGles11().glGetBooleanv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetBooleanv(int, java.nio.IntBuffer)
     */
    public void glGetBooleanv(int pname, IntBuffer params) {
        getGles11().glGetBooleanv(pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetBufferParameteriv(int, int, int[], int)
     */
    public void glGetBufferParameteriv(int target, int pname, int[] params, int offset) {
        getGles11().glGetBufferParameteriv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetBufferParameteriv(int, int, java.nio.IntBuffer)
     */
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        getGles11().glGetBufferParameteriv(target, pname, params);
    }

    /**
     * @param pname
     * @param eqn
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetClipPlanef(int, float[], int)
     */
    public void glGetClipPlanef(int pname, float[] eqn, int offset) {
        getGles11().glGetClipPlanef(pname, eqn, offset);
    }

    /**
     * @param pname
     * @param eqn
     * @see gles.internal.GLES11Pipeline#glGetClipPlanef(int, java.nio.FloatBuffer)
     */
    public void glGetClipPlanef(int pname, FloatBuffer eqn) {
        getGles11().glGetClipPlanef(pname, eqn);
    }

    /**
     * @param pname
     * @param eqn
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetClipPlanex(int, int[], int)
     */
    public void glGetClipPlanex(int pname, int[] eqn, int offset) {
        getGles11().glGetClipPlanex(pname, eqn, offset);
    }

    /**
     * @param pname
     * @param eqn
     * @see gles.internal.GLES11Pipeline#glGetClipPlanex(int, java.nio.IntBuffer)
     */
    public void glGetClipPlanex(int pname, IntBuffer eqn) {
        getGles11().glGetClipPlanex(pname, eqn);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetFixedv(int, int[], int)
     */
    public void glGetFixedv(int pname, int[] params, int offset) {
        getGles11().glGetFixedv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetFixedv(int, java.nio.IntBuffer)
     */
    public void glGetFixedv(int pname, IntBuffer params) {
        getGles11().glGetFixedv(pname, params);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetFloatv(int, float[], int)
     */
    public void glGetFloatv(int pname, float[] params, int offset) {
        getGles11().glGetFloatv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetFloatv(int, java.nio.FloatBuffer)
     */
    public void glGetFloatv(int pname, FloatBuffer params) {
        getGles11().glGetFloatv(pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetLightfv(int, int, float[], int)
     */
    public void glGetLightfv(int light, int pname, float[] params, int offset) {
        getGles11().glGetLightfv(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetLightfv(int, int, java.nio.FloatBuffer)
     */
    public void glGetLightfv(int light, int pname, FloatBuffer params) {
        getGles11().glGetLightfv(light, pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetLightxv(int, int, int[], int)
     */
    public void glGetLightxv(int light, int pname, int[] params, int offset) {
        getGles11().glGetLightxv(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetLightxv(int, int, java.nio.IntBuffer)
     */
    public void glGetLightxv(int light, int pname, IntBuffer params) {
        getGles11().glGetLightxv(light, pname, params);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetMaterialfv(int, int, float[], int)
     */
    public void glGetMaterialfv(int face, int pname, float[] params, int offset) {
        getGles11().glGetMaterialfv(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetMaterialfv(int, int, java.nio.FloatBuffer)
     */
    public void glGetMaterialfv(int face, int pname, FloatBuffer params) {
        getGles11().glGetMaterialfv(face, pname, params);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetMaterialxv(int, int, int[], int)
     */
    public void glGetMaterialxv(int face, int pname, int[] params, int offset) {
        getGles11().glGetMaterialxv(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetMaterialxv(int, int, java.nio.IntBuffer)
     */
    public void glGetMaterialxv(int face, int pname, IntBuffer params) {
        getGles11().glGetMaterialxv(face, pname, params);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexEnvfv(int, int, float[], int)
     */
    public void glGetTexEnvfv(int envir, int pname, float[] params, int offset) {
        getGles11().glGetTexEnvfv(envir, pname, params, offset);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexEnvfv(int, int, java.nio.FloatBuffer)
     */
    public void glGetTexEnvfv(int envir, int pname, FloatBuffer params) {
        getGles11().glGetTexEnvfv(envir, pname, params);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexEnviv(int, int, int[], int)
     */
    public void glGetTexEnviv(int envir, int pname, int[] params, int offset) {
        getGles11().glGetTexEnviv(envir, pname, params, offset);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexEnviv(int, int, java.nio.IntBuffer)
     */
    public void glGetTexEnviv(int envir, int pname, IntBuffer params) {
        getGles11().glGetTexEnviv(envir, pname, params);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexEnvxv(int, int, int[], int)
     */
    public void glGetTexEnvxv(int envir, int pname, int[] params, int offset) {
        getGles11().glGetTexEnvxv(envir, pname, params, offset);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexEnvxv(int, int, java.nio.IntBuffer)
     */
    public void glGetTexEnvxv(int envir, int pname, IntBuffer params) {
        getGles11().glGetTexEnvxv(envir, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexParameterfv(int, int, float[], int)
     */
    public void glGetTexParameterfv(int target, int pname, float[] params, int offset) {
        getGles11().glGetTexParameterfv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexParameterfv(int, int, java.nio.FloatBuffer)
     */
    public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        getGles11().glGetTexParameterfv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexParameteriv(int, int, int[], int)
     */
    public void glGetTexParameteriv(int target, int pname, int[] params, int offset) {
        getGles11().glGetTexParameteriv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexParameteriv(int, int, java.nio.IntBuffer)
     */
    public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        getGles11().glGetTexParameteriv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glGetTexParameterxv(int, int, int[], int)
     */
    public void glGetTexParameterxv(int target, int pname, int[] params, int offset) {
        getGles11().glGetTexParameterxv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glGetTexParameterxv(int, int, java.nio.IntBuffer)
     */
    public void glGetTexParameterxv(int target, int pname, IntBuffer params) {
        getGles11().glGetTexParameterxv(target, pname, params);
    }

    /**
     * @param buffer
     * @return
     * @see gles.internal.GLES11Pipeline#glIsBuffer(int)
     */
    public boolean glIsBuffer(int buffer) {
        return getGles11().glIsBuffer(buffer);
    }

    /**
     * @param cap
     * @return
     * @see gles.internal.GLES11Pipeline#glIsEnabled(int)
     */
    public boolean glIsEnabled(int cap) {
        return getGles11().glIsEnabled(cap);
    }

    /**
     * @param texture
     * @return
     * @see gles.internal.GLES11Pipeline#glIsTexture(int)
     */
    public boolean glIsTexture(int texture) {
        return getGles11().glIsTexture(texture);
    }

    /**
     * @param type
     * @param stride
     * @param offset
     * @see gles.internal.GLES11Pipeline#glNormalPointer(int, int, int)
     */
    public void glNormalPointer(int type, int stride, int offset) {
        getGles11().glNormalPointer(type, stride, offset);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES11Pipeline#glPointParameterf(int, float)
     */
    public void glPointParameterf(int pname, float param) {
        getGles11().glPointParameterf(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glPointParameterfv(int, float[], int)
     */
    public void glPointParameterfv(int pname, float[] params, int offset) {
        getGles11().glPointParameterfv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glPointParameterfv(int, java.nio.FloatBuffer)
     */
    public void glPointParameterfv(int pname, FloatBuffer params) {
        getGles11().glPointParameterfv(pname, params);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES11Pipeline#glPointParameterx(int, int)
     */
    public void glPointParameterx(int pname, int param) {
        getGles11().glPointParameterx(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glPointParameterxv(int, int[], int)
     */
    public void glPointParameterxv(int pname, int[] params, int offset) {
        getGles11().glPointParameterxv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glPointParameterxv(int, java.nio.IntBuffer)
     */
    public void glPointParameterxv(int pname, IntBuffer params) {
        getGles11().glPointParameterxv(pname, params);
    }

    /**
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES11Pipeline#glPointSizePointerOESBounds(int, int, java.nio.Buffer, int)
     */
    public void glPointSizePointerOESBounds(int type, int stride, Buffer pointer, int remaining) {
        getGles11().glPointSizePointerOESBounds(type, stride, pointer, remaining);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param offset
     * @see gles.internal.GLES11Pipeline#glTexCoordPointer(int, int, int, int)
     */
    public void glTexCoordPointer(int size, int type, int stride, int offset) {
        getGles11().glTexCoordPointer(size, type, stride, offset);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES11Pipeline#glTexEnvi(int, int, int)
     */
    public void glTexEnvi(int target, int pname, int param) {
        getGles11().glTexEnvi(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glTexEnviv(int, int, int[], int)
     */
    public void glTexEnviv(int target, int pname, int[] params, int offset) {
        getGles11().glTexEnviv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glTexEnviv(int, int, java.nio.IntBuffer)
     */
    public void glTexEnviv(int target, int pname, IntBuffer params) {
        getGles11().glTexEnviv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glTexParameterfv(int, int, float[], int)
     */
    public void glTexParameterfv(int target, int pname, float[] params, int offset) {
        getGles11().glTexParameterfv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glTexParameterfv(int, int, java.nio.FloatBuffer)
     */
    public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        getGles11().glTexParameterfv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES11Pipeline#glTexParameteri(int, int, int)
     */
    public void glTexParameteri(int target, int pname, int param) {
        getGles11().glTexParameteri(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glTexParameteriv(int, int, int[], int)
     */
    public void glTexParameteriv(int target, int pname, int[] params, int offset) {
        getGles11().glTexParameteriv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glTexParameteriv(int, int, java.nio.IntBuffer)
     */
    public void glTexParameteriv(int target, int pname, IntBuffer params) {
        getGles11().glTexParameteriv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11Pipeline#glTexParameterxv(int, int, int[], int)
     */
    public void glTexParameterxv(int target, int pname, int[] params, int offset) {
        getGles11().glTexParameterxv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11Pipeline#glTexParameterxv(int, int, java.nio.IntBuffer)
     */
    public void glTexParameterxv(int target, int pname, IntBuffer params) {
        getGles11().glTexParameterxv(target, pname, params);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param offset
     * @see gles.internal.GLES11Pipeline#glVertexPointer(int, int, int, int)
     */
    public void glVertexPointer(int size, int type, int stride, int offset) {
        getGles11().glVertexPointer(size, type, stride, offset);
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#GLES10ClassInit()
     */
    public void GLES10ClassInit() {
        getGles10().GLES10ClassInit();
    }

    /**
     * @param texture
     * @see gles.internal.GLES10Pipeline#glActiveTexture(int)
     */
    public void glActiveTexture(int texture) {
        getGlCommon().glActiveTexture(texture);
    }

    /**
     * @param func
     * @param ref
     * @see gles.internal.GLES10Pipeline#glAlphaFunc(int, float)
     */
    public void glAlphaFunc(int func, float ref) {
        getGles10().glAlphaFunc(func, ref);
    }

    /**
     * @param func
     * @param ref
     * @see gles.internal.GLES10Pipeline#glAlphaFuncx(int, int)
     */
    public void glAlphaFuncx(int func, int ref) {
        getGles10().glAlphaFuncx(func, ref);
    }

    /**
     * @param target
     * @param texture
     * @see gles.internal.GLES10Pipeline#glBindTexture(int, int)
     */
    public void glBindTexture(int target, int texture) {
        getGlCommon().glBindTexture(target, texture);
    }

    /**
     * @param sfactor
     * @param dfactor
     * @see gles.internal.GLES10Pipeline#glBlendFunc(int, int)
     */
    public void glBlendFunc(int sfactor, int dfactor) {
        getGlCommon().glBlendFunc(sfactor, dfactor);
    }

    /**
     * @param mask
     * @see gles.internal.GLES10Pipeline#glClear(int)
     */
    public void glClear(int mask) {
        getGlCommon().glClear(mask);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES10Pipeline#glClearColor(float, float, float, float)
     */
    public void glClearColor(float red, float green, float blue, float alpha) {
        getGlCommon().glClearColor(red, green, blue, alpha);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES10Pipeline#glClearColorx(int, int, int, int)
     */
    public void glClearColorx(int red, int green, int blue, int alpha) {
        getGles10().glClearColorx(red, green, blue, alpha);
    }

    /**
     * @param depth
     * @see gles.internal.GLES10Pipeline#glClearDepthf(float)
     */
    public void glClearDepthf(float depth) {
        getGlCommon().glClearDepthf(depth);
    }

    /**
     * @param depth
     * @see gles.internal.GLES10Pipeline#glClearDepthx(int)
     */
    public void glClearDepthx(int depth) {
        getGles10().glClearDepthx(depth);
    }

    /**
     * @param s
     * @see gles.internal.GLES10Pipeline#glClearStencil(int)
     */
    public void glClearStencil(int s) {
        getGlCommon().glClearStencil(s);
    }

    /**
     * @param texture
     * @see gles.internal.GLES10Pipeline#glClientActiveTexture(int)
     */
    public void glClientActiveTexture(int texture) {
        getGles10().glClientActiveTexture(texture);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES10Pipeline#glColor4f(float, float, float, float)
     */
    public void glColor4f(float red, float green, float blue, float alpha) {
        getGles10().glColor4f(red, green, blue, alpha);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES10Pipeline#glColor4x(int, int, int, int)
     */
    public void glColor4x(int red, int green, int blue, int alpha) {
        getGles10().glColor4x(red, green, blue, alpha);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES10Pipeline#glColorMask(boolean, boolean, boolean, boolean)
     */
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        getGlCommon().glColorMask(red, green, blue, alpha);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES10Pipeline#glColorPointerBounds(int, int, int,
     *      java.nio.Buffer, int)
     */
    public void glColorPointerBounds(int size, int type, int stride, Buffer pointer, int remaining) {
        getGles10().glColorPointerBounds(size, type, stride, pointer, remaining);
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
     * @see gles.internal.GLES10Pipeline#glCompressedTexImage2D(int, int, int, int, int,
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
        getGlCommon().glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
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
     * @see gles.internal.GLES10Pipeline#glCompressedTexSubImage2D(int, int, int, int,
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
        getGlCommon().glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
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
     * @see gles.internal.GLES10Pipeline#glCopyTexImage2D(int, int, int, int, int, int,
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
        getGlCommon().glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
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
     * @see gles.internal.GLES10Pipeline#glCopyTexSubImage2D(int, int, int, int, int, int,
     *      int, int)
     */
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        getGlCommon().glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     * @param mode
     * @see gles.internal.GLES10Pipeline#glCullFace(int)
     */
    public void glCullFace(int mode) {
        getGlCommon().glCullFace(mode);
    }

    /**
     * @param n
     * @param textures
     * @param offset
     * @see gles.internal.GLES10Pipeline#glDeleteTextures(int, int[], int)
     */
    public void glDeleteTextures(int n, int[] textures, int offset) {
        getGlCommon().glDeleteTextures(n, textures, offset);
    }

    /**
     * @param n
     * @param textures
     * @see gles.internal.GLES10Pipeline#glDeleteTextures(int, java.nio.IntBuffer)
     */
    public void glDeleteTextures(int n, IntBuffer textures) {
        getGlCommon().glDeleteTextures(n, textures);
    }

    /**
     * @param func
     * @see gles.internal.GLES10Pipeline#glDepthFunc(int)
     */
    public void glDepthFunc(int func) {
        getGlCommon().glDepthFunc(func);
    }

    /**
     * @param flag
     * @see gles.internal.GLES10Pipeline#glDepthMask(boolean)
     */
    public void glDepthMask(boolean flag) {
        getGlCommon().glDepthMask(flag);
    }

    /**
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glDepthRangef(float, float)
     */
    public void glDepthRangef(float zNear, float zFar) {
        getGlCommon().glDepthRangef(zNear, zFar);
    }

    /**
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glDepthRangex(int, int)
     */
    public void glDepthRangex(int zNear, int zFar) {
        getGles10().glDepthRangex(zNear, zFar);
    }

    /**
     * @param cap
     * @see gles.internal.GLES10Pipeline#glDisable(int)
     */
    public void glDisable(int cap) {
        getGlCommon().glDisable(cap);
    }

    /**
     * @param array
     * @see gles.internal.GLES10Pipeline#glDisableClientState(int)
     */
    public void glDisableClientState(int array) {
        getGles10().glDisableClientState(array);
    }

    /**
     * @param mode
     * @param first
     * @param count
     * @see gles.internal.GLES10Pipeline#glDrawArrays(int, int, int)
     */
    public void glDrawArrays(int mode, int first, int count) {
        getGlCommon().glDrawArrays(mode, first, count);
    }

    /**
     * @param mode
     * @param count
     * @param type
     * @param indices
     * @see gles.internal.GLES10Pipeline#glDrawElements(int, int, int, java.nio.Buffer)
     */
    public void glDrawElements(int mode, int count, int type, Buffer indices) {
        getGlCommon().glDrawElements(mode, count, type, indices);
    }

    /**
     * @param cap
     * @see gles.internal.GLES10Pipeline#glEnable(int)
     */
    public void glEnable(int cap) {
        getGlCommon().glEnable(cap);
    }

    /**
     * @param array
     * @see gles.internal.GLES10Pipeline#glEnableClientState(int)
     */
    public void glEnableClientState(int array) {
        getGles10().glEnableClientState(array);
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#glFinish()
     */
    public void glFinish() {
        getGlCommon().glFinish();
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#glFlush()
     */
    public void glFlush() {
        getGlCommon().glFlush();
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glFogf(int, float)
     */
    public void glFogf(int pname, float param) {
        getGles10().glFogf(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glFogfv(int, float[], int)
     */
    public void glFogfv(int pname, float[] params, int offset) {
        getGles10().glFogfv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glFogfv(int, java.nio.FloatBuffer)
     */
    public void glFogfv(int pname, FloatBuffer params) {
        getGles10().glFogfv(pname, params);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glFogx(int, int)
     */
    public void glFogx(int pname, int param) {
        getGles10().glFogx(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glFogxv(int, int[], int)
     */
    public void glFogxv(int pname, int[] params, int offset) {
        getGles10().glFogxv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glFogxv(int, java.nio.IntBuffer)
     */
    public void glFogxv(int pname, IntBuffer params) {
        getGles10().glFogxv(pname, params);
    }

    /**
     * @param mode
     * @see gles.internal.GLES10Pipeline#glFrontFace(int)
     */
    public void glFrontFace(int mode) {
        getGlCommon().glFrontFace(mode);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glFrustumf(float, float, float, float, float,
     *      float)
     */
    public void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar) {
        getGles10().glFrustumf(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glFrustumx(int, int, int, int, int, int)
     */
    public void glFrustumx(int left, int right, int bottom, int top, int zNear, int zFar) {
        getGles10().glFrustumx(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param n
     * @param textures
     * @param offset
     * @see gles.internal.GLES10Pipeline#glGenTextures(int, int[], int)
     */
    public void glGenTextures(int n, int[] textures, int offset) {
        getGlCommon().glGenTextures(n, textures, offset);
    }

    /**
     * @param n
     * @param textures
     * @see gles.internal.GLES10Pipeline#glGenTextures(int, java.nio.IntBuffer)
     */
    public void glGenTextures(int n, IntBuffer textures) {
        getGlCommon().glGenTextures(n, textures);
    }

    /**
     * @return
     * @see gles.internal.GLES10Pipeline#glGetError()
     */
    public int glGetError() {
        return getGlCommon().glGetError();
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glGetIntegerv(int, int[], int)
     */
    public void glGetIntegerv(int pname, int[] params, int offset) {
        getGlCommon().glGetIntegerv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glGetIntegerv(int, java.nio.IntBuffer)
     */
    public void glGetIntegerv(int pname, IntBuffer params) {
        getGlCommon().glGetIntegerv(pname, params);
    }

    /**
     * @param name
     * @return
     * @see gles.internal.GLES10Pipeline#glGetString(int)
     */
    public String glGetString(int name) {
        return getGlCommon().glGetString(name);
    }

    /**
     * @param target
     * @param mode
     * @see gles.internal.GLES10Pipeline#glHint(int, int)
     */
    public void glHint(int target, int mode) {
        getGlCommon().glHint(target, mode);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glLightModelf(int, float)
     */
    public void glLightModelf(int pname, float param) {
        getGles10().glLightModelf(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLightModelfv(int, float[], int)
     */
    public void glLightModelfv(int pname, float[] params, int offset) {
        getGles10().glLightModelfv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glLightModelfv(int, java.nio.FloatBuffer)
     */
    public void glLightModelfv(int pname, FloatBuffer params) {
        getGles10().glLightModelfv(pname, params);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glLightModelx(int, int)
     */
    public void glLightModelx(int pname, int param) {
        getGles10().glLightModelx(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLightModelxv(int, int[], int)
     */
    public void glLightModelxv(int pname, int[] params, int offset) {
        getGles10().glLightModelxv(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glLightModelxv(int, java.nio.IntBuffer)
     */
    public void glLightModelxv(int pname, IntBuffer params) {
        getGles10().glLightModelxv(pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glLightf(int, int, float)
     */
    public void glLightf(int light, int pname, float param) {
        getGles10().glLightf(light, pname, param);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLightfv(int, int, float[], int)
     */
    public void glLightfv(int light, int pname, float[] params, int offset) {
        getGles10().glLightfv(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glLightfv(int, int, java.nio.FloatBuffer)
     */
    public void glLightfv(int light, int pname, FloatBuffer params) {
        getGles10().glLightfv(light, pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glLightx(int, int, int)
     */
    public void glLightx(int light, int pname, int param) {
        getGles10().glLightx(light, pname, param);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLightxv(int, int, int[], int)
     */
    public void glLightxv(int light, int pname, int[] params, int offset) {
        getGles10().glLightxv(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glLightxv(int, int, java.nio.IntBuffer)
     */
    public void glLightxv(int light, int pname, IntBuffer params) {
        getGles10().glLightxv(light, pname, params);
    }

    /**
     * @param width
     * @see gles.internal.GLES10Pipeline#glLineWidth(float)
     */
    public void glLineWidth(float width) {
        getGles10().glLineWidth(width);
    }

    /**
     * @param width
     * @see gles.internal.GLES10Pipeline#glLineWidthx(int)
     */
    public void glLineWidthx(int width) {
        getGles10().glLineWidthx(width);
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#glLoadIdentity()
     */
    public void glLoadIdentity() {
        getGles10().glLoadIdentity();
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLoadMatrixf(float[], int)
     */
    public void glLoadMatrixf(float[] m, int offset) {
        getGles10().glLoadMatrixf(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES10Pipeline#glLoadMatrixf(java.nio.FloatBuffer)
     */
    public void glLoadMatrixf(FloatBuffer m) {
        getGles10().glLoadMatrixf(m);
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES10Pipeline#glLoadMatrixx(int[], int)
     */
    public void glLoadMatrixx(int[] m, int offset) {
        getGles10().glLoadMatrixx(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES10Pipeline#glLoadMatrixx(java.nio.IntBuffer)
     */
    public void glLoadMatrixx(IntBuffer m) {
        getGles10().glLoadMatrixx(m);
    }

    /**
     * @param opcode
     * @see gles.internal.GLES10Pipeline#glLogicOp(int)
     */
    public void glLogicOp(int opcode) {
        getGles10().glLogicOp(opcode);
    }

    /**
     * @param face
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glMaterialf(int, int, float)
     */
    public void glMaterialf(int face, int pname, float param) {
        getGles10().glMaterialf(face, pname, param);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glMaterialfv(int, int, float[], int)
     */
    public void glMaterialfv(int face, int pname, float[] params, int offset) {
        getGles10().glMaterialfv(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glMaterialfv(int, int, java.nio.FloatBuffer)
     */
    public void glMaterialfv(int face, int pname, FloatBuffer params) {
        getGles10().glMaterialfv(face, pname, params);
    }

    /**
     * @param face
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glMaterialx(int, int, int)
     */
    public void glMaterialx(int face, int pname, int param) {
        getGles10().glMaterialx(face, pname, param);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glMaterialxv(int, int, int[], int)
     */
    public void glMaterialxv(int face, int pname, int[] params, int offset) {
        getGles10().glMaterialxv(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glMaterialxv(int, int, java.nio.IntBuffer)
     */
    public void glMaterialxv(int face, int pname, IntBuffer params) {
        getGles10().glMaterialxv(face, pname, params);
    }

    /**
     * @param mode
     * @see gles.internal.GLES10Pipeline#glMatrixMode(int)
     */
    public void glMatrixMode(int mode) {
        getGles10().glMatrixMode(mode);
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES10Pipeline#glMultMatrixf(float[], int)
     */
    public void glMultMatrixf(float[] m, int offset) {
        getGles10().glMultMatrixf(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES10Pipeline#glMultMatrixf(java.nio.FloatBuffer)
     */
    public void glMultMatrixf(FloatBuffer m) {
        getGles10().glMultMatrixf(m);
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES10Pipeline#glMultMatrixx(int[], int)
     */
    public void glMultMatrixx(int[] m, int offset) {
        getGles10().glMultMatrixx(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES10Pipeline#glMultMatrixx(java.nio.IntBuffer)
     */
    public void glMultMatrixx(IntBuffer m) {
        getGles10().glMultMatrixx(m);
    }

    /**
     * @param target
     * @param s
     * @param t
     * @param r
     * @param q
     * @see gles.internal.GLES10Pipeline#glMultiTexCoord4f(int, float, float, float,
     *      float)
     */
    public void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
        getGles10().glMultiTexCoord4f(target, s, t, r, q);
    }

    /**
     * @param target
     * @param s
     * @param t
     * @param r
     * @param q
     * @see gles.internal.GLES10Pipeline#glMultiTexCoord4x(int, int, int, int, int)
     */
    public void glMultiTexCoord4x(int target, int s, int t, int r, int q) {
        getGles10().glMultiTexCoord4x(target, s, t, r, q);
    }

    /**
     * @param nx
     * @param ny
     * @param nz
     * @see gles.internal.GLES10Pipeline#glNormal3f(float, float, float)
     */
    public void glNormal3f(float nx, float ny, float nz) {
        getGles10().glNormal3f(nx, ny, nz);
    }

    /**
     * @param nx
     * @param ny
     * @param nz
     * @see gles.internal.GLES10Pipeline#glNormal3x(int, int, int)
     */
    public void glNormal3x(int nx, int ny, int nz) {
        getGles10().glNormal3x(nx, ny, nz);
    }

    /**
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES10Pipeline#glNormalPointerBounds(int, int, java.nio.Buffer,
     *      int)
     */
    public void glNormalPointerBounds(int type, int stride, Buffer pointer, int remaining) {
        getGles10().glNormalPointerBounds(type, stride, pointer, remaining);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glOrthof(float, float, float, float, float,
     *      float)
     */
    public void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar) {
        getGles10().glOrthof(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES10Pipeline#glOrthox(int, int, int, int, int, int)
     */
    public void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar) {
        getGles10().glOrthox(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glPixelStorei(int, int)
     */
    public void glPixelStorei(int pname, int param) {
        getGles10().glPixelStorei(pname, param);
    }

    /**
     * @param size
     * @see gles.internal.GLES10Pipeline#glPointSize(float)
     */
    public void glPointSize(float size) {
        getGles10().glPointSize(size);
    }

    /**
     * @param size
     * @see gles.internal.GLES10Pipeline#glPointSizex(int)
     */
    public void glPointSizex(int size) {
        getGles10().glPointSizex(size);
    }

    /**
     * @param factor
     * @param units
     * @see gles.internal.GLES10Pipeline#glPolygonOffset(float, float)
     */
    public void glPolygonOffset(float factor, float units) {
        getGles10().glPolygonOffset(factor, units);
    }

    /**
     * @param factor
     * @param units
     * @see gles.internal.GLES10Pipeline#glPolygonOffsetx(int, int)
     */
    public void glPolygonOffsetx(int factor, int units) {
        getGles10().glPolygonOffsetx(factor, units);
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#glPopMatrix()
     */
    public void glPopMatrix() {
        getGles10().glPopMatrix();
    }

    /**
     * 
     * @see gles.internal.GLES10Pipeline#glPushMatrix()
     */
    public void glPushMatrix() {
        getGles10().glPushMatrix();
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @param format
     * @param type
     * @param pixels
     * @see gles.internal.GLES10Pipeline#glReadPixels(int, int, int, int, int, int,
     *      java.nio.Buffer)
     */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
        getGles10().glReadPixels(x, y, width, height, format, type, pixels);
    }

    /**
     * @param angle
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glRotatef(float, float, float, float)
     */
    public void glRotatef(float angle, float x, float y, float z) {
        getGles10().glRotatef(angle, x, y, z);
    }

    /**
     * @param angle
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glRotatex(int, int, int, int)
     */
    public void glRotatex(int angle, int x, int y, int z) {
        getGles10().glRotatex(angle, x, y, z);
    }

    /**
     * @param value
     * @param invert
     * @see gles.internal.GLES10Pipeline#glSampleCoverage(float, boolean)
     */
    public void glSampleCoverage(float value, boolean invert) {
        getGles10().glSampleCoverage(value, invert);
    }

    /**
     * @param value
     * @param invert
     * @see gles.internal.GLES10Pipeline#glSampleCoveragex(int, boolean)
     */
    public void glSampleCoveragex(int value, boolean invert) {
        getGles10().glSampleCoveragex(value, invert);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glScalef(float, float, float)
     */
    public void glScalef(float x, float y, float z) {
        getGles10().glScalef(x, y, z);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glScalex(int, int, int)
     */
    public void glScalex(int x, int y, int z) {
        getGles10().glScalex(x, y, z);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @see gles.internal.GLES10Pipeline#glScissor(int, int, int, int)
     */
    public void glScissor(int x, int y, int width, int height) {
        getGlCommon().glScissor(x, y, width, height);
    }

    /**
     * @param mode
     * @see gles.internal.GLES10Pipeline#glShadeModel(int)
     */
    public void glShadeModel(int mode) {
        getGles10().glShadeModel(mode);
    }

    /**
     * @param func
     * @param ref
     * @param mask
     * @see gles.internal.GLES10Pipeline#glStencilFunc(int, int, int)
     */
    public void glStencilFunc(int func, int ref, int mask) {
        getGlCommon().glStencilFunc(func, ref, mask);
    }

    /**
     * @param mask
     * @see gles.internal.GLES10Pipeline#glStencilMask(int)
     */
    public void glStencilMask(int mask) {
        getGlCommon().glStencilMask(mask);
    }

    /**
     * @param fail
     * @param zfail
     * @param zpass
     * @see gles.internal.GLES10Pipeline#glStencilOp(int, int, int)
     */
    public void glStencilOp(int fail, int zfail, int zpass) {
        getGlCommon().glStencilOp(fail, zfail, zpass);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES10Pipeline#glTexCoordPointerBounds(int, int, int,
     *      java.nio.Buffer, int)
     */
    public void glTexCoordPointerBounds(int size, int type, int stride, Buffer pointer, int remaining) {
        getGles10().glTexCoordPointerBounds(size, type, stride, pointer, remaining);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glTexEnvf(int, int, float)
     */
    public void glTexEnvf(int target, int pname, float param) {
        getGles10().glTexEnvf(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glTexEnvfv(int, int, float[], int)
     */
    public void glTexEnvfv(int target, int pname, float[] params, int offset) {
        getGles10().glTexEnvfv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glTexEnvfv(int, int, java.nio.FloatBuffer)
     */
    public void glTexEnvfv(int target, int pname, FloatBuffer params) {
        getGles10().glTexEnvfv(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glTexEnvx(int, int, int)
     */
    public void glTexEnvx(int target, int pname, int param) {
        getGles10().glTexEnvx(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES10Pipeline#glTexEnvxv(int, int, int[], int)
     */
    public void glTexEnvxv(int target, int pname, int[] params, int offset) {
        getGles10().glTexEnvxv(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES10Pipeline#glTexEnvxv(int, int, java.nio.IntBuffer)
     */
    public void glTexEnvxv(int target, int pname, IntBuffer params) {
        getGles10().glTexEnvxv(target, pname, params);
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
     * @see gles.internal.GLES10Pipeline#glTexImage2D(int, int, int, int, int, int, int,
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
        getGlCommon().glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glTexParameterf(int, int, float)
     */
    public void glTexParameterf(int target, int pname, float param) {
        getGlCommon().glTexParameterf(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES10Pipeline#glTexParameterx(int, int, int)
     */
    public void glTexParameterx(int target, int pname, int param) {
        getGles10().glTexParameterx(target, pname, param);
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
     * @see gles.internal.GLES10Pipeline#glTexSubImage2D(int, int, int, int, int, int,
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
        getGlCommon().glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glTranslatef(float, float, float)
     */
    public void glTranslatef(float x, float y, float z) {
        getGles10().glTranslatef(x, y, z);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES10Pipeline#glTranslatex(int, int, int)
     */
    public void glTranslatex(int x, int y, int z) {
        getGles10().glTranslatex(x, y, z);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES10Pipeline#glVertexPointerBounds(int, int, int,
     *      java.nio.Buffer, int)
     */
    public void glVertexPointerBounds(int size, int type, int stride, Buffer pointer, int remaining) {
        getGles10().glVertexPointerBounds(size, type, stride, pointer, remaining);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @see gles.internal.GLES10Pipeline#glViewport(int, int, int, int)
     */
    public void glViewport(int x, int y, int width, int height) {
        getGlCommon().glViewport(x, y, width, height);
    }

        
    public void glColorPointer(int size, int type, int stride, java.nio.Buffer pointer) {
        glColorPointerBounds(size, type, stride, pointer, pointer.remaining());
        if ((size == 4) && ((type == GL_FLOAT) 
                         || (type == GL_UNSIGNED_BYTE) 
                         || (type == GL_FIXED)) && (stride >= 0)) {
            _colorPointer = pointer;
        }
    }

    @Override
    public void glNormalPointer(int type, int stride, Buffer pointer) {
        glNormalPointerBounds(
                type,
                stride,
                pointer,
                pointer.remaining()
            );
            if (((type == GL_FLOAT) ||
                 (type == GL_BYTE) ||
                 (type == GL_SHORT) ||
                 (type == GL_FIXED)) &&
                (stride >= 0)) {
                _normalPointer = pointer;
            }

    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, Buffer pointer) {
        glTexCoordPointerBounds(
                size,
                type,
                stride,
                pointer,
                pointer.remaining()
            );
            if (((size == 2) ||
                 (size == 3) ||
                 (size == 4)) &&
                ((type == GL_FLOAT) ||
                 (type == GL_BYTE) ||
                 (type == GL_SHORT) ||
                 (type == GL_FIXED)) &&
                (stride >= 0)) {
                _texCoordPointer = pointer;
            }
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, Buffer pointer) {
        glVertexPointerBounds(
                size,
                type,
                stride,
                pointer,
                pointer.remaining()
            );
            if (((size == 2) ||
                 (size == 3) ||
                 (size == 4)) &&
                ((type == GL_FLOAT) ||
                 (type == GL_BYTE) ||
                 (type == GL_SHORT) ||
                 (type == GL_FIXED)) &&
                (stride >= 0)) {
                _vertexPointer = pointer;
            }

    }

    /**
     * @param mantissa
     * @param mantissaOffset
     * @param exponent
     * @param exponentOffset
     * @return
     * @see gles.internal.GLES10ExtPipeline#glQueryMatrixxOES(int[], int, int[], int)
     */
    public int glQueryMatrixxOES(int[] mantissa, int mantissaOffset, int[] exponent, int exponentOffset) {
        return getGles10Ext().glQueryMatrixxOES(mantissa, mantissaOffset, exponent, exponentOffset);
    }

    /**
     * @param mantissa
     * @param exponent
     * @return
     * @see gles.internal.GLES10ExtPipeline#glQueryMatrixxOES(java.nio.IntBuffer,
     *      java.nio.IntBuffer)
     */
    public int glQueryMatrixxOES(IntBuffer mantissa, IntBuffer exponent) {
        return getGles10Ext().glQueryMatrixxOES(mantissa, exponent);
    }
    
    /**
     * @param modeRGB
     * @param modeAlpha
     * @see gles.internal.GLES11ExtPipeline#glBlendEquationSeparateOES(int, int)
     */
    public void glBlendEquationSeparateOES(int modeRGB, int modeAlpha) {
        getGles11Ext().glBlendEquationSeparateOES(modeRGB, modeAlpha);
    }

    /**
     * @param srcRGB
     * @param dstRGB
     * @param srcAlpha
     * @param dstAlpha
     * @see gles.internal.GLES11ExtPipeline#glBlendFuncSeparateOES(int, int, int, int)
     */
    public void glBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        getGles11Ext().glBlendFuncSeparateOES(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     * @param mode
     * @see gles.internal.GLES11ExtPipeline#glBlendEquationOES(int)
     */
    public void glBlendEquationOES(int mode) {
        getGles11Ext().glBlendEquationOES(mode);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @param width
     * @param height
     * @see gles.internal.GLES11ExtPipeline#glDrawTexsOES(short, short, short, short, short)
     */
    public void glDrawTexsOES(short x, short y, short z, short width, short height) {
        getGles11Ext().glDrawTexsOES(x, y, z, width, height);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @param width
     * @param height
     * @see gles.internal.GLES11ExtPipeline#glDrawTexiOES(int, int, int, int, int)
     */
    public void glDrawTexiOES(int x, int y, int z, int width, int height) {
        getGles11Ext().glDrawTexiOES(x, y, z, width, height);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @param width
     * @param height
     * @see gles.internal.GLES11ExtPipeline#glDrawTexxOES(int, int, int, int, int)
     */
    public void glDrawTexxOES(int x, int y, int z, int width, int height) {
        getGles11Ext().glDrawTexxOES(x, y, z, width, height);
    }

    /**
     * @param coords
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDrawTexsvOES(short[], int)
     */
    public void glDrawTexsvOES(short[] coords, int offset) {
        getGles11Ext().glDrawTexsvOES(coords, offset);
    }

    /**
     * @param coords
     * @see gles.internal.GLES11ExtPipeline#glDrawTexsvOES(java.nio.ShortBuffer)
     */
    public void glDrawTexsvOES(ShortBuffer coords) {
        getGles11Ext().glDrawTexsvOES(coords);
    }

    /**
     * @param coords
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDrawTexivOES(int[], int)
     */
    public void glDrawTexivOES(int[] coords, int offset) {
        getGles11Ext().glDrawTexivOES(coords, offset);
    }

    /**
     * @param coords
     * @see gles.internal.GLES11ExtPipeline#glDrawTexivOES(java.nio.IntBuffer)
     */
    public void glDrawTexivOES(IntBuffer coords) {
        getGles11Ext().glDrawTexivOES(coords);
    }

    /**
     * @param coords
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDrawTexxvOES(int[], int)
     */
    public void glDrawTexxvOES(int[] coords, int offset) {
        getGles11Ext().glDrawTexxvOES(coords, offset);
    }

    /**
     * @param coords
     * @see gles.internal.GLES11ExtPipeline#glDrawTexxvOES(java.nio.IntBuffer)
     */
    public void glDrawTexxvOES(IntBuffer coords) {
        getGles11Ext().glDrawTexxvOES(coords);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @param width
     * @param height
     * @see gles.internal.GLES11ExtPipeline#glDrawTexfOES(float, float, float, float, float)
     */
    public void glDrawTexfOES(float x, float y, float z, float width, float height) {
        getGles11Ext().glDrawTexfOES(x, y, z, width, height);
    }

    /**
     * @param coords
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDrawTexfvOES(float[], int)
     */
    public void glDrawTexfvOES(float[] coords, int offset) {
        getGles11Ext().glDrawTexfvOES(coords, offset);
    }

    /**
     * @param coords
     * @see gles.internal.GLES11ExtPipeline#glDrawTexfvOES(java.nio.FloatBuffer)
     */
    public void glDrawTexfvOES(FloatBuffer coords) {
        getGles11Ext().glDrawTexfvOES(coords);
    }

    /**
     * @param target
     * @param image
     * @see gles.internal.GLES11ExtPipeline#glEGLImageTargetTexture2DOES(int, java.nio.Buffer)
     */
    public void glEGLImageTargetTexture2DOES(int target, Buffer image) {
        getGles11Ext().glEGLImageTargetTexture2DOES(target, image);
    }

    /**
     * @param target
     * @param image
     * @see gles.internal.GLES11ExtPipeline#glEGLImageTargetRenderbufferStorageOES(int, java.nio.Buffer)
     */
    public void glEGLImageTargetRenderbufferStorageOES(int target, Buffer image) {
        getGles11Ext().glEGLImageTargetRenderbufferStorageOES(target, image);
    }

    /**
     * @param func
     * @param ref
     * @see gles.internal.GLES11ExtPipeline#glAlphaFuncxOES(int, int)
     */
    public void glAlphaFuncxOES(int func, int ref) {
        getGles11Ext().glAlphaFuncxOES(func, ref);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES11ExtPipeline#glClearColorxOES(int, int, int, int)
     */
    public void glClearColorxOES(int red, int green, int blue, int alpha) {
        getGles11Ext().glClearColorxOES(red, green, blue, alpha);
    }

    /**
     * @param depth
     * @see gles.internal.GLES11ExtPipeline#glClearDepthxOES(int)
     */
    public void glClearDepthxOES(int depth) {
        getGles11Ext().glClearDepthxOES(depth);
    }

    /**
     * @param plane
     * @param equation
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glClipPlanexOES(int, int[], int)
     */
    public void glClipPlanexOES(int plane, int[] equation, int offset) {
        getGles11Ext().glClipPlanexOES(plane, equation, offset);
    }

    /**
     * @param plane
     * @param equation
     * @see gles.internal.GLES11ExtPipeline#glClipPlanexOES(int, java.nio.IntBuffer)
     */
    public void glClipPlanexOES(int plane, IntBuffer equation) {
        getGles11Ext().glClipPlanexOES(plane, equation);
    }

    /**
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @see gles.internal.GLES11ExtPipeline#glColor4xOES(int, int, int, int)
     */
    public void glColor4xOES(int red, int green, int blue, int alpha) {
        getGles11Ext().glColor4xOES(red, green, blue, alpha);
    }

    /**
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glDepthRangexOES(int, int)
     */
    public void glDepthRangexOES(int zNear, int zFar) {
        getGles11Ext().glDepthRangexOES(zNear, zFar);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glFogxOES(int, int)
     */
    public void glFogxOES(int pname, int param) {
        getGles11Ext().glFogxOES(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glFogxvOES(int, int[], int)
     */
    public void glFogxvOES(int pname, int[] params, int offset) {
        getGles11Ext().glFogxvOES(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glFogxvOES(int, java.nio.IntBuffer)
     */
    public void glFogxvOES(int pname, IntBuffer params) {
        getGles11Ext().glFogxvOES(pname, params);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glFrustumxOES(int, int, int, int, int, int)
     */
    public void glFrustumxOES(int left, int right, int bottom, int top, int zNear, int zFar) {
        getGles11Ext().glFrustumxOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param pname
     * @param eqn
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetClipPlanexOES(int, int[], int)
     */
    public void glGetClipPlanexOES(int pname, int[] eqn, int offset) {
        getGles11Ext().glGetClipPlanexOES(pname, eqn, offset);
    }

    /**
     * @param pname
     * @param eqn
     * @see gles.internal.GLES11ExtPipeline#glGetClipPlanexOES(int, java.nio.IntBuffer)
     */
    public void glGetClipPlanexOES(int pname, IntBuffer eqn) {
        getGles11Ext().glGetClipPlanexOES(pname, eqn);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetFixedvOES(int, int[], int)
     */
    public void glGetFixedvOES(int pname, int[] params, int offset) {
        getGles11Ext().glGetFixedvOES(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetFixedvOES(int, java.nio.IntBuffer)
     */
    public void glGetFixedvOES(int pname, IntBuffer params) {
        getGles11Ext().glGetFixedvOES(pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetLightxvOES(int, int, int[], int)
     */
    public void glGetLightxvOES(int light, int pname, int[] params, int offset) {
        getGles11Ext().glGetLightxvOES(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetLightxvOES(int, int, java.nio.IntBuffer)
     */
    public void glGetLightxvOES(int light, int pname, IntBuffer params) {
        getGles11Ext().glGetLightxvOES(light, pname, params);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetMaterialxvOES(int, int, int[], int)
     */
    public void glGetMaterialxvOES(int face, int pname, int[] params, int offset) {
        getGles11Ext().glGetMaterialxvOES(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetMaterialxvOES(int, int, java.nio.IntBuffer)
     */
    public void glGetMaterialxvOES(int face, int pname, IntBuffer params) {
        getGles11Ext().glGetMaterialxvOES(face, pname, params);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetTexEnvxvOES(int, int, int[], int)
     */
    public void glGetTexEnvxvOES(int envir, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexEnvxvOES(envir, pname, params, offset);
    }

    /**
     * @param envir
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetTexEnvxvOES(int, int, java.nio.IntBuffer)
     */
    public void glGetTexEnvxvOES(int envir, int pname, IntBuffer params) {
        getGles11Ext().glGetTexEnvxvOES(envir, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetTexParameterxvOES(int, int, int[], int)
     */
    public void glGetTexParameterxvOES(int target, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetTexParameterxvOES(int, int, java.nio.IntBuffer)
     */
    public void glGetTexParameterxvOES(int target, int pname, IntBuffer params) {
        getGles11Ext().glGetTexParameterxvOES(target, pname, params);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glLightModelxOES(int, int)
     */
    public void glLightModelxOES(int pname, int param) {
        getGles11Ext().glLightModelxOES(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glLightModelxvOES(int, int[], int)
     */
    public void glLightModelxvOES(int pname, int[] params, int offset) {
        getGles11Ext().glLightModelxvOES(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glLightModelxvOES(int, java.nio.IntBuffer)
     */
    public void glLightModelxvOES(int pname, IntBuffer params) {
        getGles11Ext().glLightModelxvOES(pname, params);
    }

    /**
     * @param light
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glLightxOES(int, int, int)
     */
    public void glLightxOES(int light, int pname, int param) {
        getGles11Ext().glLightxOES(light, pname, param);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glLightxvOES(int, int, int[], int)
     */
    public void glLightxvOES(int light, int pname, int[] params, int offset) {
        getGles11Ext().glLightxvOES(light, pname, params, offset);
    }

    /**
     * @param light
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glLightxvOES(int, int, java.nio.IntBuffer)
     */
    public void glLightxvOES(int light, int pname, IntBuffer params) {
        getGles11Ext().glLightxvOES(light, pname, params);
    }

    /**
     * @param width
     * @see gles.internal.GLES11ExtPipeline#glLineWidthxOES(int)
     */
    public void glLineWidthxOES(int width) {
        getGles11Ext().glLineWidthxOES(width);
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glLoadMatrixxOES(int[], int)
     */
    public void glLoadMatrixxOES(int[] m, int offset) {
        getGles11Ext().glLoadMatrixxOES(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES11ExtPipeline#glLoadMatrixxOES(java.nio.IntBuffer)
     */
    public void glLoadMatrixxOES(IntBuffer m) {
        getGles11Ext().glLoadMatrixxOES(m);
    }

    /**
     * @param face
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glMaterialxOES(int, int, int)
     */
    public void glMaterialxOES(int face, int pname, int param) {
        getGles11Ext().glMaterialxOES(face, pname, param);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glMaterialxvOES(int, int, int[], int)
     */
    public void glMaterialxvOES(int face, int pname, int[] params, int offset) {
        getGles11Ext().glMaterialxvOES(face, pname, params, offset);
    }

    /**
     * @param face
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glMaterialxvOES(int, int, java.nio.IntBuffer)
     */
    public void glMaterialxvOES(int face, int pname, IntBuffer params) {
        getGles11Ext().glMaterialxvOES(face, pname, params);
    }

    /**
     * @param m
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glMultMatrixxOES(int[], int)
     */
    public void glMultMatrixxOES(int[] m, int offset) {
        getGles11Ext().glMultMatrixxOES(m, offset);
    }

    /**
     * @param m
     * @see gles.internal.GLES11ExtPipeline#glMultMatrixxOES(java.nio.IntBuffer)
     */
    public void glMultMatrixxOES(IntBuffer m) {
        getGles11Ext().glMultMatrixxOES(m);
    }

    /**
     * @param target
     * @param s
     * @param t
     * @param r
     * @param q
     * @see gles.internal.GLES11ExtPipeline#glMultiTexCoord4xOES(int, int, int, int, int)
     */
    public void glMultiTexCoord4xOES(int target, int s, int t, int r, int q) {
        getGles11Ext().glMultiTexCoord4xOES(target, s, t, r, q);
    }

    /**
     * @param nx
     * @param ny
     * @param nz
     * @see gles.internal.GLES11ExtPipeline#glNormal3xOES(int, int, int)
     */
    public void glNormal3xOES(int nx, int ny, int nz) {
        getGles11Ext().glNormal3xOES(nx, ny, nz);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glOrthoxOES(int, int, int, int, int, int)
     */
    public void glOrthoxOES(int left, int right, int bottom, int top, int zNear, int zFar) {
        getGles11Ext().glOrthoxOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glPointParameterxOES(int, int)
     */
    public void glPointParameterxOES(int pname, int param) {
        getGles11Ext().glPointParameterxOES(pname, param);
    }

    /**
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glPointParameterxvOES(int, int[], int)
     */
    public void glPointParameterxvOES(int pname, int[] params, int offset) {
        getGles11Ext().glPointParameterxvOES(pname, params, offset);
    }

    /**
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glPointParameterxvOES(int, java.nio.IntBuffer)
     */
    public void glPointParameterxvOES(int pname, IntBuffer params) {
        getGles11Ext().glPointParameterxvOES(pname, params);
    }

    /**
     * @param size
     * @see gles.internal.GLES11ExtPipeline#glPointSizexOES(int)
     */
    public void glPointSizexOES(int size) {
        getGles11Ext().glPointSizexOES(size);
    }

    /**
     * @param factor
     * @param units
     * @see gles.internal.GLES11ExtPipeline#glPolygonOffsetxOES(int, int)
     */
    public void glPolygonOffsetxOES(int factor, int units) {
        getGles11Ext().glPolygonOffsetxOES(factor, units);
    }

    /**
     * @param angle
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES11ExtPipeline#glRotatexOES(int, int, int, int)
     */
    public void glRotatexOES(int angle, int x, int y, int z) {
        getGles11Ext().glRotatexOES(angle, x, y, z);
    }

    /**
     * @param value
     * @param invert
     * @see gles.internal.GLES11ExtPipeline#glSampleCoveragexOES(int, boolean)
     */
    public void glSampleCoveragexOES(int value, boolean invert) {
        getGles11Ext().glSampleCoveragexOES(value, invert);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES11ExtPipeline#glScalexOES(int, int, int)
     */
    public void glScalexOES(int x, int y, int z) {
        getGles11Ext().glScalexOES(x, y, z);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glTexEnvxOES(int, int, int)
     */
    public void glTexEnvxOES(int target, int pname, int param) {
        getGles11Ext().glTexEnvxOES(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glTexEnvxvOES(int, int, int[], int)
     */
    public void glTexEnvxvOES(int target, int pname, int[] params, int offset) {
        getGles11Ext().glTexEnvxvOES(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glTexEnvxvOES(int, int, java.nio.IntBuffer)
     */
    public void glTexEnvxvOES(int target, int pname, IntBuffer params) {
        getGles11Ext().glTexEnvxvOES(target, pname, params);
    }

    /**
     * @param target
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glTexParameterxOES(int, int, int)
     */
    public void glTexParameterxOES(int target, int pname, int param) {
        getGles11Ext().glTexParameterxOES(target, pname, param);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glTexParameterxvOES(int, int, int[], int)
     */
    public void glTexParameterxvOES(int target, int pname, int[] params, int offset) {
        getGles11Ext().glTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glTexParameterxvOES(int, int, java.nio.IntBuffer)
     */
    public void glTexParameterxvOES(int target, int pname, IntBuffer params) {
        getGles11Ext().glTexParameterxvOES(target, pname, params);
    }

    /**
     * @param x
     * @param y
     * @param z
     * @see gles.internal.GLES11ExtPipeline#glTranslatexOES(int, int, int)
     */
    public void glTranslatexOES(int x, int y, int z) {
        getGles11Ext().glTranslatexOES(x, y, z);
    }

    /**
     * @param renderbuffer
     * @return
     * @see gles.internal.GLES11ExtPipeline#glIsRenderbufferOES(int)
     */
    public boolean glIsRenderbufferOES(int renderbuffer) {
        return getGles11Ext().glIsRenderbufferOES(renderbuffer);
    }

    /**
     * @param target
     * @param renderbuffer
     * @see gles.internal.GLES11ExtPipeline#glBindRenderbufferOES(int, int)
     */
    public void glBindRenderbufferOES(int target, int renderbuffer) {
        getGles11Ext().glBindRenderbufferOES(target, renderbuffer);
    }

    /**
     * @param n
     * @param renderbuffers
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDeleteRenderbuffersOES(int, int[], int)
     */
    public void glDeleteRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        getGles11Ext().glDeleteRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * @param n
     * @param renderbuffers
     * @see gles.internal.GLES11ExtPipeline#glDeleteRenderbuffersOES(int, java.nio.IntBuffer)
     */
    public void glDeleteRenderbuffersOES(int n, IntBuffer renderbuffers) {
        getGles11Ext().glDeleteRenderbuffersOES(n, renderbuffers);
    }

    /**
     * @param n
     * @param renderbuffers
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGenRenderbuffersOES(int, int[], int)
     */
    public void glGenRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        getGles11Ext().glGenRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * @param n
     * @param renderbuffers
     * @see gles.internal.GLES11ExtPipeline#glGenRenderbuffersOES(int, java.nio.IntBuffer)
     */
    public void glGenRenderbuffersOES(int n, IntBuffer renderbuffers) {
        getGles11Ext().glGenRenderbuffersOES(n, renderbuffers);
    }

    /**
     * @param target
     * @param internalformat
     * @param width
     * @param height
     * @see gles.internal.GLES11ExtPipeline#glRenderbufferStorageOES(int, int, int, int)
     */
    public void glRenderbufferStorageOES(int target, int internalformat, int width, int height) {
        getGles11Ext().glRenderbufferStorageOES(target, internalformat, width, height);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetRenderbufferParameterivOES(int, int, int[], int)
     */
    public void glGetRenderbufferParameterivOES(int target, int pname, int[] params, int offset) {
        getGles11Ext().glGetRenderbufferParameterivOES(target, pname, params, offset);
    }

    /**
     * @param target
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetRenderbufferParameterivOES(int, int, java.nio.IntBuffer)
     */
    public void glGetRenderbufferParameterivOES(int target, int pname, IntBuffer params) {
        getGles11Ext().glGetRenderbufferParameterivOES(target, pname, params);
    }

    /**
     * @param framebuffer
     * @return
     * @see gles.internal.GLES11ExtPipeline#glIsFramebufferOES(int)
     */
    public boolean glIsFramebufferOES(int framebuffer) {
        return getGles11Ext().glIsFramebufferOES(framebuffer);
    }

    /**
     * @param target
     * @param framebuffer
     * @see gles.internal.GLES11ExtPipeline#glBindFramebufferOES(int, int)
     */
    public void glBindFramebufferOES(int target, int framebuffer) {
        getGles11Ext().glBindFramebufferOES(target, framebuffer);
    }

    /**
     * @param n
     * @param framebuffers
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glDeleteFramebuffersOES(int, int[], int)
     */
    public void glDeleteFramebuffersOES(int n, int[] framebuffers, int offset) {
        getGles11Ext().glDeleteFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * @param n
     * @param framebuffers
     * @see gles.internal.GLES11ExtPipeline#glDeleteFramebuffersOES(int, java.nio.IntBuffer)
     */
    public void glDeleteFramebuffersOES(int n, IntBuffer framebuffers) {
        getGles11Ext().glDeleteFramebuffersOES(n, framebuffers);
    }

    /**
     * @param n
     * @param framebuffers
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGenFramebuffersOES(int, int[], int)
     */
    public void glGenFramebuffersOES(int n, int[] framebuffers, int offset) {
        getGles11Ext().glGenFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * @param n
     * @param framebuffers
     * @see gles.internal.GLES11ExtPipeline#glGenFramebuffersOES(int, java.nio.IntBuffer)
     */
    public void glGenFramebuffersOES(int n, IntBuffer framebuffers) {
        getGles11Ext().glGenFramebuffersOES(n, framebuffers);
    }

    /**
     * @param target
     * @return
     * @see gles.internal.GLES11ExtPipeline#glCheckFramebufferStatusOES(int)
     */
    public int glCheckFramebufferStatusOES(int target) {
        return getGles11Ext().glCheckFramebufferStatusOES(target);
    }

    /**
     * @param target
     * @param attachment
     * @param renderbuffertarget
     * @param renderbuffer
     * @see gles.internal.GLES11ExtPipeline#glFramebufferRenderbufferOES(int, int, int, int)
     */
    public void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        getGles11Ext().glFramebufferRenderbufferOES(target, attachment, renderbuffertarget, renderbuffer);
    }

    /**
     * @param target
     * @param attachment
     * @param textarget
     * @param texture
     * @param level
     * @see gles.internal.GLES11ExtPipeline#glFramebufferTexture2DOES(int, int, int, int, int)
     */
    public void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level) {
        getGles11Ext().glFramebufferTexture2DOES(target, attachment, textarget, texture, level);
    }

    /**
     * @param target
     * @param attachment
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetFramebufferAttachmentParameterivOES(int, int, int, int[], int)
     */
    public void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, int[] params, int offset) {
        getGles11Ext().glGetFramebufferAttachmentParameterivOES(target, attachment, pname, params, offset);
    }

    /**
     * @param target
     * @param attachment
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetFramebufferAttachmentParameterivOES(int, int, int, java.nio.IntBuffer)
     */
    public void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, IntBuffer params) {
        getGles11Ext().glGetFramebufferAttachmentParameterivOES(target, attachment, pname, params);
    }

    /**
     * @param target
     * @see gles.internal.GLES11ExtPipeline#glGenerateMipmapOES(int)
     */
    public void glGenerateMipmapOES(int target) {
        getGles11Ext().glGenerateMipmapOES(target);
    }

    /**
     * @param matrixpaletteindex
     * @see gles.internal.GLES11ExtPipeline#glCurrentPaletteMatrixOES(int)
     */
    public void glCurrentPaletteMatrixOES(int matrixpaletteindex) {
        getGles11Ext().glCurrentPaletteMatrixOES(matrixpaletteindex);
    }

    /**
     * 
     * @see gles.internal.GLES11ExtPipeline#glLoadPaletteFromModelViewMatrixOES()
     */
    public void glLoadPaletteFromModelViewMatrixOES() {
        getGles11Ext().glLoadPaletteFromModelViewMatrixOES();
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES11ExtPipeline#glMatrixIndexPointerOESBounds(int, int, int, java.nio.Buffer, int)
     */
    public void glMatrixIndexPointerOESBounds(int size, int type, int stride, Buffer pointer, int remaining) {
        getGles11Ext().glMatrixIndexPointerOESBounds(size, type, stride, pointer, remaining);
    }

    /**
     * @param size
     * @param type
     * @param stride
     * @param pointer
     * @param remaining
     * @see gles.internal.GLES11ExtPipeline#glWeightPointerOESBounds(int, int, int, java.nio.Buffer, int)
     */
    public void glWeightPointerOESBounds(int size, int type, int stride, Buffer pointer, int remaining) {
        getGles11Ext().glWeightPointerOESBounds(size, type, stride, pointer, remaining);
    }

    /**
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glDepthRangefOES(float, float)
     */
    public void glDepthRangefOES(float zNear, float zFar) {
        getGles11Ext().glDepthRangefOES(zNear, zFar);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glFrustumfOES(float, float, float, float, float, float)
     */
    public void glFrustumfOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        getGles11Ext().glFrustumfOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param left
     * @param right
     * @param bottom
     * @param top
     * @param zNear
     * @param zFar
     * @see gles.internal.GLES11ExtPipeline#glOrthofOES(float, float, float, float, float, float)
     */
    public void glOrthofOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        getGles11Ext().glOrthofOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * @param plane
     * @param equation
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glClipPlanefOES(int, float[], int)
     */
    public void glClipPlanefOES(int plane, float[] equation, int offset) {
        getGles11Ext().glClipPlanefOES(plane, equation, offset);
    }

    /**
     * @param plane
     * @param equation
     * @see gles.internal.GLES11ExtPipeline#glClipPlanefOES(int, java.nio.FloatBuffer)
     */
    public void glClipPlanefOES(int plane, FloatBuffer equation) {
        getGles11Ext().glClipPlanefOES(plane, equation);
    }

    /**
     * @param pname
     * @param eqn
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetClipPlanefOES(int, float[], int)
     */
    public void glGetClipPlanefOES(int pname, float[] eqn, int offset) {
        getGles11Ext().glGetClipPlanefOES(pname, eqn, offset);
    }

    /**
     * @param pname
     * @param eqn
     * @see gles.internal.GLES11ExtPipeline#glGetClipPlanefOES(int, java.nio.FloatBuffer)
     */
    public void glGetClipPlanefOES(int pname, FloatBuffer eqn) {
        getGles11Ext().glGetClipPlanefOES(pname, eqn);
    }

    /**
     * @param depth
     * @see gles.internal.GLES11ExtPipeline#glClearDepthfOES(float)
     */
    public void glClearDepthfOES(float depth) {
        getGles11Ext().glClearDepthfOES(depth);
    }

    /**
     * @param coord
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glTexGenfOES(int, int, float)
     */
    public void glTexGenfOES(int coord, int pname, float param) {
        getGles11Ext().glTexGenfOES(coord, pname, param);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glTexGenfvOES(int, int, float[], int)
     */
    public void glTexGenfvOES(int coord, int pname, float[] params, int offset) {
        getGles11Ext().glTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glTexGenfvOES(int, int, java.nio.FloatBuffer)
     */
    public void glTexGenfvOES(int coord, int pname, FloatBuffer params) {
        getGles11Ext().glTexGenfvOES(coord, pname, params);
    }

    /**
     * @param coord
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glTexGeniOES(int, int, int)
     */
    public void glTexGeniOES(int coord, int pname, int param) {
        getGles11Ext().glTexGeniOES(coord, pname, param);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glTexGenivOES(int, int, int[], int)
     */
    public void glTexGenivOES(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glTexGenivOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glTexGenivOES(int, int, java.nio.IntBuffer)
     */
    public void glTexGenivOES(int coord, int pname, IntBuffer params) {
        getGles11Ext().glTexGenivOES(coord, pname, params);
    }

    /**
     * @param coord
     * @param pname
     * @param param
     * @see gles.internal.GLES11ExtPipeline#glTexGenxOES(int, int, int)
     */
    public void glTexGenxOES(int coord, int pname, int param) {
        getGles11Ext().glTexGenxOES(coord, pname, param);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glTexGenxvOES(int, int, int[], int)
     */
    public void glTexGenxvOES(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glTexGenxvOES(int, int, java.nio.IntBuffer)
     */
    public void glTexGenxvOES(int coord, int pname, IntBuffer params) {
        getGles11Ext().glTexGenxvOES(coord, pname, params);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenfvOES(int, int, float[], int)
     */
    public void glGetTexGenfvOES(int coord, int pname, float[] params, int offset) {
        getGles11Ext().glGetTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenfvOES(int, int, java.nio.FloatBuffer)
     */
    public void glGetTexGenfvOES(int coord, int pname, FloatBuffer params) {
        getGles11Ext().glGetTexGenfvOES(coord, pname, params);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenivOES(int, int, int[], int)
     */
    public void glGetTexGenivOES(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexGenivOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenivOES(int, int, java.nio.IntBuffer)
     */
    public void glGetTexGenivOES(int coord, int pname, IntBuffer params) {
        getGles11Ext().glGetTexGenivOES(coord, pname, params);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @param offset
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenxvOES(int, int, int[], int)
     */
    public void glGetTexGenxvOES(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * @param coord
     * @param pname
     * @param params
     * @see gles.internal.GLES11ExtPipeline#glGetTexGenxvOES(int, int, java.nio.IntBuffer)
     */
    public void glGetTexGenxvOES(int coord, int pname, IntBuffer params) {
        getGles11Ext().glGetTexGenxvOES(coord, pname, params);
    }

    @Override
    public void glMatrixIndexPointerOES(int size, int type, int stride, Buffer pointer) {
        getGles11Ext().glMatrixIndexPointerOESBounds(size, type, stride, pointer, pointer.remaining());       
    }

    @Override
    public void glMatrixIndexPointerOES(int size, int type, int stride, int offset) {
        getGles11Ext().glMatrixIndexPointerOES(size, type, stride, offset);
        
    }

    @Override
    public void glWeightPointerOES(int size, int type, int stride, Buffer pointer) {
        getGles11Ext().glWeightPointerOESBounds(size, type, stride, pointer, pointer.remaining());        
    }

    @Override
    public void glWeightPointerOES(int size, int type, int stride, int offset) {
        getGles11Ext().glWeightPointerOESBounds(size, type, stride, offset); 
        
    }

    @Override
    public void glGetPointerv(int pname, Buffer[] params) {
        throw new UnsupportedOperationException("glGetPointerv");        
    }

    @Override
    public void glPointSizePointerOES(int type, int stride, Buffer pointer) {
        glPointSizePointerOESBounds(
                type,
                stride,
                pointer,
                pointer.remaining()
            );
            if (((type == GL_FLOAT) ||
                 (type == GL_FIXED)) &&
                (stride >= 0)) {
                _pointSizePointerOES = pointer;
            }
        
    }

    @Override
    public void glBlendEquation(int mode) {
        getGles11Ext().glBlendEquationOES(mode);        
    }

    @Override
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
       getGles11Ext().glBlendEquationSeparateOES(modeRGB, modeAlpha);        
    }

    @Override
    public void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        getGles11Ext().glBlendFuncSeparateOES(srcRGB, dstRGB, srcAlpha, dstAlpha);        
    }

    @Override
    public void glGetTexGenfv(int coord, int pname, float[] params, int offset) {
        getGles11Ext().glGetTexGenfvOES(coord, pname, params, offset);
    }

    @Override
    public void glGetTexGenfv(int coord, int pname, FloatBuffer params) {
        getGles11Ext().glGetTexGenfvOES(coord, pname, params);
        
    }

    @Override
    public void glGetTexGeniv(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexGenivOES(coord, pname, params, offset);        
    }

    @Override
    public void glGetTexGeniv(int coord, int pname, IntBuffer params) {
        getGles11Ext().glGetTexGenivOES(coord, pname, params);
        
    }

    @Override
    public void glGetTexGenxv(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glGetTexGenxvOES(coord, pname, params, offset);
        
    }

    @Override
    public void glGetTexGenxv(int coord, int pname, IntBuffer params) {
        getGles11Ext().glGetTexGenxvOES(coord, pname, params);
        
    }

    @Override
    public void glTexGenf(int coord, int pname, float param) {
        getGles11Ext().glTexGenfOES(coord, pname, param);
    }

    @Override
    public void glTexGenfv(int coord, int pname, float[] params, int offset) {
        getGles11Ext().glTexGenfvOES(coord, pname, params, offset);        
    }

    @Override
    public void glTexGenfv(int coord, int pname, FloatBuffer params) {
        getGles11Ext().glTexGenfvOES(coord, pname, params);        
    }

    @Override
    public void glTexGeni(int coord, int pname, int param) {
        getGles11Ext().glTexGeniOES(coord, pname, param);        
    }

    @Override
    public void glTexGeniv(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glTexGenivOES(coord, pname, params, offset);        
    }

    @Override
    public void glTexGeniv(int coord, int pname, IntBuffer params) {
        getGles11Ext().glTexGenivOES(coord, pname, params);        
    }

    @Override
    public void glTexGenx(int coord, int pname, int param) {
        getGles11Ext().glTexGenxOES(coord, pname, param);
        
    }

    @Override
    public void glTexGenxv(int coord, int pname, int[] params, int offset) {
        getGles11Ext().glTexGenxvOES(coord, pname, params, offset);        
    }

    @Override
    public void glTexGenxv(int coord, int pname, IntBuffer params) {
        getGles11Ext().glTexGenxvOES(coord, pname, params);
    }
    
}
