/*

**    Place holder for disclaimer.
*/

package android.opengl;

import gles.emulator.Sys;
import gles.internal.GLES10Pipeline;

import java.nio.Buffer;

public class GLES10 {

    public static final int GL_ADD = 0x0104;

    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;

    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;

    public static final int GL_ALPHA = 0x1906;

    public static final int GL_ALPHA_BITS = 0x0D55;

    public static final int GL_ALPHA_TEST = 0x0BC0;

    public static final int GL_ALWAYS = 0x0207;

    public static final int GL_AMBIENT = 0x1200;

    public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;

    public static final int GL_AND = 0x1501;

    public static final int GL_AND_INVERTED = 0x1504;

    public static final int GL_AND_REVERSE = 0x1502;

    public static final int GL_BACK = 0x0405;

    public static final int GL_BLEND = 0x0BE2;

    public static final int GL_BLUE_BITS = 0x0D54;

    public static final int GL_BYTE = 0x1400;

    public static final int GL_CCW = 0x0901;

    public static final int GL_CLAMP_TO_EDGE = 0x812F;

    public static final int GL_CLEAR = 0x1500;

    public static final int GL_COLOR_ARRAY = 0x8076;

    public static final int GL_COLOR_BUFFER_BIT = 0x4000;

    public static final int GL_COLOR_LOGIC_OP = 0x0BF2;

    public static final int GL_COLOR_MATERIAL = 0x0B57;

    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;

    public static final int GL_CONSTANT_ATTENUATION = 0x1207;

    public static final int GL_COPY = 0x1503;

    public static final int GL_COPY_INVERTED = 0x150C;

    public static final int GL_CULL_FACE = 0x0B44;

    public static final int GL_CW = 0x0900;

    public static final int GL_DECAL = 0x2101;

    public static final int GL_DECR = 0x1E03;

    public static final int GL_DEPTH_BITS = 0x0D56;

    public static final int GL_DEPTH_BUFFER_BIT = 0x0100;

    public static final int GL_DEPTH_TEST = 0x0B71;

    public static final int GL_DIFFUSE = 0x1201;

    public static final int GL_DITHER = 0x0BD0;

    public static final int GL_DONT_CARE = 0x1100;

    public static final int GL_DST_ALPHA = 0x0304;

    public static final int GL_DST_COLOR = 0x0306;

    public static final int GL_EMISSION = 0x1600;

    public static final int GL_EQUAL = 0x0202;

    public static final int GL_EQUIV = 0x1509;

    public static final int GL_EXP = 0x0800;

    public static final int GL_EXP2 = 0x0801;

    public static final int GL_EXTENSIONS = 0x1F03;

    public static final int GL_FALSE = 0;

    public static final int GL_FASTEST = 0x1101;

    public static final int GL_FIXED = 0x140C;

    public static final int GL_FLAT = 0x1D00;

    public static final int GL_FLOAT = 0x1406;

    public static final int GL_FOG = 0x0B60;

    public static final int GL_FOG_COLOR = 0x0B66;

    public static final int GL_FOG_DENSITY = 0x0B62;

    public static final int GL_FOG_END = 0x0B64;

    public static final int GL_FOG_HINT = 0x0C54;

    public static final int GL_FOG_MODE = 0x0B65;

    public static final int GL_FOG_START = 0x0B63;

    public static final int GL_FRONT = 0x0404;

    public static final int GL_FRONT_AND_BACK = 0x0408;

    public static final int GL_GEQUAL = 0x0206;

    public static final int GL_GREATER = 0x0204;

    public static final int GL_GREEN_BITS = 0x0D53;

    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES = 0x8B9B;

    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES = 0x8B9A;

    public static final int GL_INCR = 0x1E02;

    public static final int GL_INVALID_ENUM = 0x0500;

    public static final int GL_INVALID_OPERATION = 0x0502;

    public static final int GL_INVALID_VALUE = 0x0501;

    public static final int GL_INVERT = 0x150A;

    public static final int GL_KEEP = 0x1E00;

    public static final int GL_LEQUAL = 0x0203;

    public static final int GL_LESS = 0x0201;

    public static final int GL_LIGHT_MODEL_AMBIENT = 0x0B53;

    public static final int GL_LIGHT_MODEL_TWO_SIDE = 0x0B52;

    public static final int GL_LIGHT0 = 0x4000;

    public static final int GL_LIGHT1 = 0x4001;

    public static final int GL_LIGHT2 = 0x4002;

    public static final int GL_LIGHT3 = 0x4003;

    public static final int GL_LIGHT4 = 0x4004;

    public static final int GL_LIGHT5 = 0x4005;

