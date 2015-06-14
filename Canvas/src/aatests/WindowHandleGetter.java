package aatests;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class WindowHandleGetter {
    //private static final Logger log = LoggerFactory.getLogger(WindowHandleGetter.class);
    private final Frame rootFrame;

    protected WindowHandleGetter(Frame rootFrame) {
        this.rootFrame = rootFrame;
    }

    protected long getWindowId() {

        try {
            Frame frame = rootFrame;

            // The reflection code below does the same as this
            // long handle = frame.getPeer() != null ? ((WComponentPeer) frame.getPeer()).getHWnd() : 0;

            Object wComponentPeer = invokeMethod(frame, "getPeer");

            Long hwnd = (Long) invokeMethod(wComponentPeer, "getHWnd");

            return hwnd;

        } catch (Exception ex) {
            ex.printStackTrace();
            //log.error("Error getting window handle");
        }

        return 0;
    }

    protected Object invokeMethod(Object o, String methodName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Class c = o.getClass();
        for (Method m : c.getMethods()) {
            if (m.getName().equals(methodName)) {
                Object ret = m.invoke(o);
                return ret;
            }
        }
        throw new RuntimeException("Could not find method named '"+methodName+"' on class " + c);

    }
    
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300, 200);        
        f.setVisible(true);
        
        final WindowHandleGetter whg = new WindowHandleGetter(f);
        
        long id = whg.getWindowId();
        System.out.println("ID: " + id);
        
    }


}