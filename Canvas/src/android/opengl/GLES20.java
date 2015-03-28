/*

**    Place holder for disclaimer.
*/

package android.opengl;

import gles.internal.GLES20Pipeline;
import gles.internal.Sys;

/** OpenGL ES 2.0
 */
public class GLES20 {

    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
    public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
    public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
    public static final int GL_FALSE = 0;
    public static final int GL_TRUE = 1;
    public static final int GL_POINTS = 0x0000;
    public static final int GL_LINES = 0x0001;
    public static final int GL_LINE_LOOP = 0x0002;
    public static final int GL_LINE_STRIP = 0x0003;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_TRIANGLE_FAN = 0x0006;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 0x0300;

    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;

    public static final int GL_SRC_ALPHA = 0x0302;

    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;

    public static final int GL_DST_ALPHA = 0x0304;

    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;

    public static final int GL_DST_COLOR = 0x0306;

    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;

    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;

    public static final int GL_FUNC_ADD = 0x8006;

    public static final int GL_BLEND_EQUATION = 0x8009;

    public static final int GL_BLEND_EQUATION_RGB = 0x8009;

    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;

    public static final int GL_FUNC_SUBTRACT = 0x800A;

    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    public static final int GL_BLEND_DST_RGB = 0x80C8;

    public static final int GL_BLEND_SRC_RGB = 0x80C9;

    public static final int GL_BLEND_DST_ALPHA = 0x80CA;

    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;

    public static final int GL_CONSTANT_COLOR = 0x8001;

    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;

    public static final int GL_CONSTANT_ALPHA = 0x8003;

    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    public static final int GL_BLEND_COLOR = 0x8005;

    public static final int GL_ARRAY_BUFFER = 0x8892;

    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;

    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;

    public static final int GL_STREAM_DRAW = 0x88E0;

    public static final int GL_STATIC_DRAW = 0x88E4;

    public static final int GL_DYNAMIC_DRAW = 0x88E8;

    public static final int GL_BUFFER_SIZE = 0x8764;

    public static final int GL_BUFFER_USAGE = 0x8765;

    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;

    public static final int GL_FRONT = 0x0404;

    public static final int GL_BACK = 0x0405;

    public static final int GL_FRONT_AND_BACK = 0x0408;

    public static final int GL_TEXTURE_2D = 0x0DE1;

    public static final int GL_CULL_FACE = 0x0B44;

    public static final int GL_BLEND = 0x0BE2;

    public static final int GL_DITHER = 0x0BD0;

    public static final int GL_STENCIL_TEST = 0x0B90;

    public static final int GL_DEPTH_TEST = 0x0B71;

    public static final int GL_SCISSOR_TEST = 0x0C11;

    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;

    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;

    public static final int GL_SAMPLE_COVERAGE = 0x80A0;

    public static final int GL_NO_ERROR = 0;

    public static final int GL_INVALID_ENUM = 0x0500;

    public static final int GL_INVALID_VALUE = 0x0501;

    public static final int GL_INVALID_OPERATION = 0x0502;

    public static final int GL_OUT_OF_MEMORY = 0x0505;

    public static final int GL_CW = 0x0900;

    public static final int GL_CCW = 0x0901;

    public static final int GL_LINE_WIDTH = 0x0B21;

    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;

    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;

    public static final int GL_CULL_FACE_MODE = 0x0B45;

    public static final int GL_FRONT_FACE = 0x0B46;

    public static final int GL_DEPTH_RANGE = 0x0B70;

    public static final int GL_DEPTH_WRITEMASK = 0x0B72;

    public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;

    public static final int GL_DEPTH_FUNC = 0x0B74;

    public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;

    public static final int GL_STENCIL_FUNC = 0x0B92;

    public static final int GL_STENCIL_FAIL = 0x0B94;

    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;

    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;

    public static final int GL_STENCIL_REF = 0x0B97;

    public static final int GL_STENCIL_VALUE_MASK = 0x0B93;

    public static final int GL_STENCIL_WRITEMASK = 0x0B98;

    public static final int GL_STENCIL_BACK_FUNC = 0x8800;

    public static final int GL_STENCIL_BACK_FAIL = 0x8801;

    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;

    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;

    public static final int GL_STENCIL_BACK_REF = 0x8CA3;

    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;

    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;

    public static final int GL_VIEWPORT = 0x0BA2;

    public static final int GL_SCISSOR_BOX = 0x0C10;

    public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;

    public static final int GL_COLOR_WRITEMASK = 0x0C23;

    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;

    public static final int GL_PACK_ALIGNMENT = 0x0D05;

    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;

    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;

    public static final int GL_SUBPIXEL_BITS = 0x0D50;

    public static final int GL_RED_BITS = 0x0D52;

    public static final int GL_GREEN_BITS = 0x0D53;

    public static final int GL_BLUE_BITS = 0x0D54;

    public static final int GL_ALPHA_BITS = 0x0D55;

    public static final int GL_DEPTH_BITS = 0x0D56;

    public static final int GL_STENCIL_BITS = 0x0D57;

    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;

    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;

    public static final int GL_TEXTURE_BINDING_2D = 0x8069;

    public static final int GL_SAMPLE_BUFFERS = 0x80A8;

    public static final int GL_SAMPLES = 0x80A9;

    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;

    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;

    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;

    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;

    public static final int GL_DONT_CARE = 0x1100;

    public static final int GL_FASTEST = 0x1101;

    public static final int GL_NICEST = 0x1102;

    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;

    public static final int GL_BYTE = 0x1400;

    public static final int GL_UNSIGNED_BYTE = 0x1401;

    public static final int GL_SHORT = 0x1402;

    public static final int GL_UNSIGNED_SHORT = 0x1403;

    public static final int GL_INT = 0x1404;

    public static final int GL_UNSIGNED_INT = 0x1405;

    public static final int GL_FLOAT = 0x1406;

    public static final int GL_FIXED = 0x140C;

    public static final int GL_DEPTH_COMPONENT = 0x1902;

    public static final int GL_ALPHA = 0x1906;

    public static final int GL_RGB = 0x1907;

    public static final int GL_RGBA = 0x1908;

    public static final int GL_LUMINANCE = 0x1909;

    public static final int GL_LUMINANCE_ALPHA = 0x190A;

    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;

    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;

    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;

    public static final int GL_FRAGMENT_SHADER = 0x8B30;

    public static final int GL_VERTEX_SHADER = 0x8B31;

    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;

    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;

    public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;

    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;

    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;

    public static final int GL_SHADER_TYPE = 0x8B4F;

