package gles.emulator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import gles.emulator.util.JAWT;

public class TestCanvas {
    
    public static void main(String[] args) {
	
	JFrame frame = new JFrame("Canvas Test");
	frame.setLayout(new BorderLayout());
	frame.setSize(640, 480);
	final CanvasEGL canvas = new CanvasEGL();
	frame.getContentPane().add(canvas,BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
		
	final JAWT jawt = new JAWT(canvas);
	
	final Runnable run = new Runnable() {	    
	    @Override
	    public void run() {
		
		//JAWT jawt = new JAWT(canvas);		
		long awt = jawt.getAwtHandler();		
		print("AWT handler: ", awt);
		jawt.dsLock();
		jawt.dsUnlock();
		
		long HDC = jawt.getDrawingSurfaceInfo().getHDC();
		long hwnd = jawt.getDrawingSurfaceInfo().getHWND();
		
		print("AWT HDC: ", HDC);
		print("AWT hwnd: ", hwnd);
		print("EGLNativeDisplayType: ", jawt.getDrawingSurfaceInfo().getEGLNativeDisplayType());
		print("EGLNativePixmapType: ", jawt.getDrawingSurfaceInfo().getEGLNativePixmapType());
		print("EGLNativeWindowType: ", jawt.getDrawingSurfaceInfo().getEGLNativeWindowType());
		
		System.out.println("Rectangle: " + jawt.getDrawingSurfaceInfo().getRectangle());
		
	    }
	};
	
	canvas.addComponentListener(new MyComponentListener(jawt,run));
	//SwingUtilities.invokeLater(run);
    }
    
    
    private static void print(String s, long val){
	System.out.println(s + "0x"+Long.toHexString(val));
    }

}
/**
 * Component listener 
 * @author Alessandro Borges
 *
 */
class MyComponentListener implements ComponentListener{

    private JAWT jawt;
    private Runnable runAction;
    public MyComponentListener(JAWT jawt, Runnable runAction){
	this.jawt = jawt;
	this.runAction = runAction;
    }
    
    @Override
    public void componentHidden(ComponentEvent e) {
	System.out.println("\n Component Hidden");
	runAction.run();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
	System.out.println("\n Component Moved");
	runAction.run();
	
    }

    @Override
    public void componentResized(ComponentEvent e) {
	System.out.println("\n Component Resized");
	runAction.run();
    }

    @Override
    public void componentShown(ComponentEvent e) {
	System.out.println("\n Component Shown");
	runAction.run();
    }
    
}// class myComponent Listener
