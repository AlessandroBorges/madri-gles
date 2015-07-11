/**
 * 
 */
package android.os;

import java.util.*;

/**
 * @author Alessandro Borges
 *
 */
public class Bundle {

    Map<String,String> mapString = new HashMap<String, String>(); 
    Map<String,Boolean> mapBoolean = new HashMap<String, Boolean>();
    
    public Bundle() {
        mapString = new HashMap<String, String>();        
    }
    
    public Bundle(Bundle data) {
        mapString = new HashMap<String, String>(data.mapString);
    }

    public void putString(String k, String v){
        mapString.put(k, v);
    }
    
    public String getString(String key){
        return mapString.get(key);
    }
    
    
    public Bundle clone(){
        return new Bundle(this);
    }

    public boolean getBoolean(String showedToast, boolean b) {
       String val = mapString.get(showedToast);
       if(val == null) return b;
       
        return Boolean.valueOf(val);
    }

    public void putBoolean(String showedToast, boolean b) {
        mapString.put(showedToast, (b ? "true" : "false"));        
    }
    
    
    
}
