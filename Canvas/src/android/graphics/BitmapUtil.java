package android.graphics;

class BitmapUtil {
    
    /**
     * Convert Pre-Multiplied Color to ARGB color.
     * 
     * @param pmColor - Alpha Pre-Multiplied Color
     * 
     * @return ARGB color un-pre-multiplied.
     */
   public static int  skPMColorToColor(int pmColor) {
        int a = skGetPackedA32(pmColor);
        int scale = getScale(a);
        return skColorSetARGB(a,
                              applyScale(scale, skGetPackedR32(pmColor)),
                              applyScale(scale, skGetPackedG32(pmColor)),
                              applyScale(scale, skGetPackedB32(pmColor)));
    }  
    
//   public static int unPreMultiplyPreservingByteOrder(int c) {
//       int a = skGetPackedA32(c);
//       int scale = getScale(a);
//       return skColorSetARGB(a,
//                             applyScale(scale, skGetPackedR32(c)),
//                             applyScale(scale, skGetPackedG32(c)),
//                             applyScale(scale, skGetPackedB32(c)));
//   }
   
   /**
    * Get ARGB from RGB
    * @param r red component
    * @param g green component
    * @param b blue component
    * 
    * @return ARGB color with full opaque alpha, i.e., OxFFrrggbb
    */
   public static int skColorSetRGB(byte r, byte g, byte b) { 
       return skColorSetARGB((byte)0xFF, r, g, b); 
       }
   
   /**
    *  Same as skPackARGB32, but this version guarantees to not check that the
    *  values are premultiplied in the debug version.
    */
//   private static int /* SkPMColor*/ skPackARGB32NoCheck(byte a, byte r, byte g, byte b) {
//            return (a << 24) | (r << 16) | (g << 8) | (b << 0);
//     }
   
   /**
    * create a ARGB int from ARGB components
    * @param a - alpha value in lowest byte [0..255]
    * @param r - red value in lowest byte [0..255]
    * @param g - green value in lowest byte [0..255]
    * @param b - blue value in lowest byte [0..255]
    * 
    * @return int value with packed ARGB color code 
    */
   public static final int skColorSetARGB(int a, int r, int g, int b){
       return ((a & 0xff) << 24) | ((r & 0xff)  << 16) | ((g  & 0xff)  << 8) | ((b  & 0xff)  << 0);
   }
   
   /**
    * create a ARGB int from ARGB componets
    * @param a - alpha value [0..255]
    * @param r - red value   [0..255]
    * @param g - green value [0..255]
    * @param b - blue value  [0..255]
    * 
    * @return int value with packed ARGB color code 
    */
   public static final int skColorSetARGB(byte a, byte r, byte g, byte b){
       return ((a & 0xff) << 24) | ((r & 0xff)  << 16) | ((g  & 0xff)  << 8) | ((b  & 0xff)  << 0);
   }
   
   /**
    * Converts a non-pre-multiplied color to alpha-pre-multiplied alpha function
    * 
    * @param a - alpha value [0..255]
    * @param r - red value   [0..255]
    * @param g - green value [0..255]
    * @param b - blue value  [0..255]
    * 
    * @return packed int ARGB color pre-multiplied color
    */
   public static int /*SkPMColor*/ skPremultiplyARGB(byte a, byte r, byte g, byte b) {
         
        if (a != 255) {
            r = skMulDiv255Round(r, a);
            g = skMulDiv255Round(g, a);
            b = skMulDiv255Round(b, a);
        }
        return skColorSetARGB(a, r, g, b);
   }
   
   /**
    * Converts a non-pre-multiplied color to alpha-pre-multiplied color.
    * 
    * @param color - packed  ARGB 8888 color,  as 0xAArrggbb
     
    * @return packed int ARGB 8888 color pre-multiplied color
    */
   public static int /*SkPMColor*/ skPremultiplyARGB(int color) {
              
       byte r = (byte)((color >> 16) & 0xFF);
       byte g = (byte)((color >>  8) & 0xFF);
       byte b = (byte)((color      ) & 0xFF);
       
       byte a = (byte)((color >> 24) & 0xFF);
       if (a != 255) {
           r = skMulDiv255Round(r, a);
           g = skMulDiv255Round(g, a);
           b = skMulDiv255Round(b, a);
       }
       return skColorSetARGB(a, r, g, b);
  }
   
   
   /** 
    * Return a*b/255, rounding any fractional bits. Only valid if both
    * a and b are [0..255]

    * @param a - byte value
    * @param b - byte value
    * 
    * @return rounded (a * b) / 255. 
    */
   private static byte skMulDiv255Round(byte a, byte b){
       int aa = a & 0xff;
       int bb = b & 0xff;
       int prod = aa * bb;
       return (byte)((prod + (prod >> 8))>>8);       
   }
   
   
   private static final byte skColorGetA(int color) { return (byte)((color >> 24) & 0xff); }                 
   private static final byte skColorGetR(int color) { return (byte)((color >> 16) & 0xff); }   
   private static final byte skColorGetG(int color) { return (byte)((color >>  8) & 0xff); }
   private static final byte skColorGetB(int color) { return (byte)((color      ) & 0xff); }
   
