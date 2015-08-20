/**
 * 
 */
package gles.util;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

import android.util.Log;

/**
 * Class to store Activity configuration
 * 
 * @author Alessandro Borges
 *
 */
public class GlesConfig {

    private static final String TAG="GlesConfig";
    
    public static final String extension = ".gles.config.xml";
    /**
     * application rotation
     */
    public static int[] ANGLES={0, 90, 180, 270};
    /**
     * OpenGL ES Bit
     */
    public static int[] OPENGL_ES_BIT = {10,20,30,31};

    public String activityName = "name";
    
    public int angle = ANGLES[0];
    public int gles_bit = OPENGL_ES_BIT[1];

    
    public int width  = 480;
    public int height = 640;

    public int x0=0;
    public int y0=0;

    /**
     * creates a new and empty Config
     */
    public GlesConfig() {
    }

    /**
     * @param activityName
     * @param width
     * @param height
     * @param x0
     * @param y0
     */
    public GlesConfig(String activityName, int width, int height, int x0, int y0) {
        super();
        this.activityName = activityName;
        this.width = width;
        this.height = height;
        this.x0 = x0;
        this.y0 = y0;
    }

    
    public void save(String url) throws FileNotFoundException {
        url = url + activityName + extension;
        XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(url)));
        e.writeObject(this);
        e.close();
    }

    /**
     * 
     * @param url
     * @param activityName
     * @return
     * @throws FileNotFoundException
     */
    public GlesConfig read(String url, String activityName) throws FileNotFoundException {
        String _url = url +"/" + activityName + extension;
        XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(_url)));
        GlesConfig result = null;
        try {
            result = (GlesConfig)d.readObject();            
        } catch (Exception e) {            
            Log.e(TAG, "GlesConfig not found! " + _url, e);
            result = new GlesConfig();
            result.setActivityName(activityName);
        }
        d.close();
        return (GlesConfig) result;
    }

    /**
     * @return the activityName
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * @param activityName the activityName to set
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the x0
     */
    public int getX0() {
        return x0;
    }

    /**
     * @param x0 the x0 to set
     */
    public void setX0(int x0) {
        this.x0 = x0;
    }

    /**
     * @return the y0
     */
    public int getY0() {
        return y0;
    }

    /**
     * @param y0 the y0 to set
     */
    public void setY0(int y0) {
        this.y0 = y0;
    }

    /**
     * @return the angle
     */
    public int getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }

    /**
     * @return the gles_bit
     */
    public int getGles_bit() {
        return gles_bit;
    }

    /**
     * @param gles_bit the gles_bit to set
     */
    public void setGles_bit(int gles_bit) {
        this.gles_bit = gles_bit;
    }

}
