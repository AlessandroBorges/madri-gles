/*

**    Place holder for disclaimer.
*/

package android.opengl;

import gles.internal.GLES11ExtPipeline;
import gles.internal.Sys;

import java.nio.Buffer;

public class GLES11Ext
	extends GLES11{

    public static final int GL_BLEND_EQUATION_RGB_OES = 0x8009;

    public static final int GL_BLEND_EQUATION_ALPHA_OES = 0x883D;

    public static final int GL_BLEND_DST_RGB_OES = 0x80C8;

    public static final int GL_BLEND_SRC_RGB_OES = 0x80C9;

    public static final int GL_BLEND_DST_ALPHA_OES = 0x80CA;

    public static final int GL_BLEND_SRC_ALPHA_OES = 0x80CB;

    public static final int GL_BLEND_EQUATION_OES = 0x8009;

    public static final int GL_FUNC_ADD_OES = 0x8006;

    public static final int GL_FUNC_SUBTRACT_OES = 0x800A;

    public static final int GL_FUNC_REVERSE_SUBTRACT_OES = 0x800B;

    public static final int GL_ETC1_RGB8_OES = 0x8D64;

    public static final int GL_DEPTH_COMPONENT24_OES = 0x81A6;

    public static final int GL_DEPTH_COMPONENT32_OES = 0x81A7;

    public static final int GL_TEXTURE_CROP_RECT_OES = 0x8B9D;

    public static final int GL_FIXED_OES = 0x140C;

    public static final int GL_NONE_OES = 0;

    public static final int GL_FRAMEBUFFER_OES = 0x8D40;

    public static final int GL_RENDERBUFFER_OES = 0x8D41;

    public static final int GL_RGBA4_OES = 0x8056;

    public static final int GL_RGB5_A1_OES = 0x8057;

    public static final int GL_RGB565_OES = 0x8D62;

    public static final int GL_DEPTH_COMPONENT16_OES = 0x81A5;

    public static final int GL_RENDERBUFFER_WIDTH_OES = 0x8D42;

    public static final int GL_RENDERBUFFER_HEIGHT_OES = 0x8D43;

    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 0x8D44;

    public static final int GL_RENDERBUFFER_RED_SIZE_OES = 0x8D50;

    public static final int GL_RENDERBUFFER_GREEN_SIZE_OES = 0x8D51;

    public static final int GL_RENDERBUFFER_BLUE_SIZE_OES = 0x8D52;

    public static final int GL_RENDERBUFFER_ALPHA_SIZE_OES = 0x8D53;

    public static final int GL_RENDERBUFFER_DEPTH_SIZE_OES = 0x8D54;

    public static final int GL_RENDERBUFFER_STENCIL_SIZE_OES = 0x8D55;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 0x8CD0;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 0x8CD1;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 0x8CD2;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 0x8CD3;

    public static final int GL_COLOR_ATTACHMENT0_OES = 0x8CE0;

    public static final int GL_DEPTH_ATTACHMENT_OES = 0x8D00;

    public static final int GL_STENCIL_ATTACHMENT_OES = 0x8D20;

    public static final int GL_FRAMEBUFFER_COMPLETE_OES = 0x8CD5;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 0x8CD6;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 0x8CD7;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 0x8CD9;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 0x8CDA;

    public static final int GL_FRAMEBUFFER_UNSUPPORTED_OES = 0x8CDD;

    public static final int GL_FRAMEBUFFER_BINDING_OES = 0x8CA6;

    public static final int GL_RENDERBUFFER_BINDING_OES = 0x8CA7;

    public static final int GL_MAX_RENDERBUFFER_SIZE_OES = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION_OES = 0x0506;

    public static final int GL_WRITE_ONLY_OES = 0x88B9;

    public static final int GL_BUFFER_ACCESS_OES = 0x88BB;

    public static final int GL_BUFFER_MAPPED_OES = 0x88BC;

    public static final int GL_BUFFER_MAP_POINTER_OES = 0x88BD;

    public static final int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES = 0x898D;

    public static final int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES = 0x898E;

    public static final int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES = 0x898F;

    public static final int GL_MAX_VERTEX_UNITS_OES = 0x86A4;

    public static final int GL_MAX_PALETTE_MATRICES_OES = 0x8842;

    public static final int GL_MATRIX_PALETTE_OES = 0x8840;

    public static final int GL_MATRIX_INDEX_ARRAY_OES = 0x8844;

    public static final int GL_WEIGHT_ARRAY_OES = 0x86AD;

    public static final int GL_CURRENT_PALETTE_MATRIX_OES = 0x8843;

    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_OES = 0x8846;

    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_OES = 0x8847;

    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 0x8848;

    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_OES = 0x8849;

    public static final int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 0x8B9E;

    public static final int GL_WEIGHT_ARRAY_SIZE_OES = 0x86AB;

    public static final int GL_WEIGHT_ARRAY_TYPE_OES = 0x86A9;

    public static final int GL_WEIGHT_ARRAY_STRIDE_OES = 0x86AA;

    public static final int GL_WEIGHT_ARRAY_POINTER_OES = 0x86AC;

    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 0x889E;

    public static final int GL_DEPTH_STENCIL_OES = 0x84F9;

    public static final int GL_UNSIGNED_INT_24_8_OES = 0x84FA;

    public static final int GL_DEPTH24_STENCIL8_OES = 0x88F0;

    public static final int GL_RGB8_OES = 0x8051;

    public static final int GL_RGBA8_OES = 0x8058;

    public static final int GL_STENCIL_INDEX1_OES = 0x8D46;

    public static final int GL_STENCIL_INDEX4_OES = 0x8D47;

    public static final int GL_STENCIL_INDEX8_OES = 0x8D48;

    public static final int GL_INCR_WRAP_OES = 0x8507;

    public static final int GL_DECR_WRAP_OES = 0x8508;

    public static final int GL_NORMAL_MAP_OES = 0x8511;

    public static final int GL_REFLECTION_MAP_OES = 0x8512;

    public static final int GL_TEXTURE_CUBE_MAP_OES = 0x8513;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP_OES = 0x8514;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X_OES = 0x8515;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_OES = 0x8516;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_OES = 0x8517;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_OES = 0x8518;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_OES = 0x8519;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_OES = 0x851A;

    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE_OES = 0x851C;

    public static final int GL_TEXTURE_GEN_MODE_OES = 0x2500;

    public static final int GL_TEXTURE_GEN_STR_OES = 0x8D60;

    public static final int GL_MIRRORED_REPEAT_OES = 0x8370;

    public static final int GL_3DC_X_AMD = 0x87F9;

    public static final int GL_3DC_XY_AMD = 0x87FA;

    public static final int GL_ATC_RGB_AMD = 0x8C92;

    public static final int GL_ATC_RGBA_EXPLICIT_ALPHA_AMD = 0x8C93;

    public static final int GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD = 0x87EE;

    public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE;

    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF;

    public static final int GL_BGRA = 0x80E1;

    public static final int GL_TEXTURE_EXTERNAL_OES = 0x8D65;

    public static final int GL_SAMPLER_EXTERNAL_OES = 0x8D66;

    public static final int GL_TEXTURE_BINDING_EXTERNAL_OES = 0x8D67;

    public static final int GL_REQUIRED_TEXTURE_IMAGE_UNITS_OES = 0x8D68;

    
	private static GLES11ExtPipeline pipeline;
    
    private static GLES11ExtPipeline getPipeline(){
    	if(pipeline==null){
    		pipeline = (GLES11ExtPipeline) Sys.getPipelineInstance(Sys.GL_PIPE.GLES11Ext);
    	}
    	return pipeline;
    }
    
    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext._nativeClassInit();
     * 
     *  C function void glBlendEquationSeparateOES ( GLenum modeRGB, GLenum modeAlpha )

     * */
    private static void nativeClassInit() {
        getPipeline().GLES11ExtClassInit();
    }

    static {
        nativeClassInit();
    }

    private static final int GL_BYTE = GLES10.GL_BYTE;

    private static final int GL_FIXED = GLES10.GL_FIXED;

    private static final int GL_FLOAT = GLES10.GL_FLOAT;

    private static final int GL_SHORT = GLES10.GL_SHORT;

    /**
     * TODO remove this
     */
    private static Buffer _matrixIndexPointerOES;

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glBlendEquationSeparateOES([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparateOES ( GLenum modeRGB, GLenum modeAlpha )

     * */
    public static void glBlendEquationSeparateOES(int modeRGB, int modeAlpha) {
        getPipeline().glBlendEquationSeparateOES(modeRGB, modeAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glBlendFuncSeparateOES([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparateOES ( GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha )

     * */
    public static void glBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        getPipeline().glBlendFuncSeparateOES(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glBlendEquationOES([int mode]);
     * 
     *  C function void glBlendEquationOES ( GLenum mode )

     * */
    public static void glBlendEquationOES(int mode) {
        getPipeline().glBlendEquationOES(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexsOES([short x, short y, short z, short width, short height]);
     * 
     *  C function void glDrawTexsOES ( GLshort x, GLshort y, GLshort z, GLshort width, GLshort height )

     * */
    public static void glDrawTexsOES(short x, short y, short z, short width, short height) {
        getPipeline().glDrawTexsOES(x, y, z, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexiOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexiOES ( GLint x, GLint y, GLint z, GLint width, GLint height )

     * */
    public static void glDrawTexiOES(int x, int y, int z, int width, int height) {
        getPipeline().glDrawTexiOES(x, y, z, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexxOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexxOES ( GLfixed x, GLfixed y, GLfixed z, GLfixed width, GLfixed height )

     * */
    public static void glDrawTexxOES(int x, int y, int z, int width, int height) {
        getPipeline().glDrawTexxOES(x, y, z, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexsvOES([short[] coords, int offset]);
     * 
     *  C function void glDrawTexsvOES ( const GLshort *coords )

     * */
    public static void glDrawTexsvOES(short[] coords, int offset) {
        getPipeline().glDrawTexsvOES(coords, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexsvOES([java.nio.ShortBuffer coords]);
     * 
     *  C function void glDrawTexsvOES ( const GLshort *coords )

     * */
    public static void glDrawTexsvOES(java.nio.ShortBuffer coords) {
        getPipeline().glDrawTexsvOES(coords);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexivOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexivOES ( const GLint *coords )

     * */
    public static void glDrawTexivOES(int[] coords, int offset) {
        getPipeline().glDrawTexivOES(coords, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexivOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexivOES ( const GLint *coords )

     * */
    public static void glDrawTexivOES(java.nio.IntBuffer coords) {
        getPipeline().glDrawTexivOES(coords);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexxvOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexxvOES ( const GLfixed *coords )

     * */
    public static void glDrawTexxvOES(int[] coords, int offset) {
        getPipeline().glDrawTexxvOES(coords, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexxvOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexxvOES ( const GLfixed *coords )

     * */
    public static void glDrawTexxvOES(java.nio.IntBuffer coords) {
        getPipeline().glDrawTexxvOES(coords);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexfOES([float x, float y, float z, float width, float height]);
     * 
     *  C function void glDrawTexfOES ( GLfloat x, GLfloat y, GLfloat z, GLfloat width, GLfloat height )

     * */
    public static void glDrawTexfOES(float x, float y, float z, float width, float height) {
        getPipeline().glDrawTexfOES(x, y, z, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexfvOES([float[] coords, int offset]);
     * 
     *  C function void glDrawTexfvOES ( const GLfloat *coords )

     * */
    public static void glDrawTexfvOES(float[] coords, int offset) {
        getPipeline().glDrawTexfvOES(coords, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDrawTexfvOES([java.nio.FloatBuffer coords]);
     * 
     *  C function void glDrawTexfvOES ( const GLfloat *coords )

     * */
    public static void glDrawTexfvOES(java.nio.FloatBuffer coords) {
        getPipeline().glDrawTexfvOES(coords);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glEGLImageTargetTexture2DOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetTexture2DOES ( GLenum target, GLeglImageOES image )

     * */
    public static void glEGLImageTargetTexture2DOES(int target, java.nio.Buffer image) {
        getPipeline().glEGLImageTargetTexture2DOES(target, image);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glEGLImageTargetRenderbufferStorageOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetRenderbufferStorageOES ( GLenum target, GLeglImageOES image )

     * */
    public static void glEGLImageTargetRenderbufferStorageOES(int target, java.nio.Buffer image) {
        getPipeline().glEGLImageTargetRenderbufferStorageOES(target, image);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glAlphaFuncxOES([int func, int ref]);
     * 
     *  C function void glAlphaFuncxOES ( GLenum func, GLclampx ref )

     * */
    public static void glAlphaFuncxOES(int func, int ref) {
        getPipeline().glAlphaFuncxOES(func, ref);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClearColorxOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorxOES ( GLclampx red, GLclampx green, GLclampx blue, GLclampx alpha )

     * */
    public static void glClearColorxOES(int red, int green, int blue, int alpha) {
        getPipeline().glClearColorxOES(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClearDepthxOES([int depth]);
     * 
     *  C function void glClearDepthxOES ( GLclampx depth )

     * */
    public static void glClearDepthxOES(int depth) {
        getPipeline().glClearDepthxOES(depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClipPlanexOES([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanexOES ( GLenum plane, const GLfixed *equation )

     * */
    public static void glClipPlanexOES(int plane, int[] equation, int offset) {
        getPipeline().glClipPlanexOES(plane, equation, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClipPlanexOES([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanexOES ( GLenum plane, const GLfixed *equation )

     * */
    public static void glClipPlanexOES(int plane, java.nio.IntBuffer equation) {
        getPipeline().glClipPlanexOES(plane, equation);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glColor4xOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4xOES ( GLfixed red, GLfixed green, GLfixed blue, GLfixed alpha )

     * */
    public static void glColor4xOES(int red, int green, int blue, int alpha) {
        getPipeline().glColor4xOES(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDepthRangexOES([int zNear, int zFar]);
     * 
     *  C function void glDepthRangexOES ( GLclampx zNear, GLclampx zFar )

     * */
    public static void glDepthRangexOES(int zNear, int zFar) {
        getPipeline().glDepthRangexOES(zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFogxOES([int pname, int param]);
     * 
     *  C function void glFogxOES ( GLenum pname, GLfixed param )

     * */
    public static void glFogxOES(int pname, int param) {
        getPipeline().glFogxOES(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFogxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glFogxvOES(int pname, int[] params, int offset) {
        getPipeline().glFogxvOES(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFogxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glFogxvOES(int pname, java.nio.IntBuffer params) {
        getPipeline().glFogxvOES(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFrustumxOES([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumxOES ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public static void glFrustumxOES(int left, int right, int bottom, int top, int zNear, int zFar) {
        getPipeline().glFrustumxOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetClipPlanexOES([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanexOES ( GLenum pname, GLfixed *eqn )

     * */
    public static void glGetClipPlanexOES(int pname, int[] eqn, int offset) {
        getPipeline().glGetClipPlanexOES(pname, eqn, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetClipPlanexOES([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanexOES ( GLenum pname, GLfixed *eqn )

     * */
    public static void glGetClipPlanexOES(int pname, java.nio.IntBuffer eqn) {
        getPipeline().glGetClipPlanexOES(pname, eqn);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetFixedvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedvOES ( GLenum pname, GLfixed *params )

     * */
    public static void glGetFixedvOES(int pname, int[] params, int offset) {
        getPipeline().glGetFixedvOES(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetFixedvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedvOES ( GLenum pname, GLfixed *params )

     * */
    public static void glGetFixedvOES(int pname, java.nio.IntBuffer params) {
        getPipeline().glGetFixedvOES(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxvOES ( GLenum light, GLenum pname, GLfixed *params )

     * */
    public static void glGetLightxvOES(int light, int pname, int[] params, int offset) {
        getPipeline().glGetLightxvOES(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxvOES ( GLenum light, GLenum pname, GLfixed *params )

     * */
    public static void glGetLightxvOES(int light, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetLightxvOES(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxvOES ( GLenum face, GLenum pname, GLfixed *params )

     * */
    public static void glGetMaterialxvOES(int face, int pname, int[] params, int offset) {
        getPipeline().glGetMaterialxvOES(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxvOES ( GLenum face, GLenum pname, GLfixed *params )

     * */
    public static void glGetMaterialxvOES(int face, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetMaterialxvOES(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexEnvxvOES([int env, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxvOES ( GLenum env, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexEnvxvOES(int env, int pname, int[] params, int offset) {
        getPipeline().glGetTexEnvxvOES(env, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexEnvxvOES([int env, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxvOES ( GLenum env, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexEnvxvOES(int env, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetTexEnvxvOES(env, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxvOES ( GLenum target, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexParameterxvOES(int target, int pname, int[] params, int offset) {
        getPipeline().glGetTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxvOES ( GLenum target, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexParameterxvOES(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetTexParameterxvOES(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightModelxOES([int pname, int param]);
     * 
     *  C function void glLightModelxOES ( GLenum pname, GLfixed param )

     * */
    public static void glLightModelxOES(int pname, int param) {
        getPipeline().glLightModelxOES(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightModelxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glLightModelxvOES(int pname, int[] params, int offset) {
        getPipeline().glLightModelxvOES(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightModelxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glLightModelxvOES(int pname, java.nio.IntBuffer params) {
        getPipeline().glLightModelxvOES(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightxOES([int light, int pname, int param]);
     * 
     *  C function void glLightxOES ( GLenum light, GLenum pname, GLfixed param )

     * */
    public static void glLightxOES(int light, int pname, int param) {
        getPipeline().glLightxOES(light, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxvOES ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public static void glLightxvOES(int light, int pname, int[] params, int offset) {
        getPipeline().glLightxvOES(light, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxvOES ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public static void glLightxvOES(int light, int pname, java.nio.IntBuffer params) {
        getPipeline().glLightxvOES(light, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLineWidthxOES([int width]);
     * 
     *  C function void glLineWidthxOES ( GLfixed width )

     * */
    public static void glLineWidthxOES(int width) {
        getPipeline().glLineWidthxOES(width);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLoadMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixxOES ( const GLfixed *m )

     * */
    public static void glLoadMatrixxOES(int[] m, int offset) {
        getPipeline().glLoadMatrixxOES(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLoadMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixxOES ( const GLfixed *m )

     * */
    public static void glLoadMatrixxOES(java.nio.IntBuffer m) {
        getPipeline().glLoadMatrixxOES(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMaterialxOES([int face, int pname, int param]);
     * 
     *  C function void glMaterialxOES ( GLenum face, GLenum pname, GLfixed param )

     * */
    public static void glMaterialxOES(int face, int pname, int param) {
        getPipeline().glMaterialxOES(face, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxvOES ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public static void glMaterialxvOES(int face, int pname, int[] params, int offset) {
        getPipeline().glMaterialxvOES(face, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxvOES ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public static void glMaterialxvOES(int face, int pname, java.nio.IntBuffer params) {
        getPipeline().glMaterialxvOES(face, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMultMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glMultMatrixxOES ( const GLfixed *m )

     * */
    public static void glMultMatrixxOES(int[] m, int offset) {
        getPipeline().glMultMatrixxOES(m, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMultMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixxOES ( const GLfixed *m )

     * */
    public static void glMultMatrixxOES(java.nio.IntBuffer m) {
        getPipeline().glMultMatrixxOES(m);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMultiTexCoord4xOES([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4xOES ( GLenum target, GLfixed s, GLfixed t, GLfixed r, GLfixed q )

     * */
    public static void glMultiTexCoord4xOES(int target, int s, int t, int r, int q) {
        getPipeline().glMultiTexCoord4xOES(target, s, t, r, q);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glNormal3xOES([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3xOES ( GLfixed nx, GLfixed ny, GLfixed nz )

     * */
    public static void glNormal3xOES(int nx, int ny, int nz) {
        getPipeline().glNormal3xOES(nx, ny, nz);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glOrthoxOES([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glOrthoxOES ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public static void glOrthoxOES(int left, int right, int bottom, int top, int zNear, int zFar) {
        getPipeline().glOrthoxOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glPointParameterxOES([int pname, int param]);
     * 
     *  C function void glPointParameterxOES ( GLenum pname, GLfixed param )

     * */
    public static void glPointParameterxOES(int pname, int param) {
        getPipeline().glPointParameterxOES(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glPointParameterxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glPointParameterxvOES(int pname, int[] params, int offset) {
        getPipeline().glPointParameterxvOES(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glPointParameterxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxvOES ( GLenum pname, const GLfixed *params )

     * */
    public static void glPointParameterxvOES(int pname, java.nio.IntBuffer params) {
        getPipeline().glPointParameterxvOES(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glPointSizexOES([int size]);
     * 
     *  C function void glPointSizexOES ( GLfixed size )

     * */
    public static void glPointSizexOES(int size) {
        getPipeline().glPointSizexOES(size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glPolygonOffsetxOES([int factor, int units]);
     * 
     *  C function void glPolygonOffsetxOES ( GLfixed factor, GLfixed units )

     * */
    public static void glPolygonOffsetxOES(int factor, int units) {
        getPipeline().glPolygonOffsetxOES(factor, units);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glRotatexOES([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatexOES ( GLfixed angle, GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glRotatexOES(int angle, int x, int y, int z) {
        getPipeline().glRotatexOES(angle, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glSampleCoveragexOES([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragexOES ( GLclampx value, GLboolean invert )

     * */
    public static void glSampleCoveragexOES(int value, boolean invert) {
        getPipeline().glSampleCoveragexOES(value, invert);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glScalexOES([int x, int y, int z]);
     * 
     *  C function void glScalexOES ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glScalexOES(int x, int y, int z) {
        getPipeline().glScalexOES(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexEnvxOES([int target, int pname, int param]);
     * 
     *  C function void glTexEnvxOES ( GLenum target, GLenum pname, GLfixed param )

     * */
    public static void glTexEnvxOES(int target, int pname, int param) {
        getPipeline().glTexEnvxOES(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexEnvxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxvOES ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexEnvxvOES(int target, int pname, int[] params, int offset) {
        getPipeline().glTexEnvxvOES(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexEnvxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxvOES ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexEnvxvOES(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexEnvxvOES(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexParameterxOES([int target, int pname, int param]);
     * 
     *  C function void glTexParameterxOES ( GLenum target, GLenum pname, GLfixed param )

     * */
    public static void glTexParameterxOES(int target, int pname, int param) {
        getPipeline().glTexParameterxOES(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxvOES ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexParameterxvOES(int target, int pname, int[] params, int offset) {
        getPipeline().glTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxvOES ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexParameterxvOES(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexParameterxvOES(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTranslatexOES([int x, int y, int z]);
     * 
     *  C function void glTranslatexOES ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glTranslatexOES(int x, int y, int z) {
        getPipeline().glTranslatexOES(x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glIsRenderbufferOES([int renderbuffer]);
     * 
     *  C function GLboolean glIsRenderbufferOES ( GLuint renderbuffer )

     * */
    public static boolean glIsRenderbufferOES(int renderbuffer) {
       return  getPipeline().glIsRenderbufferOES(renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glBindRenderbufferOES([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbufferOES ( GLenum target, GLuint renderbuffer )

     * */
    public static void glBindRenderbufferOES(int target, int renderbuffer) {
        getPipeline().glBindRenderbufferOES(target, renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDeleteRenderbuffersOES([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffersOES ( GLsizei n, const GLuint *renderbuffers )

     * */
    public static void glDeleteRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        getPipeline().glDeleteRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDeleteRenderbuffersOES([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffersOES ( GLsizei n, const GLuint *renderbuffers )

     * */
    public static void glDeleteRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers) {
        getPipeline().glDeleteRenderbuffersOES(n, renderbuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGenRenderbuffersOES([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffersOES ( GLsizei n, GLuint *renderbuffers )

     * */
    public static void glGenRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        getPipeline().glGenRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGenRenderbuffersOES([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffersOES ( GLsizei n, GLuint *renderbuffers )

     * */
    public static void glGenRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers) {
        getPipeline().glGenRenderbuffersOES(n, renderbuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glRenderbufferStorageOES([int target, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageOES ( GLenum target, GLenum internalformat, GLsizei width, GLsizei height )

     * */
    public static void glRenderbufferStorageOES(int target, int internalformat, int width, int height) {
        getPipeline().glRenderbufferStorageOES(target, internalformat, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameterivOES ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetRenderbufferParameterivOES(int target, int pname, int[] params, int offset) {
        getPipeline().glGetRenderbufferParameterivOES(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameterivOES ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetRenderbufferParameterivOES(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetRenderbufferParameterivOES(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glIsFramebufferOES([int framebuffer]);
     * 
     *  C function GLboolean glIsFramebufferOES ( GLuint framebuffer )

     * */
    public static boolean glIsFramebufferOES(int framebuffer) {
       return  getPipeline().glIsFramebufferOES(framebuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glBindFramebufferOES([int target, int framebuffer]);
     * 
     *  C function void glBindFramebufferOES ( GLenum target, GLuint framebuffer )

     * */
    public static void glBindFramebufferOES(int target, int framebuffer) {
        getPipeline().glBindFramebufferOES(target, framebuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDeleteFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffersOES ( GLsizei n, const GLuint *framebuffers )

     * */
    public static void glDeleteFramebuffersOES(int n, int[] framebuffers, int offset) {
        getPipeline().glDeleteFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDeleteFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffersOES ( GLsizei n, const GLuint *framebuffers )

     * */
    public static void glDeleteFramebuffersOES(int n, java.nio.IntBuffer framebuffers) {
        getPipeline().glDeleteFramebuffersOES(n, framebuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGenFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffersOES ( GLsizei n, GLuint *framebuffers )

     * */
    public static void glGenFramebuffersOES(int n, int[] framebuffers, int offset) {
        getPipeline().glGenFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGenFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffersOES ( GLsizei n, GLuint *framebuffers )

     * */
    public static void glGenFramebuffersOES(int n, java.nio.IntBuffer framebuffers) {
        getPipeline().glGenFramebuffersOES(n, framebuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glCheckFramebufferStatusOES([int target]);
     * 
     *  C function GLenum glCheckFramebufferStatusOES ( GLenum target )

     * */
    public static int glCheckFramebufferStatusOES(int target) {
       return getPipeline().glCheckFramebufferStatusOES(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFramebufferRenderbufferOES([int target, int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbufferOES ( GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer )

     * */
    public static void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        getPipeline().glFramebufferRenderbufferOES(target, attachment, renderbuffertarget, renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFramebufferTexture2DOES([int target, int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2DOES ( GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level )

     * */
    public static void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level) {
        getPipeline().glFramebufferTexture2DOES(target, attachment, textarget, texture, level);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES([int target, int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES ( GLenum target, GLenum attachment, GLenum pname, GLint *params )

     * */
    public static void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, int[] params, int offset) {
        getPipeline().glGetFramebufferAttachmentParameterivOES(target, attachment, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES([int target, int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES ( GLenum target, GLenum attachment, GLenum pname, GLint *params )

     * */
    public static void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetFramebufferAttachmentParameterivOES(target, attachment, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGenerateMipmapOES([int target]);
     * 
     *  C function void glGenerateMipmapOES ( GLenum target )

     * */
    public static void glGenerateMipmapOES(int target) {
        getPipeline().glGenerateMipmapOES(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glCurrentPaletteMatrixOES([int matrixpaletteindex]);
     * 
     *  C function void glCurrentPaletteMatrixOES ( GLuint matrixpaletteindex )

     * */
    public static void glCurrentPaletteMatrixOES(int matrixpaletteindex) {
        getPipeline().glCurrentPaletteMatrixOES(matrixpaletteindex);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glLoadPaletteFromModelViewMatrixOES();
     * 
     *  C function void glLoadPaletteFromModelViewMatrixOES ( void )

     * */
    public static void glLoadPaletteFromModelViewMatrixOES() {
        getPipeline().glLoadPaletteFromModelViewMatrixOES();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glMatrixIndexPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glMatrixIndexPointerOES ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glMatrixIndexPointerOESBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glMatrixIndexPointerOESBounds(size, type, stride, pointer, remaining);
    }

    /**
     * 
     * @param size
     * @param type
     * @param stride
     * @param pointer
     */
    public static void glMatrixIndexPointerOES(int size, int type, int stride, java.nio.Buffer pointer) {
        glMatrixIndexPointerOESBounds(size, type, stride, pointer, pointer.remaining());
        if (((size == 2) || (size == 3) || (size == 4)) && ((type == GL_FLOAT) || (type == GL_BYTE) || (type == GL_SHORT) || (type == GL_FIXED)) && (stride >= 0)) {
            _matrixIndexPointerOES = pointer;
        }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glWeightPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glWeightPointerOES ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glWeightPointerOESBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glWeightPointerOESBounds(size, type, stride, pointer, remaining);
    }

    public static void glWeightPointerOES(int size, int type, int stride, java.nio.Buffer pointer) {
        glWeightPointerOESBounds(size, type, stride, pointer, pointer.remaining());
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glDepthRangefOES([float zNear, float zFar]);
     * 
     *  C function void glDepthRangefOES ( GLclampf zNear, GLclampf zFar )

     * */
    public static void glDepthRangefOES(float zNear, float zFar) {
        getPipeline().glDepthRangefOES(zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glFrustumfOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumfOES ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public static void glFrustumfOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        getPipeline().glFrustumfOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glOrthofOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthofOES ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public static void glOrthofOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        getPipeline().glOrthofOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClipPlanefOES([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanefOES ( GLenum plane, const GLfloat *equation )

     * */
    public static void glClipPlanefOES(int plane, float[] equation, int offset) {
        getPipeline().glClipPlanefOES(plane, equation, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClipPlanefOES([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanefOES ( GLenum plane, const GLfloat *equation )

     * */
    public static void glClipPlanefOES(int plane, java.nio.FloatBuffer equation) {
        getPipeline().glClipPlanefOES(plane, equation);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetClipPlanefOES([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanefOES ( GLenum pname, GLfloat *eqn )

     * */
    public static void glGetClipPlanefOES(int pname, float[] eqn, int offset) {
        getPipeline().glGetClipPlanefOES(pname, eqn, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetClipPlanefOES([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanefOES ( GLenum pname, GLfloat *eqn )

     * */
    public static void glGetClipPlanefOES(int pname, java.nio.FloatBuffer eqn) {
        getPipeline().glGetClipPlanefOES(pname, eqn);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glClearDepthfOES([float depth]);
     * 
     *  C function void glClearDepthfOES ( GLclampf depth )

     * */
    public static void glClearDepthfOES(float depth) {
        getPipeline().glClearDepthfOES(depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenfOES([int coord, int pname, float param]);
     * 
     *  C function void glTexGenfOES ( GLenum coord, GLenum pname, GLfloat param )

     * */
    public static void glTexGenfOES(int coord, int pname, float param) {
        getPipeline().glTexGenfOES(coord, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glTexGenfvOES ( GLenum coord, GLenum pname, const GLfloat *params )

     * */
    public static void glTexGenfvOES(int coord, int pname, float[] params, int offset) {
        getPipeline().glTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexGenfvOES ( GLenum coord, GLenum pname, const GLfloat *params )

     * */
    public static void glTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params) {
        getPipeline().glTexGenfvOES(coord, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGeniOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGeniOES ( GLenum coord, GLenum pname, GLint param )

     * */
    public static void glTexGeniOES(int coord, int pname, int param) {
        getPipeline().glTexGeniOES(coord, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenivOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenivOES ( GLenum coord, GLenum pname, const GLint *params )

     * */
    public static void glTexGenivOES(int coord, int pname, int[] params, int offset) {
        getPipeline().glTexGenivOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenivOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenivOES ( GLenum coord, GLenum pname, const GLint *params )

     * */
    public static void glTexGenivOES(int coord, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexGenivOES(coord, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenxOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGenxOES ( GLenum coord, GLenum pname, GLfixed param )

     * */
    public static void glTexGenxOES(int coord, int pname, int param) {
        getPipeline().glTexGenxOES(coord, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenxvOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenxvOES ( GLenum coord, GLenum pname, const GLfixed *params )

     * */
    public static void glTexGenxvOES(int coord, int pname, int[] params, int offset) {
        getPipeline().glTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glTexGenxvOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenxvOES ( GLenum coord, GLenum pname, const GLfixed *params )

     * */
    public static void glTexGenxvOES(int coord, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexGenxvOES(coord, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenfvOES([int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexGenfvOES ( GLenum coord, GLenum pname, GLfloat *params )

     * */
    public static void glGetTexGenfvOES(int coord, int pname, float[] params, int offset) {
        getPipeline().glGetTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexGenfvOES ( GLenum coord, GLenum pname, GLfloat *params )

     * */
    public static void glGetTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params) {
        getPipeline().glGetTexGenfvOES(coord, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenivOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenivOES ( GLenum coord, GLenum pname, GLint *params )

     * */
    public static void glGetTexGenivOES(int coord, int pname, int[] params, int offset) {
        getPipeline().glGetTexGenivOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenivOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenivOES ( GLenum coord, GLenum pname, GLint *params )

     * */
    public static void glGetTexGenivOES(int coord, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetTexGenivOES(coord, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenxvOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenxvOES ( GLenum coord, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexGenxvOES(int coord, int pname, int[] params, int offset) {
        getPipeline().glGetTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES11Ext.glGetTexGenxvOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenxvOES ( GLenum coord, GLenum pname, GLfixed *params )

     * */
    public static void glGetTexGenxvOES(int coord, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetTexGenxvOES(coord, pname, params);
    }
}
