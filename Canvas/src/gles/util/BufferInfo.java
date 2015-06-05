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
    private static Field  fieldAddress;
    private static String NDARRAY = " is not direct and neither backed by an accessible array.";

    static {
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
     * 
     * @param buffer buffer to introspect
     */
    private BufferInfo() {
    }

    /**
     * Get current pointer, i.e., the base address plus offset.
     * 
     * @param buffer a direct buffer to query. 
     * @return value of getAddress(b) + getOffsetInBytes(b). 
     *         Returns 0L if buffer is null or not a direct buffer.
     */
    public static long getPointer(Buffer buffer) {
        // sanity check
        if (buffer == null || !buffer.isDirect()) { return 0L; }
        return getAddress(buffer) + getOffsetInBytes(buffer);
    }

    /**
     * Get native base address.
     * Return OL if it is null or non direct buffer.
     * 
     * 
     * @param b Buffer to query
     * @return base native address
     */
    public static long getAddress(Buffer b) {
        // sanity check
        if (b == null || !b.isDirect()) { return 0L; }
        long address = 0;
        try {
            address = fieldAddress.getLong(b);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return address;
    }

    /**
     * Get element shift to get size in bytes.
     * 
     * @param b - Buffer subclass to query
     * @return the bit shift ( << ) to get size of buffer element.
     */
    public static int getElementSizeShift(Buffer b) {
        // sanity check
        if (b == null /*|| !b.isDirect()*/) { return 0; }
        // LongBuffer & DoubleBuffer case - 8 bytes
        int elementSizeShift = 4;
        // other values       
        if (b instanceof ByteBuffer) {
            // 1 byte
            elementSizeShift = 0;
        } else if (b instanceof IntBuffer || b instanceof FloatBuffer) {
            // 4 bytes
            elementSizeShift = 2;
        } else  if (b instanceof ShortBuffer || b instanceof CharBuffer) {
            // 2 bytes
            elementSizeShift = 1;
        }        
        return elementSizeShift;
    }

    /**
     * Returns the pointer offset pointer to the data of the given
     * Buffer, assuming Buffer's current position, or 0 if the
     * Buffer is not backed by native heap storage.
     * 
     * @param buffer to query
     * @return offset from baseAddress to current position, in bytes.
     */
    public static int getOffsetInBytes(Buffer b) {
        if (null == b || !b.isDirect()) return 0;
        int elementSizeShift = getElementSizeShift(b);
        return ((b.position()) << elementSizeShift);
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as getOffsetInBytes(java.nio.Buffer). <br>
     * 
     * See {@link #getOffsetInBytes(Buffer)}
     * 
     * @param buffer buffer to query
     * @return offset from baseAddress to current position, in element size.
     * 
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */

    public static int getOffset(Buffer buffer) {
        if(null == buffer) return 0;
        if (buffer.isDirect()) {
            return getOffsetInBytes(buffer);
        } else if(buffer.hasArray()){
            int offset = buffer.arrayOffset();
            int position = buffer.position();
            int elementSizeShift = getElementSizeShift(buffer);
            return (offset + position) << elementSizeShift;
        }else{
            throw new IllegalArgumentException("Buffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param intBuffer IntBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(IntBuffer intBuffer) {
        if (intBuffer.isDirect()) {
            return intBuffer.position();
        } else if (intBuffer.hasArray()) {
            int offset = intBuffer.arrayOffset();
            int position = intBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("IntBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param floatBuffer FloatBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(FloatBuffer floatBuffer) {
        if (floatBuffer.isDirect()) {
            return floatBuffer.position();
        } else if (floatBuffer.hasArray()) {
            int offset = floatBuffer.arrayOffset();
            int position = floatBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("FloatBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param shortBuffer ShortBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(ShortBuffer shortBuffer) {
        if (shortBuffer.isDirect()) {
            return shortBuffer.position();
        } else if (shortBuffer.hasArray()) {
            int offset = shortBuffer.arrayOffset();
            int position = shortBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("ShortBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param charBuffer CharBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(CharBuffer charBuffer) {
        if (charBuffer.isDirect()) {
            return charBuffer.position();
        } else if (charBuffer.hasArray()) {
            int offset = charBuffer.arrayOffset();
            int position = charBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("CharBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param byteBuffer ByteBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer.position();
        } else if (byteBuffer.hasArray()) {
            int offset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("ByteBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param longBuffer LongBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(LongBuffer longBuffer) {
        if (longBuffer.isDirect()) {
            return longBuffer.position();
        } else if (longBuffer.hasArray()) {
            int offset = longBuffer.arrayOffset();
            int position = longBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("LongBuffer" + NDARRAY);
        }
    }

    /**
     * Get Offset from base address to current position.<br>
     * 
     * Same as buffer.position()<br>
     * 
     * @param doubleBuffer DoubleBuffer instance
     * @return offset current buffer position, in element size.
     * @throws IllegalArgumentException if buffer is not direct and neither
     *         backed by an accessible array.
     */
    public static int getOffset(DoubleBuffer doubleBuffer) {
        if (doubleBuffer.isDirect()) {
            return doubleBuffer.position();
        } else if (doubleBuffer.hasArray()) {
            int offset = doubleBuffer.arrayOffset();
            int position = doubleBuffer.position();
            return offset + position;
        } else {
            throw new UnsupportedOperationException("DoubleBuffer" + NDARRAY);
        }
    }

    /**
     * Returns the underlying native pointer to the data of the given
     * Buffer starting at the Buffer's current position, or 0 if the
     * Buffer is not backed by native heap storage.
     * 
     * 
     * 
     * @param b - buffer to query 
     * @return current base pointer  
     */
    public static long getBasePointer(Buffer b) {
        long address = getAddress(b); 
        if (address == 0L) { return 0L; }
        int _elementSizeShift = getElementSizeShift(b);
        return address + (b.position() << _elementSizeShift);
    }

    /**
     * Returns the underlying Java array containing the data of the
     * given Buffer, or null if the Buffer is not backed by a Java array.
     * 
     * @param b - a non direct buffer, i.e., a Heap Buffer
     * @return  the underlying primitive array. 
     *          Null if there is no array available
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
     * 
     * @return base array in bytes. (b.arrayOffset() + b.position()) <<
     *         elementSizeShift
     */
    public static int getBaseArrayOffset(Buffer b) {
        // return b.hasArray() ? ((b.arrayOffset() + b.position) <<
        // b._elementSizeShift) : 0;
        int _elementSizeShift = getElementSizeShift(b);
        return b.hasArray() ? ((b.arrayOffset() + b.position()) << _elementSizeShift) : 0;
    }
    
    
    public static ArrayWrapper getArrayWrapper (Buffer buf){        
        return new ArrayWrapper(buf);
    }
    

    /**
     * String values of Buffer
     * 
     * @param b buffer to read
     * @return String representation of this element
     */

    public static String toString(Buffer b) {
        if (b == null) return null;
        int offset = 0;

        if (b instanceof FloatBuffer) {
            offset = getOffset((FloatBuffer) b);
        } else if (b instanceof IntBuffer) {
            offset = getOffset((IntBuffer) b);
        } else if (b instanceof ShortBuffer) {
            offset = getOffset((ShortBuffer) b);
        } else if (b instanceof CharBuffer) {
            offset = getOffset((CharBuffer) b);
        } else if (b instanceof ByteBuffer) {
            offset = getOffset((ByteBuffer) b);
        } else if (b instanceof LongBuffer) {
            offset = getOffset((LongBuffer) b);
        } else if (b instanceof DoubleBuffer) {
            offset = getOffset((DoubleBuffer) b);
        }

        boolean hasArray = b.hasArray();
        int arrayOffset = hasArray ? b.arrayOffset() : 0;
        Object hb = hasArray ? b.array() : null;

        return "BufferInfo [address=" + getAddress(b) +
                ", offset=" + offset +
                ", offsetBytes=" + getOffsetInBytes(b) +
                ", pointer=" + getPointer(b) +
                ", basePointer=" + getBasePointer(b) +
                ", position=" + b.position() +
                ", elementSizeShift=" + getElementSizeShift(b) +
                ", remaining=" + b.remaining() +
                ", isDirect=" + b.isDirect() +
                ", hasArray=" + hasArray +
                ", arrayOffset=" + arrayOffset +
                ", hb=" + hb
                + "]";
    }

}
