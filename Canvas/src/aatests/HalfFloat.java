package aatests;

import java.text.DecimalFormat;

public class HalfFloat {
 // on float
    // Bit 31 (the bit that is selected by the mask 0x80000000) represents the sign of the floating-point number. 
    // Bits 30-23 (the bits that are selected by the mask 0x7f800000) represent the exponent
    //  Bits 22-0 (the bits that are selected by the mask 0x007fffff) represent the mantissa. 
    // If the argument is positive infinity, the result is 0x7f800000.
    // If the argument is negative infinity, the result is 0xff800000. 
    // NAN is NAN ;)
    

    // ignores the higher 16 bits
    private static float SO_toFloat( int hbits )
    {
        int mant = hbits & 0x03ff;            // 10 bits mantissa
        int exp =  hbits & 0x7c00;            // 5 bits exponent
        if( exp == 0x7c00 )                   // NaN/Inf
            exp = 0x3fc00;                    // -> NaN/Inf
        else if( exp != 0 )                   // normalized value
        {
            exp += 0x1c000;                   // exp - 15 + 127
            if( mant == 0 && exp > 0x1c400 )  // smooth transition
                return Float.intBitsToFloat( ( hbits & 0x8000 ) << 16
                                                | exp << 13 | 0x3ff );
        }
        else if( mant != 0 )                  // && exp==0 -> subnormal
        {
            exp = 0x1c400;                    // make it normal
            do {
                mant <<= 1;                   // mantissa * 2
                exp -= 0x400;                 // decrease exp by 1
            } while( ( mant & 0x400 ) == 0 ); // while not normal
            mant &= 0x3ff;                    // discard subnormal bit
        }                                     // else +/-0 -> +/-0
        return Float.intBitsToFloat(          // combine all parts
            ( hbits & 0x8000 ) << 16          // sign  << ( 31 - 15 )
            | ( exp | mant ) << 13 );         // value << ( 23 - 10 )
    }
    
 // returns all higher 16 bits as 0 for all results
    private static int SO_fromFloat( float fval )
    {
        int fbits = Float.floatToIntBits( fval );
        int sign = fbits >>> 16 & 0x8000;          // sign only
        int val = ( fbits & 0x7fffffff ) + 0x1000; // rounded value

        if( val >= 0x47800000 )               // might be or become NaN/Inf
        {                                     // avoid Inf due to rounding
            if( ( fbits & 0x7fffffff ) >= 0x47800000 )
            {                                 // is or must become NaN/Inf
                if( val < 0x7f800000 )        // was value but too large
                    return sign | 0x7c00;     // make it +/-Inf
                return sign | 0x7c00 |        // remains +/-Inf or NaN
                    ( fbits & 0x007fffff ) >>> 13; // keep NaN (and Inf) bits
            }
            return sign | 0x7bff;             // unrounded not quite Inf
        }
        if( val >= 0x38800000 )               // remains normalized value
            return sign | val - 0x38000000 >>> 13; // exp - 127 + 15
        if( val < 0x33000000 )                // too small for subnormal
            return sign;                      // becomes +/-0
        val = ( fbits & 0x7fffffff ) >>> 23;  // tmp exp for subnormal calc
        int ret = sign | ( ( fbits & 0x7fffff | 0x800000 ) // add subnormal bit
                       + ( 0x800000 >>> val - 102 )     // round depending on cut off
                         >>> 126 - val );   // div by 2^(1-(exp-127+15)) and >> 13 | exp=0
        
        return (short)(ret & 0xFFFF) ;
    }
    
    public static short toHF(float fp32){
        int val = SO_fromFloat(fp32);
        return (short)(val & 0xFFFF);        
    }
    
    public static float toFloat(short half){
        int vh = (half & 0xffff);
        return SO_toFloat(vh);
    }
    
    public static float toFloat(int half){
        return SO_toFloat(half);
    }
    
   
    
	public static final int[] stripFP32(float fp32, int[] strip){
	 int bits = Float.floatToIntBits(fp32);
	 strip[0] = bits & 0x80000000;
	 strip[1] = bits & 0x7f800000;
	 strip[2] = bits & 0x007fffff;
	 return strip;
	}
	
    
    
    public static void main(String[] args) {
      debug( 0.0f);
      debug( 0.001f);
      debug( 0.9f);
      debug(-0.9f);
      
      debug(Float.NaN);
      
      debug(Float.MAX_VALUE);
      debug(Float.MIN_VALUE);
      
      debug(Float.POSITIVE_INFINITY);
      debug(Float.NEGATIVE_INFINITY);
      debug(65500f);
      debug(130000f);
      System.out.println("\nNear Zero test\n");
      
      if(false){
      float t    = -0.0001f;
      float step =  0.000005f;        
      
      while(t< 0.0001f){           
           debug(t);
           t += step;
       }
      }
      
      if(false)
      for(short i=-20; i<100; i++ ){
          System.out.println("i: " + i + ",\t hfloat: " + toFloat(i));
      }
      

    }
    static DecimalFormat dc = new DecimalFormat("###.0000000");
    public static final void debug(float flt){
        short half = toHF(flt);
        float back = toFloat(half);
        int bits = Float.floatToIntBits(flt);
        String bin = Integer.toBinaryString(bits);
        
        System.out.println("float: "  + flt /*dc.format(flt)*/ +",\t\t back:" + dc.format(back) + ",\t\t short: " + half); 
                //+ ", \t\t bits: "+ bin);
    }

}
