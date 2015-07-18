/**
 * 
 */
package aatests;

import android.opengl.*;
/**
 * @author Alessandro Borges
 *
 */
public class TestMatrixMM {

    /**
     * @param args
     */
    public static void main(String[] args) {
        float[] lhs = new float[16];
        float[] rhs = new float[16];
        float[] c = new float[16];
        float[] d = new float[16];
        float[] e = new float[16];
        
        // identity test
        Matrix.setIdentityM(lhs, 0);
        Matrix.setIdentityM(rhs, 0);
        
        Matrix.multiplyMM(c, 0, lhs, 0, rhs, 0);
        Matrix.mulMM(d, lhs, rhs);
        Matrix.native_multiplyMM(e, lhs, rhs);        
        test("multiply identity c-d", lhs, rhs, c, d);
        test("multiply identity d-e", lhs, rhs, c, d);
        
        Matrix.setRotateM(rhs,0, 30f, 0.5f, 0.5f, 0.5f);
        Matrix.translateM(lhs, 0, 4, 8, 10);        
                
        Matrix.multiplyMM(c, 0, lhs, 0, rhs, 0);
        Matrix.native_multiplyMM(d, lhs, rhs);
        Matrix.mulMM(e, lhs, rhs);
        
        test("rotate + translate",lhs,rhs,c,d);
        test("rotate + translate (M3G)",lhs,rhs,e, d);
        
        Matrix.setIdentityM(e, 0);
        Matrix.setIdentityM(c, 0);
        Matrix.setIdentityM(d, 0);
        
        Matrix.multiplyMM(c, 0, rhs, 0, e, 0);
        Matrix.native_multiplyMM(d, rhs, e);
        
        test("identity x translate",rhs,e,c,d);
        
    }
    
    public static void test(String testName, float[] lhs, float[] rhs, float[] c, float[] d){
        out("======================================");
        out("testing operation: " + testName);
        printM("lhs",lhs,0);
        printM("rhs",rhs,0);
        if(equal(c,d)){
         out("operation "+ testName +" OK! ");
         printM("result", c);
        }else{
            out("operation " + testName+" FAILED!");
            printM("c",c,0);
            printM("d",d,0);
        }
        out("======================================");
    }
    
    public static void out(String s){
        System.out.println(s);
    }
    /**
     * print matrix M - assume offset 0
     * @param name
     * @param m
     */
    public static void printM(String name, float[] m){
        printM(name,m,0);
    }
    
    public static void printM(String name, float[] m, int offset){
        
        StringBuffer sb = new StringBuffer(16*8);
        String cmm =", "; 
        sb.append("Matrix: ").append(name).append('\n')
        .append(m[offset +  0] + cmm + m[offset +  4] + cmm + m[offset +  8] + cmm + m[offset + 12] + "\n")
        .append(m[offset +  1] + cmm + m[offset +  5] + cmm + m[offset +  9] + cmm + m[offset + 13] + "\n")
        .append(m[offset +  2] + cmm + m[offset +  6] + cmm + m[offset + 10] + cmm + m[offset + 14] + "\n")
        .append(m[offset +  3] + cmm + m[offset +  7] + cmm + m[offset + 11] + cmm + m[offset + 15] + "\n");
        
        System.out.println(sb.toString());
    }
    
    /**
     * test if a == b
     * @param a - matrix a as a float array
     * @param b - matrix b as float array
     * @return true if both as same value
     */
    public static boolean equal(float[] a, float[] b){       
        try {
            for (int i = 0; i < 16; i++) {
                if(a[i] != b[i]) return false;
            }            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
