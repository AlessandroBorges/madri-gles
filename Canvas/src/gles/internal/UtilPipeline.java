/**
 * 
 */
package gles.internal;

/**
 * 
 * This class handles native methods from:<br>
 * <pre>
 * android.opengl.Visibility
 *    * computeBoundingSphere()
 *    * frustumCullSpheres()
 *    * visibilityTest()
 *  
 *  android.opengl.GLUtils
 *      * getInternalFormat();
 *      * getType();
 *      * texImage2D()
 *      * texSubImage2D()
 *      * setTracingLevel()
 *      
 *  android.opengl.ETC1
 *      * encodeBlock()
 *      * decodeBlock()
 *      * getEncodedDataSize()
 *      * encodeImage()
 *      * decodeImage()
 *      * formatHeader()
 *      * isValid()
 *      * getWidth()
 *      * getHeigh()
 *
 *  
 * </pre>
 * @author Alessandro Borges
 *
 */
public class UtilPipeline implements Pipeline {

    /* (non-Javadoc)
     * @see gles.internal.Pipeline#getPipelineInstance()
     */
    @Override
    public Pipeline getPipelineInstance() {
        // TODO Auto-generated method stub
        return null;
    }

}
