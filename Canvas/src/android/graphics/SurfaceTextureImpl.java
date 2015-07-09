/**
 * 
 */
package android.graphics;

import gles.internal.EGLUtil;

import java.util.Vector;

import android.opengl.EGL14;
import static android.opengl.EGL14.*;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Log;

/**
 * @author Alessandro Borges
 *
 */
public class SurfaceTextureImpl {

    private static final int NO_ERROR = 0;

    private static final int UNKNOWN_ERROR = 0;

    private static final int BAD_VALUE = 0;
    private static final int INVALID_OPERATION = -1;

    private static final String GL_NO_ERROR = null;

    private static final EGLSyncKHR EGL_NO_SYNC_KHR = null;

    private static final int OK = 0;

    private static final int NO_INIT = -1;

    private static final EGLImageKHR EGL_NO_IMAGE_KHR = null;

    static boolean USE_FENCE_SYNC = true;
    /**
     onFrameAvailable() is called each time an additional frame becomes
     available for consumption. This means that frames that are queued
     while in asynchronous mode only trigger the callback if no previous
     frames are pending. Frames queued while in synchronous mode always
     trigger the callback.
    
     This is called without any lock held and can be called concurrently
     by multiple threads.
     */
 /*   Object FrameAvailableListener  public virtual RefBase {    
         virtual void onFrameAvailable() = 0;
}
    */

    private Object mCurrentBuffer;
    
    
    
    /**
     * <pre>
     *  SurfaceTexture constructs a new SurfaceTexture object. tex indicates the
     *  name of the OpenGL ES texture to which images are to be streamed.
     *  allowSynchronousMode specifies whether or not synchronous mode can be
     *  enabled. texTarget specifies the OpenGL ES texture target to which the
     *  texture will be bound in updateTexImage. useFenceSync specifies whether
     *  fences should be used to synchronize access to buffers if that behavior
     *  is enabled at compile-time. A custom bufferQueue can be specified
     *  if behavior for queue/dequeue/connect etc needs to be customized.
     *  Otherwise a default BufferQueue will be created and used.
     * 
     *  For legacy reasons, the SurfaceTexture is created in a state where it is
     *  considered attached to an OpenGL ES context for the purposes of the
     *  attachToContext and detachFromContext methods. However, despite being
     *  considered "attached" to a context, the specific OpenGL ES context
     *  doesn't get latched until the first call to updateTexImage. After that
     *  point, all calls to updateTexImage must be made with the same OpenGL ES
     *  context current.
     * 
     *  A SurfaceTexture may be detached from one OpenGL ES context and then
     *  attached to a different context using the detachFromContext and
     *  attachToContext methods, respectively. The intention of these methods is
     *  purely to allow a SurfaceTexture to be transferred from one consumer
     *  context to another. If such a transfer is not needed there is no
     * requirement that either of these methods be called.
     **/
    public SurfaceTextureImpl( int tex,  // GLuint
                           boolean allowSynchronousMode, // = true,
                           int texTarget, //   GLenum texTarget = GL_TEXTURE_EXTERNAL_OES, 
                           boolean useFenceSync, // = true 
                           BufferQueue bufferQueue) //const sp<BufferQueue> &bufferQueue = 0)
             {
        mBufferQueue = bufferQueue;
        
        mCurrentTransform = 0;
        mCurrentTimestamp = 0;
        mFilteringEnabled = true;
        mTexName = tex;
        // #ifdef USE_FENCE_SYNC
        mUseFenceSync = USE_FENCE_SYNC ? useFenceSync : false;
        ;
        // #else
        // mUseFenceSync(false)
        // #endif
        mTexTarget = texTarget;
        mEglDisplay = EGLUtil.EGL_NO_DISPLAY;
        mEglContext = EGLUtil.EGL_NO_CONTEXT;
        mAbandoned = false;
        mCurrentTexture = 0;// (BufferQueue::INVALID_BUFFER_SLOT),
        mAttached = true;
    }

    void finalizeSurfaceTexture() {
        abandon();
    }

