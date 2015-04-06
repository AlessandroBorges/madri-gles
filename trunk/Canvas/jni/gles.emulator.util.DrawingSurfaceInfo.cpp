#include <gles.emulator.util.DrawingSurfaceInfo.h>

//@line:10

		  
	    #include <madrigles.h>	    
	    #include <assert.h>
	    #include <stdlib.h> 
	    #include <jni.h>
	    #include <jawt.h>  
	    #include "jawt_md.h"	    
	  static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers, long long* EGLhandlers) {

//@line:225

	      jint lock;
	     // JAWT *awt; 
	      JAWT_DrawingSurface* ds;
	      JAWT_DrawingSurfaceInfo* dsi;
	      
	      #ifdef OS_WIN32
                  JAWT_Win32DrawingSurfaceInfo* dsi_win;
              #else
                  JAWT_X11DrawingSurfaceInfo* dsi_x11;
              #endif
	            
	      	      
	     // awt = (JAWT *) awtHandle;
	      ds = (JAWT_DrawingSurface *)dsHandle;
	      
	      ds->env = env;
	      lock = ds->Lock(ds);
              if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                //printf("Error locking surface \n");
                return 0;
              }
              
               // update dsi
	       dsi = ds->GetDrawingSurfaceInfo(ds);
	       //ignore older  one	       
	       //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;	          
	       	       	       
	       // Get the platform-specific drawing info
	       
	       #ifdef OS_WIN32	       
                dsi_win = (JAWT_Win32DrawingSurfaceInfo *) dsi->platformInfo;
	        if(dsi_win == NULL){
	              return JNI_FALSE;
	         }
	          EGLhandlers[0] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType_index 0L
	          EGLhandlers[1] = (jlong) dsi_win->hbitmap; // EGLNativePixmapType_index  1L
	          EGLhandlers[2] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType_index  2L
	        #endif   	         
	        #ifdef OS_UNIX
	         dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
                 if(dsi_x11 == NULL){
                      return JNI_FALSE;
                 }
                 
                  EGLhandlers[0] = (jlong) dsi_x11->display;    // EGLNativeDisplayType_index 0L
                  EGLhandlers[1] = (jlong) dsi_x11->colormapID; // EGLNativePixmapType_index  1L
                  EGLhandlers[2] = (jlong) dsi_x11->drawable;   // EGLNativeWindowType_index  2L
                 
	         #endif   
	         
	         ds->Unlock(ds);
	       return JNI_TRUE;
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers) {
	long long* EGLhandlers = (long long*)env->GetPrimitiveArrayCritical(obj_EGLhandlers, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_updateEGLhandlers0(env, clazz, dsHandle, dsiHandler, obj_EGLhandlers, EGLhandlers);

	env->ReleasePrimitiveArrayCritical(obj_EGLhandlers, EGLhandlers, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val, int* val) {

//@line:323
	     
	      JAWT_DrawingSurface *ds;
	      JAWT_DrawingSurfaceInfo* dsi;
	      jint lock;
	      	       
	       ds  = (JAWT_DrawingSurface *) dsHandle; 
	       
	       ds->env = env;
	       lock = ds->Lock(ds);
                if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                   printf("Error locking surface \n");
                
               }
              
               // update dsi
               dsi = ds->GetDrawingSurfaceInfo(ds);
               //ignore older  one             
               //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
	      	       	          
	       val[0] = dsi->bounds.x;
               val[1] = dsi->bounds.y;
               val[2] = dsi->bounds.width;
               val[3] = dsi->bounds.height;
	       
	       ds->Unlock(ds);   
	            
	       return JNI_TRUE;
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val) {
	int* val = (int*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getRectangle0(env, clazz, dsHandle, dsiHandle, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getHWND
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jlongArray obj_val, long long* val) {

//@line:360
	    
	      JAWT_DrawingSurface *ds;
              JAWT_DrawingSurfaceInfo* dsi;                
              jint lock;  
              
              #ifdef OS_WIN32
                  JAWT_Win32DrawingSurfaceInfo *dsi_win;
              #else
                  JAWT_X11DrawingSurfaceInfo *dsi_x11;
              #endif
                    
              
              ds  = (JAWT_DrawingSurface *) dsHandle;               
              ds->env = env;
              
              lock = ds->Lock(ds);
              
               if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                   printf("Error locking surface \n");
               }
              
               // update dsi
               dsi = ds->GetDrawingSurfaceInfo(ds);
               //ignore older  one             
               //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
                	       
	       // Get the platform-specific drawing info
	       
	       #ifdef OS_WIN32        
                    dsi_win = (JAWT_Win32DrawingSurfaceInfo *)dsi->platformInfo;
                    if(dsi_win == NULL) return JNI_FALSE;                
                    val[0] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType
                    val[1] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType 
                
                #elif OS_UNIX
                     dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
                     if(dsi_x11 == NULL) return JNI_FALSE;                 
                     val[0] = (jlong) dsi_x11->drawable;   // EGLNativeWindowType
                     val[1] = (jlong) dsi_x11->display;    // EGLNativeDisplayType 
                 #endif   
	               
                // Unlock the drawing surface
                ds->Unlock(ds);
                 
                return JNI_TRUE;                
	    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_DrawingSurfaceInfo_getHWND(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jlongArray obj_val) {
	long long* val = (long long*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_DrawingSurfaceInfo_getHWND(env, clazz, dsHandle, dsiHandle, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

