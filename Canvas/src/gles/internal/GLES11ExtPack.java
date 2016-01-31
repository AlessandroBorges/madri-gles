  /**
   * Place holder for license disclaimer.
   **/

    package gles.internal;

    import android.opengl.*;


  /** <pre>
   * 
   * Main extension: selection<br>
   * Included extensions: <br>
   * Extension: GL_OES_blend_equation_separate API: GL-ES 1.x, Enumerations: 2, Functions: 1 <br>
   * Extension: GL_OES_blend_func_separate API: GL-ES 1.x, Enumerations: 4, Functions: 1 <br>
   * Extension: GL_OES_blend_subtract API: GL-ES 1.x, Enumerations: 4, Functions: 1 <br>
   * Extension: GL_OES_extended_matrix_palette, API:  GL-ES 1.x <br>
   * Extension: GL_OES_framebuffer_object API: GL-ES 1.x, Enumerations: 33, Functions: 15 <br>
   * Extension: GL_OES_stencil_wrap API: GL-ES 1.x, Enumerations: 2, Functions: 0 <br>
   * Extension: GL_OES_texture_cube_map API: GL-ES 1.x, Enumerations: 13, Functions: 9 <br>
   * Extension: GL_OES_texture_env_crossbar, API:  GL-ES 1.x <br>
   * Extension: GL_OES_texture_mirrored_repeat API: GL-ES 1.x, Enumerations: 1, Functions: 0 <br>
   *</pre> 
   **/
   public class GLES11ExtPack{
    //@OFF 
    /*JNI 
    // EGL includes
    #define EGL_EGLEXT_PROTOTYPES 1
    #include <EGL/egl.h>
    #include <EGL/eglext.h>

  // GLES 1.x  api
    #define GL_GLEXT_PROTOTYPES 1 
    #include <GLES/egl.h>
    #include <GLES/gl.h>
    #include <GLES/glext.h>

  // function pointers section 
   // Declaration of FuncPointer vars 


 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_equation_separate
 // API: gles1
 //////////////////////////////////
	 static PFNGLBLENDEQUATIONSEPARATEOESPROC	glBlendEquationSeparateOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_func_separate
 // API: gles1
 //////////////////////////////////
	 static PFNGLBLENDFUNCSEPARATEOESPROC	glBlendFuncSeparateOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_blend_subtract
 // API: gles1
 //////////////////////////////////
	 static PFNGLBLENDEQUATIONOESPROC	glBlendEquationOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_framebuffer_object
 // API: gles1
 //////////////////////////////////
	 static PFNGLISRENDERBUFFEROESPROC	glIsRenderbufferOES;
	 static PFNGLBINDRENDERBUFFEROESPROC	glBindRenderbufferOES;
	 static PFNGLDELETERENDERBUFFERSOESPROC	glDeleteRenderbuffersOES;
	 static PFNGLGENRENDERBUFFERSOESPROC	glGenRenderbuffersOES;
	 static PFNGLRENDERBUFFERSTORAGEOESPROC	glRenderbufferStorageOES;
	 static PFNGLGETRENDERBUFFERPARAMETERIVOESPROC	glGetRenderbufferParameterivOES;
	 static PFNGLISFRAMEBUFFEROESPROC	glIsFramebufferOES;
	 static PFNGLBINDFRAMEBUFFEROESPROC	glBindFramebufferOES;
	 static PFNGLDELETEFRAMEBUFFERSOESPROC	glDeleteFramebuffersOES;
	 static PFNGLGENFRAMEBUFFERSOESPROC	glGenFramebuffersOES;
	 static PFNGLCHECKFRAMEBUFFERSTATUSOESPROC	glCheckFramebufferStatusOES;
	 static PFNGLFRAMEBUFFERRENDERBUFFEROESPROC	glFramebufferRenderbufferOES;
	 static PFNGLFRAMEBUFFERTEXTURE2DOESPROC	glFramebufferTexture2DOES;
	 static PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVOESPROC	glGetFramebufferAttachmentParameterivOES;
	 static PFNGLGENERATEMIPMAPOESPROC	glGenerateMipmapOES;

 ///////////////////////////////////
 // PFN_PROC functions declaration 
 // Extension: GL_OES_texture_cube_map
 // API: gles1
 //////////////////////////////////
	 static PFNGLTEXGENFOESPROC	glTexGenfOES;
	 static PFNGLTEXGENFVOESPROC	glTexGenfvOES;
	 static PFNGLTEXGENIOESPROC	glTexGeniOES;
	 static PFNGLTEXGENIVOESPROC	glTexGenivOES;
	 static PFNGLTEXGENXOESPROC	glTexGenxOES;
	 static PFNGLTEXGENXVOESPROC	glTexGenxvOES;
	 static PFNGLGETTEXGENFVOESPROC	glGetTexGenfvOES;
	 static PFNGLGETTEXGENIVOESPROC	glGetTexGenivOES;
	 static PFNGLGETTEXGENXVOESPROC	glGetTexGenxvOES;
  // extension loaders
  // function loader
  #define myFuncLoader(x) eglGetProcAddress(x)

   // Declaration of LOADERS for function pointers - PFN_PROC 

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


  // Declaration of loadALL(), to call all PFN_PROC pointers 
 static int loadALL(){
	 loadExtFuncGL_OES_blend_equation_separate();
	 loadExtFuncGL_OES_blend_func_separate();
	 loadExtFuncGL_OES_blend_subtract();
	 loadExtFuncGL_OES_framebuffer_object();
	 loadExtFuncGL_OES_texture_cube_map();
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
     * Enumeration for extension: GL_OES_blend_equation_separate
     */
    // enumerations: 
	 public static final int   GL_BLEND_EQUATION_RGB_OES = 0x8009;
	 public static final int   GL_BLEND_EQUATION_ALPHA_OES = 0x883D;

 
 // Function(s) for extension GL_OES_blend_equation_separate, API: gles1   

 /**<pre>
  *  Extension: GL_OES_blend_equation_separate
  *  
  * C Prototype:
  * void  glBlendEquationSeparateOES ( 
  * 		 GLenum   modeRGB,
  * 		 GLenum   modeAlpha
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_blend_equation_separate.txt">GL_OES_blend_equation_separate</a> 
  **/ 
 public final native static 
  void glBlendEquationSeparateOES (int modeRGB,
                                    int modeAlpha);/*
	 // jnigen - native goes here
  	 glBlendEquationSeparateOES( (GLenum) modeRGB,
  	                             (GLenum) modeAlpha);
  	   */
    /**
     * Enumeration for extension: GL_OES_blend_func_separate
     */
    // enumerations: 
	 public static final int   GL_BLEND_DST_RGB_OES = 0x80C8;
	 public static final int   GL_BLEND_SRC_RGB_OES = 0x80C9;
	 public static final int   GL_BLEND_DST_ALPHA_OES = 0x80CA;
	 public static final int   GL_BLEND_SRC_ALPHA_OES = 0x80CB;

 
 // Function(s) for extension GL_OES_blend_func_separate, API: gles1   

 /**<pre>
  *  Extension: GL_OES_blend_func_separate
  *  
  * C Prototype:
  * void  glBlendFuncSeparateOES ( 
  * 		 GLenum   srcRGB,
  * 		 GLenum   dstRGB,
  * 		 GLenum   srcAlpha,
  * 		 GLenum   dstAlpha
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_blend_func_separate.txt">GL_OES_blend_func_separate</a> 
  **/ 
 public final native static 
  void glBlendFuncSeparateOES (int srcRGB,
                                int dstRGB,
                                int srcAlpha,
                                int dstAlpha);/*
	 // jnigen - native goes here
  	 glBlendFuncSeparateOES( (GLenum) srcRGB,
  	                         (GLenum) dstRGB,
  	                         (GLenum) srcAlpha,
  	                         (GLenum) dstAlpha);
  	   */
    /**
     * Enumeration for extension: GL_OES_blend_subtract
     */
    // enumerations: 
	 public static final int   GL_BLEND_EQUATION_OES = 0x8009;
	 public static final int   GL_FUNC_ADD_OES = 0x8006;
	 public static final int   GL_FUNC_SUBTRACT_OES = 0x800A;
	 public static final int   GL_FUNC_REVERSE_SUBTRACT_OES = 0x800B;

 
 // Function(s) for extension GL_OES_blend_subtract, API: gles1   

 /**<pre>
  *  Extension: GL_OES_blend_subtract
  *  
  * C Prototype:
  * void  glBlendEquationOES ( 
  * 		 GLenum   mode
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_blend_subtract.txt">GL_OES_blend_subtract</a> 
  **/ 
 public final native static 
  void glBlendEquationOES (int mode);/*
	 // jnigen - native goes here
  	 glBlendEquationOES( (GLenum) mode);
  	   */
    /**
     * Enumeration for extension: GL_OES_framebuffer_object
     */
    // enumerations: 
	 public static final int   GL_NONE_OES = 0;
	 public static final int   GL_FRAMEBUFFER_OES = 0x8D40;
	 public static final int   GL_RENDERBUFFER_OES = 0x8D41;
	 public static final int   GL_RGBA4_OES = 0x8056;
	 public static final int   GL_RGB5_A1_OES = 0x8057;
	 public static final int   GL_RGB565_OES = 0x8D62;
	 public static final int   GL_DEPTH_COMPONENT16_OES = 0x81A5;
	 public static final int   GL_RENDERBUFFER_WIDTH_OES = 0x8D42;
	 public static final int   GL_RENDERBUFFER_HEIGHT_OES = 0x8D43;
	 public static final int   GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 0x8D44;
	 public static final int   GL_RENDERBUFFER_RED_SIZE_OES = 0x8D50;
	 public static final int   GL_RENDERBUFFER_GREEN_SIZE_OES = 0x8D51;
	 public static final int   GL_RENDERBUFFER_BLUE_SIZE_OES = 0x8D52;
	 public static final int   GL_RENDERBUFFER_ALPHA_SIZE_OES = 0x8D53;
	 public static final int   GL_RENDERBUFFER_DEPTH_SIZE_OES = 0x8D54;
	 public static final int   GL_RENDERBUFFER_STENCIL_SIZE_OES = 0x8D55;
	 public static final int   GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 0x8CD0;
	 public static final int   GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 0x8CD1;
	 public static final int   GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 0x8CD2;
	 public static final int   GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 0x8CD3;
	 public static final int   GL_COLOR_ATTACHMENT0_OES = 0x8CE0;
	 public static final int   GL_DEPTH_ATTACHMENT_OES = 0x8D00;
	 public static final int   GL_STENCIL_ATTACHMENT_OES = 0x8D20;
	 public static final int   GL_FRAMEBUFFER_COMPLETE_OES = 0x8CD5;
	 public static final int   GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 0x8CD6;
	 public static final int   GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 0x8CD7;
	 public static final int   GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 0x8CD9;
	 public static final int   GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 0x8CDA;
	 public static final int   GL_FRAMEBUFFER_UNSUPPORTED_OES = 0x8CDD;
	 public static final int   GL_FRAMEBUFFER_BINDING_OES = 0x8CA6;
	 public static final int   GL_RENDERBUFFER_BINDING_OES = 0x8CA7;
	 public static final int   GL_MAX_RENDERBUFFER_SIZE_OES = 0x84E8;
	 public static final int   GL_INVALID_FRAMEBUFFER_OPERATION_OES = 0x0506;

 
 // Function(s) for extension GL_OES_framebuffer_object, API: gles1   

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  *   GLboolean glIsRenderbufferOES ( 
  * 		 GLuint   renderbuffer
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  boolean glIsRenderbufferOES (int renderbuffer);/*
	 // jnigen - native goes here
  	   return (jboolean)  glIsRenderbufferOES( (GLuint) renderbuffer);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glBindRenderbufferOES ( 
  * 		 GLenum   target,
  * 		 GLuint   renderbuffer
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glBindRenderbufferOES (int target,
                               int renderbuffer);/*
	 // jnigen - native goes here
  	 glBindRenderbufferOES( (GLenum) target,
  	                        (GLuint) renderbuffer);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glDeleteRenderbuffersOES ( 
  * 		 GLsizei   n,
  * 		 const  GLuint  * renderbuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glDeleteRenderbuffersOES( int n,
                                java.nio.IntBuffer renderbuffers, int renderbuffersOffset); /*
	 // jnigen - native goes here
  	 glDeleteRenderbuffersOES( (GLsizei) n,
  	                           (const  GLuint  *) (renderbuffers + renderbuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glDeleteRenderbuffersOES ( 
  * 		 GLsizei   n,
  * 		 const  GLuint  * renderbuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glDeleteRenderbuffersOES( int n,
                                 final int [] renderbuffers, int renderbuffersOffset);/*
	 // jnigen - native goes here
  	 glDeleteRenderbuffersOES( (GLsizei) n,
  	                           (const  GLuint  *) (renderbuffers + renderbuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGenRenderbuffersOES ( 
  * 		 GLsizei   n,
  * 		 GLuint  * renderbuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glGenRenderbuffersOES( int n,
                             java.nio.IntBuffer renderbuffers, int renderbuffersOffset); /*
	 // jnigen - native goes here
  	 glGenRenderbuffersOES( (GLsizei) n,
  	                        (GLuint  *) (renderbuffers + renderbuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGenRenderbuffersOES ( 
  * 		 GLsizei   n,
  * 		 GLuint  * renderbuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glGenRenderbuffersOES( int n,
                              int[] renderbuffers, int renderbuffersOffset);/*
	 // jnigen - native goes here
  	 glGenRenderbuffersOES( (GLsizei) n,
  	                        (GLuint  *) (renderbuffers + renderbuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glRenderbufferStorageOES ( 
  * 		 GLenum   target,
  * 		 GLenum   internalformat,
  * 		 GLsizei   width,
  * 		 GLsizei   height
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glRenderbufferStorageOES (int target,
                                  int internalformat,
                                  int width,
                                  int height);/*
	 // jnigen - native goes here
  	 glRenderbufferStorageOES( (GLenum) target,
  	                           (GLenum) internalformat,
  	                           (GLsizei) width,
  	                           (GLsizei) height);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGetRenderbufferParameterivOES ( 
  * 		 GLenum   target,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glGetRenderbufferParameterivOES( int target,
                                        int pname,
                                        int[] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glGetRenderbufferParameterivOES( (GLenum) target,
  	                                  (GLenum) pname,
  	                                  (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGetRenderbufferParameterivOES ( 
  * 		 GLenum   target,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glGetRenderbufferParameterivOES( int target,
                                       int pname,
                                       java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glGetRenderbufferParameterivOES( (GLenum) target,
  	                                  (GLenum) pname,
  	                                  (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  *   GLboolean glIsFramebufferOES ( 
  * 		 GLuint   framebuffer
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  boolean glIsFramebufferOES (int framebuffer);/*
	 // jnigen - native goes here
  	   return (jboolean)  glIsFramebufferOES( (GLuint) framebuffer);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glBindFramebufferOES ( 
  * 		 GLenum   target,
  * 		 GLuint   framebuffer
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glBindFramebufferOES (int target,
                              int framebuffer);/*
	 // jnigen - native goes here
  	 glBindFramebufferOES( (GLenum) target,
  	                       (GLuint) framebuffer);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glDeleteFramebuffersOES ( 
  * 		 GLsizei   n,
  * 		 const  GLuint  * framebuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glDeleteFramebuffersOES( int n,
                                final int [] framebuffers, int framebuffersOffset);/*
	 // jnigen - native goes here
  	 glDeleteFramebuffersOES( (GLsizei) n,
  	                          (const  GLuint  *) (framebuffers + framebuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glDeleteFramebuffersOES ( 
  * 		 GLsizei   n,
  * 		 const  GLuint  * framebuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glDeleteFramebuffersOES( int n,
                               java.nio.IntBuffer framebuffers, int framebuffersOffset); /*
	 // jnigen - native goes here
  	 glDeleteFramebuffersOES( (GLsizei) n,
  	                          (const  GLuint  *) (framebuffers + framebuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGenFramebuffersOES ( 
  * 		 GLsizei   n,
  * 		 GLuint  * framebuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glGenFramebuffersOES( int n,
                            java.nio.IntBuffer framebuffers, int framebuffersOffset); /*
	 // jnigen - native goes here
  	 glGenFramebuffersOES( (GLsizei) n,
  	                       (GLuint  *) (framebuffers + framebuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGenFramebuffersOES ( 
  * 		 GLsizei   n,
  * 		 GLuint  * framebuffers
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glGenFramebuffersOES( int n,
                             int[] framebuffers, int framebuffersOffset);/*
	 // jnigen - native goes here
  	 glGenFramebuffersOES( (GLsizei) n,
  	                       (GLuint  *) (framebuffers + framebuffersOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  *   GLenum glCheckFramebufferStatusOES ( 
  * 		 GLenum   target
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  int glCheckFramebufferStatusOES (int target);/*
	 // jnigen - native goes here
  	   return (jint)  glCheckFramebufferStatusOES( (GLenum) target);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glFramebufferRenderbufferOES ( 
  * 		 GLenum   target,
  * 		 GLenum   attachment,
  * 		 GLenum   renderbuffertarget,
  * 		 GLuint   renderbuffer
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glFramebufferRenderbufferOES (int target,
                                      int attachment,
                                      int renderbuffertarget,
                                      int renderbuffer);/*
	 // jnigen - native goes here
  	 glFramebufferRenderbufferOES( (GLenum) target,
  	                               (GLenum) attachment,
  	                               (GLenum) renderbuffertarget,
  	                               (GLuint) renderbuffer);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glFramebufferTexture2DOES ( 
  * 		 GLenum   target,
  * 		 GLenum   attachment,
  * 		 GLenum   textarget,
  * 		 GLuint   texture,
  * 		 GLint   level
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glFramebufferTexture2DOES (int target,
                                   int attachment,
                                   int textarget,
                                   int texture,
                                   int level);/*
	 // jnigen - native goes here
  	 glFramebufferTexture2DOES( (GLenum) target,
  	                            (GLenum) attachment,
  	                            (GLenum) textarget,
  	                            (GLuint) texture,
  	                            (GLint) level);
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGetFramebufferAttachmentParameterivOES ( 
  * 		 GLenum   target,
  * 		 GLenum   attachment,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glGetFramebufferAttachmentParameterivOES( int target,
                                                 int attachment,
                                                 int pname,
                                                 int[] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glGetFramebufferAttachmentParameterivOES( (GLenum) target,
  	                                           (GLenum) attachment,
  	                                           (GLenum) pname,
  	                                           (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGetFramebufferAttachmentParameterivOES ( 
  * 		 GLenum   target,
  * 		 GLenum   attachment,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
 void glGetFramebufferAttachmentParameterivOES( int target,
                                                int attachment,
                                                int pname,
                                                java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glGetFramebufferAttachmentParameterivOES( (GLenum) target,
  	                                           (GLenum) attachment,
  	                                           (GLenum) pname,
  	                                           (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_framebuffer_object
  *  
  * C Prototype:
  * void  glGenerateMipmapOES ( 
  * 		 GLenum   target
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_framebuffer_object.txt">GL_OES_framebuffer_object</a> 
  **/ 
 public final native static 
  void glGenerateMipmapOES (int target);/*
	 // jnigen - native goes here
  	 glGenerateMipmapOES( (GLenum) target);
  	   */
    /**
     * Enumeration for extension: GL_OES_stencil_wrap
     */
    // enumerations: 
	 public static final int   GL_INCR_WRAP_OES = 0x8507;
	 public static final int   GL_DECR_WRAP_OES = 0x8508;

 
    /**
     * Enumeration for extension: GL_OES_texture_cube_map
     */
    // enumerations: 
	 public static final int   GL_NORMAL_MAP_OES = 0x8511;
	 public static final int   GL_REFLECTION_MAP_OES = 0x8512;
	 public static final int   GL_TEXTURE_CUBE_MAP_OES = 0x8513;
	 public static final int   GL_TEXTURE_BINDING_CUBE_MAP_OES = 0x8514;
	 public static final int   GL_TEXTURE_CUBE_MAP_POSITIVE_X_OES = 0x8515;
	 public static final int   GL_TEXTURE_CUBE_MAP_NEGATIVE_X_OES = 0x8516;
	 public static final int   GL_TEXTURE_CUBE_MAP_POSITIVE_Y_OES = 0x8517;
	 public static final int   GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_OES = 0x8518;
	 public static final int   GL_TEXTURE_CUBE_MAP_POSITIVE_Z_OES = 0x8519;
	 public static final int   GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_OES = 0x851A;
	 public static final int   GL_MAX_CUBE_MAP_TEXTURE_SIZE_OES = 0x851C;
	 public static final int   GL_TEXTURE_GEN_MODE_OES = 0x2500;
	 public static final int   GL_TEXTURE_GEN_STR_OES = 0x8D60;

 
 // Function(s) for extension GL_OES_texture_cube_map, API: gles1   

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenfOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfloat   param
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGenfOES (int coord,
                      int pname,
                      float param);/*
	 // jnigen - native goes here
  	 glTexGenfOES( (GLenum) coord,
  	               (GLenum) pname,
  	               (GLfloat) param);
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenfvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLfloat  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGenfvOES( int coord,
                      int pname,
                      final float [] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glTexGenfvOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLfloat  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenfvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLfloat  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glTexGenfvOES( int coord,
                     int pname,
                     java.nio.FloatBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glTexGenfvOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLfloat  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGeniOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLint   param
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGeniOES (int coord,
                      int pname,
                      int param);/*
	 // jnigen - native goes here
  	 glTexGeniOES( (GLenum) coord,
  	               (GLenum) pname,
  	               (GLint) param);
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenivOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGenivOES( int coord,
                      int pname,
                      final int [] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glTexGenivOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenivOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glTexGenivOES( int coord,
                     int pname,
                     java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glTexGenivOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenxOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfixed   param
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGenxOES (int coord,
                      int pname,
                      int param);/*
	 // jnigen - native goes here
  	 glTexGenxOES( (GLenum) coord,
  	               (GLenum) pname,
  	               (GLfixed) param);
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenxvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLfixed  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glTexGenxvOES( int coord,
                      int pname,
                      final int [] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glTexGenxvOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLfixed  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glTexGenxvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 const  GLfixed  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glTexGenxvOES( int coord,
                     int pname,
                     java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glTexGenxvOES( (GLenum) coord,
  	                (GLenum) pname,
  	                (const  GLfixed  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenfvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfloat  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glGetTexGenfvOES( int coord,
                         int pname,
                         float[] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glGetTexGenfvOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLfloat  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenfvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfloat  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glGetTexGenfvOES( int coord,
                        int pname,
                        java.nio.FloatBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glGetTexGenfvOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLfloat  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenivOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glGetTexGenivOES( int coord,
                         int pname,
                         int[] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glGetTexGenivOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenivOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLint  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glGetTexGenivOES( int coord,
                        int pname,
                        java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glGetTexGenivOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLint  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenxvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfixed  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
 void glGetTexGenxvOES( int coord,
                        int pname,
                        java.nio.IntBuffer params, int paramsOffset); /*
	 // jnigen - native goes here
  	 glGetTexGenxvOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLfixed  *) (params + paramsOffset));
  	   */

 /**<pre>
  *  Extension: GL_OES_texture_cube_map
  *  
  * C Prototype:
  * void  glGetTexGenxvOES ( 
  * 		 GLenum   coord,
  * 		 GLenum   pname,
  * 		 GLfixed  * params
  * 		 );
  * 
  *</pre>
  * See also <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_cube_map.txt">GL_OES_texture_cube_map</a> 
  **/ 
 public final native static 
  void glGetTexGenxvOES( int coord,
                         int pname,
                         int[] params, int paramsOffset);/*
	 // jnigen - native goes here
  	 glGetTexGenxvOES( (GLenum) coord,
  	                   (GLenum) pname,
  	                   (GLfixed  *) (params + paramsOffset));
  	   */
    /**
     * Enumeration for extension: GL_OES_texture_mirrored_repeat
     */
    // enumerations: 
	 public static final int   GL_MIRRORED_REPEAT_OES = 0x8370;

 

   }// end of class GLES11ExtPack