    /**
     * updateTexImage sets the image contents of the target texture to that of
     * the most recently queued buffer.
     * 
     * This call may only be made while the OpenGL ES context to which the
     * target texture belongs is bound to the calling thread.
     **/
    public int updateTexImage(BufferRejecter rejecter) {
        int err = NO_ERROR;
        if (mAbandoned) {
            ST_LOGE("updateTexImage: SurfaceTexture is abandoned!");
            return NO_INIT;
        }
        if (!mAttached) {
            ST_LOGE("updateTexImage: SurfaceTexture is not attached to an OpenGL "
                    + "ES context");
            return INVALID_OPERATION;
        }
        EGLDisplay dpy = EGL14.eglGetCurrentDisplay();
        EGLContext ctx = EGL14.eglGetCurrentContext();
        if ((mEglDisplay != dpy && mEglDisplay != EGL14.EGL_NO_DISPLAY)
                || dpy == EGL14.EGL_NO_DISPLAY) {
            ST_LOGE("updateTexImage: invalid current EGLDisplay");
            return INVALID_OPERATION;
        }
        if ((mEglContext != ctx && mEglContext != EGL14.EGL_NO_CONTEXT)
                || ctx == EGL14.EGL_NO_CONTEXT) {
            ST_LOGE("updateTexImage: invalid current EGLContext");
            return INVALID_OPERATION;
        }
        mEglDisplay = dpy;
        mEglContext = ctx;
        BufferItem item = new BufferItem();
        // In asynchronous mode the list is guaranteed to be one buffer
        // deep, while in synchronous mode we use the oldest buffer.
        // TODO fix this C'ish way to copy data
        err = mBufferQueue.acquireBuffer(item);
        if (err == NO_ERROR) {
            int buf = item.mBuf;
            // This buffer was newly allocated, so we need to clean up on our
            // side
            if (item.mGraphicBuffer != null) {
                mEGLSlots[buf].mGraphicBuffer = null;
                if (mEGLSlots[buf].mEglImage != EGL_NO_IMAGE_KHR) {
                    eglDestroyImageKHR(dpy, mEGLSlots[buf].mEglImage);
                    mEGLSlots[buf].mEglImage = EGL_NO_IMAGE_KHR;
                }
                mEGLSlots[buf].mGraphicBuffer = item.mGraphicBuffer;
            }
            // we call the rejecter here, in case the caller has a reason to
            // not accept this buffer. this is used by SurfaceFlinger to
            // reject buffers which have the wrong size
            if (rejecter != null
                    && rejecter.reject(mEGLSlots[buf].mGraphicBuffer, item)) {
                mBufferQueue.releaseBuffer(buf, dpy, mEGLSlots[buf].mFence);
                mEGLSlots[buf].mFence = EGL_NO_SYNC_KHR;
                glBindTexture(mTexTarget, mTexName);
                return NO_ERROR;
            }
            // Update the GL texture object. We may have to do this even when
            // item.mGraphicBuffer == NULL, if we destroyed the EGLImage when
            // detaching from a context but the buffer has not been
            // re-allocated.
            EGLImageKHR image = mEGLSlots[buf].mEglImage;
            if (image == EGL_NO_IMAGE_KHR) {
                if (mEGLSlots[buf].mGraphicBuffer == null) {
                    ST_LOGE("updateTexImage: buffer at slot " + buf
                            + " is null");
                    err = BAD_VALUE;
                } else {
                    image = createImage(dpy, mEGLSlots[buf].mGraphicBuffer);
                    mEGLSlots[buf].mEglImage = image;
                    if (image == EGL_NO_IMAGE_KHR) {
                        // NOTE: if dpy was invalid, createImage() is guaranteed
                        // to
                        // fail. so we'd end up here.
                        err = UNKNOWN_ERROR;
                    }
                }
            }
            if (err == NO_ERROR) {
                String error;
                while ((error = glGetError()) != GL_NO_ERROR) {
                    ST_LOGW("updateTexImage: clearing GL error:" + error);
                }
                glBindTexture(mTexTarget, mTexName);
                glEGLImageTargetTexture2DOES(mTexTarget, (EGLImageKHR) image);
                while ((error = glGetError()) != GL_NO_ERROR) {
                    ST_LOGE("updateTexImage: error binding external texture image "
                            + image + "(slot " + buf + "): " + error);
                    err = UNKNOWN_ERROR;
                }
                if (err == NO_ERROR) {
                    err = syncForReleaseLocked(dpy);
                }
            }
            if (err != NO_ERROR) {
                // Release the buffer we just acquired. It's not safe to
                // release the old buffer, so instead we just drop the new
                // frame.
                mBufferQueue.releaseBuffer(buf, dpy, mEGLSlots[buf].mFence);
                mEGLSlots[buf].mFence = EGL_NO_SYNC_KHR;
                return err;
            }
            
            {
                
                ST_LOGV("updateTexImage: (slot=%d buf=%p) -> (slot=%d buf=%p)",
                        mCurrentTexture,
                        mCurrentTextureBuf != null ? mCurrentTextureBuf.hashCode() : 0,
                        buf,
                        item.mGraphicBuffer != null ? item.mGraphicBuffer.hashCode() : 0);
            }
            // release old buffer
            if (mCurrentTexture != BufferQueue.INVALID_BUFFER_SLOT) {
                int status = mBufferQueue.releaseBuffer(mCurrentTexture,  dpy, mEGLSlots[mCurrentTexture].mFence);

                mEGLSlots[mCurrentTexture].mFence = EGL_NO_SYNC_KHR;
                if (status == BufferQueue.STALE_BUFFER_SLOT) {
                    freeBufferLocked(mCurrentTexture);
                } else if (status != NO_ERROR) {
                    ST_LOGE("updateTexImage: released invalid buffer");
                    err = status;
                }
            }
            // Update the SurfaceTexture state.
            mCurrentTexture = buf;
            mCurrentTextureBuf = mEGLSlots[buf].mGraphicBuffer;
            mCurrentCrop = item.mCrop;
            mCurrentTransform = item.mTransform;
            mCurrentScalingMode = item.mScalingMode;
            mCurrentTimestamp = item.mTimestamp;
            computeCurrentTransformMatrix();
        } else {
            if (err < 0) {
                ST_LOGE("updateTexImage failed on acquire " + err);
            }
            // We always bind the texture even if we don't update its contents.
            glBindTexture(mTexTarget, mTexName);
            return OK;
        }
        return err;
    }

