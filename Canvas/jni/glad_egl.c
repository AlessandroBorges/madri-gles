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
#include <glad/glad_egl.h>

int gladLoadEGL(void) {
    return gladLoadEGLLoader((GLADloadproc)eglGetProcAddress);
}

PFNEGLSETBLOBCACHEFUNCSANDROIDPROC glad_eglSetBlobCacheFuncsANDROID;
PFNEGLDUPNATIVEFENCEFDANDROIDPROC glad_eglDupNativeFenceFDANDROID;
PFNEGLQUERYSURFACEPOINTERANGLEPROC glad_eglQuerySurfacePointerANGLE;
PFNEGLQUERYDEVICEATTRIBEXTPROC glad_eglQueryDeviceAttribEXT;
PFNEGLQUERYDEVICESTRINGEXTPROC glad_eglQueryDeviceStringEXT;
PFNEGLQUERYDEVICESEXTPROC glad_eglQueryDevicesEXT;
PFNEGLQUERYDISPLAYATTRIBEXTPROC glad_eglQueryDisplayAttribEXT;
PFNEGLGETOUTPUTLAYERSEXTPROC glad_eglGetOutputLayersEXT;
PFNEGLGETOUTPUTPORTSEXTPROC glad_eglGetOutputPortsEXT;
PFNEGLOUTPUTLAYERATTRIBEXTPROC glad_eglOutputLayerAttribEXT;
PFNEGLQUERYOUTPUTLAYERATTRIBEXTPROC glad_eglQueryOutputLayerAttribEXT;
PFNEGLQUERYOUTPUTLAYERSTRINGEXTPROC glad_eglQueryOutputLayerStringEXT;
PFNEGLOUTPUTPORTATTRIBEXTPROC glad_eglOutputPortAttribEXT;
PFNEGLQUERYOUTPUTPORTATTRIBEXTPROC glad_eglQueryOutputPortAttribEXT;
PFNEGLQUERYOUTPUTPORTSTRINGEXTPROC glad_eglQueryOutputPortStringEXT;
PFNEGLGETPLATFORMDISPLAYEXTPROC glad_eglGetPlatformDisplayEXT;
PFNEGLCREATEPLATFORMWINDOWSURFACEEXTPROC glad_eglCreatePlatformWindowSurfaceEXT;
PFNEGLCREATEPLATFORMPIXMAPSURFACEEXTPROC glad_eglCreatePlatformPixmapSurfaceEXT;
PFNEGLSTREAMCONSUMEROUTPUTEXTPROC glad_eglStreamConsumerOutputEXT;
PFNEGLSWAPBUFFERSWITHDAMAGEEXTPROC glad_eglSwapBuffersWithDamageEXT;
PFNEGLCREATEPIXMAPSURFACEHIPROC glad_eglCreatePixmapSurfaceHI;
PFNEGLCREATESYNC64KHRPROC glad_eglCreateSync64KHR;
PFNEGLCREATESYNCKHRPROC glad_eglCreateSyncKHR;
PFNEGLDESTROYSYNCKHRPROC glad_eglDestroySyncKHR;
PFNEGLCLIENTWAITSYNCKHRPROC glad_eglClientWaitSyncKHR;
PFNEGLGETSYNCATTRIBKHRPROC glad_eglGetSyncAttribKHR;
PFNEGLCREATEIMAGEKHRPROC glad_eglCreateImageKHR;
PFNEGLDESTROYIMAGEKHRPROC glad_eglDestroyImageKHR;
PFNEGLLOCKSURFACEKHRPROC glad_eglLockSurfaceKHR;
PFNEGLUNLOCKSURFACEKHRPROC glad_eglUnlockSurfaceKHR;
PFNEGLQUERYSURFACE64KHRPROC glad_eglQuerySurface64KHR;
PFNEGLSETDAMAGEREGIONKHRPROC glad_eglSetDamageRegionKHR;
PFNEGLSIGNALSYNCKHRPROC glad_eglSignalSyncKHR;
PFNEGLCREATESTREAMKHRPROC glad_eglCreateStreamKHR;
PFNEGLDESTROYSTREAMKHRPROC glad_eglDestroyStreamKHR;
PFNEGLSTREAMATTRIBKHRPROC glad_eglStreamAttribKHR;
PFNEGLQUERYSTREAMKHRPROC glad_eglQueryStreamKHR;
PFNEGLQUERYSTREAMU64KHRPROC glad_eglQueryStreamu64KHR;
PFNEGLSTREAMCONSUMERGLTEXTUREEXTERNALKHRPROC glad_eglStreamConsumerGLTextureExternalKHR;
PFNEGLSTREAMCONSUMERACQUIREKHRPROC glad_eglStreamConsumerAcquireKHR;
PFNEGLSTREAMCONSUMERRELEASEKHRPROC glad_eglStreamConsumerReleaseKHR;
PFNEGLGETSTREAMFILEDESCRIPTORKHRPROC glad_eglGetStreamFileDescriptorKHR;
PFNEGLCREATESTREAMFROMFILEDESCRIPTORKHRPROC glad_eglCreateStreamFromFileDescriptorKHR;
PFNEGLQUERYSTREAMTIMEKHRPROC glad_eglQueryStreamTimeKHR;
PFNEGLCREATESTREAMPRODUCERSURFACEKHRPROC glad_eglCreateStreamProducerSurfaceKHR;
PFNEGLSWAPBUFFERSWITHDAMAGEKHRPROC glad_eglSwapBuffersWithDamageKHR;
PFNEGLWAITSYNCKHRPROC glad_eglWaitSyncKHR;
PFNEGLCREATEDRMIMAGEMESAPROC glad_eglCreateDRMImageMESA;
PFNEGLEXPORTDRMIMAGEMESAPROC glad_eglExportDRMImageMESA;
PFNEGLEXPORTDMABUFIMAGEQUERYMESAPROC glad_eglExportDMABUFImageQueryMESA;
PFNEGLEXPORTDMABUFIMAGEMESAPROC glad_eglExportDMABUFImageMESA;
PFNEGLSWAPBUFFERSREGIONNOKPROC glad_eglSwapBuffersRegionNOK;
PFNEGLSWAPBUFFERSREGION2NOKPROC glad_eglSwapBuffersRegion2NOK;
PFNEGLQUERYNATIVEDISPLAYNVPROC glad_eglQueryNativeDisplayNV;
PFNEGLQUERYNATIVEWINDOWNVPROC glad_eglQueryNativeWindowNV;
PFNEGLQUERYNATIVEPIXMAPNVPROC glad_eglQueryNativePixmapNV;
PFNEGLPOSTSUBBUFFERNVPROC glad_eglPostSubBufferNV;
PFNEGLCREATESTREAMSYNCNVPROC glad_eglCreateStreamSyncNV;
PFNEGLCREATEFENCESYNCNVPROC glad_eglCreateFenceSyncNV;
PFNEGLDESTROYSYNCNVPROC glad_eglDestroySyncNV;
PFNEGLFENCENVPROC glad_eglFenceNV;
PFNEGLCLIENTWAITSYNCNVPROC glad_eglClientWaitSyncNV;
PFNEGLSIGNALSYNCNVPROC glad_eglSignalSyncNV;
PFNEGLGETSYNCATTRIBNVPROC glad_eglGetSyncAttribNV;
PFNEGLGETSYSTEMTIMEFREQUENCYNVPROC glad_eglGetSystemTimeFrequencyNV;
PFNEGLGETSYSTEMTIMENVPROC glad_eglGetSystemTimeNV;

