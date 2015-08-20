package gles.texture;

import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * Unfinished class to handle OpenGL palleted textures.
 * @author Alessandro Borges
 *
 */
public class PaletteTexture {
    
    public static final int RGB = 1;
    public static final int RGBA = 2;
    
    private static final int BIT_4 = 4;
    private static final int BIT_8 = 8;
        
    public enum COMPRESSED_FORMAT_TYPE {
        PALETTE4_RGB8_OES (RGB,  BIT_4, 24, 0x8B90),
        PALETTE4_RGBA8_OES(RGBA, BIT_4, 32, 0x8B91),
        PALETTE4_R5_G6_B5_OES(RGB,  BIT_4, 16, 0x8B92),
        PALETTE4_RGBA4_OES   (RGBA, BIT_4, 16, 0x8B93),
        PALETTE4_RGB5_A1_OES (RGBA, BIT_4, 16, 0x8B94),
        PALETTE8_RGB8_OES  (RGB,  BIT_8, 24, 0x8B95),
        PALETTE8_RGBA8_OES (RGBA, BIT_8, 32, 0x8B96),
        PALETTE8_R5_G6_B5_OES(RGB,  BIT_8, 16, 0x8B97),
        PALETTE8_RGBA4_OES   (RGBA, BIT_8, 16, 0x8B98),
        PALETTE8_RGB5_A1_OES (RGBA, BIT_8, 16, 0x8B99);

        public int paletteEntryBits;
        public int baseFormat;
        public int bits;
        public int internalFormat;

        COMPRESSED_FORMAT_TYPE(int baseformat, int bits, int paletteEntryBits, int internalFormat) {
            this.baseFormat = baseformat;
            this.bits = bits;
            this.paletteEntryBits = paletteEntryBits;
            this.internalFormat = internalFormat;
        }
    }
    
    public int width, height;
    public int colorCount;
    public byte[] palette;
    public byte[] texelData;
    public COMPRESSED_FORMAT_TYPE type;
    
    /**
     * Constructor
     * 
     * @param type COMPRESSED_FORMAT_TYPE
     * @param width texture width
     * @param height texture heigh
     */
    public PaletteTexture(COMPRESSED_FORMAT_TYPE type, int width, int height){
        this.type = type;
        this.width = width;
        this.height = height;
        init();
    }
    
    public PaletteTexture(COMPRESSED_FORMAT_TYPE type, BufferedImage image){
        this(type, image.getWidth(), image.getHeight());
        compress(image);
    }
    
    
    private void init(){
        int texCount = width * height;
        this.colorCount = type.bits==BIT_8 ? 256 : 16;
        
        int paletteSize =  (type.paletteEntryBits * colorCount) / 8;
        int dataSize = texCount;
        if(colorCount==16){
            dataSize = texCount / 2;
        }
        palette = new byte[paletteSize];
        texelData = new byte[dataSize];
    }
    
    public void compress(BufferedImage image){
        // color statics
        // get the 512 most used colors
        int count = 1024;
        int[] colors= new int[count];
        int[] stats = new int[count];
        
       //TODO use JH filters   http://www.jhlabs.com/ip/filters/download.html
        
    }
    
    

}
