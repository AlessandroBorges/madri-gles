/*

**    Place holder for disclaimer.
*/

package gles.internal;

import static gles.internal.GLES10Pipeline.checkArray;
import static gles.internal.GLES10Pipeline.checkBuffer;
import static gles.internal.GLES10Pipeline.getOffset;
import static gles.internal.GLES10Pipeline.PARAMS;
import static gles.internal.GLES10Pipeline.DATA;
import static gles.internal.GLES10Pipeline.getNeededLight;
import static gles.internal.GLES10Pipeline.getNeededCount;
import static gles.internal.GLES10Pipeline.getNeededMaterial;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GLES11ExtPipeline 	
	implements Pipeline {
	
    /** Includes **/
    // @formatter:off 
    /*JNI 
     
     #define EGL_EGLEXT_PROTOTYPES 1
    #include <EGL/egl.h>
    #include <EGL/eglext.h>

  // GLES 1.x  api
    #define GL_GLEXT_PROTOTYPES 1 
    #include <GLES/egl.h>
    #include <GLES/gl.h>
    #include <GLES/glext.h>

 // raise a Exception
  static int throwException(JNIEnv *env, const char* className, const char* msg) {    
        jclass Exception = env->FindClass(className);
        env->ThrowNew(Exception, msg);
        return 1;
    }
   
   // raise a Unsupported Operation Exception 
  static int throwUOPException(JNIEnv *env, const char* msg) {    
        jclass Exception = env->FindClass("java/lang/UnsupportedOperationException");
        env->ThrowNew(Exception, msg);
         return 1;
    }

   // raise a NPE Exception 
  static int throwUOPE(JNIEnv *env, const char* msg) {    
        jclass Exception = env->FindClass("java/lang/NullPointerException");
        env->ThrowNew(Exception, msg);
         return 1;
    }
  
  // raise a IAE Exception 
  static int throwIAE(JNIEnv *env, const char* msg) {    
        jclass Exception = env->FindClass("java/lang/IllegalArgumentException");
        env->ThrowNew(Exception, msg);
         return 1;
    }
  
  // function pointers section 
   // Declaration of FuncPointer vars 



 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_APPLE_copy_texture_levels
 // API: gles1|gles2
 //////////////////////////////////
      static PFNGLCOPYTEXTURELEVELSAPPLEPROC gles_glCopyTextureLevelsAPPLE;
      #define  glCopyTextureLevelsAPPLE gles_glCopyTextureLevelsAPPLE
 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_APPLE_framebuffer_multisample
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLRENDERBUFFERSTORAGEMULTISAMPLEAPPLEPROC    glRenderbufferStorageMultisampleAPPLE;
         static PFNGLRESOLVEMULTISAMPLEFRAMEBUFFERAPPLEPROC     glResolveMultisampleFramebufferAPPLE;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_APPLE_sync
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLFENCESYNCAPPLEPROC glFenceSyncAPPLE;
         static PFNGLFENCESYNCPROC      glFenceSync;
         static PFNGLISSYNCAPPLEPROC    glIsSyncAPPLE;
         static PFNGLISSYNCPROC glIsSync;
         static PFNGLDELETESYNCAPPLEPROC        glDeleteSyncAPPLE;
         static PFNGLDELETESYNCPROC     glDeleteSync;
         static PFNGLCLIENTWAITSYNCAPPLEPROC    glClientWaitSyncAPPLE;
         static PFNGLCLIENTWAITSYNCPROC glClientWaitSync;
         static PFNGLWAITSYNCAPPLEPROC  glWaitSyncAPPLE;
         static PFNGLWAITSYNCPROC       glWaitSync;
         static PFNGLGETINTEGER64VAPPLEPROC     glGetInteger64vAPPLE;
         static PFNGLGETINTEGER64VPROC  glGetInteger64v;
         static PFNGLGETSYNCIVAPPLEPROC glGetSyncivAPPLE;
         static PFNGLGETSYNCIVPROC      glGetSynciv;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_discard_framebuffer
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLDISCARDFRAMEBUFFEREXTPROC  glDiscardFramebufferEXT;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_map_buffer_range
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLMAPBUFFERRANGEEXTPROC      glMapBufferRangeEXT;
         static PFNGLMAPBUFFERRANGEPROC glMapBufferRange;
         static PFNGLFLUSHMAPPEDBUFFERRANGEEXTPROC      glFlushMappedBufferRangeEXT;
         static PFNGLFLUSHMAPPEDBUFFERRANGEPROC glFlushMappedBufferRange;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_multi_draw_arrays
 // API: gl|gles1|gles2
 //////////////////////////////////
         static PFNGLMULTIDRAWARRAYSEXTPROC     glMultiDrawArraysEXT;
         static PFNGLMULTIDRAWARRAYSPROC        glMultiDrawArrays;
         static PFNGLMULTIDRAWELEMENTSEXTPROC   glMultiDrawElementsEXT;
         static PFNGLMULTIDRAWELEMENTSPROC      glMultiDrawElements;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_multisampled_render_to_texture
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC      glRenderbufferStorageMultisampleEXT;
         static PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC glRenderbufferStorageMultisample;
         static PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEEXTPROC     glFramebufferTexture2DMultisampleEXT;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_robustness
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLGETGRAPHICSRESETSTATUSEXTPROC      glGetGraphicsResetStatusEXT;
         static PFNGLREADNPIXELSEXTPROC glReadnPixelsEXT;
         static PFNGLREADNPIXELSPROC    glReadnPixels;
         static PFNGLGETNUNIFORMFVEXTPROC       glGetnUniformfvEXT;
         static PFNGLGETNUNIFORMIVEXTPROC       glGetnUniformivEXT;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_texture_storage
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLTEXSTORAGE1DEXTPROC        glTexStorage1DEXT;
         static PFNGLTEXSTORAGE1DPROC   glTexStorage1D;
         static PFNGLTEXSTORAGE2DEXTPROC        glTexStorage2DEXT;
         static PFNGLTEXSTORAGE2DPROC   glTexStorage2D;
         static PFNGLTEXSTORAGE3DEXTPROC        glTexStorage3DEXT;
         static PFNGLTEXSTORAGE3DPROC   glTexStorage3D;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_EXT_texture_storage
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLTEXTURESTORAGE1DEXTPROC    glTextureStorage1DEXT;
         static PFNGLTEXTURESTORAGE2DEXTPROC    glTextureStorage2DEXT;
         static PFNGLTEXTURESTORAGE3DEXTPROC    glTextureStorage3DEXT;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_IMG_multisampled_render_to_texture
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLRENDERBUFFERSTORAGEMULTISAMPLEIMGPROC      glRenderbufferStorageMultisampleIMG;
         static PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEIMGPROC     glFramebufferTexture2DMultisampleIMG;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_IMG_user_clip_plane
 // API: gles1
 //////////////////////////////////
         static PFNGLCLIPPLANEFIMGPROC  glClipPlanefIMG;
         static PFNGLCLIPPLANEXIMGPROC  glClipPlanexIMG;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_NV_fence
 // API: gl|gles1|gles2
 //////////////////////////////////
         static PFNGLDELETEFENCESNVPROC glDeleteFencesNV;
         static PFNGLGENFENCESNVPROC    glGenFencesNV;
         static PFNGLISFENCENVPROC      glIsFenceNV;
         static PFNGLTESTFENCENVPROC    glTestFenceNV;
         static PFNGLGETFENCEIVNVPROC   glGetFenceivNV;
         static PFNGLFINISHFENCENVPROC  glFinishFenceNV;
         static PFNGLSETFENCENVPROC     glSetFenceNV;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_EGL_image
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLEGLIMAGETARGETTEXTURE2DOESPROC     glEGLImageTargetTexture2DOES;
         static PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC   glEGLImageTargetRenderbufferStorageOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_equation_separate
 // API: gles1
 //////////////////////////////////
         static PFNGLBLENDEQUATIONSEPARATEOESPROC       glBlendEquationSeparateOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_func_separate
 // API: gles1
 //////////////////////////////////
         static PFNGLBLENDFUNCSEPARATEOESPROC   glBlendFuncSeparateOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_subtract
 // API: gles1
 //////////////////////////////////
         static PFNGLBLENDEQUATIONOESPROC       glBlendEquationOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_draw_texture
 // API: gles1
 //////////////////////////////////
         static PFNGLDRAWTEXSOESPROC    glDrawTexsOES;
         static PFNGLDRAWTEXIOESPROC    glDrawTexiOES;
         static PFNGLDRAWTEXXOESPROC    glDrawTexxOES;
         static PFNGLDRAWTEXSVOESPROC   glDrawTexsvOES;
         static PFNGLDRAWTEXIVOESPROC   glDrawTexivOES;
         static PFNGLDRAWTEXXVOESPROC   glDrawTexxvOES;
         static PFNGLDRAWTEXFOESPROC    glDrawTexfOES;
         static PFNGLDRAWTEXFVOESPROC   glDrawTexfvOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_fixed_point
 // API: gl|gles1
 //////////////////////////////////
         static PFNGLALPHAFUNCXOESPROC  glAlphaFuncxOES;
         static PFNGLCLEARCOLORXOESPROC glClearColorxOES;
         static PFNGLCLEARDEPTHXOESPROC glClearDepthxOES;
         static PFNGLCLIPPLANEXOESPROC  glClipPlanexOES;
         static PFNGLCOLOR4XOESPROC     glColor4xOES;
         static PFNGLDEPTHRANGEXOESPROC glDepthRangexOES;
         static PFNGLFOGXOESPROC        glFogxOES;
         static PFNGLFOGXVOESPROC       glFogxvOES;
         static PFNGLFRUSTUMXOESPROC    glFrustumxOES;
         static PFNGLGETCLIPPLANEXOESPROC       glGetClipPlanexOES;
         static PFNGLGETFIXEDVOESPROC   glGetFixedvOES;
         static PFNGLGETTEXENVXVOESPROC glGetTexEnvxvOES;
         static PFNGLGETTEXPARAMETERXVOESPROC   glGetTexParameterxvOES;
         static PFNGLLIGHTMODELXOESPROC glLightModelxOES;
         static PFNGLLIGHTMODELXVOESPROC        glLightModelxvOES;
         static PFNGLLIGHTXOESPROC      glLightxOES;
         static PFNGLLIGHTXVOESPROC     glLightxvOES;
         static PFNGLLINEWIDTHXOESPROC  glLineWidthxOES;
         static PFNGLLOADMATRIXXOESPROC glLoadMatrixxOES;
         static PFNGLMATERIALXOESPROC   glMaterialxOES;
         static PFNGLMATERIALXVOESPROC  glMaterialxvOES;
         static PFNGLMULTMATRIXXOESPROC glMultMatrixxOES;
         static PFNGLMULTITEXCOORD4XOESPROC     glMultiTexCoord4xOES;
         static PFNGLNORMAL3XOESPROC    glNormal3xOES;
         static PFNGLORTHOXOESPROC      glOrthoxOES;
         static PFNGLPOINTPARAMETERXVOESPROC    glPointParameterxvOES;
         static PFNGLPOINTSIZEXOESPROC  glPointSizexOES;
         static PFNGLPOLYGONOFFSETXOESPROC      glPolygonOffsetxOES;
         static PFNGLROTATEXOESPROC     glRotatexOES;
         static PFNGLSCALEXOESPROC      glScalexOES;
         static PFNGLTEXENVXOESPROC     glTexEnvxOES;
         static PFNGLTEXENVXVOESPROC    glTexEnvxvOES;
         static PFNGLTEXPARAMETERXOESPROC       glTexParameterxOES;
         static PFNGLTEXPARAMETERXVOESPROC      glTexParameterxvOES;
         static PFNGLTRANSLATEXOESPROC  glTranslatexOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_fixed_point
 // API: gles1
 //////////////////////////////////
         static PFNGLGETLIGHTXVOESPROC  glGetLightxvOES;
         static PFNGLGETMATERIALXVOESPROC       glGetMaterialxvOES;
         static PFNGLPOINTPARAMETERXOESPROC     glPointParameterxOES;
         static PFNGLSAMPLECOVERAGEXOESPROC     glSampleCoveragexOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_framebuffer_object
 // API: gles1
 //////////////////////////////////
         static PFNGLISRENDERBUFFEROESPROC      glIsRenderbufferOES;
         static PFNGLBINDRENDERBUFFEROESPROC    glBindRenderbufferOES;
         static PFNGLDELETERENDERBUFFERSOESPROC glDeleteRenderbuffersOES;
         static PFNGLGENRENDERBUFFERSOESPROC    glGenRenderbuffersOES;
         static PFNGLRENDERBUFFERSTORAGEOESPROC glRenderbufferStorageOES;
         static PFNGLGETRENDERBUFFERPARAMETERIVOESPROC  glGetRenderbufferParameterivOES;
         static PFNGLISFRAMEBUFFEROESPROC       glIsFramebufferOES;
         static PFNGLBINDFRAMEBUFFEROESPROC     glBindFramebufferOES;
         static PFNGLDELETEFRAMEBUFFERSOESPROC  glDeleteFramebuffersOES;
         static PFNGLGENFRAMEBUFFERSOESPROC     glGenFramebuffersOES;
         static PFNGLCHECKFRAMEBUFFERSTATUSOESPROC      glCheckFramebufferStatusOES;
         static PFNGLFRAMEBUFFERRENDERBUFFEROESPROC     glFramebufferRenderbufferOES;
         static PFNGLFRAMEBUFFERTEXTURE2DOESPROC        glFramebufferTexture2DOES;
         static PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVOESPROC glGetFramebufferAttachmentParameterivOES;
         static PFNGLGENERATEMIPMAPOESPROC      glGenerateMipmapOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_mapbuffer
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLMAPBUFFEROESPROC   glMapBufferOES;
         static PFNGLMAPBUFFERPROC      glMapBuffer;
         static PFNGLUNMAPBUFFEROESPROC glUnmapBufferOES;
         static PFNGLUNMAPBUFFERPROC    glUnmapBuffer;
         static PFNGLGETBUFFERPOINTERVOESPROC   glGetBufferPointervOES;
         static PFNGLGETBUFFERPOINTERVPROC      glGetBufferPointerv;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_matrix_palette
 // API: gles1
 //////////////////////////////////
         static PFNGLCURRENTPALETTEMATRIXOESPROC        glCurrentPaletteMatrixOES;
         static PFNGLLOADPALETTEFROMMODELVIEWMATRIXOESPROC      glLoadPaletteFromModelViewMatrixOES;
         static PFNGLMATRIXINDEXPOINTEROESPROC  glMatrixIndexPointerOES;
         static PFNGLWEIGHTPOINTEROESPROC       glWeightPointerOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_point_size_array
 // API: gles1
 //////////////////////////////////
         static PFNGLPOINTSIZEPOINTEROESPROC    glPointSizePointerOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_query_matrix
 // API: gl|gles1
 //////////////////////////////////
         static PFNGLQUERYMATRIXXOESPROC        glQueryMatrixxOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_single_precision
 // API: gl|gles1
 //////////////////////////////////
         static PFNGLCLEARDEPTHFOESPROC glClearDepthfOES;
         static PFNGLCLEARDEPTHFPROC    glClearDepthf;
         static PFNGLCLIPPLANEFOESPROC  glClipPlanefOES;
         static PFNGLDEPTHRANGEFOESPROC glDepthRangefOES;
         static PFNGLDEPTHRANGEFPROC    glDepthRangef;
         static PFNGLFRUSTUMFOESPROC    glFrustumfOES;
         static PFNGLGETCLIPPLANEFOESPROC       glGetClipPlanefOES;
         static PFNGLORTHOFOESPROC      glOrthofOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_texture_cube_map
 // API: gles1
 //////////////////////////////////
         static PFNGLTEXGENFOESPROC     glTexGenfOES;
         static PFNGLTEXGENFVOESPROC    glTexGenfvOES;
         static PFNGLTEXGENIOESPROC     glTexGeniOES;
         static PFNGLTEXGENIVOESPROC    glTexGenivOES;
         static PFNGLTEXGENXOESPROC     glTexGenxOES;
         static PFNGLTEXGENXVOESPROC    glTexGenxvOES;
         static PFNGLGETTEXGENFVOESPROC glGetTexGenfvOES;
         static PFNGLGETTEXGENIVOESPROC glGetTexGenivOES;
         static PFNGLGETTEXGENXVOESPROC glGetTexGenxvOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_vertex_array_object
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLBINDVERTEXARRAYOESPROC     glBindVertexArrayOES;
         static PFNGLBINDVERTEXARRAYPROC        glBindVertexArray;
         static PFNGLDELETEVERTEXARRAYSOESPROC  glDeleteVertexArraysOES;
         static PFNGLDELETEVERTEXARRAYSPROC     glDeleteVertexArrays;
         static PFNGLGENVERTEXARRAYSOESPROC     glGenVertexArraysOES;
         static PFNGLGENVERTEXARRAYSPROC        glGenVertexArrays;
         static PFNGLISVERTEXARRAYOESPROC       glIsVertexArrayOES;
         static PFNGLISVERTEXARRAYPROC  glIsVertexArray;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_QCOM_driver_control
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLGETDRIVERCONTROLSQCOMPROC  glGetDriverControlsQCOM;
         static PFNGLGETDRIVERCONTROLSTRINGQCOMPROC     glGetDriverControlStringQCOM;
         static PFNGLENABLEDRIVERCONTROLQCOMPROC        glEnableDriverControlQCOM;
         static PFNGLDISABLEDRIVERCONTROLQCOMPROC       glDisableDriverControlQCOM;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_QCOM_extended_get
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLEXTGETTEXTURESQCOMPROC     glExtGetTexturesQCOM;
         static PFNGLEXTGETBUFFERSQCOMPROC      glExtGetBuffersQCOM;
         static PFNGLEXTGETRENDERBUFFERSQCOMPROC        glExtGetRenderbuffersQCOM;
         static PFNGLEXTGETFRAMEBUFFERSQCOMPROC glExtGetFramebuffersQCOM;
         static PFNGLEXTGETTEXLEVELPARAMETERIVQCOMPROC  glExtGetTexLevelParameterivQCOM;
         static PFNGLEXTTEXOBJECTSTATEOVERRIDEIQCOMPROC glExtTexObjectStateOverrideiQCOM;
         static PFNGLEXTGETTEXSUBIMAGEQCOMPROC  glExtGetTexSubImageQCOM;
         static PFNGLEXTGETBUFFERPOINTERVQCOMPROC       glExtGetBufferPointervQCOM;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_QCOM_extended_get2
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLEXTGETSHADERSQCOMPROC      glExtGetShadersQCOM;
         static PFNGLEXTGETPROGRAMSQCOMPROC     glExtGetProgramsQCOM;
         static PFNGLEXTISPROGRAMBINARYQCOMPROC glExtIsProgramBinaryQCOM;
         static PFNGLEXTGETPROGRAMBINARYSOURCEQCOMPROC  glExtGetProgramBinarySourceQCOM;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_QCOM_tiled_rendering
 // API: gles1|gles2
 //////////////////////////////////
         static PFNGLSTARTTILINGQCOMPROC        glStartTilingQCOM;
         static PFNGLENDTILINGQCOMPROC  glEndTilingQCOM;
  // extension loaders
  // function loader
  #define myFuncLoader(x) eglGetProcAddress(x)

   // Declaration of LOADERS for function pointers - PFN_PROC 

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_APPLE_copy_texture_levels
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_APPLE_copy_texture_levels(){
          gles_glCopyTextureLevelsAPPLE = (PFNGLCOPYTEXTURELEVELSAPPLEPROC) myFuncLoader("glCopyTextureLevelsAPPLE");

          return 1;
     } // end of loadExtFuncGL_APPLE_copy_texture_levels()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_APPLE_framebuffer_multisample
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_APPLE_framebuffer_multisample(){
          glRenderbufferStorageMultisampleAPPLE = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEAPPLEPROC) myFuncLoader("glRenderbufferStorageMultisampleAPPLE");
          glResolveMultisampleFramebufferAPPLE = (PFNGLRESOLVEMULTISAMPLEFRAMEBUFFERAPPLEPROC) myFuncLoader("glResolveMultisampleFramebufferAPPLE");

          return 1;
     } // end of loadExtFuncGL_APPLE_framebuffer_multisample()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_APPLE_sync
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_APPLE_sync(){
          glFenceSyncAPPLE = (PFNGLFENCESYNCAPPLEPROC) myFuncLoader("glFenceSyncAPPLE");
          glFenceSync = (PFNGLFENCESYNCPROC) myFuncLoader("glFenceSync");
          glIsSyncAPPLE = (PFNGLISSYNCAPPLEPROC) myFuncLoader("glIsSyncAPPLE");
          glIsSync = (PFNGLISSYNCPROC) myFuncLoader("glIsSync");
          glDeleteSyncAPPLE = (PFNGLDELETESYNCAPPLEPROC) myFuncLoader("glDeleteSyncAPPLE");
          glDeleteSync = (PFNGLDELETESYNCPROC) myFuncLoader("glDeleteSync");
          glClientWaitSyncAPPLE = (PFNGLCLIENTWAITSYNCAPPLEPROC) myFuncLoader("glClientWaitSyncAPPLE");
          glClientWaitSync = (PFNGLCLIENTWAITSYNCPROC) myFuncLoader("glClientWaitSync");
          glWaitSyncAPPLE = (PFNGLWAITSYNCAPPLEPROC) myFuncLoader("glWaitSyncAPPLE");
          glWaitSync = (PFNGLWAITSYNCPROC) myFuncLoader("glWaitSync");
          glGetInteger64vAPPLE = (PFNGLGETINTEGER64VAPPLEPROC) myFuncLoader("glGetInteger64vAPPLE");
          glGetInteger64v = (PFNGLGETINTEGER64VPROC) myFuncLoader("glGetInteger64v");
          glGetSyncivAPPLE = (PFNGLGETSYNCIVAPPLEPROC) myFuncLoader("glGetSyncivAPPLE");
          glGetSynciv = (PFNGLGETSYNCIVPROC) myFuncLoader("glGetSynciv");

          return 1;
     } // end of loadExtFuncGL_APPLE_sync()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_discard_framebuffer
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_discard_framebuffer(){
          glDiscardFramebufferEXT = (PFNGLDISCARDFRAMEBUFFEREXTPROC) myFuncLoader("glDiscardFramebufferEXT");

          return 1;
     } // end of loadExtFuncGL_EXT_discard_framebuffer()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_map_buffer_range
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_map_buffer_range(){
          glMapBufferRangeEXT = (PFNGLMAPBUFFERRANGEEXTPROC) myFuncLoader("glMapBufferRangeEXT");
          glMapBufferRange = (PFNGLMAPBUFFERRANGEPROC) myFuncLoader("glMapBufferRange");
          glFlushMappedBufferRangeEXT = (PFNGLFLUSHMAPPEDBUFFERRANGEEXTPROC) myFuncLoader("glFlushMappedBufferRangeEXT");
          glFlushMappedBufferRange = (PFNGLFLUSHMAPPEDBUFFERRANGEPROC) myFuncLoader("glFlushMappedBufferRange");

          return 1;
     } // end of loadExtFuncGL_EXT_map_buffer_range()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_multi_draw_arrays
  // API: gl|gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_multi_draw_arrays(){
          glMultiDrawArraysEXT = (PFNGLMULTIDRAWARRAYSEXTPROC) myFuncLoader("glMultiDrawArraysEXT");
          glMultiDrawArrays = (PFNGLMULTIDRAWARRAYSPROC) myFuncLoader("glMultiDrawArrays");
          glMultiDrawElementsEXT = (PFNGLMULTIDRAWELEMENTSEXTPROC) myFuncLoader("glMultiDrawElementsEXT");
          glMultiDrawElements = (PFNGLMULTIDRAWELEMENTSPROC) myFuncLoader("glMultiDrawElements");

          return 1;
     } // end of loadExtFuncGL_EXT_multi_draw_arrays()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_multisampled_render_to_texture
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_multisampled_render_to_texture(){
          glRenderbufferStorageMultisampleEXT = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC) myFuncLoader("glRenderbufferStorageMultisampleEXT");
          glRenderbufferStorageMultisample = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC) myFuncLoader("glRenderbufferStorageMultisample");
          glFramebufferTexture2DMultisampleEXT = (PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEEXTPROC) myFuncLoader("glFramebufferTexture2DMultisampleEXT");

          return 1;
     } // end of loadExtFuncGL_EXT_multisampled_render_to_texture()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_robustness
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_robustness(){
          glGetGraphicsResetStatusEXT = (PFNGLGETGRAPHICSRESETSTATUSEXTPROC) myFuncLoader("glGetGraphicsResetStatusEXT");
          glReadnPixelsEXT = (PFNGLREADNPIXELSEXTPROC) myFuncLoader("glReadnPixelsEXT");
          glReadnPixels = (PFNGLREADNPIXELSPROC) myFuncLoader("glReadnPixels");
          glGetnUniformfvEXT = (PFNGLGETNUNIFORMFVEXTPROC) myFuncLoader("glGetnUniformfvEXT");
          glGetnUniformivEXT = (PFNGLGETNUNIFORMIVEXTPROC) myFuncLoader("glGetnUniformivEXT");

          return 1;
     } // end of loadExtFuncGL_EXT_robustness()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_texture_storage
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_texture_storage(){
          glTexStorage1DEXT = (PFNGLTEXSTORAGE1DEXTPROC) myFuncLoader("glTexStorage1DEXT");
          glTexStorage1D = (PFNGLTEXSTORAGE1DPROC) myFuncLoader("glTexStorage1D");
          glTexStorage2DEXT = (PFNGLTEXSTORAGE2DEXTPROC) myFuncLoader("glTexStorage2DEXT");
          glTexStorage2D = (PFNGLTEXSTORAGE2DPROC) myFuncLoader("glTexStorage2D");
          glTexStorage3DEXT = (PFNGLTEXSTORAGE3DEXTPROC) myFuncLoader("glTexStorage3DEXT");
          glTexStorage3D = (PFNGLTEXSTORAGE3DPROC) myFuncLoader("glTexStorage3D");

          return 1;
     } // end of loadExtFuncGL_EXT_texture_storage()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_EXT_texture_storage
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_EXT_texture_storage(){
          glTextureStorage1DEXT = (PFNGLTEXTURESTORAGE1DEXTPROC) myFuncLoader("glTextureStorage1DEXT");
          glTextureStorage2DEXT = (PFNGLTEXTURESTORAGE2DEXTPROC) myFuncLoader("glTextureStorage2DEXT");
          glTextureStorage3DEXT = (PFNGLTEXTURESTORAGE3DEXTPROC) myFuncLoader("glTextureStorage3DEXT");

          return 1;
     } // end of loadExtFuncGL_EXT_texture_storage()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_IMG_multisampled_render_to_texture
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_IMG_multisampled_render_to_texture(){
          glRenderbufferStorageMultisampleIMG = (PFNGLRENDERBUFFERSTORAGEMULTISAMPLEIMGPROC) myFuncLoader("glRenderbufferStorageMultisampleIMG");
          glFramebufferTexture2DMultisampleIMG = (PFNGLFRAMEBUFFERTEXTURE2DMULTISAMPLEIMGPROC) myFuncLoader("glFramebufferTexture2DMultisampleIMG");

          return 1;
     } // end of loadExtFuncGL_IMG_multisampled_render_to_texture()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_IMG_user_clip_plane
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_IMG_user_clip_plane(){
          glClipPlanefIMG = (PFNGLCLIPPLANEFIMGPROC) myFuncLoader("glClipPlanefIMG");
          glClipPlanexIMG = (PFNGLCLIPPLANEXIMGPROC) myFuncLoader("glClipPlanexIMG");

          return 1;
     } // end of loadExtFuncGL_IMG_user_clip_plane()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_NV_fence
  // API: gl|gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_NV_fence(){
          glDeleteFencesNV = (PFNGLDELETEFENCESNVPROC) myFuncLoader("glDeleteFencesNV");
          glGenFencesNV = (PFNGLGENFENCESNVPROC) myFuncLoader("glGenFencesNV");
          glIsFenceNV = (PFNGLISFENCENVPROC) myFuncLoader("glIsFenceNV");
          glTestFenceNV = (PFNGLTESTFENCENVPROC) myFuncLoader("glTestFenceNV");
          glGetFenceivNV = (PFNGLGETFENCEIVNVPROC) myFuncLoader("glGetFenceivNV");
          glFinishFenceNV = (PFNGLFINISHFENCENVPROC) myFuncLoader("glFinishFenceNV");
          glSetFenceNV = (PFNGLSETFENCENVPROC) myFuncLoader("glSetFenceNV");

          return 1;
     } // end of loadExtFuncGL_NV_fence()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_EGL_image
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_OES_EGL_image(){
          glEGLImageTargetTexture2DOES = (PFNGLEGLIMAGETARGETTEXTURE2DOESPROC) myFuncLoader("glEGLImageTargetTexture2DOES");
          glEGLImageTargetRenderbufferStorageOES = (PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC) myFuncLoader("glEGLImageTargetRenderbufferStorageOES");

          return 1;
     } // end of loadExtFuncGL_OES_EGL_image()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_blend_equation_separate
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_blend_equation_separate(){
          glBlendEquationSeparateOES = (PFNGLBLENDEQUATIONSEPARATEOESPROC) myFuncLoader("glBlendEquationSeparateOES");

          return 1;
     } // end of loadExtFuncGL_OES_blend_equation_separate()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_blend_func_separate
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_blend_func_separate(){
          glBlendFuncSeparateOES = (PFNGLBLENDFUNCSEPARATEOESPROC) myFuncLoader("glBlendFuncSeparateOES");

          return 1;
     } // end of loadExtFuncGL_OES_blend_func_separate()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_blend_subtract
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_blend_subtract(){
          glBlendEquationOES = (PFNGLBLENDEQUATIONOESPROC) myFuncLoader("glBlendEquationOES");

          return 1;
     } // end of loadExtFuncGL_OES_blend_subtract()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_draw_texture
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_draw_texture(){
          glDrawTexsOES = (PFNGLDRAWTEXSOESPROC) myFuncLoader("glDrawTexsOES");
          glDrawTexiOES = (PFNGLDRAWTEXIOESPROC) myFuncLoader("glDrawTexiOES");
          glDrawTexxOES = (PFNGLDRAWTEXXOESPROC) myFuncLoader("glDrawTexxOES");
          glDrawTexsvOES = (PFNGLDRAWTEXSVOESPROC) myFuncLoader("glDrawTexsvOES");
          glDrawTexivOES = (PFNGLDRAWTEXIVOESPROC) myFuncLoader("glDrawTexivOES");
          glDrawTexxvOES = (PFNGLDRAWTEXXVOESPROC) myFuncLoader("glDrawTexxvOES");
          glDrawTexfOES = (PFNGLDRAWTEXFOESPROC) myFuncLoader("glDrawTexfOES");
          glDrawTexfvOES = (PFNGLDRAWTEXFVOESPROC) myFuncLoader("glDrawTexfvOES");

          return 1;
     } // end of loadExtFuncGL_OES_draw_texture()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_fixed_point
  // API: gl|gles1
  /// =====================================
  static  int loadExtFuncGL_OES_fixed_point(){
          glAlphaFuncxOES = (PFNGLALPHAFUNCXOESPROC) myFuncLoader("glAlphaFuncxOES");
          glClearColorxOES = (PFNGLCLEARCOLORXOESPROC) myFuncLoader("glClearColorxOES");
          glClearDepthxOES = (PFNGLCLEARDEPTHXOESPROC) myFuncLoader("glClearDepthxOES");
          glClipPlanexOES = (PFNGLCLIPPLANEXOESPROC) myFuncLoader("glClipPlanexOES");
          glColor4xOES = (PFNGLCOLOR4XOESPROC) myFuncLoader("glColor4xOES");
          glDepthRangexOES = (PFNGLDEPTHRANGEXOESPROC) myFuncLoader("glDepthRangexOES");
          glFogxOES = (PFNGLFOGXOESPROC) myFuncLoader("glFogxOES");
          glFogxvOES = (PFNGLFOGXVOESPROC) myFuncLoader("glFogxvOES");
          glFrustumxOES = (PFNGLFRUSTUMXOESPROC) myFuncLoader("glFrustumxOES");
          glGetClipPlanexOES = (PFNGLGETCLIPPLANEXOESPROC) myFuncLoader("glGetClipPlanexOES");
          glGetFixedvOES = (PFNGLGETFIXEDVOESPROC) myFuncLoader("glGetFixedvOES");
          glGetTexEnvxvOES = (PFNGLGETTEXENVXVOESPROC) myFuncLoader("glGetTexEnvxvOES");
          glGetTexParameterxvOES = (PFNGLGETTEXPARAMETERXVOESPROC) myFuncLoader("glGetTexParameterxvOES");
          glLightModelxOES = (PFNGLLIGHTMODELXOESPROC) myFuncLoader("glLightModelxOES");
          glLightModelxvOES = (PFNGLLIGHTMODELXVOESPROC) myFuncLoader("glLightModelxvOES");
          glLightxOES = (PFNGLLIGHTXOESPROC) myFuncLoader("glLightxOES");
          glLightxvOES = (PFNGLLIGHTXVOESPROC) myFuncLoader("glLightxvOES");
          glLineWidthxOES = (PFNGLLINEWIDTHXOESPROC) myFuncLoader("glLineWidthxOES");
          glLoadMatrixxOES = (PFNGLLOADMATRIXXOESPROC) myFuncLoader("glLoadMatrixxOES");
          glMaterialxOES = (PFNGLMATERIALXOESPROC) myFuncLoader("glMaterialxOES");
          glMaterialxvOES = (PFNGLMATERIALXVOESPROC) myFuncLoader("glMaterialxvOES");
          glMultMatrixxOES = (PFNGLMULTMATRIXXOESPROC) myFuncLoader("glMultMatrixxOES");
          glMultiTexCoord4xOES = (PFNGLMULTITEXCOORD4XOESPROC) myFuncLoader("glMultiTexCoord4xOES");
          glNormal3xOES = (PFNGLNORMAL3XOESPROC) myFuncLoader("glNormal3xOES");
          glOrthoxOES = (PFNGLORTHOXOESPROC) myFuncLoader("glOrthoxOES");
          glPointParameterxvOES = (PFNGLPOINTPARAMETERXVOESPROC) myFuncLoader("glPointParameterxvOES");
          glPointSizexOES = (PFNGLPOINTSIZEXOESPROC) myFuncLoader("glPointSizexOES");
          glPolygonOffsetxOES = (PFNGLPOLYGONOFFSETXOESPROC) myFuncLoader("glPolygonOffsetxOES");
          glRotatexOES = (PFNGLROTATEXOESPROC) myFuncLoader("glRotatexOES");
          glScalexOES = (PFNGLSCALEXOESPROC) myFuncLoader("glScalexOES");
          glTexEnvxOES = (PFNGLTEXENVXOESPROC) myFuncLoader("glTexEnvxOES");
          glTexEnvxvOES = (PFNGLTEXENVXVOESPROC) myFuncLoader("glTexEnvxvOES");
          glTexParameterxOES = (PFNGLTEXPARAMETERXOESPROC) myFuncLoader("glTexParameterxOES");
          glTexParameterxvOES = (PFNGLTEXPARAMETERXVOESPROC) myFuncLoader("glTexParameterxvOES");
          glTranslatexOES = (PFNGLTRANSLATEXOESPROC) myFuncLoader("glTranslatexOES");

          return 1;
     } // end of loadExtFuncGL_OES_fixed_point()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_fixed_point
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_fixed_point(){
          glGetLightxvOES = (PFNGLGETLIGHTXVOESPROC) myFuncLoader("glGetLightxvOES");
          glGetMaterialxvOES = (PFNGLGETMATERIALXVOESPROC) myFuncLoader("glGetMaterialxvOES");
          glPointParameterxOES = (PFNGLPOINTPARAMETERXOESPROC) myFuncLoader("glPointParameterxOES");
          glSampleCoveragexOES = (PFNGLSAMPLECOVERAGEXOESPROC) myFuncLoader("glSampleCoveragexOES");

          return 1;
     } // end of loadExtFuncGL_OES_fixed_point()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_framebuffer_object
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_framebuffer_object(){
          glIsRenderbufferOES = (PFNGLISRENDERBUFFEROESPROC) myFuncLoader("glIsRenderbufferOES");
          glBindRenderbufferOES = (PFNGLBINDRENDERBUFFEROESPROC) myFuncLoader("glBindRenderbufferOES");
          glDeleteRenderbuffersOES = (PFNGLDELETERENDERBUFFERSOESPROC) myFuncLoader("glDeleteRenderbuffersOES");
          glGenRenderbuffersOES = (PFNGLGENRENDERBUFFERSOESPROC) myFuncLoader("glGenRenderbuffersOES");
          glRenderbufferStorageOES = (PFNGLRENDERBUFFERSTORAGEOESPROC) myFuncLoader("glRenderbufferStorageOES");
          glGetRenderbufferParameterivOES = (PFNGLGETRENDERBUFFERPARAMETERIVOESPROC) myFuncLoader("glGetRenderbufferParameterivOES");
          glIsFramebufferOES = (PFNGLISFRAMEBUFFEROESPROC) myFuncLoader("glIsFramebufferOES");
          glBindFramebufferOES = (PFNGLBINDFRAMEBUFFEROESPROC) myFuncLoader("glBindFramebufferOES");
          glDeleteFramebuffersOES = (PFNGLDELETEFRAMEBUFFERSOESPROC) myFuncLoader("glDeleteFramebuffersOES");
          glGenFramebuffersOES = (PFNGLGENFRAMEBUFFERSOESPROC) myFuncLoader("glGenFramebuffersOES");
          glCheckFramebufferStatusOES = (PFNGLCHECKFRAMEBUFFERSTATUSOESPROC) myFuncLoader("glCheckFramebufferStatusOES");
          glFramebufferRenderbufferOES = (PFNGLFRAMEBUFFERRENDERBUFFEROESPROC) myFuncLoader("glFramebufferRenderbufferOES");
          glFramebufferTexture2DOES = (PFNGLFRAMEBUFFERTEXTURE2DOESPROC) myFuncLoader("glFramebufferTexture2DOES");
          glGetFramebufferAttachmentParameterivOES = (PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVOESPROC) myFuncLoader("glGetFramebufferAttachmentParameterivOES");
          glGenerateMipmapOES = (PFNGLGENERATEMIPMAPOESPROC) myFuncLoader("glGenerateMipmapOES");

          return 1;
     } // end of loadExtFuncGL_OES_framebuffer_object()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_mapbuffer
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_OES_mapbuffer(){
          glMapBufferOES = (PFNGLMAPBUFFEROESPROC) myFuncLoader("glMapBufferOES");
          glMapBuffer = (PFNGLMAPBUFFERPROC) myFuncLoader("glMapBuffer");
          glUnmapBufferOES = (PFNGLUNMAPBUFFEROESPROC) myFuncLoader("glUnmapBufferOES");
          glUnmapBuffer = (PFNGLUNMAPBUFFERPROC) myFuncLoader("glUnmapBuffer");
          glGetBufferPointervOES = (PFNGLGETBUFFERPOINTERVOESPROC) myFuncLoader("glGetBufferPointervOES");
          glGetBufferPointerv = (PFNGLGETBUFFERPOINTERVPROC) myFuncLoader("glGetBufferPointerv");

          return 1;
     } // end of loadExtFuncGL_OES_mapbuffer()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_matrix_palette
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_matrix_palette(){
          glCurrentPaletteMatrixOES = (PFNGLCURRENTPALETTEMATRIXOESPROC) myFuncLoader("glCurrentPaletteMatrixOES");
          glLoadPaletteFromModelViewMatrixOES = (PFNGLLOADPALETTEFROMMODELVIEWMATRIXOESPROC) myFuncLoader("glLoadPaletteFromModelViewMatrixOES");
          glMatrixIndexPointerOES = (PFNGLMATRIXINDEXPOINTEROESPROC) myFuncLoader("glMatrixIndexPointerOES");
          glWeightPointerOES = (PFNGLWEIGHTPOINTEROESPROC) myFuncLoader("glWeightPointerOES");

          return 1;
     } // end of loadExtFuncGL_OES_matrix_palette()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_point_size_array
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_point_size_array(){
          glPointSizePointerOES = (PFNGLPOINTSIZEPOINTEROESPROC) myFuncLoader("glPointSizePointerOES");

          return 1;
     } // end of loadExtFuncGL_OES_point_size_array()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_query_matrix
  // API: gl|gles1
  /// =====================================
  static  int loadExtFuncGL_OES_query_matrix(){
          glQueryMatrixxOES = (PFNGLQUERYMATRIXXOESPROC) myFuncLoader("glQueryMatrixxOES");

          return 1;
     } // end of loadExtFuncGL_OES_query_matrix()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_single_precision
  // API: gl|gles1
  /// =====================================
  static  int loadExtFuncGL_OES_single_precision(){
          glClearDepthfOES = (PFNGLCLEARDEPTHFOESPROC) myFuncLoader("glClearDepthfOES");
          glClearDepthf = (PFNGLCLEARDEPTHFPROC) myFuncLoader("glClearDepthf");
          glClipPlanefOES = (PFNGLCLIPPLANEFOESPROC) myFuncLoader("glClipPlanefOES");
          glDepthRangefOES = (PFNGLDEPTHRANGEFOESPROC) myFuncLoader("glDepthRangefOES");
          glDepthRangef = (PFNGLDEPTHRANGEFPROC) myFuncLoader("glDepthRangef");
          glFrustumfOES = (PFNGLFRUSTUMFOESPROC) myFuncLoader("glFrustumfOES");
          glGetClipPlanefOES = (PFNGLGETCLIPPLANEFOESPROC) myFuncLoader("glGetClipPlanefOES");
          glOrthofOES = (PFNGLORTHOFOESPROC) myFuncLoader("glOrthofOES");

          return 1;
     } // end of loadExtFuncGL_OES_single_precision()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_texture_cube_map
  // API: gles1
  /// =====================================
  static  int loadExtFuncGL_OES_texture_cube_map(){
          glTexGenfOES = (PFNGLTEXGENFOESPROC) myFuncLoader("glTexGenfOES");
          glTexGenfvOES = (PFNGLTEXGENFVOESPROC) myFuncLoader("glTexGenfvOES");
          glTexGeniOES = (PFNGLTEXGENIOESPROC) myFuncLoader("glTexGeniOES");
          glTexGenivOES = (PFNGLTEXGENIVOESPROC) myFuncLoader("glTexGenivOES");
          glTexGenxOES = (PFNGLTEXGENXOESPROC) myFuncLoader("glTexGenxOES");
          glTexGenxvOES = (PFNGLTEXGENXVOESPROC) myFuncLoader("glTexGenxvOES");
          glGetTexGenfvOES = (PFNGLGETTEXGENFVOESPROC) myFuncLoader("glGetTexGenfvOES");
          glGetTexGenivOES = (PFNGLGETTEXGENIVOESPROC) myFuncLoader("glGetTexGenivOES");
          glGetTexGenxvOES = (PFNGLGETTEXGENXVOESPROC) myFuncLoader("glGetTexGenxvOES");

          return 1;
     } // end of loadExtFuncGL_OES_texture_cube_map()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_OES_vertex_array_object
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_OES_vertex_array_object(){
          glBindVertexArrayOES = (PFNGLBINDVERTEXARRAYOESPROC) myFuncLoader("glBindVertexArrayOES");
          glBindVertexArray = (PFNGLBINDVERTEXARRAYPROC) myFuncLoader("glBindVertexArray");
          glDeleteVertexArraysOES = (PFNGLDELETEVERTEXARRAYSOESPROC) myFuncLoader("glDeleteVertexArraysOES");
          glDeleteVertexArrays = (PFNGLDELETEVERTEXARRAYSPROC) myFuncLoader("glDeleteVertexArrays");
          glGenVertexArraysOES = (PFNGLGENVERTEXARRAYSOESPROC) myFuncLoader("glGenVertexArraysOES");
          glGenVertexArrays = (PFNGLGENVERTEXARRAYSPROC) myFuncLoader("glGenVertexArrays");
          glIsVertexArrayOES = (PFNGLISVERTEXARRAYOESPROC) myFuncLoader("glIsVertexArrayOES");
          glIsVertexArray = (PFNGLISVERTEXARRAYPROC) myFuncLoader("glIsVertexArray");

          return 1;
     } // end of loadExtFuncGL_OES_vertex_array_object()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_QCOM_driver_control
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_QCOM_driver_control(){
          glGetDriverControlsQCOM = (PFNGLGETDRIVERCONTROLSQCOMPROC) myFuncLoader("glGetDriverControlsQCOM");
          glGetDriverControlStringQCOM = (PFNGLGETDRIVERCONTROLSTRINGQCOMPROC) myFuncLoader("glGetDriverControlStringQCOM");
          glEnableDriverControlQCOM = (PFNGLENABLEDRIVERCONTROLQCOMPROC) myFuncLoader("glEnableDriverControlQCOM");
          glDisableDriverControlQCOM = (PFNGLDISABLEDRIVERCONTROLQCOMPROC) myFuncLoader("glDisableDriverControlQCOM");

          return 1;
     } // end of loadExtFuncGL_QCOM_driver_control()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_QCOM_extended_get
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_QCOM_extended_get(){
          glExtGetTexturesQCOM = (PFNGLEXTGETTEXTURESQCOMPROC) myFuncLoader("glExtGetTexturesQCOM");
          glExtGetBuffersQCOM = (PFNGLEXTGETBUFFERSQCOMPROC) myFuncLoader("glExtGetBuffersQCOM");
          glExtGetRenderbuffersQCOM = (PFNGLEXTGETRENDERBUFFERSQCOMPROC) myFuncLoader("glExtGetRenderbuffersQCOM");
          glExtGetFramebuffersQCOM = (PFNGLEXTGETFRAMEBUFFERSQCOMPROC) myFuncLoader("glExtGetFramebuffersQCOM");
          glExtGetTexLevelParameterivQCOM = (PFNGLEXTGETTEXLEVELPARAMETERIVQCOMPROC) myFuncLoader("glExtGetTexLevelParameterivQCOM");
          glExtTexObjectStateOverrideiQCOM = (PFNGLEXTTEXOBJECTSTATEOVERRIDEIQCOMPROC) myFuncLoader("glExtTexObjectStateOverrideiQCOM");
          glExtGetTexSubImageQCOM = (PFNGLEXTGETTEXSUBIMAGEQCOMPROC) myFuncLoader("glExtGetTexSubImageQCOM");
          glExtGetBufferPointervQCOM = (PFNGLEXTGETBUFFERPOINTERVQCOMPROC) myFuncLoader("glExtGetBufferPointervQCOM");

          return 1;
     } // end of loadExtFuncGL_QCOM_extended_get()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_QCOM_extended_get2
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_QCOM_extended_get2(){
          glExtGetShadersQCOM = (PFNGLEXTGETSHADERSQCOMPROC) myFuncLoader("glExtGetShadersQCOM");
          glExtGetProgramsQCOM = (PFNGLEXTGETPROGRAMSQCOMPROC) myFuncLoader("glExtGetProgramsQCOM");
          glExtIsProgramBinaryQCOM = (PFNGLEXTISPROGRAMBINARYQCOMPROC) myFuncLoader("glExtIsProgramBinaryQCOM");
          glExtGetProgramBinarySourceQCOM = (PFNGLEXTGETPROGRAMBINARYSOURCEQCOMPROC) myFuncLoader("glExtGetProgramBinarySourceQCOM");

          return 1;
     } // end of loadExtFuncGL_QCOM_extended_get2()

  /// ====================================
  // PFN_PROC Extensions functions Loader. 
  // Extension: GL_QCOM_tiled_rendering
  // API: gles1|gles2
  /// =====================================
  static  int loadExtFuncGL_QCOM_tiled_rendering(){
          glStartTilingQCOM = (PFNGLSTARTTILINGQCOMPROC) myFuncLoader("glStartTilingQCOM");
          glEndTilingQCOM = (PFNGLENDTILINGQCOMPROC) myFuncLoader("glEndTilingQCOM");

          return 1;
     } // end of loadExtFuncGL_QCOM_tiled_rendering()


  // Declaration of loadALL(), to call all PFN_PROC pointers 
 static int loadALL(){
         loadExtFuncGL_APPLE_copy_texture_levels();
         loadExtFuncGL_APPLE_framebuffer_multisample();
         loadExtFuncGL_APPLE_sync();
         loadExtFuncGL_EXT_discard_framebuffer();
         loadExtFuncGL_EXT_map_buffer_range();
         loadExtFuncGL_EXT_multi_draw_arrays();
         loadExtFuncGL_EXT_multisampled_render_to_texture();
         loadExtFuncGL_EXT_robustness();
         loadExtFuncGL_EXT_texture_storage();
         loadExtFuncGL_IMG_multisampled_render_to_texture();
         loadExtFuncGL_IMG_user_clip_plane();
         loadExtFuncGL_NV_fence();
         loadExtFuncGL_OES_EGL_image();
         loadExtFuncGL_OES_blend_equation_separate();
         loadExtFuncGL_OES_blend_func_separate();
         loadExtFuncGL_OES_blend_subtract();
         loadExtFuncGL_OES_draw_texture();
         loadExtFuncGL_OES_fixed_point();
         loadExtFuncGL_OES_framebuffer_object();
         loadExtFuncGL_OES_mapbuffer();
         loadExtFuncGL_OES_matrix_palette();
         loadExtFuncGL_OES_point_size_array();
         loadExtFuncGL_OES_query_matrix();
         loadExtFuncGL_OES_single_precision();
         loadExtFuncGL_OES_texture_cube_map();
         loadExtFuncGL_OES_vertex_array_object();
         loadExtFuncGL_QCOM_driver_control();
         loadExtFuncGL_QCOM_extended_get();
         loadExtFuncGL_QCOM_extended_get2();
         loadExtFuncGL_QCOM_tiled_rendering();
       return 1;
   } 
    
  */
  // end of JNI header

  static protected native void init(); /* 
    loadAll();
  */

  /** loading native stuff */
  static{
    init();
  }

	
	/**
	 * Private constructor
	 */
	private GLES11ExtPipeline(){}

	/**
	 * 
	 */
	private static Pipeline instance;
	
	/**
	 * Get a instance of this Pipeline implementation
	 * @return a live instance of GLES10EXT
	 */
	public static Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES11ExtPipeline();
		}        
        return instance;
    }


    

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glBlendEquationSeparateOES([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha )

     * */
    public void glBlendEquationSeparateOES(int modeRGB, int modeAlpha) {
        GLES11ExtPipeline.nGLBlendEquationSeparateOES(modeRGB, modeAlpha);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glBlendEquationSeparateOES([int modeRGB, int modeAlpha]);
     * 
     *  C function void glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha )

     * */
    private static native void nGLBlendEquationSeparateOES(int modeRGB, int modeAlpha);/*
         glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha );
         
//      if(glBlendEquationSeparateOES){
//         glBlendEquationSeparateOES((GLenum)  modeRGB, (GLenum)  modeAlpha );
//         return JNI_TRUE;
//      }else{
//         return JNI_FALSE;
//      }
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glBlendFuncSeparateOES([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparateOES((GLenum)  srcRGB, (GLenum)  dstRGB, (GLenum)  srcAlpha, (GLenum)  dstAlpha )

     * */
    public void glBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        GLES11ExtPipeline.nGLBlendFuncSeparateOES(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glBlendFuncSeparateOES([int srcRGB, int dstRGB, int srcAlpha, int dstAlpha]);
     * 
     *  C function void glBlendFuncSeparateOES((GLenum)  srcRGB, (GLenum)  dstRGB, (GLenum)  srcAlpha, (GLenum)  dstAlpha )

     * */
    private static native void nGLBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);/*
       glBlendFuncSeparateOES((GLenum)  srcRGB, (GLenum)  dstRGB, (GLenum)  srcAlpha, (GLenum)  dstAlpha );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glBlendEquationOES([int mode]);
     * 
     *  C function void glBlendEquationOES((GLenum)  mode )

     * */
    public void glBlendEquationOES(int mode) {
        GLES11ExtPipeline.nGLBlendEquationOES(mode);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glBlendEquationOES([int mode]);
     * 
     *  C function void glBlendEquationOES((GLenum)  mode )

     * */
    private static native void nGLBlendEquationOES(int mode);/*
        glBlendEquationOES((GLenum)  mode );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexsOES([short x, short y, short z, short width, short height]);
     * 
     *  C function void glDrawTexsOES((GLshort) x,(GLshort)  y, (GLshort)z, (GLshort) width, (GLshort) height )

     * */
    public void glDrawTexsOES(short x, short y, short z, short width, short height) {
        GLES11ExtPipeline.nGLDrawTexsOES(x, y, z, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexsOES([short x, short y, short z, short width, short height]);
     * 
     *  C function void glDrawTexsOES(GLshort x, (GLshort) y, (GLshort) z, (GLshort) width, (GLshort) height )

     * */
    private static native void nGLDrawTexsOES(short x, short y, short z, short width, short height);/*
       glDrawTexsOES((GLshort) x, (GLshort) y, (GLshort) z, (GLshort) width, (GLshort) height );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexiOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexiOES((GLint) x, (GLint) y, (GLint) z, (GLint) width, (GLint) height )

     * */
    public void glDrawTexiOES(int x, int y, int z, int width, int height) {
        GLES11ExtPipeline.nGLDrawTexiOES(x, y, z, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexiOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexiOES((GLint) x, (GLint) y, (GLint) z, (GLint) width, (GLint) height )

     * */
    private static native void nGLDrawTexiOES(int x, int y, int z, int width, int height);/*
       glDrawTexiOES((GLint) x, (GLint) y, (GLint) z, (GLint) width, (GLint) height );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexxOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexxOES ((GLfixed) x,(GLfixed) y,(GLfixed) z,(GLfixed) width,(GLfixed) height )

     * */
    public void glDrawTexxOES(int x, int y, int z, int width, int height) {
        GLES11ExtPipeline.nGLDrawTexxOES(x, y, z, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexxOES([int x, int y, int z, int width, int height]);
     * 
     *  C function void glDrawTexxOES ((GLfixed) x,(GLfixed) y,(GLfixed) z,(GLfixed) width,(GLfixed) height )

     * */
    private static native void nGLDrawTexxOES(int x, int y, int z, int width, int height);/*
        glDrawTexxOES ((GLfixed) x,(GLfixed) y,(GLfixed) z,(GLfixed) width,(GLfixed) height );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexsvOES([short[] coords, int offset]);
     * 
     *  C function void glDrawTexsvOES((GLshort *) coords )

     * */
    public void glDrawTexsvOES(short[] coords, int offset) {
        GLES11ExtPipeline.nGLDrawTexsvOES(coords, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexsvOES([short[] coords, int offset]);
     * 
     *  C function void glDrawTexsvOES((GLshort *) coords )

     * */
    private static native void nGLDrawTexsvOES(short[] coords, int offset);/*
      glDrawTexsvOES((GLshort *) (coords + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexsvOES([java.nio.ShortBuffer coords]);
     * 
     *  C function void glDrawTexsvOES((GLshort *) coords )

     * */
    public void glDrawTexsvOES(java.nio.ShortBuffer coords) {
        checkBuffer(coords, 1, "coords");
        int offset = getOffset(coords);
        if(coords.isDirect()){
            nGLDrawTexsvOES(coords, offset);
        }else{
            short[] array = coords.array();
            nGLDrawTexsvOES(array, offset);
        }
       //   GLES11ExtPipeline.nGLDrawTexsvOES(coords);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexsvOES([java.nio.ShortBuffer coords]);
     * 
     *  C function void glDrawTexsvOES((GLshort *) coords )

     * */
    private static native void nGLDrawTexsvOES(java.nio.ShortBuffer coords, int offset);/*
     glDrawTexsvOES((GLshort *) (coords + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexivOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexivOES(   (GLint *)coords )

     * */
    public void glDrawTexivOES(int[] coords, int offset) {
        checkArray(coords, offset, 5, "coords");
        GLES11ExtPipeline.nGLDrawTexivOES(coords, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexivOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexivOES(   (GLint *)coords )

     * */
    private static native void nGLDrawTexivOES(int[] coords, int offset);/*
      glDrawTexivOES((GLint *)(coords + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexivOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexivOES(   (GLint *)coords )

     * */
    public void glDrawTexivOES(java.nio.IntBuffer coords) {
        checkBuffer(coords, 5, "coords");
        int offset = getOffset(coords);
        if(coords.isDirect()){
            GLES11ExtPipeline.nGLDrawTexivOES(coords, offset);
        }else{
            int[] array = coords.array();
            GLES11ExtPipeline.nGLDrawTexivOES(array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexivOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexivOES(   (GLint *)coords )

     * */
    private static native void nGLDrawTexivOES(java.nio.IntBuffer coords, int offset);/*
       glDrawTexivOES((GLint *)(coords + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexxvOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexxvOES(   (GLfixed *)coords )

     * */
    public void glDrawTexxvOES(int[] coords, int offset) {
        checkArray(coords, offset, 5, "coords");
        GLES11ExtPipeline.nGLDrawTexxvOES(coords, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexxvOES([int[] coords, int offset]);
     * 
     *  C function void glDrawTexxvOES(   (GLfixed *)coords )

     * */
    private static native void nGLDrawTexxvOES(int[] coords, int offset);/*
         glDrawTexxvOES((GLfixed *)(coords + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexxvOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexxvOES(   (GLfixed *)coords )

     * */
    public void glDrawTexxvOES(java.nio.IntBuffer coords) {
        checkBuffer(coords, 5, "coords");
        int offset = getOffset(coords);
        if(coords.isDirect()){
            GLES11ExtPipeline.nGLDrawTexxvOES(coords, offset);
        }else{
            int[] array = coords.array();
            GLES11ExtPipeline.nGLDrawTexxvOES(array, offset);
        }
        //GLES11ExtPipeline.nGLDrawTexxvOES(coords);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexxvOES([java.nio.IntBuffer coords]);
     * 
     *  C function void glDrawTexxvOES(   (GLfixed *)coords )

     * */
    private static native void nGLDrawTexxvOES(java.nio.IntBuffer coords, int offset);/*
    glDrawTexxvOES((GLfixed *)(coords + offset));
*/

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexfOES([float x, float y, float z, float width, float height]);
     * 
     *  C function void glDrawTexfOES((GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) width, (GLfloat) height )

     * */
    public void glDrawTexfOES(float x, float y, float z, float width, float height) {
        GLES11ExtPipeline.nGLDrawTexfOES(x, y, z, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexfOES([float x, float y, float z, float width, float height]);
     * 
     *  C function void glDrawTexfOES((GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) width, (GLfloat) height )

     * */
    private static native void nGLDrawTexfOES(float x, float y, float z, float width, float height);/*
       glDrawTexfOES((GLfloat) x, (GLfloat) y, (GLfloat) z, (GLfloat) width, (GLfloat) height );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexfvOES([float[] coords, int offset]);
     * 
     *  C function void glDrawTexfvOES(   (GLfloat *)coords )

     * */
    public void glDrawTexfvOES(float[] coords, int offset) {
        checkArray(coords, offset, 5, "coords");
        GLES11ExtPipeline.nGLDrawTexfvOES(coords, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexfvOES([float[] coords, int offset]);
     * 
     *  C function void glDrawTexfvOES(   (GLfloat *)coords )

     * */
    private static native void nGLDrawTexfvOES(float[] coords, int offset);/*
       glDrawTexfvOES((GLfloat *)(coords + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDrawTexfvOES([java.nio.FloatBuffer coords]);
     * 
     *  C function void glDrawTexfvOES(   (GLfloat *)coords )

     * */
    public void glDrawTexfvOES(java.nio.FloatBuffer coords) {
        checkBuffer(coords, 5, "coords");
        int offset = getOffset(coords);
        if (coords.isDirect()) {
            GLES11ExtPipeline.nGLDrawTexfvOES(coords, offset);
        } else {
            float[] array = coords.array();
            GLES11ExtPipeline.nGLDrawTexfvOES(array, offset);
        }
        // GLES11ExtPipeline.nGLDrawTexfvOES(coords);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDrawTexfvOES([java.nio.FloatBuffer coords]);
     * 
     *  C function void glDrawTexfvOES(   (GLfloat *)coords )

     * */
    private static native void nGLDrawTexfvOES(java.nio.FloatBuffer coords, int offset);/*
       glDrawTexfvOES((GLfloat *)(coords + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glEGLImageTargetTexture2DOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetTexture2DOES((GLenum)  target, GLeglImageOES image )

     * */
    public void glEGLImageTargetTexture2DOES(int target, java.nio.Buffer image) {
        checkBuffer(image, 1, "image");       
        if(image.isDirect()){
            int offset = getOffset(image);
            nGLEGLImageTargetTexture2DOES(target, image, offset);
        }else{
            if(image instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)image;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLEGLImageTargetTexture2DOES(target, array, offset);
                return;
            }
            
            if(image instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)image;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLEGLImageTargetTexture2DOES(target, array, offset);
                return;
            }
            
            if(image instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)image;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLEGLImageTargetTexture2DOES(target, array, offset);
                return;
            }            
            throw new IllegalArgumentException("image has unsupported data format.");            
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glEGLImageTargetTexture2DOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetTexture2DOES((GLenum)  target, GLeglImageOES image )

     * */
    private static native void nGLEGLImageTargetTexture2DOES(int target, java.nio.Buffer image, int offset);/*    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    */

    private static native void nGLEGLImageTargetTexture2DOES(int target, byte[] image, int offset);/*    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    */
    
    private static native void nGLEGLImageTargetTexture2DOES(int target, int[] image, int offset);/*    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    */
    
    private static native void nGLEGLImageTargetTexture2DOES(int target, short[] image, int offset);/*    
        GLeglImageOES  imageOES = (GLeglImageOES)(image + offset);
        glEGLImageTargetTexture2DOES((GLenum)  target, imageOES);
    */
    
    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glEGLImageTargetRenderbufferStorageOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetRenderbufferStorageOES((GLenum)  target, GLeglImageOES image )

     * */
    public void glEGLImageTargetRenderbufferStorageOES(int target, java.nio.Buffer image) {
        checkBuffer(image, 0, "image");
        if(image.isDirect()){
            int offset = getOffset(image);
            nGLEGLImageTargetRenderbufferStorageOES(target, image, offset);
        }else{
            if(image instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)image;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLEGLImageTargetRenderbufferStorageOES(target, array, offset);
                return;
            }
            
            if(image instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)image;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLEGLImageTargetRenderbufferStorageOES(target, array, offset);
                return;
            }
            
            if(image instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)image;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLEGLImageTargetRenderbufferStorageOES(target, array, offset);
                return;
            }            
            throw new IllegalArgumentException("image has unsupported data format.");            
        }
        //GLES11ExtPipeline.nGLEGLImageTargetRenderbufferStorageOES(target, image);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glEGLImageTargetRenderbufferStorageOES([int target, java.nio.Buffer image]);
     * 
     *  C function void glEGLImageTargetRenderbufferStorageOES((GLenum)  target, GLeglImageOES image )

     * */
    private static native void nGLEGLImageTargetRenderbufferStorageOES(int target, java.nio.Buffer image, int offset);/*
         glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    */
    
    private static native void nGLEGLImageTargetRenderbufferStorageOES(int target, byte[] image, int offset);/*
    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    */
    
    private static native void nGLEGLImageTargetRenderbufferStorageOES(int target, short[] image, int offset);/*
    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    */

    private static native void nGLEGLImageTargetRenderbufferStorageOES(int target, int[] image, int offset);/*
    glEGLImageTargetRenderbufferStorageOES((GLenum)  target, (GLeglImageOES)(image + offset));
    */
    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glAlphaFuncxOES([int func, int ref]);
     * 
     *  C function void glAlphaFuncxOES((GLenum)  func, GLclampx ref )

     * */
    public void glAlphaFuncxOES(int func, int ref) {
        GLES11ExtPipeline.nGLAlphaFuncxOES(func, ref);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glAlphaFuncxOES([int func, int ref]);
     * 
     *  C function void glAlphaFuncxOES((GLenum)  func,  (GLclampx)  ref )
     * */
    private static native void nGLAlphaFuncxOES(int func, int ref);/*
       glAlphaFuncxOES((GLenum)  func,  (GLclampx)  ref );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClearColorxOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorxOES( (GLclampx)  red,  (GLclampx)  green,  (GLclampx)  blue,  (GLclampx)  alpha )

     * */
    public void glClearColorxOES(int red, int green, int blue, int alpha) {
        GLES11ExtPipeline.nGLClearColorxOES(red, green, blue, alpha);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClearColorxOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glClearColorxOES( (GLclampx)  red,  (GLclampx)  green,  (GLclampx)  blue,  (GLclampx)  alpha )

     * */
    private static native void nGLClearColorxOES(int red, int green, int blue, int alpha);/*
       glClearColorxOES( (GLclampx)  red,  (GLclampx)  green,  (GLclampx)  blue,  (GLclampx)  alpha );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClearDepthxOES([int depth]);
     * 
     *  C function void glClearDepthxOES( (GLclampx)  depth )

     * */
    public void glClearDepthxOES(int depth) {
        GLES11ExtPipeline.nGLClearDepthxOES(depth);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClearDepthxOES([int depth]);
     * 
     *  C function void glClearDepthxOES( (GLclampx)  depth )

     * */
    private static native void nGLClearDepthxOES(int depth);/*
      glClearDepthxOES( (GLclampx)  depth );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClipPlanexOES([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanexOES((GLenum)  plane,    (GLfixed *)equation )

     * */
    public void glClipPlanexOES(int plane, int[] equation, int offset) {
        checkArray(equation, offset, 4, "equation");
        GLES11ExtPipeline.nGLClipPlanexOES(plane, equation, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClipPlanexOES([int plane, int[] equation, int offset]);
     * 
     *  C function void glClipPlanexOES((GLenum)  plane,    (GLfixed *)equation )
     * */
    private static native void nGLClipPlanexOES(int plane, int[] equation, int offset);/*
     glClipPlanexOES((GLenum)  plane, (GLfixed *)(equation + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClipPlanexOES([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanexOES((GLenum)  plane,    (GLfixed *)equation )
     * */
    public void glClipPlanexOES(int plane, java.nio.IntBuffer equation) {
        checkBuffer(equation, 4, "equation");
        int offset = getOffset(equation);
        if(equation.isDirect()){
            nGLClipPlanexOES(plane, equation, offset);
        }else{
            int[] array = equation.array();
            nGLClipPlanexOES(plane, array, offset);
        }
       //  GLES11ExtPipeline.nGLClipPlanexOES(plane, equation);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClipPlanexOES([int plane, java.nio.IntBuffer equation]);
     * 
     *  C function void glClipPlanexOES((GLenum)  plane,    (GLfixed *)equation )
     * */
    private static native void nGLClipPlanexOES(int plane, java.nio.IntBuffer equation, int offset);/*
         glClipPlanexOES((GLenum)  plane, (GLfixed *)(equation + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glColor4xOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4xOES ((GLfixed) red,(GLfixed) green,(GLfixed) blue,(GLfixed) alpha )

     * */
    public void glColor4xOES(int red, int green, int blue, int alpha) {
        GLES11ExtPipeline.nGLColor4xOES(red, green, blue, alpha);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glColor4xOES([int red, int green, int blue, int alpha]);
     * 
     *  C function void glColor4xOES ((GLfixed) red,(GLfixed) green,(GLfixed) blue,(GLfixed) alpha )

     * */
    private static native void nGLColor4xOES(int red, int green, int blue, int alpha);/*
          glColor4xOES ((GLfixed) red,(GLfixed) green,(GLfixed) blue,(GLfixed) alpha );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDepthRangexOES([int zNear, int zFar]);
     * 
     *  C function void glDepthRangexOES( (GLclampx)  zNear,  (GLclampx)  zFar )

     * */
    public void glDepthRangexOES(int zNear, int zFar) {
        GLES11ExtPipeline.nGLDepthRangexOES(zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDepthRangexOES([int zNear, int zFar]);
     * 
     *  C function void glDepthRangexOES( (GLclampx)  zNear,  (GLclampx)  zFar )

     * */
    private static native void nGLDepthRangexOES(int zNear, int zFar);/*
       glDepthRangexOES( (GLclampx)  zNear,  (GLclampx)  zFar );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFogxOES([int pname, int param]);
     * 
     *  C function void glFogxOES((GLenum)  pname,(GLfixed) param )

     * */
    public void glFogxOES(int pname, int param) {
        GLES11ExtPipeline.nGLFogxOES(pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFogxOES([int pname, int param]);
     * 
     *  C function void glFogxOES((GLenum)  pname,(GLfixed) param )

     * */
    private static native void nGLFogxOES(int pname, int param);/*
      glFogxOES((GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFogxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxvOES((GLenum)  pname,    (GLfixed *)params )

     * */
    public void glFogxvOES(int pname, int[] params, int offset) {
        checkArray(params, offset, 1, "params");
        GLES11ExtPipeline.nGLFogxvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFogxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glFogxvOES((GLenum)  pname,    (GLfixed *)params )

     * */
    private static native void nGLFogxvOES(int pname, int[] params, int offset);/*
       glFogxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFogxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxvOES((GLenum)  pname,    (GLfixed *)params )

     * */
    public void glFogxvOES(int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, "params");
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLFogxvOES(pname, params, offset);
        }else{
            int[] array = params.array();
            nGLFogxvOES(pname, array, offset);
        }        
       // GLES11ExtPipeline.nGLFogxvOES(pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFogxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glFogxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLFogxvOES(int pname, java.nio.IntBuffer params, int offset);/*
         glFogxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFrustumxOES(
     * [int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumxOES((GLfixed) left, (GLfixed) right,
     *                                (GLfixed) bottom,(GLfixed) top,
     *                                (GLfixed) zNear,(GLfixed) zFar );
     * */
    public void glFrustumxOES(int left, int right, 
                              int bottom, int top, 
                              int zNear, int zFar) {
        GLES11ExtPipeline.nGLFrustumxOES(left, right, 
                                         bottom, top, 
                                         zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFrustumxOES(
     * [int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glFrustumxOES ((GLfixed) left,(GLfixed) right,
     *                                 (GLfixed) bottom,(GLfixed) top,
     *                                 (GLfixed) zNear,(GLfixed) zFar );
     * */
    private static native void nGLFrustumxOES(int left, int right, 
                                              int bottom, int top, 
                                              int zNear, int zFar);/*
       glFrustumxOES ((GLfixed) left,(GLfixed) right,
                      (GLfixed) bottom,(GLfixed) top,
                      (GLfixed) zNear,(GLfixed) zFar );
    */
    
    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetClipPlanexOES([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanexOES((GLenum)  pname, (GLfixed *)eqn )

     * */
    public void glGetClipPlanexOES(int pname, int[] eqn, int offset) {
        checkArray(eqn, offset, 4, "eqn");
        GLES11ExtPipeline.nGLGetClipPlanexOES(pname, eqn, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetClipPlanexOES([int pname, int[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanexOES((GLenum)  pname, (GLfixed *)eqn )

     * */
    private static native void nGLGetClipPlanexOES(int pname, int[] eqn, int offset);/*
    glGetClipPlanexOES((GLenum)  pname, (GLfixed *)(eqn + offset));
  */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetClipPlanexOES([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanexOES((GLenum)  pname, (GLfixed *)eqn )

     * */
    public void glGetClipPlanexOES(int pname, java.nio.IntBuffer eqn) {
        checkBuffer(eqn, 4, "eqn");
        int offset = getOffset(eqn);
        if(eqn.isDirect()){
            nGLGetClipPlanexOES(pname, eqn, offset);
        }else{
            int[] array = eqn.array();
            nGLGetClipPlanexOES(pname, array, offset);
        }
        //GLES11ExtPipeline.nGLGetClipPlanexOES(pname, eqn);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetClipPlanexOES([int pname, java.nio.IntBuffer eqn]);
     * 
     *  C function void glGetClipPlanexOES((GLenum)  pname, (GLfixed *)eqn )

     * */
    private static native void nGLGetClipPlanexOES(int pname, java.nio.IntBuffer eqn, int offset);/*
      glGetClipPlanexOES((GLenum)  pname, (GLfixed *)(eqn + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetFixedvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedvOES((GLenum)  pname, (GLfixed *)params )

     * */
    public void glGetFixedvOES(int pname, int[] params, int offset) {
        checkArray(params, offset, 1, "params");
        GLES11ExtPipeline.nGLGetFixedvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetFixedvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glGetFixedvOES((GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetFixedvOES(int pname, int[] params, int offset);/*
      glGetFixedvOES((GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetFixedvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedvOES((GLenum)  pname, (GLfixed *)params )

     * */
    public void glGetFixedvOES(int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, "params");
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLGetFixedvOES(pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetFixedvOES(pname, array, offset);
        }
        //GLES11ExtPipeline.nGLGetFixedvOES(pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetFixedvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFixedvOES((GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetFixedvOES(int pname, java.nio.IntBuffer params, int offset);/*
         glGetFixedvOES((GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)params )

     * */
    public void glGetLightxvOES(int light, int pname, int[] params, int offset) {      
        int needed = getNeededLight(pname);
        checkArray(params, offset, 1, "params");
        GLES11ExtPipeline.nGLGetLightxvOES(light, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetLightxvOES(int light, int pname, int[] params, int offset);/*
       glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)params )

     * */
    public void glGetLightxvOES(int light, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, "params");
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLGetLightxvOES(light, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetLightxvOES(light, pname, array, offset);
        }
        //GLES11ExtPipeline.nGLGetLightxvOES(light, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetLightxvOES(int light, int pname, java.nio.IntBuffer params, int offset);/*
       glGetLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetMaterialxvOES(int face, int pname, int[] params, int offset) {
        int needed = (pname == android.opengl.GLES11.GL_SHININESS) ? 1 : 4;
        checkArray(params, offset, needed, "params");
        GLES11ExtPipeline.nGLGetMaterialxvOES(face, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetMaterialxvOES(int face, int pname, int[] params, int offset);/*
            glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetMaterialxvOES(int face, int pname, java.nio.IntBuffer params) {
        int needed = (pname == android.opengl.GLES11.GL_SHININESS) ? 1 : 4;
        checkBuffer(params, needed, "params");
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLGetMaterialxvOES(face, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetMaterialxvOES(face, pname, array, offset);
        }        
       // GLES11ExtPipeline.nGLGetMaterialxvOES(face, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetMaterialxvOES(int face, int pname, java.nio.IntBuffer params, int offset);/*
       glGetMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset) );
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexEnvxvOES([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)params )

     * */
    public void glGetTexEnvxvOES(int envir, int pname, int[] params, int offset) {
        int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        GLES11ExtPipeline.nGLGetTexEnvxvOES(envir, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexEnvxvOES([int envir, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)params )

     * */
    private static native void nGLGetTexEnvxvOES(int envir, int pname, int[] params, int offset);/*
      glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexEnvxvOES([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetTexEnvxvOES(int envir, int pname, java.nio.IntBuffer params) {
       int needed = pname == android.opengl.GLES11.GL_TEXTURE_ENV_COLOR ? 4 : 1;
        checkBuffer(params, needed, "params");
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLGetTexEnvxvOES(envir, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetTexEnvxvOES(envir, pname, array, offset);
        }    
        //GLES11ExtPipeline.nGLGetTexEnvxvOES(envir, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexEnvxvOES([int envir, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetTexEnvxvOES(int envir, int pname, java.nio.IntBuffer params, int offset);/*
       glGetTexEnvxvOES((GLenum)  envir, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetTexParameterxvOES(int target, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLGetTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetTexParameterxvOES(int target, int pname, int[] params, int offset);/*
       glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
     */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetTexParameterxvOES(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, "params");
        int offset = getOffset(params);
        if (params.isDirect()){
            nGLGetTexParameterxvOES(target, pname, params, offset);
        }else{
         int[] array = params.array();
         nGLGetTexParameterxvOES(target, pname, array, offset);
        }
       // GLES11ExtPipeline.nGLGetTexParameterxvOES(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetTexParameterxvOES(int target, int pname, java.nio.IntBuffer params, int offset);/*
       glGetTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightModelxOES([int pname, int param]);
     * 
     *  C function void glLightModelxOES((GLenum)  pname,(GLfixed) param )
     * */
    public void glLightModelxOES(int pname, int param) {
        GLES11ExtPipeline.nGLLightModelxOES(pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightModelxOES([int pname, int param]);
     * 
     *  C function void glLightModelxOES((GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLLightModelxOES(int pname, int param);/*
       glLightModelxOES((GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightModelxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    public void glLightModelxvOES(int pname, int[] params, int offset) {
        int needed = getNeededLight(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11ExtPipeline.nGLLightModelxvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightModelxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glLightModelxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLLightModelxvOES(int pname, int[] params, int offset);/*
       glLightModelxvOES((GLenum)  pname,    (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightModelxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    public void glLightModelxvOES(int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLLightModelxvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightModelxvOES([int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightModelxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLLightModelxvOES(int pname, java.nio.IntBuffer params, int offset);/*
       glLightModelxvOES((GLenum)  pname,    (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightxOES([int light, int pname, int param]);
     * 
     *  C function void glLightxOES((GLenum)  light, (GLenum)  pname,(GLfixed) param )
     * */
    public void glLightxOES(int light, int pname, int param) {
        GLES11ExtPipeline.nGLLightxOES(light, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightxOES([int light, int pname, int param]);
     * 
     *  C function void glLightxOES((GLenum)  light, (GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLLightxOES(int light, int pname, int param);/*
      glLightxOES((GLenum)  light, (GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxvOES((GLenum)  light, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glLightxvOES(int light, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLLightxvOES(light, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightxvOES([int light, int pname, int[] params, int offset]);
     * 
     *  C function void glLightxvOES((GLenum)  light, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLLightxvOES(int light, int pname, int[] params, int offset);/*
        glLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxvOES((GLenum)  light, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glLightxvOES(int light, int pname, java.nio.IntBuffer params) {
        
        checkBuffer(params, getNeededLight(pname), "params");
        int offset = getOffset(params);
        if (params.isDirect()){
            nGLLightxvOES(light, pname, params, offset);
        }else{
         int[] array = params.array();
         nGLLightxvOES(light, pname, array, offset);
        }
        //GLES11ExtPipeline.nGLLightxvOES(light, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLightxvOES([int light, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glLightxvOES((GLenum)  light, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLLightxvOES(int light, int pname, java.nio.IntBuffer params, int offset);/*
       glLightxvOES((GLenum)  light, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLineWidthxOES([int width]);
     * 
     *  C function void glLineWidthxOES ((GLfixed) width )
     * */
    public void glLineWidthxOES(int width) {
        GLES11ExtPipeline.nGLLineWidthxOES(width);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLineWidthxOES([int width]);
     * 
     *  C function void glLineWidthxOES ((GLfixed) width )
     * */
    private static native void nGLLineWidthxOES(int width);/*
     glLineWidthxOES ((GLfixed) width );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLoadMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixxOES(   (GLfixed *)m )
     * */
    public void glLoadMatrixxOES(int[] m, int offset) {
        checkArray(m, offset, 16, "m");
        GLES11ExtPipeline.nGLLoadMatrixxOES(m, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLoadMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glLoadMatrixxOES(   (GLfixed *)m )
     * */
    private static native void nGLLoadMatrixxOES(int[] m, int offset);/*
         glLoadMatrixxOES(   (GLfixed *)(m + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLoadMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixxOES(   (GLfixed *)m )
     * */
    public void glLoadMatrixxOES(java.nio.IntBuffer m) {
        
        checkBuffer(m, 16, "m");
        int offset = getOffset(m);
        if (m.isDirect()){
            nGLLoadMatrixxOES(m, offset);
        }else{
         int[] array = m.array();
         nGLLoadMatrixxOES(array, offset);
        }
        //GLES11ExtPipeline.nGLLoadMatrixxOES(m, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLoadMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glLoadMatrixxOES(   (GLfixed *)m )
     * */
    private static native void nGLLoadMatrixxOES(java.nio.IntBuffer m, int offset);/*
       glLoadMatrixxOES(   (GLfixed *)(m + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMaterialxOES([int face, int pname, int param]);
     * 
     *  C function void glMaterialxOES((GLenum)  face, (GLenum)  pname,(GLfixed) param )
     * */
    public void glMaterialxOES(int face, int pname, int param) {
        GLES11ExtPipeline.nGLMaterialxOES(face, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMaterialxOES([int face, int pname, int param]);
     * 
     *  C function void glMaterialxOES((GLenum)  face, (GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLMaterialxOES(int face, int pname, int param);/*
       glMaterialxOES((GLenum)  face, (GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxvOES((GLenum)  face, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glMaterialxvOES(int face, int pname, int[] params, int offset) {
        int needed = getNeededMaterial(pname);
        checkArray(params, offset, needed, PARAMS);
        GLES11ExtPipeline.nGLMaterialxvOES(face, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMaterialxvOES([int face, int pname, int[] params, int offset]);
     * 
     *  C function void glMaterialxvOES((GLenum)  face, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLMaterialxvOES(int face, int pname, int[] params, int offset);/*
       glMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxvOES((GLenum)  face, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glMaterialxvOES(int face, int pname, java.nio.IntBuffer params) {
        int needed = getNeededMaterial(pname);
        checkBuffer(params, needed, "params");
        int offset = getOffset(params);
        if (params.isDirect()){
            nGLMaterialxvOES(face, pname, params, offset);
        }else{
         int[] array = params.array();
         nGLMaterialxvOES(face, pname, array, offset);
        }
        //GLES11ExtPipeline.nGLMaterialxvOES(face, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMaterialxvOES([int face, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glMaterialxvOES((GLenum)  face, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLMaterialxvOES(int face, int pname, java.nio.IntBuffer params, int offset);/*
      glMaterialxvOES((GLenum)  face, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMultMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glMultMatrixxOES(   (GLfixed *)m )
     * */
    public void glMultMatrixxOES(int[] m, int offset) {
        checkArray(m, offset, 16, "m");
        GLES11ExtPipeline.nGLMultMatrixxOES(m, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMultMatrixxOES([int[] m, int offset]);
     * 
     *  C function void glMultMatrixxOES(   (GLfixed *)m )
     * */
    private static native void nGLMultMatrixxOES(int[] m, int offset);/*
    glMultMatrixxOES(   (GLfixed *)(m + offset));    
 */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMultMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixxOES(   (GLfixed *)m )
     * */
    public void glMultMatrixxOES(java.nio.IntBuffer m) {
        checkBuffer(m, 16, "m");
        int offset = getOffset(m);
        if (m.isDirect()){
            nGLMultMatrixxOES(m, offset);
        }else{
         int[] array = m.array();
         nGLMultMatrixxOES(array, offset);
        }        
        //GLES11ExtPipeline.nGLMultMatrixxOES(m);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMultMatrixxOES([java.nio.IntBuffer m]);
     * 
     *  C function void glMultMatrixxOES(   (GLfixed *)m )
     * */
    private static native void nGLMultMatrixxOES(java.nio.IntBuffer m, int offset);/*
       glMultMatrixxOES(   (GLfixed *)(m + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMultiTexCoord4xOES([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4xOES((GLenum)  target,(GLfixed) s,(GLfixed) t,(GLfixed) r,(GLfixed) q )
     * */
    public void glMultiTexCoord4xOES(int target, int s, int t, int r, int q) {
        GLES11ExtPipeline.nGLMultiTexCoord4xOES(target, s, t, r, q);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMultiTexCoord4xOES([int target, int s, int t, int r, int q]);
     * 
     *  C function void glMultiTexCoord4xOES((GLenum)  target,(GLfixed) s,(GLfixed) t,(GLfixed) r,(GLfixed) q )
     * */
    private static native void nGLMultiTexCoord4xOES(int target, int s, int t, int r, int q);/*
       glMultiTexCoord4xOES((GLenum)  target,(GLfixed) s,(GLfixed) t,(GLfixed) r,(GLfixed) q );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glNormal3xOES([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3xOES ((GLfixed) nx,(GLfixed) ny,(GLfixed) nz )
     * */
    public void glNormal3xOES(int nx, int ny, int nz) {
        GLES11ExtPipeline.nGLNormal3xOES(nx, ny, nz);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glNormal3xOES([int nx, int ny, int nz]);
     * 
     *  C function void glNormal3xOES ((GLfixed) nx,(GLfixed) ny,(GLfixed) nz )
     * */
    private static native void nGLNormal3xOES(int nx, int ny, int nz);/*
       glNormal3xOES ((GLfixed) nx,(GLfixed) ny,(GLfixed) nz );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glOrthoxOES([int left, int right, 
     *                                                       int bottom, int top, 
     *                                                       int zNear, int zFar]);
     * 
     *  C function void glOrthoxOES ((GLfixed) left,(GLfixed) right,
     *                               (GLfixed) bottom,(GLfixed) top,
     *                               (GLfixed) zNear,(GLfixed) zFar )
     * */
    public void glOrthoxOES(int left, int right, int bottom, int top, int zNear, int zFar) {
        GLES11ExtPipeline.nGLOrthoxOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glOrthoxOES([int left, int right, int bottom, int top, int zNear, int zFar]);
     * 
     *  C function void glOrthoxOES ((GLfixed) left,(GLfixed) right,
     *                               (GLfixed) bottom,(GLfixed) top,
     *                               (GLfixed) zNear,(GLfixed) zFar );
     * */
    private static native void nGLOrthoxOES( int left, int right, 
                                             int bottom, int top, 
                                             int zNear, int zFar);/*
       glOrthoxOES ((GLfixed) left,(GLfixed) right,
                    (GLfixed) bottom,(GLfixed) top,
                    (GLfixed) zNear,(GLfixed) zFar );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glPointParameterxOES([int pname, int param]);
     * 
     *  C function void glPointParameterxOES((GLenum)  pname,(GLfixed) param )
     * */
    public void glPointParameterxOES(int pname, int param) {
        GLES11ExtPipeline.nGLPointParameterxOES(pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glPointParameterxOES([int pname, int param]);
     * 
     *  C function void glPointParameterxOES((GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLPointParameterxOES(int pname, int param);/*
       glPointParameterxOES((GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glPointParameterxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    public void glPointParameterxvOES(int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLPointParameterxvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glPointParameterxvOES([int pname, int[] params, int offset]);
     * 
     *  C function void glPointParameterxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLPointParameterxvOES(int pname, int[] params, int offset);/*
         glPointParameterxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glPointParameterxvOES(
     * [int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    public void glPointParameterxvOES(int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLPointParameterxvOES(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glPointParameterxvOES(
     * [int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glPointParameterxvOES((GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLPointParameterxvOES(int pname, 
                                                      java.nio.IntBuffer params, int offset);/*
       glPointParameterxvOES((GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glPointSizexOES([int size]);
     * 
     *  C function void glPointSizexOES ((GLfixed) size )
     * */
    public void glPointSizexOES(int size) {
        GLES11ExtPipeline.nGLPointSizexOES(size);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glPointSizexOES([int size]);
     * 
     *  C function void glPointSizexOES ((GLfixed) size )
     * */
    private static native void nGLPointSizexOES(int size);/*
      glPointSizexOES ((GLfixed) size );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glPolygonOffsetxOES([int factor, int units]);
     * 
     *  C function void glPolygonOffsetxOES ((GLfixed) factor,(GLfixed) units )
     * */
    public void glPolygonOffsetxOES(int factor, int units) {
        GLES11ExtPipeline.nGLPolygonOffsetxOES(factor, units);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glPolygonOffsetxOES([int factor, int units]);
     * 
     *  C function void glPolygonOffsetxOES ((GLfixed) factor,(GLfixed) units )
     * */
    private static native void nGLPolygonOffsetxOES(int factor, int units);/*
       glPolygonOffsetxOES ((GLfixed) factor,(GLfixed) units );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glRotatexOES([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatexOES ((GLfixed) angle,(GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    public void glRotatexOES(int angle, int x, int y, int z) {
        GLES11ExtPipeline.nGLRotatexOES(angle, x, y, z);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glRotatexOES([int angle, int x, int y, int z]);
     * 
     *  C function void glRotatexOES ((GLfixed) angle,(GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    private static native void nGLRotatexOES(int angle, int x, int y, int z);/*
     glRotatexOES ((GLfixed) angle,(GLfixed) x,(GLfixed) y,(GLfixed) z );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glSampleCoveragexOES([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragexOES( (GLclampx)  value, (GLboolean) invert )
     * */
    public void glSampleCoveragexOES(int value, boolean invert) {
        GLES11ExtPipeline.nGLSampleCoveragexOES(value, invert);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glSampleCoveragexOES([int value, boolean invert]);
     * 
     *  C function void glSampleCoveragexOES( (GLclampx)  value, (GLboolean) invert )
     * */
    private static native void nGLSampleCoveragexOES(int value, boolean invert);/*
       glSampleCoveragexOES( (GLclampx)  value, (GLboolean) invert );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glScalexOES([int x, int y, int z]);
     * 
     *  C function void glScalexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    public void glScalexOES(int x, int y, int z) {
        GLES11ExtPipeline.nGLScalexOES(x, y, z);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glScalexOES([int x, int y, int z]);
     * 
     *  C function void glScalexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    private static native void nGLScalexOES(int x, int y, int z);/*
      glScalexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexEnvxOES([int target, int pname, int param]);
     * 
     *  C function void glTexEnvxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param )
     * */
    public void glTexEnvxOES(int target, int pname, int param) {
        GLES11ExtPipeline.nGLTexEnvxOES(target, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexEnvxOES([int target, int pname, int param]);
     * 
     *  C function void glTexEnvxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLTexEnvxOES(int target, int pname, int param);/*
       glTexEnvxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexEnvxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glTexEnvxvOES(int target, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLTexEnvxvOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexEnvxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexEnvxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLTexEnvxvOES(int target, int pname, int[] params, int offset);/*
        glTexEnvxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexEnvxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glTexEnvxvOES(int target, int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLTexEnvxvOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexEnvxvOES(
     * [int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexEnvxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLTexEnvxvOES(int target, 
                                              int pname, 
                                              java.nio.IntBuffer params, int offset);/*
       glTexEnvxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexParameterxOES([int target, int pname, int param]);
     * 
     *  C function void glTexParameterxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param )
     * */
    public void glTexParameterxOES(int target, int pname, int param) {
        GLES11ExtPipeline.nGLTexParameterxOES(target, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexParameterxOES([int target, int pname, int param]);
     * 
     *  C function void glTexParameterxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param )
     * */
    private static native void nGLTexParameterxOES(int target, int pname, int param);/*
      glTexParameterxOES((GLenum)  target, (GLenum)  pname,(GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glTexParameterxvOES(int target, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glTexParameterxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLTexParameterxvOES(int target, int pname, int[] params, int offset);/*
    glTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
 */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    public void glTexParameterxvOES(int target, int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLTexParameterxvOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexParameterxvOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexParameterxvOES((GLenum)  target, (GLenum)  pname,    (GLfixed *)params )
     * */
    private static native void nGLTexParameterxvOES(int target, int pname, java.nio.IntBuffer params, int offset);/*
       glTexParameterxvOES((GLenum)  target, (GLenum)  pname, (GLfixed *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTranslatexOES([int x, int y, int z]);
     * 
     *  C function void glTranslatexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    public void glTranslatexOES(int x, int y, int z) {
        GLES11ExtPipeline.nGLTranslatexOES(x, y, z);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTranslatexOES([int x, int y, int z]);
     * 
     *  C function void glTranslatexOES ((GLfixed) x,(GLfixed) y,(GLfixed) z )
     * */
    private static native void nGLTranslatexOES(int x, int y, int z);/*
           glTranslatexOES((GLfixed) x, (GLfixed) y, (GLfixed) z );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glIsRenderbufferOES([int renderbuffer]);
     * 
     *  C function (GLboolean) glIsRenderbufferOES((GLuint)  renderbuffer )
     * */
    public boolean glIsRenderbufferOES(int renderbuffer) {
       return GLES11ExtPipeline.nGLIsRenderbufferOES(renderbuffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glIsRenderbufferOES([int renderbuffer]);
     * 
     *  C function (GLboolean) glIsRenderbufferOES((GLuint)  renderbuffer )
     * */
    private static native boolean nGLIsRenderbufferOES(int renderbuffer);/*
            return (jboolean)  glIsRenderbufferOES((GLuint)  renderbuffer );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glBindRenderbufferOES([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbufferOES((GLenum)  target, (GLuint)  renderbuffer )
     * */
    public void glBindRenderbufferOES(int target, int renderbuffer) {
         GLES11ExtPipeline.nGLBindRenderbufferOES(target, renderbuffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glBindRenderbufferOES([int target, int renderbuffer]);
     * 
     *  C function void glBindRenderbufferOES((GLenum)  target, (GLuint)  renderbuffer )
     * */
    private static native void nGLBindRenderbufferOES(int target, int renderbuffer);/*
       glBindRenderbufferOES((GLenum)  target, (GLuint)  renderbuffer );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDeleteRenderbuffersOES([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffersOES((GLsizei) n,    (GLuint)  *renderbuffers )
     * */
    public void glDeleteRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        GLES11ExtPipeline.nGLDeleteRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDeleteRenderbuffersOES([int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glDeleteRenderbuffersOES((GLsizei) n,    (GLuint)  *renderbuffers )
     * */
    private static native void nGLDeleteRenderbuffersOES(int n, int[] renderbuffers, int offset);/*
         glDeleteRenderbuffersOES((GLsizei) n, (GLuint  *)(renderbuffers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDeleteRenderbuffersOES([int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffersOES((GLsizei) n,    (GLuint)  *renderbuffers )
     * */
    public void glDeleteRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers) {
        int offset = getOffset(renderbuffers);
        GLES11ExtPipeline.nGLDeleteRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDeleteRenderbuffersOES(
     * [int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glDeleteRenderbuffersOES((GLsizei) n,    (GLuint)  *renderbuffers )
     * */
    private static native void nGLDeleteRenderbuffersOES(int n, 
                                                         java.nio.IntBuffer renderbuffers, 
                                                         int offset);/*
       glDeleteRenderbuffersOES((GLsizei) n, (GLuint  *)(renderbuffers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGenRenderbuffersOES(
     * [int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffersOES((GLsizei) n, (GLuint)  *renderbuffers )
     * */
    public void glGenRenderbuffersOES(int n, int[] renderbuffers, int offset) {
        GLES11ExtPipeline.nGLGenRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGenRenderbuffersOES(
     * [int n, int[] renderbuffers, int offset]);
     * 
     *  C function void glGenRenderbuffersOES((GLsizei) n, (GLuint)  *renderbuffers )
     * */
    private static native void nGLGenRenderbuffersOES(int n, int[] renderbuffers, int offset);/*
         glGenRenderbuffersOES((GLsizei) n, (GLuint *)(renderbuffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGenRenderbuffersOES(
     * [int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffersOES((GLsizei) n, (GLuint)  *renderbuffers )
     * */
    public void glGenRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers) {
        int offset = getOffset(renderbuffers);
        checkBuffer(renderbuffers, n, "renderbuffers");
        GLES11ExtPipeline.nGLGenRenderbuffersOES(n, renderbuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGenRenderbuffersOES(
     * [int n, java.nio.IntBuffer renderbuffers]);
     * 
     *  C function void glGenRenderbuffersOES((GLsizei) n, (GLuint)  *renderbuffers )
     * */
    private static native void nGLGenRenderbuffersOES(int n, 
                                                      java.nio.IntBuffer renderbuffers, int offset);/*
       glGenRenderbuffersOES((GLsizei) n, (GLuint *)(renderbuffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glRenderbufferStorageOES(
     * [int target, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageOES((GLenum)  target, 
     *                                           (GLenum)  internalformat, 
     *                                           (GLsizei) width, (GLsizei) height )
     * */
    public void glRenderbufferStorageOES(int target, int internalformat, int width, int height) {
        GLES11ExtPipeline.nGLRenderbufferStorageOES(target, internalformat, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glRenderbufferStorageOES([int target, 
     *                                                                  int internalformat, 
     *                                                                  int width, int height]);
     * 
     *  C function void glRenderbufferStorageOES((GLenum)  target, 
     *                                           (GLenum)  internalformat, 
     *                                           (GLsizei) width, (GLsizei) height );
     * */
    private static native void nGLRenderbufferStorageOES(int target, int internalformat, int width, int height);/*
       glRenderbufferStorageOES((GLenum)  target, (GLenum)  internalformat, (GLsizei) width, (GLsizei) height );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)params )
     * */
    public void glGetRenderbufferParameterivOES(int target, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLGetRenderbufferParameterivOES(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)params )
     * */
    private static native void nGLGetRenderbufferParameterivOES(int target, int pname, int[] params, int offset);/*
      glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)(params + offset));
   */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)params )
     * */
    public void glGetRenderbufferParameterivOES(int target, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if(params.isDirect()){
            nGLGetRenderbufferParameterivOES(target, pname, params, offset);
        }else{
            int[] array = params.array();
            nGLGetRenderbufferParameterivOES(target, pname, array, offset);
        }
        //GLES11ExtPipeline.nGLGetRenderbufferParameterivOES(target, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetRenderbufferParameterivOES([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)params )
     * */
    private static native void nGLGetRenderbufferParameterivOES(int target, int pname, java.nio.IntBuffer params, int offset);/*
         glGetRenderbufferParameterivOES((GLenum)  target, (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glIsFramebufferOES([int framebuffer]);
     * 
     *  C function (GLboolean) glIsFramebufferOES((GLuint)  framebuffer )
     * */
    public boolean glIsFramebufferOES(int framebuffer) {
        return GLES11ExtPipeline.nGLIsFramebufferOES(framebuffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glIsFramebufferOES([int framebuffer]);
     * 
     *  C function (GLboolean) glIsFramebufferOES((GLuint) framebuffer)
     * */
    private static native boolean nGLIsFramebufferOES(int framebuffer);/*
          return (jboolean) glIsFramebufferOES((GLuint)  framebuffer );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glBindFramebufferOES([int target, int framebuffer]);
     * 
     *  C function void glBindFramebufferOES((GLenum)  target, (GLuint)  framebuffer )
     * */
    public void glBindFramebufferOES(int target, int framebuffer) {
        GLES11ExtPipeline.nGLBindFramebufferOES(target, framebuffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glBindFramebufferOES([int target, int framebuffer]);
     * 
     *  C function void glBindFramebufferOES((GLenum)  target, (GLuint)  framebuffer )
     * */
    private static native void nGLBindFramebufferOES(int target, int framebuffer);/*
     glBindFramebufferOES((GLenum)  target, (GLuint)  framebuffer );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDeleteFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffersOES((GLsizei) n,    (GLuint)  *framebuffers )
     * */
    public void glDeleteFramebuffersOES(int n, int[] framebuffers, int offset) {
        GLES11ExtPipeline.nGLDeleteFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDeleteFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glDeleteFramebuffersOES((GLsizei) n,    (GLuint)  *framebuffers )
     * */
    private static native void nGLDeleteFramebuffersOES(int n, int[] framebuffers, int offset);/*
      glDeleteFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDeleteFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffersOES((GLsizei) n,    (GLuint)  *framebuffers )
     * */
    public void glDeleteFramebuffersOES(int n, java.nio.IntBuffer framebuffers) {
        checkBuffer(framebuffers, n, "framebuffers");
        int offset = getOffset(framebuffers);
        if(framebuffers.isDirect()){
            nGLDeleteFramebuffersOES(n, framebuffers, offset);
        }else{
            int[] array = framebuffers.array();
            nGLDeleteFramebuffersOES(n, array, offset);
        }
        
        
        //GLES11ExtPipeline.nGLDeleteFramebuffersOES(n, framebuffers);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDeleteFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glDeleteFramebuffersOES((GLsizei) n,    (GLuint)  *framebuffers )
     * */
    private static native void nGLDeleteFramebuffersOES(int n, java.nio.IntBuffer framebuffers, int offset);/*
       glDeleteFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGenFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffersOES((GLsizei) n, (GLuint)  *framebuffers )
     * */
    public void glGenFramebuffersOES(int n, int[] framebuffers, int offset) {
        checkArray(framebuffers, offset, n, "framebuffer");
        GLES11ExtPipeline.nGLGenFramebuffersOES(n, framebuffers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGenFramebuffersOES([int n, int[] framebuffers, int offset]);
     * 
     *  C function void glGenFramebuffersOES((GLsizei) n, (GLuint)  *framebuffers )
     * */
    private static native void nGLGenFramebuffersOES(int n, int[] framebuffers, int offset);/*
        glGenFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGenFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffersOES((GLsizei) n, (GLuint)  *framebuffers )
     * */
    public void glGenFramebuffersOES(int n, java.nio.IntBuffer framebuffers) {
        checkBuffer(framebuffers, 1, "framebuffers");
        int offset = getOffset(framebuffers);
        if(framebuffers.isDirect()){
            GLES11ExtPipeline.nGLGenFramebuffersOES(n, framebuffers, offset);
        }else{
            int[] array = framebuffers.array();
            GLES11ExtPipeline.nGLGenFramebuffersOES(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGenFramebuffersOES([int n, java.nio.IntBuffer framebuffers]);
     * 
     *  C function void glGenFramebuffersOES((GLsizei) n, (GLuint)  *framebuffers )
     * */
    private static native void nGLGenFramebuffersOES(int n, java.nio.IntBuffer framebuffers, int offset);/*
        glGenFramebuffersOES((GLsizei) n, (GLuint *)(framebuffers + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glCheckFramebufferStatusOES([int target]);
     * 
     *  C function (GLenum)  glCheckFramebufferStatusOES((GLenum)  target )
     * */
    public int glCheckFramebufferStatusOES(int target) {
       return GLES11ExtPipeline.nGLCheckFramebufferStatusOES(target);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glCheckFramebufferStatusOES([int target]);
     * 
     *  C function (GLenum)  glCheckFramebufferStatusOES((GLenum)  target )
     * */
    private static native int nGLCheckFramebufferStatusOES(int target);/*
       return (jint) glCheckFramebufferStatusOES((GLenum)  target );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFramebufferRenderbufferOES([int target, int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbufferOES((GLenum)  target, 
     *                                               (GLenum)  attachment, 
     *                                               (GLenum)  renderbuffertarget, 
     *                                               (GLuint)  renderbuffer );
     * */
    public void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GLES11ExtPipeline.nGLFramebufferRenderbufferOES(target, attachment, renderbuffertarget, renderbuffer);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFramebufferRenderbufferOES([int target, 
     * int attachment, int renderbuffertarget, int renderbuffer]);
     * 
     *  C function void glFramebufferRenderbufferOES((GLenum)  target, 
     *                                               (GLenum)  attachment, 
     *                                               (GLenum)  renderbuffertarget, 
     *                                               (GLuint)  renderbuffer )
     * */
    private static native void
            nGLFramebufferRenderbufferOES(int target,
                                          int attachment,
                                          int renderbuffertarget,
                                          int renderbuffer);/*
       glFramebufferRenderbufferOES((GLenum)  target, 
                                     (GLenum)  attachment, 
                                     (GLenum)  renderbuffertarget, 
                                     (GLuint)  renderbuffer );                             
      */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFramebufferTexture2DOES([int target, int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2DOES((GLenum)  target, (GLenum)  attachment, (GLenum)  textarget, (GLuint)  texture, (GLint) level )

     * */
    public void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level) {
        GLES11ExtPipeline.nGLFramebufferTexture2DOES(target, attachment, textarget, texture, level);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFramebufferTexture2DOES([int target, 
     * int attachment, int textarget, int texture, int level]);
     * 
     *  C function void glFramebufferTexture2DOES((GLenum)  target, 
     *                                            (GLenum)  attachment, 
     *                                            (GLenum)  textarget, 
     *                                            (GLuint)  texture, 
     *                                            (GLint) level );
     * */
    private static native void nGLFramebufferTexture2DOES(int target,
                                                          int attachment,
                                                          int textarget,
                                                          int texture,
                                                          int level);/*
       glFramebufferTexture2DOES((GLenum)  target, 
                                 (GLenum)  attachment, 
                                 (GLenum)  textarget, 
                                 (GLuint)  texture, 
                                 (GLint) level );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES([int target, 
     *           int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
     *                                                           (GLenum)  attachment, 
     *                                                           (GLenum)  pname, 
     *                                                           (GLint *)params )
     * */
    public void glGetFramebufferAttachmentParameterivOES(int target, 
                                                         int attachment, 
                                                         int pname, 
                                                         int[] params, int offset) {
        GLES11ExtPipeline.nGLGetFramebufferAttachmentParameterivOES(target, attachment, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES([int target, 
     *                                       int attachment, int pname, int[] params, int offset]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
     *                                                           (GLenum)  attachment, 
     *                                                           (GLenum)  pname, 
     *                                                           (GLint *)params )
     * */
    private static native void nGLGetFramebufferAttachmentParameterivOES(int target, 
                                                                         int attachment, 
                                                                         int pname, 
                                                                         int[] params, int offset);/*
        glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
            (GLenum)  attachment,
            (GLenum)  pname, 
            (GLint *)(params + offset));                                                                         
    */


    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES(
     * [int target, int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
     *  (GLenum)  attachment, (GLenum)  pname, (GLint *)params )

     * */
    public void glGetFramebufferAttachmentParameterivOES(int target,
                                                         int attachment,
                                                         int pname,
                                                         java.nio.IntBuffer params) {
        int offset = getOffset(params);
        nGLGetFramebufferAttachmentParameterivOES(target, attachment, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetFramebufferAttachmentParameterivOES([int target, int attachment, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetFramebufferAttachmentParameterivOES((GLenum)  target, (GLenum)  attachment, (GLenum)  pname, (GLint *)params )

     * */
    private static native void nGLGetFramebufferAttachmentParameterivOES(int target, 
                                                                         int attachment, 
                                                                         int pname, 
                                                                         java.nio.IntBuffer params, 
                                                                         int offset);/*
        glGetFramebufferAttachmentParameterivOES((GLenum)  target, 
                                                 (GLenum)  attachment, 
                                                 (GLenum)  pname, 
                                                 (GLint *)(params + offset));                                                                         
      */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGenerateMipmapOES([int target]);
     * 
     *  C function void glGenerateMipmapOES((GLenum)  target )
     * */
    public void glGenerateMipmapOES(int target) {
        GLES11ExtPipeline.nGLGenerateMipmapOES(target);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGenerateMipmapOES([int target]);
     * 
     *  C function void glGenerateMipmapOES((GLenum)  target )
     * */
    private static native void nGLGenerateMipmapOES(int target);/*
       glGenerateMipmapOES((GLenum)  target );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glCurrentPaletteMatrixOES([int matrixpaletteindex]);
     * 
     *  C function void glCurrentPaletteMatrixOES((GLuint)  matrixpaletteindex )

     * */
    public void glCurrentPaletteMatrixOES(int matrixpaletteindex) {
        GLES11ExtPipeline.nGLCurrentPaletteMatrixOES(matrixpaletteindex);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glCurrentPaletteMatrixOES([int matrixpaletteindex]);
     * 
     *  C function void glCurrentPaletteMatrixOES((GLuint)  matrixpaletteindex )
     * */
    private static native void nGLCurrentPaletteMatrixOES(int matrixpaletteindex);/*
       glCurrentPaletteMatrixOES((GLuint)  matrixpaletteindex );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glLoadPaletteFromModelViewMatrixOES();
     * 
     *  C function void glLoadPaletteFromModelViewMatrixOES(void )
     * */
    public void glLoadPaletteFromModelViewMatrixOES() {
        GLES11ExtPipeline.nGLLoadPaletteFromModelViewMatrixOES();
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glLoadPaletteFromModelViewMatrixOES();
     * 
     *  C function void glLoadPaletteFromModelViewMatrixOES(void )

     * */
    private static native void nGLLoadPaletteFromModelViewMatrixOES();/*
        glLoadPaletteFromModelViewMatrixOES();
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glMatrixIndexPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glMatrixIndexPointerOES((GLint) size, (GLenum)  type, (GLsizei) stride,    (GLvoid *) pointer )

     * */
    public void glMatrixIndexPointerOESBounds(int size, 
                                              int type, 
                                              int stride, 
                                              java.nio.Buffer pointer, int remaining) {
        int offset = getOffset(pointer);
        nGLMatrixIndexPointerOESBounds(size, type, stride, pointer, offset, remaining);
    }
    
     public void glMatrixIndexPointerOES(int size, int type, int stride, int offset) {
         nGLMatrixIndexPointerOES(size, type, stride, offset);
    }
     
    private static native void nGLMatrixIndexPointerOES(int size, int type, int stride, int offset);/*
        glMatrixIndexPointerOES(
        (GLint)size,
        (GLenum)type,
        (GLsizei)stride,
        reinterpret_cast<GLvoid *>(offset)
    );
     */

    /**
     * <pre>
     * Native method generated from GLES11Ext.glMatrixIndexPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glMatrixIndexPointerOES((GLint) size, (GLenum)  type, (GLsizei) stride,    (GLvoid *) pointer )

     * */
    private static native void nGLMatrixIndexPointerOESBounds(int size, 
                                                              int type, 
                                                              int stride, 
                                                              java.nio.Buffer pointer, int offset, 
                                                              int remaining);/*
                                                              
            glMatrixIndexPointerOES((GLint) size, 
                                    (GLenum)  type, 
                                    (GLsizei) stride, 
                                    (GLvoid *) (pointer + offset));                                                  
        
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glWeightPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glWeightPointerOES((GLint) size, (GLenum)  type, (GLsizei) stride,    (GLvoid *) pointer )

     * */
    public void glWeightPointerOESBounds(int size, 
                                         int type, 
                                         int stride, 
                                         java.nio.Buffer pointer, int remaining) {
        int offset = getOffset(pointer);
        nGLWeightPointerOESBounds(size, type, stride, pointer, offset, remaining);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glWeightPointerOESBounds([int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glWeightPointerOES((GLint) size, (GLenum)  type, (GLsizei) stride,    (GLvoid *) pointer )

     * */
    private static native void nGLWeightPointerOESBounds(int size, 
                                                         int type, 
                                                         int stride, 
                                                         java.nio.Buffer pointer, int offset, 
                                                         int remaining);/*
        glWeightPointerOES((GLint) size, 
                           (GLenum)  type, 
                           (GLsizei) stride, 
                           (GLvoid *) (pointer + offset));
    */

    public void glWeightPointerOESBounds(int size, int type, int stride, int offset) {
        // TODO Auto-generated method stub        
    }
    
    
    
    
    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glDepthRangefOES([float zNear, float zFar]);
     * 
     *  C function void glDepthRangefOES((GLclampf) zNear, (GLclampf) zFar )

     * */
    public void glDepthRangefOES(float zNear, float zFar) {
        GLES11ExtPipeline.nGLDepthRangefOES(zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glDepthRangefOES([float zNear, float zFar]);
     * 
     *  C function void glDepthRangefOES((GLclampf) zNear, (GLclampf) zFar )

     * */
    private static native void nGLDepthRangefOES(float zNear, float zFar);/*
      glDepthRangefOES((GLclampf) zNear, (GLclampf) zFar );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glFrustumfOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumfOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar )

     * */
    public void glFrustumfOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        GLES11ExtPipeline.nGLFrustumfOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glFrustumfOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glFrustumfOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar )

     * */
    private static native void nGLFrustumfOES(float left, float right, float bottom, float top, float zNear, float zFar);/*
       glFrustumfOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glOrthofOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthofOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar )

     * */
    public void glOrthofOES(float left, float right, float bottom, float top, float zNear, float zFar) {
        GLES11ExtPipeline.nGLOrthofOES(left, right, bottom, top, zNear, zFar);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glOrthofOES([float left, float right, float bottom, float top, float zNear, float zFar]);
     * 
     *  C function void glOrthofOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar )

     * */
    private static native void nGLOrthofOES(float left, float right, float bottom, float top, float zNear, float zFar);/*
      glOrthofOES((GLfloat) left, (GLfloat) right, (GLfloat) bottom, (GLfloat) top, (GLfloat) zNear, (GLfloat) zFar );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClipPlanefOES([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanefOES((GLenum)  plane,    (GLfloat *)equation )

     * */
    public void glClipPlanefOES(int plane, float[] equation, int offset) {
        GLES11ExtPipeline.nGLClipPlanefOES(plane, equation, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClipPlanefOES([int plane, float[] equation, int offset]);
     * 
     *  C function void glClipPlanefOES((GLenum)  plane,    (GLfloat *)equation )

     * */
    private static native void nGLClipPlanefOES(int plane, float[] equation, int offset);/*
         glClipPlanefOES((GLenum)  plane, (GLfloat *)(equation + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClipPlanefOES([int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanefOES((GLenum)  plane,    (GLfloat *)equation )

     * */
    public void glClipPlanefOES(int plane, java.nio.FloatBuffer equation) {
        int offset = getOffset(equation);
        nGLClipPlanefOES(plane, equation, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClipPlanefOES(
     * [int plane, java.nio.FloatBuffer equation]);
     * 
     *  C function void glClipPlanefOES((GLenum)  plane,    (GLfloat *)equation )

     * */
    private static native void nGLClipPlanefOES(int plane, java.nio.FloatBuffer equation, int offset);/*
       glClipPlanefOES((GLenum)  plane, (GLfloat *)(equation + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetClipPlanefOES([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanefOES((GLenum)  pname, (GLfloat *)eqn )

     * */
    public void glGetClipPlanefOES(int pname, float[] eqn, int offset) {
        GLES11ExtPipeline.nGLGetClipPlanefOES(pname, eqn, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetClipPlanefOES([int pname, float[] eqn, int offset]);
     * 
     *  C function void glGetClipPlanefOES((GLenum)  pname, (GLfloat *)eqn )

     * */
    private static native void nGLGetClipPlanefOES(int pname, float[] eqn, int offset);/*
    glGetClipPlanefOES((GLenum)  pname, (GLfloat *)(eqn + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetClipPlanefOES([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanefOES((GLenum)  pname, (GLfloat *)eqn )

     * */
    public void glGetClipPlanefOES(int pname, java.nio.FloatBuffer eqn) {
        int offset = getOffset(eqn);
        nGLGetClipPlanefOES(pname, eqn, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetClipPlanefOES([int pname, java.nio.FloatBuffer eqn]);
     * 
     *  C function void glGetClipPlanefOES((GLenum)  pname, (GLfloat *)eqn )

     * */
    private static native void nGLGetClipPlanefOES(int pname, java.nio.FloatBuffer eqn, int offset);/*
        glGetClipPlanefOES((GLenum)  pname, (GLfloat *)(eqn + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glClearDepthfOES([float depth]);
     * 
     *  C function void glClearDepthfOES((GLclampf) depth )

     * */
    public void glClearDepthfOES(float depth) {
        GLES11ExtPipeline.nGLClearDepthfOES(depth);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glClearDepthfOES([float depth]);
     * 
     *  C function void glClearDepthfOES((GLclampf) depth )

     * */
    private static native void nGLClearDepthfOES(float depth);/*
         glClearDepthfOES( (GLclampf) depth );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenfOES([int coord, int pname, float param]);
     * 
     *  C function void glTexGenfOES((GLenum)  coord, (GLenum)  pname, (GLfloat) param )

     * */
    public void glTexGenfOES(int coord, int pname, float param) {
        GLES11ExtPipeline.nGLTexGenfOES(coord, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenfOES([int coord, int pname, float param]);
     * 
     *  C function void glTexGenfOES((GLenum)  coord, (GLenum)  pname, (GLfloat) param )

     * */
    private static native void nGLTexGenfOES(int coord, int pname, float param);/*
         glTexGenfOES((GLenum)  coord, (GLenum)  pname, (GLfloat) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glTexGenfvOES((GLenum)  coord, (GLenum)  pname,    (GLfloat *)params )

     * */
    public void glTexGenfvOES(int coord, int pname, float[] params, int offset) {
        GLES11ExtPipeline.nGLTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glTexGenfvOES((GLenum)  coord, (GLenum)  pname,    (GLfloat *)params )

     * */
    private static native void nGLTexGenfvOES(int coord, int pname, float[] params, int offset);/*
        glTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexGenfvOES((GLenum)  coord, (GLenum)  pname,    (GLfloat *)params )

     * */
    public void glTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params) {
        int offset = getOffset(params);
        nGLTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glTexGenfvOES((GLenum)  coord, (GLenum)  pname,    (GLfloat *)params )

     * */
    private static native void nGLTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params, int offset);/*
        glTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGeniOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGeniOES((GLenum)  coord, (GLenum)  pname, (GLint) param )

     * */
    public void glTexGeniOES(int coord, int pname, int param) {
        GLES11ExtPipeline.nGLTexGeniOES(coord, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGeniOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGeniOES((GLenum)  coord, (GLenum)  pname, (GLint) param )

     * */
    private static native void nGLTexGeniOES(int coord, int pname, int param);/*
          glTexGeniOES((GLenum)  coord, (GLenum)  pname, (GLint) param );
    */
    
    
    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenivOES(
     * [int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenivOES((GLenum)  coord, (GLenum)  pname,    (GLint *)params )

     * */
    public void glTexGenivOES(int coord, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLTexGenivOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenivOES(
     * [int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenivOES((GLenum)  coord, (GLenum)  pname,    (GLint *)params )

     * */
    private static native void nGLTexGenivOES(int coord, int pname, int[] params, int offset);/*
        glTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenivOES(
     * [int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenivOES((GLenum)  coord, (GLenum)  pname,    (GLint *)params )

     * */
    public void glTexGenivOES(int coord, int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        nGLTexGenivOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenivOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenivOES((GLenum)  coord, (GLenum)  pname,    (GLint *)params )

     * */
    private static native void nGLTexGenivOES(int coord, 
                                              int pname, 
                                              java.nio.IntBuffer params, int offset);/*
        glTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenxOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGenxOES((GLenum)  coord, (GLenum)  pname,(GLfixed) param )

     * */
    public void glTexGenxOES(int coord, int pname, int param) {
        GLES11ExtPipeline.nGLTexGenxOES(coord, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenxOES([int coord, int pname, int param]);
     * 
     *  C function void glTexGenxOES((GLenum)  coord, (GLenum)  pname,(GLfixed) param )

     * */
    private static native void nGLTexGenxOES(int coord, int pname, int param);/*
        glTexGenxOES((GLenum)  coord, (GLenum)  pname, (GLfixed) param );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenxvOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenxvOES((GLenum)  coord, (GLenum)  pname,    (GLfixed *)params )

     * */
    public void glTexGenxvOES(int coord, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenxvOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glTexGenxvOES((GLenum)  coord, (GLenum)  pname,    (GLfixed *)params )

     * */
    private static native void nGLTexGenxvOES(int coord, int pname, int[] params, int offset);/*
    glTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glTexGenxvOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenxvOES((GLenum)  coord, (GLenum)  pname,    (GLfixed *)params )

     * */
    public void glTexGenxvOES(int coord, int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        nGLTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glTexGenxvOES(
     * [int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glTexGenxvOES((GLenum)  coord, (GLenum)  pname,    (GLfixed *)params )

     * */
    private static native void nGLTexGenxvOES(int coord, 
                                              int pname, 
                                              java.nio.IntBuffer params, int offset);/*
       glTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenfvOES(
     * [int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexGenfvOES(int coord, int pname, float[] params, int offset) {
        GLES11ExtPipeline.nGLGetTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenfvOES([int coord, int pname, float[] params, int offset]);
     * 
     *  C function void glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexGenfvOES(int coord, int pname, float[] params, int offset);/*
    glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset) );
 */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)params )

     * */
    public void glGetTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLGetTexGenfvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenfvOES([int coord, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)params )

     * */
    private static native void nGLGetTexGenfvOES(int coord, int pname, java.nio.FloatBuffer params, int offset);/*
       glGetTexGenfvOES((GLenum)  coord, (GLenum)  pname, (GLfloat *)(params + offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenivOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)params )

     * */
    public void glGetTexGenivOES(int coord, int pname, int[] params, int offset) {
        GLES11ExtPipeline.nGLGetTexGenivOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenivOES([int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)params )

     * */
    private static native void nGLGetTexGenivOES(int coord, int pname, int[] params, int offset);/*
       glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenivOES(
     * [int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)params )
     * */
    public void glGetTexGenivOES(int coord, int pname, java.nio.IntBuffer params) {
        int offset = getOffset(params);
        GLES11ExtPipeline.nGLGetTexGenivOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenivOES([int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)params )

     * */
    private static native void nGLGetTexGenivOES(int coord, int pname, java.nio.IntBuffer params, int offset);/*
        glGetTexGenivOES((GLenum)  coord, (GLenum)  pname, (GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenxvOES(
     * [int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetTexGenxvOES(int coord, int pname, int[] params, int offset) {
        
        GLES11ExtPipeline.nGLGetTexGenxvOES(coord, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenxvOES(
     * [int coord, int pname, int[] params, int offset]);
     * 
     *  C function void glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetTexGenxvOES(int coord, 
                                                 int pname, 
                                                 int[] params, 
                                                 int offset);/*
       glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES11Ext.glGetTexGenxvOES(
     * [int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)params )
     * */
    public void glGetTexGenxvOES(int coord, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, "params");
        int offset = getOffset(params);
        if (params.isDirect()){
            nGLGetTexGenxvOES(coord, pname, params, offset);
        }else{
         int[] array = params.array();
         nGLGetTexGenxvOES(coord, pname, array, offset);
        }
      //  GLES11ExtPipeline.nGLGetTexGenxvOES(coord, pname, params);
    }

    /**
     * <pre>
     * Native method generated from GLES11Ext.glGetTexGenxvOES(
     * [int coord, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)params )
     * */
    private static native void nGLGetTexGenxvOES(int coord, 
                                                 int pname, 
                                                 java.nio.IntBuffer params, 
                                                 int offset);/*
       glGetTexGenxvOES((GLenum)  coord, (GLenum)  pname, (GLfixed *)(params + offset));
    */

    
    
    
}
