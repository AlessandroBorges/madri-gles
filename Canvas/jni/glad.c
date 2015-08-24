/**
 * From https://github.com/Dav1dde/glad
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 David Herberth
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 **/
 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <glad/glad.h>

struct gladGLversionStruct GLVersion;

#if defined(GL_ES_VERSION_3_0) || defined(GL_VERSION_3_0)
#define _GLAD_IS_SOME_NEW_VERSION 1
#endif

static int max_loaded_major;
static int max_loaded_minor;

static const char *exts = NULL;
static int num_exts_i = 0;
static const char **exts_i = NULL;

static void get_exts(void) {
#ifdef _GLAD_IS_SOME_NEW_VERSION
    if(max_loaded_major < 3) {
#endif
        exts = (const char *)glGetString(GL_EXTENSIONS);
#ifdef _GLAD_IS_SOME_NEW_VERSION
    } else {
        int index;

        num_exts_i = 0;
        glGetIntegerv(GL_NUM_EXTENSIONS, &num_exts_i);
        if (num_exts_i > 0) {
            exts_i = (const char **)realloc((void *)exts_i, num_exts_i * sizeof *exts_i);
        }

        for(index = 0; index < num_exts_i; index++) {
            exts_i[index] = (const char*)glGetStringi(GL_EXTENSIONS, index);
        }
    }
#endif
}

