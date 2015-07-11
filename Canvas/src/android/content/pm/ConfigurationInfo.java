package android.content.pm;

import gles.internal.Sys;
import android.content.res.Configuration;

public class ConfigurationInfo {

   
    /**
     * The kind of touch screen attached to the device.
     * One of: {@link android.content.res.Configuration#TOUCHSCREEN_NOTOUCH},
     * {@link android.content.res.Configuration#TOUCHSCREEN_STYLUS}, 
     * {@link android.content.res.Configuration#TOUCHSCREEN_FINGER}. 
     */
    public int reqTouchScreen = Configuration.TOUCHSCREEN_NOTOUCH;
    
    /**
     * Application's input method preference.
     * One of: {@link android.content.res.Configuration#KEYBOARD_UNDEFINED},
     * {@link android.content.res.Configuration#KEYBOARD_NOKEYS},
     * {@link android.content.res.Configuration#KEYBOARD_QWERTY},
     * {@link android.content.res.Configuration#KEYBOARD_12KEY}
     */
    public int reqKeyboardType = Configuration.KEYBOARD_QWERTY;
    
    /**
     * A flag indicating whether any keyboard is available.
     * one of: {@link android.content.res.Configuration#NAVIGATION_UNDEFINED},
     * {@link android.content.res.Configuration#NAVIGATION_DPAD}, 
     * {@link android.content.res.Configuration#NAVIGATION_TRACKBALL},
     * {@link android.content.res.Configuration#NAVIGATION_WHEEL}
     */
    public int reqNavigation = Configuration.NAVIGATIONHIDDEN_UNDEFINED;
    
    /**
     * Value for {@link #reqInputFeatures}: if set, indicates that the application
     * requires a hard keyboard
     */
    public static final int INPUT_FEATURE_HARD_KEYBOARD = 0x00000001;
    
    /**
     * Value for {@link #reqInputFeatures}: if set, indicates that the application
     * requires a five way navigation device
     */
    public static final int INPUT_FEATURE_FIVE_WAY_NAV = 0x00000002;
    
    /**
     * Flags associated with the input features.  Any combination of
     * {@link #INPUT_FEATURE_HARD_KEYBOARD},
     * {@link #INPUT_FEATURE_FIVE_WAY_NAV}
     */
    public int reqInputFeatures = 0;

    /**
     * Default value for {@link #reqGlEsVersion};
     */
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    /**
     * The GLES version used by an application. The upper order 16 bits represent the
     * major version and the lower order 16 bits the minor version.
     */
    public int reqGlEsVersion;

    public ConfigurationInfo() {
        if(Sys.isGL10()){
            reqGlEsVersion = 0x00010001;
        }else if(Sys.isGL20()){
            reqGlEsVersion = 0x00020000;
        }else if(Sys.isGL30()){
            reqGlEsVersion = 0x00030000;
        }else if(Sys.isGL31()){
            reqGlEsVersion = 0x00030001;
        }else{
            // Sys not load native libs yet
            reqGlEsVersion = 0x00020000;
        }
    }

    public ConfigurationInfo(ConfigurationInfo orig) {
        reqTouchScreen = orig.reqTouchScreen;
        reqKeyboardType = orig.reqKeyboardType;
        reqNavigation = orig.reqNavigation;
        reqInputFeatures = orig.reqInputFeatures;
        reqGlEsVersion = orig.reqGlEsVersion;
    }

    public String toString() {
        return "ConfigurationInfo{"
            + Integer.toHexString(System.identityHashCode(this))
            + " touchscreen = " + reqTouchScreen
            + " inputMethod = " + reqKeyboardType
            + " navigation = " + reqNavigation
            + " reqInputFeatures = " + reqInputFeatures
            + " reqGlEsVersion = " + reqGlEsVersion + "}";
    }

    public int describeContents() {
        return 0;
    }

//    public void writeToParcel(Parcel dest, int parcelableFlags) {
//        dest.writeInt(reqTouchScreen);
//        dest.writeInt(reqKeyboardType);
//        dest.writeInt(reqNavigation);
//        dest.writeInt(reqInputFeatures);
//        dest.writeInt(reqGlEsVersion);
//    }

//    public static final Creator<ConfigurationInfo> CREATOR =
//        new Creator<ConfigurationInfo>() {
//        public ConfigurationInfo createFromParcel(Parcel source) {
//            return new ConfigurationInfo(source);
//        }
//        public ConfigurationInfo[] newArray(int size) {
//            return new ConfigurationInfo[size];
//        }
//    };
//
//    private ConfigurationInfo(Parcel source) {
//        reqTouchScreen = source.readInt();
//        reqKeyboardType = source.readInt();
//        reqNavigation = source.readInt();
//        reqInputFeatures = source.readInt();
//        reqGlEsVersion = source.readInt();
//    }

    /**
     * This method extracts the major and minor version of reqGLEsVersion attribute
     * and returns it as a string. Say reqGlEsVersion value of 0x00010002 is returned
     * as 1.2
     * @return String representation of the reqGlEsVersion attribute
     */
    public String getGlEsVersion() {
        int major = ((reqGlEsVersion & 0xffff0000) >> 16);
        int minor = reqGlEsVersion & 0x0000ffff;
        return String.valueOf(major)+"."+String.valueOf(minor);
    }
}
