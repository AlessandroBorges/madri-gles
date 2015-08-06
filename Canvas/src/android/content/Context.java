package android.content;

import android.content.res.Resources;

public class Context {
    Object objContext;
    Class<?> clazz;
    Resources resources;
    
    public Context(){
        clazz = this.getClass();
        resources = new Resources(this);
    }
    
    
    public Context(Object objContext){
        clazz = objContext.getClass();
        resources = new Resources(this);
    }
    
    public static final String ACTIVITY_SERVICE = "service";

    public Resources getResources() {
        return resources;       
    }

}
