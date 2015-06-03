package gles.util;

import java.nio.*;
import java.nio.ByteBuffer;
import static gles.util.BufferInfo.*;

public class BufferInfoTest {
    
	public static void main(String[] args) {
	    //test1();
	    test2();
	}
	
	
    public static void test2(){
	
        boolean direct = true;
        int size = 100;
        IntBuffer ib = direct ? ByteBuffer.allocateDirect(size*4).asIntBuffer() : IntBuffer.allocate(size);
        
        for (int i = 0; i < size; i++) {
            ib.put(i);   
        }        
        ib.flip();
        ib.position(16);
        
        IntBuffer ib2 = ib.slice();
        ib2.position(10);
        
        //DirectIntBufferS db = null;
        
        Buffer wrapBuffer = ib2;
        
        print("ib:   " + ib);
        print("ib2:  " + ib2);
        print("wrap: " + wrapBuffer);
        
        print("-----------");
        print("ib   @add " + getAddress(ib));
        print("ib2  @add " + getAddress(ib2));
        print("wrap @add " + getAddress(wrapBuffer));
        print("-----------");
        
        print("-----------");
        print("ib   @ptr " + getPointer(ib));
        print("ib2  @ptr " + getPointer(ib2));
        print("wrap @ptr " + getPointer(wrapBuffer));
        print("-----------");
        
        print("ib2  offset:" + getOffset(ib2));
        print("ib2 arrayOffset:" + (ib2.hasArray() ? ib2.arrayOffset() : " n/a"));
        print("wrap offset:" + getOffset(wrapBuffer));
        
        
	}
    
    private static void print(Object s){
        System.out.println(s);
    }
		
	public static void test1(){
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
