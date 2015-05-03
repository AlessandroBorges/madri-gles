package android.graphics;

import android.graphics.BufferQueue.BufferItem;
import android.opengl.EGLDisplay;

class BufferQueue {

    public class BufferItem {

        public int mBuf;
        public Object mGraphicBuffer;
        public Rect mCrop;
        public int mTransform;
        public int mScalingMode;
        public long mTimestamp;

    }
    public static final int STALE_BUFFER_SLOT = 0;
    public static final int INVALID_BUFFER_SLOT = 0;
    public int acquireBuffer(BufferItem item) {
        // TODO Auto-generated method stub
        return 0;
    }
    public int releaseBuffer(int buf, EGLDisplay dpy, EGLSyncKHR mFence) {
        // TODO Auto-generated method stub
        return 0;
    }

}