    public static final int GL_LIGHT6 = 0x4006;

    public static final int GL_LIGHT7 = 0x4007;

    public static final int GL_LIGHTING = 0x0B50;

    public static final int GL_LINE_LOOP = 0x0002;

    public static final int GL_LINE_SMOOTH = 0x0B20;

    public static final int GL_LINE_SMOOTH_HINT = 0x0C52;

    public static final int GL_LINE_STRIP = 0x0003;

    public static final int GL_LINEAR = 0x2601;

    public static final int GL_LINEAR_ATTENUATION = 0x1208;

    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;

    public static final int GL_LINES = 0x0001;

    public static final int GL_LUMINANCE = 0x1909;

    public static final int GL_LUMINANCE_ALPHA = 0x190A;

    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;

    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;

    public static final int GL_MAX_LIGHTS = 0x0D31;

    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0x0D36;

    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0x0D38;

    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;

    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0x0D39;

    public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;

    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;

    public static final int GL_MODELVIEW = 0x1700;

    public static final int GL_MODULATE = 0x2100;

    public static final int GL_MULTISAMPLE = 0x809D;

    public static final int GL_NAND = 0x150E;

    public static final int GL_NEAREST = 0x2600;

    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;

    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

    public static final int GL_NEVER = 0x0200;

    public static final int GL_NICEST = 0x1102;

    public static final int GL_NO_ERROR = 0;

    public static final int GL_NOOP = 0x1505;

    public static final int GL_NOR = 0x1508;

    public static final int GL_NORMAL_ARRAY = 0x8075;

    public static final int GL_NORMALIZE = 0x0BA1;

    public static final int GL_NOTEQUAL = 0x0205;

    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;

    public static final int GL_ONE = 1;

    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;

    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;

    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;

    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;

    public static final int GL_OR = 0x1507;

    public static final int GL_OR_INVERTED = 0x150D;

    public static final int GL_OR_REVERSE = 0x150B;

    public static final int GL_OUT_OF_MEMORY = 0x0505;

    public static final int GL_PACK_ALIGNMENT = 0x0D05;

    public static final int GL_PALETTE4_R5_G6_B5_OES = 0x8B92;

    public static final int GL_PALETTE4_RGB5_A1_OES = 0x8B94;

    public static final int GL_PALETTE4_RGB8_OES = 0x8B90;

    public static final int GL_PALETTE4_RGBA4_OES = 0x8B93;

    public static final int GL_PALETTE4_RGBA8_OES = 0x8B91;

    public static final int GL_PALETTE8_R5_G6_B5_OES = 0x8B97;

    public static final int GL_PALETTE8_RGB5_A1_OES = 0x8B99;

    public static final int GL_PALETTE8_RGB8_OES = 0x8B95;

    public static final int GL_PALETTE8_RGBA4_OES = 0x8B98;

    public static final int GL_PALETTE8_RGBA8_OES = 0x8B96;

    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;

    public static final int GL_POINT_SMOOTH = 0x0B10;

    public static final int GL_POINT_SMOOTH_HINT = 0x0C51;

    public static final int GL_POINTS = 0x0000;

    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;

    public static final int GL_POINT_SIZE = 0x0B11;

    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;

    public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;

    public static final int GL_POSITION = 0x1203;

    public static final int GL_PROJECTION = 0x1701;

    public static final int GL_QUADRATIC_ATTENUATION = 0x1209;

    public static final int GL_RED_BITS = 0x0D52;

    public static final int GL_RENDERER = 0x1F01;

    public static final int GL_REPEAT = 0x2901;

    public static final int GL_REPLACE = 0x1E01;

    public static final int GL_RESCALE_NORMAL = 0x803A;

    public static final int GL_RGB = 0x1907;

    public static final int GL_RGBA = 0x1908;

    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;

    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;

    public static final int GL_SAMPLE_COVERAGE = 0x80A0;

    public static final int GL_SCISSOR_TEST = 0x0C11;

    public static final int GL_SET = 0x150F;

    public static final int GL_SHININESS = 0x1601;

    public static final int GL_SHORT = 0x1402;

    public static final int GL_SMOOTH = 0x1D01;

    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;

    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;

    public static final int GL_SPECULAR = 0x1202;

    public static final int GL_SPOT_CUTOFF = 0x1206;

    public static final int GL_SPOT_DIRECTION = 0x1204;

    public static final int GL_SPOT_EXPONENT = 0x1205;

    public static final int GL_SRC_ALPHA = 0x0302;

    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;

    public static final int GL_SRC_COLOR = 0x0300;

    public static final int GL_STACK_OVERFLOW = 0x0503;

    public static final int GL_STACK_UNDERFLOW = 0x0504;

