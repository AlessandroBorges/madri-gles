#include <gles.emulator.util.DrawingSurfaceInfo.h>

//@line:10

		  
	    #include "main.h"	    
	    #include <assert.h>
	    #include <stdlib.h> 
	    #include <jni.h>
	    #include <jawt.h>  
	    #include "jawt_md.h"
	    
	  static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0
(JNIEnv* env, jclass clazz, jlong dsiHandler, jlongArray obj_EGLhandlers, long long* EGLhandlers) {

//@line:215

	      
	      JAWT_DrawingSurfaceInfo* dsi;	     
	      JAWT_Win32DrawingSurfaceInfo* dsi_win;	      
	      	       
	       dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;	          
	       	       	       
	       // Get the platform-specific drawing info
	       // Win32
                dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
	        if(dsi_win == NULL){
	              return JNI_FALSE;
	          }
	          EGLhandlers[0] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType_index 0L
	          EGLhandlers[1] = (jlong) dsi_win->hbitmap; // EGLNativePixmapType_index  1L
	          EGLhandlers[2] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType_index  2L 	         
	            
	       return JNI_TRUE;
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0(JNIEnv* env, jclass clazz, jlong dsiHandler, jlongArray obj_EGLhandlers) {
	long long* EGLhandlers = (long long*)env->GetPrimitiveArrayCritical(obj_EGLhandlers, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0(env, clazz, dsiHandler, obj_EGLhandlers, EGLhandlers);

	env->ReleasePrimitiveArrayCritical(obj_EGLhandlers, EGLhandlers, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0
(JNIEnv* env, jclass clazz, jlong dsiHandler, jintArray obj_val, int* val) {

//@line:276

	     // JAWT_DrawingSurface *ds;
	      JAWT_DrawingSurfaceInfo* dsi;
	      JAWT_Win32DrawingSurfaceInfo* dsi_win;	      
	      	       
	       dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
	      // ds = dsi->ds;	       
	       
	       	       	       
	       // Get the platform-specific drawing info
                dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
	        if(dsi_win == NULL){
	              return JNI_FALSE;
	          }
	          
	       val[0] = dsi->bounds.x;
               val[1] = dsi->bounds.y;
               val[2] = dsi->bounds.width;
               val[3] = dsi->bounds.height;
	            
	       return JNI_TRUE;
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0(JNIEnv* env, jclass clazz, jlong dsiHandler, jintArray obj_val) {
	int* val = (int*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0(env, clazz, dsiHandler, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getHWND
(JNIEnv* env, jclass clazz, jlong dsiHandler, jlongArray obj_val, long long* val) {

//@line:305

	    
	       JAWT_DrawingSurfaceInfo* dsi;
	       JAWT_Win32DrawingSurfaceInfo* dsi_win;
	     //  jint lock;
	       jlong HWND;
	       jlong HDC;
	       
	       dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
	       
	       //lock = ds->Lock(ds);
               //  assert((lock & JAWT_LOCK_ERROR) == 0);
	       	       
	       // Get the platform-specific drawing info
                dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
	        if(dsi_win == NULL){
	              return JNI_FALSE;	              
	        }else{
	             HWND = (jlong) dsi_win->hwnd;
	             HDC = (jlong) dsi_win->hdc;
	        }
	        
	        val[0] = HWND;
	        val[1] = HDC;
	        
                 // Unlock the drawing surface
                // ds->Unlock(ds);
                 
                return JNI_TRUE;                
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_getHWND(JNIEnv* env, jclass clazz, jlong dsiHandler, jlongArray obj_val) {
	long long* val = (long long*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getHWND(env, clazz, dsiHandler, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