    private void eglDestroyImageKHR(EGLDisplay dpy, EGLImageKHR mEglImage) {
        // TODO Auto-generated method stub

    }

    private void glEGLImageTargetTexture2DOES(int mTexTarget2, EGLImageKHR image) {
        // TODO Auto-generated method stub

    }

    private void glBindTexture(int mTexTarget2, int mTexName2) {
        // TODO Auto-generated method stub

    }

    /**
     *  setBufferCountServer set the buffer count. If the client has requested
     *  a buffer count using setBufferCount, the server-buffer count will //
     * take effect once the client sets the count back to zero.
     **/
    private String glGetError() {
        // TODO Auto-generated method stub
        return null;
    }

    boolean setBufferCountServer(int bufferCount) {
        return false;
    }

    /**
     * <pre>
     *      getTransformMatrix retrieves the 4x4 texture coordinate transform matrix
     *      associated with the texture image set by the most recent call to
     *      updateTexImage.
     *     
     *      This transform matrix maps 2D homogeneous texture coordinates of the form
     *      (s, t, 0, 1) with s and t in the inclusive range [0, 1] to the texture
     *      coordinate that should be used to sample that location from the texture.
     *      Sampling the texture outside of the range of this transform is undefined.
     *     
     *      This transform is necessary to compensate for transforms that the stream
     *      content producer may implicitly apply to the content. By forcing users of
     *      a SurfaceTexture to apply this transform we avoid performing an extra
     *      copy of the data that would be needed to hide the transform from the
     *      user.
     *     
     *      The matrix is stored in column-major order so that it may be passed
     *      directly to OpenGL ES via the glLoadMatrixf or glUniformMatrix4fv
     *      functions.
     * </pre>
     */
    void getTransformMatrix(float mtx[]) {
        return;
    }

    // getTimestamp retrieves the timestamp associated with the texture image
    // set by the most recent call to updateTexImage.
    //
    // The timestamp is in nanoseconds, and is monotonically increasing. Its
    // other semantics (zero point, etc) are source-dependent and should be
    // documented by the source.
    long getTimestamp() {
        return this.mCurrentTimestamp;
    }

