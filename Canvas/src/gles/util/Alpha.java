package gles.util;

/**
 * Alpha is class to handle periodic behavior
 * @author Alessandro Borges
 *
 */
public class Alpha {
   
    protected float freq;
    protected float rad;
    protected long pNano;
    protected long t1; 
    protected AlphaFunction alphaFunc;
    protected boolean hasFunc;
    
    protected int curCycles = 0;
    protected int maxCycles = -1;
    protected boolean waitStart=true;
    
    /**
     * Construc a alpha with period of 4000ms 
     * and infinite number of cycles.
     */
    public Alpha(){
        this(4000, -1);
    }
    
    /**
     *  Construc a alpha with given period  
     * and infinite number of cycles.
     * @param period - time of period, in milliseconds.
     */
    public Alpha(final long period) {
        this(period, -1);
    }
    
    /**
     * Creates a alpha with period "period" and number of cycles as "cycles".<br>
     * For infinite loops, set cycle as -1;
     * @param period - period in ms.
     * @param cycles - number of cycles to perform before stops; Set -1 for infinite number of cycles
     */
    public Alpha(final long period, int cycles) {
        this.pNano = period * 1000L * 1000L;
        this.freq = 1.0f / ((float)pNano);  
        this.maxCycles = cycles;
        
        if(cycles <= 0)
            start();
    }
    
    
    /**
     * Start the clock
     */
    public void start(){
        t1 = System.nanoTime();
        waitStart = false;
    }
    
    /**
     * get value ranging from 0.0f to 1.0, 
     *  as a chainsaw function. <br> 
     *  If surpassed number of cycles, it will always return 1.0f.
     *  
     * @return value value ranging from 0.0f to 1.0f
     */
    public final float getValue(){ 
        if(waitStart) {
            start();
        }        
        long delta = System.nanoTime() - t1;
        if(maxCycles > 0){
            curCycles = (int)(delta / pNano);
            if(curCycles >= maxCycles)
                return 1.0f;
        }
        float v = delta % pNano;        
        return v * freq ;
    }
    
    /**
     * return current cycle.
     * @return
     */
    public int getCurrentCycle(){
        if(waitStart)
            return 0;
        if(maxCycles>0)
            return curCycles;
        else{
            long delta = System.nanoTime() - t1;
            return (int)(delta / pNano);
        }
    }
    
    /**
     * Return a time based sine wave, with this period.
     * Same as Math.sin(getValue() * 2.0 * PI);
     * @return value ranging from -1.0 to 1.0, in a sinWave.
     */
    public float getSinWave(){
        float value = getValue();         
        return (float) Math.sin(value * 2.0 * Math.PI); 
    }
    
    /**
     * Set a user defined function.
     * @param func - a user defined AlphaFunction
     */
    public void setAlphaFunction(AlphaFunction func){
        this.alphaFunc = func;
        hasFunc = func != null;
    }
    
    /**
     * Get value calculated by a user defined AlphaFunction
     * @return a value as calculated by previusly set AlphaFunction.
     * 
     * @see #setAlphaFunction(AlphaFunction)
     * @see AlphaFunction
     */
    public float  getFunctionValue(){
        if(hasFunc)
            return alphaFunc.function(getValue());
        else
            throw new UnsupportedOperationException("AlphaFunction not set!");
    }
    
    /**
     * Interface for user defined function.
     * This function will receive values in range [0..1],
     * from Alpha.getValue().
     * <pre>
     * Example:
     * 
     * 
     * </pre>
     * 
     * 
     * @author Alessandro Borges
     * @see Alpha#getValue()
     * @see Alpha#setAlphaFunction(AlphaFunction)
     * @see Alpha#getFunctionValue()
     */
    public static interface AlphaFunction{
        /**
         * Define your function f(x) here.
         * Input values are in range[0..1]
         * @param x
         * @return
         */
        public float function(float x);
    }
    

}