/*
 * Functions
 */
static void load_EGL_ANDROID_blob_cache(GLADloadproc load) {
	glad_eglSetBlobCacheFuncsANDROID = (PFNEGLSETBLOBCACHEFUNCSANDROIDPROC)load("eglSetBlobCacheFuncsANDROID");
}
static void load_EGL_ANDROID_native_fence_sync(GLADloadproc load) {
	glad_eglDupNativeFenceFDANDROID = (PFNEGLDUPNATIVEFENCEFDANDROIDPROC)load("eglDupNativeFenceFDANDROID");
}
static void load_EGL_ANGLE_query_surface_pointer(GLADloadproc load) {
	glad_eglQuerySurfacePointerANGLE = (PFNEGLQUERYSURFACEPOINTERANGLEPROC)load("eglQuerySurfacePointerANGLE");
}
static void load_EGL_EXT_device_base(GLADloadproc load) {
	glad_eglQueryDeviceAttribEXT = (PFNEGLQUERYDEVICEATTRIBEXTPROC)load("eglQueryDeviceAttribEXT");
	glad_eglQueryDeviceStringEXT = (PFNEGLQUERYDEVICESTRINGEXTPROC)load("eglQueryDeviceStringEXT");
	glad_eglQueryDevicesEXT = (PFNEGLQUERYDEVICESEXTPROC)load("eglQueryDevicesEXT");
	glad_eglQueryDisplayAttribEXT = (PFNEGLQUERYDISPLAYATTRIBEXTPROC)load("eglQueryDisplayAttribEXT");
}
static void load_EGL_EXT_device_enumeration(GLADloadproc load) {
	glad_eglQueryDevicesEXT = (PFNEGLQUERYDEVICESEXTPROC)load("eglQueryDevicesEXT");
}
static void load_EGL_EXT_device_query(GLADloadproc load) {
	glad_eglQueryDeviceAttribEXT = (PFNEGLQUERYDEVICEATTRIBEXTPROC)load("eglQueryDeviceAttribEXT");
	glad_eglQueryDeviceStringEXT = (PFNEGLQUERYDEVICESTRINGEXTPROC)load("eglQueryDeviceStringEXT");
	glad_eglQueryDisplayAttribEXT = (PFNEGLQUERYDISPLAYATTRIBEXTPROC)load("eglQueryDisplayAttribEXT");
}
static void load_EGL_EXT_output_base(GLADloadproc load) {
	glad_eglGetOutputLayersEXT = (PFNEGLGETOUTPUTLAYERSEXTPROC)load("eglGetOutputLayersEXT");
	glad_eglGetOutputPortsEXT = (PFNEGLGETOUTPUTPORTSEXTPROC)load("eglGetOutputPortsEXT");
	glad_eglOutputLayerAttribEXT = (PFNEGLOUTPUTLAYERATTRIBEXTPROC)load("eglOutputLayerAttribEXT");
	glad_eglQueryOutputLayerAttribEXT = (PFNEGLQUERYOUTPUTLAYERATTRIBEXTPROC)load("eglQueryOutputLayerAttribEXT");
	glad_eglQueryOutputLayerStringEXT = (PFNEGLQUERYOUTPUTLAYERSTRINGEXTPROC)load("eglQueryOutputLayerStringEXT");
	glad_eglOutputPortAttribEXT = (PFNEGLOUTPUTPORTATTRIBEXTPROC)load("eglOutputPortAttribEXT");
	glad_eglQueryOutputPortAttribEXT = (PFNEGLQUERYOUTPUTPORTATTRIBEXTPROC)load("eglQueryOutputPortAttribEXT");
	glad_eglQueryOutputPortStringEXT = (PFNEGLQUERYOUTPUTPORTSTRINGEXTPROC)load("eglQueryOutputPortStringEXT");
}
static void load_EGL_EXT_platform_base(GLADloadproc load) {
	glad_eglGetPlatformDisplayEXT = (PFNEGLGETPLATFORMDISPLAYEXTPROC)load("eglGetPlatformDisplayEXT");
	glad_eglCreatePlatformWindowSurfaceEXT = (PFNEGLCREATEPLATFORMWINDOWSURFACEEXTPROC)load("eglCreatePlatformWindowSurfaceEXT");
	glad_eglCreatePlatformPixmapSurfaceEXT = (PFNEGLCREATEPLATFORMPIXMAPSURFACEEXTPROC)load("eglCreatePlatformPixmapSurfaceEXT");
}
static void load_EGL_EXT_stream_consumer_egloutput(GLADloadproc load) {
	glad_eglStreamConsumerOutputEXT = (PFNEGLSTREAMCONSUMEROUTPUTEXTPROC)load("eglStreamConsumerOutputEXT");
}
static void load_EGL_EXT_swap_buffers_with_damage(GLADloadproc load) {
	glad_eglSwapBuffersWithDamageEXT = (PFNEGLSWAPBUFFERSWITHDAMAGEEXTPROC)load("eglSwapBuffersWithDamageEXT");
}
static void load_EGL_HI_clientpixmap(GLADloadproc load) {
	glad_eglCreatePixmapSurfaceHI = (PFNEGLCREATEPIXMAPSURFACEHIPROC)load("eglCreatePixmapSurfaceHI");
}
static void load_EGL_KHR_cl_event2(GLADloadproc load) {
	glad_eglCreateSync64KHR = (PFNEGLCREATESYNC64KHRPROC)load("eglCreateSync64KHR");
}
static void load_EGL_KHR_fence_sync(GLADloadproc load) {
	glad_eglCreateSyncKHR = (PFNEGLCREATESYNCKHRPROC)load("eglCreateSyncKHR");
	glad_eglDestroySyncKHR = (PFNEGLDESTROYSYNCKHRPROC)load("eglDestroySyncKHR");
	glad_eglClientWaitSyncKHR = (PFNEGLCLIENTWAITSYNCKHRPROC)load("eglClientWaitSyncKHR");
	glad_eglGetSyncAttribKHR = (PFNEGLGETSYNCATTRIBKHRPROC)load("eglGetSyncAttribKHR");
}
static void load_EGL_KHR_image(GLADloadproc load) {
	glad_eglCreateImageKHR = (PFNEGLCREATEIMAGEKHRPROC)load("eglCreateImageKHR");
	glad_eglDestroyImageKHR = (PFNEGLDESTROYIMAGEKHRPROC)load("eglDestroyImageKHR");
}
static void load_EGL_KHR_image_base(GLADloadproc load) {
	glad_eglCreateImageKHR = (PFNEGLCREATEIMAGEKHRPROC)load("eglCreateImageKHR");
	glad_eglDestroyImageKHR = (PFNEGLDESTROYIMAGEKHRPROC)load("eglDestroyImageKHR");
}
static void load_EGL_KHR_lock_surface(GLADloadproc load) {
	glad_eglLockSurfaceKHR = (PFNEGLLOCKSURFACEKHRPROC)load("eglLockSurfaceKHR");
	glad_eglUnlockSurfaceKHR = (PFNEGLUNLOCKSURFACEKHRPROC)load("eglUnlockSurfaceKHR");
}
static void load_EGL_KHR_lock_surface3(GLADloadproc load) {
	glad_eglLockSurfaceKHR = (PFNEGLLOCKSURFACEKHRPROC)load("eglLockSurfaceKHR");
	glad_eglUnlockSurfaceKHR = (PFNEGLUNLOCKSURFACEKHRPROC)load("eglUnlockSurfaceKHR");
	glad_eglQuerySurface64KHR = (PFNEGLQUERYSURFACE64KHRPROC)load("eglQuerySurface64KHR");
}
static void load_EGL_KHR_partial_update(GLADloadproc load) {
	glad_eglSetDamageRegionKHR = (PFNEGLSETDAMAGEREGIONKHRPROC)load("eglSetDamageRegionKHR");
}
static void load_EGL_KHR_reusable_sync(GLADloadproc load) {
	glad_eglCreateSyncKHR = (PFNEGLCREATESYNCKHRPROC)load("eglCreateSyncKHR");
	glad_eglDestroySyncKHR = (PFNEGLDESTROYSYNCKHRPROC)load("eglDestroySyncKHR");
	glad_eglClientWaitSyncKHR = (PFNEGLCLIENTWAITSYNCKHRPROC)load("eglClientWaitSyncKHR");
	glad_eglSignalSyncKHR = (PFNEGLSIGNALSYNCKHRPROC)load("eglSignalSyncKHR");
	glad_eglGetSyncAttribKHR = (PFNEGLGETSYNCATTRIBKHRPROC)load("eglGetSyncAttribKHR");
}
static void load_EGL_KHR_stream(GLADloadproc load) {
	glad_eglCreateStreamKHR = (PFNEGLCREATESTREAMKHRPROC)load("eglCreateStreamKHR");
	glad_eglDestroyStreamKHR = (PFNEGLDESTROYSTREAMKHRPROC)load("eglDestroyStreamKHR");
	glad_eglStreamAttribKHR = (PFNEGLSTREAMATTRIBKHRPROC)load("eglStreamAttribKHR");
	glad_eglQueryStreamKHR = (PFNEGLQUERYSTREAMKHRPROC)load("eglQueryStreamKHR");
	glad_eglQueryStreamu64KHR = (PFNEGLQUERYSTREAMU64KHRPROC)load("eglQueryStreamu64KHR");
}
static void load_EGL_KHR_stream_consumer_gltexture(GLADloadproc load) {
	glad_eglStreamConsumerGLTextureExternalKHR = (PFNEGLSTREAMCONSUMERGLTEXTUREEXTERNALKHRPROC)load("eglStreamConsumerGLTextureExternalKHR");
	glad_eglStreamConsumerAcquireKHR = (PFNEGLSTREAMCONSUMERACQUIREKHRPROC)load("eglStreamConsumerAcquireKHR");
	glad_eglStreamConsumerReleaseKHR = (PFNEGLSTREAMCONSUMERRELEASEKHRPROC)load("eglStreamConsumerReleaseKHR");
}
static void load_EGL_KHR_stream_cross_process_fd(GLADloadproc load) {
	glad_eglGetStreamFileDescriptorKHR = (PFNEGLGETSTREAMFILEDESCRIPTORKHRPROC)load("eglGetStreamFileDescriptorKHR");
	glad_eglCreateStreamFromFileDescriptorKHR = (PFNEGLCREATESTREAMFROMFILEDESCRIPTORKHRPROC)load("eglCreateStreamFromFileDescriptorKHR");
}
static void load_EGL_KHR_stream_fifo(GLADloadproc load) {
	glad_eglQueryStreamTimeKHR = (PFNEGLQUERYSTREAMTIMEKHRPROC)load("eglQueryStreamTimeKHR");
}
static void load_EGL_KHR_stream_producer_eglsurface(GLADloadproc load) {
	glad_eglCreateStreamProducerSurfaceKHR = (PFNEGLCREATESTREAMPRODUCERSURFACEKHRPROC)load("eglCreateStreamProducerSurfaceKHR");
}
static void load_EGL_KHR_swap_buffers_with_damage(GLADloadproc load) {
	glad_eglSwapBuffersWithDamageKHR = (PFNEGLSWAPBUFFERSWITHDAMAGEKHRPROC)load("eglSwapBuffersWithDamageKHR");
}
static void load_EGL_KHR_wait_sync(GLADloadproc load) {
	glad_eglWaitSyncKHR = (PFNEGLWAITSYNCKHRPROC)load("eglWaitSyncKHR");
}
static void load_EGL_MESA_drm_image(GLADloadproc load) {
	glad_eglCreateDRMImageMESA = (PFNEGLCREATEDRMIMAGEMESAPROC)load("eglCreateDRMImageMESA");
	glad_eglExportDRMImageMESA = (PFNEGLEXPORTDRMIMAGEMESAPROC)load("eglExportDRMImageMESA");
}
static void load_EGL_MESA_image_dma_buf_export(GLADloadproc load) {
	glad_eglExportDMABUFImageQueryMESA = (PFNEGLEXPORTDMABUFIMAGEQUERYMESAPROC)load("eglExportDMABUFImageQueryMESA");
	glad_eglExportDMABUFImageMESA = (PFNEGLEXPORTDMABUFIMAGEMESAPROC)load("eglExportDMABUFImageMESA");
}
static void load_EGL_NOK_swap_region(GLADloadproc load) {
	glad_eglSwapBuffersRegionNOK = (PFNEGLSWAPBUFFERSREGIONNOKPROC)load("eglSwapBuffersRegionNOK");
}
static void load_EGL_NOK_swap_region2(GLADloadproc load) {
	glad_eglSwapBuffersRegion2NOK = (PFNEGLSWAPBUFFERSREGION2NOKPROC)load("eglSwapBuffersRegion2NOK");
}
static void load_EGL_NV_native_query(GLADloadproc load) {
	glad_eglQueryNativeDisplayNV = (PFNEGLQUERYNATIVEDISPLAYNVPROC)load("eglQueryNativeDisplayNV");
	glad_eglQueryNativeWindowNV = (PFNEGLQUERYNATIVEWINDOWNVPROC)load("eglQueryNativeWindowNV");
	glad_eglQueryNativePixmapNV = (PFNEGLQUERYNATIVEPIXMAPNVPROC)load("eglQueryNativePixmapNV");
}
static void load_EGL_NV_post_sub_buffer(GLADloadproc load) {
	glad_eglPostSubBufferNV = (PFNEGLPOSTSUBBUFFERNVPROC)load("eglPostSubBufferNV");
}
static void load_EGL_NV_stream_sync(GLADloadproc load) {
	glad_eglCreateStreamSyncNV = (PFNEGLCREATESTREAMSYNCNVPROC)load("eglCreateStreamSyncNV");
}
static void load_EGL_NV_sync(GLADloadproc load) {
	glad_eglCreateFenceSyncNV = (PFNEGLCREATEFENCESYNCNVPROC)load("eglCreateFenceSyncNV");
	glad_eglDestroySyncNV = (PFNEGLDESTROYSYNCNVPROC)load("eglDestroySyncNV");
	glad_eglFenceNV = (PFNEGLFENCENVPROC)load("eglFenceNV");
	glad_eglClientWaitSyncNV = (PFNEGLCLIENTWAITSYNCNVPROC)load("eglClientWaitSyncNV");
	glad_eglSignalSyncNV = (PFNEGLSIGNALSYNCNVPROC)load("eglSignalSyncNV");
	glad_eglGetSyncAttribNV = (PFNEGLGETSYNCATTRIBNVPROC)load("eglGetSyncAttribNV");
}
static void load_EGL_NV_system_time(GLADloadproc load) {
	glad_eglGetSystemTimeFrequencyNV = (PFNEGLGETSYSTEMTIMEFREQUENCYNVPROC)load("eglGetSystemTimeFrequencyNV");
	glad_eglGetSystemTimeNV = (PFNEGLGETSYSTEMTIMENVPROC)load("eglGetSystemTimeNV");
}
static void find_extensionsEGL(void) {
}