static int has_ext(const char *ext) {
#ifdef _GLAD_IS_SOME_NEW_VERSION
    if(max_loaded_major < 3) {
#endif
        const char *extensions;
        const char *loc;
        const char *terminator;
        extensions = exts;
        if(extensions == NULL || ext == NULL) {
            return 0;
        }

        while(1) {
            loc = strstr(extensions, ext);
            if(loc == NULL) {
                return 0;
            }

            terminator = loc + strlen(ext);
            if((loc == extensions || *(loc - 1) == ' ') &&
                (*terminator == ' ' || *terminator == '\0')) {
                return 1;
            }
            extensions = terminator;
        }
#ifdef _GLAD_IS_SOME_NEW_VERSION
    } else {
        int index;

        for(index = 0; index < num_exts_i; index++) {
            const char *e = exts_i[index];

            if(strcmp(e, ext) == 0) {
                return 1;
            }
        }
    }
#endif

    return 0;
}
int GLAD_GL_VERSION_ES_CM_1_0;
PFNGLFLUSHPROC glad_glFlush;
PFNGLCLEARCOLORPROC glad_glClearColor;
PFNGLBINDTEXTUREPROC glad_glBindTexture;
PFNGLCOLOR4UBPROC glad_glColor4ub;
PFNGLGETMATERIALFVPROC glad_glGetMaterialfv;
PFNGLLIGHTXPROC glad_glLightx;
PFNGLGETTEXPARAMETERXVPROC glad_glGetTexParameterxv;
PFNGLSCALEFPROC glad_glScalef;
PFNGLCLEARCOLORXPROC glad_glClearColorx;
PFNGLPOINTPARAMETERFVPROC glad_glPointParameterfv;
PFNGLLINEWIDTHPROC glad_glLineWidth;
PFNGLSCALEXPROC glad_glScalex;
PFNGLLOADMATRIXFPROC glad_glLoadMatrixf;
PFNGLTEXENVXVPROC glad_glTexEnvxv;
PFNGLLIGHTFPROC glad_glLightf;
PFNGLFOGXVPROC glad_glFogxv;
PFNGLDELETETEXTURESPROC glad_glDeleteTextures;
PFNGLCLEARDEPTHXPROC glad_glClearDepthx;
PFNGLDEPTHRANGEFPROC glad_glDepthRangef;
PFNGLGETTEXPARAMETERIVPROC glad_glGetTexParameteriv;
PFNGLCLEARSTENCILPROC glad_glClearStencil;
PFNGLFOGFVPROC glad_glFogfv;
PFNGLSAMPLECOVERAGEPROC glad_glSampleCoverage;
PFNGLGENTEXTURESPROC glad_glGenTextures;
PFNGLDEPTHFUNCPROC glad_glDepthFunc;
PFNGLLIGHTMODELXVPROC glad_glLightModelxv;
PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC glad_glCompressedTexSubImage2D;
PFNGLDEPTHRANGEXPROC glad_glDepthRangex;
PFNGLMULTITEXCOORD4FPROC glad_glMultiTexCoord4f;
PFNGLGETTEXPARAMETERFVPROC glad_glGetTexParameterfv;
PFNGLISBUFFERPROC glad_glIsBuffer;
PFNGLMULTMATRIXXPROC glad_glMultMatrixx;
PFNGLCOPYTEXSUBIMAGE2DPROC glad_glCopyTexSubImage2D;
PFNGLCOMPRESSEDTEXIMAGE2DPROC glad_glCompressedTexImage2D;
PFNGLDISABLEPROC glad_glDisable;
PFNGLLOGICOPPROC glad_glLogicOp;
PFNGLCOLORMASKPROC glad_glColorMask;
PFNGLHINTPROC glad_glHint;
PFNGLVERTEXPOINTERPROC glad_glVertexPointer;
PFNGLMULTITEXCOORD4XPROC glad_glMultiTexCoord4x;
PFNGLGETTEXENVFVPROC glad_glGetTexEnvfv;
PFNGLLINEWIDTHXPROC glad_glLineWidthx;
PFNGLCULLFACEPROC glad_glCullFace;
PFNGLGETLIGHTFVPROC glad_glGetLightfv;
PFNGLPOINTSIZEPROC glad_glPointSize;
PFNGLDRAWARRAYSPROC glad_glDrawArrays;
PFNGLVIEWPORTPROC glad_glViewport;
PFNGLLOADIDENTITYPROC glad_glLoadIdentity;
PFNGLTEXENVFPROC glad_glTexEnvf;
PFNGLCOPYTEXIMAGE2DPROC glad_glCopyTexImage2D;
PFNGLENABLECLIENTSTATEPROC glad_glEnableClientState;
PFNGLGETBUFFERPARAMETERIVPROC glad_glGetBufferParameteriv;
PFNGLGETSTRINGPROC glad_glGetString;
PFNGLDRAWELEMENTSPROC glad_glDrawElements;
PFNGLTEXENVIPROC glad_glTexEnvi;
PFNGLCLIENTACTIVETEXTUREPROC glad_glClientActiveTexture;
PFNGLBUFFERSUBDATAPROC glad_glBufferSubData;
PFNGLTEXENVFVPROC glad_glTexEnvfv;
PFNGLMATRIXMODEPROC glad_glMatrixMode;
PFNGLSAMPLECOVERAGEXPROC glad_glSampleCoveragex;
PFNGLLIGHTMODELFVPROC glad_glLightModelfv;
PFNGLGETLIGHTXVPROC glad_glGetLightxv;
PFNGLNORMALPOINTERPROC glad_glNormalPointer;
PFNGLGETMATERIALXVPROC glad_glGetMaterialxv;
PFNGLPOPMATRIXPROC glad_glPopMatrix;
PFNGLFOGXPROC glad_glFogx;
PFNGLPOINTSIZEXPROC glad_glPointSizex;
PFNGLDEPTHMASKPROC glad_glDepthMask;
PFNGLPOINTPARAMETERFPROC glad_glPointParameterf;
PFNGLPOINTPARAMETERXPROC glad_glPointParameterx;
PFNGLTEXSUBIMAGE2DPROC glad_glTexSubImage2D;
PFNGLORTHOXPROC glad_glOrthox;
PFNGLFOGFPROC glad_glFogf;
PFNGLTEXIMAGE2DPROC glad_glTexImage2D;
PFNGLLIGHTMODELFPROC glad_glLightModelf;
PFNGLLIGHTFVPROC glad_glLightfv;
PFNGLROTATEXPROC glad_glRotatex;
PFNGLCLEARPROC glad_glClear;
PFNGLACTIVETEXTUREPROC glad_glActiveTexture;
PFNGLMATERIALXVPROC glad_glMaterialxv;
PFNGLTEXENVXPROC glad_glTexEnvx;
PFNGLBINDBUFFERPROC glad_glBindBuffer;
PFNGLROTATEFPROC glad_glRotatef;
PFNGLSTENCILOPPROC glad_glStencilOp;
PFNGLREADPIXELSPROC glad_glReadPixels;
PFNGLLIGHTMODELXPROC glad_glLightModelx;
PFNGLGETTEXENVXVPROC glad_glGetTexEnvxv;
PFNGLTRANSLATEFPROC glad_glTranslatef;
PFNGLLOADMATRIXXPROC glad_glLoadMatrixx;
PFNGLBUFFERDATAPROC glad_glBufferData;
PFNGLALPHAFUNCXPROC glad_glAlphaFuncx;
PFNGLDISABLECLIENTSTATEPROC glad_glDisableClientState;
PFNGLGETERRORPROC glad_glGetError;
PFNGLGETTEXENVIVPROC glad_glGetTexEnviv;
PFNGLTEXPARAMETERIVPROC glad_glTexParameteriv;
PFNGLGETFLOATVPROC glad_glGetFloatv;
PFNGLMULTMATRIXFPROC glad_glMultMatrixf;
PFNGLALPHAFUNCPROC glad_glAlphaFunc;
PFNGLTRANSLATEXPROC glad_glTranslatex;
PFNGLGETCLIPPLANEXPROC glad_glGetClipPlanex;
PFNGLMATERIALXPROC glad_glMaterialx;
PFNGLSTENCILFUNCPROC glad_glStencilFunc;
PFNGLGETINTEGERVPROC glad_glGetIntegerv;
PFNGLGETCLIPPLANEFPROC glad_glGetClipPlanef;
PFNGLTEXCOORDPOINTERPROC glad_glTexCoordPointer;
PFNGLPUSHMATRIXPROC glad_glPushMatrix;
PFNGLORTHOFPROC glad_glOrthof;
PFNGLCLIPPLANEFPROC glad_glClipPlanef;
PFNGLFRUSTUMXPROC glad_glFrustumx;
PFNGLSTENCILMASKPROC glad_glStencilMask;
PFNGLCOLOR4XPROC glad_glColor4x;
PFNGLMATERIALFPROC glad_glMaterialf;
PFNGLISTEXTUREPROC glad_glIsTexture;
PFNGLSHADEMODELPROC glad_glShadeModel;
PFNGLCOLOR4FPROC glad_glColor4f;
PFNGLFRUSTUMFPROC glad_glFrustumf;
PFNGLTEXPARAMETERFVPROC glad_glTexParameterfv;
PFNGLENABLEPROC glad_glEnable;
PFNGLISENABLEDPROC glad_glIsEnabled;
PFNGLNORMAL3XPROC glad_glNormal3x;
PFNGLTEXENVIVPROC glad_glTexEnviv;
PFNGLGENBUFFERSPROC glad_glGenBuffers;
PFNGLFINISHPROC glad_glFinish;
PFNGLLIGHTXVPROC glad_glLightxv;
PFNGLNORMAL3FPROC glad_glNormal3f;
PFNGLBLENDFUNCPROC glad_glBlendFunc;
PFNGLTEXPARAMETERXVPROC glad_glTexParameterxv;
PFNGLPIXELSTOREIPROC glad_glPixelStorei;
PFNGLCLIPPLANEXPROC glad_glClipPlanex;
PFNGLGETBOOLEANVPROC glad_glGetBooleanv;
PFNGLGETPOINTERVPROC glad_glGetPointerv;
PFNGLPOLYGONOFFSETPROC glad_glPolygonOffset;
PFNGLPOLYGONOFFSETXPROC glad_glPolygonOffsetx;
PFNGLPOINTPARAMETERXVPROC glad_glPointParameterxv;
PFNGLTEXPARAMETERFPROC glad_glTexParameterf;
PFNGLCOLORPOINTERPROC glad_glColorPointer;
PFNGLTEXPARAMETERIPROC glad_glTexParameteri;
PFNGLFRONTFACEPROC glad_glFrontFace;
PFNGLCLEARDEPTHFPROC glad_glClearDepthf;
PFNGLDELETEBUFFERSPROC glad_glDeleteBuffers;
PFNGLSCISSORPROC glad_glScissor;
PFNGLGETFIXEDVPROC glad_glGetFixedv;
PFNGLMATERIALFVPROC glad_glMaterialfv;
PFNGLTEXPARAMETERXPROC glad_glTexParameterx;
int GLAD_GL_OES_texture_mirrored_repeat;
int GLAD_GL_EXT_multi_draw_arrays;
int GLAD_GL_AMD_compressed_3DC_texture;
int GLAD_GL_EXT_texture_compression_dxt1;
int GLAD_GL_OES_single_precision;
int GLAD_GL_OES_point_size_array;
int GLAD_GL_OES_element_index_uint;
int GLAD_GL_OES_texture_cube_map;
int GLAD_GL_IMG_user_clip_plane;
int GLAD_GL_NV_fence;
int GLAD_GL_EXT_map_buffer_range;
int GLAD_GL_OES_blend_subtract;
int GLAD_GL_EXT_read_format_bgra;
int GLAD_GL_OES_read_format;
int GLAD_GL_OES_compressed_ETC1_RGB8_texture;
int GLAD_GL_QCOM_extended_get2;
int GLAD_GL_OES_EGL_image_external;
int GLAD_GL_OES_required_internalformat;
int GLAD_GL_OES_extended_matrix_palette;
int GLAD_GL_APPLE_texture_max_level;
int GLAD_GL_EXT_multisampled_render_to_texture;
int GLAD_GL_QCOM_writeonly_rendering;
int GLAD_GL_OES_packed_depth_stencil;
int GLAD_GL_IMG_texture_env_enhanced_fixed_function;
int GLAD_GL_APPLE_texture_format_BGRA8888;
int GLAD_GL_EXT_discard_framebuffer;
int GLAD_GL_OES_fixed_point;
int GLAD_GL_QCOM_perfmon_global_mode;
int GLAD_GL_OES_matrix_palette;
int GLAD_GL_OES_mapbuffer;
int GLAD_GL_IMG_multisampled_render_to_texture;
int GLAD_GL_OES_depth32;
int GLAD_GL_APPLE_framebuffer_multisample;
int GLAD_GL_APPLE_copy_texture_levels;
int GLAD_GL_EXT_texture_format_BGRA8888;
int GLAD_GL_APPLE_texture_2D_limited_npot;
int GLAD_GL_OES_EGL_image;
int GLAD_GL_QCOM_extended_get;
int GLAD_GL_OES_query_matrix;
int GLAD_GL_OES_point_sprite;
int GLAD_GL_QCOM_tiled_rendering;
int GLAD_GL_OES_stencil8;
int GLAD_GL_OES_blend_equation_separate;
int GLAD_GL_OES_stencil4;
int GLAD_GL_OES_framebuffer_object;
int GLAD_GL_OES_stencil1;
int GLAD_GL_ARM_rgba8;
int GLAD_GL_EXT_robustness;
int GLAD_GL_EXT_sRGB;
int GLAD_GL_EXT_texture_lod_bias;
int GLAD_GL_OES_compressed_ETC1_RGB8_sub_texture;
int GLAD_GL_OES_draw_texture;
int GLAD_GL_OES_blend_func_separate;
int GLAD_GL_OES_texture_env_crossbar;
int GLAD_GL_OES_rgb8_rgba8;
int GLAD_GL_OES_fbo_render_mipmap;
int GLAD_GL_OES_compressed_paletted_texture;
int GLAD_GL_OES_vertex_array_object;
int GLAD_GL_OES_matrix_get;
int GLAD_GL_EXT_texture_filter_anisotropic;
int GLAD_GL_EXT_blend_minmax;
int GLAD_GL_OES_byte_coordinates;
int GLAD_GL_IMG_read_format;
int GLAD_GL_OES_depth24;
int GLAD_GL_OES_stencil_wrap;
int GLAD_GL_APPLE_sync;
int GLAD_GL_EXT_texture_storage;
int GLAD_GL_AMD_compressed_ATC_texture;
int GLAD_GL_QCOM_driver_control;
int GLAD_GL_IMG_texture_compression_pvrtc;
PFNGLCOPYTEXTURELEVELSAPPLEPROC glad_glCopyTextureLevelsAPPLE;
PFNGLRENDERBUFFERSTORAGEMULTISAMPLEAPPLEPROC glad_glRenderbufferStorageMultisampleAPPLE;
PFNGLRESOLVEMULTISAMPLEFRAMEBUFFERAPPLEPROC glad_glResolveMultisampleFramebufferAPPLE;
PFNGLFENCESYNCAPPLEPROC glad_glFenceSyncAPPLE;
PFNGLISSYNCAPPLEPROC glad_glIsSyncAPPLE;
PFNGLDELETESYNCAPPLEPROC glad_glDeleteSyncAPPLE;
PFNGLCLIENTWAITSYNCAPPLEPROC glad_glClientWaitSyncAPPLE;
PFNGLWAITSYNCAPPLEPROC glad_glWaitSyncAPPLE;
PFNGLGETINTEGER64VAPPLEPROC glad_glGetInteger64vAPPLE;
PFNGLGETSYNCIVAPPLEPROC glad_glGetSyncivAPPLE;
PFNGLBLENDEQUATIONEXTPROC glad_glBlendEquationEXT;
PFNGLDISCARDFRAMEBUFFEREXTPROC glad_glDiscardFramebufferEXT;
PFNGLMAPBUFFERRANGEEXTPROC glad_glMapBufferRangeEXT;
PFNGLFLUSHMAPPEDBUFFERRANGEEXTPROC glad_glFlushMappedBufferRangeEXT;
PFNGLMULTIDRAWARRAYSEXTPROC glad_glMultiDrawArraysEXT;
PFNGLMULTIDRAWELEMENTSEXTPROC glad_glMultiDrawElementsEXT;
PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC glad_glRenderbufferStorageMultisampleEXT;
PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEEXTPROC glad_glFramebufferTexture2DMultisampleEXT;
PFNGLGETGRAPHICSRESETSTATUSEXTPROC glad_glGetGraphicsResetStatusEXT;
PFNGLREADNPIXELSEXTPROC glad_glReadnPixelsEXT;
PFNGLGETNUNIFORMFVEXTPROC glad_glGetnUniformfvEXT;
PFNGLGETNUNIFORMIVEXTPROC glad_glGetnUniformivEXT;
PFNGLTEXSTORAGE1DEXTPROC glad_glTexStorage1DEXT;
PFNGLTEXSTORAGE2DEXTPROC glad_glTexStorage2DEXT;
PFNGLTEXSTORAGE3DEXTPROC glad_glTexStorage3DEXT;
PFNGLTEXTURESTORAGE1DEXTPROC glad_glTextureStorage1DEXT;
PFNGLTEXTURESTORAGE2DEXTPROC glad_glTextureStorage2DEXT;
PFNGLTEXTURESTORAGE3DEXTPROC glad_glTextureStorage3DEXT;
PFNGLRENDERBUFFERSTORAGEMULTISAMPLEIMGPROC glad_glRenderbufferStorageMultisampleIMG;
PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEIMGPROC glad_glFramebufferTexture2DMultisampleIMG;
PFNGLCLIPPLANEFIMGPROC glad_glClipPlanefIMG;
PFNGLCLIPPLANEXIMGPROC glad_glClipPlanexIMG;
PFNGLDELETEFENCESNVPROC glad_glDeleteFencesNV;
PFNGLGENFENCESNVPROC glad_glGenFencesNV;
PFNGLISFENCENVPROC glad_glIsFenceNV;
PFNGLTESTFENCENVPROC glad_glTestFenceNV;
PFNGLGETFENCEIVNVPROC glad_glGetFenceivNV;
PFNGLFINISHFENCENVPROC glad_glFinishFenceNV;
PFNGLSETFENCENVPROC glad_glSetFenceNV;
PFNGLEGLIMAGETARGETTEXTURE2DOESPROC glad_glEGLImageTargetTexture2DOES;
PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC glad_glEGLImageTargetRenderbufferStorageOES;
PFNGLBLENDEQUATIONSEPARATEOESPROC glad_glBlendEquationSeparateOES;
PFNGLBLENDFUNCSEPARATEOESPROC glad_glBlendFuncSeparateOES;
PFNGLBLENDEQUATIONOESPROC glad_glBlendEquationOES;
PFNGLMULTITEXCOORD1BOESPROC glad_glMultiTexCoord1bOES;
PFNGLMULTITEXCOORD1BVOESPROC glad_glMultiTexCoord1bvOES;
PFNGLMULTITEXCOORD2BOESPROC glad_glMultiTexCoord2bOES;
PFNGLMULTITEXCOORD2BVOESPROC glad_glMultiTexCoord2bvOES;
PFNGLMULTITEXCOORD3BOESPROC glad_glMultiTexCoord3bOES;
PFNGLMULTITEXCOORD3BVOESPROC glad_glMultiTexCoord3bvOES;
PFNGLMULTITEXCOORD4BOESPROC glad_glMultiTexCoord4bOES;
PFNGLMULTITEXCOORD4BVOESPROC glad_glMultiTexCoord4bvOES;
PFNGLTEXCOORD1BOESPROC glad_glTexCoord1bOES;
PFNGLTEXCOORD1BVOESPROC glad_glTexCoord1bvOES;
PFNGLTEXCOORD2BOESPROC glad_glTexCoord2bOES;
PFNGLTEXCOORD2BVOESPROC glad_glTexCoord2bvOES;
PFNGLTEXCOORD3BOESPROC glad_glTexCoord3bOES;
PFNGLTEXCOORD3BVOESPROC glad_glTexCoord3bvOES;
PFNGLTEXCOORD4BOESPROC glad_glTexCoord4bOES;
PFNGLTEXCOORD4BVOESPROC glad_glTexCoord4bvOES;
PFNGLVERTEX2BOESPROC glad_glVertex2bOES;
PFNGLVERTEX2BVOESPROC glad_glVertex2bvOES;
PFNGLVERTEX3BOESPROC glad_glVertex3bOES;
PFNGLVERTEX3BVOESPROC glad_glVertex3bvOES;
PFNGLVERTEX4BOESPROC glad_glVertex4bOES;
PFNGLVERTEX4BVOESPROC glad_glVertex4bvOES;
PFNGLDRAWTEXSOESPROC glad_glDrawTexsOES;
PFNGLDRAWTEXIOESPROC glad_glDrawTexiOES;
PFNGLDRAWTEXXOESPROC glad_glDrawTexxOES;
PFNGLDRAWTEXSVOESPROC glad_glDrawTexsvOES;
PFNGLDRAWTEXIVOESPROC glad_glDrawTexivOES;
PFNGLDRAWTEXXVOESPROC glad_glDrawTexxvOES;
PFNGLDRAWTEXFOESPROC glad_glDrawTexfOES;
PFNGLDRAWTEXFVOESPROC glad_glDrawTexfvOES;
PFNGLALPHAFUNCXOESPROC glad_glAlphaFuncxOES;
PFNGLCLEARCOLORXOESPROC glad_glClearColorxOES;
PFNGLCLEARDEPTHXOESPROC glad_glClearDepthxOES;
PFNGLCLIPPLANEXOESPROC glad_glClipPlanexOES;
PFNGLCOLOR4XOESPROC glad_glColor4xOES;
PFNGLDEPTHRANGEXOESPROC glad_glDepthRangexOES;
PFNGLFOGXOESPROC glad_glFogxOES;
PFNGLFOGXVOESPROC glad_glFogxvOES;
PFNGLFRUSTUMXOESPROC glad_glFrustumxOES;
PFNGLGETCLIPPLANEXOESPROC glad_glGetClipPlanexOES;
PFNGLGETFIXEDVOESPROC glad_glGetFixedvOES;
PFNGLGETTEXENVXVOESPROC glad_glGetTexEnvxvOES;
PFNGLGETTEXPARAMETERXVOESPROC glad_glGetTexParameterxvOES;
PFNGLLIGHTMODELXOESPROC glad_glLightModelxOES;
PFNGLLIGHTMODELXVOESPROC glad_glLightModelxvOES;
PFNGLLIGHTXOESPROC glad_glLightxOES;
PFNGLLIGHTXVOESPROC glad_glLightxvOES;
PFNGLLINEWIDTHXOESPROC glad_glLineWidthxOES;
PFNGLLOADMATRIXXOESPROC glad_glLoadMatrixxOES;
PFNGLMATERIALXOESPROC glad_glMaterialxOES;
PFNGLMATERIALXVOESPROC glad_glMaterialxvOES;
PFNGLMULTMATRIXXOESPROC glad_glMultMatrixxOES;
PFNGLMULTITEXCOORD4XOESPROC glad_glMultiTexCoord4xOES;
PFNGLNORMAL3XOESPROC glad_glNormal3xOES;
PFNGLORTHOXOESPROC glad_glOrthoxOES;
PFNGLPOINTPARAMETERXVOESPROC glad_glPointParameterxvOES;
PFNGLPOINTSIZEXOESPROC glad_glPointSizexOES;
PFNGLPOLYGONOFFSETXOESPROC glad_glPolygonOffsetxOES;
PFNGLROTATEXOESPROC glad_glRotatexOES;
PFNGLSCALEXOESPROC glad_glScalexOES;
PFNGLTEXENVXOESPROC glad_glTexEnvxOES;
PFNGLTEXENVXVOESPROC glad_glTexEnvxvOES;
PFNGLTEXPARAMETERXOESPROC glad_glTexParameterxOES;
PFNGLTEXPARAMETERXVOESPROC glad_glTexParameterxvOES;
PFNGLTRANSLATEXOESPROC glad_glTranslatexOES;
PFNGLGETLIGHTXVOESPROC glad_glGetLightxvOES;
PFNGLGETMATERIALXVOESPROC glad_glGetMaterialxvOES;
PFNGLPOINTPARAMETERXOESPROC glad_glPointParameterxOES;
PFNGLSAMPLECOVERAGEXOESPROC glad_glSampleCoveragexOES;
PFNGLACCUMXOESPROC glad_glAccumxOES;
PFNGLBITMAPXOESPROC glad_glBitmapxOES;
PFNGLBLENDCOLORXOESPROC glad_glBlendColorxOES;
PFNGLCLEARACCUMXOESPROC glad_glClearAccumxOES;
PFNGLCOLOR3XOESPROC glad_glColor3xOES;
PFNGLCOLOR3XVOESPROC glad_glColor3xvOES;
PFNGLCOLOR4XVOESPROC glad_glColor4xvOES;
PFNGLCONVOLUTIONPARAMETERXOESPROC glad_glConvolutionParameterxOES;
PFNGLCONVOLUTIONPARAMETERXVOESPROC glad_glConvolutionParameterxvOES;
PFNGLEVALCOORD1XOESPROC glad_glEvalCoord1xOES;
PFNGLEVALCOORD1XVOESPROC glad_glEvalCoord1xvOES;
PFNGLEVALCOORD2XOESPROC glad_glEvalCoord2xOES;
PFNGLEVALCOORD2XVOESPROC glad_glEvalCoord2xvOES;
PFNGLFEEDBACKBUFFERXOESPROC glad_glFeedbackBufferxOES;
PFNGLGETCONVOLUTIONPARAMETERXVOESPROC glad_glGetConvolutionParameterxvOES;
PFNGLGETHISTOGRAMPARAMETERXVOESPROC glad_glGetHistogramParameterxvOES;
PFNGLGETLIGHTXOESPROC glad_glGetLightxOES;
PFNGLGETMAPXVOESPROC glad_glGetMapxvOES;
PFNGLGETMATERIALXOESPROC glad_glGetMaterialxOES;
PFNGLGETPIXELMAPXVPROC glad_glGetPixelMapxv;
PFNGLGETTEXGENXVOESPROC glad_glGetTexGenxvOES;
PFNGLGETTEXLEVELPARAMETERXVOESPROC glad_glGetTexLevelParameterxvOES;
PFNGLINDEXXOESPROC glad_glIndexxOES;
PFNGLINDEXXVOESPROC glad_glIndexxvOES;
PFNGLLOADTRANSPOSEMATRIXXOESPROC glad_glLoadTransposeMatrixxOES;
PFNGLMAP1XOESPROC glad_glMap1xOES;
PFNGLMAP2XOESPROC glad_glMap2xOES;
PFNGLMAPGRID1XOESPROC glad_glMapGrid1xOES;
PFNGLMAPGRID2XOESPROC glad_glMapGrid2xOES;
PFNGLMULTTRANSPOSEMATRIXXOESPROC glad_glMultTransposeMatrixxOES;
PFNGLMULTITEXCOORD1XOESPROC glad_glMultiTexCoord1xOES;
PFNGLMULTITEXCOORD1XVOESPROC glad_glMultiTexCoord1xvOES;
PFNGLMULTITEXCOORD2XOESPROC glad_glMultiTexCoord2xOES;
PFNGLMULTITEXCOORD2XVOESPROC glad_glMultiTexCoord2xvOES;
PFNGLMULTITEXCOORD3XOESPROC glad_glMultiTexCoord3xOES;
PFNGLMULTITEXCOORD3XVOESPROC glad_glMultiTexCoord3xvOES;
PFNGLMULTITEXCOORD4XVOESPROC glad_glMultiTexCoord4xvOES;
PFNGLNORMAL3XVOESPROC glad_glNormal3xvOES;
PFNGLPASSTHROUGHXOESPROC glad_glPassThroughxOES;
PFNGLPIXELMAPXPROC glad_glPixelMapx;
PFNGLPIXELSTOREXPROC glad_glPixelStorex;
PFNGLPIXELTRANSFERXOESPROC glad_glPixelTransferxOES;
PFNGLPIXELZOOMXOESPROC glad_glPixelZoomxOES;
PFNGLPRIORITIZETEXTURESXOESPROC glad_glPrioritizeTexturesxOES;
PFNGLRASTERPOS2XOESPROC glad_glRasterPos2xOES;
PFNGLRASTERPOS2XVOESPROC glad_glRasterPos2xvOES;
PFNGLRASTERPOS3XOESPROC glad_glRasterPos3xOES;
PFNGLRASTERPOS3XVOESPROC glad_glRasterPos3xvOES;
PFNGLRASTERPOS4XOESPROC glad_glRasterPos4xOES;
PFNGLRASTERPOS4XVOESPROC glad_glRasterPos4xvOES;
PFNGLRECTXOESPROC glad_glRectxOES;
PFNGLRECTXVOESPROC glad_glRectxvOES;
PFNGLTEXCOORD1XOESPROC glad_glTexCoord1xOES;
PFNGLTEXCOORD1XVOESPROC glad_glTexCoord1xvOES;
PFNGLTEXCOORD2XOESPROC glad_glTexCoord2xOES;
PFNGLTEXCOORD2XVOESPROC glad_glTexCoord2xvOES;
PFNGLTEXCOORD3XOESPROC glad_glTexCoord3xOES;
PFNGLTEXCOORD3XVOESPROC glad_glTexCoord3xvOES;
PFNGLTEXCOORD4XOESPROC glad_glTexCoord4xOES;
PFNGLTEXCOORD4XVOESPROC glad_glTexCoord4xvOES;
PFNGLTEXGENXOESPROC glad_glTexGenxOES;
PFNGLTEXGENXVOESPROC glad_glTexGenxvOES;
PFNGLVERTEX2XOESPROC glad_glVertex2xOES;
PFNGLVERTEX2XVOESPROC glad_glVertex2xvOES;
PFNGLVERTEX3XOESPROC glad_glVertex3xOES;
PFNGLVERTEX3XVOESPROC glad_glVertex3xvOES;
PFNGLVERTEX4XOESPROC glad_glVertex4xOES;
PFNGLVERTEX4XVOESPROC glad_glVertex4xvOES;
PFNGLISRENDERBUFFEROESPROC glad_glIsRenderbufferOES;
PFNGLBINDRENDERBUFFEROESPROC glad_glBindRenderbufferOES;
PFNGLDELETERENDERBUFFERSOESPROC glad_glDeleteRenderbuffersOES;
PFNGLGENRENDERBUFFERSOESPROC glad_glGenRenderbuffersOES;
PFNGLRENDERBUFFERSTORAGEOESPROC glad_glRenderbufferStorageOES;
PFNGLGETRENDERBUFFERPARAMETERIVOESPROC glad_glGetRenderbufferParameterivOES;
PFNGLISFRAMEBUFFEROESPROC glad_glIsFramebufferOES;
PFNGLBINDFRAMEBUFFEROESPROC glad_glBindFramebufferOES;
PFNGLDELETEFRAMEBUFFERSOESPROC glad_glDeleteFramebuffersOES;
PFNGLGENFRAMEBUFFERSOESPROC glad_glGenFramebuffersOES;
PFNGLCHECKFRAMEBUFFERSTATUSOESPROC glad_glCheckFramebufferStatusOES;
PFNGLFRAMEBUFFERRENDERBUFFEROESPROC glad_glFramebufferRenderbufferOES;
PFNGLFRAMEBUFFERTEXTURE2DOESPROC glad_glFramebufferTexture2DOES;
PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVOESPROC glad_glGetFramebufferAttachmentParameterivOES;
PFNGLGENERATEMIPMAPOESPROC glad_glGenerateMipmapOES;
PFNGLMAPBUFFEROESPROC glad_glMapBufferOES;
PFNGLUNMAPBUFFEROESPROC glad_glUnmapBufferOES;
PFNGLGETBUFFERPOINTERVOESPROC glad_glGetBufferPointervOES;
PFNGLCURRENTPALETTEMATRIXOESPROC glad_glCurrentPaletteMatrixOES;
PFNGLLOADPALETTEFROMMODELVIEWMATRIXOESPROC glad_glLoadPaletteFromModelViewMatrixOES;
PFNGLMATRIXINDEXPOINTEROESPROC glad_glMatrixIndexPointerOES;
PFNGLWEIGHTPOINTEROESPROC glad_glWeightPointerOES;
PFNGLPOINTSIZEPOINTEROESPROC glad_glPointSizePointerOES;
PFNGLQUERYMATRIXXOESPROC glad_glQueryMatrixxOES;
PFNGLCLEARDEPTHFOESPROC glad_glClearDepthfOES;
PFNGLCLIPPLANEFOESPROC glad_glClipPlanefOES;
PFNGLDEPTHRANGEFOESPROC glad_glDepthRangefOES;
PFNGLFRUSTUMFOESPROC glad_glFrustumfOES;
PFNGLGETCLIPPLANEFOESPROC glad_glGetClipPlanefOES;
PFNGLORTHOFOESPROC glad_glOrthofOES;
PFNGLTEXGENFOESPROC glad_glTexGenfOES;
PFNGLTEXGENFVOESPROC glad_glTexGenfvOES;
PFNGLTEXGENIOESPROC glad_glTexGeniOES;
PFNGLTEXGENIVOESPROC glad_glTexGenivOES;
PFNGLGETTEXGENFVOESPROC glad_glGetTexGenfvOES;
PFNGLGETTEXGENIVOESPROC glad_glGetTexGenivOES;
PFNGLBINDVERTEXARRAYOESPROC glad_glBindVertexArrayOES;
PFNGLDELETEVERTEXARRAYSOESPROC glad_glDeleteVertexArraysOES;
PFNGLGENVERTEXARRAYSOESPROC glad_glGenVertexArraysOES;
PFNGLISVERTEXARRAYOESPROC glad_glIsVertexArrayOES;
PFNGLGETDRIVERCONTROLSQCOMPROC glad_glGetDriverControlsQCOM;
PFNGLGETDRIVERCONTROLSTRINGQCOMPROC glad_glGetDriverControlStringQCOM;
PFNGLENABLEDRIVERCONTROLQCOMPROC glad_glEnableDriverControlQCOM;
PFNGLDISABLEDRIVERCONTROLQCOMPROC glad_glDisableDriverControlQCOM;
PFNGLEXTGETTEXTURESQCOMPROC glad_glExtGetTexturesQCOM;
PFNGLEXTGETBUFFERSQCOMPROC glad_glExtGetBuffersQCOM;
PFNGLEXTGETRENDERBUFFERSQCOMPROC glad_glExtGetRenderbuffersQCOM;
PFNGLEXTGETFRAMEBUFFERSQCOMPROC glad_glExtGetFramebuffersQCOM;
PFNGLEXTGETTEXLEVELPARAMETERIVQCOMPROC glad_glExtGetTexLevelParameterivQCOM;
PFNGLEXTTEXOBJECTSTATEOVERRIDEIQCOMPROC glad_glExtTexObjectStateOverrideiQCOM;
PFNGLEXTGETTEXSUBIMAGEQCOMPROC glad_glExtGetTexSubImageQCOM;
PFNGLEXTGETBUFFERPOINTERVQCOMPROC glad_glExtGetBufferPointervQCOM;
PFNGLEXTGETSHADERSQCOMPROC glad_glExtGetShadersQCOM;
PFNGLEXTGETPROGRAMSQCOMPROC glad_glExtGetProgramsQCOM;
PFNGLEXTISPROGRAMBINARYQCOMPROC glad_glExtIsProgramBinaryQCOM;
PFNGLEXTGETPROGRAMBINARYSOURCEQCOMPROC glad_glExtGetProgramBinarySourceQCOM;
PFNGLSTARTTILINGQCOMPROC glad_glStartTilingQCOM;
PFNGLENDTILINGQCOMPROC glad_glEndTilingQCOM;
static void load_GL_VERSION_ES_CM_1_0(GLADloadproc load) {
	if(!GLAD_GL_VERSION_ES_CM_1_0) return;
	glad_glAlphaFunc = (PFNGLALPHAFUNCPROC)load("glAlphaFunc");
	glad_glClearColor = (PFNGLCLEARCOLORPROC)load("glClearColor");
	glad_glClearDepthf = (PFNGLCLEARDEPTHFPROC)load("glClearDepthf");
	glad_glClipPlanef = (PFNGLCLIPPLANEFPROC)load("glClipPlanef");
	glad_glColor4f = (PFNGLCOLOR4FPROC)load("glColor4f");
	glad_glDepthRangef = (PFNGLDEPTHRANGEFPROC)load("glDepthRangef");
	glad_glFogf = (PFNGLFOGFPROC)load("glFogf");
	glad_glFogfv = (PFNGLFOGFVPROC)load("glFogfv");
	glad_glFrustumf = (PFNGLFRUSTUMFPROC)load("glFrustumf");
	glad_glGetClipPlanef = (PFNGLGETCLIPPLANEFPROC)load("glGetClipPlanef");
	glad_glGetFloatv = (PFNGLGETFLOATVPROC)load("glGetFloatv");
	glad_glGetLightfv = (PFNGLGETLIGHTFVPROC)load("glGetLightfv");
	glad_glGetMaterialfv = (PFNGLGETMATERIALFVPROC)load("glGetMaterialfv");
	glad_glGetTexEnvfv = (PFNGLGETTEXENVFVPROC)load("glGetTexEnvfv");
	glad_glGetTexParameterfv = (PFNGLGETTEXPARAMETERFVPROC)load("glGetTexParameterfv");
	glad_glLightModelf = (PFNGLLIGHTMODELFPROC)load("glLightModelf");
	glad_glLightModelfv = (PFNGLLIGHTMODELFVPROC)load("glLightModelfv");
	glad_glLightf = (PFNGLLIGHTFPROC)load("glLightf");
	glad_glLightfv = (PFNGLLIGHTFVPROC)load("glLightfv");
	glad_glLineWidth = (PFNGLLINEWIDTHPROC)load("glLineWidth");
	glad_glLoadMatrixf = (PFNGLLOADMATRIXFPROC)load("glLoadMatrixf");
	glad_glMaterialf = (PFNGLMATERIALFPROC)load("glMaterialf");
	glad_glMaterialfv = (PFNGLMATERIALFVPROC)load("glMaterialfv");
	glad_glMultMatrixf = (PFNGLMULTMATRIXFPROC)load("glMultMatrixf");
	glad_glMultiTexCoord4f = (PFNGLMULTITEXCOORD4FPROC)load("glMultiTexCoord4f");
	glad_glNormal3f = (PFNGLNORMAL3FPROC)load("glNormal3f");
	glad_glOrthof = (PFNGLORTHOFPROC)load("glOrthof");
	glad_glPointParameterf = (PFNGLPOINTPARAMETERFPROC)load("glPointParameterf");
	glad_glPointParameterfv = (PFNGLPOINTPARAMETERFVPROC)load("glPointParameterfv");
	glad_glPointSize = (PFNGLPOINTSIZEPROC)load("glPointSize");
	glad_glPolygonOffset = (PFNGLPOLYGONOFFSETPROC)load("glPolygonOffset");
	glad_glRotatef = (PFNGLROTATEFPROC)load("glRotatef");
	glad_glScalef = (PFNGLSCALEFPROC)load("glScalef");
	glad_glTexEnvf = (PFNGLTEXENVFPROC)load("glTexEnvf");
	glad_glTexEnvfv = (PFNGLTEXENVFVPROC)load("glTexEnvfv");
	glad_glTexParameterf = (PFNGLTEXPARAMETERFPROC)load("glTexParameterf");
	glad_glTexParameterfv = (PFNGLTEXPARAMETERFVPROC)load("glTexParameterfv");
	glad_glTranslatef = (PFNGLTRANSLATEFPROC)load("glTranslatef");
	glad_glActiveTexture = (PFNGLACTIVETEXTUREPROC)load("glActiveTexture");
	glad_glAlphaFuncx = (PFNGLALPHAFUNCXPROC)load("glAlphaFuncx");
	glad_glBindBuffer = (PFNGLBINDBUFFERPROC)load("glBindBuffer");
	glad_glBindTexture = (PFNGLBINDTEXTUREPROC)load("glBindTexture");
	glad_glBlendFunc = (PFNGLBLENDFUNCPROC)load("glBlendFunc");
	glad_glBufferData = (PFNGLBUFFERDATAPROC)load("glBufferData");
	glad_glBufferSubData = (PFNGLBUFFERSUBDATAPROC)load("glBufferSubData");
	glad_glClear = (PFNGLCLEARPROC)load("glClear");
	glad_glClearColorx = (PFNGLCLEARCOLORXPROC)load("glClearColorx");
	glad_glClearDepthx = (PFNGLCLEARDEPTHXPROC)load("glClearDepthx");
	glad_glClearStencil = (PFNGLCLEARSTENCILPROC)load("glClearStencil");
	glad_glClientActiveTexture = (PFNGLCLIENTACTIVETEXTUREPROC)load("glClientActiveTexture");
	glad_glClipPlanex = (PFNGLCLIPPLANEXPROC)load("glClipPlanex");
	glad_glColor4ub = (PFNGLCOLOR4UBPROC)load("glColor4ub");
	glad_glColor4x = (PFNGLCOLOR4XPROC)load("glColor4x");
	glad_glColorMask = (PFNGLCOLORMASKPROC)load("glColorMask");
	glad_glColorPointer = (PFNGLCOLORPOINTERPROC)load("glColorPointer");
	glad_glCompressedTexImage2D = (PFNGLCOMPRESSEDTEXIMAGE2DPROC)load("glCompressedTexImage2D");
	glad_glCompressedTexSubImage2D = (PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC)load("glCompressedTexSubImage2D");
	glad_glCopyTexImage2D = (PFNGLCOPYTEXIMAGE2DPROC)load("glCopyTexImage2D");
	glad_glCopyTexSubImage2D = (PFNGLCOPYTEXSUBIMAGE2DPROC)load("glCopyTexSubImage2D");
	glad_glCullFace = (PFNGLCULLFACEPROC)load("glCullFace");
	glad_glDeleteBuffers = (PFNGLDELETEBUFFERSPROC)load("glDeleteBuffers");
	glad_glDeleteTextures = (PFNGLDELETETEXTURESPROC)load("glDeleteTextures");
	glad_glDepthFunc = (PFNGLDEPTHFUNCPROC)load("glDepthFunc");
	glad_glDepthMask = (PFNGLDEPTHMASKPROC)load("glDepthMask");
	glad_glDepthRangex = (PFNGLDEPTHRANGEXPROC)load("glDepthRangex");
	glad_glDisable = (PFNGLDISABLEPROC)load("glDisable");
	glad_glDisableClientState = (PFNGLDISABLECLIENTSTATEPROC)load("glDisableClientState");
	glad_glDrawArrays = (PFNGLDRAWARRAYSPROC)load("glDrawArrays");
	glad_glDrawElements = (PFNGLDRAWELEMENTSPROC)load("glDrawElements");
	glad_glEnable = (PFNGLENABLEPROC)load("glEnable");
	glad_glEnableClientState = (PFNGLENABLECLIENTSTATEPROC)load("glEnableClientState");
	glad_glFinish = (PFNGLFINISHPROC)load("glFinish");
	glad_glFlush = (PFNGLFLUSHPROC)load("glFlush");
	glad_glFogx = (PFNGLFOGXPROC)load("glFogx");
	glad_glFogxv = (PFNGLFOGXVPROC)load("glFogxv");
	glad_glFrontFace = (PFNGLFRONTFACEPROC)load("glFrontFace");
	glad_glFrustumx = (PFNGLFRUSTUMXPROC)load("glFrustumx");
	glad_glGetBooleanv = (PFNGLGETBOOLEANVPROC)load("glGetBooleanv");
	glad_glGetBufferParameteriv = (PFNGLGETBUFFERPARAMETERIVPROC)load("glGetBufferParameteriv");
	glad_glGetClipPlanex = (PFNGLGETCLIPPLANEXPROC)load("glGetClipPlanex");
	glad_glGenBuffers = (PFNGLGENBUFFERSPROC)load("glGenBuffers");
	glad_glGenTextures = (PFNGLGENTEXTURESPROC)load("glGenTextures");
	glad_glGetError = (PFNGLGETERRORPROC)load("glGetError");
	glad_glGetFixedv = (PFNGLGETFIXEDVPROC)load("glGetFixedv");
	glad_glGetIntegerv = (PFNGLGETINTEGERVPROC)load("glGetIntegerv");
	glad_glGetLightxv = (PFNGLGETLIGHTXVPROC)load("glGetLightxv");
	glad_glGetMaterialxv = (PFNGLGETMATERIALXVPROC)load("glGetMaterialxv");
	glad_glGetPointerv = (PFNGLGETPOINTERVPROC)load("glGetPointerv");
	glad_glGetString = (PFNGLGETSTRINGPROC)load("glGetString");
	glad_glGetTexEnviv = (PFNGLGETTEXENVIVPROC)load("glGetTexEnviv");
	glad_glGetTexEnvxv = (PFNGLGETTEXENVXVPROC)load("glGetTexEnvxv");
	glad_glGetTexParameteriv = (PFNGLGETTEXPARAMETERIVPROC)load("glGetTexParameteriv");
	glad_glGetTexParameterxv = (PFNGLGETTEXPARAMETERXVPROC)load("glGetTexParameterxv");
	glad_glHint = (PFNGLHINTPROC)load("glHint");
	glad_glIsBuffer = (PFNGLISBUFFERPROC)load("glIsBuffer");
	glad_glIsEnabled = (PFNGLISENABLEDPROC)load("glIsEnabled");
	glad_glIsTexture = (PFNGLISTEXTUREPROC)load("glIsTexture");
	glad_glLightModelx = (PFNGLLIGHTMODELXPROC)load("glLightModelx");
	glad_glLightModelxv = (PFNGLLIGHTMODELXVPROC)load("glLightModelxv");
	glad_glLightx = (PFNGLLIGHTXPROC)load("glLightx");
	glad_glLightxv = (PFNGLLIGHTXVPROC)load("glLightxv");
	glad_glLineWidthx = (PFNGLLINEWIDTHXPROC)load("glLineWidthx");
	glad_glLoadIdentity = (PFNGLLOADIDENTITYPROC)load("glLoadIdentity");
	glad_glLoadMatrixx = (PFNGLLOADMATRIXXPROC)load("glLoadMatrixx");
	glad_glLogicOp = (PFNGLLOGICOPPROC)load("glLogicOp");
	glad_glMaterialx = (PFNGLMATERIALXPROC)load("glMaterialx");
	glad_glMaterialxv = (PFNGLMATERIALXVPROC)load("glMaterialxv");
	glad_glMatrixMode = (PFNGLMATRIXMODEPROC)load("glMatrixMode");
	glad_glMultMatrixx = (PFNGLMULTMATRIXXPROC)load("glMultMatrixx");
	glad_glMultiTexCoord4x = (PFNGLMULTITEXCOORD4XPROC)load("glMultiTexCoord4x");
	glad_glNormal3x = (PFNGLNORMAL3XPROC)load("glNormal3x");
	glad_glNormalPointer = (PFNGLNORMALPOINTERPROC)load("glNormalPointer");
	glad_glOrthox = (PFNGLORTHOXPROC)load("glOrthox");
	glad_glPixelStorei = (PFNGLPIXELSTOREIPROC)load("glPixelStorei");
	glad_glPointParameterx = (PFNGLPOINTPARAMETERXPROC)load("glPointParameterx");
	glad_glPointParameterxv = (PFNGLPOINTPARAMETERXVPROC)load("glPointParameterxv");
	glad_glPointSizex = (PFNGLPOINTSIZEXPROC)load("glPointSizex");
	glad_glPolygonOffsetx = (PFNGLPOLYGONOFFSETXPROC)load("glPolygonOffsetx");
	glad_glPopMatrix = (PFNGLPOPMATRIXPROC)load("glPopMatrix");
	glad_glPushMatrix = (PFNGLPUSHMATRIXPROC)load("glPushMatrix");
	glad_glReadPixels = (PFNGLREADPIXELSPROC)load("glReadPixels");
	glad_glRotatex = (PFNGLROTATEXPROC)load("glRotatex");
	glad_glSampleCoverage = (PFNGLSAMPLECOVERAGEPROC)load("glSampleCoverage");
	glad_glSampleCoveragex = (PFNGLSAMPLECOVERAGEXPROC)load("glSampleCoveragex");
	glad_glScalex = (PFNGLSCALEXPROC)load("glScalex");
	glad_glScissor = (PFNGLSCISSORPROC)load("glScissor");
	glad_glShadeModel = (PFNGLSHADEMODELPROC)load("glShadeModel");
	glad_glStencilFunc = (PFNGLSTENCILFUNCPROC)load("glStencilFunc");
	glad_glStencilMask = (PFNGLSTENCILMASKPROC)load("glStencilMask");
	glad_glStencilOp = (PFNGLSTENCILOPPROC)load("glStencilOp");
	glad_glTexCoordPointer = (PFNGLTEXCOORDPOINTERPROC)load("glTexCoordPointer");
	glad_glTexEnvi = (PFNGLTEXENVIPROC)load("glTexEnvi");
	glad_glTexEnvx = (PFNGLTEXENVXPROC)load("glTexEnvx");
	glad_glTexEnviv = (PFNGLTEXENVIVPROC)load("glTexEnviv");
	glad_glTexEnvxv = (PFNGLTEXENVXVPROC)load("glTexEnvxv");
	glad_glTexImage2D = (PFNGLTEXIMAGE2DPROC)load("glTexImage2D");
	glad_glTexParameteri = (PFNGLTEXPARAMETERIPROC)load("glTexParameteri");
	glad_glTexParameterx = (PFNGLTEXPARAMETERXPROC)load("glTexParameterx");
	glad_glTexParameteriv = (PFNGLTEXPARAMETERIVPROC)load("glTexParameteriv");
	glad_glTexParameterxv = (PFNGLTEXPARAMETERXVPROC)load("glTexParameterxv");
	glad_glTexSubImage2D = (PFNGLTEXSUBIMAGE2DPROC)load("glTexSubImage2D");
	glad_glTranslatex = (PFNGLTRANSLATEXPROC)load("glTranslatex");
	glad_glVertexPointer = (PFNGLVERTEXPOINTERPROC)load("glVertexPointer");
	glad_glViewport = (PFNGLVIEWPORTPROC)load("glViewport");
}
static void load_GL_APPLE_copy_texture_levels(GLADloadproc load) {
	if(!GLAD_GL_APPLE_copy_texture_levels) return;
	glad_glCopyTextureLevelsAPPLE = (PFNGLCOPYTEXTURELEVELSAPPLEPROC)load("glCopyTextureLevelsAPPLE");
}
static void load_GL_APPLE_framebuffer_multisample(GLADloadproc load) {
	if(!GLAD_GL_APPLE_framebuffer_multisample) return;
	glad_glRenderbufferStorageMultisampleAPPLE = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEAPPLEPROC)load("glRenderbufferStorageMultisampleAPPLE");
	glad_glResolveMultisampleFramebufferAPPLE = (PFNGLRESOLVEMULTISAMPLEFRAMEBUFFERAPPLEPROC)load("glResolveMultisampleFramebufferAPPLE");
}
static void load_GL_APPLE_sync(GLADloadproc load) {
	if(!GLAD_GL_APPLE_sync) return;
	glad_glFenceSyncAPPLE = (PFNGLFENCESYNCAPPLEPROC)load("glFenceSyncAPPLE");
	glad_glIsSyncAPPLE = (PFNGLISSYNCAPPLEPROC)load("glIsSyncAPPLE");
	glad_glDeleteSyncAPPLE = (PFNGLDELETESYNCAPPLEPROC)load("glDeleteSyncAPPLE");
	glad_glClientWaitSyncAPPLE = (PFNGLCLIENTWAITSYNCAPPLEPROC)load("glClientWaitSyncAPPLE");
	glad_glWaitSyncAPPLE = (PFNGLWAITSYNCAPPLEPROC)load("glWaitSyncAPPLE");
	glad_glGetInteger64vAPPLE = (PFNGLGETINTEGER64VAPPLEPROC)load("glGetInteger64vAPPLE");
	glad_glGetSyncivAPPLE = (PFNGLGETSYNCIVAPPLEPROC)load("glGetSyncivAPPLE");
}
static void load_GL_EXT_blend_minmax(GLADloadproc load) {
	if(!GLAD_GL_EXT_blend_minmax) return;
	glad_glBlendEquationEXT = (PFNGLBLENDEQUATIONEXTPROC)load("glBlendEquationEXT");
}
static void load_GL_EXT_discard_framebuffer(GLADloadproc load) {
	if(!GLAD_GL_EXT_discard_framebuffer) return;
	glad_glDiscardFramebufferEXT = (PFNGLDISCARDFRAMEBUFFEREXTPROC)load("glDiscardFramebufferEXT");
}
static void load_GL_EXT_map_buffer_range(GLADloadproc load) {
	if(!GLAD_GL_EXT_map_buffer_range) return;
	glad_glMapBufferRangeEXT = (PFNGLMAPBUFFERRANGEEXTPROC)load("glMapBufferRangeEXT");
	glad_glFlushMappedBufferRangeEXT = (PFNGLFLUSHMAPPEDBUFFERRANGEEXTPROC)load("glFlushMappedBufferRangeEXT");
}
static void load_GL_EXT_multi_draw_arrays(GLADloadproc load) {
	if(!GLAD_GL_EXT_multi_draw_arrays) return;
	glad_glMultiDrawArraysEXT = (PFNGLMULTIDRAWARRAYSEXTPROC)load("glMultiDrawArraysEXT");
	glad_glMultiDrawElementsEXT = (PFNGLMULTIDRAWELEMENTSEXTPROC)load("glMultiDrawElementsEXT");
}
static void load_GL_EXT_multisampled_render_to_texture(GLADloadproc load) {
	if(!GLAD_GL_EXT_multisampled_render_to_texture) return;
	glad_glRenderbufferStorageMultisampleEXT = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC)load("glRenderbufferStorageMultisampleEXT");
	glad_glFramebufferTexture2DMultisampleEXT = (PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEEXTPROC)load("glFramebufferTexture2DMultisampleEXT");
}
static void load_GL_EXT_robustness(GLADloadproc load) {
	if(!GLAD_GL_EXT_robustness) return;
	glad_glGetGraphicsResetStatusEXT = (PFNGLGETGRAPHICSRESETSTATUSEXTPROC)load("glGetGraphicsResetStatusEXT");
	glad_glReadnPixelsEXT = (PFNGLREADNPIXELSEXTPROC)load("glReadnPixelsEXT");
	glad_glGetnUniformfvEXT = (PFNGLGETNUNIFORMFVEXTPROC)load("glGetnUniformfvEXT");
	glad_glGetnUniformivEXT = (PFNGLGETNUNIFORMIVEXTPROC)load("glGetnUniformivEXT");
}
static void load_GL_EXT_texture_storage(GLADloadproc load) {
	if(!GLAD_GL_EXT_texture_storage) return;
	glad_glTexStorage1DEXT = (PFNGLTEXSTORAGE1DEXTPROC)load("glTexStorage1DEXT");
	glad_glTexStorage2DEXT = (PFNGLTEXSTORAGE2DEXTPROC)load("glTexStorage2DEXT");
	glad_glTexStorage3DEXT = (PFNGLTEXSTORAGE3DEXTPROC)load("glTexStorage3DEXT");
	glad_glTextureStorage1DEXT = (PFNGLTEXTURESTORAGE1DEXTPROC)load("glTextureStorage1DEXT");
	glad_glTextureStorage2DEXT = (PFNGLTEXTURESTORAGE2DEXTPROC)load("glTextureStorage2DEXT");
	glad_glTextureStorage3DEXT = (PFNGLTEXTURESTORAGE3DEXTPROC)load("glTextureStorage3DEXT");
}
static void load_GL_IMG_multisampled_render_to_texture(GLADloadproc load) {
	if(!GLAD_GL_IMG_multisampled_render_to_texture) return;
	glad_glRenderbufferStorageMultisampleIMG = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEIMGPROC)load("glRenderbufferStorageMultisampleIMG");
	glad_glFramebufferTexture2DMultisampleIMG = (PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEIMGPROC)load("glFramebufferTexture2DMultisampleIMG");
}
static void load_GL_IMG_user_clip_plane(GLADloadproc load) {
	if(!GLAD_GL_IMG_user_clip_plane) return;
	glad_glClipPlanefIMG = (PFNGLCLIPPLANEFIMGPROC)load("glClipPlanefIMG");
	glad_glClipPlanexIMG = (PFNGLCLIPPLANEXIMGPROC)load("glClipPlanexIMG");
}
static void load_GL_NV_fence(GLADloadproc load) {
	if(!GLAD_GL_NV_fence) return;
	glad_glDeleteFencesNV = (PFNGLDELETEFENCESNVPROC)load("glDeleteFencesNV");
	glad_glGenFencesNV = (PFNGLGENFENCESNVPROC)load("glGenFencesNV");
	glad_glIsFenceNV = (PFNGLISFENCENVPROC)load("glIsFenceNV");
	glad_glTestFenceNV = (PFNGLTESTFENCENVPROC)load("glTestFenceNV");
	glad_glGetFenceivNV = (PFNGLGETFENCEIVNVPROC)load("glGetFenceivNV");
	glad_glFinishFenceNV = (PFNGLFINISHFENCENVPROC)load("glFinishFenceNV");
	glad_glSetFenceNV = (PFNGLSETFENCENVPROC)load("glSetFenceNV");
}
static void load_GL_OES_EGL_image(GLADloadproc load) {
	if(!GLAD_GL_OES_EGL_image) return;
	glad_glEGLImageTargetTexture2DOES = (PFNGLEGLIMAGETARGETTEXTURE2DOESPROC)load("glEGLImageTargetTexture2DOES");
	glad_glEGLImageTargetRenderbufferStorageOES = (PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC)load("glEGLImageTargetRenderbufferStorageOES");
}
static void load_GL_OES_blend_equation_separate(GLADloadproc load) {
	if(!GLAD_GL_OES_blend_equation_separate) return;
	glad_glBlendEquationSeparateOES = (PFNGLBLENDEQUATIONSEPARATEOESPROC)load("glBlendEquationSeparateOES");
}
static void load_GL_OES_blend_func_separate(GLADloadproc load) {
	if(!GLAD_GL_OES_blend_func_separate) return;
	glad_glBlendFuncSeparateOES = (PFNGLBLENDFUNCSEPARATEOESPROC)load("glBlendFuncSeparateOES");
}
static void load_GL_OES_blend_subtract(GLADloadproc load) {
	if(!GLAD_GL_OES_blend_subtract) return;
	glad_glBlendEquationOES = (PFNGLBLENDEQUATIONOESPROC)load("glBlendEquationOES");
}
static void load_GL_OES_byte_coordinates(GLADloadproc load) {
	if(!GLAD_GL_OES_byte_coordinates) return;
	glad_glMultiTexCoord1bOES = (PFNGLMULTITEXCOORD1BOESPROC)load("glMultiTexCoord1bOES");
	glad_glMultiTexCoord1bvOES = (PFNGLMULTITEXCOORD1BVOESPROC)load("glMultiTexCoord1bvOES");
	glad_glMultiTexCoord2bOES = (PFNGLMULTITEXCOORD2BOESPROC)load("glMultiTexCoord2bOES");
	glad_glMultiTexCoord2bvOES = (PFNGLMULTITEXCOORD2BVOESPROC)load("glMultiTexCoord2bvOES");
	glad_glMultiTexCoord3bOES = (PFNGLMULTITEXCOORD3BOESPROC)load("glMultiTexCoord3bOES");
	glad_glMultiTexCoord3bvOES = (PFNGLMULTITEXCOORD3BVOESPROC)load("glMultiTexCoord3bvOES");
	glad_glMultiTexCoord4bOES = (PFNGLMULTITEXCOORD4BOESPROC)load("glMultiTexCoord4bOES");
	glad_glMultiTexCoord4bvOES = (PFNGLMULTITEXCOORD4BVOESPROC)load("glMultiTexCoord4bvOES");
	glad_glTexCoord1bOES = (PFNGLTEXCOORD1BOESPROC)load("glTexCoord1bOES");
	glad_glTexCoord1bvOES = (PFNGLTEXCOORD1BVOESPROC)load("glTexCoord1bvOES");
	glad_glTexCoord2bOES = (PFNGLTEXCOORD2BOESPROC)load("glTexCoord2bOES");
	glad_glTexCoord2bvOES = (PFNGLTEXCOORD2BVOESPROC)load("glTexCoord2bvOES");
	glad_glTexCoord3bOES = (PFNGLTEXCOORD3BOESPROC)load("glTexCoord3bOES");
	glad_glTexCoord3bvOES = (PFNGLTEXCOORD3BVOESPROC)load("glTexCoord3bvOES");
	glad_glTexCoord4bOES = (PFNGLTEXCOORD4BOESPROC)load("glTexCoord4bOES");
	glad_glTexCoord4bvOES = (PFNGLTEXCOORD4BVOESPROC)load("glTexCoord4bvOES");
	glad_glVertex2bOES = (PFNGLVERTEX2BOESPROC)load("glVertex2bOES");
	glad_glVertex2bvOES = (PFNGLVERTEX2BVOESPROC)load("glVertex2bvOES");
	glad_glVertex3bOES = (PFNGLVERTEX3BOESPROC)load("glVertex3bOES");
	glad_glVertex3bvOES = (PFNGLVERTEX3BVOESPROC)load("glVertex3bvOES");
	glad_glVertex4bOES = (PFNGLVERTEX4BOESPROC)load("glVertex4bOES");
	glad_glVertex4bvOES = (PFNGLVERTEX4BVOESPROC)load("glVertex4bvOES");
}
static void load_GL_OES_draw_texture(GLADloadproc load) {
	if(!GLAD_GL_OES_draw_texture) return;
	glad_glDrawTexsOES = (PFNGLDRAWTEXSOESPROC)load("glDrawTexsOES");
	glad_glDrawTexiOES = (PFNGLDRAWTEXIOESPROC)load("glDrawTexiOES");
	glad_glDrawTexxOES = (PFNGLDRAWTEXXOESPROC)load("glDrawTexxOES");
	glad_glDrawTexsvOES = (PFNGLDRAWTEXSVOESPROC)load("glDrawTexsvOES");
	glad_glDrawTexivOES = (PFNGLDRAWTEXIVOESPROC)load("glDrawTexivOES");
	glad_glDrawTexxvOES = (PFNGLDRAWTEXXVOESPROC)load("glDrawTexxvOES");
	glad_glDrawTexfOES = (PFNGLDRAWTEXFOESPROC)load("glDrawTexfOES");
	glad_glDrawTexfvOES = (PFNGLDRAWTEXFVOESPROC)load("glDrawTexfvOES");
}
static void load_GL_OES_fixed_point(GLADloadproc load) {
	if(!GLAD_GL_OES_fixed_point) return;
	glad_glAlphaFuncxOES = (PFNGLALPHAFUNCXOESPROC)load("glAlphaFuncxOES");
	glad_glClearColorxOES = (PFNGLCLEARCOLORXOESPROC)load("glClearColorxOES");
	glad_glClearDepthxOES = (PFNGLCLEARDEPTHXOESPROC)load("glClearDepthxOES");
	glad_glClipPlanexOES = (PFNGLCLIPPLANEXOESPROC)load("glClipPlanexOES");
	glad_glColor4xOES = (PFNGLCOLOR4XOESPROC)load("glColor4xOES");
	glad_glDepthRangexOES = (PFNGLDEPTHRANGEXOESPROC)load("glDepthRangexOES");
	glad_glFogxOES = (PFNGLFOGXOESPROC)load("glFogxOES");
	glad_glFogxvOES = (PFNGLFOGXVOESPROC)load("glFogxvOES");
	glad_glFrustumxOES = (PFNGLFRUSTUMXOESPROC)load("glFrustumxOES");
	glad_glGetClipPlanexOES = (PFNGLGETCLIPPLANEXOESPROC)load("glGetClipPlanexOES");
	glad_glGetFixedvOES = (PFNGLGETFIXEDVOESPROC)load("glGetFixedvOES");
	glad_glGetTexEnvxvOES = (PFNGLGETTEXENVXVOESPROC)load("glGetTexEnvxvOES");
	glad_glGetTexParameterxvOES = (PFNGLGETTEXPARAMETERXVOESPROC)load("glGetTexParameterxvOES");
	glad_glLightModelxOES = (PFNGLLIGHTMODELXOESPROC)load("glLightModelxOES");
	glad_glLightModelxvOES = (PFNGLLIGHTMODELXVOESPROC)load("glLightModelxvOES");
	glad_glLightxOES = (PFNGLLIGHTXOESPROC)load("glLightxOES");
	glad_glLightxvOES = (PFNGLLIGHTXVOESPROC)load("glLightxvOES");
	glad_glLineWidthxOES = (PFNGLLINEWIDTHXOESPROC)load("glLineWidthxOES");
	glad_glLoadMatrixxOES = (PFNGLLOADMATRIXXOESPROC)load("glLoadMatrixxOES");
	glad_glMaterialxOES = (PFNGLMATERIALXOESPROC)load("glMaterialxOES");
	glad_glMaterialxvOES = (PFNGLMATERIALXVOESPROC)load("glMaterialxvOES");
	glad_glMultMatrixxOES = (PFNGLMULTMATRIXXOESPROC)load("glMultMatrixxOES");
	glad_glMultiTexCoord4xOES = (PFNGLMULTITEXCOORD4XOESPROC)load("glMultiTexCoord4xOES");
	glad_glNormal3xOES = (PFNGLNORMAL3XOESPROC)load("glNormal3xOES");
	glad_glOrthoxOES = (PFNGLORTHOXOESPROC)load("glOrthoxOES");
	glad_glPointParameterxvOES = (PFNGLPOINTPARAMETERXVOESPROC)load("glPointParameterxvOES");
	glad_glPointSizexOES = (PFNGLPOINTSIZEXOESPROC)load("glPointSizexOES");
	glad_glPolygonOffsetxOES = (PFNGLPOLYGONOFFSETXOESPROC)load("glPolygonOffsetxOES");
	glad_glRotatexOES = (PFNGLROTATEXOESPROC)load("glRotatexOES");
	glad_glScalexOES = (PFNGLSCALEXOESPROC)load("glScalexOES");
	glad_glTexEnvxOES = (PFNGLTEXENVXOESPROC)load("glTexEnvxOES");
	glad_glTexEnvxvOES = (PFNGLTEXENVXVOESPROC)load("glTexEnvxvOES");
	glad_glTexParameterxOES = (PFNGLTEXPARAMETERXOESPROC)load("glTexParameterxOES");
	glad_glTexParameterxvOES = (PFNGLTEXPARAMETERXVOESPROC)load("glTexParameterxvOES");
	glad_glTranslatexOES = (PFNGLTRANSLATEXOESPROC)load("glTranslatexOES");
	glad_glGetLightxvOES = (PFNGLGETLIGHTXVOESPROC)load("glGetLightxvOES");
	glad_glGetMaterialxvOES = (PFNGLGETMATERIALXVOESPROC)load("glGetMaterialxvOES");
	glad_glPointParameterxOES = (PFNGLPOINTPARAMETERXOESPROC)load("glPointParameterxOES");
	glad_glSampleCoveragexOES = (PFNGLSAMPLECOVERAGEXOESPROC)load("glSampleCoveragexOES");
	glad_glAccumxOES = (PFNGLACCUMXOESPROC)load("glAccumxOES");
	glad_glBitmapxOES = (PFNGLBITMAPXOESPROC)load("glBitmapxOES");
	glad_glBlendColorxOES = (PFNGLBLENDCOLORXOESPROC)load("glBlendColorxOES");
	glad_glClearAccumxOES = (PFNGLCLEARACCUMXOESPROC)load("glClearAccumxOES");
	glad_glColor3xOES = (PFNGLCOLOR3XOESPROC)load("glColor3xOES");
	glad_glColor3xvOES = (PFNGLCOLOR3XVOESPROC)load("glColor3xvOES");
	glad_glColor4xvOES = (PFNGLCOLOR4XVOESPROC)load("glColor4xvOES");
	glad_glConvolutionParameterxOES = (PFNGLCONVOLUTIONPARAMETERXOESPROC)load("glConvolutionParameterxOES");
	glad_glConvolutionParameterxvOES = (PFNGLCONVOLUTIONPARAMETERXVOESPROC)load("glConvolutionParameterxvOES");
	glad_glEvalCoord1xOES = (PFNGLEVALCOORD1XOESPROC)load("glEvalCoord1xOES");
	glad_glEvalCoord1xvOES = (PFNGLEVALCOORD1XVOESPROC)load("glEvalCoord1xvOES");
	glad_glEvalCoord2xOES = (PFNGLEVALCOORD2XOESPROC)load("glEvalCoord2xOES");
	glad_glEvalCoord2xvOES = (PFNGLEVALCOORD2XVOESPROC)load("glEvalCoord2xvOES");
	glad_glFeedbackBufferxOES = (PFNGLFEEDBACKBUFFERXOESPROC)load("glFeedbackBufferxOES");
	glad_glGetConvolutionParameterxvOES = (PFNGLGETCONVOLUTIONPARAMETERXVOESPROC)load("glGetConvolutionParameterxvOES");
	glad_glGetHistogramParameterxvOES = (PFNGLGETHISTOGRAMPARAMETERXVOESPROC)load("glGetHistogramParameterxvOES");
	glad_glGetLightxOES = (PFNGLGETLIGHTXOESPROC)load("glGetLightxOES");
	glad_glGetMapxvOES = (PFNGLGETMAPXVOESPROC)load("glGetMapxvOES");
	glad_glGetMaterialxOES = (PFNGLGETMATERIALXOESPROC)load("glGetMaterialxOES");
	glad_glGetPixelMapxv = (PFNGLGETPIXELMAPXVPROC)load("glGetPixelMapxv");
	glad_glGetTexGenxvOES = (PFNGLGETTEXGENXVOESPROC)load("glGetTexGenxvOES");
	glad_glGetTexLevelParameterxvOES = (PFNGLGETTEXLEVELPARAMETERXVOESPROC)load("glGetTexLevelParameterxvOES");
	glad_glIndexxOES = (PFNGLINDEXXOESPROC)load("glIndexxOES");
	glad_glIndexxvOES = (PFNGLINDEXXVOESPROC)load("glIndexxvOES");
	glad_glLoadTransposeMatrixxOES = (PFNGLLOADTRANSPOSEMATRIXXOESPROC)load("glLoadTransposeMatrixxOES");
	glad_glMap1xOES = (PFNGLMAP1XOESPROC)load("glMap1xOES");
	glad_glMap2xOES = (PFNGLMAP2XOESPROC)load("glMap2xOES");
	glad_glMapGrid1xOES = (PFNGLMAPGRID1XOESPROC)load("glMapGrid1xOES");
	glad_glMapGrid2xOES = (PFNGLMAPGRID2XOESPROC)load("glMapGrid2xOES");
	glad_glMultTransposeMatrixxOES = (PFNGLMULTTRANSPOSEMATRIXXOESPROC)load("glMultTransposeMatrixxOES");
	glad_glMultiTexCoord1xOES = (PFNGLMULTITEXCOORD1XOESPROC)load("glMultiTexCoord1xOES");
	glad_glMultiTexCoord1xvOES = (PFNGLMULTITEXCOORD1XVOESPROC)load("glMultiTexCoord1xvOES");
	glad_glMultiTexCoord2xOES = (PFNGLMULTITEXCOORD2XOESPROC)load("glMultiTexCoord2xOES");
	glad_glMultiTexCoord2xvOES = (PFNGLMULTITEXCOORD2XVOESPROC)load("glMultiTexCoord2xvOES");
	glad_glMultiTexCoord3xOES = (PFNGLMULTITEXCOORD3XOESPROC)load("glMultiTexCoord3xOES");
	glad_glMultiTexCoord3xvOES = (PFNGLMULTITEXCOORD3XVOESPROC)load("glMultiTexCoord3xvOES");
	glad_glMultiTexCoord4xvOES = (PFNGLMULTITEXCOORD4XVOESPROC)load("glMultiTexCoord4xvOES");
	glad_glNormal3xvOES = (PFNGLNORMAL3XVOESPROC)load("glNormal3xvOES");
	glad_glPassThroughxOES = (PFNGLPASSTHROUGHXOESPROC)load("glPassThroughxOES");
	glad_glPixelMapx = (PFNGLPIXELMAPXPROC)load("glPixelMapx");
	glad_glPixelStorex = (PFNGLPIXELSTOREXPROC)load("glPixelStorex");
	glad_glPixelTransferxOES = (PFNGLPIXELTRANSFERXOESPROC)load("glPixelTransferxOES");
	glad_glPixelZoomxOES = (PFNGLPIXELZOOMXOESPROC)load("glPixelZoomxOES");
	glad_glPrioritizeTexturesxOES = (PFNGLPRIORITIZETEXTURESXOESPROC)load("glPrioritizeTexturesxOES");
	glad_glRasterPos2xOES = (PFNGLRASTERPOS2XOESPROC)load("glRasterPos2xOES");
	glad_glRasterPos2xvOES = (PFNGLRASTERPOS2XVOESPROC)load("glRasterPos2xvOES");
	glad_glRasterPos3xOES = (PFNGLRASTERPOS3XOESPROC)load("glRasterPos3xOES");
	glad_glRasterPos3xvOES = (PFNGLRASTERPOS3XVOESPROC)load("glRasterPos3xvOES");
	glad_glRasterPos4xOES = (PFNGLRASTERPOS4XOESPROC)load("glRasterPos4xOES");
	glad_glRasterPos4xvOES = (PFNGLRASTERPOS4XVOESPROC)load("glRasterPos4xvOES");
	glad_glRectxOES = (PFNGLRECTXOESPROC)load("glRectxOES");
	glad_glRectxvOES = (PFNGLRECTXVOESPROC)load("glRectxvOES");
	glad_glTexCoord1xOES = (PFNGLTEXCOORD1XOESPROC)load("glTexCoord1xOES");
	glad_glTexCoord1xvOES = (PFNGLTEXCOORD1XVOESPROC)load("glTexCoord1xvOES");
	glad_glTexCoord2xOES = (PFNGLTEXCOORD2XOESPROC)load("glTexCoord2xOES");
	glad_glTexCoord2xvOES = (PFNGLTEXCOORD2XVOESPROC)load("glTexCoord2xvOES");
	glad_glTexCoord3xOES = (PFNGLTEXCOORD3XOESPROC)load("glTexCoord3xOES");
	glad_glTexCoord3xvOES = (PFNGLTEXCOORD3XVOESPROC)load("glTexCoord3xvOES");
	glad_glTexCoord4xOES = (PFNGLTEXCOORD4XOESPROC)load("glTexCoord4xOES");
	glad_glTexCoord4xvOES = (PFNGLTEXCOORD4XVOESPROC)load("glTexCoord4xvOES");
	glad_glTexGenxOES = (PFNGLTEXGENXOESPROC)load("glTexGenxOES");
	glad_glTexGenxvOES = (PFNGLTEXGENXVOESPROC)load("glTexGenxvOES");
	glad_glVertex2xOES = (PFNGLVERTEX2XOESPROC)load("glVertex2xOES");
	glad_glVertex2xvOES = (PFNGLVERTEX2XVOESPROC)load("glVertex2xvOES");
	glad_glVertex3xOES = (PFNGLVERTEX3XOESPROC)load("glVertex3xOES");
	glad_glVertex3xvOES = (PFNGLVERTEX3XVOESPROC)load("glVertex3xvOES");
	glad_glVertex4xOES = (PFNGLVERTEX4XOESPROC)load("glVertex4xOES");
	glad_glVertex4xvOES = (PFNGLVERTEX4XVOESPROC)load("glVertex4xvOES");
}
static void load_GL_OES_framebuffer_object(GLADloadproc load) {
	if(!GLAD_GL_OES_framebuffer_object) return;
	glad_glIsRenderbufferOES = (PFNGLISRENDERBUFFEROESPROC)load("glIsRenderbufferOES");
	glad_glBindRenderbufferOES = (PFNGLBINDRENDERBUFFEROESPROC)load("glBindRenderbufferOES");
	glad_glDeleteRenderbuffersOES = (PFNGLDELETERENDERBUFFERSOESPROC)load("glDeleteRenderbuffersOES");
	glad_glGenRenderbuffersOES = (PFNGLGENRENDERBUFFERSOESPROC)load("glGenRenderbuffersOES");
	glad_glRenderbufferStorageOES = (PFNGLRENDERBUFFERSTORAGEOESPROC)load("glRenderbufferStorageOES");
	glad_glGetRenderbufferParameterivOES = (PFNGLGETRENDERBUFFERPARAMETERIVOESPROC)load("glGetRenderbufferParameterivOES");
	glad_glIsFramebufferOES = (PFNGLISFRAMEBUFFEROESPROC)load("glIsFramebufferOES");
	glad_glBindFramebufferOES = (PFNGLBINDFRAMEBUFFEROESPROC)load("glBindFramebufferOES");
	glad_glDeleteFramebuffersOES = (PFNGLDELETEFRAMEBUFFERSOESPROC)load("glDeleteFramebuffersOES");
	glad_glGenFramebuffersOES = (PFNGLGENFRAMEBUFFERSOESPROC)load("glGenFramebuffersOES");
	glad_glCheckFramebufferStatusOES = (PFNGLCHECKFRAMEBUFFERSTATUSOESPROC)load("glCheckFramebufferStatusOES");
	glad_glFramebufferRenderbufferOES = (PFNGLFRAMEBUFFERRENDERBUFFEROESPROC)load("glFramebufferRenderbufferOES");
	glad_glFramebufferTexture2DOES = (PFNGLFRAMEBUFFERTEXTURE2DOESPROC)load("glFramebufferTexture2DOES");
	glad_glGetFramebufferAttachmentParameterivOES = (PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVOESPROC)load("glGetFramebufferAttachmentParameterivOES");
	glad_glGenerateMipmapOES = (PFNGLGENERATEMIPMAPOESPROC)load("glGenerateMipmapOES");
}
static void load_GL_OES_mapbuffer(GLADloadproc load) {
	if(!GLAD_GL_OES_mapbuffer) return;
	glad_glMapBufferOES = (PFNGLMAPBUFFEROESPROC)load("glMapBufferOES");
	glad_glUnmapBufferOES = (PFNGLUNMAPBUFFEROESPROC)load("glUnmapBufferOES");
	glad_glGetBufferPointervOES = (PFNGLGETBUFFERPOINTERVOESPROC)load("glGetBufferPointervOES");
}
static void load_GL_OES_matrix_palette(GLADloadproc load) {
	if(!GLAD_GL_OES_matrix_palette) return;
	glad_glCurrentPaletteMatrixOES = (PFNGLCURRENTPALETTEMATRIXOESPROC)load("glCurrentPaletteMatrixOES");
	glad_glLoadPaletteFromModelViewMatrixOES = (PFNGLLOADPALETTEFROMMODELVIEWMATRIXOESPROC)load("glLoadPaletteFromModelViewMatrixOES");
	glad_glMatrixIndexPointerOES = (PFNGLMATRIXINDEXPOINTEROESPROC)load("glMatrixIndexPointerOES");
	glad_glWeightPointerOES = (PFNGLWEIGHTPOINTEROESPROC)load("glWeightPointerOES");
}
static void load_GL_OES_point_size_array(GLADloadproc load) {
	if(!GLAD_GL_OES_point_size_array) return;
	glad_glPointSizePointerOES = (PFNGLPOINTSIZEPOINTEROESPROC)load("glPointSizePointerOES");
}
static void load_GL_OES_query_matrix(GLADloadproc load) {
	if(!GLAD_GL_OES_query_matrix) return;
	glad_glQueryMatrixxOES = (PFNGLQUERYMATRIXXOESPROC)load("glQueryMatrixxOES");
}
static void load_GL_OES_single_precision(GLADloadproc load) {
	if(!GLAD_GL_OES_single_precision) return;
	glad_glClearDepthfOES = (PFNGLCLEARDEPTHFOESPROC)load("glClearDepthfOES");
	glad_glClipPlanefOES = (PFNGLCLIPPLANEFOESPROC)load("glClipPlanefOES");
	glad_glDepthRangefOES = (PFNGLDEPTHRANGEFOESPROC)load("glDepthRangefOES");
	glad_glFrustumfOES = (PFNGLFRUSTUMFOESPROC)load("glFrustumfOES");
	glad_glGetClipPlanefOES = (PFNGLGETCLIPPLANEFOESPROC)load("glGetClipPlanefOES");
	glad_glOrthofOES = (PFNGLORTHOFOESPROC)load("glOrthofOES");
}
static void load_GL_OES_texture_cube_map(GLADloadproc load) {
	if(!GLAD_GL_OES_texture_cube_map) return;
	glad_glTexGenfOES = (PFNGLTEXGENFOESPROC)load("glTexGenfOES");
	glad_glTexGenfvOES = (PFNGLTEXGENFVOESPROC)load("glTexGenfvOES");
	glad_glTexGeniOES = (PFNGLTEXGENIOESPROC)load("glTexGeniOES");
	glad_glTexGenivOES = (PFNGLTEXGENIVOESPROC)load("glTexGenivOES");
	glad_glTexGenxOES = (PFNGLTEXGENXOESPROC)load("glTexGenxOES");
	glad_glTexGenxvOES = (PFNGLTEXGENXVOESPROC)load("glTexGenxvOES");
	glad_glGetTexGenfvOES = (PFNGLGETTEXGENFVOESPROC)load("glGetTexGenfvOES");
	glad_glGetTexGenivOES = (PFNGLGETTEXGENIVOESPROC)load("glGetTexGenivOES");
	glad_glGetTexGenxvOES = (PFNGLGETTEXGENXVOESPROC)load("glGetTexGenxvOES");
}
static void load_GL_OES_vertex_array_object(GLADloadproc load) {
	if(!GLAD_GL_OES_vertex_array_object) return;
	glad_glBindVertexArrayOES = (PFNGLBINDVERTEXARRAYOESPROC)load("glBindVertexArrayOES");
	glad_glDeleteVertexArraysOES = (PFNGLDELETEVERTEXARRAYSOESPROC)load("glDeleteVertexArraysOES");
	glad_glGenVertexArraysOES = (PFNGLGENVERTEXARRAYSOESPROC)load("glGenVertexArraysOES");
	glad_glIsVertexArrayOES = (PFNGLISVERTEXARRAYOESPROC)load("glIsVertexArrayOES");
}
static void load_GL_QCOM_driver_control(GLADloadproc load) {
	if(!GLAD_GL_QCOM_driver_control) return;
	glad_glGetDriverControlsQCOM = (PFNGLGETDRIVERCONTROLSQCOMPROC)load("glGetDriverControlsQCOM");
	glad_glGetDriverControlStringQCOM = (PFNGLGETDRIVERCONTROLSTRINGQCOMPROC)load("glGetDriverControlStringQCOM");
	glad_glEnableDriverControlQCOM = (PFNGLENABLEDRIVERCONTROLQCOMPROC)load("glEnableDriverControlQCOM");
	glad_glDisableDriverControlQCOM = (PFNGLDISABLEDRIVERCONTROLQCOMPROC)load("glDisableDriverControlQCOM");
}
static void load_GL_QCOM_extended_get(GLADloadproc load) {
	if(!GLAD_GL_QCOM_extended_get) return;
	glad_glExtGetTexturesQCOM = (PFNGLEXTGETTEXTURESQCOMPROC)load("glExtGetTexturesQCOM");
	glad_glExtGetBuffersQCOM = (PFNGLEXTGETBUFFERSQCOMPROC)load("glExtGetBuffersQCOM");
	glad_glExtGetRenderbuffersQCOM = (PFNGLEXTGETRENDERBUFFERSQCOMPROC)load("glExtGetRenderbuffersQCOM");
	glad_glExtGetFramebuffersQCOM = (PFNGLEXTGETFRAMEBUFFERSQCOMPROC)load("glExtGetFramebuffersQCOM");
	glad_glExtGetTexLevelParameterivQCOM = (PFNGLEXTGETTEXLEVELPARAMETERIVQCOMPROC)load("glExtGetTexLevelParameterivQCOM");
	glad_glExtTexObjectStateOverrideiQCOM = (PFNGLEXTTEXOBJECTSTATEOVERRIDEIQCOMPROC)load("glExtTexObjectStateOverrideiQCOM");
	glad_glExtGetTexSubImageQCOM = (PFNGLEXTGETTEXSUBIMAGEQCOMPROC)load("glExtGetTexSubImageQCOM");
	glad_glExtGetBufferPointervQCOM = (PFNGLEXTGETBUFFERPOINTERVQCOMPROC)load("glExtGetBufferPointervQCOM");
}
static void load_GL_QCOM_extended_get2(GLADloadproc load) {
	if(!GLAD_GL_QCOM_extended_get2) return;
	glad_glExtGetShadersQCOM = (PFNGLEXTGETSHADERSQCOMPROC)load("glExtGetShadersQCOM");
	glad_glExtGetProgramsQCOM = (PFNGLEXTGETPROGRAMSQCOMPROC)load("glExtGetProgramsQCOM");
	glad_glExtIsProgramBinaryQCOM = (PFNGLEXTISPROGRAMBINARYQCOMPROC)load("glExtIsProgramBinaryQCOM");
	glad_glExtGetProgramBinarySourceQCOM = (PFNGLEXTGETPROGRAMBINARYSOURCEQCOMPROC)load("glExtGetProgramBinarySourceQCOM");
}
static void load_GL_QCOM_tiled_rendering(GLADloadproc load) {
	if(!GLAD_GL_QCOM_tiled_rendering) return;
	glad_glStartTilingQCOM = (PFNGLSTARTTILINGQCOMPROC)load("glStartTilingQCOM");
	glad_glEndTilingQCOM = (PFNGLENDTILINGQCOMPROC)load("glEndTilingQCOM");
}
static void find_extensionsGLES1(void) {
	get_exts();
	GLAD_GL_AMD_compressed_3DC_texture = has_ext("GL_AMD_compressed_3DC_texture");
	GLAD_GL_AMD_compressed_ATC_texture = has_ext("GL_AMD_compressed_ATC_texture");
	GLAD_GL_APPLE_copy_texture_levels = has_ext("GL_APPLE_copy_texture_levels");
	GLAD_GL_APPLE_framebuffer_multisample = has_ext("GL_APPLE_framebuffer_multisample");
	GLAD_GL_APPLE_sync = has_ext("GL_APPLE_sync");
	GLAD_GL_APPLE_texture_2D_limited_npot = has_ext("GL_APPLE_texture_2D_limited_npot");
	GLAD_GL_APPLE_texture_format_BGRA8888 = has_ext("GL_APPLE_texture_format_BGRA8888");
	GLAD_GL_APPLE_texture_max_level = has_ext("GL_APPLE_texture_max_level");
	GLAD_GL_ARM_rgba8 = has_ext("GL_ARM_rgba8");
	GLAD_GL_EXT_blend_minmax = has_ext("GL_EXT_blend_minmax");
	GLAD_GL_EXT_discard_framebuffer = has_ext("GL_EXT_discard_framebuffer");
	GLAD_GL_EXT_map_buffer_range = has_ext("GL_EXT_map_buffer_range");
	GLAD_GL_EXT_multi_draw_arrays = has_ext("GL_EXT_multi_draw_arrays");
	GLAD_GL_EXT_multisampled_render_to_texture = has_ext("GL_EXT_multisampled_render_to_texture");
	GLAD_GL_EXT_read_format_bgra = has_ext("GL_EXT_read_format_bgra");
	GLAD_GL_EXT_robustness = has_ext("GL_EXT_robustness");
	GLAD_GL_EXT_sRGB = has_ext("GL_EXT_sRGB");
	GLAD_GL_EXT_texture_compression_dxt1 = has_ext("GL_EXT_texture_compression_dxt1");
	GLAD_GL_EXT_texture_filter_anisotropic = has_ext("GL_EXT_texture_filter_anisotropic");
	GLAD_GL_EXT_texture_format_BGRA8888 = has_ext("GL_EXT_texture_format_BGRA8888");
	GLAD_GL_EXT_texture_lod_bias = has_ext("GL_EXT_texture_lod_bias");
	GLAD_GL_EXT_texture_storage = has_ext("GL_EXT_texture_storage");
	GLAD_GL_IMG_multisampled_render_to_texture = has_ext("GL_IMG_multisampled_render_to_texture");
	GLAD_GL_IMG_read_format = has_ext("GL_IMG_read_format");
	GLAD_GL_IMG_texture_compression_pvrtc = has_ext("GL_IMG_texture_compression_pvrtc");
	GLAD_GL_IMG_texture_env_enhanced_fixed_function = has_ext("GL_IMG_texture_env_enhanced_fixed_function");
	GLAD_GL_IMG_user_clip_plane = has_ext("GL_IMG_user_clip_plane");
	GLAD_GL_NV_fence = has_ext("GL_NV_fence");
	GLAD_GL_OES_EGL_image = has_ext("GL_OES_EGL_image");
	GLAD_GL_OES_EGL_image_external = has_ext("GL_OES_EGL_image_external");
	GLAD_GL_OES_blend_equation_separate = has_ext("GL_OES_blend_equation_separate");
	GLAD_GL_OES_blend_func_separate = has_ext("GL_OES_blend_func_separate");
	GLAD_GL_OES_blend_subtract = has_ext("GL_OES_blend_subtract");
	GLAD_GL_OES_byte_coordinates = has_ext("GL_OES_byte_coordinates");
	GLAD_GL_OES_compressed_ETC1_RGB8_sub_texture = has_ext("GL_OES_compressed_ETC1_RGB8_sub_texture");
	GLAD_GL_OES_compressed_ETC1_RGB8_texture = has_ext("GL_OES_compressed_ETC1_RGB8_texture");
	GLAD_GL_OES_compressed_paletted_texture = has_ext("GL_OES_compressed_paletted_texture");
	GLAD_GL_OES_depth24 = has_ext("GL_OES_depth24");
	GLAD_GL_OES_depth32 = has_ext("GL_OES_depth32");
	GLAD_GL_OES_draw_texture = has_ext("GL_OES_draw_texture");
	GLAD_GL_OES_element_index_uint = has_ext("GL_OES_element_index_uint");
	GLAD_GL_OES_extended_matrix_palette = has_ext("GL_OES_extended_matrix_palette");
	GLAD_GL_OES_fbo_render_mipmap = has_ext("GL_OES_fbo_render_mipmap");
	GLAD_GL_OES_fixed_point = has_ext("GL_OES_fixed_point");
	GLAD_GL_OES_framebuffer_object = has_ext("GL_OES_framebuffer_object");
	GLAD_GL_OES_mapbuffer = has_ext("GL_OES_mapbuffer");
	GLAD_GL_OES_matrix_get = has_ext("GL_OES_matrix_get");
	GLAD_GL_OES_matrix_palette = has_ext("GL_OES_matrix_palette");
	GLAD_GL_OES_packed_depth_stencil = has_ext("GL_OES_packed_depth_stencil");
	GLAD_GL_OES_point_size_array = has_ext("GL_OES_point_size_array");
	GLAD_GL_OES_point_sprite = has_ext("GL_OES_point_sprite");
	GLAD_GL_OES_query_matrix = has_ext("GL_OES_query_matrix");
	GLAD_GL_OES_read_format = has_ext("GL_OES_read_format");
	GLAD_GL_OES_required_internalformat = has_ext("GL_OES_required_internalformat");
	GLAD_GL_OES_rgb8_rgba8 = has_ext("GL_OES_rgb8_rgba8");
	GLAD_GL_OES_single_precision = has_ext("GL_OES_single_precision");
	GLAD_GL_OES_stencil1 = has_ext("GL_OES_stencil1");
	GLAD_GL_OES_stencil4 = has_ext("GL_OES_stencil4");
	GLAD_GL_OES_stencil8 = has_ext("GL_OES_stencil8");
	GLAD_GL_OES_stencil_wrap = has_ext("GL_OES_stencil_wrap");
	GLAD_GL_OES_texture_cube_map = has_ext("GL_OES_texture_cube_map");
	GLAD_GL_OES_texture_env_crossbar = has_ext("GL_OES_texture_env_crossbar");
	GLAD_GL_OES_texture_mirrored_repeat = has_ext("GL_OES_texture_mirrored_repeat");
	GLAD_GL_OES_vertex_array_object = has_ext("GL_OES_vertex_array_object");
	GLAD_GL_QCOM_driver_control = has_ext("GL_QCOM_driver_control");
	GLAD_GL_QCOM_extended_get = has_ext("GL_QCOM_extended_get");
	GLAD_GL_QCOM_extended_get2 = has_ext("GL_QCOM_extended_get2");
	GLAD_GL_QCOM_perfmon_global_mode = has_ext("GL_QCOM_perfmon_global_mode");
	GLAD_GL_QCOM_tiled_rendering = has_ext("GL_QCOM_tiled_rendering");
	GLAD_GL_QCOM_writeonly_rendering = has_ext("GL_QCOM_writeonly_rendering");
}

