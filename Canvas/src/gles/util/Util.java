package gles.util;
public class Util {

	/**
	 * half float -
	 * 
	 * <pre>
	 * A 16-bit floating-point number has a 1-bit sign (S), a 5-bit
	 * exponent (E), and a 10-bit mantissa (M).  The value of a 16-bit
	 * floating-point number is determined by the following:
	 * 
	 *   (-1)^S * 0.0,                        if E == 0 and M == 0,
	 *   (-1)^S * 2^-14 * (M / 2^10),         if E == 0 and M != 0,
	 *   (-1)^S * 2^(E-15) * (1 + M/2^10),    if 0 < E < 31,
	 *   (-1)^S * INF,                        if E == 31 and M == 0, or
	 *   NaN,                                 if E == 31 and M != 0,
	 * 
	 * where
	 * 
	 *   S = floor((N mod 65536) / 32768),
	 *   E = floor((N mod 32768) / 1024), and
	 *   M = N mod 1024.
	 * </pre>
	 * 
	 * @param f
	 * @return
	 */
	public static short toHF2(float f) {
		short hf = toHalf(f);
		return hf;
	}
	
	public static short[] toHalfFloat(float[] f, short[] half){
		int sz = half.length;
		for(int i=0; i<sz;i++){
			half[i]=toHalf(f[i]);
		}		
		return half;		
	}
	
	

	/**
	 * Converts a single precision (32 bit) floating point value into half
	 * precision (16 bit).
	 *
	 * <p>
	 * Source: <a
	 * href="http://www.fox-toolkit.org/ftp/fasthalffloatconversion.pdf">
	 * http://www.fox-toolkit.org/ftp/fasthalffloatconversion.pdf</a><br>
	 * <strong>broken link</strong>
	 *
	 * @param half
	 *            The half floating point value as a short.
	 * @return floating point value of the half.
	 */
	public static float toFloat(short half) {
		switch ((int) half) {
		case 0x0000:
			return 0f;
		case 0x8000:
			return -0f;
		case 0x7c00:
			return Float.POSITIVE_INFINITY;
		case 0xfc00:
			return Float.NEGATIVE_INFINITY;
			// TODO: Support for NaN?
		default:
			return Float.intBitsToFloat(((half & 0x8000) << 16)
					| (((half & 0x7c00) + 0x1C000) << 13)
					| ((half & 0x03FF) << 13));
		}
	}

	/**
	 * convert a 32bits float to 16bit half float
	 * @param flt 32 bits float
	 * @return short 16bit half float
	 */
	public static short toHalf(float flt) {
		if (Float.isNaN(flt)) {
		      return 0;
			//throw new UnsupportedOperationException("NaN to half conversion not supported!");
		} else if (flt == Float.POSITIVE_INFINITY) {
			return (short) 0x7c00;
		} else if (flt == Float.NEGATIVE_INFINITY) {
			return (short) 0xfc00;
		} else if (flt == 0f) {
			return (short) 0x0000;
		} else if (flt == -0f) {
			return (short) 0x8000;
		} else if (flt > 65504f) {
			// max value supported by half float
			return 0x7bff;
		} else if (flt < -65504f) {
			return (short) (0x7bff | 0x8000);
		} else if (flt > 0f && flt < 5.96046E-8f) {
			return 0x0001;
		} else if (flt < 0f && flt > -5.96046E-8f) {
			return (short) 0x8001;
		}

		int f = Float.floatToIntBits(flt);
		return (short) (((f >> 16) & 0x8000)
				| ((((f & 0x7f800000) - 0x38000000) >> 13) & 0x7c00) | ((f >> 13) & 0x03ff));
	}

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		for(float f=-1.0f; f < 1.0f; f+=0.001554f){
			
			short half = toHalf(f);
			float hf = toFloat(half);
			
			System.out.println("Float: "+ f  +",\t HF: "+hf + " - \t diff: "+(f-hf));
		}
		
	}

}
