/**
 * 
 */
package gles.emulator;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

/**
 * The emulator Window
 * @author Alessandro Borges
 *
 */
public class Emulator extends JFrame {

   
    protected static String SUB_TITLE = "GLES Emulator"; 
    protected static String DIV = " - ";
    protected CanvasEGL myCanvasEGL;
    protected JPanel controlPanel;
    
    /**
     * Window Size
     */
    protected int mHeight = 640, mWidth=512;

    public Emulator(String title) throws HeadlessException {
        super(SUB_TITLE + DIV + title);
        jbInit();
    }
    
    public Emulator(GraphicsConfiguration gc) {
        super(SUB_TITLE,gc);
        jbInit();
    }
    
    public Emulator(String title, GraphicsConfiguration gc, int width, int height) {
        super(SUB_TITLE + DIV +  title, gc);  
        this.mHeight = height;
        this.mWidth = width;
        jbInit();
    }

   
    protected void jbInit(){        
        Dimension size = new Dimension(mWidth, mHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCanvasEGL = new CanvasEGL();
        myCanvasEGL.setPreferredSize(size);
        
        setLayout(new BorderLayout());
        add(myCanvasEGL,BorderLayout.CENTER);
        pack();
        
        addWindowListener(myWindowAdapter);
        this.setVisible(true);
        
        checkWM();
    }
    
    /**
     * Called when window is closing.
     */
    protected void closing(){
        System.out.println("Window closing");
    }
    
    /**
     * Called when windows is opened, it calls a invoke later 
     * CanvasEGL.nativeBinding(); 
     */
   protected void opened(){
       System.out.println("Window opened");
      SwingUtilities.invokeLater(runJAWT);
       
    }
    
    final WindowAdapter myWindowAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            closing();
        }
        
        public void windowOpened(WindowEvent e){
             opened();
        }
        
    };
    
    /**
     * 
     */
    final Runnable runJAWT = new Runnable() {
        @Override
        public void run() {            
            myCanvasEGL.nativeBinding();
        }
    };
    
    
    
    private void checkWM() {
        Toolkit tk = this.getToolkit();
        if (!(tk.isFrameStateSupported(Frame.ICONIFIED))) {
            print("Your window manager doesn't support ICONIFIED.");
        } else print("Your window manager supports ICONIFIED.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_VERT))) {
            print("Your window manager doesn't support MAXIMIZED_VERT.");
        } else print("Your window manager supports MAXIMIZED_VERT.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_HORIZ))) {
            print("Your window manager doesn't support MAXIMIZED_HORIZ.");
        } else print("Your window manager supports MAXIMIZED_HORIZ.");
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_BOTH))) {
            print("Your window manager doesn't support MAXIMIZED_BOTH.");
        } else {
            print("Your window manager supports MAXIMIZED_BOTH.");
        }
    }
    
    void print(String msg) {
        //display.append(msg + newline);
        System.out.println(msg);
    }

    void displayStateMessage(String prefix, WindowEvent e) {
        int state = e.getNewState();
        int oldState = e.getOldState();
        String msg = prefix
                   + '\n' + ' '
                   + "New state: "
                   + convertStateToString(state)
                   + '\n' + ' '
                   + "Old state: "
                   + convertStateToString(oldState);
        print(msg);
    }
    
    String convertStateToString(int state) {
        if (state == Frame.NORMAL) {
            return "NORMAL";
        }
        String strState = " ";
        if ((state & Frame.ICONIFIED) != 0) {
            strState += "ICONIFIED";
        }
        //MAXIMIZED_BOTH is a concatenation of two bits, so
        //we need to test for an exact match.
        if ((state & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH) {
            strState += "MAXIMIZED_BOTH";
        } else {
            if ((state & Frame.MAXIMIZED_VERT) != 0) {
                strState += "MAXIMIZED_VERT";
            }
            if ((state & Frame.MAXIMIZED_HORIZ) != 0) {
                strState += "MAXIMIZED_HORIZ";
            }
            if (" ".equals(strState)){
                strState = "UNKNOWN";
            }
        }
        return strState.trim();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
      
        final Runnable doRun =  new Runnable() {
            public void run() {
                final Emulator emulator = new Emulator("Emulator");
            }
        };
        
        SwingUtilities.invokeLater(doRun);

    }

    
}