    public static final int GL_DELETE_STATUS = 0x8B80;

    public static final int GL_LINK_STATUS = 0x8B82;

    public static final int GL_VALIDATE_STATUS = 0x8B83;

    public static final int GL_ATTACHED_SHADERS = 0x8B85;

    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;

    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;

    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;

    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;

    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

    public static final int GL_CURRENT_PROGRAM = 0x8B8D;

    public static final int GL_NEVER = 0x0200;

    public static final int GL_LESS = 0x0201;

    public static final int GL_EQUAL = 0x0202;

    public static final int GL_LEQUAL = 0x0203;

    public static final int GL_GREATER = 0x0204;

    public static final int GL_NOTEQUAL = 0x0205;

    public static final int GL_GEQUAL = 0x0206;

    public static final int GL_ALWAYS = 0x0207;

    public static final int GL_KEEP = 0x1E00;

    public static final int GL_REPLACE = 0x1E01;

    public static final int GL_INCR = 0x1E02;

    public static final int GL_DECR = 0x1E03;

    public static final int GL_INVERT = 0x150A;

    public static final int GL_INCR_WRAP = 0x8507;

    public static final int GL_DECR_WRAP = 0x8508;

    public static final int GL_VENDOR = 0x1F00;

    public static final int GL_RENDERER = 0x1F01;

    public static final int GL_VERSION = 0x1F02;

    public static final int GL_EXTENSIONS = 0x1F03;

    public static final int GL_NEAREST = 0x2600;

    public static final int GL_LINEAR = 0x2601;

    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;

    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;

    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;

    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;

    public static final int GL_TEXTURE_WRAP_S = 0x2802;

    public static final int GL_TEXTURE_WRAP_T = 0x2803;

    public static final int GL_TEXTURE = 0x1702;

    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;

    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

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

    public static final int GL_REPEAT = 0x2901;

    public static final int GL_CLAMP_TO_EDGE = 0x812F;

    public static final int GL_MIRRORED_REPEAT = 0x8370;

    public static final int GL_FLOAT_VEC2 = 0x8B50;

    public static final int GL_FLOAT_VEC3 = 0x8B51;

    public static final int GL_FLOAT_VEC4 = 0x8B52;

    public static final int GL_INT_VEC2 = 0x8B53;

    public static final int GL_INT_VEC3 = 0x8B54;

    public static final int GL_INT_VEC4 = 0x8B55;

    public static final int GL_BOOL = 0x8B56;

    public static final int GL_BOOL_VEC2 = 0x8B57;

    public static final int GL_BOOL_VEC3 = 0x8B58;

    public static final int GL_BOOL_VEC4 = 0x8B59;

    public static final int GL_FLOAT_MAT2 = 0x8B5A;

    public static final int GL_FLOAT_MAT3 = 0x8B5B;

    public static final int GL_FLOAT_MAT4 = 0x8B5C;

    public static final int GL_SAMPLER_2D = 0x8B5E;

    public static final int GL_SAMPLER_CUBE = 0x8B60;

    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;

    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;

    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;

    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;

    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;

    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;

    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

    public static final int GL_COMPILE_STATUS = 0x8B81;

    public static final int GL_INFO_LOG_LENGTH = 0x8B84;

    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;

    public static final int GL_SHADER_COMPILER = 0x8DFA;

    public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;

    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;

    public static final int GL_LOW_FLOAT = 0x8DF0;

    public static final int GL_MEDIUM_FLOAT = 0x8DF1;

    public static final int GL_HIGH_FLOAT = 0x8DF2;

    public static final int GL_LOW_INT = 0x8DF3;

    public static final int GL_MEDIUM_INT = 0x8DF4;

    public static final int GL_HIGH_INT = 0x8DF5;

    public static final int GL_FRAMEBUFFER = 0x8D40;

    public static final int GL_RENDERBUFFER = 0x8D41;

    public static final int GL_RGBA4 = 0x8056;

    public static final int GL_RGB5_A1 = 0x8057;

    public static final int GL_RGB565 = 0x8D62;

    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;

    @Deprecated
    public static final int GL_STENCIL_INDEX = 0x1901;

    public static final int GL_STENCIL_INDEX8 = 0x8D48;

    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;

    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;

    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;

    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;

    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;

    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;

    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;

    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;

    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;

    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;

    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;

    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;

    public static final int GL_NONE = 0;

    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;

    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;

    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;

    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;

    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    
    
    /**
     * Local instance of pipeline	
     */
    private static GLES20Pipeline pipeline;
     
    /**
     * Get the pipeline from Sys.
     * All logic from selecting undelying API implementation 
     * is provided by Sys class.
     * 
     * @return Pipeline instance for this OpenGL ES
     */
     private static GLES20Pipeline getPipeline(){
     	if(pipeline==null){
     		pipeline = (GLES20Pipeline) Sys.getPipelineInstance(Sys.GL_PIPE.GLES20);
     	}
     	return pipeline;
     }
    

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20._nativeClassInit();
     * 
     * native

     * */
    private native static void nativeClassInit();

