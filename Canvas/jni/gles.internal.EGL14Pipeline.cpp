#include <gles.internal.EGL14Pipeline.h>

//@line:43

        #define EGL_EGLEXT_PROTOTYPES   
        #include <EGL/egl.h>
        #include <EGL/eglext.h> 
        #include <KHR/khrplatform.h>
        
        #include <stdio.h>
        #include <stdlib.h>
        #include <angle.h>
          
        using namespace std;
        
        /////////////////////////////////////////////// 
      JNIEXPORT void JNICALL Java_gles_internal_EGL14Pipeline_nativeClassInit(JNIEnv* env, jclass clazz) {


//@line:109

     // do nothing, meanwhile
    

}

JNIEXPORT jint JNICALL Java_gles_internal_EGL14Pipeline_nEGLGetError(JNIEnv* env, jclass clazz) {


//@line:158

        return (jint) eglGetError();
    

}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglGetPlatformDisplayEXT0
(JNIEnv* env, jclass clazz, jint platform, jlong display, jintArray obj_displayAttributes, int* displayAttributes) {

//@line:260

//    const EGLint displayAttributes[] =
//    {   
//        EGL_PLATFORM_ANGLE_TYPE_ANGLE, EGL_PLATFORM_ANGLE_TYPE_D3D11_ANGLE,
//        EGL_PLATFORM_ANGLE_MAX_VERSION_MAJOR_ANGLE, 9,
//        EGL_PLATFORM_ANGLE_MAX_VERSION_MINOR_ANGLE, 3,
//        EGL_NONE,
//      };

    PFNEGLGETPLATFORMDISPLAYEXTPROC eglGetPlatformDisplayEXT = 
     reinterpret_cast<PFNEGLGETPLATFORMDISPLAYEXTPROC>(eglGetProcAddress("eglGetPlatformDisplayEXT"));

    if (!eglGetPlatformDisplayEXT){
        //throw Exception::CreateException(E_FAIL, L"Failed to get function eglGetPlatformDisplayEXT");
        printf(" eglGetPlatformDisplayEXT - Failed to get function eglGetPlatformDisplayEXT");
        return (jlong) 0;
    }
    
    EGLDisplay mEglDisplay = NULL;
   // mEglDisplay = eglGetPlatformDisplayEXT(EGL_PLATFORM_ANGLE_ANGLE, EGL_DEFAULT_DISPLAY, displayAttributes);
     mEglDisplay = eglGetPlatformDisplayEXT((EGLenum) platform,
                                             (void *) display, 
                                             (EGLint *)displayAttributes); 
    if (mEglDisplay == EGL_NO_DISPLAY){
        //throw Exception::CreateException(E_FAIL, L"Failed to get EGL display");
        printf("eglGetPlatformDisplayEXT - Failed to get EGL display");
        return (jlong)0;
    }
    
    if (eglInitialize(mEglDisplay, NULL, NULL) == EGL_FALSE){
        //throw Exception::CreateException(E_FAIL, L"Failed to initialize EGL");
        printf("eglGetPlatformDisplayEXT - Failed to initialize EGL");
        return (jlong)0;
    }
    
    return (jlong)mEglDisplay;
    
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetPlatformDisplayEXT0(JNIEnv* env, jclass clazz, jint platform, jlong display, jintArray obj_displayAttributes) {
	int* displayAttributes = (int*)env->GetPrimitiveArrayCritical(obj_displayAttributes, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglGetPlatformDisplayEXT0(env, clazz, platform, display, obj_displayAttributes, displayAttributes);

	env->ReleasePrimitiveArrayCritical(obj_displayAttributes, displayAttributes, 0);

	return JNI_returnValue;
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetDisplay0(JNIEnv* env, jclass clazz, jlong display_id) {


//@line:303

          return (jlong) eglGetDisplay((EGLNativeDisplayType)display_id);
    

}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglInitialize0
(JNIEnv* env, jclass clazz, jlong dpy, jintArray obj_major, jint majorOffset, jintArray obj_minor, jint minorOffset, int* major, int* minor) {

//@line:412

        //EGLBoolean eglInitialize ( EGLDisplay dpy, EGLint *major, EGLint *minor )
        return (jboolean) eglInitialize((EGLDisplay) dpy, 
                                        (EGLint *) (major + majorOffset), 
                                        (EGLint *) (minor + minorOffset));
    
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglInitialize0(JNIEnv* env, jclass clazz, jlong dpy, jintArray obj_major, jint majorOffset, jintArray obj_minor, jint minorOffset) {
	int* major = (int*)env->GetPrimitiveArrayCritical(obj_major, 0);
	int* minor = (int*)env->GetPrimitiveArrayCritical(obj_minor, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglInitialize0(env, clazz, dpy, obj_major, majorOffset, obj_minor, minorOffset, major, minor);

	env->ReleasePrimitiveArrayCritical(obj_major, major, 0);
	env->ReleasePrimitiveArrayCritical(obj_minor, minor, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglTerminate0(JNIEnv* env, jclass clazz, jlong dpy) {


//@line:447

       // C function EGLBoolean eglTerminate ( EGLDisplay dpy )        
         return (jboolean) eglTerminate ( (EGLDisplay) dpy );        
    

}

JNIEXPORT jstring JNICALL Java_gles_internal_EGL14Pipeline_eglQueryString0(JNIEnv* env, jclass clazz, jlong dpy, jint name) {


//@line:509

       const char * nativeString = eglQueryString ( (EGLDisplay) dpy, (EGLint) name );
       return env->NewStringUTF(nativeString);
    

}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglGetConfigs0
(JNIEnv* env, jclass clazz, jlong eglDisplay, jlongArray obj_configs, jint config_size, jintArray obj_num_config, long long* configs, int* num_config) {

//@line:610
        
        // C function EGLBoolean eglGetConfigs ( EGLDisplay dpy, EGLConfig *configs, EGLint config_size, EGLint *num_config )
           if(config_size==0){
             configs = NULL; 
           }
           
           return (jboolean)  eglGetConfigs ( (EGLDisplay) eglDisplay, 
                                             (EGLConfig *) configs, 
                                             (EGLint)  config_size, 
                                             (EGLint *) num_config );           
      
        
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglGetConfigs0(JNIEnv* env, jclass clazz, jlong eglDisplay, jlongArray obj_configs, jint config_size, jintArray obj_num_config) {
	long long* configs = (long long*)env->GetPrimitiveArrayCritical(obj_configs, 0);
	int* num_config = (int*)env->GetPrimitiveArrayCritical(obj_num_config, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglGetConfigs0(env, clazz, eglDisplay, obj_configs, config_size, obj_num_config, configs, num_config);

	env->ReleasePrimitiveArrayCritical(obj_configs, configs, 0);
	env->ReleasePrimitiveArrayCritical(obj_num_config, num_config, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglChooseConfig0
(JNIEnv* env, jclass clazz, jlong display, jintArray obj_attrib_list, jint attrib_listOffset, jlongArray obj_configsHandler, jint configLength, jint config_size, jintArray obj_num_config, jint num_configOffset, int* attrib_list, long long* configsHandler, int* num_config) {

//@line:720

            
	    EGLConfig * configs = NULL;
	    if(configLength > 0){
	      configs = new EGLConfig[configLength];
	    } 
	    EGLBoolean val = eglChooseConfig((EGLDisplay) display,
	      	                             (EGLint *) (attrib_list + attrib_listOffset), 
	      	                             configs,
	      	                             (EGLint) config_size,
	      	                             (EGLint *) (num_config + num_configOffset));
	      
	     // cast EGLConfig objects to jlong 
	     // they can be 32 or 64 bits, so lets cast it one by one to jlong 
	     if (configLength > 0) {
	         for (int i = 0; i < configLength; i++) {
	                    configsHandler[i] = (jlong) configs[i];
	          }
                 delete[] configs;
              }
	      
	      return (jboolean) val;
    
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglChooseConfig0(JNIEnv* env, jclass clazz, jlong display, jintArray obj_attrib_list, jint attrib_listOffset, jlongArray obj_configsHandler, jint configLength, jint config_size, jintArray obj_num_config, jint num_configOffset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);
	long long* configsHandler = (long long*)env->GetPrimitiveArrayCritical(obj_configsHandler, 0);
	int* num_config = (int*)env->GetPrimitiveArrayCritical(obj_num_config, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglChooseConfig0(env, clazz, display, obj_attrib_list, attrib_listOffset, obj_configsHandler, configLength, config_size, obj_num_config, num_configOffset, attrib_list, configsHandler, num_config);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);
	env->ReleasePrimitiveArrayCritical(obj_configsHandler, configsHandler, 0);
	env->ReleasePrimitiveArrayCritical(obj_num_config, num_config, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglGetConfigAttrib0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jint attribute, jintArray obj_value, jint offset, int* value) {

//@line:782

                                                    
       EGLBoolean res = eglGetConfigAttrib((EGLDisplay) dpy, 
                                     (EGLConfig) config, 
                                     (EGLint) attribute, 
                                     (EGLint *)(value + offset) );
                       
        return (jboolean) res;                      
      
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglGetConfigAttrib0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jint attribute, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglGetConfigAttrib0(env, clazz, dpy, config, attribute, obj_value, offset, value);

	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

	return JNI_returnValue;
}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglCreateWindowSurface0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong win, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:807
                
                
                EGLSurface surface = eglCreateWindowSurface((EGLDisplay) dpy,
                                                            (EGLConfig) config,
                                                            (EGLNativeWindowType) win,
                                                             (EGLint *) (attrib_list + offset) );
                
                return (jlong) surface;
       
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateWindowSurface0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong win, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreateWindowSurface0(env, clazz, dpy, config, win, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglCreateWindowSurfaceTexture0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong win, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:861
    
    
       EGLSurface  surface = eglCreateWindowSurface(
                                            (EGLDisplay)dpy,
                                            (EGLConfig)config,
                                            (EGLNativeWindowType) win,
                                            (EGLint *)(attrib_list + offset) );
    
       return (jlong) surface;
    
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateWindowSurfaceTexture0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong win, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreateWindowSurfaceTexture0(env, clazz, dpy, config, win, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePbufferSurface0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:970

       EGLSurface  surface = eglCreatePbufferSurface(
                                (EGLDisplay)dpy,
                                (EGLConfig)config,
                                (EGLint *)(attrib_list + offset));
                                
        return (jlong) surface;  
    
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePbufferSurface0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePbufferSurface0(env, clazz, dpy, config, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePixmapSurface0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jint pixmap, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:1019

        
         // no op
          return JNI_FALSE;
        
        
}

JNIEXPORT jobject JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePixmapSurface0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jint pixmap, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jobject JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePixmapSurface0(env, clazz, dpy, config, pixmap, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglDestroySurface0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface) {


//@line:1051
                    
      return (jboolean) eglDestroySurface ( (EGLDisplay) dpy, (EGLSurface) surface );
     

}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglQuerySurface0
(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jint attribute, jintArray obj_value, jint offset, int* value) {

//@line:1094

        
        return (jboolean) eglQuerySurface((EGLDisplay) dpy, 
                                          (EGLSurface) surface, 
                                          (EGLint) attribute, 
                                          (EGLint *)(value + offset));
         
      
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglQuerySurface0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jint attribute, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglQuerySurface0(env, clazz, dpy, surface, attribute, obj_value, offset, value);

	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglBindAPI0(JNIEnv* env, jclass clazz, jint api) {


//@line:1119

       return (jboolean) eglBindAPI((EGLenum) api);
    

}

JNIEXPORT jint JNICALL Java_gles_internal_EGL14Pipeline_eglQueryAPI0(JNIEnv* env, jclass clazz) {


//@line:1137

         return (jint) eglQueryAPI();
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitClient0(JNIEnv* env, jclass clazz) {


//@line:1156

      return (jboolean) eglWaitClient();
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglReleaseThread0(JNIEnv* env, jclass clazz) {


//@line:1173

      return (jboolean) eglReleaseThread();
    

}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePbufferFromClientBuffer0
(JNIEnv* env, jclass clazz, jlong dpy, jint buftype, jlong buffer, jlong config, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:1266

        
        EGLSurface surface = eglCreatePbufferFromClientBuffer ( (EGLDisplay) dpy, 
                                                      (EGLenum) buftype, 
                                                      reinterpret_cast<EGLClientBuffer>(buffer),
                                                      (EGLConfig) config, 
                                                      (EGLint *) attrib_list );
        return (jlong) surface;
        
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreatePbufferFromClientBuffer0(JNIEnv* env, jclass clazz, jlong dpy, jint buftype, jlong buffer, jlong config, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreatePbufferFromClientBuffer0(env, clazz, dpy, buftype, buffer, config, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSurfaceAttrib0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jint attribute, jint value) {


//@line:1311
        
        return (jboolean) eglSurfaceAttrib((EGLDisplay) dpy, 
                                           (EGLSurface) surface, 
                                           (EGLint) attribute, 
                                           (EGLint) value );
        
        

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglBindTexImage0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jint buffer) {


//@line:1344
        
        return (jboolean) eglBindTexImage( (EGLDisplay) dpy, (EGLSurface) surface, (EGLint) buffer );        
        

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglReleaseTexImage0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jint buffer) {


//@line:1374

        return (jboolean) eglReleaseTexImage((EGLDisplay) dpy, 
                                             (EGLSurface) surface, 
                                             (EGLint) buffer );
        
        

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSwapInterval0(JNIEnv* env, jclass clazz, jlong dpy, jint interval) {


//@line:1401

         return (jboolean) eglSwapInterval((EGLDisplay) dpy, (EGLint) interval);
           
        

}

static inline jlong wrapped_Java_gles_internal_EGL14Pipeline_eglCreateContext0
(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong share_context, jintArray obj_attrib_list, jint offset, int* attrib_list) {

//@line:1454

                                                     
       return (jlong) eglCreateContext((EGLDisplay) dpy, 
                                        (EGLConfig) config, 
                                        (EGLContext) share_context, 
                                        (EGLint *)(attrib_list+offset)); 
                                                     
      
}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglCreateContext0(JNIEnv* env, jclass clazz, jlong dpy, jlong config, jlong share_context, jintArray obj_attrib_list, jint offset) {
	int* attrib_list = (int*)env->GetPrimitiveArrayCritical(obj_attrib_list, 0);

	jlong JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglCreateContext0(env, clazz, dpy, config, share_context, obj_attrib_list, offset, attrib_list);

	env->ReleasePrimitiveArrayCritical(obj_attrib_list, attrib_list, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglDestroyContext0(JNIEnv* env, jclass clazz, jlong dpy, jlong ctx) {


//@line:1486

     return (jboolean) eglDestroyContext((EGLDisplay) dpy, (EGLContext) ctx);
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglMakeCurrent0(JNIEnv* env, jclass clazz, jlong dpy, jlong draw, jlong read, jlong ctx) {


//@line:1526

                                                
       return (jboolean) eglMakeCurrent((EGLDisplay) dpy, 
                                        (EGLSurface) draw, 
                                        (EGLSurface) read, 
                                        (EGLContext) ctx );                             
     

}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentContext0(JNIEnv* env, jclass clazz) {


//@line:1550

       return (jlong) eglGetCurrentContext();
    

}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentSurface0(JNIEnv* env, jclass clazz, jint readdraw) {


//@line:1573

        return (jlong) eglGetCurrentSurface((EGLint)readdraw);     
    

}

JNIEXPORT jlong JNICALL Java_gles_internal_EGL14Pipeline_eglGetCurrentDisplay0(JNIEnv* env, jclass clazz) {


//@line:1589
        
       return (jlong) eglGetCurrentDisplay();
    

}

static inline jboolean wrapped_Java_gles_internal_EGL14Pipeline_eglQueryContext0
(JNIEnv* env, jclass clazz, jlong dpy, jlong ctx, jint attribute, jintArray obj_value, jint offset, int* value) {

//@line:1631

         return (jboolean) eglQueryContext((EGLDisplay)dpy,
                                             (EGLContext)ctx,
                                             (EGLint) attribute,
                                             (EGLint *)(value + offset));                            
       
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglQueryContext0(JNIEnv* env, jclass clazz, jlong dpy, jlong ctx, jint attribute, jintArray obj_value, jint offset) {
	int* value = (int*)env->GetPrimitiveArrayCritical(obj_value, 0);

	jboolean JNI_returnValue = wrapped_Java_gles_internal_EGL14Pipeline_eglQueryContext0(env, clazz, dpy, ctx, attribute, obj_value, offset, value);

	env->ReleasePrimitiveArrayCritical(obj_value, value, 0);

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitGL0(JNIEnv* env, jclass clazz) {


//@line:1653

        return (jboolean) eglWaitGL();
    

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglWaitNative0(JNIEnv* env, jclass clazz, jint engine) {


//@line:1667
        
        return (jboolean) eglWaitNative((EGLint) engine);        
     

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglSwapBuffers0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface) {


//@line:1692
 
        return (jboolean) eglSwapBuffers ( (EGLDisplay) dpy, (EGLSurface) surface );        
       

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglCopyBuffers0(JNIEnv* env, jclass clazz, jlong dpy, jlong surface, jlong target) {


//@line:1726
        
       return (jboolean) eglCopyBuffers((EGLDisplay) dpy, 
                                        (EGLSurface) surface, 
                                        (EGLNativePixmapType) target);  
       

}

JNIEXPORT jboolean JNICALL Java_gles_internal_EGL14Pipeline_eglPresentationTimeANDROID0(JNIEnv* env, jclass clazz, jlong dpy, jlong sur, jlong time) {


//@line:1761

        #ifdef   eglPresentationTimeANDROID                                                   
        return (jboolean) eglPresentationTimeANDROID((EGLDisplay) dpy,
                                                     (EGLSurface) sur,
                                                     (EGLnsecsANDROID)  time); 
         #else
          return JNI_FALSE;
         #endif                                                                        
      

}

