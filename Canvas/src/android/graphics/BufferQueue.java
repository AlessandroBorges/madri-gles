package android.graphics;

import android.graphics.BufferItem;
import android.opengl.EGLDisplay;

@SuppressWarnings("serial")
class BufferQueue extends java.util.Vector<BufferItem> {
   
    public static final int STALE_BUFFER_SLOT = 0;
    public static final int INVALID_BUFFER_SLOT = 0;
    
    /**
     * Copy data from BufferInfo
     * @param item
     * @return
     */
    public int acquireBuffer(BufferItem item) {
        // TODO Auto-generated method stub
        return 0;
    }
    public int releaseBuffer(int buf, EGLDisplay dpy, EGLSyncKHR mFence) {
        // TODO Auto-generated method stub
        return 0;
    }

}