static void find_coreGLES1(void) {

    /* Thank you @elmindreda
     * https://github.com/elmindreda/greg/blob/master/templates/greg.c.in#L176
     * https://github.com/glfw/glfw/blob/master/src/context.c#L36
     */
    int i, major, minor;

    const char* version;
    const char* prefixes[] = {
        "OpenGL ES-CM ",
        "OpenGL ES-CL ",
        "OpenGL ES ",
        NULL
    };

    version = (const char*) glGetString(GL_VERSION);
    if (!version) return;

    for (i = 0;  prefixes[i];  i++) {
        const size_t length = strlen(prefixes[i]);
        if (strncmp(version, prefixes[i], length) == 0) {
            version += length;
            break;
        }
    }

/* PR #18 */
#ifdef _MSC_VER
    sscanf_s(version, "%d.%d", &major, &minor);
#else
    sscanf(version, "%d.%d", &major, &minor);
#endif

    GLVersion.major = major; GLVersion.minor = minor;
    max_loaded_major = major; max_loaded_minor = minor;
	GLAD_GL_VERSION_ES_CM_1_0 = (major == 1 && minor >= 0) || major > 1;
	if (GLVersion.major > 1 || (GLVersion.major >= 1 && GLVersion.minor >= 0)) {
		max_loaded_major = 1;
		max_loaded_minor = 0;
	}
}

