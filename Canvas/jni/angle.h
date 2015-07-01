 
#ifndef _angle_h_
#define _angle_h_
  
//  Accepted as the <platform> argument of eglGetPlatformDisplayEXT:
#define        EGL_PLATFORM_ANGLE_ANGLE                           0x3201
//    Accepted as an attribute name in the <attrib_list> argument of
//    eglGetPlatformDisplayEXT:
#define        EGL_PLATFORM_ANGLE_TYPE_ANGLE                      0x3202
//    Accepted as values for the EGL_PLATFORM_ANGLE_TYPE_ANGLE attribute:
#define        EGL_PLATFORM_ANGLE_TYPE_DEFAULT_ANGLE              0x3203



//    Accepted as values for the EGL_PLATFORM_ANGLE_TYPE_ANGLE attribute:

#define        EGL_PLATFORM_ANGLE_TYPE_D3D9_ANGLE                 0x3207
#define        EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE                0x3208

//    Accepted as an attribute name in the <attrib_list> argument of
//    eglGetPlatformDisplayEXT:

#define       EGL_PLATFORM_ANGLE_DEVICE_TYPE_ANGLE               0x3209
#define        EGL_PLATFORM_ANGLE_ENABLE_AUTOMATIC_TRIM_ANGLE     0x320F

//    Accepted as values for the EGL_PLATFORM_ANGLE_DEVICE_TYPE_ANGLE attribute:

#define        EGL_PLATFORM_ANGLE_DEVICE_TYPE_HARDWARE_ANGLE      0x320A
#define        EGL_PLATFORM_ANGLE_DEVICE_TYPE_WARP_ANGLE          0x320B
#define        EGL_PLATFORM_ANGLE_DEVICE_TYPE_REFERENCE_ANGLE     0x320C


#ifndef EGL_EXT_platform_base
#define EGL_EXT_platform_base 1
typedef EGLDisplay (EGLAPIENTRYP PFNEGLGETPLATFORMDISPLAYEXTPROC) (EGLenum platform, void *native_display, const EGLint *attrib_list);
typedef EGLSurface (EGLAPIENTRYP PFNEGLCREATEPLATFORMWINDOWSURFACEEXTPROC) (EGLDisplay dpy, EGLConfig config, void *native_window, const EGLint *attrib_list);
typedef EGLSurface (EGLAPIENTRYP PFNEGLCREATEPLATFORMPIXMAPSURFACEEXTPROC) (EGLDisplay dpy, EGLConfig config, void *native_pixmap, const EGLint *attrib_list);
#ifdef EGL_EGLEXT_PROTOTYPES
EGLAPI EGLDisplay EGLAPIENTRY eglGetPlatformDisplayEXT (EGLenum platform, void *native_display, const EGLint *attrib_list);
EGLAPI EGLSurface EGLAPIENTRY eglCreatePlatformWindowSurfaceEXT (EGLDisplay dpy, EGLConfig config, void *native_window, const EGLint *attrib_list);
EGLAPI EGLSurface EGLAPIENTRY eglCreatePlatformPixmapSurfaceEXT (EGLDisplay dpy, EGLConfig config, void *native_pixmap, const EGLint *attrib_list);
#endif
#endif /* EGL_EXT_platform_base */


#endif // _angle_h_