    // setFrameAvailableListener sets the listener object that will be notified
    // when a new frame becomes available.
    void setFrameAvailableListener(FrameAvailableListener listener) {
    }

    // getAllocator retrieves the binder object that must be referenced as long
    // as the GraphicBuffers dequeued from this SurfaceTexture are referenced.
    // Holding this binder reference prevents SurfaceFlinger from freeing the
    // buffers before the client is done with them.
    Object getAllocator() {
        return null;
    }

    // setDefaultBufferSize is used to set the size of buffers returned by
    // requestBuffers when a with and height of zero is requested.
    // A call to setDefaultBufferSize() may trigger requestBuffers() to
    // be called from the client.
    // The width and height parameters must be no greater than the minimum of
    // GL_MAX_VIEWPORT_DIMS and GL_MAX_TEXTURE_SIZE (see: glGetIntegerv).
    // An error due to invalid dimensions might not be reported until
    // updateTexImage() is called.
    void setDefaultBufferSize(int width, int height) {
        mDefaultWidth = width;
        mDefaultHeight = height;
    }

    // setFilteringEnabled sets whether the transform matrix should be computed
    // for use with bilinear filtering.
    void setFilteringEnabled(boolean enabled) {
    }

    // getCurrentBuffer returns the buffer associated with the current image.
    Object getCurrentBuffer() {
        return mCurrentBuffer;
    }

    // getCurrentTextureTarget returns the texture target of the current
    // texture as returned by updateTexImage().
    int getCurrentTextureTarget() {
        return 0;
    }

    // getCurrentCrop returns the cropping rectangle of the current buffer.
    Rect getCurrentCrop() {
        return null;
    };

    // getCurrentTransform returns the transform of the current buffer.
    int getCurrentTransform() {
        return mCurrentTransform;
    };

    // getCurrentScalingMode returns the scaling mode of the current buffer.
    int getCurrentScalingMode() {
        return mCurrentScalingMode;
    }

    // isSynchronousMode returns whether the SurfaceTexture is currently in
    // synchronous mode.
    boolean isSynchronousMode() {
        return false;
    }

    // abandon frees all the buffers and puts the SurfaceTexture into the
    // 'abandoned' state. Once put in this state the SurfaceTexture can never
    // leave it. When in the 'abandoned' state, all methods of the
    // ISurfaceTexture interface will fail with the NO_INIT error.
    //
    // Note that while calling this method causes all the buffers to be freed
    // from the perspective of the the SurfaceTexture, if there are additional
    // references on the buffers (e.g. if a buffer is referenced by a client or
    // by OpenGL ES as a texture) then those buffer will remain allocated.
    void abandon() {
    }

    // set the name of the SurfaceTexture that will be used to identify it in
    // log messages.
    void setName(String name) {
    }

    // These functions call the corresponding BufferQueue implementation
    // so the refactoring can proceed smoothly
    boolean setDefaultBufferFormat(int defaultFormat) {
        return false;
    }

    boolean setConsumerUsageBits(int usage) {
        return false;
    }

    boolean setTransformHint(int hint) {
        return false;
    }

    boolean setSynchronousMode(boolean enabled) {
        return false;
    }

    // getBufferQueue returns the BufferQueue object to which this
    // SurfaceTexture is connected.
    Vector getBufferQueue() {
        return this.mBufferQueue;
    }

    /**
     * <pre>
     * detachFromContext detaches the SurfaceTexture from the calling thread's
     * current OpenGL ES context. This context must be the same as the context
     * that was current for previous calls to updateTexImage.
     * 
     * Detaching a SurfaceTexture from an OpenGL ES context will result in the
     * deletion of the OpenGL ES texture object into which the images were being
     * streamed. After a SurfaceTexture has been detached from the OpenGL ES
     * context calls to updateTexImage will fail returning INVALID_OPERATION
     * until the SurfaceTexture is attached to a new OpenGL ES context using the
     * attachToContext method.
     * 
     * @return
     */
    boolean detachFromContext() {
        return false;
    }

