package android.graphics;

import java.nio.Buffer;

class GraphicBuffer {
    
    public enum Usage {
        USAGE_SW_READ_NEVER ,    
        USAGE_SW_READ_RARELY,   
        USAGE_SW_READ_OFTEN,     
        USAGE_SW_READ_MASK,     
        
        USAGE_SW_WRITE_NEVER,   
        USAGE_SW_WRITE_RARELY,  
        USAGE_SW_WRITE_OFTEN,   
        USAGE_SW_WRITE_MASK,     
        USAGE_SOFTWARE_MASK,    
        USAGE_PROTECTED,        
        USAGE_HW_TEXTURE,       
        USAGE_HW_RENDER,        
        USAGE_HW_2D,            
        USAGE_HW_COMPOSER,      
        USAGE_HW_VIDEO_ENCODER, 
        USAGE_HW_MASK         
    }; 
    
    private int width, height, stride;
    private Usage usage;
    private PixelFormat format;
    private Buffer nativeBuffer;
    
    public enum PixelFormat{
        GL_RGB,
        GL_RGBA
    }
    
    public GraphicBuffer(){        
    }
    // creates w * h buffer
    public GraphicBuffer(int w, int h, PixelFormat format, Usage usage){
        
    }
    
    // create a buffer from an existing handle
    GraphicBuffer(int w, int h, 
                  PixelFormat format, 
                  Usage usage,
                  int stride, long handle, boolean keepOwnership)
                  {}
        
 
    // create a buffer from an existing ANativeWindowBuffer
    //GraphicBuffer(ANativeWindowBuffer* buffer, boolean keepOwnership){    }
    
    /**
     * ANativeWindowBuffer*
     */
    public Buffer getNativeBuffer() {
        return nativeBuffer;
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getStride() {
        return stride;
    }

    public Usage getUsage() {
        return usage;
    }

    public PixelFormat getPixelFormat() {
        return format;
    }

    public Rect getBounds() {
        return new Rect(width, height);
    }

}
