package gles.emulator;

import java.io.StringWriter;
import java.nio.IntBuffer;
import java.util.*;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLES30;

class GLESInfo {
        public String mRenderer = "none";
        public String mVersion = "none";
        public String mVendor = "none";
        public String mExtensions = "none";
        public int mMajorVersion = 0;
        public int mMinorVersion = 0;
        public int mShadingLanguageMajorVersion = 0;
        public int mShadingLanguageMinorVersion = 0;

        public List<String> mGLCompressedFormats;
        public List<String> mGLShaderBinaryFormats;
        public List<String> mGLProgramBinaryFormats;
        public String mShadingLanguageVersion = "empty";

    public EGLInfo eglInfo = new EGLInfo(false, "", "", "", "");
 
    public int mScreenWidth = 0;
    public int mScreenHeight = 0;
  
    public Map<String,String> mapCaps20;
    public Map<String,String> mapCaps30;
       
    public GLESInfo() {
        mGLCompressedFormats = new ArrayList<String>();
        mGLShaderBinaryFormats = new ArrayList<String>();
        mGLProgramBinaryFormats = new ArrayList<String>();
        
        getEGLImplementationInfo();
        getOpenGLES20Caps();
        getOpenGLES30Caps();
        getOpenGLImplementationInfo();
        
    }
    
    // Extract major and minor OpenGL ES version from version string 
    //(which may contain additional version numbers and info)
    public void extractOpenGLESVersion(String versionString) {
        if (versionString != null) {
         Scanner scanner = new Scanner(versionString);
            scanner.useDelimiter("[^\\w']+");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                        mMajorVersion = scanner.nextInt();
                        mMinorVersion = scanner.nextInt();
                        break;
                }
                if (scanner.hasNext()) {
                    scanner.next();
                }
            }
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 100;
        StringBuilder builder = new StringBuilder();
        builder.append("GLESInfo [");
        if (mRenderer != null) {
            builder.append("\n Renderer: ");
            builder.append(mRenderer);
            builder.append(",");
        }
        if (mVersion != null) {
            builder.append("\n Version: ");
            builder.append(mVersion);
            builder.append(",\n ");
        }
        if (mVendor != null) {
            builder.append("Vendor: ");
            builder.append(mVendor);
            builder.append(",\n ");
        }
        if (mExtensions != null) {
            builder.append("Extensions: \n");
            String[] extArr = mExtensions.split(" ");
            Arrays.sort(extArr);
            for (String ext : extArr) {
                builder.append(ext).append('\n');
            }
        }
        
        builder.append("\n ES version: ");
        builder.append(mMajorVersion);
        builder.append(".");
        builder.append(mMinorVersion);
        
        builder.append("\n Shading Language Version: ");
        builder.append(mShadingLanguageMajorVersion);
        builder.append('.');
        builder.append(mShadingLanguageMinorVersion);
        builder.append("\n");
        
