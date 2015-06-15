package gles.emulator.util;

import java.awt.Rectangle;

@SuppressWarnings("serial")
class JAWT_Rectangle extends java.awt.Rectangle{
   
//    public int x;
//    public int y;
//    public int width;
//    public int height;
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("JAWT_Rectangle [x=");
	builder.append(x);
	builder.append(", y=");
	builder.append(y);
	builder.append(", width=");
	builder.append(width);
	builder.append(", height=");
	builder.append(height);
	builder.append("]");
	return builder.toString();
    }

    public JAWT_Rectangle() {
        super();
    }

    public JAWT_Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);       
    }

    public JAWT_Rectangle(int width, int height) {
        super(width, height);       
    }

    public JAWT_Rectangle(Rectangle r) {
        super(r);
    }
    
}