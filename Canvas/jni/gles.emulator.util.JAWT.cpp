#include <gles.emulator.util.JAWT.h>

//@line:25
 
    #include "madrigles.h"
    #include <assert.h>
    #include <stdlib.h> 
    #include <jni.h>
    #include <jawt.h>  
    #include "jawt_md.h"  
     
    using namespace std;
    
     
   // static JAWT *mAWT = NULL;

 /////////////////////////////////////////   
    JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getAWT0(JNIEnv* env, jclass clazz) {


//@line:85

	
	    JAWT *awt;
	    awt = (JAWT*) malloc(sizeof(JAWT));
	    if (awt == NULL) {
		 fprintf(stderr, "malloc failed\n");
		 return 0;
	    }

	    awt->version = JAWT_VERSION_1_4;

	    if (JAWT_GetAWT(env, awt) == JNI_FALSE) {
		fprintf(stderr, "AWT not found\n");
		return 0;
	    }

	    return (jlong) awt;	    
	 

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsObj) {


//@line:151
	
	JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsObj;
      	JAWT_DrawingSurfaceInfo *dsi;
       	jint lock;

        ds->env = env;
        lock = ds->Lock(ds);
        if ((lock & JAWT_LOCK_ERROR) != 0) {
	       fprintf(stderr, "Error locking surface. Try again...\n");
	       //try again
	       ds->Unlock(ds);
	       lock = ds->Lock(ds);
	       // check 
	       if ((lock & JAWT_LOCK_ERROR) != 0) {
	        fprintf(stderr, "Error locking surface #2. Give up!\n");
	         return 0;
	       }
        }

       dsi = ds->GetDrawingSurfaceInfo(ds);

       if (dsi == NULL) {
	     fprintf(stderr, "Error GetDrawingSurfaceInfo\n");
	     ds->Unlock(ds);
	     return 0;
       }
       //unlock
       ds->Unlock(ds);
      return (jlong)dsi;
      

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceAWT0(JNIEnv* env, jclass clazz, jobject canvas, jlong awtHandle) {


//@line:205

	    JAWT *awt = (JAWT*) awtHandle;
      	JAWT_DrawingSurface *ds;

      	ds = awt->GetDrawingSurface(env, canvas);
      	if (ds == NULL) {
	    fprintf(stderr, "NULL drawing surface\n");
	    return 0;
      	}
      	return (jlong)ds;
	

}

JNIEXPORT jlong JNICALL Java_gles_emulator_util_JAWT_getDrawingSurfaceWindowIdAWT(JNIEnv* env, jclass clazz, jobject canvas, jlong dsHandle, jlong dsiHandle, jlong display, jint screen) {


//@line:231

			
      JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*) dsHandle;
      JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) dsiHandle;
      jint lock;
      jlong window;
      //update JNI's env*
      
      ds->env = env;
      
      lock = ds->Lock(ds);
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
          printf("Error locking surface \n");
          ds->Unlock(ds);
          lock = ds->Lock(ds);
      }
      
      #ifdef OS_WIN32     
          JAWT_Win32DrawingSurfaceInfo *dsi_win = (JAWT_Win32DrawingSurfaceInfo*) dsi->platformInfo;
          window = (jlong)dsi_win->hwnd;
          //printf("releasing dsi \n");
          //ds->FreeDrawingSurfaceInfo(dsi);
          // Don't free DrawingSurfaceInfo here, otherwise
          // HDC will free in windows JDK1.4 and window
          // is invalid.
      
      #elif OS_UNIX
            jawt_X11DrawingSurfaceInfo *dsi_x11 = (jawt_X11DrawingSurfaceInfo*) dsi->platformInfo;
            window = (jint)dsi_x11->drawable;
            printf("releasing dsi \n");
            ds->FreeDrawingSurfaceInfo(dsi);
      #endif
    
      ds->Unlock(ds);

       return window;      
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_lockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:284

	  if(awt){
	   ((JAWT *) awt)->Lock(env);
	   return JNI_TRUE;
	   }else
	   return JNI_FALSE;
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_unlockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:310

          ((JAWT *) awt)->Unlock(env);
           return JNI_TRUE;
    

}

JNIEXPORT void JNICALL Java_gles_emulator_util_JAWT_freeResource(JNIEnv* env, jclass clazz, jlong awtObj, jlong drawingSurface, jlong drawingSurfaceInfo) {


//@line:321

	    JAWT *awt = (JAWT*) awtObj;
	    JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
    	    JAWT_DrawingSurfaceInfo *dsi = (JAWT_DrawingSurfaceInfo *) drawingSurfaceInfo;
    
    	    ds->env = env;
    	    ds->FreeDrawingSurfaceInfo(dsi);
    	    awt->FreeDrawingSurface(ds);	
	

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_lock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:391
 
        JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
        jint lock = 0;

        ds->env = env;
        lock = ds->Lock(ds);

        if ((lock & JAWT_LOCK_ERROR) != 0) {
            return JNI_FALSE;
        } 
        else 
        if ((lock & JAWT_LOCK_SURFACE_CHANGED) != 0) {
            ds->Unlock(ds);
            
            //try again !
            ds->Lock(ds);            
            if ((lock & JAWT_LOCK_ERROR) != 0) {
                 return JNI_FALSE;
             }else 
                return JNI_TRUE;            
            //return JNI_FALSE;
        } else
        return JNI_TRUE;
        
     

}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_unlock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:425
 
        JAWT_DrawingSurface *ds = (JAWT_DrawingSurface*)drawingSurface;
                
        ds->env = env;
        ds->Unlock(ds);
                                
        return JNI_TRUE;
    

}

