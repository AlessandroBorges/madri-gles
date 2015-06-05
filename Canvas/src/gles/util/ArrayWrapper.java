package gles.util;

import java.nio.*;

/**
 * Class to extract info about a Heap Buffer, as:
 * <li>Type
 * <li> primitive backup array
 * <li> size
 * <li> offset
 * <br>
 * Please note that Direct Buffers are not wrapped.
 * As JNI handle direct Buffers as (void *) or (char *),
 * there is no need to re-create a backup array.  
 * 
 * @author Alessandro Borges
 *
 */
public class ArrayWrapper {
    public Object array;
    public Type type;
    public int size;
    public int offset;
    public boolean direct;
    
    /**
  * Creates a Info about a Buffer
  * @param b
  */
  public ArrayWrapper(Buffer b){
        wrap(b);
  }
  
  /**
   * Allow reuse of this object
   * @param b
   */
  public void wrap(Buffer b){
      if(b.isDirect()){
          processDirectBuffer(b);
      }else{
          processHeapBuffer(b);
      }
      setType(b);
  }
  
  private void processDirectBuffer(Buffer b){
      array = null;      
      size = b.remaining(); 
      offset = 0;    
      direct = true;
  }
 
  /**
   * Get info about this buffer
   * @param b Buffer to process
   */
  private void processHeapBuffer(Buffer b){
      array = b.array();
      offset = b.arrayOffset();
      size = b.remaining();  
      direct = false;
  }
  
  /**
   * the Buffer Type
   * @param b
   */
  private void setType(Buffer b){
      if(b instanceof ByteBuffer){
          type = Type.BYTE;                  
      }else if(b instanceof IntBuffer){
          type = Type.INT;                  
      }else if(b instanceof ShortBuffer){
          type = Type.SHORT;                  
      }else if(b instanceof CharBuffer){
          type = Type.CHAR;                  
      }else if(b instanceof FloatBuffer){
          type = Type.FLOAT;                  
      }else if(b instanceof LongBuffer){
          type = Type.LONG;                  
      }else if(b instanceof DoubleBuffer){
          type = Type.DOUBLE;                  
      }
  }
  
  public byte[] asByteArray(){
      return (byte[]) array;
  }
  
  public short[] asShortArray(){
      return (short[]) array;
  }
  
  public char[] asCharArray(){
      return (char[]) array;
  }
   
  public int[] asIntArray(){
      return (int[]) array;
  }
  public float[] asFloatArray(){
      return (float[]) array;
  }
  public long[] asLongArray(){
      return (long[]) array;
  }
  
  public double[] asDoubleArray(){
      return (double[]) array;
  }
}
