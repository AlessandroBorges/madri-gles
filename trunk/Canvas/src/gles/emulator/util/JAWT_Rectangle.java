package gles.emulator.util;

class JAWT_Rectangle{
   
    public int x;
    public int y;
    public int width;
    public int height;
    
    
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
    
}