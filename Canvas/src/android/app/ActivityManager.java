package android.app;

import android.content.pm.ConfigurationInfo;

public class ActivityManager {
    
    ConfigurationInfo configInfo;
    
    public ActivityManager(){
      configInfo = new ConfigurationInfo();       
    }

    
    public ConfigurationInfo getDeviceConfigurationInfo() {        
        return configInfo;
    }

}
