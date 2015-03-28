/**
 * 
 */
package gles.util;

import java.nio.*;
import java.lang.reflect.Field;

/**
 * 
 * This class stores raw information about java.nio.Buffers.<br>
 * 
 * Used the JNI when using Buffers
 * 
 * @author Alessandro Borges
 *
 */
public class BufferInfo {
	
	/**
	 * store the "address" field from java.nio.Buffer class.	
	 */
   private static Field fieldAddress;
	
	static{
		 try {
			fieldAddress = Buffer.class.getDeclaredField("address");
			fieldAddress.setAccessible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Initialize BufferInfo
	 * @param buffer buffer to introspect 
	 */
	private BufferInfo(){		
	}
	
	
	
	
	/**
	 * Get current pointer, i.e., the base address plus offset.
	 * 
	 * @param b buffer to query.
	 * @return value of getAddress(b) + getOffsetInBytes(b)
	 */
	public static long getPointer(Buffer b){
		// sanity check
				if(b == null || !b.isDirect()){
					return 0L;
				}
			return getAddress(b) + getOffsetInBytes(b);			
	}
	
	/**
	 * Get native base address.
	 * Return OL if it is null or non direct buffer.
	 * 
	 *    	
	 * @param b Buffer to query
	 * @return base native address 
	 */
	public static long getAddress(Buffer b){		
		// sanity check
		if(b == null || !b.isDirect()){
			return 0L;
		}
		
		long address = 0;
		try {
			address = fieldAddress.getLong(b);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return address;
	}
	
	/**
	 * Get element Shift to get size in bytes.
	 * 
	 * @param b Buffer subclass
	 * @return the bit shift ( << ) to get size of buffer element.  
	 */
	public static int getElementSizeShift(Buffer b) {

		// sanity check
		if (b == null || !b.isDirect()) {
			return 0;
		}
		
		// LongBuffer & DoubleBuffer case
		int elementSizeShift = 4;

		if (b instanceof IntBuffer || b instanceof FloatBuffer) {
			elementSizeShift = 2;
		} else if (b instanceof ByteBuffer) {
			elementSizeShift = 0;
		} else if (b instanceof ShortBuffer || b instanceof CharBuffer) {
			elementSizeShift = 1;
		}

		return elementSizeShift;
	}
	
	
	
	/**
     * Returns the pointer  offset pointer to the data of the given
     * Buffer, assuming Buffer's current position, or 0 if the
     * Buffer is not backed by native heap storage.
     * 
     * @param  buffer to query
     * @return offset from baseAddress to current position, in bytes.
     */
    public static int getOffsetInBytes(Buffer b) {  
    	
    	if(!b.isDirect()) return 0;
    	
    	int elementSizeShift = getElementSizeShift(b);        
        return ((b.position()) << elementSizeShift);
    }
    
    
    /**
     *  Get Offset from base address to current position.<br>
     *  
     *  Same as getPosition.
     *  
     * @param b buffer to query
     * @return offset from baseAddress to current position, in element size.
     */
    
      public static long getElementOffset(Buffer b) { 
        return b.position();
    }

	

	public static String toString(Buffer b) {
		
		return "BufferInfo [address=" +  getAddress(b) + 
				", offset=" + getElementOffset(b) +
				", offsetBytes=" + getOffsetInBytes(b) +
				", pointer=" + getPointer(b) +
				", position=" + b.position() + 
				", elementSizeShift=" + getElementSizeShift(b) + 
				", remaining="	+ b.remaining() + 
				", isDirect=" + b.isDirect() + "]";
	}
	
	

}