    public static final int GL_STENCIL_BITS = 0x0D57;

    public static final int GL_STENCIL_BUFFER_BIT = 0x0400;

    public static final int GL_STENCIL_TEST = 0x0B90;

    public static final int GL_SUBPIXEL_BITS = 0x0D50;

    public static final int GL_TEXTURE = 0x1702;

    public static final int GL_TEXTURE_2D = 0x0DE1;

    public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;

    public static final int GL_TEXTURE_ENV = 0x2300;

    public static final int GL_TEXTURE_ENV_COLOR = 0x2201;

    public static final int GL_TEXTURE_ENV_MODE = 0x2200;

    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;

    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;

    public static final int GL_TEXTURE_WRAP_S = 0x2802;

    public static final int GL_TEXTURE_WRAP_T = 0x2803;

    public static final int GL_TEXTURE0 = 0x84C0;

    public static final int GL_TEXTURE1 = 0x84C1;

    public static final int GL_TEXTURE2 = 0x84C2;

    public static final int GL_TEXTURE3 = 0x84C3;

    public static final int GL_TEXTURE4 = 0x84C4;

    public static final int GL_TEXTURE5 = 0x84C5;

    public static final int GL_TEXTURE6 = 0x84C6;

    public static final int GL_TEXTURE7 = 0x84C7;

    public static final int GL_TEXTURE8 = 0x84C8;

    public static final int GL_TEXTURE9 = 0x84C9;

    public static final int GL_TEXTURE10 = 0x84CA;

    public static final int GL_TEXTURE11 = 0x84CB;

    public static final int GL_TEXTURE12 = 0x84CC;

    public static final int GL_TEXTURE13 = 0x84CD;

    public static final int GL_TEXTURE14 = 0x84CE;

    public static final int GL_TEXTURE15 = 0x84CF;

    public static final int GL_TEXTURE16 = 0x84D0;

    public static final int GL_TEXTURE17 = 0x84D1;

    public static final int GL_TEXTURE18 = 0x84D2;

    public static final int GL_TEXTURE19 = 0x84D3;

    public static final int GL_TEXTURE20 = 0x84D4;

    public static final int GL_TEXTURE21 = 0x84D5;

    public static final int GL_TEXTURE22 = 0x84D6;

    public static final int GL_TEXTURE23 = 0x84D7;

    public static final int GL_TEXTURE24 = 0x84D8;

    public static final int GL_TEXTURE25 = 0x84D9;

    public static final int GL_TEXTURE26 = 0x84DA;

    public static final int GL_TEXTURE27 = 0x84DB;

    public static final int GL_TEXTURE28 = 0x84DC;

    public static final int GL_TEXTURE29 = 0x84DD;

    public static final int GL_TEXTURE30 = 0x84DE;

    public static final int GL_TEXTURE31 = 0x84DF;

    public static final int GL_TRIANGLE_FAN = 0x0006;

    public static final int GL_TRIANGLE_STRIP = 0x0005;

    public static final int GL_TRIANGLES = 0x0004;

    public static final int GL_TRUE = 1;

    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;

    public static final int GL_UNSIGNED_BYTE = 0x1401;

    public static final int GL_UNSIGNED_SHORT = 0x1403;

    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;

    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;

    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;

    public static final int GL_VENDOR = 0x1F00;

    public static final int GL_VERSION = 0x1F02;

    public static final int GL_VERTEX_ARRAY = 0x8074;

    public static final int GL_XOR = 0x1506;

    public static final int GL_ZERO = 0;
    
    
    private static GLES10Pipeline pipeline;
    
