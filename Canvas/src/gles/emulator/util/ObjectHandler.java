package gles.emulator.util;

public abstract class ObjectHandler {
    private long mHandle;

    /**
     * @deprecated Use {@link #ObjectHandle(long)} instead. Handles
     *     on 64 bit platforms will be wider than java ints.
     */
    @Deprecated
    protected ObjectHandler(int handle) {
        mHandle = handle;
    }
    protected ObjectHandler(long handle) {
        mHandle = handle;
    }
    
    /**
     * @deprecated Use {@link #getNativeHandle()} instead. Handles on
     *     64 bit platforms will be wider than java ints.
     */
    @Deprecated
    public int getHandle() {
        if ((mHandle & 0xffffffffL) != mHandle) {
            throw new UnsupportedOperationException();
        }
        return (int)mHandle;
    }
    /**
     * Returns the native handle of the wrapped EGL object. This handle can be
     * cast to the corresponding native type on the native side.
     *
     * For example, EGLDisplay dpy = (EGLDisplay)handle;
     *
     * @return the native handle of the wrapped EGL object.
     */
    public long getNativeHandle() {
        return mHandle;
    }
    
    @Override
    public int hashCode() {
        /*
         * Based on the algorithm suggested in
         * http://developer.android.com/reference/java/lang/Object.html
         */
        int result = 17;
        result = 31 * result + (int) (mHandle ^ (mHandle >>> 32));
        return result;
    }
    
    /**
     * Check if this Object is a NULL pointer.<br>
     * Valid objects will return false, but released objects will return true;
     * @return true if this resource is already released, i.e. a NULL pointer.
     */
    public boolean isNull(){
        return mHandle==0;
    }
    
    /**
     * release native pointer.
     * After call, this objects becomes virtually NULL, i.e, isNull() return true.
     */
    protected void release(){
        this.mHandle = 0L;
    }
}