int gladLoadGLES1Loader(GLADloadproc load) {
	GLVersion.major = 0; GLVersion.minor = 0;
	glGetString = (PFNGLGETSTRINGPROC)load("glGetString");
	if(glGetString == NULL) return 0;
	if(glGetString(GL_VERSION) == NULL) return 0;
	find_coreGLES1();
	load_GL_VERSION_ES_CM_1_0(load);

	find_extensionsGLES1();
	load_GL_APPLE_copy_texture_levels(load);
	load_GL_APPLE_framebuffer_multisample(load);
	load_GL_APPLE_sync(load);
	load_GL_EXT_blend_minmax(load);
	load_GL_EXT_discard_framebuffer(load);
	load_GL_EXT_map_buffer_range(load);
	load_GL_EXT_multi_draw_arrays(load);
	load_GL_EXT_multisampled_render_to_texture(load);
	load_GL_EXT_robustness(load);
	load_GL_EXT_texture_storage(load);
	load_GL_IMG_multisampled_render_to_texture(load);
	load_GL_IMG_user_clip_plane(load);
	load_GL_NV_fence(load);
	load_GL_OES_EGL_image(load);
	load_GL_OES_blend_equation_separate(load);
	load_GL_OES_blend_func_separate(load);
	load_GL_OES_blend_subtract(load);
	load_GL_OES_byte_coordinates(load);
	load_GL_OES_draw_texture(load);
	load_GL_OES_fixed_point(load);
	load_GL_OES_framebuffer_object(load);
	load_GL_OES_mapbuffer(load);
	load_GL_OES_matrix_palette(load);
	load_GL_OES_point_size_array(load);
	load_GL_OES_query_matrix(load);
	load_GL_OES_single_precision(load);
	load_GL_OES_texture_cube_map(load);
	load_GL_OES_vertex_array_object(load);
	load_GL_QCOM_driver_control(load);
	load_GL_QCOM_extended_get(load);
	load_GL_QCOM_extended_get2(load);
	load_GL_QCOM_tiled_rendering(load);
	return GLVersion.major != 0 || GLVersion.minor != 0;
}