    /**
     * attachToContext attaches a SurfaceTexture that is currently in the
     * 'detached' state to the current OpenGL ES context. A SurfaceTexture is
     * in the 'detached' state iff detachFromContext has successfully been
     * called and no calls to attachToContext have succeeded since the last
     * detachFromContext call. Calls to attachToContext made on a
     * SurfaceTexture that is not in the 'detached' state will result in an
     * INVALID_OPERATION error.
     *
     * The tex argument specifies the OpenGL ES texture object name in the
     * new context into which the image contents will be streamed. A successful
     * call to attachToContext will result in this texture object being bound to
     * the texture target and populated with the image contents that were
     * current at the time of the last call to detachFromContext.
     */
     
    
    boolean attachToContext(int /* GLuint */tex) {
        return false;
    }

    // dump our state in a String
    void dump(String result) {
    }

    void dump(String result, String prefix, StringBuffer buffer, int SIZE) {
    }

    // Implementation of the BufferQueue::ConsumerListener interface. These
    // calls are used to notify the SurfaceTexture of asynchronous events in the
    // BufferQueue.
    void onFrameAvailable() {
    }

    void onBuffersReleased() {
    }

    static boolean isExternalFormat(int format) {
        return false;
    }

    // createImage creates a new EGLImage from a GraphicBuffer.
    EGLImageKHR createImage(EGLDisplay dpy, GraphicBuffer grahphicBuffer)// const
                                                                  // sp<GraphicBuffer>&
                                                                  // graphicBuffer);
    {
        
      //  EGL14.eglcr
        return null;

    }

    // freeBufferLocked frees up the given buffer slot. If the slot has been
    // initialized this will release the reference to the GraphicBuffer in that
    // slot and destroy the EGLImage in that slot. Otherwise it has no effect.
    //
    // This method must be called with mMutex locked.
    void freeBufferLocked(int slotIndex) {
    }

    // computeCurrentTransformMatrix computes the transform matrix for the
    // current texture. It uses mCurrentTransform and the current GraphicBuffer
    // to compute this matrix and stores it in mCurrentTransformMatrix.
    void computeCurrentTransformMatrix() {
    }

    // syncForReleaseLocked performs the synchronization needed to release the
    // current slot from an OpenGL ES context. If needed it will set the
    // current slot's fence to guard against a producer accessing the buffer
    // before the outstanding accesses have completed.
    int syncForReleaseLocked(EGLDisplay dpy) {
        return 0;
    }

    // The default consumer usage flags that SurfaceTexture always sets on its
    // BufferQueue instance; these will be OR:d with any additional flags passed
    // from the SurfaceTexture user. In particular, SurfaceTexture will always
    // consume buffers as hardware textures.
    static int DEFAULT_USAGE_FLAGS = 0x00000100;// GraphicBuffer::USAGE_HW_TEXTURE;

    // mCurrentTextureBuf is the graphic buffer of the current texture. It's
    // possible that this buffer is not associated with any buffer slot, so we
    // must track it separately in order to support the getCurrentBuffer method.
    GraphicBuffer /* sp<GraphicBuffer> */ mCurrentTextureBuf;
    
    // mCurrentCrop is the crop rectangle that applies to the current texture.
    // It gets set each time updateTexImage is called.
    Rect mCurrentCrop;
    
    // mCurrentTransform is the transform identifier for the current texture. It
    // gets set each time updateTexImage is called.
    int mCurrentTransform;
    
    // mCurrentScalingMode is the scaling mode for the current texture. It gets
    // set to each time updateTexImage is called.
    int mCurrentScalingMode;
    
    // mCurrentTransformMatrix is the transform matrix for the current texture.
    // It gets computed by computeTransformMatrix each time updateTexImage is
    // called.
    float[] mCurrentTransformMatrix = new float[16];
    
    // mCurrentTimestamp is the timestamp for the current texture. It
    // gets set each time updateTexImage is called.
    long mCurrentTimestamp;
    
    int mDefaultWidth, mDefaultHeight;
    
    // mFilteringEnabled indicates whether the transform matrix is computed for
    // use with bilinear filtering. It defaults to true and is changed by
    // setFilteringEnabled().
    boolean mFilteringEnabled;
    
    // mTexName is the name of the OpenGL texture to which streamed images will
    // be bound when updateTexImage is called. It is set at construction time
    // and can be changed with a call to attachToContext.
    int mTexName;
    