    static {
        nativeClassInit();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glActiveTexture([int texture]);
     * 
     *  C function void glActiveTexture ( GLenum texture )

     * */
    public static void glActiveTexture(int texture) {
        getPipeline().glActiveTexture(texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glAttachShader([int program, int shader]);
     * 
     *  C function void glAttachShader ( GLuint program, GLuint shader )

     * */
    public static void glAttachShader(int program, int shader) {
        getPipeline().glAttachShader(program, shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBindAttribLocation([int program, int index, String name]);
     * 
     *  C function void glBindAttribLocation ( GLuint program, GLuint index, const char *name )

     * */
    public static void glBindAttribLocation(int program, int index, String name) {
        getPipeline().glBindAttribLocation(program, index, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBindBuffer([int target, int buffer]);
     * 
     *  C function void glBindBuffer ( GLenum target, GLuint buffer )

     * */
    public static void glBindBuffer(int target, int buffer) {
        getPipeline().glBindBuffer(target, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBindFramebuffer([int target, int framebuffer]);
     * 
     *  C function void glBindFramebuffer ( GLenum target, GLuint framebuffer )

     * */
    public static void glBindFramebuffer(int target, int framebuffer) {
        getPipeline().glBindFramebuffer(target, framebuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBindRenderbuffer([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbuffer ( GLenum target, GLuint renderbuffer )

     * */
    public static void glBindRenderbuffer(int target, int renderbuffer) {
        getPipeline().glBindRenderbuffer(target, renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBindTexture([int target, int texture]);
     * 
     *  C function void glBindTexture ( GLenum target, GLuint texture )

     * */
    public static void glBindTexture(int target, int texture) {
        getPipeline().glBindTexture(target, texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBlendColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glBlendColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public static void glBlendColor(float red, float green, float blue, float alpha) {
        getPipeline().glBlendColor(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBlendEquation([int mode]);
     * 
     *  C function void glBlendEquation ( GLenum mode )

     * */
    public static void glBlendEquation(int mode) {
        getPipeline().glBlendEquation(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBlendEquationSeparate([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparate ( GLenum modeRGB, GLenum modeAlpha )

     * */
    public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        getPipeline().glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBlendFunc([int sfactor, int dfactor]);
     * 
     *  C function void glBlendFunc ( GLenum sfactor, GLenum dfactor )

     * */
    public static void glBlendFunc(int sfactor, int dfactor) {
        getPipeline().glBlendFunc(sfactor, dfactor);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBlendFuncSeparate([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparate ( GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha )

     * */
    public static void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        getPipeline().glBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBufferData([int target, int size, java.nio.Buffer data, int usage]);
     * 
     *  C function void glBufferData ( GLenum target, GLsizeiptr size, const GLvoid *data, GLenum usage )

     * */
    public static void glBufferData(int target, int size, java.nio.Buffer data, int usage) {
        getPipeline().glBufferData(target, size, data, usage);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glBufferSubData([int target, int offset, int size, java.nio.Buffer data]);
     * 
     *  C function void glBufferSubData ( GLenum target, GLintptr offset, GLsizeiptr size, const GLvoid *data )

     * */
    public static void glBufferSubData(int target, int offset, int size, java.nio.Buffer data) {
        getPipeline().glBufferSubData(target, offset, size, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCheckFramebufferStatus([int target]);
     * 
     *  C function GLenum glCheckFramebufferStatus ( GLenum target )

     * */
    public static int glCheckFramebufferStatus(int target) {
       return getPipeline().glCheckFramebufferStatus(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glClear([int mask]);
     * 
     *  C function void glClear ( GLbitfield mask )

     * */
    public static void glClear(int mask) {
        getPipeline().glClear(mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glClearColor([float red, float green, float blue, float alpha]);
     * 
     *  C function void glClearColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )

     * */
    public static void glClearColor(float red, float green, float blue, float alpha) {
        getPipeline().glClearColor(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glClearDepthf([float depth]);
     * 
     *  C function void glClearDepthf ( GLclampf depth )

     * */
    public static void glClearDepthf(float depth) {
        getPipeline().glClearDepthf(depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glClearStencil([int s]);
     * 
     *  C function void glClearStencil ( GLint s )

     * */
    public static void glClearStencil(int s) {
        getPipeline().glClearStencil(s);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glColorMask([boolean red, boolean green, boolean blue, boolean alpha]);
     * 
     *  C function void glColorMask ( GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha )

     * */
    public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        getPipeline().glColorMask(red, green, blue, alpha);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCompileShader([int shader]);
     * 
     *  C function void glCompileShader ( GLuint shader )

     * */
    public static void glCompileShader(int shader) {
        getPipeline().glCompileShader(shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCompressedTexImage2D([int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, const GLvoid *data )

     * */
    public static void glCompressedTexImage2D(int target, 
    		int level, 
    		int internalformat, 
    		int width, int height, 
    		int border, 
    		int imageSize, 
    		java.nio.Buffer data) {
        getPipeline().glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCompressedTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, const GLvoid *data )

     * */
    public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.Buffer data) {
        getPipeline().glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCopyTexImage2D([int target, int level, int internalformat, int x, int y, int width, int height, int border]);
     * 
     *  C function void glCopyTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border )

     * */
    public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        getPipeline().glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCopyTexSubImage2D([int target, int level, int xoffset, int yoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        getPipeline().glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCreateProgram();
     * 
     *  C function GLuint glCreateProgram ( void )

     * */
    public static int glCreateProgram() {
        return getPipeline().glCreateProgram();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCreateShader([int type]);
     * 
     *  C function GLuint glCreateShader ( GLenum type )

     * */
    public static int glCreateShader(int type) {
       return getPipeline().glCreateShader(type);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glCullFace([int mode]);
     * 
     *  C function void glCullFace ( GLenum mode )

     * */
    public static void glCullFace(int mode) {
        getPipeline().glCullFace(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    public static void glDeleteBuffers(int n, int[] buffers, int offset) {
        getPipeline().glDeleteBuffers(n, buffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )

     * */
    public static void glDeleteBuffers(int n, java.nio.IntBuffer buffers) {
        getPipeline().glDeleteBuffers(n, buffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffers ( GLsizei n, const GLuint *framebuffers )

     * */
    public static void glDeleteFramebuffers(int n, int[] framebuffers, int offset) {
        getPipeline().glDeleteFramebuffers(n, framebuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffers ( GLsizei n, const GLuint *framebuffers )

     * */
    public static void glDeleteFramebuffers(int n, java.nio.IntBuffer framebuffers) {
        getPipeline().glDeleteFramebuffers(n, framebuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteProgram([int program]);
     * 
     *  C function void glDeleteProgram ( GLuint program )

     * */
    public static void glDeleteProgram(int program) {
        getPipeline().glDeleteProgram(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffers ( GLsizei n, const GLuint *renderbuffers )

     * */
    public static void glDeleteRenderbuffers(int n, int[] renderbuffers, int offset) {
        getPipeline().glDeleteRenderbuffers(n, renderbuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffers ( GLsizei n, const GLuint *renderbuffers )

     * */
    public static void glDeleteRenderbuffers(int n, java.nio.IntBuffer renderbuffers) {
        getPipeline().glDeleteRenderbuffers(n, renderbuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteShader([int shader]);
     * 
     *  C function void glDeleteShader ( GLuint shader )

     * */
    public static void glDeleteShader(int shader) {
        getPipeline().glDeleteShader(shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public static void glDeleteTextures(int n, int[] textures, int offset) {
        getPipeline().glDeleteTextures(n, textures, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDeleteTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glDeleteTextures ( GLsizei n, const GLuint *textures )

     * */
    public static void glDeleteTextures(int n, java.nio.IntBuffer textures) {
        getPipeline().glDeleteTextures(n, textures);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDepthFunc([int func]);
     * 
     *  C function void glDepthFunc ( GLenum func )

     * */
    public static void glDepthFunc(int func) {
        getPipeline().glDepthFunc(func);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDepthMask([boolean flag]);
     * 
     *  C function void glDepthMask ( GLboolean flag )

     * */
    public static void glDepthMask(boolean flag) {
        getPipeline().glDepthMask(flag);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDepthRangef([float zNear, float zFar]);
     * 
     *  C function void glDepthRangef ( GLclampf zNear, GLclampf zFar )

     * */
    public static void glDepthRangef(float zNear, float zFar) {
        getPipeline().glDepthRangef(zNear, zFar);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDetachShader([int program, int shader]);
     * 
     *  C function void glDetachShader ( GLuint program, GLuint shader )

     * */
    public static void glDetachShader(int program, int shader) {
        getPipeline().glDetachShader(program, shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDisable([int cap]);
     * 
     *  C function void glDisable ( GLenum cap )

     * */
    public static void glDisable(int cap) {
        getPipeline().glDisable(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDisableVertexAttribArray([int index]);
     * 
     *  C function void glDisableVertexAttribArray ( GLuint index )

     * */
    public static void glDisableVertexAttribArray(int index) {
        getPipeline().glDisableVertexAttribArray(index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDrawArrays([int mode, int first, int count]);
     * 
     *  C function void glDrawArrays ( GLenum mode, GLint first, GLsizei count )

     * */
    public static void glDrawArrays(int mode, int first, int count) {
        getPipeline().glDrawArrays(mode, first, count);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDrawElements([int mode, int count, int type, int offset]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, GLint offset )

     * */
    public static void glDrawElements(int mode, int count, int type, int offset) {
        getPipeline().glDrawElements(mode, count, type, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glDrawElements([int mode, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, const GLvoid *indices )

     * */
    public static void glDrawElements(int mode, int count, int type, java.nio.Buffer indices) {
        getPipeline().glDrawElements(mode, count, type, indices);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glEnable([int cap]);
     * 
     *  C function void glEnable ( GLenum cap )

     * */
    public static void glEnable(int cap) {
        getPipeline().glEnable(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glEnableVertexAttribArray([int index]);
     * 
     *  C function void glEnableVertexAttribArray ( GLuint index )

     * */
    public static void glEnableVertexAttribArray(int index) {
        getPipeline().glEnableVertexAttribArray(index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glFinish();
     * 
     *  C function void glFinish ( void )

     * */
    public static void glFinish() {
        getPipeline().glFinish();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glFlush();
     * 
     *  C function void glFlush ( void )

     * */
    public static void glFlush() {
        getPipeline().glFlush();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glFramebufferRenderbuffer([int target, int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbuffer ( GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer )

     * */
    public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        getPipeline().glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glFramebufferTexture2D([int target, int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2D ( GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level )

     * */
    public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        getPipeline().glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glFrontFace([int mode]);
     * 
     *  C function void glFrontFace ( GLenum mode )

     * */
    public static void glFrontFace(int mode) {
        getPipeline().glFrontFace(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenBuffers([int n, int[] buffers, int offset]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    public static void glGenBuffers(int n, int[] buffers, int offset) {
        getPipeline().glGenBuffers(n, buffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenBuffers([int n, java.nio.IntBuffer buffers]);
     * 
     *  C function void glGenBuffers ( GLsizei n, GLuint *buffers )

     * */
    public static void glGenBuffers(int n, java.nio.IntBuffer buffers) {
        getPipeline().glGenBuffers(n, buffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenerateMipmap([int target]);
     * 
     *  C function void glGenerateMipmap ( GLenum target )

     * */
    public static void glGenerateMipmap(int target) {
        getPipeline().glGenerateMipmap(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenFramebuffers([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffers ( GLsizei n, GLuint *framebuffers )

     * */
    public static void glGenFramebuffers(int n, int[] framebuffers, int offset) {
        getPipeline().glGenFramebuffers(n, framebuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenFramebuffers([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffers ( GLsizei n, GLuint *framebuffers )

     * */
    public static void glGenFramebuffers(int n, java.nio.IntBuffer framebuffers) {
        getPipeline().glGenFramebuffers(n, framebuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenRenderbuffers([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffers ( GLsizei n, GLuint *renderbuffers )

     * */
    public static void glGenRenderbuffers(int n, int[] renderbuffers, int offset) {
        getPipeline().glGenRenderbuffers(n, renderbuffers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenRenderbuffers([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffers ( GLsizei n, GLuint *renderbuffers )

     * */
    public static void glGenRenderbuffers(int n, java.nio.IntBuffer renderbuffers) {
        getPipeline().glGenRenderbuffers(n, renderbuffers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenTextures([int n, int[] textures, int offset]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public static void glGenTextures(int n, int[] textures, int offset) {
        getPipeline().glGenTextures(n, textures, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGenTextures([int n, java.nio.IntBuffer textures]);
     * 
     *  C function void glGenTextures ( GLsizei n, GLuint *textures )

     * */
    public static void glGenTextures(int n, java.nio.IntBuffer textures) {
        getPipeline().glGenTextures(n, textures);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetActiveAttrib ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static void glGetActiveAttrib(int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset) {
        getPipeline().glGetActiveAttrib(program, index, bufsize, length, lengthOffset, size, sizeOffset, type, typeOffset, name, nameOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) */
    public static void glGetActiveAttrib(int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name) {
        getPipeline().glGetActiveAttrib(program, index, bufsize, length, size, type, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetActiveAttrib ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static String glGetActiveAttrib(int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset) {
       return getPipeline().glGetActiveAttrib(program, index, size, sizeOffset, type, typeOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveAttrib([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveAttrib ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static String glGetActiveAttrib(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type) {
       return getPipeline().glGetActiveAttrib(program, index, size, type);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetActiveUniform ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static void glGetActiveUniform(int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset) {
        getPipeline().glGetActiveUniform(program, index, bufsize, length, lengthOffset, size, sizeOffset, type, typeOffset, name, nameOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) */
    public static void glGetActiveUniform(int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name) {
        getPipeline().glGetActiveUniform(program, index, bufsize, length, size, type, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetActiveUniform ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static String glGetActiveUniform(int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset) {
       return  getPipeline().glGetActiveUniform(program, index, size, sizeOffset, type, typeOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetActiveUniform([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetActiveUniform ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )

     * */
    public static String glGetActiveUniform(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type) {
    	return  getPipeline().glGetActiveUniform(program, index, size, type);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetAttachedShaders([int program, int maxcount, int[] count, int countOffset, int[] shaders, int shadersOffset]);
     * 
     *  C function void glGetAttachedShaders ( GLuint program, GLsizei maxcount, GLsizei *count, GLuint *shaders )

     * */
    public static void glGetAttachedShaders(int program, int maxcount, int[] count, int countOffset, int[] shaders, int shadersOffset) {
        getPipeline().glGetAttachedShaders(program, maxcount, count, countOffset, shaders, shadersOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetAttachedShaders([int program, int maxcount, java.nio.IntBuffer count, java.nio.IntBuffer shaders]);
     * 
     *  C function void glGetAttachedShaders ( GLuint program, GLsizei maxcount, GLsizei *count, GLuint *shaders )

     * */
    public static void glGetAttachedShaders(int program, int maxcount, java.nio.IntBuffer count, java.nio.IntBuffer shaders) {
        getPipeline().glGetAttachedShaders(program, maxcount, count, shaders);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetAttribLocation([int program, String name]);
     * 
     *  C function GLint glGetAttribLocation ( GLuint program, const char *name )

     * */
    public static int glGetAttribLocation(int program, String name) {
    	return  getPipeline().glGetAttribLocation(program, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetBooleanv([int pname, boolean[] params, int offset]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    public static void glGetBooleanv(int pname, boolean[] params, int offset) {
        getPipeline().glGetBooleanv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetBooleanv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBooleanv ( GLenum pname, GLboolean *params )

     * */
    public static void glGetBooleanv(int pname, java.nio.IntBuffer params) {
        getPipeline().glGetBooleanv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetBufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetBufferParameteriv(int target, int pname, int[] params, int offset) {
        getPipeline().glGetBufferParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetBufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetBufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetBufferParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetError();
     * 
     *  C function GLenum glGetError ( void )

     * */
    public static int glGetError() {
    	return  getPipeline().glGetError();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetFloatv([int pname, float[] params, int offset]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    public static void glGetFloatv(int pname, float[] params, int offset) {
        getPipeline().glGetFloatv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetFloatv([int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetFloatv ( GLenum pname, GLfloat *params )

     * */
    public static void glGetFloatv(int pname, java.nio.FloatBuffer params) {
        getPipeline().glGetFloatv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv ( GLenum target, GLenum attachment, GLenum pname, GLint *params )

     * */
    public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params, int offset) {
        getPipeline().glGetFramebufferAttachmentParameteriv(target, attachment, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetFramebufferAttachmentParameteriv([int target, int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameteriv ( GLenum target, GLenum attachment, GLenum pname, GLint *params )

     * */
    public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetIntegerv([int pname, int[] params, int offset]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public static void glGetIntegerv(int pname, int[] params, int offset) {
        getPipeline().glGetIntegerv(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetIntegerv([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetIntegerv ( GLenum pname, GLint *params )

     * */
    public static void glGetIntegerv(int pname, java.nio.IntBuffer params) {
        getPipeline().glGetIntegerv(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetProgramiv([int program, int pname, int[] params, int offset]);
     * 
     *  C function void glGetProgramiv ( GLuint program, GLenum pname, GLint *params )

     * */
    public static void glGetProgramiv(int program, int pname, int[] params, int offset) {
        getPipeline().glGetProgramiv(program, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetProgramiv([int program, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetProgramiv ( GLuint program, GLenum pname, GLint *params )

     * */
    public static void glGetProgramiv(int program, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetProgramiv(program, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetProgramInfoLog([int program]);
     * 
     *      GLchar * infoLog);

     * */
    public static String glGetProgramInfoLog(int program) {
    	return getPipeline().glGetProgramInfoLog(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetRenderbufferParameteriv(int target, int pname, int[] params, int offset) {
        getPipeline().glGetRenderbufferParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetRenderbufferParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetRenderbufferParameteriv(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderiv([int shader, int pname, int[] params, int offset]);
     * 
     *  C function void glGetShaderiv ( GLuint shader, GLenum pname, GLint *params )

     * */
    public static void glGetShaderiv(int shader, int pname, int[] params, int offset) {
        getPipeline().glGetShaderiv(shader, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderiv([int shader, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetShaderiv ( GLuint shader, GLenum pname, GLint *params )

     * */
    public static void glGetShaderiv(int shader, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetShaderiv(shader, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderInfoLog([int shader]);
     * 
     *      GLchar * infoLog);

     * */
    public static String glGetShaderInfoLog(int shader) {
    	return   getPipeline().glGetShaderInfoLog(shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, int precisiontype, int[] range, int rangeOffset, int[] precision, int precisionOffset]);
     * 
     *  C function void glGetShaderPrecisionFormat ( GLenum shadertype, GLenum precisiontype, GLint *range, GLint *precision )

     * */
    public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int rangeOffset, int[] precision, int precisionOffset) {
        getPipeline().glGetShaderPrecisionFormat(shadertype, precisiontype, range, rangeOffset, precision, precisionOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderPrecisionFormat([int shadertype, int precisiontype, java.nio.IntBuffer range, java.nio.IntBuffer precision]);
     * 
     *  C function void glGetShaderPrecisionFormat ( GLenum shadertype, GLenum precisiontype, GLint *range, GLint *precision )

     * */
    public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, java.nio.IntBuffer range, java.nio.IntBuffer precision) {
        getPipeline().glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderSource([int shader, int bufsize, int[] length, int lengthOffset, byte[] source, int sourceOffset]);
     * 
     *  C function void glGetShaderSource ( GLuint shader, GLsizei bufsize, GLsizei *length, char *source )

     * */
    public static void glGetShaderSource(int shader, int bufsize, int[] length, int lengthOffset, byte[] source, int sourceOffset) {
        getPipeline().glGetShaderSource(shader, bufsize, length, lengthOffset, source, sourceOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES20.glGetShaderSource([int shader, int bufsize, java.nio.IntBuffer length, byte source]);
     * 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderSource([int shader, int bufsize, java.nio.IntBuffer length, byte source]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) 
     * 
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderSource([int shader, int bufsize, java.nio.IntBuffer length, byte source]);
     * 
     *  @hide Method is broken, but used to be public (b/6006380) 
     *  @hide Method is broken, but used to be public (b/6006380) */
    public static void glGetShaderSource(int shader, int bufsize, java.nio.IntBuffer length, byte source) {
        getPipeline().glGetShaderSource(shader, bufsize, length, source);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetShaderSource([int shader]);
     * 
     *  C function void glGetShaderSource ( GLuint shader, GLsizei bufsize, GLsizei *length, char *source )

     * */
    public static String glGetShaderSource(int shader) {
    	return  getPipeline().glGetShaderSource(shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetString([int name]);
     * 
     *  C function const GLubyte * glGetString ( GLenum name )

     * */
    public static String glGetString(int name) {
    	return  getPipeline().glGetString(name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    public static void glGetTexParameterfv(int target, int pname, float[] params, int offset) {
        getPipeline().glGetTexParameterfv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )

     * */
    public static void glGetTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        getPipeline().glGetTexParameterfv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetTexParameteriv(int target, int pname, int[] params, int offset) {
        getPipeline().glGetTexParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )

     * */
    public static void glGetTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetTexParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetUniformfv([int program, int location, float[] params, int offset]);
     * 
     *  C function void glGetUniformfv ( GLuint program, GLint location, GLfloat *params )

     * */
    public static void glGetUniformfv(int program, int location, float[] params, int offset) {
        getPipeline().glGetUniformfv(program, location, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetUniformfv([int program, int location, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetUniformfv ( GLuint program, GLint location, GLfloat *params )

     * */
    public static void glGetUniformfv(int program, int location, java.nio.FloatBuffer params) {
        getPipeline().glGetUniformfv(program, location, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetUniformiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformiv ( GLuint program, GLint location, GLint *params )

     * */
    public static void glGetUniformiv(int program, int location, int[] params, int offset) {
        getPipeline().glGetUniformiv(program, location, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetUniformiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformiv ( GLuint program, GLint location, GLint *params )

     * */
    public static void glGetUniformiv(int program, int location, java.nio.IntBuffer params) {
        getPipeline().glGetUniformiv(program, location, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetUniformLocation([int program, String name]);
     * 
     *  C function GLint glGetUniformLocation ( GLuint program, const char *name )

     * */
    public static int glGetUniformLocation(int program, String name) {
    	return  getPipeline().glGetUniformLocation(program, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetVertexAttribfv([int index, int pname, float[] params, int offset]);
     * 
     *  C function void glGetVertexAttribfv ( GLuint index, GLenum pname, GLfloat *params )

     * */
    public static void glGetVertexAttribfv(int index, int pname, float[] params, int offset) {
        getPipeline().glGetVertexAttribfv(index, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetVertexAttribfv([int index, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetVertexAttribfv ( GLuint index, GLenum pname, GLfloat *params )

     * */
    public static void glGetVertexAttribfv(int index, int pname, java.nio.FloatBuffer params) {
        getPipeline().glGetVertexAttribfv(index, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetVertexAttribiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribiv ( GLuint index, GLenum pname, GLint *params )

     * */
    public static void glGetVertexAttribiv(int index, int pname, int[] params, int offset) {
        getPipeline().glGetVertexAttribiv(index, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glGetVertexAttribiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribiv ( GLuint index, GLenum pname, GLint *params )

     * */
    public static void glGetVertexAttribiv(int index, int pname, java.nio.IntBuffer params) {
        getPipeline().glGetVertexAttribiv(index, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glHint([int target, int mode]);
     * 
     *  C function void glHint ( GLenum target, GLenum mode )

     * */
    public static void glHint(int target, int mode) {
        getPipeline().glHint(target, mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsBuffer([int buffer]);
     * 
     *  C function GLboolean glIsBuffer ( GLuint buffer )

     * */
    public static boolean glIsBuffer(int buffer) {
    	return  getPipeline().glIsBuffer(buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsEnabled([int cap]);
     * 
     *  C function GLboolean glIsEnabled ( GLenum cap )

     * */
    public static boolean glIsEnabled(int cap) {
    	return  getPipeline().glIsEnabled(cap);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsFramebuffer([int framebuffer]);
     * 
     *  C function GLboolean glIsFramebuffer ( GLuint framebuffer )

     * */
    public static boolean glIsFramebuffer(int framebuffer) {
    	return  getPipeline().glIsFramebuffer(framebuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsProgram([int program]);
     * 
     *  C function GLboolean glIsProgram ( GLuint program )

     * */
    public static boolean glIsProgram(int program) {
    	return  getPipeline().glIsProgram(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsRenderbuffer([int renderbuffer]);
     * 
     *  C function GLboolean glIsRenderbuffer ( GLuint renderbuffer )

     * */
    public static boolean glIsRenderbuffer(int renderbuffer) {
    	return  getPipeline().glIsRenderbuffer(renderbuffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsShader([int shader]);
     * 
     *  C function GLboolean glIsShader ( GLuint shader )

     * */
    public static boolean glIsShader(int shader) {
    	return  getPipeline().glIsShader(shader);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glIsTexture([int texture]);
     * 
     *  C function GLboolean glIsTexture ( GLuint texture )

     * */
    public static boolean glIsTexture(int texture) {
    	return  getPipeline().glIsTexture(texture);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glLineWidth([float width]);
     * 
     *  C function void glLineWidth ( GLfloat width )

     * */
    public static void glLineWidth(float width) {
        getPipeline().glLineWidth(width);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glLinkProgram([int program]);
     * 
     *  C function void glLinkProgram ( GLuint program )

     * */
    public static void glLinkProgram(int program) {
        getPipeline().glLinkProgram(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glPixelStorei([int pname, int param]);
     * 
     *  C function void glPixelStorei ( GLenum pname, GLint param )

     * */
    public static void glPixelStorei(int pname, int param) {
        getPipeline().glPixelStorei(pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glPolygonOffset([float factor, float units]);
     * 
     *  C function void glPolygonOffset ( GLfloat factor, GLfloat units )

     * */
    public static void glPolygonOffset(float factor, float units) {
        getPipeline().glPolygonOffset(factor, units);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glReadPixels([int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glReadPixels ( GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLvoid *pixels )

     * */
    public static void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glReadPixels(x, y, width, height, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glReleaseShaderCompiler();
     * 
     *  C function void glReleaseShaderCompiler ( void )

     * */
    public static void glReleaseShaderCompiler() {
        getPipeline().glReleaseShaderCompiler();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glRenderbufferStorage([int target, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorage ( GLenum target, GLenum internalformat, GLsizei width, GLsizei height )

     * */
    public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        getPipeline().glRenderbufferStorage(target, internalformat, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glSampleCoverage([float value, boolean invert]);
     * 
     *  C function void glSampleCoverage ( GLclampf value, GLboolean invert )

     * */
    public static void glSampleCoverage(float value, boolean invert) {
        getPipeline().glSampleCoverage(value, invert);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glScissor([int x, int y, int width, int height]);
     * 
     *  C function void glScissor ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glScissor(int x, int y, int width, int height) {
        getPipeline().glScissor(x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glShaderBinary([int n, int[] shaders, int offset, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary ( GLsizei n, const GLuint *shaders, GLenum binaryformat, const GLvoid *binary, GLsizei length )

     * */
    public static void glShaderBinary(int n, int[] shaders, int offset, int binaryformat, java.nio.Buffer binary, int length) {
        getPipeline().glShaderBinary(n, shaders, offset, binaryformat, binary, length);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glShaderBinary([int n, java.nio.IntBuffer shaders, int binaryformat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glShaderBinary ( GLsizei n, const GLuint *shaders, GLenum binaryformat, const GLvoid *binary, GLsizei length )

     * */
    public static void glShaderBinary(int n, java.nio.IntBuffer shaders, int binaryformat, java.nio.Buffer binary, int length) {
        getPipeline().glShaderBinary(n, shaders, binaryformat, binary, length);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glShaderSource([int shader, String string]);
     * 
     *  C function void glShaderSource ( GLuint shader, GLsizei count, const GLchar ** string, const GLint* length )

     * */
    public static void glShaderSource(int shader, String string) {
        getPipeline().glShaderSource(shader, string);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilFunc([int func, int ref, int mask]);
     * 
     *  C function void glStencilFunc ( GLenum func, GLint ref, GLuint mask )

     * */
    public static void glStencilFunc(int func, int ref, int mask) {
        getPipeline().glStencilFunc(func, ref, mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilFuncSeparate([int face, int func, int ref, int mask]);
     * 
     *  C function void glStencilFuncSeparate ( GLenum face, GLenum func, GLint ref, GLuint mask )

     * */
    public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        getPipeline().glStencilFuncSeparate(face, func, ref, mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilMask([int mask]);
     * 
     *  C function void glStencilMask ( GLuint mask )

     * */
    public static void glStencilMask(int mask) {
        getPipeline().glStencilMask(mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilMaskSeparate([int face, int mask]);
     * 
     *  C function void glStencilMaskSeparate ( GLenum face, GLuint mask )

     * */
    public static void glStencilMaskSeparate(int face, int mask) {
        getPipeline().glStencilMaskSeparate(face, mask);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilOp([int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOp ( GLenum fail, GLenum zfail, GLenum zpass )

     * */
    public static void glStencilOp(int fail, int zfail, int zpass) {
        getPipeline().glStencilOp(fail, zfail, zpass);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glStencilOpSeparate([int face, int fail, int zfail, int zpass]);
     * 
     *  C function void glStencilOpSeparate ( GLenum face, GLenum fail, GLenum zfail, GLenum zpass )

     * */
    public static void glStencilOpSeparate(int face, int fail, int zfail, int zpass) {
        getPipeline().glStencilOpSeparate(face, fail, zfail, zpass);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexImage2D([int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage2D ( GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameterf([int target, int pname, float param]);
     * 
     *  C function void glTexParameterf ( GLenum target, GLenum pname, GLfloat param )

     * */
    public static void glTexParameterf(int target, int pname, float param) {
        getPipeline().glTexParameterf(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameterfv([int target, int pname, float[] params, int offset]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public static void glTexParameterfv(int target, int pname, float[] params, int offset) {
        getPipeline().glTexParameterfv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameterfv([int target, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )

     * */
    public static void glTexParameterfv(int target, int pname, java.nio.FloatBuffer params) {
        getPipeline().glTexParameterfv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameteri([int target, int pname, int param]);
     * 
     *  C function void glTexParameteri ( GLenum target, GLenum pname, GLint param )

     * */
    public static void glTexParameteri(int target, int pname, int param) {
        getPipeline().glTexParameteri(target, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameteriv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public static void glTexParameteriv(int target, int pname, int[] params, int offset) {
        getPipeline().glTexParameteriv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexParameteriv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )

     * */
    public static void glTexParameteriv(int target, int pname, java.nio.IntBuffer params) {
        getPipeline().glTexParameteriv(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glTexSubImage2D([int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, const GLvoid *pixels )

     * */
    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.Buffer pixels) {
        getPipeline().glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1f([int location, float x]);
     * 
     *  C function void glUniform1f ( GLint location, GLfloat x )

     * */
    public static void glUniform1f(int location, float x) {
        getPipeline().glUniform1f(location, x);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform1fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform1fv(int location, int count, float[] v, int offset) {
        getPipeline().glUniform1fv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform1fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform1fv(int location, int count, java.nio.FloatBuffer v) {
        getPipeline().glUniform1fv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1i([int location, int x]);
     * 
     *  C function void glUniform1i ( GLint location, GLint x )

     * */
    public static void glUniform1i(int location, int x) {
        getPipeline().glUniform1i(location, x);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform1iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform1iv(int location, int count, int[] v, int offset) {
        getPipeline().glUniform1iv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform1iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform1iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform1iv(int location, int count, java.nio.IntBuffer v) {
        getPipeline().glUniform1iv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2f([int location, float x, float y]);
     * 
     *  C function void glUniform2f ( GLint location, GLfloat x, GLfloat y )

     * */
    public static void glUniform2f(int location, float x, float y) {
        getPipeline().glUniform2f(location, x, y);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform2fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform2fv(int location, int count, float[] v, int offset) {
        getPipeline().glUniform2fv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform2fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform2fv(int location, int count, java.nio.FloatBuffer v) {
        getPipeline().glUniform2fv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2i([int location, int x, int y]);
     * 
     *  C function void glUniform2i ( GLint location, GLint x, GLint y )

     * */
    public static void glUniform2i(int location, int x, int y) {
        getPipeline().glUniform2i(location, x, y);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform2iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform2iv(int location, int count, int[] v, int offset) {
        getPipeline().glUniform2iv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform2iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform2iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform2iv(int location, int count, java.nio.IntBuffer v) {
        getPipeline().glUniform2iv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3f([int location, float x, float y, float z]);
     * 
     *  C function void glUniform3f ( GLint location, GLfloat x, GLfloat y, GLfloat z )

     * */
    public static void glUniform3f(int location, float x, float y, float z) {
        getPipeline().glUniform3f(location, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform3fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform3fv(int location, int count, float[] v, int offset) {
        getPipeline().glUniform3fv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform3fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform3fv(int location, int count, java.nio.FloatBuffer v) {
        getPipeline().glUniform3fv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3i([int location, int x, int y, int z]);
     * 
     *  C function void glUniform3i ( GLint location, GLint x, GLint y, GLint z )

     * */
    public static void glUniform3i(int location, int x, int y, int z) {
        getPipeline().glUniform3i(location, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform3iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform3iv(int location, int count, int[] v, int offset) {
        getPipeline().glUniform3iv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform3iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform3iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform3iv(int location, int count, java.nio.IntBuffer v) {
        getPipeline().glUniform3iv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4f([int location, float x, float y, float z, float w]);
     * 
     *  C function void glUniform4f ( GLint location, GLfloat x, GLfloat y, GLfloat z, GLfloat w )

     * */
    public static void glUniform4f(int location, float x, float y, float z, float w) {
        getPipeline().glUniform4f(location, x, y, z, w);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4fv([int location, int count, float[] v, int offset]);
     * 
     *  C function void glUniform4fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform4fv(int location, int count, float[] v, int offset) {
        getPipeline().glUniform4fv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4fv([int location, int count, java.nio.FloatBuffer v]);
     * 
     *  C function void glUniform4fv ( GLint location, GLsizei count, const GLfloat *v )

     * */
    public static void glUniform4fv(int location, int count, java.nio.FloatBuffer v) {
        getPipeline().glUniform4fv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4i([int location, int x, int y, int z, int w]);
     * 
     *  C function void glUniform4i ( GLint location, GLint x, GLint y, GLint z, GLint w )

     * */
    public static void glUniform4i(int location, int x, int y, int z, int w) {
        getPipeline().glUniform4i(location, x, y, z, w);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4iv([int location, int count, int[] v, int offset]);
     * 
     *  C function void glUniform4iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform4iv(int location, int count, int[] v, int offset) {
        getPipeline().glUniform4iv(location, count, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniform4iv([int location, int count, java.nio.IntBuffer v]);
     * 
     *  C function void glUniform4iv ( GLint location, GLsizei count, const GLint *v )

     * */
    public static void glUniform4iv(int location, int count, java.nio.IntBuffer v) {
        getPipeline().glUniform4iv(location, count, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix2fv(int location, int count, boolean transpose, float[] value, int offset) {
        getPipeline().glUniformMatrix2fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        getPipeline().glUniformMatrix2fv(location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int offset) {
        getPipeline().glUniformMatrix3fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        getPipeline().glUniformMatrix3fv(location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int offset) {
        getPipeline().glUniformMatrix4fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUniformMatrix4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )

     * */
    public static void glUniformMatrix4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        getPipeline().glUniformMatrix4fv(location, count, transpose, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glUseProgram([int program]);
     * 
     *  C function void glUseProgram ( GLuint program )

     * */
    public static void glUseProgram(int program) {
        getPipeline().glUseProgram(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glValidateProgram([int program]);
     * 
     *  C function void glValidateProgram ( GLuint program )

     * */
    public static void glValidateProgram(int program) {
        getPipeline().glValidateProgram(program);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib1f([int indx, float x]);
     * 
     *  C function void glVertexAttrib1f ( GLuint indx, GLfloat x )

     * */
    public static void glVertexAttrib1f(int indx, float x) {
        getPipeline().glVertexAttrib1f(indx, x);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib1fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib1fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib1fv(int indx, float[] values, int offset) {
        getPipeline().glVertexAttrib1fv(indx, values, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib1fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib1fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib1fv(int indx, java.nio.FloatBuffer values) {
        getPipeline().glVertexAttrib1fv(indx, values);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib2f([int indx, float x, float y]);
     * 
     *  C function void glVertexAttrib2f ( GLuint indx, GLfloat x, GLfloat y )

     * */
    public static void glVertexAttrib2f(int indx, float x, float y) {
        getPipeline().glVertexAttrib2f(indx, x, y);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib2fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib2fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib2fv(int indx, float[] values, int offset) {
        getPipeline().glVertexAttrib2fv(indx, values, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib2fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib2fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib2fv(int indx, java.nio.FloatBuffer values) {
        getPipeline().glVertexAttrib2fv(indx, values);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib3f([int indx, float x, float y, float z]);
     * 
     *  C function void glVertexAttrib3f ( GLuint indx, GLfloat x, GLfloat y, GLfloat z )

     * */
    public static void glVertexAttrib3f(int indx, float x, float y, float z) {
        getPipeline().glVertexAttrib3f(indx, x, y, z);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib3fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib3fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib3fv(int indx, float[] values, int offset) {
        getPipeline().glVertexAttrib3fv(indx, values, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib3fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib3fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib3fv(int indx, java.nio.FloatBuffer values) {
        getPipeline().glVertexAttrib3fv(indx, values);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib4f([int indx, float x, float y, float z, float w]);
     * 
     *  C function void glVertexAttrib4f ( GLuint indx, GLfloat x, GLfloat y, GLfloat z, GLfloat w )

     * */
    public static void glVertexAttrib4f(int indx, float x, float y, float z, float w) {
        getPipeline().glVertexAttrib4f(indx, x, y, z, w);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib4fv([int indx, float[] values, int offset]);
     * 
     *  C function void glVertexAttrib4fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib4fv(int indx, float[] values, int offset) {
        getPipeline().glVertexAttrib4fv(indx, values, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttrib4fv([int indx, java.nio.FloatBuffer values]);
     * 
     *  C function void glVertexAttrib4fv ( GLuint indx, const GLfloat *values )

     * */
    public static void glVertexAttrib4fv(int indx, java.nio.FloatBuffer values) {
        getPipeline().glVertexAttrib4fv(indx, values);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttribPointer([int indx, int size, int type, boolean normalized, int stride, int offset]);
     * 
     *  C function void glVertexAttribPointer ( GLuint indx, GLint size, GLenum type, GLboolean normalized, GLsizei stride, GLint offset )

     * */
    public static void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int offset) {
        getPipeline().glVertexAttribPointer(indx, size, type, normalized, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glVertexAttribPointerBounds([int indx, int size, int type, boolean normalized, int stride, java.nio.Buffer ptr, int remaining]);
     * 
     *  C function void glVertexAttribPointer ( GLuint indx, GLint size, GLenum type, GLboolean normalized, GLsizei stride, const GLvoid *ptr )

     * */
    private static void glVertexAttribPointerBounds(int indx, int size, int type, boolean normalized, int stride, java.nio.Buffer ptr, int remaining) {
        getPipeline().glVertexAttribPointerBounds(indx, size, type, normalized, stride, ptr, remaining);
    }

    public static void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, java.nio.Buffer ptr) {
        glVertexAttribPointerBounds(indx, size, type, normalized, stride, ptr, ptr.remaining());
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES20.glViewport([int x, int y, int width, int height]);
     * 
     *  C function void glViewport ( GLint x, GLint y, GLsizei width, GLsizei height )

     * */
    public static void glViewport(int x, int y, int width, int height) {
        getPipeline().glViewport(x, y, width, height);
    }
}