   /** 
    * Return component as int
    * @param packed component
    * @return
    */
   private static final int skGetPackedA32(int packed){ return (packed  >> 24); }
   private static final int skGetPackedR32(int packed){ return ((packed << (24 - 16)) >> 24); }
   private static final int skGetPackedG32(int packed){ return ((packed << (24 -  8)) >> 24); }
   private static final int skGetPackedB32(int packed){ return ((packed << (24 -  0)) >> 24); }
   
   
  /**
   *  
   * @param alpha
   * @return
   */
  private static int getScale(int alpha) {
       //SkASSERT(alpha <= 255);
       int index = (alpha & 0xFF); 
       return gTable[index];
   }
  
  /**
   * testing
   * @param args
   */
  public static void main(String[] args) {
   
      int color = 0xAABBCC;
      int aColor = skColorSetRGB(skColorGetR(color), skColorGetG(color), skColorGetB(color)); 
      out("color " + hex(color));
      out("aColor " + hex(aColor));
      
      int unPMColor = 0x7f887799;
      int pmColor = skPremultiplyARGB(unPMColor);
      int uuColor = skPMColorToColor(pmColor);
      
      out("unPMColor: " + hex(unPMColor));
      out("pmColor: " + hex(pmColor));
      out("restored uuColor: " + hex(uuColor));
      
 }
  
  private static void out(String s){
      System.out.println(s);
  }
  
  private static String hex(int i){
      return "0x"+Integer.toHexString(i) + " ";
  }
  
  private static String hex(byte b){
      return "0x"+Integer.toHexString((int)(b & 0xff)) + " ";
  }
  
    /**
     * <pre>
     * Usage:
     * const Scale* table = SkUnPreMultiply::GetScaleTable();
     * for (...) {
     * unsigned a = ...
     * SkUnPreMultiply::Scale scale = table[a];
     * red = SkUnPreMultiply::ApplyScale(scale, red);
     * ...
     * // now red is unpremultiplied
     * </pre>
     * @param scale to apply
     * }
     */
    private static byte applyScale(int scale, int component) {
        // SkASSERT(component <= 255);
        return (byte) (((scale * component + (1 << 23)) >> 24) & 0xff);
    }
    
