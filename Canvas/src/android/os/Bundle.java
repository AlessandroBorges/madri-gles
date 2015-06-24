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

    Map<String,String> mapString = null;
    
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
    
    
    
    
    
    
}
