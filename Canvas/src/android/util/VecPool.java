/**
 * Disclaimer
 */
package android.util;

import java.util.Stack;

/**
 * <pre>
 * Pool implementation for float[].
 * Max count of pooled objects is  STACK_MAX_SIZE.
 * 
 * Example:
 *  // creates a static pool for float[] with length 9
 *  private static private vec9Pool = new VecPool(9);
 *  ...
 *  // get from pool 
 *  float[] tmp = vec9Pool.get();
 *  //typical M' = M * a;
 *  multiply(tmp, m , a);
 *  copy(tmp, m);
 *  // recycle tmp
 *   vec9pool.recycle(tmp);
 * 
 * @author Alessandro Borges
 *
 */
public class VecPool {

    /**
     * length of vector
     */
    private final int vecLen;

    /**
     * Stack for pooled floats
     */
    private Stack<float[]> stack;

    /** max stack size **/
    public static final int STACK_MAX_SIZE = 8;

    /**
     * Creates a Vector Factory for
     */
    public VecPool(int vecLength) {
        this.vecLen = vecLength;
        stack = new Stack<float[]>();
    }

    /**
     * Pops out a reusable float[] instance.<br>
     * This is thread safe method.
     * 
     * @return reusable float array with length vecLen
     */
    public float[] get() {
        if (stack.isEmpty()) {
            return new float[vecLen];
        }
        float[] res = stack.pop();
        return res;
    }

    /**
     * Pops out a reusable float[] with filled with zeros
     * This is thread safe method.
     * 
     * @return reusable
     */
    public float[] getZeroed() {
        float[] res = get();
        for (int i = 0; i < vecLen; i++)
            res[i] = 0;
        return res;
    }

    /**
     * Recycle a float[] instance.<br>
     * This is a thread safe method.
     * <pre> 
     * The float array is discarded in following cases:
     *  - vec is null
     *  - vec.length is different of getVecLen()
     *  - stack size is greater than STACK_MAX_SIZE
     * </pre> 
     * @param vec - float[] to recycle for later use.
     */
    public void recycle(float[] vec) {
        if (STACK_MAX_SIZE > stack.size() 
                && null != vec
                && vecLen == vec.length) {
            stack.push(vec);
        }
    }

    /**
     * Get length of float[] pooled.
     * 
     * @return stored float[].length
     */
    public final int getVecLen() {
        return vecLen;
    }
   
}
