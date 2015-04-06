#ifndef __madrigles_h_
#define __madrigles_h_

////////////////////////////////
// WIN32 & WIN64
///////////////////////////////
#if defined(_WIN32) || defined(__VC32__) && !defined(__CYGWIN__) && !defined(__SCITECH_SNAP__) /* Win32 and WinCE */
#ifndef WIN32_LEAN_AND_MEAN
	#define WIN32_LEAN_AND_MEAN 1
#endif
// define OS platform
#ifndef OS_WIN32
	#define OS_WIN32 1
#endif
#include <windows.h>
#include <stdio.h>
#include <stdlib.h>


/*  To use this exported function of dll, include this header
 *  in your project.
 */

#ifndef BUILD_DLL
 #define BUILD_DLL
#endif

#ifdef BUILD_DLL
    #define DLL_EXPORT __declspec(dllexport)
#else
    #define DLL_EXPORT __declspec(dllimport)
#endif

//typedef HDC     EGLNativeDisplayType;
//typedef HBITMAP EGLNativePixmapType;
//typedef HWND    EGLNativeWindowType;

////////////////////////////////
// ANDROID
///////////////////////////////
#elif defined(__ANDROID__) || defined(ANDROID)
// define OS platform
#ifndef OS_ANDROID
	#define OS_ANDROID 1
#endif

#include <android/native_window.h>

//struct egl_native_pixmap_t;
//typedef struct ANativeWindow*           EGLNativeWindowType;
//typedef struct egl_native_pixmap_t*     EGLNativePixmapType;
//typedef void*                           EGLNativeDisplayType;

////////////////////////////////
// UNIX
///////////////////////////////
#elif defined(__unix__) || defined(__APPLE__)
// define OS platform
#ifndef OS_UNIX
	#define OS_UNIX 1
#endif

/* X11 (tentative)  */
#include <stdio.h>
#include <stdlib.h>

#include <X11/Xlib.h>
#include <X11/Xutil.h>
#include <jni.h>
#include <jawt.h> 
#include "jawt_md.h"

//typedef Display *EGLNativeDisplayType;
//typedef Pixmap   EGLNativePixmapType;
//typedef Window   EGLNativeWindowType;

#else
#error "Platform not recognized"
#endif

#endif /* __madrigles_h_ */