static void find_coreEGL(void) {
}

int gladLoadEGLLoader(GLADloadproc load) {
	find_coreEGL();

	find_extensionsEGL();
	load_EGL_ANDROID_blob_cache(load);
	load_EGL_ANDROID_native_fence_sync(load);
	load_EGL_ANGLE_query_surface_pointer(load);
	load_EGL_EXT_device_base(load);
	load_EGL_EXT_device_enumeration(load);
	load_EGL_EXT_device_query(load);
	load_EGL_EXT_output_base(load);
	load_EGL_EXT_platform_base(load);
	load_EGL_EXT_stream_consumer_egloutput(load);
	load_EGL_EXT_swap_buffers_with_damage(load);
	load_EGL_HI_clientpixmap(load);
	load_EGL_KHR_cl_event2(load);
	load_EGL_KHR_fence_sync(load);
	load_EGL_KHR_image(load);
	load_EGL_KHR_image_base(load);
	load_EGL_KHR_lock_surface(load);
	load_EGL_KHR_lock_surface3(load);
	load_EGL_KHR_partial_update(load);
	load_EGL_KHR_reusable_sync(load);
	load_EGL_KHR_stream(load);
	load_EGL_KHR_stream_consumer_gltexture(load);
	load_EGL_KHR_stream_cross_process_fd(load);
	load_EGL_KHR_stream_fifo(load);
	load_EGL_KHR_stream_producer_eglsurface(load);
	load_EGL_KHR_swap_buffers_with_damage(load);
	load_EGL_KHR_wait_sync(load);
	load_EGL_MESA_drm_image(load);
	load_EGL_MESA_image_dma_buf_export(load);
	load_EGL_NOK_swap_region(load);
	load_EGL_NOK_swap_region2(load);
	load_EGL_NV_native_query(load);
	load_EGL_NV_post_sub_buffer(load);
	load_EGL_NV_stream_sync(load);
	load_EGL_NV_sync(load);
	load_EGL_NV_system_time(load);
	return 1;
}