static inline jboolean wrapped_Java_gles_emulator_util_JAWT_getHWND
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jlongArray obj_val, long long* val) {

//@line:446
        
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
          
           if((lock & JAWT_LOCK_ERROR) != 0){
               printf("Error locking surface. Try again...\n");
               ds->Unlock(ds);
               lock = ds->Lock(ds);
               
               if((lock & JAWT_LOCK_ERROR) != 0){
                   printf("Error #2 locking surface. Give up. \n");
                   return JNI_FALSE;
               }
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
        
        // release dsi       
        ds->FreeDrawingSurfaceInfo(dsi);
        
        // Unlock the drawing surface
        ds->Unlock(ds);
             
        return JNI_TRUE;                
    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_getHWND(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jlongArray obj_val) {
	long long* val = (long long*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_JAWT_getHWND(env, clazz, dsHandle, dsiHandle, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_JAWT_getRectangle0
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val, int* val) {

//@line:503
        
         JAWT_DrawingSurface *ds;
         JAWT_DrawingSurfaceInfo* dsi;
         jint lock;
                  
         ds  = (JAWT_DrawingSurface *) dsHandle; 
          
         ds->env = env;
         lock = ds->Lock(ds);
         if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                  printf("Error locking surface \n");
                  return JNI_FALSE;
          }
             
         // update dsi
         dsi = ds->GetDrawingSurfaceInfo(ds);
         //ignore older  one             
         //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;
                             
          val[0] = dsi->bounds.x;
              val[1] = dsi->bounds.y;
              val[2] = dsi->bounds.width;
              val[3] = dsi->bounds.height;
          
         // Free the drawing surface info
         ds->FreeDrawingSurfaceInfo(dsi);
        
          // unlock  the drawing surface
          ds->Unlock(ds);   
               
          return JNI_TRUE;
       
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_getRectangle0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val) {
	int* val = (int*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_JAWT_getRectangle0(env, clazz, dsHandle, dsiHandle, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_emulator_util_JAWT_updateDSIEGLhandlers0
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers, long long* EGLhandlers) {

//@line:544

      jint lock;
      // JAWT *awt; 
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
      // awt = (JAWT *) awtHandle;
       
      #ifdef OS_WIN32
              JAWT_Win32DrawingSurfaceInfo* dsi_win;
      #else
              JAWT_X11DrawingSurfaceInfo* dsi_x11;
      #endif
         
      ds = (JAWT_DrawingSurface *)dsHandle;      
      ds->env = env;
      lock = ds->Lock(ds);
     
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
            printf("Error locking surface \n");
            return 0;
       }
          
       // update dsi
       dsi = ds->GetDrawingSurfaceInfo(ds);
       
       if (dsi == NULL) {
           printf("Error getting surface info\n");
           ds->Unlock(ds);
           //awt.FreeDrawingSurface(ds);
            return JNI_FALSE;
       }
       
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
         
         // Free the drawing surface info 
         ds->FreeDrawingSurfaceInfo(dsi);
         
         // unlock the drawing surface
         ds->Unlock(ds);
         return JNI_TRUE;
    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_updateDSIEGLhandlers0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers) {
	long long* EGLhandlers = (long long*)env->GetPrimitiveArrayCritical(obj_EGLhandlers, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_JAWT_updateDSIEGLhandlers0(env, clazz, dsHandle, dsiHandler, obj_EGLhandlers, EGLhandlers);

	env->ReleasePrimitiveArrayCritical(obj_EGLhandlers, EGLhandlers, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_freeDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle) {


//@line:608

      jint lock;
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
         
      ds = (JAWT_DrawingSurface *) dsHandle;
      ds->env = env;
      
      dsi =(JAWT_DrawingSurfaceInfo *) dsiHandle;
      
      // lock DS
      lock = ds->Lock(ds);
      if((lock & JAWT_LOCK_ERROR) != 0 ) {
            printf("Error locking surface \n");
            return JNI_FALSE;
       }
     
      // Free the drawing surface info 
      ds->FreeDrawingSurfaceInfo(dsi);
       
       // unlock the drawing surface
       ds->Unlock(ds);
       return JNI_TRUE; 
    

}

static inline jboolean wrapped_Java_gles_emulator_util_JAWT_getDSIBounds
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val, int* val) {

//@line:633

         JAWT_DrawingSurface *ds;
         JAWT_DrawingSurfaceInfo* dsi;
         jint lock;
                  
         ds  = (JAWT_DrawingSurface *) dsHandle; 
          
         ds->env = env;
         lock = ds->Lock(ds);
         if ((lock & JAWT_LOCK_ERROR) != 0 ) {
             printf("Error locking surface \n");
             return JNI_FALSE;    
          }
             
         // update dsi                    
         dsi = (JAWT_DrawingSurfaceInfo*)dsiHandle;
                             
              val[0] = dsi->bounds.x;
              val[1] = dsi->bounds.y;
              val[2] = dsi->bounds.width;
              val[3] = dsi->bounds.height;
          
          // unlock  the drawing surface
          ds->Unlock(ds);   
               
          return JNI_TRUE;    
    
}

JNIEXPORT jboolean JNICALL Java_gles_emulator_util_JAWT_getDSIBounds(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle, jintArray obj_val) {
	int* val = (int*)env->GetPrimitiveArrayCritical(obj_val, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_emulator_util_JAWT_getDSIBounds(env, clazz, dsHandle, dsiHandle, obj_val, val);

	env->ReleasePrimitiveArrayCritical(obj_val, val, 0);

	return JNI_returnValue;
}