    /**
     * <pre>
     * mUseFenceSync indicates whether creation of the EGL_KHR_fence_sync
     * extension should be used to prevent buffers from being dequeued before
     * it's safe for them to be written. It gets set at construction time and
     * never changes.
     **/
    boolean mUseFenceSync;
    /**
     * mTexTarget is the GL texture target with which the GL texture object is
     * associated. It is set in the constructor and never changed. It is
     * almost always GL_TEXTURE_EXTERNAL_OES except for one use case in Android
     * Browser. In that case it is set to GL_TEXTURE_2D to allow
     * glCopyTexSubImage to read from the texture. This is a hack to work
     * around a GL driver limitation on the number of FBO attachments, which the
     *  browser's tile cache exceeds.
     * 
     */
    int mTexTarget;

    // EGLSlot contains the information and object references that
    // SurfaceTexture maintains about a BufferQueue buffer slot.
    class EGLSlot {
        public EGLSlot() {
            mEglImage = EGL_NO_IMAGE_KHR;
            mFence = EGL_NO_SYNC_KHR;
        }

        GraphicBuffer mGraphicBuffer; // sp<GraphicBuffer> mGraphicBuffer;
        // mEglImage is the EGLImage created from mGraphicBuffer.
        EGLImageKHR mEglImage;
        
        // mFence is the EGL sync object that must signal before the buffer
        // associated with this buffer slot may be dequeued. It is initialized
        // to EGL_NO_SYNC_KHR when the buffer is created and (optionally, based
        // on a compile-time option) set to a new sync object in updateTexImage.

        EGLSyncKHR mFence;
    };

    // mEglDisplay is the EGLDisplay with which this SurfaceTexture is currently
    // associated. It is intialized to EGL_NO_DISPLAY and gets set to the
    // current display when updateTexImage is called for the first time and when
    // attachToContext is called.
    EGLDisplay mEglDisplay;
    // mEglContext is the OpenGL ES context with which this SurfaceTexture is
    // currently associated. It is initialized to EGL_NO_CONTEXT and gets set
    // to the current GL context when updateTexImage is called for the first
    // time and when attachToContext is called.
    EGLContext mEglContext;
    
    // mEGLSlots stores the buffers that have been allocated by the BufferQueue
    // for each buffer slot. It is initialized to null pointers, and gets
    // filled in with the result of BufferQueue::acquire when the
    // client dequeues a buffer from a
    // slot that has not yet been used. The buffer allocated to a slot will also
    // be replaced if the requested buffer usage or geometry differs from that
    // of the buffer allocated to a slot.
    EGLSlot[] mEGLSlots;// [BufferQueue::NUM_BUFFER_SLOTS];
    
    // mAbandoned indicates that the BufferQueue will no longer be used to
    // consume images buffers pushed to it using the ISurfaceTexture interface.
    // It is initialized to false, and set to true in the abandon method. A
    // BufferQueue that has been abandoned will return the NO_INIT error from
    // all ISurfaceTexture methods capable of returning an error.
    boolean mAbandoned;
    // mName is a string used to identify the SurfaceTexture in log messages.
    // It can be set by the setName method.
    
    String mName;
    // mFrameAvailableListener is the listener object that will be called when a
    // new frame becomes available. If it is not NULL it will be called from
    // queueBuffer.
    FrameAvailableListener mFrameAvailableListener;
    // mCurrentTexture is the buffer slot index of the buffer that is currently
    // bound to the OpenGL texture. It is initialized to INVALID_BUFFER_SLOT,
    // indicating that no buffer slot is currently bound to the texture. Note,
    // however, that a value of INVALID_BUFFER_SLOT does not necessarily mean
    // that no buffer is bound to the texture. A call to setBufferCount will
    // reset mCurrentTexture to INVALID_BUFFER_SLOT.
    int mCurrentTexture;
    /**
     * 
     *  The SurfaceTexture has-a BufferQueue and is responsible for creating this
     *  object  if none is supplied
     */
    private BufferQueue mBufferQueue;
    
    // mAttached indicates whether the SurfaceTexture is currently attached to
    // an OpenGL ES context. For legacy reasons, this is initialized to true,
    // indicating that the SurfaceTexture is considered to be attached to
    // whatever context is current at the time of the first updateTexImage call.
    // It is set to false by detachFromContext, and then set to true again by
    // attachToContext.
    
