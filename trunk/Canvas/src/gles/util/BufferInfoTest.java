package gles.util;

import java.nio.*;

public class BufferInfoTest {
	public static void main(String[] args) {
		
		int count =  20 ;
		int typeSize = 4;
		int capacity = count * typeSize;
		
		FloatBuffer b1 = ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder()).asFloatBuffer();
		
		
		b1.position(10);
		FloatBuffer b2 = b1.slice();
		b1.position(0);


			
		System.out.println("i = "+ 0 + ", info: " + BufferInfo.toString(b1));
		System.out.println("####b2 info: " + BufferInfo.toString(b2));
		
		for(int i = 0; i<count; i++){
		   b1.put(i);		   
		}
		
		
		System.out.println("\n\n"
				+ " b1 info: " + BufferInfo.toString(b1));
		System.out.println(" b2 info: " + BufferInfo.toString(b2));
		
		while(b2.hasRemaining()){
			System.out.println("b2 - position:" + b2.position() + ", pointer: "+ BufferInfo.getPointer(b2) +",  value: " + b2.get());
		}
		
		System.out.println("\n\n"
				+ " b1 info:"+b1.toString());
		System.out.println(" b2 info:"+b2.toString());
		
	}

}