        if (mGLCompressedFormats != null) {
            builder.append(" Compressed Formats:\n");
            builder.append(toString(mGLCompressedFormats, maxLen));
            builder.append("\n ");
        }
        if (mGLShaderBinaryFormats != null && mGLShaderBinaryFormats.size()>0) {
            builder.append(" Shader Binary Formats: ");
            builder.append(toString(mGLShaderBinaryFormats, maxLen));
            builder.append("\n ");
        }
        if (mGLProgramBinaryFormats != null && mGLProgramBinaryFormats.size()>0) {
            builder.append(" Program Binary Formats:\n");
            builder.append(toString(mGLProgramBinaryFormats, maxLen));
            builder.append(", ");
        }
        if (mShadingLanguageVersion != null) {
            builder.append(" Shading Language Version: ");
            builder.append(mShadingLanguageVersion);
            builder.append('\n');
        }
        if (eglInfo != null) {
            builder.append("\nEglInfo: ");
            builder.append(eglInfo);
            builder.append('\n');
        }
        builder.append("Screen width: ");
        builder.append(mScreenWidth);
        builder.append(", height: ");
        builder.append(mScreenHeight);
        builder.append("\n ");
        if (mapCaps20 != null) {
            builder.append("\n Capability Bits 2.0:\n");
            builder.append(toString(mapCaps20.entrySet(), maxLen));
            builder.append(",\n ");
        }
        if (mapCaps30 != null) {
            builder.append("\n Capability Bits 3.0:\n");
            builder.append(toString(mapCaps30.entrySet(), maxLen));
        }
        builder.append("]");
        return builder.toString();
    }

    private String toString(Collection<?> collection, int maxLen) {
        StringBuilder builder = new StringBuilder();
        builder.append("");
        int i = 0;
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
            if (i > 0) builder.append(",\n ");
            builder.append(iterator.next());
        }
        builder.append("");
        return builder.toString();
    }

    // Extract major and minor OpenGL ES shading language version from version string (which may contain additional version numbers and info)
    public void extractOpenGLESShadingLanguageVersion(String versionString) {
        if (versionString != null) {
         Scanner scanner = new Scanner(versionString);
            scanner.useDelimiter("[^\\w']+");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                        mShadingLanguageMajorVersion = scanner.nextInt();
                        mShadingLanguageMinorVersion = scanner.nextInt();
                        break;
                }
                if (scanner.hasNext()) {
                    scanner.next();
                }
            }
        }
    }
    
    public static String getCompressedFormatName(int formatID){
        switch(formatID){
        case 0x8225 : return "GL_COMPRESSED_RED";
        case 0x8226 : return "GL_COMPRESSED_RG";
        case 0x83f0 : return "GL_COMPRESSED_RGB_S3TC_DXT1_EXT";
        case 0x83f1 : return "GL_COMPRESSED_RGBA_S3TC_DXT1_EXT";
        case 0x83f2 : return "GL_COMPRESSED_RGBA_S3TC_DXT3_EXT";
        case 0x83f3 : return "GL_COMPRESSED_RGBA_S3TC_DXT5_EXT";
        case 0x84e9 : return "GL_COMPRESSED_ALPHA_ARB";
        case 0x84ea : return "GL_COMPRESSED_LUMINANCE_ARB";
        case 0x84eb : return "GL_COMPRESSED_LUMINANCE_ALPHA_ARB";
        case 0x84ec : return "GL_COMPRESSED_INTENSITY_ARB";
        case 0x84ed : return "GL_COMPRESSED_RGB_ARB";
        case 0x84ee : return "GL_COMPRESSED_RGBA_ARB";
        case 0x86a3 : return "GL_COMPRESSED_TEXTURE_FORMATS_ARB";
        case 0x86b0 : return "GL_COMPRESSED_RGB_FXT1_3DFX";
        case 0x86b1 : return "GL_COMPRESSED_RGBA_FXT1_3DFX";
        case 0x87ee : return "ATC_RGBA_INTERPOLATED_ALPHA_AMD";
        case 0x87f9 : return "3DC_X_AMD";
        case 0x87fa : return "3DC_XY_AMD";
        case 0x8b90 : return "GL_PALETTE4_RGB8_OES";
        case 0x8b91 : return "GL_PALETTE4_RGBA8_OES";
        case 0x8b92 : return "GL_PALETTE4_R5_G6_B5_OES";
        case 0x8b93 : return "GL_PALETTE4_RGBA4_OES";
        case 0x8b94 : return "GL_PALETTE4_RGB5_A1_OES";
        case 0x8b95 : return "GL_PALETTE8_RGB8_OES";
        case 0x8b96 : return "GL_PALETTE8_RGBA8_OES";
        case 0x8b97 : return "GL_PALETTE8_R5_G6_B5_OES";
        case 0x8b98 : return "GL_PALETTE8_RGBA4_OES";
        case 0x8b99 : return "GL_PALETTE8_RGB5_A1_OES";
        case 0x8c00 : return "COMPRESSED_RGB_PVRTC_4BPPV1_IMG";
        case 0x8c01 : return "COMPRESSED_RGB_PVRTC_2BPPV1_IMG";
        case 0x8c02 : return "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG";
        case 0x8c03 : return "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG";
        case 0x8c48 : return "GL_COMPRESSED_SRGB_EXT";
        case 0x8c49 : return "GL_COMPRESSED_SRGB_ALPHA_EXT";
        case 0x8c4a : return "GL_COMPRESSED_SLUMINANCE_EXT";
        case 0x8c4b : return "GL_COMPRESSED_SLUMINANCE_ALPHA_EXT";
        case 0x8c4c : return "GL_COMPRESSED_SRGB_S3TC_DXT1_EXT";
        case 0x8c4d : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT";
        case 0x8c4e : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT";
        case 0x8c4f : return "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT";
        case 0x8c70 : return "GL_COMPRESSED_LUMINANCE_LATC1_EXT";
        case 0x8c71 : return "GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT";
        case 0x8c72 : return "GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT";
        case 0x8c73 : return "GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT";
        case 0x8c92 : return "ATC_RGB_AMD";
        case 0x8c93 : return "ATC_RGBA_EXPLICIT_ALPHA_AMD";
        case 0x8d64 : return "ETC1_RGB8_OES";
        case 0x8dbb : return "GL_COMPRESSED_RED_RGTC1_EXT";
        case 0x8dbc : return "GL_COMPRESSED_SIGNED_RED_RGTC1_EXT";
        case 0x8dbd : return "GL_COMPRESSED_RED_GREEN_RGTC2_EXT";
        case 0x8dbe : return "GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT";
        case 0x8e8c : return "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB";
        case 0x8e8d : return "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB";
        case 0x8e8e : return "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB";
        case 0x8e8f : return "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB";
        case 0x9137 : return "COMPRESSED_RGBA_PVRTC_2BPPV2_IMG";
        case 0x9138 : return "COMPRESSED_RGBA_PVRTC_4BPPV2_IMG";
        case 0x9270 : return "GL_COMPRESSED_R11_EAC";
        case 0x9271 : return "GL_COMPRESSED_SIGNED_R11_EAC";
        case 0x9272 : return "GL_COMPRESSED_RG11_EAC";
        case 0x9273 : return "GL_COMPRESSED_SIGNED_RG11_EAC";
        case 0x9274 : return "GL_COMPRESSED_RGB8_ETC2";
        case 0x9275 : return "GL_COMPRESSED_SRGB8_ETC2";
        case 0x9276 : return "GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2";
        case 0x9277 : return "GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2";
        case 0x9278 : return "GL_COMPRESSED_RGBA8_ETC2_EAC";
        case 0x9279 : return "GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC";
        case 0x93b0 : return "GL_COMPRESSED_RGBA_ASTC_4x4_KHR";
        case 0x93b1 : return "GL_COMPRESSED_RGBA_ASTC_5x4_KHR";
        case 0x93b2 : return "GL_COMPRESSED_RGBA_ASTC_5x5_KHR";
        case 0x93b3 : return "GL_COMPRESSED_RGBA_ASTC_6x5_KHR";
        case 0x93b4 : return "GL_COMPRESSED_RGBA_ASTC_6x6_KHR";
        case 0x93b5 : return "GL_COMPRESSED_RGBA_ASTC_8x5_KHR";
        case 0x93b6 : return "GL_COMPRESSED_RGBA_ASTC_8x6_KHR";
        case 0x93b7 : return "GL_COMPRESSED_RGBA_ASTC_8x8_KHR";
        case 0x93b8 : return "GL_COMPRESSED_RGBA_ASTC_10x5_KHR";
        case 0x93b9 : return "GL_COMPRESSED_RGBA_ASTC_10x6_KHR";
        case 0x93ba : return "GL_COMPRESSED_RGBA_ASTC_10x8_KHR";
        case 0x93bb : return "GL_COMPRESSED_RGBA_ASTC_10x10_KHR";
        case 0x93bc : return "GL_COMPRESSED_RGBA_ASTC_12x10_KHR";
        case 0x93bd : return "GL_COMPRESSED_RGBA_ASTC_12x12_KHR";
        case 0x93c0 : return "GL_COMPRESSED_RGBA_ASTC_3x3x3_OES";
        case 0x93c1 : return "GL_COMPRESSED_RGBA_ASTC_4x3x3_OES";
        case 0x93c2 : return "GL_COMPRESSED_RGBA_ASTC_4x4x3_OES";
        case 0x93c3 : return "GL_COMPRESSED_RGBA_ASTC_4x4x4_OES";
        case 0x93c4 : return "GL_COMPRESSED_RGBA_ASTC_5x4x4_OES";
        case 0x93c5 : return "GL_COMPRESSED_RGBA_ASTC_5x5x4_OES";
        case 0x93c6 : return "GL_COMPRESSED_RGBA_ASTC_5x5x5_OES";
        case 0x93c7 : return "GL_COMPRESSED_RGBA_ASTC_6x5x5_OES";
        case 0x93c8 : return "GL_COMPRESSED_RGBA_ASTC_6x6x5_OES";
        case 0x93c9 : return "GL_COMPRESSED_RGBA_ASTC_6x6x6_OES";
        case 0x93d0 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR";
        case 0x93d1 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR";
        case 0x93d2 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR";
        case 0x93d3 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR";
        case 0x93d4 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR";
        case 0x93d5 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR";
        case 0x93d6 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR";
        case 0x93d7 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR";
        case 0x93d8 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR";
        case 0x93d9 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR";
        case 0x93da : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR";
        case 0x93db : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR";
        case 0x93dc : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR";
        case 0x93dd : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR";
        case 0x93e0 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_3x3x3_OES";
        case 0x93e1 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x3x3_OES";
        case 0x93e2 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x3_OES";
        case 0x93e3 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x4_OES";
        case 0x93e4 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4x4_OES";
        case 0x93e5 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x4_OES";
        case 0x93e6 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x5_OES";
        case 0x93e7 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5x5_OES";
        case 0x93e8 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x5_OES";
        case 0x93e9 : return "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x6_OES";
        default:
            return "0x" + Integer.toHexString(formatID);
        }
        
    }
    
        // Get name from binary shader format enum
        public String getBinaryShaderFormatName(int shaderFormat) {
                switch(shaderFormat) {                
                // GL_FJ_shader_binary_GCCSO
                case 0x9260: return "GCCSO_SHADER_BINARY_FJ";
                // GL_IMG_shader_binary
                case 0x8C0A: return "SGX_BINARY_IMG";
                 // GL_ARM_mali_shader_binary
                case 0x8F60: return "MALI_SHADER_BINARY_ARM";                 
                // GL_VIV_shader_binary
                case 0x8FC4: return"SHADER_BINARY_VIV";
                // GL_DMP_shader_binary
                case 0x9250: return "SHADER_BINARY_DMP";                                                                                
                // GL_DMP_shader_binary
                case 0x890B:   return "NVIDIA_PLATFORM_BINARY_NV";                
                default:
                    return "0x" + Integer.toHexString(shaderFormat);
                }               
        }
        
        // Get name from binary program format enum
    public String getBinaryProgramFormatName(int programFormat) {

        switch (programFormat) {
        // GL_AMD_program_binary_Z400
            case 0x8740:   return "Z400_BINARY_AMD";
                // GL_IMG_program_binary
            case 0x9130:   return "SGX_PROGRAM_BINARY_IMG";
                // GL_ARM_mali_program_binary
            case 0x8F61:   return "MALI_PROGRAM_BINARY_ARM";
                // GL_ANGLE_program_binary
            case 0x93A6: return "PROGRAM_BINARY_ANGLE";
            default:
                return "0x" + Integer.toHexString(programFormat);
        }

    }

        // Gathers (and stores) all OpenGL ES 2.0 related information
        public void getOpenGLES20Caps() {
                final String[] capDisplayNames = {
                        "Max. combined texture image units",
                    "Max. cubemap texture size",
                    "Max. fragment uniform buffers",
                    "Max. renderbuffer size",
                    "Max. texture image units",
                    "Max. texture size",
                    "Max. varying vectors",
                    "Max. vertex attributes",
                    "Max. vertex texture image units",
                    "Max. vertex uniform vectors",
                    "Max. viewport dimension",
                    "Max. compressed texture formats",
                    "Number of binary shader formats",
                    "Number of binary program formats" // Works on ES 2.0 too
                };              

                final int[] capValues = {
                        GLES20.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS,
                    GLES20.GL_MAX_CUBE_MAP_TEXTURE_SIZE,
                    GLES20.GL_MAX_FRAGMENT_UNIFORM_VECTORS,
                    GLES20.GL_MAX_RENDERBUFFER_SIZE,
                    GLES20.GL_MAX_TEXTURE_IMAGE_UNITS,
                    GLES20.GL_MAX_TEXTURE_SIZE,
                    GLES20.GL_MAX_VARYING_VECTORS,
                    GLES20.GL_MAX_VERTEX_ATTRIBS,
                    GLES20.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS,
                    GLES20.GL_MAX_VERTEX_UNIFORM_VECTORS,
                    GLES20.GL_MAX_VIEWPORT_DIMS,                        
                    GLES20.GL_NUM_COMPRESSED_TEXTURE_FORMATS,
                    GLES20.GL_NUM_SHADER_BINARY_FORMATS,
                    GLES30.GL_NUM_PROGRAM_BINARY_FORMATS // Works on ES 2.0 too
                };
                
                final String[] capNames = {
                                "GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS",
                            "GL_MAX_CUBE_MAP_TEXTURE_SIZE",
                            "GL_MAX_FRAGMENT_UNIFORM_VECTORS",
                            "GL_MAX_RENDERBUFFER_SIZE",
                            "GL_MAX_TEXTURE_IMAGE_UNITS",
                            "GL_MAX_TEXTURE_SIZE",
                            "GL_MAX_VARYING_VECTORS",
                            "GL_MAX_VERTEX_ATTRIBS",
                            "GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS",
                            "GL_MAX_VERTEX_UNIFORM_VECTORS",
                            "GL_MAX_VIEWPORT_DIMS",                     
                            "GL_NUM_COMPRESSED_TEXTURE_FORMATS",
                            "GL_NUM_SHADER_BINARY_FORMATS",
                            "GL_NUM_PROGRAM_BINARY_FORMATS" // Works on ES 2.0 too
                        };              
                
                IntBuffer capsValue = IntBuffer.allocate(2); 
                mapCaps20 = new LinkedHashMap<String, String>(capNames.length);

                for (int i=0; i < capValues.length; i++) {                        
                        GLES20.glGetIntegerv(capValues[i], (IntBuffer)capsValue.rewind());              
                        if (GLES20.glGetError() == GLES20.GL_NO_ERROR) {                               
                                mapCaps20.put(capDisplayNames[i], String.valueOf(capsValue.get(0)));
                        } else {                                
                                mapCaps20.put(capDisplayNames[i], "unknown");
                        }
                }
        }
        
        // Gathers (and stores) all OpenGL ES 3.0 related information 
        // (Note : Only call when ES 3.0 is available, else values may be more-or-less random)
        public void getOpenGLES30Caps() {

                final int[] capValues = {
                        GLES30.GL_MAX_3D_TEXTURE_SIZE,
                        GLES30.GL_MAX_ARRAY_TEXTURE_LAYERS,
                        GLES30.GL_MAX_COLOR_ATTACHMENTS,
                        GLES30.GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS,
                        GLES30.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS,
                        GLES30.GL_MAX_COMBINED_UNIFORM_BLOCKS,
                        GLES30.GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS,
                        GLES30.GL_MAX_CUBE_MAP_TEXTURE_SIZE,
                        GLES30.GL_MAX_DRAW_BUFFERS,
                        GLES30.GL_MAX_ELEMENT_INDEX,
                        GLES30.GL_MAX_ELEMENTS_INDICES,
                        GLES30.GL_MAX_ELEMENTS_VERTICES,
                        GLES30.GL_MAX_FRAGMENT_INPUT_COMPONENTS,
                        GLES30.GL_MAX_FRAGMENT_UNIFORM_BLOCKS,
                        GLES30.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS,
                        GLES30.GL_MAX_FRAGMENT_UNIFORM_VECTORS,
                        GLES30.GL_MIN_PROGRAM_TEXEL_OFFSET,
                        GLES30.GL_MAX_PROGRAM_TEXEL_OFFSET,
                        GLES30.GL_MAX_RENDERBUFFER_SIZE,
                        GLES30.GL_MAX_SAMPLES,
                        GLES30.GL_MAX_SERVER_WAIT_TIMEOUT,
                        GLES30.GL_MAX_TEXTURE_IMAGE_UNITS,
                        GLES30.GL_MAX_TEXTURE_LOD_BIAS,
                        GLES30.GL_MAX_TEXTURE_SIZE,
                        GLES30.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS,
                        GLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS,
                        GLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS,
                        GLES30.GL_MAX_UNIFORM_BLOCK_SIZE,
                        GLES30.GL_MAX_UNIFORM_BUFFER_BINDINGS,
                        GLES30.GL_MAX_VARYING_COMPONENTS,
                        GLES30.GL_MAX_VARYING_VECTORS,
                        GLES30.GL_MAX_VERTEX_ATTRIBS,
                        GLES30.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS,
                        GLES30.GL_MAX_VERTEX_OUTPUT_COMPONENTS,
                        GLES30.GL_MAX_VERTEX_UNIFORM_BLOCKS,
                        GLES30.GL_MAX_VERTEX_UNIFORM_COMPONENTS,
                        GLES30.GL_MAX_VERTEX_UNIFORM_VECTORS,
                        GLES30.GL_MAX_VIEWPORT_DIMS
                };              
                
                final String[] capDisplayNames = {
                        "Max. 3D texture size",
                        "Max. array texture layers",
                        "Max. framebuffer color attachments",
                        "Max. fragment shader uniform variables",
                        "Max. combined texture image units",
                        "Max. uniform blocks per program",
                        "Max. words for vertex shader uniform variables",
                        "Max. cubemap texture size",
                        "Max. draw fragment shader outputs",
                        "Max. support implementation index",
                        "Recommended max vertex array indices",
                        "Recommended max vertex array vertices",
                        "Max. fragment shader inputs",
                        "Max. fragment shader uniform blocks",
                        "Max. fragment shader uniform components",
                        "Max. fragment shader uniform vectors",
                        "Max. texture lookup texel offset",
                        "Max. renderbuffer size",
                        "Max. number of multisample samples",
                        "Max. glWaitSync timeout interval",
                        "Max. texture image units",
                        "Min. absolute level-of-detail bias",
                        "Max. absolute level-of-detail bias",
                        "Max. texture size",
                        "Max. transform feedback buffer components (interleaved mode)",
                        "Max. separate transform feedback mode attributes or outputs",
                        "Max. separate transform feedback mode components perattribute or output",
                        "Max. size of uniform blocks (in basic machine units)",
                        "Max. uniform buffer binding points",
                        "Max. varying components",
                        "Max. varying vectors",
                        "Max. vertex attributes",
                        "Max. vertex texture image units",
                        "Max. vertex shader output components",
                        "Max. vertex shader uniform blocks",                    
                        "Max. vertex shader uniform components",
                        "Max. vertex shader uniform vectors",
                        "Max. viewport dimension"
                };
                
                final String[] capNames = {
                                "GL_MAX_3D_TEXTURE_SIZE",
                                "GL_MAX_ARRAY_TEXTURE_LAYERS",
                                "GL_MAX_COLOR_ATTACHMENTS",
                                "GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS",
                                "GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS",
                                "GL_MAX_COMBINED_UNIFORM_BLOCKS",
                                "GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS",
                                "GL_MAX_CUBE_MAP_TEXTURE_SIZE",
                                "GL_MAX_DRAW_BUFFERS",
                                "GL_MAX_ELEMENT_INDEX",
                                "GL_MAX_ELEMENTS_INDICES",
                                "GL_MAX_ELEMENTS_VERTICES",
                                "GL_MAX_FRAGMENT_INPUT_COMPONENTS",
                                "GL_MAX_FRAGMENT_UNIFORM_BLOCKS",
                                "GL_MAX_FRAGMENT_UNIFORM_COMPONENTS",
                                "GL_MAX_FRAGMENT_UNIFORM_VECTORS",
                                "GL_MIN_PROGRAM_TEXEL_OFFSET",
                                "GL_MAX_PROGRAM_TEXEL_OFFSET",
                                "GL_MAX_RENDERBUFFER_SIZE",
                                "GL_MAX_SAMPLES",
                                "GL_MAX_SERVER_WAIT_TIMEOUT",
                                "GL_MAX_TEXTURE_IMAGE_UNITS",
                                "GL_MAX_TEXTURE_LOD_BIAS",
                                "GL_MAX_TEXTURE_SIZE",
                                "GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS",
                                "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS",
                                "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS",
                                "GL_MAX_UNIFORM_BLOCK_SIZE",
                                "GL_MAX_UNIFORM_BUFFER_BINDINGS",
                                "GL_MAX_VARYING_COMPONENTS",
                                "GL_MAX_VARYING_VECTORS",
                                "GL_MAX_VERTEX_ATTRIBS",
                                "GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS",
                                "GL_MAX_VERTEX_OUTPUT_COMPONENTS",
                                "GL_MAX_VERTEX_UNIFORM_BLOCKS",
                                "GL_MAX_VERTEX_UNIFORM_COMPONENTS",
                                "GL_MAX_VERTEX_UNIFORM_VECTORS",
                                "GL_MAX_VIEWPORT_DIMS"
                        };                      
                
        IntBuffer capsValue = IntBuffer.allocate(2);
        mapCaps30 = new LinkedHashMap<String, String>(capValues.length);
        for (int i = 0; i < capValues.length; i++) {
            GLES20.glGetIntegerv(capValues[i], (IntBuffer) capsValue.rewind());
            if (GLES20.glGetError() == GLES20.GL_NO_ERROR) {
                mapCaps30.put(capDisplayNames[i], String.valueOf(capsValue.get(0)));
            } else {
                mapCaps30.put(capDisplayNames[i], "unknown");
            }
        }
                                
        }
        
        // Get OpenGL information of current implementation
        public void getOpenGLImplementationInfo() {
                // Get supported OpenGL ES version
                extractOpenGLESVersion(GLES20.glGetString(GLES20.GL_VERSION));
                
                //IntBuffer GLintVal = IntBuffer.allocate(1);
                int glError;
                final int[] glRes = new int[1];
                IntBuffer GLintVal = IntBuffer.allocate(2);
                IntBuffer GLintArr = IntBuffer.allocate(2);
                
                // Gather information on the OpenGL ES implementation
                mRenderer = GLES20.glGetString(GLES20.GL_RENDERER);        
                mVersion = GLES20.glGetString(GLES20.GL_VERSION);
                mVendor = GLES20.glGetString(GLES20.GL_VENDOR);        
                mExtensions = GLES20.glGetString(GLES20.GL_EXTENSIONS);
                mShadingLanguageVersion = GLES20.glGetString(GLES20.GL_SHADING_LANGUAGE_VERSION);
                if (mShadingLanguageVersion == null) {
                        // OpenGL ES 1.x device?
                        mShadingLanguageVersion = "unknown";
                } else {
                        extractOpenGLESShadingLanguageVersion(GLES20.glGetString(GLES20.GL_SHADING_LANGUAGE_VERSION));                  
                }

                
                // OpenGL ES caps
                if (mMajorVersion >= 2) 
                        getOpenGLES20Caps();
                
                if (mMajorVersion >= 3)
                        getOpenGLES30Caps();

                // Available compressed texture formats
                GLES20.glGetIntegerv(GLES20.GL_NUM_COMPRESSED_TEXTURE_FORMATS, (IntBuffer)GLintVal.rewind());
                glError = GLES20.glGetError();          
                if (glError == GLES20.GL_NO_ERROR) {
                        if (GLintVal.get(0) > 0) {
                                GLintArr = IntBuffer.allocate(GLintVal.get(0));
                                GLES20.glGetIntegerv(GLES20.GL_COMPRESSED_TEXTURE_FORMATS, (IntBuffer)GLintArr.rewind());                                               
                                for (int i=0; i < GLintArr.capacity(); ++i) {                                   
                                        mGLCompressedFormats.add(getCompressedFormatName(GLintArr.get(i)));
                                }
                        }
                }               

                // Available binary shader formats              
                GLES20.glGetIntegerv(GLES20.GL_NUM_SHADER_BINARY_FORMATS, (IntBuffer)GLintVal.rewind());
                glError = GLES20.glGetError();
                if (glError == GLES20.GL_NO_ERROR) {
                        if (GLintVal.get(0) > 0) {
                                GLintArr = IntBuffer.allocate(GLintVal.get(0));
                                GLES20.glGetIntegerv(GLES20.GL_SHADER_BINARY_FORMATS, (IntBuffer)GLintArr.rewind());                                            
                                for (int i=0; i < GLintArr.capacity(); ++i) {                                   
                                        mGLShaderBinaryFormats.add(getBinaryShaderFormatName(GLintArr.get(i)));
                                }
                        }
                }
                
                // Available binary program formats (actually ES 3.0, but partially available on ES 2.0 devices)                
                GLES20.glGetIntegerv(GLES30.GL_NUM_PROGRAM_BINARY_FORMATS, (IntBuffer)GLintVal.rewind());
                glError = GLES20.glGetError();
                if (glError == GLES20.GL_NO_ERROR) {
                        if (GLintVal.get(0) > 0) {
                                GLintArr = IntBuffer.allocate(GLintVal.get(0));
                                GLES20.glGetIntegerv(GLES30.GL_PROGRAM_BINARY_FORMATS, (IntBuffer)GLintArr.rewind());                                           
                                for (int i=0; i < GLintArr.capacity(); ++i) {                                   
                                        mGLProgramBinaryFormats.add(getBinaryProgramFormatName(GLintArr.get(i)));
                                }
                        }
                }
        }

        // Get EGL information of current implementation
    public void getEGLImplementationInfo() {
        EGL14LogWrapper EGL = new EGL14LogWrapper(false, false, System.out);// (EGL10)EGLContext.getEGL();
        EGLDisplay eglDisplay = EGL.eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY);
        int[] major = new int[2];
        if (EGL.eglInitialize(eglDisplay, major, 0, major, 1)) {
            eglInfo.setmEGLAvailable(true);
            eglInfo.setmEGLVersion(EGL.eglQueryString(eglDisplay, EGL14.EGL_VERSION));
            eglInfo.setmEGLVendor(EGL.eglQueryString(eglDisplay, EGL14.EGL_VENDOR));
            eglInfo.setmEGLExtensions(EGL.eglQueryString(eglDisplay, EGL14.EGL_EXTENSIONS));
            eglInfo.setmEGLClientAPIs(EGL.eglQueryString(eglDisplay, EGL14.EGL_CLIENT_APIS));
            
            // Available configurations
            int[] numEGLConfigs = new int[1];
            EGL.eglGetConfigs(eglDisplay, null, 0, numEGLConfigs);
            int EGLConfigCount = numEGLConfigs[0];
            EGLConfig[] eglConfigs = new EGLConfig[EGLConfigCount];
            EGL.eglGetConfigs(eglDisplay, eglConfigs, EGLConfigCount, numEGLConfigs);
            eglInfo.setmEGLConfigs(new EGLConfigInfo[numEGLConfigs[0]]);
            for (int i = 0; i < eglConfigs.length; i++) {
                eglInfo.getmEGLConfigs()[i] = new EGLConfigInfo(eglConfigs[i], eglDisplay);
            }
        } else {
            eglInfo.setmEGLAvailable(false);
        }
    }
      
  
}