    boolean mAttached;
    // mMutex is the mutex used to prevent concurrent access to the member
    // variables of SurfaceTexture objects. It must be locked whenever the
    // member variables are accessed.
    /* mutable Mutex */
    Object mMutex;

    //Transform matrices
    static float mtxIdentity[] = {
        1, 0, 0, 0,
        0, 1, 0, 0,
        0, 0, 1, 0,
        0, 0, 0, 1,};
    
    static float mtxFlipH[] = {
        -1, 0, 0, 0,
         0, 1, 0, 0,
         0, 0, 1, 0,
         1, 0, 0, 1,};
    
    static float mtxFlipV[] = {
        1,  0, 0, 0,
        0, -1, 0, 0,
        0,  0, 1, 0,
        0,  1, 0, 1,
        };
    static float mtxRot90[] = {
     0, 1, 0, 0,
    -1, 0, 0, 0,
     0, 0, 1, 0, 
     1, 0, 0, 1,
     };
    static float mtxRot180[] = {
        -1, 0, 0, 0,
        0, -1, 0, 0,
        0, 0, 1, 0,
        1, 1, 0, 1,
        };
    static float mtxRot270[] = {
        0, -1, 0, 0,
        1, 0, 0, 0,
        0, 0, 1, 0,
        0, 1, 0, 1,
        };

    static void mtxMul(float out[], float a[], float b[]) {
        out[0]  = a[0] * b[0]  + a[4] * b[1]  + a[8]  * b[2]  + a[12] * b[3];
        out[1]  = a[1] * b[0]  + a[5] * b[1]  + a[9]  * b[2]  + a[13] * b[3];
        out[2]  = a[2] * b[0]  + a[6] * b[1]  + a[10] * b[2]  + a[14] * b[3];
        out[3]  = a[3] * b[0]  + a[7] * b[1]  + a[11] * b[2]  + a[15] * b[3];
        out[4]  = a[0] * b[4]  + a[4] * b[5]  + a[8]  * b[6]  + a[12] * b[7];
        out[5]  = a[1] * b[4]  + a[5] * b[5]  + a[9]  * b[6]  + a[13] * b[7];
        out[6]  = a[2] * b[4]  + a[6] * b[5]  + a[10] * b[6]  + a[14] * b[7];
        out[7]  = a[3] * b[4]  + a[7] * b[5]  + a[11] * b[6]  + a[15] * b[7];
        out[8]  = a[0] * b[8]  + a[4] * b[9]  + a[8]  * b[10] + a[12] * b[11];
        out[9]  = a[1] * b[8]  + a[5] * b[9]  + a[9]  * b[10] + a[13] * b[11];
        out[10] = a[2] * b[8]  + a[6] * b[9]  + a[10] * b[10] + a[14] * b[11];
        out[11] = a[3] * b[8]  + a[7] * b[9]  + a[11] * b[10] + a[15] * b[11];
        out[12] = a[0] * b[12] + a[4] * b[13] + a[8]  * b[14] + a[12] * b[15];
        out[13] = a[1] * b[12] + a[5] * b[13] + a[9]  * b[14] + a[13] * b[15];
        out[14] = a[2] * b[12] + a[6] * b[13] + a[10] * b[14] + a[14] * b[15];
        out[15] = a[3] * b[12] + a[7] * b[13] + a[11] * b[14] + a[15] * b[15];
    }

    void ST_LOGV(String x) {        
        Log.v("[SurfaceTexture] " + mName, x);
    }
    
    void ST_LOGV(String x, Object... args) {
        String s = String.format(x, args);
        Log.v("[SurfaceTexture] " + mName, s);
    }

    void ST_LOGD(String x) {
        Log.d("[SurfaceTexture] " + mName, x);
    }

    void ST_LOGI(String x) {
        Log.i("[SurfaceTexture] " + mName, x);
    }

    void ST_LOGW(String x) {
        Log.w("[SurfaceTexture] " + mName, x);
    }

    void ST_LOGE(String x) {
        Log.e("[SurfaceTexture] " + mName, x, null);
    }
    
}
class FrameAvailableListener{

}
