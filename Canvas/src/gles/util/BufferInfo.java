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
    	
    	if( null==b || !b.isDirect()) return 0;
    	
    	int elementSizeShift = getElementSizeShift(b);        
        return ((b.position()) << elementSizeShift);
    }
    
    
    /**
     *  Get Offset from base address to current position.<br>
     *  
     *  Same as getOffsetInBytes(java.nio.Buffer). <br>
     *  
     *  See {@link #getOffsetInBytes(Buffer)}
     *  
     * @param buffer buffer to query
     * @return offset from baseAddress to current position, in element size.
     */
    
      public static int getOffset(Buffer buffer) { 
          if(buffer.isDirect()){
              return getOffsetInBytes(buffer);
          }else{
              int offset = buffer.arrayOffset();
              int position = buffer.position();
              return offset + position;
          }
    }   
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param intBuffer IntBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(IntBuffer intBuffer) { 
          
          if(intBuffer.isDirect()){
              return intBuffer.position();
          }else{
              int offset = intBuffer.arrayOffset();
              int position = intBuffer.position();
              return offset + position;
          }
      }
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br> 
       * 
       * @param floatBuffer FloatBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(FloatBuffer floatBuffer) {          
          if(floatBuffer.isDirect()){
              return floatBuffer.position();
          }else{
              int offset = floatBuffer.arrayOffset();
              int position = floatBuffer.position();
              return offset + position;
          }
      }
      
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param shortBuffer ShortBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(ShortBuffer shortBuffer) {         
          if(shortBuffer.isDirect()){
              return shortBuffer.position();
          }else{
              int offset = shortBuffer.arrayOffset();
              int position = shortBuffer.position();
              return offset + position;
          }
      }
      
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param charBuffer CharBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(CharBuffer charBuffer) {      
          if(charBuffer.isDirect()){
              return charBuffer.position();
          }else{
              int offset = charBuffer.arrayOffset();
              int position = charBuffer.position();
              return offset + position;
          }
      }

      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param byteBuffer ByteBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(ByteBuffer byteBuffer) { 
          if(byteBuffer.isDirect()){
              return byteBuffer.position();
          }else{
              int offset = byteBuffer.arrayOffset();
              int position = byteBuffer.position();
              return offset + position;
          }
      }
      
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param longBuffer LongBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(LongBuffer longBuffer) { 
          if(longBuffer.isDirect()){
              return longBuffer.position();
          }else{
              int offset = longBuffer.arrayOffset();
              int position = longBuffer.position();
              return offset + position;
          }
      }
      
      /**
       * Get Offset from base address to current position.<br>
       * 
       * Same as buffer.position()<br>
       * 
       * @param doubleBuffer DoubleBuffer instance
       * @return offset current buffer position, in element size.
       */
      public static int getOffset(DoubleBuffer doubleBuffer) { 
          if(doubleBuffer.isDirect()){
              return doubleBuffer.position();
          }else{
              int offset = doubleBuffer.arrayOffset();
              int position = doubleBuffer.position();
              return offset + position;
    }
      }
      
      /**
      * Returns the underlying native pointer to the data of the given
      * Buffer starting at the Buffer's current position, or 0 if the
      * Buffer is not backed by native heap storage.
      */
      public static long getBasePointer(Buffer b) {
        long address = getAddress(b); // b.effectiveDirectAddress;
        if (address == 0L) {
            return 0L;
        }
        // return address + (b.position() << b._elementSizeShift);

        int _elementSizeShift = getElementSizeShift(b);
        return address + (b.position() << _elementSizeShift);
      }
    
    
      /**
      * Returns the underlying Java array containing the data of the
      * given Buffer, or null if the Buffer is not backed by a Java array.
      */
        public static Object getBaseArray(Buffer b) {
            return b.hasArray() ? b.array() : null;
        }
        
        
      /**
       * <pre>
      * Returns the offset in <b>bytes</b> from the start of the underlying
      * Java array object containing the data of the given Buffer to
      * the actual start of the data. The start of the data takes into
      * account the Buffer's current position. This method is only
      * meaningful if getBaseArray() returns non-null.
      * 
      * Calc:
      * 
      *    (b.arrayOffset() + b.position()) << elementSizeShift;
      * 
      * </pre>
      * @return base array in bytes. (b.arrayOffset() + b.position()) << elementSizeShift
      */
      public static int getBaseArrayOffset(Buffer b) {
          //return b.hasArray() ? ((b.arrayOffset() + b.position) << b._elementSizeShift) : 0;
          int _elementSizeShift = getElementSizeShift(b);
          return b.hasArray() ? ((b.arrayOffset() + b.position()) << _elementSizeShift) : 0;
      }
      
	
    /**
     * String values of Buffer
     * @param b buffer to read
     * @return String representation of this element
     */

	

	public static String toString(Buffer b) {
		if( b==null) return null;
	    int offset = 0;
	   
	    if(b instanceof FloatBuffer)   { offset = getOffset((FloatBuffer)b);   } else
	    if(b instanceof IntBuffer)     { offset = getOffset((IntBuffer)b);     } else
	    if(b instanceof ShortBuffer)   { offset = getOffset((ShortBuffer)b);   } else
	    if(b instanceof CharBuffer)    { offset = getOffset((CharBuffer)b);    } else
	    if(b instanceof ByteBuffer)    { offset = getOffset((ByteBuffer)b);    } else    
	    if(b instanceof LongBuffer)    { offset = getOffset((LongBuffer)b);    } else
	    if(b instanceof DoubleBuffer)  { offset = getOffset((DoubleBuffer)b);  }
	    	     
	    boolean hasArray = b.hasArray();
	    int arrayOffset = hasArray? b.arrayOffset() : 0;
	    Object hb = hasArray ? b.array() : null;
		
		return "BufferInfo [address=" +  getAddress(b) + 
				", offset=" + offset +
				", offsetBytes=" + getOffsetInBytes(b) +
				", pointer=" + getPointer(b) +
				", basePointer=" + getBasePointer(b) +
				", position=" + b.position() + 
				", elementSizeShift=" + getElementSizeShift(b) + 
				", remaining="	+ b.remaining() + 
				", isDirect=" + b.isDirect() + 
				", hasArray=" + hasArray +
				", arrayOffset=" + arrayOffset +
				", hb=" +  hb 
				+ "]";
	}
	
	

}
