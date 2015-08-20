package gles.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class EGLInfo {
    private boolean         mEGLAvailable;
    private String          mEGLVendor;
    private String          mEGLVersion;
    private String          mEGLExtensions;
    private String          mEGLClientAPIs;
    private EGLConfigInfo[] mEGLConfigs;

    public EGLInfo(boolean mEGLAvailable, 
                   String mEGLVendor, 
                   String mEGLVersion, 
                   String mEGLExtensions,
                   String mEGLClientAPIs) 
    {
        this.mEGLAvailable = mEGLAvailable;
        this.mEGLVendor = mEGLVendor;
        this.mEGLVersion = mEGLVersion;
        this.mEGLExtensions = mEGLExtensions;
        this.mEGLClientAPIs = mEGLClientAPIs;
    }

    public boolean ismEGLAvailable() {
        return mEGLAvailable;
    }

    public void setmEGLAvailable(boolean mEGLAvailable) {
        this.mEGLAvailable = mEGLAvailable;
    }

    public String getmEGLVendor() {
        return mEGLVendor;
    }

    public void setmEGLVendor(String mEGLVendor) {
        this.mEGLVendor = mEGLVendor;
    }

    public String getmEGLVersion() {
        return mEGLVersion;
    }

    public void setmEGLVersion(String mEGLVersion) {
        this.mEGLVersion = mEGLVersion;
    }

    public String getmEGLExtensions() {
        return mEGLExtensions;
    }

    public void setmEGLExtensions(String mEGLExtensions) {
        this.mEGLExtensions = mEGLExtensions;
    }

    public String getmEGLClientAPIs() {
        return mEGLClientAPIs;
    }

    public void setmEGLClientAPIs(String mEGLClientAPIs) {
        this.mEGLClientAPIs = mEGLClientAPIs;
    }

    public EGLConfigInfo[] getmEGLConfigs() {
        return mEGLConfigs;
    }

    public void setmEGLConfigs(EGLConfigInfo[] mEGLConfigs) {
        this.mEGLConfigs = mEGLConfigs;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
       
        StringBuilder builder = new StringBuilder();
        builder.append("EGLInfo\n ");      
        if (mEGLVendor != null) {
            builder.append("EGLVendor: ");
            builder.append(mEGLVendor);
            builder.append('\n');
        }
        if (mEGLVersion != null) {
            builder.append("EGLVersion: ");
            builder.append(mEGLVersion);
            builder.append('\n');
        }
        if (mEGLExtensions != null) {
            builder.append("EGLExtensions:\n");
            String[] extArr = mEGLExtensions.split(" ");
            List<String> ext = Arrays.asList(extArr);
            builder.append(toString(ext,ext.size()));
            builder.append(", ");
        }
        if (mEGLClientAPIs != null) {
            builder.append(" EGL client APIs: ");
            builder.append(mEGLClientAPIs);
            builder.append(", ");
        }
        if (mEGLConfigs != null) {
            builder.append("EGLConfigs:\n");
            List<EGLConfigInfo> list = Arrays.asList(mEGLConfigs).subList(0, mEGLConfigs.length);
            builder.append(toString(list,list.size()));
        }
        builder.append(" ");
        return builder.toString();
    }
    
    
    private String toString(Collection<?> collection, int maxLen) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        int i = 0;
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
            if (i > 0) builder.append(",\n ");
            builder.append(iterator.next());
        }
        builder.append("]");
        return builder.toString();
    }
}