    private static GLES10Pipeline getPipeline(){
    	if(pipeline==null){
    		pipeline = (GLES10Pipeline) Sys.getGLPipelineInstance(Sys.GL_PIPE.GLES10);
    	}
    	return pipeline;
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10._nativeClassInit();
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    private static void _nativeClassInit() {
        getPipeline().GLES10ClassInit();
    }

    static {
        _nativeClassInit();
    }

    /**
     * TODO remove this
     */
    private static Buffer _colorPointer;

    /**
     * TODO remove this
     */
    private static Buffer _normalPointer;

    /**
     * TODO remove this
     */
    private static Buffer _texCoordPointer;

    /**
     * TODO remove this
     */
    private static Buffer _vertexPointer;

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    public static void glActiveTexture(int texture) {
        getPipeline().glActiveTexture(texture);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glAlphaFunc([int func, float ref]);
     * 
     *  C function void glAlphaFunc ( GLenum func, GLclampf ref )

     * */
    public static void glAlphaFunc(int func, float ref) {
        getPipeline().glAlphaFunc(func, ref);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glAlphaFuncx([int func, int ref]);
     * 
     *  C function void glAlphaFuncx ( GLenum func, GLclampx ref )

     * */
    public static void glAlphaFuncx(int func, int ref) {
        getPipeline().glAlphaFuncx(func, ref);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture ( GLenum target, GLuint texture )

     * */
    public static void glBindTexture(int target, int texture) {
        getPipeline().glBindTexture(target, texture);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc ( GLenum sfactor, GLenum dfactor )

     * */
    public static void glBlendFunc(int sfactor, int dfactor) {
        getPipeline().glBlendFunc(sfactor, dfactor);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClear([int mask]);
     * 
     *  C function void glClear ( GLbitfield mask )

     * */
    public static void glClear(int mask) {
        getPipeline().glClear(mask);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public static void glClearColor(float red, float green, float blue, float alpha) {
        getPipeline().glClearColor(red, green, blue, alpha);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClearColorx([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorx ( GLclampx red, GLclampx green, GLclampx blue, GLclampx alpha )

     * */
    public static void glClearColorx(int red, int green, int blue, int alpha) {
        getPipeline().glClearColorx(red, green, blue, alpha);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf ( GLclampf depth )

     * */
    public static void glClearDepthf(float depth) {
        getPipeline().glClearDepthf(depth);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClearDepthx([int depth]);
     * 
     *  C function void glClearDepthx ( GLclampx depth )

     * */
    public static void glClearDepthx(int depth) {
        getPipeline().glClearDepthx(depth);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClearStencil([int s]);
     * 
     *  C function void glClearStencil ( GLint s )

     * */
    public static void glClearStencil(int s) {
        getPipeline().glClearStencil(s);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glClientActiveTexture([int texture]);
     * 
     *  C function void glClientActiveTexture ( GLenum texture )

     * */
    public static void glClientActiveTexture(int texture) {
        getPipeline().glClientActiveTexture(texture);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glColor4f([float red, float green, float blue, float alpha]);
     * 
     *  C function void glColor4f ( GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha )

     * */
    public static void glColor4f(float red, float green, float blue, float alpha) {
        getPipeline().glColor4f(red, green, blue, alpha);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glColor4x([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4x ( GLfixed red, GLfixed green, GLfixed blue, GLfixed alpha )

     * */
    public static void glColor4x(int red, int green, int blue, int alpha) {
        getPipeline().glColor4x(red, green, blue, alpha);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask ( GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha )

     * */
    public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        getPipeline().glColorMask(red, green, blue, alpha);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glColorPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glColorPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glColorPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glColorPointerBounds(size, type, stride, pointer, remaining);
    }

    public static void glColorPointer(int size, int type, int stride, java.nio.Buffer pointer) {
        glColorPointerBounds(size, type, stride, pointer, pointer.remaining());
        if ((size == 4) && ((type == GL_FLOAT) || (type == GL_UNSIGNED_BYTE) || (type == GL_FIXED)) && (stride >= 0)) {
            _colorPointer = pointer;
        }
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, const GLvoid *data )

     * */
    public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data) {
        getPipeline().glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glCompressedTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, const GLvoid *data )

     * */
    public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data) {
        getPipeline().glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border )

     * */
    public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        getPipeline().glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        getPipeline().glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glCullFace([int mode]);
     * 
     *  C function void glCullFace ( GLenum mode )

     * */
    public static void glCullFace(int mode) {
        getPipeline().glCullFace(mode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public static void glDeleteTextures(int n, int[] textures, int offset) {
        getPipeline().glDeleteTextures(n, textures, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public static void glDeleteTextures(int n, java.nio.IntBuffer textures) {
        getPipeline().glDeleteTextures(n, textures);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc ( GLenum func )

     * */
    public static void glDepthFunc(int func) {
        getPipeline().glDepthFunc(func);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask ( GLboolean flag )

     * */
    public static void glDepthMask(boolean flag) {
        getPipeline().glDepthMask(flag);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef ( GLclampf zNear, GLclampf zFar )

     * */
    public static void glDepthRangef(float zNear, float zFar) {
        getPipeline().glDepthRangef(zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDepthRangex([int zNear, int zFar]);
     * 
     *  C function void glDepthRangex ( GLclampx zNear, GLclampx zFar )

     * */
    public static void glDepthRangex(int zNear, int zFar) {
        getPipeline().glDepthRangex(zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDisable([int cap]);
     * 
     *  C function void glDisable ( GLenum cap )

     * */
    public static void glDisable(int cap) {
        getPipeline().glDisable(cap);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDisableClientState([int array]);
     * 
     *  C function void glDisableClientState ( GLenum array )

     * */
    public static void glDisableClientState(int array) {
        getPipeline().glDisableClientState(array);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays ( GLenum mode, GLint first, GLsizei count )

     * */
    public static void glDrawArrays(int mode, int first, int count) {
        getPipeline().glDrawArrays(mode, first, count);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, const GLvoid *indices )

     * */
    public static void glDrawElements(int mode, int count, int type, java.nio.Buffer indices) {
        getPipeline().glDrawElements(mode, count, type, indices);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glEnable([int cap]);
     * 
     *  C function void glEnable ( GLenum cap )

     * */
    public static void glEnable(int cap) {
        getPipeline().glEnable(cap);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glEnableClientState([int array]);
     * 
     *  C function void glEnableClientState ( GLenum array )

     * */
    public static void glEnableClientState(int array) {
        getPipeline().glEnableClientState(array);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFinish();
     * 
     *  C function void glFinish ( void )

     * */
    public static void glFinish() {
        getPipeline().glFinish();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFlush();
     * 
     *  C function void glFlush ( void )

     * */
    public static void glFlush() {
        getPipeline().glFlush();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogf([int pname, float param]);
     * 
     *  C function void glFogf ( GLenum pname, GLfloat param )

     * */
    public static void glFogf(int pname, float param) {
        getPipeline().glFogf(pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogfv([int pname, float[] params, int offset]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    public static void glFogfv(int pname, float[] params, int offset) {
        getPipeline().glFogfv(pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glFogfv ( GLenum pname, const GLfloat *params )

     * */
    public static void glFogfv(int pname, java.nio.FloatBuffer params) {
        getPipeline().glFogfv(pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogx([int pname, int param]);
     * 
     *  C function void glFogx ( GLenum pname, GLfixed param )

     * */
    public static void glFogx(int pname, int param) {
        getPipeline().glFogx(pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogxv([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    public static void glFogxv(int pname, int[] params, int offset) {
        getPipeline().glFogxv(pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFogxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxv ( GLenum pname, const GLfixed *params )

     * */
    public static void glFogxv(int pname, java.nio.IntBuffer params) {
        getPipeline().glFogxv(pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace ( GLenum mode )

     * */
    public static void glFrontFace(int mode) {
        getPipeline().glFrontFace(mode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFrustumf([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumf ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public static void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar) {
        getPipeline().glFrustumf(left, right, bottom, top, zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glFrustumx([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumx ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public static void glFrustumx(int left, int right, int bottom, int top, int zNear, int zFar) {
        getPipeline().glFrustumx(left, right, bottom, top, zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public static void glGenTextures(int n, int[] textures, int offset) {
        getPipeline().glGenTextures(n, textures, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public static void glGenTextures(int n, java.nio.IntBuffer textures) {
        getPipeline().glGenTextures(n, textures);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGetError();
     * 
     *  C function GLenum glGetError ( void )

     * */
    public static int glGetError() {
       return getPipeline().glGetError();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public static void glGetIntegerv(int pname, int[] params, int offset) {
        getPipeline().glGetIntegerv(pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public static void glGetIntegerv(int pname, java.nio.IntBuffer params) {
        getPipeline().glGetIntegerv(pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString ( GLenum name )

     * */
    public static String glGetString(int name) {
       return getPipeline().glGetString(name);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glHint([int target, int mode]);
     * 
     *  C function void glHint ( GLenum target, GLenum mode )

     * */
    public static void glHint(int target, int mode) {
        getPipeline().glHint(target, mode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelf([int pname, float param]);
     * 
     *  C function void glLightModelf ( GLenum pname, GLfloat param )

     * */
    public static void glLightModelf(int pname, float param) {
        getPipeline().glLightModelf(pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelfv([int pname, float[] params, int offset]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    public static void glLightModelfv(int pname, float[] params, int offset) {
        getPipeline().glLightModelfv(pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelfv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightModelfv ( GLenum pname, const GLfloat *params )

     * */
    public static void glLightModelfv(int pname, java.nio.FloatBuffer params) {
        getPipeline().glLightModelfv(pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelx([int pname, int param]);
     * 
     *  C function void glLightModelx ( GLenum pname, GLfixed param )

     * */
    public static void glLightModelx(int pname, int param) {
        getPipeline().glLightModelx(pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelxv([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    public static void glLightModelxv(int pname, int[] params, int offset) {
        getPipeline().glLightModelxv(pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightModelxv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxv ( GLenum pname, const GLfixed *params )

     * */
    public static void glLightModelxv(int pname, java.nio.IntBuffer params) {
        getPipeline().glLightModelxv(pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightf([int light, int pname, float param]);
     * 
     *  C function void glLightf ( GLenum light, GLenum pname, GLfloat param )

     * */
    public static void glLightf(int light, int pname, float param) {
        getPipeline().glLightf(light, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightfv([int light, int pname, float[] params, int offset]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    public static void glLightfv(int light, int pname, float[] params, int offset) {
        getPipeline().glLightfv(light, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightfv([int light, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glLightfv ( GLenum light, GLenum pname, const GLfloat *params )

     * */
    public static void glLightfv(int light, int pname, java.nio.FloatBuffer params) {
        getPipeline().glLightfv(light, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightx([int light, int pname, int param]);
     * 
     *  C function void glLightx ( GLenum light, GLenum pname, GLfixed param )

     * */
    public static void glLightx(int light, int pname, int param) {
        getPipeline().glLightx(light, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightxv([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public static void glLightxv(int light, int pname, int[] params, int offset) {
        getPipeline().glLightxv(light, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLightxv([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxv ( GLenum light, GLenum pname, const GLfixed *params )

     * */
    public static void glLightxv(int light, int pname, java.nio.IntBuffer params) {
        getPipeline().glLightxv(light, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLineWidth([float width]);
     * 
     *  C function void glLineWidth ( GLfloat width )

     * */
    public static void glLineWidth(float width) {
        getPipeline().glLineWidth(width);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLineWidthx([int width]);
     * 
     *  C function void glLineWidthx ( GLfixed width )

     * */
    public static void glLineWidthx(int width) {
        getPipeline().glLineWidthx(width);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLoadIdentity();
     * 
     *  C function void glLoadIdentity ( void )

     * */
    public static void glLoadIdentity() {
        getPipeline().glLoadIdentity();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLoadMatrixf([float[] m, int offset]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    public static void glLoadMatrixf(float[] m, int offset) {
        getPipeline().glLoadMatrixf(m, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLoadMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glLoadMatrixf ( const GLfloat *m )

     * */
    public static void glLoadMatrixf(java.nio.FloatBuffer m) {
        getPipeline().glLoadMatrixf(m);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLoadMatrixx([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    public static void glLoadMatrixx(int[] m, int offset) {
        getPipeline().glLoadMatrixx(m, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLoadMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixx ( const GLfixed *m )

     * */
    public static void glLoadMatrixx(java.nio.IntBuffer m) {
        getPipeline().glLoadMatrixx(m);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glLogicOp([int opcode]);
     * 
     *  C function void glLogicOp ( GLenum opcode )

     * */
    public static void glLogicOp(int opcode) {
        getPipeline().glLogicOp(opcode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialf([int face, int pname, float param]);
     * 
     *  C function void glMaterialf ( GLenum face, GLenum pname, GLfloat param )

     * */
    public static void glMaterialf(int face, int pname, float param) {
        getPipeline().glMaterialf(face, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialfv([int face, int pname, float[] params, int offset]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    public static void glMaterialfv(int face, int pname, float[] params, int offset) {
        getPipeline().glMaterialfv(face, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialfv([int face, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glMaterialfv ( GLenum face, GLenum pname, const GLfloat *params )

     * */
    public static void glMaterialfv(int face, int pname, java.nio.FloatBuffer params) {
        getPipeline().glMaterialfv(face, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialx([int face, int pname, int param]);
     * 
     *  C function void glMaterialx ( GLenum face, GLenum pname, GLfixed param )

     * */
    public static void glMaterialx(int face, int pname, int param) {
        getPipeline().glMaterialx(face, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialxv([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public static void glMaterialxv(int face, int pname, int[] params, int offset) {
        getPipeline().glMaterialxv(face, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMaterialxv([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxv ( GLenum face, GLenum pname, const GLfixed *params )

     * */
    public static void glMaterialxv(int face, int pname, java.nio.IntBuffer params) {
        getPipeline().glMaterialxv(face, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMatrixMode([int mode]);
     * 
     *  C function void glMatrixMode ( GLenum mode )

     * */
    public static void glMatrixMode(int mode) {
        getPipeline().glMatrixMode(mode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultMatrixf([float[] m, int offset]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    public static void glMultMatrixf(float[] m, int offset) {
        getPipeline().glMultMatrixf(m, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultMatrixf([java.nio.FloatBuffer m]);
     * 
     *  C function void glMultMatrixf ( const GLfloat *m )

     * */
    public static void glMultMatrixf(java.nio.FloatBuffer m) {
        getPipeline().glMultMatrixf(m);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultMatrixx([int[] m, int offset]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    public static void glMultMatrixx(int[] m, int offset) {
        getPipeline().glMultMatrixx(m, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultMatrixx([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixx ( const GLfixed *m )

     * */
    public static void glMultMatrixx(java.nio.IntBuffer m) {
        getPipeline().glMultMatrixx(m);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultiTexCoord4f([int target, float s, float t, float r, float q]);
     * 
     *  C function void glMultiTexCoord4f ( GLenum target, GLfloat s, GLfloat t, GLfloat r, GLfloat q )

     * */
    public static void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
        getPipeline().glMultiTexCoord4f(target, s, t, r, q);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glMultiTexCoord4x([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4x ( GLenum target, GLfixed s, GLfixed t, GLfixed r, GLfixed q )

     * */
    public static void glMultiTexCoord4x(int target, int s, int t, int r, int q) {
        getPipeline().glMultiTexCoord4x(target, s, t, r, q);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glNormal3f([float nx, float ny, float nz]);
     * 
     *  C function void glNormal3f ( GLfloat nx, GLfloat ny, GLfloat nz )

     * */
    public static void glNormal3f(float nx, float ny, float nz) {
        getPipeline().glNormal3f(nx, ny, nz);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glNormal3x([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3x ( GLfixed nx, GLfixed ny, GLfixed nz )

     * */
    public static void glNormal3x(int nx, int ny, int nz) {
        getPipeline().glNormal3x(nx, ny, nz);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glNormalPointerBounds([int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glNormalPointer ( GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glNormalPointerBounds(int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glNormalPointerBounds(type, stride, pointer, remaining);
    }

    public static void glNormalPointer(int type, int stride, java.nio.Buffer pointer) {
        glNormalPointerBounds(type, stride, pointer, pointer.remaining());
        if (((type == GL_FLOAT) || (type == GL_BYTE) || (type == GL_SHORT) || (type == GL_FIXED)) && (stride >= 0)) {
            _normalPointer = pointer;
        }
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glOrthof([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthof ( GLfloat left, GLfloat right, GLfloat bottom, GLfloat top, GLfloat zNear, GLfloat zFar )

     * */
    public static void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar) {
        getPipeline().glOrthof(left, right, bottom, top, zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glOrthox([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glOrthox ( GLfixed left, GLfixed right, GLfixed bottom, GLfixed top, GLfixed zNear, GLfixed zFar )

     * */
    public static void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar) {
        getPipeline().glOrthox(left, right, bottom, top, zNear, zFar);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei ( GLenum pname, GLint param )

     * */
    public static void glPixelStorei(int pname, int param) {
        getPipeline().glPixelStorei(pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPointSize([float size]);
     * 
     *  C function void glPointSize ( GLfloat size )

     * */
    public static void glPointSize(float size) {
        getPipeline().glPointSize(size);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPointSizex([int size]);
     * 
     *  C function void glPointSizex ( GLfixed size )

     * */
    public static void glPointSizex(int size) {
        getPipeline().glPointSizex(size);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset ( GLfloat factor, GLfloat units )

     * */
    public static void glPolygonOffset(float factor, float units) {
        getPipeline().glPolygonOffset(factor, units);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPolygonOffsetx([int factor, int units]);
     * 
     *  C function void glPolygonOffsetx ( GLfixed factor, GLfixed units )

     * */
    public static void glPolygonOffsetx(int factor, int units) {
        getPipeline().glPolygonOffsetx(factor, units);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPopMatrix();
     * 
     *  C function void glPopMatrix ( void )

     * */
    public static void glPopMatrix() {
        getPipeline().glPopMatrix();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glPushMatrix();
     * 
     *  C function void glPushMatrix ( void )

     * */
    public static void glPushMatrix() {
        getPipeline().glPushMatrix();
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels ( GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLvoid *pixels )

     * */
    public static void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glReadPixels(x, y, width, height, format, type, pixels);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glRotatef([float angle, float x, float y, float z]);
     * 
     *  C function void glRotatef ( GLfloat angle, GLfloat x, GLfloat y, GLfloat z )

     * */
    public static void glRotatef(float angle, float x, float y, float z) {
        getPipeline().glRotatef(angle, x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glRotatex([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatex ( GLfixed angle, GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glRotatex(int angle, int x, int y, int z) {
        getPipeline().glRotatex(angle, x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage ( GLclampf value, GLboolean invert )

     * */
    public static void glSampleCoverage(float value, boolean invert) {
        getPipeline().glSampleCoverage(value, invert);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glSampleCoveragex([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragex ( GLclampx value, GLboolean invert )

     * */
    public static void glSampleCoveragex(int value, boolean invert) {
        getPipeline().glSampleCoveragex(value, invert);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glScalef([float x, float y, float z]);
     * 
     *  C function void glScalef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    public static void glScalef(float x, float y, float z) {
        getPipeline().glScalef(x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glScalex([int x, int y, int z]);
     * 
     *  C function void glScalex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glScalex(int x, int y, int z) {
        getPipeline().glScalex(x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glScissor(int x, int y, int width, int height) {
        getPipeline().glScissor(x, y, width, height);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glShadeModel([int mode]);
     * 
     *  C function void glShadeModel ( GLenum mode )

     * */
    public static void glShadeModel(int mode) {
        getPipeline().glShadeModel(mode);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc ( GLenum func, GLint ref, GLuint mask )

     * */
    public static void glStencilFunc(int func, int ref, int mask) {
        getPipeline().glStencilFunc(func, ref, mask);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask ( GLuint mask )

     * */
    public static void glStencilMask(int mask) {
        getPipeline().glStencilMask(mask);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp ( GLenum fail, GLenum zfail, GLenum zpass )

     * */
    public static void glStencilOp(int fail, int zfail, int zpass) {
        getPipeline().glStencilOp(fail, zfail, zpass);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexCoordPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glTexCoordPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glTexCoordPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glTexCoordPointerBounds(size, type, stride, pointer, remaining);
    }

    public static void glTexCoordPointer(int size, int type, int stride, java.nio.Buffer pointer) {
        glTexCoordPointerBounds(size, type, stride, pointer, pointer.remaining());
        if (((size == 2) || (size == 3) || (size == 4)) && ((type == GL_FLOAT) || (type == GL_BYTE) || (type == GL_SHORT) || (type == GL_FIXED)) && (stride >= 0)) {
            _texCoordPointer = pointer;
        }
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvf([int target, int pname, float param]);
     * 
     *  C function void glTexEnvf ( GLenum target, GLenum pname, GLfloat param )

     * */
    public static void glTexEnvf(int target, int pname, float param) {
        getPipeline().glTexEnvf(target, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public static void glTexEnvfv(int target, int pname, float[] params, int offset) {
        getPipeline().glTexEnvfv(target, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexEnvfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public static void glTexEnvfv(int target, int pname, java.nio.FloatBuffer params) {
        getPipeline().glTexEnvfv(target, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvx([int target, int pname, int param]);
     * 
     *  C function void glTexEnvx ( GLenum target, GLenum pname, GLfixed param )

     * */
    public static void glTexEnvx(int target, int pname, int param) {
        getPipeline().glTexEnvx(target, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvxv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexEnvxv(int target, int pname, int[] params, int offset) {
        getPipeline().glTexEnvxv(target, pname, params, offset);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexEnvxv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxv ( GLenum target, GLenum pname, const GLfixed *params )

     * */
    public static void glTexEnvxv(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexEnvxv(target, pname, params);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexImage2D([int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D ( GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf ( GLenum target, GLenum pname, GLfloat param )

     * */
    public static void glTexParameterf(int target, int pname, float param) {
        getPipeline().glTexParameterf(target, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexParameterx([int target, int pname, int param]);
     * 
     *  C function void glTexParameterx ( GLenum target, GLenum pname, GLfixed param )

     * */
    public static void glTexParameterx(int target, int pname, int param) {
        getPipeline().glTexParameterx(target, pname, param);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTranslatef([float x, float y, float z]);
     * 
     *  C function void glTranslatef ( GLfloat x, GLfloat y, GLfloat z )

     * */
    public static void glTranslatef(float x, float y, float z) {
        getPipeline().glTranslatef(x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glTranslatex([int x, int y, int z]);
     * 
     *  C function void glTranslatex ( GLfixed x, GLfixed y, GLfixed z )

     * */
    public static void glTranslatex(int x, int y, int z) {
        getPipeline().glTranslatex(x, y, z);
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glVertexPointerBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexPointer ( GLint size, GLenum type, GLsizei stride, const GLvoid *pointer )

     * */
    private static void glVertexPointerBounds(int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        getPipeline().glVertexPointerBounds(size, type, stride, pointer, remaining);
    }

    public static void glVertexPointer(int size, int type, int stride, java.nio.Buffer pointer) {
        glVertexPointerBounds(size, type, stride, pointer, pointer.remaining());
        if (((size == 2) || (size == 3) || (size == 4)) && ((type == GL_FLOAT) || (type == GL_BYTE) || (type == GL_SHORT) || (type == GL_FIXED)) && (stride >= 0)) {
            _vertexPointer = pointer;
        }
    }

    /**
     * This method forwards command to Pipeline.
     * Delegate Method generated from GLES10.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glViewport(int x, int y, int width, int height) {
        getPipeline().glViewport(x, y, width, height);
    }
}