  private  static int gTable[] = {
            0x00000000, 0xFF000000, 0x7F800000, 0x55000000, 0x3FC00000, 0x33000000, 0x2A800000, 0x246DB6DB,
            0x1FE00000, 0x1C555555, 0x19800000, 0x172E8BA3, 0x15400000, 0x139D89D9, 0x1236DB6E, 0x11000000,
            0x0FF00000, 0x0F000000, 0x0E2AAAAB, 0x0D6BCA1B, 0x0CC00000, 0x0C249249, 0x0B9745D1, 0x0B1642C8,
            0x0AA00000, 0x0A333333, 0x09CEC4EC, 0x0971C71C, 0x091B6DB7, 0x08CB08D4, 0x08800000, 0x0839CE74,
            0x07F80000, 0x07BA2E8C, 0x07800000, 0x07492492, 0x07155555, 0x06E45307, 0x06B5E50D, 0x0689D89E,
            0x06600000, 0x063831F4, 0x06124925, 0x05EE23B9, 0x05CBA2E9, 0x05AAAAAB, 0x058B2164, 0x056CEFA9,
            0x05500000, 0x05343EB2, 0x0519999A, 0x05000000, 0x04E76276, 0x04CFB2B8, 0x04B8E38E, 0x04A2E8BA,
            0x048DB6DB, 0x0479435E, 0x0465846A, 0x045270D0, 0x04400000, 0x042E29F8, 0x041CE73A, 0x040C30C3,
            0x03FC0000, 0x03EC4EC5, 0x03DD1746, 0x03CE540F, 0x03C00000, 0x03B21643, 0x03A49249, 0x03976FC6,
            0x038AAAAB, 0x037E3F20, 0x03722983, 0x03666666, 0x035AF287, 0x034FCACE, 0x0344EC4F, 0x033A5441,
            0x03300000, 0x0325ED09, 0x031C18FA, 0x0312818B, 0x03092492, 0x03000000, 0x02F711DC, 0x02EE5847,
            0x02E5D174, 0x02DD7BAF, 0x02D55555, 0x02CD5CD6, 0x02C590B2, 0x02BDEF7C, 0x02B677D4, 0x02AF286C,
            0x02A80000, 0x02A0FD5C, 0x029A1F59, 0x029364D9, 0x028CCCCD, 0x0286562E, 0x02800000, 0x0279C952,
            0x0273B13B, 0x026DB6DB, 0x0267D95C, 0x026217ED, 0x025C71C7, 0x0256E62A, 0x0251745D, 0x024C1BAD,
            0x0246DB6E, 0x0241B2F9, 0x023CA1AF, 0x0237A6F5, 0x0232C235, 0x022DF2DF, 0x02293868, 0x02249249,
            0x02200000, 0x021B810F, 0x021714FC, 0x0212BB51, 0x020E739D, 0x020A3D71, 0x02061862, 0x02020408,
            0x01FE0000, 0x01FA0BE8, 0x01F62762, 0x01F25214, 0x01EE8BA3, 0x01EAD3BB, 0x01E72A08, 0x01E38E39,
            0x01E00000, 0x01DC7F11, 0x01D90B21, 0x01D5A3EA, 0x01D24925, 0x01CEFA8E, 0x01CBB7E3, 0x01C880E5,
            0x01C55555, 0x01C234F7, 0x01BF1F90, 0x01BC14E6, 0x01B914C2, 0x01B61EED, 0x01B33333, 0x01B05161,
            0x01AD7943, 0x01AAAAAB, 0x01A7E567, 0x01A5294A, 0x01A27627, 0x019FCBD2, 0x019D2A20, 0x019A90E8,
            0x01980000, 0x01957741, 0x0192F685, 0x01907DA5, 0x018E0C7D, 0x018BA2E9, 0x018940C5, 0x0186E5F1,
            0x01849249, 0x018245AE, 0x01800000, 0x017DC11F, 0x017B88EE, 0x0179574E, 0x01772C23, 0x01750750,
            0x0172E8BA, 0x0170D045, 0x016EBDD8, 0x016CB157, 0x016AAAAB, 0x0168A9B9, 0x0166AE6B, 0x0164B8A8,
            0x0162C859, 0x0160DD68, 0x015EF7BE, 0x015D1746, 0x015B3BEA, 0x01596596, 0x01579436, 0x0155C7B5,
            0x01540000, 0x01523D04, 0x01507EAE, 0x014EC4EC, 0x014D0FAC, 0x014B5EDD, 0x0149B26D, 0x01480A4B,
            0x01466666, 0x0144C6B0, 0x01432B17, 0x0141938C, 0x01400000, 0x013E7064, 0x013CE4A9, 0x013B5CC1,
            0x0139D89E, 0x01385831, 0x0136DB6E, 0x01356246, 0x0133ECAE, 0x01327A97, 0x01310BF6, 0x012FA0BF,
            0x012E38E4, 0x012CD45A, 0x012B7315, 0x012A150B, 0x0128BA2F, 0x01276276, 0x01260DD6, 0x0124BC45,
            0x01236DB7, 0x01222222, 0x0120D97D, 0x011F93BC, 0x011E50D8, 0x011D10C5, 0x011BD37A, 0x011A98EF,
            0x0119611A, 0x01182BF3, 0x0116F970, 0x0115C988, 0x01149C34, 0x0113716B, 0x01124925, 0x01112359,
            0x01100000, 0x010EDF12, 0x010DC087, 0x010CA458, 0x010B8A7E, 0x010A72F0, 0x01095DA9, 0x01084AA0,
            0x010739CE, 0x01062B2E, 0x01051EB8, 0x01041466, 0x01030C31, 0x01020612, 0x01010204, 0x01000000
        };
  
  
 
  
}
