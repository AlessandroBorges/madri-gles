/*

**    Place holder for disclaimer.
*/

package gles.internal;

import gles.util.BufferInfo;

/** OpenGL ES 3.0
 */
public class GLES30Pipeline 
   extends GLES20Pipeline
   implements Pipeline {

	/**
	 * static & native initialization
	 */
	static{
		
	}
	
	/**
	 * Private constructor
	 */
	protected GLES30Pipeline(){}

	/**
	 * 
	 */
	private static Pipeline instance;
	
	/**
	 * Get a instance of this Pipeline implementation
	 * @return a live instance of GLES10EXT
	 */
	public  Pipeline getPipelineInstance() {
		if(instance == null){
			instance = new GLES30Pipeline();
		}        
        return instance;
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30._nativeClassInit();
     * 
     *  C function void glReadBuffer ( (GLenum) mode )

     * */
    private static native void nGLES30ClassInit();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glReadBuffer([int mode]);
     * 
     *  C function void glReadBuffer ( (GLenum) mode )

     * */
    public void glReadBuffer(int mode) {
        GLES30Pipeline.nGLReadBuffer(mode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glReadBuffer([int mode]);
     * 
     *  C function void glReadBuffer ( (GLenum) mode )

     * */
    private static native void nGLReadBuffer(int mode);/*
    
    			glReadBuffer( (GLenum) mode );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawRangeElements([int mode, int start, int end, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawRangeElements ( (GLenum) mode, (GLuint)  start, (GLuint)  end, (GLsizei) count, (GLenum) type, const GLvoid *indices )

     * */
	public void glDrawRangeElements(int mode, 
			int start, int end, 
			int count,
			int type, java.nio.Buffer indices) {

		if (indices == null)
			throw new RuntimeException(BUFFER_NULL);

		// now, the offset...
		if (indices.isDirect()) {
			int offsetBytes = BufferInfo.getOffsetInBytes(indices);
			GLES30Pipeline.nGLDrawRangeElements(mode, start, end, count, type, indices, offsetBytes);
		} else {
			throw new RuntimeException(BUFFER_ND);
    }

	}

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawRangeElements([int mode, int start, int end, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawRangeElements ( (GLenum) mode, (GLuint)  start, (GLuint)  end, (GLsizei) count, (GLenum) type, const GLvoid *indices )

     * */
    private static native void nGLDrawRangeElements(int mode, 
    												int start, int end, 
    												int count, 
    												int type, 
    												java.nio.Buffer indices, int offset);/*
    
          char * indices0 = (char *) (indices + offset); 
          glDrawRangeElements ( (GLenum) mode, 
          						(GLuint) start, 
          						(GLuint)  end, 
          						(GLsizei) count, 
          						(GLenum) type, 
          						(const GLvoid *) indices0 );
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawRangeElements([int mode, int start, int end, int count, int type, int offset]);
     * 
     *  C function void glDrawRangeElements ( (GLenum) mode, (GLuint)  start, (GLuint)  end, (GLsizei) count, (GLenum) type, (GLsizei) offset )

     * */
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset) {
        GLES30Pipeline.nGLDrawRangeElements(mode, start, end, count, type, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawRangeElements([int mode, int start, int end, int count, int type, int offset]);
     * 
     *  C function void glDrawRangeElements ( (GLenum) mode, (GLuint)  start, (GLuint)  end, (GLsizei) count, (GLenum) type, (GLsizei) offset )

     * */
    private static native void nGLDrawRangeElements(int mode, int start, int end, int count, int type, int offset);/*
                                    
             glDrawRangeElements( (GLenum) mode, 
             					  (GLuint)  start, 
             					  (GLuint)  end, 
             					  (GLsizei) count, 
             					  (GLenum) type, 
             					  (GLsizei) offset );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage3D ( (GLenum) target, (GLint) level, (GLint) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLenum) format, (GLenum) type, const GLvoid *pixels )

     * */
    public void glTexImage3D(int target, 
    		int level, 
    		int internalformat, 
    		int width, 		int height, 
    		int depth, 
    		int border, 
    		int format, 
    		int type, 
    		java.nio.Buffer pixels) {

		if (pixels == null)
			throw new RuntimeException(BUFFER_NULL);

		// now, the offset...
		if (pixels.isDirect()) {
			int offsetBytes = BufferInfo.getOffsetInBytes(pixels);
			GLES30Pipeline.nGLTexImage3D(target, level, internalformat, width,
					height, depth, border, format, type, pixels, offsetBytes);
		} else {
			throw new RuntimeException(BUFFER_ND);
    }
		
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage3D ( (GLenum) target, (GLint) level, (GLint) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLenum) format, (GLenum) type, const GLvoid *pixels )
     * */
    private static native void nGLTexImage3D(int target, 
    										int level, 
    										int internalformat,
    										int width, int height, 
    										int depth, 
    										int border, 
    										int format, 
    										int type, 
    										java.nio.Buffer pixels, int offset);/*
    					
    				char * pixels0 = (char *) (pixels + offset);						
    				glTexImage3D ( (GLenum) target, 
    								(GLint) level, 
    								(GLint) internalformat, 
    								(GLsizei) width, (GLsizei) height, 
    								(GLsizei) depth, 
    								(GLint) border, 
    								(GLenum) format, 
    								(GLenum) type, 
    								(const GLvoid *) pixels0 );						
    	*/

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset]);
     * 
     *  C function void glTexImage3D ( (GLenum) target, (GLint) level, (GLint) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLenum) format, (GLenum) type, (GLsizei) offset )

     * */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset) {
        GLES30Pipeline.nGLTexImage3D(target, level, internalformat, width, height, depth, border, format, type, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset]);
     * 
     *  C function void glTexImage3D ( (GLenum) target, (GLint) level, (GLint) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLenum) format, (GLenum) type, (GLsizei) offset )

     * */
    private static native void nGLTexImage3D(int target, 
    		int level, 
    		int internalformat, 
    		int width, int height, int depth, 
    		int border, 
    		int format, 
    		int type, 
    		int offset);/*
    		
      glTexImage3D ( (GLenum) target, 
      				(GLint) level, 
      				(GLint) internalformat, 
      				(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
      				(GLint) border, 
      				(GLenum) format, 
      				(GLenum) type, 
      				(GLsizei) offset );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLenum) type, const GLvoid *pixels )

     * */
    public void glTexSubImage3D(int target, 
    		int level, 
    		int xoffset, int yoffset, int zoffset, 
    		int width, int height, int depth, 
    		int format, 
    		int type, 
    		java.nio.Buffer pixels) {

		if (pixels == null)
			throw new RuntimeException(BUFFER_NULL);

		// now, the offset...
		if (pixels.isDirect()) {
			int offsetBytes = BufferInfo.getOffsetInBytes(pixels);
			GLES30Pipeline.nGLTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, offsetBytes);
		} else {
			throw new RuntimeException(BUFFER_ND);
		}
		
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage3D ( (GLenum) target, (GLint) level, 
     *  								(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *  								(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *  								(GLenum) format, (GLenum) type, const GLvoid *pixels )

     * */
    private static native void nGLTexSubImage3D(int target, 
    		int level, 
    		int xoffset, int yoffset, int zoffset, 
    		int width, int height, int depth, 
    		int format, 
    		int type, 
    		java.nio.Buffer pixels,int offset);/*
    		
    	char * pixels0 = (char *) (pixels + offset);	
    	glTexSubImage3D ( (GLenum) target, (GLint) level, 
    						(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    						(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    						(GLenum) format, 
    						(GLenum) type, 
    						(const GLvoid *)pixels0 )	;
    		
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int offset]);
     * 
     *  C function void glTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLenum) type, (GLsizei) offset )

     * */
    public void glTexSubImage3D(int target, int level, 
    							int xoffset, int yoffset, int zoffset, 
    							int width, int height, int depth, 
    							int format, 
    							int type, 
    							int offset) {
        GLES30Pipeline.nGLTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int offset]);
     * 
     *  C function void glTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLenum) type, (GLsizei) offset )

     * */
    private static native void nGLTexSubImage3D(int target, int level, 
    											int xoffset, int yoffset, int zoffset, 
    											int width, int height, int depth, 
    											int format, 
    											int type, 
    											int offset);/*
    	 glTexSubImage3D ( (GLenum) target, (GLint) level, 
    	 					(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    	 					(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    	 					(GLenum) format, (GLenum) type, 
    	 					(GLsizei) offset )	;									
    	
    	*/

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCopyTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glCopyTexSubImage3D(int target, int level, 
    								int xoffset, int yoffset, int zoffset, 
    								int x, int y, int width, int height) {
    	
        GLES30Pipeline.nGLCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCopyTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLCopyTexSubImage3D(int target, int level, 
    												int xoffset, int yoffset, int zoffset, 
    												int x, int y, int width, int height);/*
    
    	glCopyTexSubImage3D ( (GLenum) target, (GLint) level, 
    							(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    							(GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCompressedTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage3D ( (GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLsizei) imageSize, const GLvoid *data )

     * */
    public void glCompressedTexImage3D(int target, 
                                    int level, int internalformat, 
                                    int width, int height, int depth, 
                                    int border, int imageSize, 
                                    java.nio.Buffer data) {
        
        if (data == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (data.isDirect()) {
            int offsetBytes = BufferInfo.getOffsetInBytes(data);
            GLES30Pipeline.nGLCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data, offsetBytes);            
        } else {
            throw new RuntimeException(BUFFER_ND);
    }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCompressedTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage3D ( (GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLsizei) imageSize, const GLvoid *data )

     * */
    private static native void nGLCompressedTexImage3D(int target, 
    												int level, int internalformat, 
    												int width, int height, int depth, 
    												int border, int imageSize, 
    												java.nio.Buffer data, int offset);/*
    					
    				char * data0 = (char *) (data + offset);								
    				glCompressedTexImage3D ( (GLenum) target, 
    				                        (GLint) level, (GLenum) internalformat, 
    				                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    				                        (GLint) border, 
    				                        (GLsizei) imageSize, 
    				                        (const GLvoid *)data0 );
    	*/

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCompressedTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexImage3D ( (GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLsizei) imageSize, (GLsizei) offset )

     * */
    public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset) {
        GLES30Pipeline.nGLCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCompressedTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexImage3D ( (GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLsizei) imageSize, (GLsizei) offset )

     * */
    private static native void nGLCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset);/*
         glCompressedTexImage3D ( (GLenum) target, 
                                 (GLint) level, (GLenum) internalformat, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLint) border, 
                                 (GLsizei) imageSize, 
                                 (GLsizei) offset );
         
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, const GLvoid *data )

     * */
    public void glCompressedTexSubImage3D(int target, 
            int level, 
            int xoffset, int yoffset, int zoffset, 
            int width, int height, int depth, 
            int format, int imageSize, 
            java.nio.Buffer data) {
        
        if (data == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (data.isDirect()) {
            int offsetBytes = BufferInfo.getOffset(data);
            GLES30Pipeline.nGLCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, offsetBytes);    
        } else {
            throw new RuntimeException(BUFFER_ND);
    }
        
        
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, const GLvoid *data )

     * */
    private static native void nGLCompressedTexSubImage3D(int target, 
                                                          int level, 
                                                          int xoffset, int yoffset, int zoffset, 
                                                          int width, int height, int depth, 
                                                          int format, int imageSize, 
                                                          java.nio.Buffer data, int offset);/*
    char * data0 = (char *) (data + offset);
    glCompressedTexSubImage3D ( (GLenum) target, (GLint) level, 
                                 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLenum) format, (GLsizei) imageSize, 
                                 const GLvoid *data0 );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, (GLsizei) offset )

     * */
    public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset) {
        GLES30Pipeline.nGLCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexSubImage3D ( (GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, (GLsizei) offset )

     * */
    private static native void nGLCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset);/*
          glCompressedTexSubImage3D ( (GLenum) target, 
                                      (GLint) level, 
                                      (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                      (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                      (GLenum) format, (GLsizei) imageSize, (GLsizei) offset );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glGenQueries ( (GLsizei) n, (GLuint)  *ids )

     * */
    public void glGenQueries(int n, int[] ids, int offset) {
        GLES30Pipeline.nGLGenQueries(n, ids, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glGenQueries ( (GLsizei) n, (GLuint)  *ids )

     * */
    private static native void nGLGenQueries(int n, int[] ids, int offset);/*
    
           glGenQueries ( (GLsizei) n, (GLuint *)(ids + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenQueries ( (GLsizei) n, (GLuint)  *ids )

     * */
    public void glGenQueries(int n, java.nio.IntBuffer ids) {
        
        if (ids == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (ids.isDirect()) {
            int offset = BufferInfo.getOffset(ids);
            GLES30Pipeline.nGLGenQueries(n, ids, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
    }
        
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenQueries ( (GLsizei) n, (GLuint)  *ids )

     * */
    private static native void nGLGenQueries(int n, java.nio.IntBuffer ids, int offset);/*
    
              glGenQueries ( (GLsizei) n, (GLuint  *)(ids + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteQueries ( (GLsizei) n, const (GLuint)  *ids )

     * */
    public void glDeleteQueries(int n, int[] ids, int offset) {
        GLES30Pipeline.nGLDeleteQueries(n, ids, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteQueries ( (GLsizei) n, const (GLuint)  *ids )

     * */
    private static native void nGLDeleteQueries(int n, int[] ids, int offset);/*
    
               glDeleteQueries ( (GLsizei) n, (const GLuint  *) (ids + offset) );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteQueries ( (GLsizei) n, const (GLuint)  *ids )

     * */
    public void glDeleteQueries(int n, java.nio.IntBuffer ids) {
        if (ids == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (ids.isDirect()) {
            int offset = BufferInfo.getOffset(ids);
            GLES30Pipeline.nGLDeleteQueries(n, ids, offset);            
        } else {
            throw new RuntimeException(BUFFER_ND);
        }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteQueries ( (GLsizei) n, const (GLuint)  *ids )

     * */
    private static native void nGLDeleteQueries(int n, java.nio.IntBuffer ids, int offset);/*
    
          glDeleteQueries ( (GLsizei) n, (const GLuint  *) (ids + offset) );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glIsQuery([int id]);
     * 
     *  C function (GLboolean) glIsQuery ( (GLuint)  id )

     * */
    public boolean glIsQuery(int id) {
       return GLES30Pipeline.nGLIsQuery(id);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glIsQuery([int id]);
     * 
     *  C function (GLboolean) glIsQuery ( (GLuint)  id )

     * */
    private static native boolean nGLIsQuery(int id);/*
    
       return (jboolean) glIsQuery ( (GLuint)  id );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBeginQuery([int target, int id]);
     * 
     *  C function void glBeginQuery ( (GLenum) target, (GLuint)  id )

     * */
    public void glBeginQuery(int target, int id) {
        GLES30Pipeline.nGLBeginQuery(target, id);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBeginQuery([int target, int id]);
     * 
     *  C function void glBeginQuery ( (GLenum) target, (GLuint)  id )

     * */
    private static native void nGLBeginQuery(int target, int id);/*
    			glBeginQuery ( (GLenum) target, (GLuint)  id );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glEndQuery([int target]);
     * 
     *  C function void glEndQuery ( (GLenum) target )

     * */
    public void glEndQuery(int target) {
        GLES30Pipeline.nGLEndQuery(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glEndQuery([int target]);
     * 
     *  C function void glEndQuery ( (GLenum) target )

     * */
    private static native void nGLEndQuery(int target);/*
                glEndQuery ( (GLenum) target );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetQueryiv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     * */
    public void glGetQueryiv(int target, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetQueryiv(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetQueryiv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetQueryiv(int target, int pname, int[] params, int offset);/*
                glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint *) (params + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetQueryiv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     * */
    public void glGetQueryiv(int target, int pname, java.nio.IntBuffer params) {
        
        if (params == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (params.isDirect()) {
            int offset = BufferInfo.getOffset(params);
            GLES30Pipeline.nGLGetQueryiv(target, pname, params, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetQueryiv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetQueryiv(int target, int pname, java.nio.IntBuffer params, int offset);/*
    
            glGetQueryiv ( (GLenum) target, (GLenum) pname, (GLint *) (params + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetQueryObjectuiv([int id, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryObjectuiv ( (GLuint)  id, (GLenum) pname, (GLuint)  *params )

     * */
    public void glGetQueryObjectuiv(int id, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetQueryObjectuiv(id, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetQueryObjectuiv([int id, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryObjectuiv ( (GLuint)  id, (GLenum) pname, (GLuint)  *params )

     * */
    private static native void nGLGetQueryObjectuiv(int id, int pname, int[] params, int offset);/*
    
         glGetQueryObjectuiv ( (GLuint)  id, (GLenum) pname, (GLuint  *)(params + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetQueryObjectuiv([int id, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryObjectuiv ( (GLuint)  id, (GLenum) pname, (GLuint)  *params )

     * */
    public void glGetQueryObjectuiv(int id, int pname, java.nio.IntBuffer params) {

        if (params == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (params.isDirect()) {
            int offset = BufferInfo.getOffset(params);
            GLES30Pipeline.nGLGetQueryObjectuiv(id, pname, params, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }

    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetQueryObjectuiv([int id, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryObjectuiv ( (GLuint)  id, (GLenum) pname, (GLuint)  *params )

     * */
    private static native void nGLGetQueryObjectuiv(int id, int pname, java.nio.IntBuffer params, int offset);/*
    
            glGetQueryObjectuiv((GLuint)id,  (GLenum)pname, (GLuint *)(params + offset));
    );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUnmapBuffer([int target]);
     * 
     *  C function (GLboolean) glUnmapBuffer ( (GLenum) target )

     * */
    public boolean glUnmapBuffer(int target) {
       return GLES30Pipeline.nGLUnmapBuffer(target);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUnmapBuffer([int target]);
     * 
     *  C function (GLboolean) glUnmapBuffer ( (GLenum) target )

     * */
    private static native boolean nGLUnmapBuffer(int target);/*
    
          return (jboolean)glUnmapBuffer ( (GLenum) target );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetBufferPointerv([int target, int pname]);
     * 
     *  C function void glGetBufferPointerv ( (GLenum) target, (GLenum) pname, GLvoid** params )

     * */
    public java.nio.Buffer glGetBufferPointerv(int target, int pname) {
        return GLES30Pipeline.nGLGetBufferPointerv(target, pname);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetBufferPointerv([int target, int pname]);
     * 
     *  C function void glGetBufferPointerv ( (GLenum) target, (GLenum) pname, GLvoid** params )

     * */
    private static native java.nio.Buffer nGLGetBufferPointerv(int target, int pname);/*
        
        // from android.googlesource.com
        GLint64 _mapLength;
        GLvoid* _p; // &_p works like GLvoid** _p
        
        glGetBufferParameteri64v((GLenum)target, GL_BUFFER_MAP_LENGTH, &_mapLength);
        glGetBufferPointerv((GLenum)target, (GLenum)pname, &_p);
        return env->NewDirectByteBuffer(_p, _mapLength);
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawBuffers([int n, int[] bufs, int offset]);
     * 
     *  C function void glDrawBuffers ( (GLsizei) n, const (GLenum) *bufs )

     * */
    public void glDrawBuffers(int n, int[] bufs, int offset) {
        GLES30Pipeline.nGLDrawBuffers(n, bufs, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawBuffers([int n, int[] bufs, int offset]);
     * 
     *  C function void glDrawBuffers ( (GLsizei) n, const (GLenum) *bufs )

     * */
    private static native void nGLDrawBuffers(int n, int[] bufs, int offset);/*
    
            glDrawBuffers((GLsizei) n, (const GLenum *)(bufs + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawBuffers([int n, java.nio.IntBuffer bufs]);
     * 
     *  C function void glDrawBuffers ( (GLsizei) n, const (GLenum) *bufs )

     * */
    public void glDrawBuffers(int n, java.nio.IntBuffer bufs) {
        
        if (bufs == null)
            throw new RuntimeException(INTBUFFER_NULL);

        // now, the offset...
        if (bufs.isDirect()) {
            int offset = BufferInfo.getOffset(bufs);
            GLES30Pipeline.nGLDrawBuffers(n, bufs, offset);
        } else {
            throw new RuntimeException(INTBUFFER_ND);
        }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawBuffers([int n, java.nio.IntBuffer bufs]);
     * 
     *  C function void glDrawBuffers ( (GLsizei) n, const (GLenum) *bufs )

     * */
    private static native void nGLDrawBuffers(int n, java.nio.IntBuffer bufs, int offset);/*
    
         glDrawBuffers((GLsizei) n, (const GLenum *)(bufs + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix2x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix2x3fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix2x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
                glUniformMatrix2x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value+offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix2x3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix2x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        
        if (value == null)
            throw new RuntimeException(FLOATBUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix2x3fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(FLOATBUFFER_ND);
    }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix2x3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix2x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
         glUniformMatrix2x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value+offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix3x2fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
            glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix3x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {

        if (value == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix3x2fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }
       
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix3x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
            glUniformMatrix3x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset) );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix2x4fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
         glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix2x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        
        if (value == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix2x4fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix2x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
             glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix4x2fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
            glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix4x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        
        if (value == null)
            throw new RuntimeException(FLOATBUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix4x2fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(FLOATBUFFER_ND);
    }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x2fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix4x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
             glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset) );    
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix3x4fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
    					glUniformMatrix3x4fv ( (GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(const GLfloat *) &value[offset] );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix3x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        if (value == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix3x4fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }     
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x4fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix3x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
    					glUniformMatrix3x4fv ( (GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(const GLfloat *) (value + offset) );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value, int offset) {
        GLES30Pipeline.nGLUniformMatrix4x3fv(location, count, transpose, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
    						glUniformMatrix4x3fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(const GLfloat *) &value[offset] );
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    public void glUniformMatrix4x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        if (value == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (value.isDirect()) {
            int offset = BufferInfo.getOffset(value);
            GLES30Pipeline.nGLUniformMatrix4x3fv(location, count, transpose, value, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }       
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x3fv ( (GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value )

     * */
    private static native void nGLUniformMatrix4x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*
    
    						glUniformMatrix4x3fv((GLint) location, 
    											(GLsizei) count, 
    											(GLboolean) transpose, 
    											(const GLfloat *) (value + offset) );    
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBlitFramebuffer([int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter]);
     * 
     *  C function void glBlitFramebuffer ( (GLint) srcX0, (GLint) srcY0, (GLint) srcX1, (GLint) srcY1, (GLint) dstX0, (GLint) dstY0, (GLint) dstX1, (GLint) dstY1, GLbitfield mask, (GLenum) filter )

     * */
    public void glBlitFramebuffer(int srcX0, int srcY0, 
    							 int srcX1, int srcY1, 
    							 int dstX0, int dstY0, 
    							 int dstX1, int dstY1, 
    							 int mask, 
    							 int filter) {
    	
        GLES30Pipeline.nGLBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBlitFramebuffer([int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter]);
     * 
     *  C function void glBlitFramebuffer ( (GLint) srcX0, (GLint) srcY0, (GLint) srcX1, (GLint) srcY1, (GLint) dstX0, (GLint) dstY0, (GLint) dstX1, (GLint) dstY1, GLbitfield mask, (GLenum) filter )

     * */
    private static native void nGLBlitFramebuffer(int srcX0, int srcY0, 
    											  int srcX1, int srcY1, 
    											  int dstX0, int dstY0, 
    											  int dstX1, int dstY1, 
    											  int mask, 
    											  int filter);/*
   
    				glBlitFramebuffer ( (GLint) srcX0, (GLint) srcY0, 
    									(GLint) srcX1, (GLint) srcY1, 
    									(GLint) dstX0, (GLint) dstY0, 
    									(GLint) dstX1, (GLint) dstY1, 
    									(GLbitfield) mask, 
    									(GLenum) filter );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glRenderbufferStorageMultisample([int target, int samples, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageMultisample ( (GLenum) target, (GLsizei) samples, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        GLES30Pipeline.nGLRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glRenderbufferStorageMultisample([int target, int samples, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageMultisample ( (GLenum) target, (GLsizei) samples, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);/*
    			
    			glRenderbufferStorageMultisample(   (GLenum) target, 
    												(GLsizei) samples, 
    												(GLenum) internalformat, 
    												(GLsizei) width, 
    												(GLsizei) height );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glFramebufferTextureLayer([int target, int attachment, int texture, int level, int layer]);
     * 
     *  C function void glFramebufferTextureLayer ( (GLenum) target, (GLenum) attachment, (GLuint)  texture, (GLint) level, (GLint) layer )

     * */
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GLES30Pipeline.nGLFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glFramebufferTextureLayer([int target, int attachment, int texture, int level, int layer]);
     * 
     *  C function void glFramebufferTextureLayer ( (GLenum) target, (GLenum) attachment, (GLuint)  texture, (GLint) level, (GLint) layer )

     * */
    private static native void nGLFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);/*
    				glFramebufferTextureLayer ( (GLenum) target, 
    											(GLenum) attachment, 
    											(GLuint)  texture, 
    											(GLint) level,
    											(GLint) layer );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glMapBufferRange([int target, int offset, int length, int access]);
     * 
     *  C function GLvoid * glMapBufferRange ( (GLenum) target, (GLintptr) offset, GLsizeiptr length, GLbitfield access )

     * */
    public java.nio.Buffer glMapBufferRange(int target, int offset, int length, int access) {
        return GLES30Pipeline.nGLMapBufferRange(target, offset, length, access);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glMapBufferRange([int target, int offset, int length, int access]);
     * 
     *  C function GLvoid * glMapBufferRange ( (GLenum) target, (GLintptr) offset, GLsizeiptr length, GLbitfield access )

     * */
    private static native java.nio.Buffer nGLMapBufferRange(int target, int offset, int length, int access);/*
    
            GLvoid * map;            
            map = glMapBufferRange ( (GLenum) target, (GLintptr) offset, GLsizeiptr length, GLbitfield access );
            
            
            //create buffer
            jobject buf = (jobject)0;
            if (map) {
             buf = env->NewDirectByteBuffer(map, length);
            }
            
           //done
           return buf;      
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glFlushMappedBufferRange([int target, int offset, int length]);
     * 
     *  C function void glFlushMappedBufferRange ( (GLenum) target, (GLintptr) offset, GLsizeiptr length )

     * */
    public void glFlushMappedBufferRange(int target, int offset, int length) {
        GLES30Pipeline.nGLFlushMappedBufferRange(target, offset, length);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glFlushMappedBufferRange([int target, int offset, int length]);
     * 
     *  C function void glFlushMappedBufferRange ( (GLenum) target, (GLintptr) offset, GLsizeiptr length )

     * */
    private static native void nGLFlushMappedBufferRange(int target, int offset, int length);/*
    			glFlushMappedBufferRange ( (GLenum) target, (GLintptr) offset, (GLsizeiptr) length )
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBindVertexArray([int array]);
     * 
     *  C function void glBindVertexArray ( (GLuint)  array )

     * */
    public void glBindVertexArray(int array) {
        GLES30Pipeline.nGLBindVertexArray(array);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBindVertexArray([int array]);
     * 
     *  C function void glBindVertexArray ( (GLuint)  array )

     * */
    private static native void nGLBindVertexArray(int array);/*
    
    		glBindVertexArray((GLuint) array );
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glDeleteVertexArrays ( (GLsizei) n, const (GLuint)  *arrays )

     * */
    public void glDeleteVertexArrays(int n, int[] arrays, int offset) {
        GLES30Pipeline.nGLDeleteVertexArrays(n, arrays, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glDeleteVertexArrays ( (GLsizei) n, const (GLuint)  *arrays )

     * */
    private static native void nGLDeleteVertexArrays(int n, int[] arrays, int offset);/*
    
    			glDeleteVertexArrays ( (GLsizei) n, (const GLuint  *) &arrays[offset] );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glDeleteVertexArrays ( (GLsizei) n, const (GLuint)  *arrays )

     * */
    public void glDeleteVertexArrays(int n, java.nio.IntBuffer arrays) {
        
        if (arrays == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (arrays.isDirect()) {
            int offset = BufferInfo.getOffset(arrays);
            GLES30Pipeline.nGLDeleteVertexArrays(n, arrays, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }      
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glDeleteVertexArrays ( (GLsizei) n, const (GLuint)  *arrays )

     * */
    private static native void nGLDeleteVertexArrays(int n, java.nio.IntBuffer arrays, int offset);/*
    
    			glDeleteVertexArrays((GLsizei) n, (const GLuint *) (arrays + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glGenVertexArrays ( (GLsizei) n, (GLuint)  *arrays )

     * */
    public void glGenVertexArrays(int n, int[] arrays, int offset) {
        GLES30Pipeline.nGLGenVertexArrays(n, arrays, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glGenVertexArrays ( (GLsizei) n, (GLuint)  *arrays )

     * */
    private static native void nGLGenVertexArrays(int n, int[] arrays, int offset);/*
    
    		glGenVertexArrays( (GLsizei) n, (GLuint *) &arrays[offset] );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glGenVertexArrays ( (GLsizei) n, (GLuint)  *arrays )

     * */
    public void glGenVertexArrays(int n, java.nio.IntBuffer arrays) {
        
        if (arrays == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (arrays.isDirect()) {
            int offset = BufferInfo.getOffset(arrays);
            GLES30Pipeline.nGLGenVertexArrays(n, arrays, offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glGenVertexArrays ( (GLsizei) n, (GLuint)  *arrays )

     * */
    private static native void nGLGenVertexArrays(int n, java.nio.IntBuffer arrays, int offset);/*
    		glGenVertexArrays ( (GLsizei) n, (GLuint *) (arrays + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glIsVertexArray([int array]);
     * 
     *  C function (GLboolean) glIsVertexArray ( (GLuint)  array )

     * */
    public boolean glIsVertexArray(int array) {
       return GLES30Pipeline.nGLIsVertexArray(array);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glIsVertexArray([int array]);
     * 
     *  C function (GLboolean) glIsVertexArray ( (GLuint)  array )

     * */
    private static native boolean nGLIsVertexArray(int array);/*
            glIsVertexArray ( (GLuint)  array );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetIntegeri_v([int target, int index, int[] data, int offset]);
     * 
     *  C function void glGetIntegeri_v ( (GLenum) target, (GLuint)  index, (GLint) *data )

     * */
    public void glGetIntegeri_v(int target, int index, int[] data, int offset) {
        GLES30Pipeline.nGLGetIntegeri_v(target, index, data, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetIntegeri_v([int target, int index, int[] data, int offset]);
     * 
     *  C function void glGetIntegeri_v ( (GLenum) target, (GLuint)  index, (GLint) *data )

     * */
    private static native void nGLGetIntegeri_v(int target, int index, int[] data, int offset);/*
    
       glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetIntegeri_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetIntegeri_v ( (GLenum) target, (GLuint)  index, (GLint) *data )

     * */
    public void glGetIntegeri_v(int target, int index, java.nio.IntBuffer data) {
                
        if (data == null)
            throw new RuntimeException(INTBUFFER_NULL);

        // now, the offset...
        if (data.isDirect()) {
            int offset = BufferInfo.getOffset(data);
            GLES30Pipeline.nGLGetIntegeri_v(target, index, data, offset);
        } else {
            throw new RuntimeException(INTBUFFER_ND);
    }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetIntegeri_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetIntegeri_v ( (GLenum) target, (GLuint)  index, (GLint) *data )

     * */
    private static native void nGLGetIntegeri_v(int target, int index, java.nio.IntBuffer data, int offset);/*
                    glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBeginTransformFeedback([int primitiveMode]);
     * 
     *  C function void glBeginTransformFeedback ( (GLenum) primitiveMode )

     * */
    public void glBeginTransformFeedback(int primitiveMode) {
        GLES30Pipeline.nGLBeginTransformFeedback(primitiveMode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBeginTransformFeedback([int primitiveMode]);
     * 
     *  C function void glBeginTransformFeedback ( (GLenum) primitiveMode )

     * */
    private static native void nGLBeginTransformFeedback(int primitiveMode);/*
    
    		glBeginTransformFeedback ( (GLenum) primitiveMode );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glEndTransformFeedback();
     * 
     *  C function void glEndTransformFeedback ( void )

     * */
    public void glEndTransformFeedback() {
        GLES30Pipeline.nGLEndTransformFeedback();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glEndTransformFeedback();
     * 
     *  C function void glEndTransformFeedback ( void )

     * */
    private static native void nGLEndTransformFeedback();

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBindBufferRange([int target, int index, int buffer, int offset, int size]);
     * 
     *  C function void glBindBufferRange ( (GLenum) target, (GLuint)  index, (GLuint)  buffer, (GLintptr) offset, GLsizeiptr size )

     * */
    public void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
        GLES30Pipeline.nGLBindBufferRange(target, index, buffer, offset, size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBindBufferRange([int target, int index, int buffer, int offset, int size]);
     * 
     *  C function void glBindBufferRange ( (GLenum) target, (GLuint)  index, (GLuint)  buffer, (GLintptr) offset, (GLsizeiptr) size )

     * */
    private static native void nGLBindBufferRange(int target, int index, int buffer, int offset, int size);/*
    			glBindBufferRange ( (GLenum) target, (GLuint)  index, (GLuint)  buffer, (GLintptr) offset, (GLsizeiptr) size );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBindBufferBase([int target, int index, int buffer]);
     * 
     *  C function void glBindBufferBase ( (GLenum) target, (GLuint)  index, (GLuint)  buffer )

     * */
    public void glBindBufferBase(int target, int index, int buffer) {
        GLES30Pipeline.nGLBindBufferBase(target, index, buffer);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBindBufferBase([int target, int index, int buffer]);
     * 
     *  C function void glBindBufferBase ( (GLenum) target, (GLuint)  index, (GLuint)  buffer )

     * */
    private static native void nGLBindBufferBase(int target, int index, int buffer);/*
          glBindBufferBase ( (GLenum) target, (GLuint)  index, (GLuint)  buffer );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTransformFeedbackVaryings([int program, String[] varyings, int bufferMode]);
     * 
     *  C function void glTransformFeedbackVaryings ( (GLuint)  program, (GLsizei) count, const GLchar *varyings, (GLenum) bufferMode )

     * */
    public void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode) {
        GLES30Pipeline.nGLTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTransformFeedbackVaryings([int program, String[] varyings, int bufferMode]);
     * 
     *  C function void glTransformFeedbackVaryings ( (GLuint)  program, (GLsizei) count, const GLchar *varyings, (GLenum) bufferMode )

     * */
    private static native void nGLTransformFeedbackVaryings(int program, String[] varyings, int bufferMode);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    public void glGetTransformFeedbackVarying(int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset) {
        GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, bufsize, length, lengthOffset, size, sizeOffset, type, typeOffset, name, nameOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    private static native void nGLGetTransformFeedbackVarying(int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    public void glGetTransformFeedbackVarying(int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name) {
        GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, bufsize, length, size, type, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    private static native void nGLGetTransformFeedbackVarying(int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    public String glGetTransformFeedbackVarying(int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset) {
        return GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, size, sizeOffset, type, typeOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    private static native String nGLGetTransformFeedbackVarying(int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    public String glGetTransformFeedbackVarying(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type) {
       return GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, size, type);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetTransformFeedbackVarying ( (GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name )

     * */
    private static native String nGLGetTransformFeedbackVarying(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribIPointerBounds([int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexAttribIPointer ( (GLuint)  index, (GLint) size, (GLenum) type, (GLsizei) stride, const GLvoid *pointer )

     * */
    public void glVertexAttribIPointerBounds(int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining) {
        GLES30Pipeline.nGLVertexAttribIPointerBounds(index, size, type, stride, pointer, remaining);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribIPointerBounds([int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexAttribIPointer ( (GLuint)  index, (GLint) size, (GLenum) type, (GLsizei) stride, const GLvoid *pointer )

     * */
    private static native void nGLVertexAttribIPointerBounds(int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribIPointer([int index, int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexAttribIPointer ( (GLuint)  index, (GLint) size, (GLenum) type, (GLsizei) stride, (GLsizei) offset )

     * */
    public void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
        GLES30Pipeline.nGLVertexAttribIPointer(index, size, type, stride, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribIPointer([int index, int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexAttribIPointer ( (GLuint)  index, (GLint) size, (GLenum) type, (GLsizei) stride, (GLsizei) offset )

     * */
    private static native void nGLVertexAttribIPointer(int index, int size, int type, int stride, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetVertexAttribIiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIiv ( (GLuint)  index, (GLenum) pname, (GLint) *params )

     * */
    public void glGetVertexAttribIiv(int index, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetVertexAttribIiv(index, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetVertexAttribIiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIiv ( (GLuint)  index, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetVertexAttribIiv(int index, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetVertexAttribIiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIiv ( (GLuint)  index, (GLenum) pname, (GLint) *params )

     * */
    public void glGetVertexAttribIiv(int index, int pname, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetVertexAttribIiv(index, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetVertexAttribIiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIiv ( (GLuint)  index, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetVertexAttribIiv(int index, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIuiv ( (GLuint)  index, (GLenum) pname, (GLuint)  *params )

     * */
    public void glGetVertexAttribIuiv(int index, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetVertexAttribIuiv(index, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIuiv ( (GLuint)  index, (GLenum) pname, (GLuint)  *params )

     * */
    private static native void nGLGetVertexAttribIuiv(int index, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIuiv ( (GLuint)  index, (GLenum) pname, (GLuint)  *params )

     * */
    public void glGetVertexAttribIuiv(int index, int pname, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetVertexAttribIuiv(index, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIuiv ( (GLuint)  index, (GLenum) pname, (GLuint)  *params )

     * */
    private static native void nGLGetVertexAttribIuiv(int index, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4i([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4i ( (GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w )

     * */
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GLES30Pipeline.nGLVertexAttribI4i(index, x, y, z, w);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4i([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4i ( (GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w )

     * */
    private static native void nGLVertexAttribI4i(int index, int x, int y, int z, int w);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4ui([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4ui ( (GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w )

     * */
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GLES30Pipeline.nGLVertexAttribI4ui(index, x, y, z, w);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4ui([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4ui ( (GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w )

     * */
    private static native void nGLVertexAttribI4ui(int index, int x, int y, int z, int w);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4iv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4iv ( (GLuint)  index, const (GLint) *v )

     * */
    public void glVertexAttribI4iv(int index, int[] v, int offset) {
        GLES30Pipeline.nGLVertexAttribI4iv(index, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4iv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4iv ( (GLuint)  index, const (GLint) *v )

     * */
    private static native void nGLVertexAttribI4iv(int index, int[] v, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4iv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4iv ( (GLuint)  index, const (GLint) *v )

     * */
    public void glVertexAttribI4iv(int index, java.nio.IntBuffer v) {
        GLES30Pipeline.nGLVertexAttribI4iv(index, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4iv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4iv ( (GLuint)  index, const (GLint) *v )

     * */
    private static native void nGLVertexAttribI4iv(int index, java.nio.IntBuffer v);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4uiv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4uiv ( (GLuint)  index, const (GLuint)  *v )

     * */
    public void glVertexAttribI4uiv(int index, int[] v, int offset) {
        GLES30Pipeline.nGLVertexAttribI4uiv(index, v, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4uiv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4uiv ( (GLuint)  index, const (GLuint)  *v )

     * */
    private static native void nGLVertexAttribI4uiv(int index, int[] v, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribI4uiv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4uiv ( (GLuint)  index, const (GLuint)  *v )

     * */
    public void glVertexAttribI4uiv(int index, java.nio.IntBuffer v) {
        GLES30Pipeline.nGLVertexAttribI4uiv(index, v);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribI4uiv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4uiv ( (GLuint)  index, const (GLuint)  *v )

     * */
    private static native void nGLVertexAttribI4uiv(int index, java.nio.IntBuffer v);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetUniformuiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformuiv ( (GLuint)  program, (GLint) location, (GLuint)  *params )

     * */
    public void glGetUniformuiv(int program, int location, int[] params, int offset) {
        GLES30Pipeline.nGLGetUniformuiv(program, location, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetUniformuiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformuiv ( (GLuint)  program, (GLint) location, (GLuint)  *params )

     * */
    private static native void nGLGetUniformuiv(int program, int location, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetUniformuiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformuiv ( (GLuint)  program, (GLint) location, (GLuint)  *params )

     * */
    public void glGetUniformuiv(int program, int location, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetUniformuiv(program, location, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetUniformuiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformuiv ( (GLuint)  program, (GLint) location, (GLuint)  *params )

     * */
    private static native void nGLGetUniformuiv(int program, int location, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetFragDataLocation([int program, String name]);
     * 
     *  C function (GLint) glGetFragDataLocation ( (GLuint)  program, const GLchar *name )

     * */
    public int glGetFragDataLocation(int program, String name) {
       return GLES30Pipeline.nGLGetFragDataLocation(program, name);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetFragDataLocation([int program, String name]);
     * 
     *  C function (GLint) glGetFragDataLocation ( (GLuint)  program, const GLchar *name )

     * */
    private static native int nGLGetFragDataLocation(int program, String name);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform1ui([int location, int v0]);
     * 
     *  C function void glUniform1ui ( (GLint) location, (GLuint)  v0 )

     * */
    public void glUniform1ui(int location, int v0) {
        GLES30Pipeline.nGLUniform1ui(location, v0);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform1ui([int location, int v0]);
     * 
     *  C function void glUniform1ui ( (GLint) location, (GLuint)  v0 )

     * */
    private static native void nGLUniform1ui(int location, int v0);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform2ui([int location, int v0, int v1]);
     * 
     *  C function void glUniform2ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1 )

     * */
    public void glUniform2ui(int location, int v0, int v1) {
        GLES30Pipeline.nGLUniform2ui(location, v0, v1);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform2ui([int location, int v0, int v1]);
     * 
     *  C function void glUniform2ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1 )

     * */
    private static native void nGLUniform2ui(int location, int v0, int v1);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform3ui([int location, int v0, int v1, int v2]);
     * 
     *  C function void glUniform3ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2 )

     * */
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GLES30Pipeline.nGLUniform3ui(location, v0, v1, v2);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform3ui([int location, int v0, int v1, int v2]);
     * 
     *  C function void glUniform3ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2 )

     * */
    private static native void nGLUniform3ui(int location, int v0, int v1, int v2);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform4ui([int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glUniform4ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2, (GLuint)  v3 )

     * */
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GLES30Pipeline.nGLUniform4ui(location, v0, v1, v2, v3);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform4ui([int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glUniform4ui ( (GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2, (GLuint)  v3 )

     * */
    private static native void nGLUniform4ui(int location, int v0, int v1, int v2, int v3);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform1uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform1uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform1uiv(int location, int count, int[] value, int offset) {
        GLES30Pipeline.nGLUniform1uiv(location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform1uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform1uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform1uiv(int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform1uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform1uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform1uiv(int location, int count, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLUniform1uiv(location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform1uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform1uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform1uiv(int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform2uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform2uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform2uiv(int location, int count, int[] value, int offset) {
        GLES30Pipeline.nGLUniform2uiv(location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform2uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform2uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform2uiv(int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform2uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform2uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform2uiv(int location, int count, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLUniform2uiv(location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform2uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform2uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform2uiv(int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform3uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform3uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform3uiv(int location, int count, int[] value, int offset) {
        GLES30Pipeline.nGLUniform3uiv(location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform3uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform3uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform3uiv(int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform3uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform3uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform3uiv(int location, int count, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLUniform3uiv(location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform3uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform3uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform3uiv(int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform4uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform4uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform4uiv(int location, int count, int[] value, int offset) {
        GLES30Pipeline.nGLUniform4uiv(location, count, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform4uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform4uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform4uiv(int location, int count, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniform4uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform4uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    public void glUniform4uiv(int location, int count, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLUniform4uiv(location, count, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniform4uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform4uiv ( (GLint) location, (GLsizei) count, const (GLuint)  *value )

     * */
    private static native void nGLUniform4uiv(int location, int count, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLint) *value )

     * */
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value, int offset) {
        GLES30Pipeline.nGLClearBufferiv(buffer, drawbuffer, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLint) *value )

     * */
    private static native void nGLClearBufferiv(int buffer, int drawbuffer, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLint) *value )

     * */
    public void glClearBufferiv(int buffer, int drawbuffer, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLClearBufferiv(buffer, drawbuffer, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLint) *value )

     * */
    private static native void nGLClearBufferiv(int buffer, int drawbuffer, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferuiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLuint)  *value )

     * */
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value, int offset) {
        GLES30Pipeline.nGLClearBufferuiv(buffer, drawbuffer, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferuiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLuint)  *value )

     * */
    private static native void nGLClearBufferuiv(int buffer, int drawbuffer, int[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferuiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLuint)  *value )

     * */
    public void glClearBufferuiv(int buffer, int drawbuffer, java.nio.IntBuffer value) {
        GLES30Pipeline.nGLClearBufferuiv(buffer, drawbuffer, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferuiv ( (GLenum) buffer, (GLint) drawbuffer, const (GLuint)  *value )

     * */
    private static native void nGLClearBufferuiv(int buffer, int drawbuffer, java.nio.IntBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, float[] value, int offset]);
     * 
     *  C function void glClearBufferfv ( (GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value )

     * */
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value, int offset) {
        GLES30Pipeline.nGLClearBufferfv(buffer, drawbuffer, value, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, float[] value, int offset]);
     * 
     *  C function void glClearBufferfv ( (GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value )

     * */
    private static native void nGLClearBufferfv(int buffer, int drawbuffer, float[] value, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, java.nio.FloatBuffer value]);
     * 
     *  C function void glClearBufferfv ( (GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value )

     * */
    public void glClearBufferfv(int buffer, int drawbuffer, java.nio.FloatBuffer value) {
        GLES30Pipeline.nGLClearBufferfv(buffer, drawbuffer, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, java.nio.FloatBuffer value]);
     * 
     *  C function void glClearBufferfv ( (GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value )

     * */
    private static native void nGLClearBufferfv(int buffer, int drawbuffer, java.nio.FloatBuffer value);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClearBufferfi([int buffer, int drawbuffer, float depth, int stencil]);
     * 
     *  C function void glClearBufferfi ( (GLenum) buffer, (GLint) drawbuffer, (GLfloat) depth, (GLint) stencil )

     * */
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GLES30Pipeline.nGLClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClearBufferfi([int buffer, int drawbuffer, float depth, int stencil]);
     * 
     *  C function void glClearBufferfi ( (GLenum) buffer, (GLint) drawbuffer, (GLfloat) depth, (GLint) stencil )

     * */
    private static native void nGLClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);/*
    
    			glClearBufferfi ( (GLenum) buffer, (GLint) drawbuffer, (GLfloat) depth, (GLint) stencil );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetStringi([int name, int index]);
     * 
     *  C function const GLubyte * glGetStringi ( (GLenum) name, (GLuint)  index )

     * */
    public String glGetStringi(int name, int index) {
       return GLES30Pipeline.nGLGetStringi(name, index);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetStringi([int name, int index]);
     * 
     *  C function const GLubyte * glGetStringi ( (GLenum) name, (GLuint)  index )

     * */
    private static native String nGLGetStringi(int name, int index);/*
    
        GLubyte * res = glGetStringi ( (GLenum) name, (GLuint)  index );        
        // support null jstring
        return (res == NULL ? ((jstring) 0) :(env->NewStringUTF((const char*) res)) );
         
         
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glCopyBufferSubData([int readTarget, int writeTarget, int readOffset, int writeOffset, int size]);
     * 
     *  C function void glCopyBufferSubData ( (GLenum) readTarget, (GLenum) writeTarget, (GLintptr) readOffset, (GLintptr) writeOffset, GLsizeiptr size )

     * */
    public void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size) {
        GLES30Pipeline.nGLCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glCopyBufferSubData([int readTarget, int writeTarget, int readOffset, int writeOffset, int size]);
     * 
     *  C function void glCopyBufferSubData ( (GLenum) readTarget, (GLenum) writeTarget, (GLintptr) readOffset, (GLintptr) writeOffset, GLsizeiptr size )

     * */
    private static native void nGLCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetUniformIndices([int program, String[] uniformNames, int[] uniformIndices, int uniformIndicesOffset]);
     * 
     *  C function void glGetUniformIndices ( (GLuint)  program, (GLsizei) uniformCount, const GLchar *const *uniformNames, (GLuint)  *uniformIndices )

     * */
    public void glGetUniformIndices(int program, String[] uniformNames, int[] uniformIndices, int uniformIndicesOffset) {
        GLES30Pipeline.nGLGetUniformIndices(program, uniformNames, uniformIndices, uniformIndicesOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetUniformIndices([int program, String[] uniformNames, int[] uniformIndices, int uniformIndicesOffset]);
     * 
     *  C function void glGetUniformIndices ( (GLuint)  program, (GLsizei) uniformCount, const GLchar *const *uniformNames, (GLuint)  *uniformIndices )

     * */
    private static native void nGLGetUniformIndices(int program, String[] uniformNames, int[] uniformIndices, int uniformIndicesOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetUniformIndices([int program, String[] uniformNames, java.nio.IntBuffer uniformIndices]);
     * 
     *  C function void glGetUniformIndices ( (GLuint)  program, (GLsizei) uniformCount, const GLchar *const *uniformNames, (GLuint)  *uniformIndices )

     * */
    public void glGetUniformIndices(int program, String[] uniformNames, java.nio.IntBuffer uniformIndices) {
        GLES30Pipeline.nGLGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetUniformIndices([int program, String[] uniformNames, java.nio.IntBuffer uniformIndices]);
     * 
     *  C function void glGetUniformIndices ( (GLuint)  program, (GLsizei) uniformCount, const GLchar *const *uniformNames, (GLuint)  *uniformIndices )

     * */
    private static native void nGLGetUniformIndices(int program, String[] uniformNames, java.nio.IntBuffer uniformIndices);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformsiv([int program, int uniformCount, int[] uniformIndices, int uniformIndicesOffset, int pname, int[] params, int paramsOffset]);
     * 
     *  C function void glGetActiveUniformsiv ( (GLuint)  program, (GLsizei) uniformCount, const (GLuint)  *uniformIndices, (GLenum) pname, (GLint) *params )

     * */
    public void glGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int uniformIndicesOffset, int pname, int[] params, int paramsOffset) {
        GLES30Pipeline.nGLGetActiveUniformsiv(program, uniformCount, uniformIndices, uniformIndicesOffset, pname, params, paramsOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformsiv([int program, int uniformCount, int[] uniformIndices, int uniformIndicesOffset, int pname, int[] params, int paramsOffset]);
     * 
     *  C function void glGetActiveUniformsiv ( (GLuint)  program, (GLsizei) uniformCount, const (GLuint)  *uniformIndices, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int uniformIndicesOffset, int pname, int[] params, int paramsOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformsiv([int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformsiv ( (GLuint)  program, (GLsizei) uniformCount, const (GLuint)  *uniformIndices, (GLenum) pname, (GLint) *params )

     * */
    public void glGetActiveUniformsiv(int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformsiv([int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformsiv ( (GLuint)  program, (GLsizei) uniformCount, const (GLuint)  *uniformIndices, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetActiveUniformsiv(int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetUniformBlockIndex([int program, String uniformBlockName]);
     * 
     *  C function (GLuint)  glGetUniformBlockIndex ( (GLuint)  program, const GLchar *uniformBlockName )

     * */
    public int glGetUniformBlockIndex(int program, String uniformBlockName) {
        return GLES30Pipeline.nGLGetUniformBlockIndex(program, uniformBlockName);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetUniformBlockIndex([int program, String uniformBlockName]);
     * 
     *  C function (GLuint)  glGetUniformBlockIndex ( (GLuint)  program, const GLchar *uniformBlockName )

     * */
    private static native int nGLGetUniformBlockIndex(int program, String uniformBlockName);/*
    		
    		glGetUniformBlockIndex ( (GLuint)  program, (const GLchar *) uniformBlockName );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformBlockiv([int program, int uniformBlockIndex, int pname, int[] params, int offset]);
     * 
     *  C function void glGetActiveUniformBlockiv ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params )

     * */
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformBlockiv([int program, int uniformBlockIndex, int pname, int[] params, int offset]);
     * 
     *  C function void glGetActiveUniformBlockiv ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformBlockiv([int program, int uniformBlockIndex, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformBlockiv ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params )

     * */
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformBlockiv([int program, int uniformBlockIndex, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformBlockiv ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName )

     * */
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset) {
        GLES30Pipeline.nGLGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, lengthOffset, uniformBlockName, uniformBlockNameOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName )

     * */
    private static native void nGLGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, java.nio.Buffer length, java.nio.Buffer uniformBlockName]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName )

     * */
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, java.nio.Buffer length, java.nio.Buffer uniformBlockName) {
        GLES30Pipeline.nGLGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, java.nio.Buffer length, java.nio.Buffer uniformBlockName]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, (GLchar *) uniformBlockName )

     * */
    private static native void nGLGetActiveUniformBlockName(int program, 
    														int uniformBlockIndex, 
    														java.nio.Buffer length, 
    														java.nio.Buffer uniformBlockName);/*
          				
          			
          			// assume length is int*	
          			GLint * length0 = (GLint *) length 	
    
    				glGetActiveUniformBlockName ((GLuint)  program, 
    											 (GLuint)  uniformBlockIndex, 
    											 (GLsizei) length0[0], // get the value of max 
    											 (GLsizei *) &length0[0],  // get the pointer
    											 (GLchar *)  uniformBlockName );    											 
    			
    
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName )

     * */
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return GLES30Pipeline.nGLGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex]);
     * 
     *  C function void glGetActiveUniformBlockName ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName )

     * */
    private static native String nGLGetActiveUniformBlockName(int program, int uniformBlockIndex);/*
    
    				// get string length
    				GLint maxLength = 0;                     
                    glGetProgramiv((GLuint)program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &maxLength); 
                    
                    std::vector<GLchar> uniformBlockName(maxLength + 1);
    
    				glGetActiveUniformBlockName ((GLuint)  program, 
    											 (GLuint)  uniformBlockIndex, 
    											 (GLsizei) maxLength + 1, 
    											  &maxLength, 
    											  &uniformBlockName[0] );
    											 
    				return  env->NewStringUTF(uniformBlockName);
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glUniformBlockBinding([int program, int uniformBlockIndex, int uniformBlockBinding]);
     * 
     *  C function void glUniformBlockBinding ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLuint)  uniformBlockBinding )

     * */
    public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        GLES30Pipeline.nGLUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glUniformBlockBinding([int program, int uniformBlockIndex, int uniformBlockBinding]);
     * 
     *  C function void glUniformBlockBinding ( (GLuint)  program, (GLuint)  uniformBlockIndex, (GLuint)  uniformBlockBinding )

     * */
    private static native void nGLUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawArraysInstanced([int mode, int first, int count, int instanceCount]);
     * 
     *  C function void glDrawArraysInstanced ( (GLenum) mode, (GLint) first, (GLsizei) count, (GLsizei) instanceCount )

     * */
    public void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
        GLES30Pipeline.nGLDrawArraysInstanced(mode, first, count, instanceCount);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawArraysInstanced([int mode, int first, int count, int instanceCount]);
     * 
     *  C function void glDrawArraysInstanced ( (GLenum) mode, (GLint) first, (GLsizei) count, (GLsizei) instanceCount )

     * */
    private static native void nGLDrawArraysInstanced(int mode, int first, int count, int instanceCount);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, java.nio.Buffer indices, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced ( (GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount )

     * */
    public void glDrawElementsInstanced(int mode, int count, int type, java.nio.Buffer indices, int instanceCount) {
        GLES30Pipeline.nGLDrawElementsInstanced(mode, count, type, indices, instanceCount);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, java.nio.Buffer indices, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced ( (GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount )

     * */
    private static native void nGLDrawElementsInstanced(int mode, int count, int type, java.nio.Buffer indices, int instanceCount);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, int indicesOffset, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced ( (GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount )

     * */
    public void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount) {
        GLES30Pipeline.nGLDrawElementsInstanced(mode, count, type, indicesOffset, instanceCount);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, int indicesOffset, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced ( (GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount )

     * */
    private static native void nGLDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glFenceSync([int condition, int flags]);
     * 
     *  C function GLsync glFenceSync ( (GLenum) condition, GLbitfield flags )

     * */
    public long glFenceSync(int condition, int flags) {
       return GLES30Pipeline.nGLFenceSync(condition, flags);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glFenceSync([int condition, int flags]);
     * 
     *  C function GLsync glFenceSync ( (GLenum) condition, GLbitfield flags )

     * */
    private static native long nGLFenceSync(int condition, int flags);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glIsSync([long sync]);
     * 
     *  C function (GLboolean) glIsSync ( GLsync sync )

     * */
    public boolean glIsSync(long sync) {
        return GLES30Pipeline.nGLIsSync(sync);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glIsSync([long sync]);
     * 
     *  C function (GLboolean) glIsSync ( GLsync sync )

     * */
    private static native boolean nGLIsSync(long sync);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteSync([long sync]);
     * 
     *  C function void glDeleteSync ( GLsync sync )

     * */
    public void glDeleteSync(long sync) {
        GLES30Pipeline.nGLDeleteSync(sync);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteSync([long sync]);
     * 
     *  C function void glDeleteSync ( GLsync sync )

     * */
    private static native void nGLDeleteSync(long sync);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glClientWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function (GLenum) glClientWaitSync ( GLsync sync, GLbitfield flags, (GLuint) 64 timeout )

     * */
    public int glClientWaitSync(long sync, int flags, long timeout) {
       return GLES30Pipeline.nGLClientWaitSync(sync, flags, timeout);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glClientWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function (GLenum) glClientWaitSync ( GLsync sync, GLbitfield flags, (GLuint) 64 timeout )

     * */
    private static native int nGLClientWaitSync(long sync, int flags, long timeout);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function void glWaitSync ( GLsync sync, GLbitfield flags, (GLuint) 64 timeout )

     * */
    public void glWaitSync(long sync, int flags, long timeout) {
        GLES30Pipeline.nGLWaitSync(sync, flags, timeout);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function void glWaitSync ( GLsync sync, GLbitfield flags, (GLuint) 64 timeout )

     * */
    private static native void nGLWaitSync(long sync, int flags, long timeout);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInteger64v([int pname, long[] params, int offset]);
     * 
     *  C function void glGetInteger64v ( (GLenum) pname, GLint64 *params )

     * */
    public void glGetInteger64v(int pname, long[] params, int offset) {
        GLES30Pipeline.nGLGetInteger64v(pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInteger64v([int pname, long[] params, int offset]);
     * 
     *  C function void glGetInteger64v ( (GLenum) pname, GLint64 *params )

     * */
    private static native void nGLGetInteger64v(int pname, long[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInteger64v([int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetInteger64v ( (GLenum) pname, GLint64 *params )

     * */
    public void glGetInteger64v(int pname, java.nio.LongBuffer params) {
        GLES30Pipeline.nGLGetInteger64v(pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInteger64v([int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetInteger64v ( (GLenum) pname, GLint64 *params )

     * */
    private static native void nGLGetInteger64v(int pname, java.nio.LongBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset]);
     * 
     *  C function void glGetSynciv ( GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values )

     * */
    public void glGetSynciv(long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset) {
        GLES30Pipeline.nGLGetSynciv(sync, pname, bufSize, length, lengthOffset, values, valuesOffset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset]);
     * 
     *  C function void glGetSynciv ( GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values )

     * */
    private static native void nGLGetSynciv(long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values]);
     * 
     *  C function void glGetSynciv ( GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values )

     * */
    public void glGetSynciv(long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values) {
        GLES30Pipeline.nGLGetSynciv(sync, pname, bufSize, length, values);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values]);
     * 
     *  C function void glGetSynciv ( GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values )

     * */
    private static native void nGLGetSynciv(long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInteger64i_v([int target, int index, long[] data, int offset]);
     * 
     *  C function void glGetInteger64i_v ( (GLenum) target, (GLuint)  index, GLint64 *data )

     * */
    public void glGetInteger64i_v(int target, int index, long[] data, int offset) {
        GLES30Pipeline.nGLGetInteger64i_v(target, index, data, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInteger64i_v([int target, int index, long[] data, int offset]);
     * 
     *  C function void glGetInteger64i_v ( (GLenum) target, (GLuint)  index, GLint64 *data )

     * */
    private static native void nGLGetInteger64i_v(int target, int index, long[] data, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInteger64i_v([int target, int index, java.nio.LongBuffer data]);
     * 
     *  C function void glGetInteger64i_v ( (GLenum) target, (GLuint)  index, GLint64 *data )

     * */
    public void glGetInteger64i_v(int target, int index, java.nio.LongBuffer data) {
        GLES30Pipeline.nGLGetInteger64i_v(target, index, data);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInteger64i_v([int target, int index, java.nio.LongBuffer data]);
     * 
     *  C function void glGetInteger64i_v ( (GLenum) target, (GLuint)  index, GLint64 *data )

     * */
    private static native void nGLGetInteger64i_v(int target, int index, java.nio.LongBuffer data);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetBufferParameteri64v([int target, int pname, long[] params, int offset]);
     * 
     *  C function void glGetBufferParameteri64v ( (GLenum) target, (GLenum) pname, GLint64 *params )

     * */
    public void glGetBufferParameteri64v(int target, int pname, long[] params, int offset) {
        GLES30Pipeline.nGLGetBufferParameteri64v(target, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetBufferParameteri64v([int target, int pname, long[] params, int offset]);
     * 
     *  C function void glGetBufferParameteri64v ( (GLenum) target, (GLenum) pname, GLint64 *params )

     * */
    private static native void nGLGetBufferParameteri64v(int target, int pname, long[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetBufferParameteri64v([int target, int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetBufferParameteri64v ( (GLenum) target, (GLenum) pname, GLint64 *params )

     * */
    public void glGetBufferParameteri64v(int target, int pname, java.nio.LongBuffer params) {
        GLES30Pipeline.nGLGetBufferParameteri64v(target, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetBufferParameteri64v([int target, int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetBufferParameteri64v ( (GLenum) target, (GLenum) pname, GLint64 *params )

     * */
    private static native void nGLGetBufferParameteri64v(int target, int pname, java.nio.LongBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glGenSamplers ( (GLsizei) count, (GLuint)  *samplers )

     * */
    public void glGenSamplers(int count, int[] samplers, int offset) {
        GLES30Pipeline.nGLGenSamplers(count, samplers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glGenSamplers ( (GLsizei) count, (GLuint)  *samplers )

     * */
    private static native void nGLGenSamplers(int count, int[] samplers, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glGenSamplers ( (GLsizei) count, (GLuint)  *samplers )

     * */
    public void glGenSamplers(int count, java.nio.IntBuffer samplers) {
        GLES30Pipeline.nGLGenSamplers(count, samplers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glGenSamplers ( (GLsizei) count, (GLuint)  *samplers )

     * */
    private static native void nGLGenSamplers(int count, java.nio.IntBuffer samplers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glDeleteSamplers ( (GLsizei) count, const (GLuint)  *samplers )

     * */
    public void glDeleteSamplers(int count, int[] samplers, int offset) {
        GLES30Pipeline.nGLDeleteSamplers(count, samplers, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glDeleteSamplers ( (GLsizei) count, const (GLuint)  *samplers )

     * */
    private static native void nGLDeleteSamplers(int count, int[] samplers, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glDeleteSamplers ( (GLsizei) count, const (GLuint)  *samplers )

     * */
    public void glDeleteSamplers(int count, java.nio.IntBuffer samplers) {
        GLES30Pipeline.nGLDeleteSamplers(count, samplers);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glDeleteSamplers ( (GLsizei) count, const (GLuint)  *samplers )

     * */
    private static native void nGLDeleteSamplers(int count, java.nio.IntBuffer samplers);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glIsSampler([int sampler]);
     * 
     *  C function (GLboolean) glIsSampler ( (GLuint)  sampler )

     * */
    public boolean glIsSampler(int sampler) {
        return GLES30Pipeline.nGLIsSampler(sampler);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glIsSampler([int sampler]);
     * 
     *  C function (GLboolean) glIsSampler ( (GLuint)  sampler )

     * */
    private static native boolean nGLIsSampler(int sampler);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBindSampler([int unit, int sampler]);
     * 
     *  C function void glBindSampler ( (GLuint)  unit, (GLuint)  sampler )

     * */
    public void glBindSampler(int unit, int sampler) {
        GLES30Pipeline.nGLBindSampler(unit, sampler);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBindSampler([int unit, int sampler]);
     * 
     *  C function void glBindSampler ( (GLuint)  unit, (GLuint)  sampler )

     * */
    private static native void nGLBindSampler(int unit, int sampler);/*
    			glBindSampler ( (GLuint)  unit, (GLuint)  sampler );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameteri([int sampler, int pname, int param]);
     * 
     *  C function void glSamplerParameteri ( (GLuint)  sampler, (GLenum) pname, (GLint) param )

     * */
    public void glSamplerParameteri(int sampler, int pname, int param) {
        GLES30Pipeline.nGLSamplerParameteri(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameteri([int sampler, int pname, int param]);
     * 
     *  C function void glSamplerParameteri ( (GLuint)  sampler, (GLenum) pname, (GLint) param )

     * */
    private static native void nGLSamplerParameteri(int sampler, int pname, int param);/*
    
    			glSamplerParameteri ( (GLuint)  sampler, (GLenum) pname, (GLint) param );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameteriv([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param )

     * */
    public void glSamplerParameteriv(int sampler, int pname, int[] param, int offset) {
        GLES30Pipeline.nGLSamplerParameteriv(sampler, pname, param, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameteriv([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param )

     * */
    private static native void nGLSamplerParameteriv(int sampler, int pname, int[] param, int offset);/*
    
    			glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param )

     * */
    public void glSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer param) {
        GLES30Pipeline.nGLSamplerParameteriv(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param )

     * */
    private static native void nGLSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer param);/*
    
    					glSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, const (GLint) *param );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameterf([int sampler, int pname, float param]);
     * 
     *  C function void glSamplerParameterf ( (GLuint)  sampler, (GLenum) pname, (GLfloat) param )

     * */
    public void glSamplerParameterf(int sampler, int pname, float param) {
        GLES30Pipeline.nGLSamplerParameterf(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameterf([int sampler, int pname, float param]);
     * 
     *  C function void glSamplerParameterf ( (GLuint)  sampler, (GLenum) pname, (GLfloat) param )

     * */
    private static native void nGLSamplerParameterf(int sampler, int pname, float param);/*
    
    				glSamplerParameterf ( (GLuint)  sampler, (GLenum) pname, (GLfloat) param );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameterfv([int sampler, int pname, float[] param, int offset]);
     * 
     *  C function void glSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, const (GLfloat) *param )

     * */
    public void glSamplerParameterfv(int sampler, int pname, float[] param, int offset) {
        GLES30Pipeline.nGLSamplerParameterfv(sampler, pname, param, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameterfv([int sampler, int pname, float[] param, int offset]);
     * 
     *  C function void glSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, const (GLfloat) *param )

     * */
    private static native void nGLSamplerParameterfv(int sampler, int pname, float[] param, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer param]);
     * 
     *  C function void glSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, const (GLfloat) *param )

     * */
    public void glSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer param) {
        GLES30Pipeline.nGLSamplerParameterfv(sampler, pname, param);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer param]);
     * 
     *  C function void glSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, const (GLfloat) *param )

     * */
    private static native void nGLSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer param);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, (GLint) *params )

     * */
    public void glGetSamplerParameteriv(int sampler, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetSamplerParameteriv(sampler, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetSamplerParameteriv(int sampler, int pname, int[] params, int offset);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, (GLint) *params )

     * */
    public void glGetSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer params) {
        GLES30Pipeline.nGLGetSamplerParameteriv(sampler, pname, params);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameteriv ( (GLuint)  sampler, (GLenum) pname, (GLint) *params )

     * */
    private static native void nGLGetSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer params);

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, float[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat) *params )

     * */
    public void glGetSamplerParameterfv(int sampler, int pname, float[] params, int offset) {
        GLES30Pipeline.nGLGetSamplerParameterfv(sampler, pname, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, float[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat) *params )

     * */
    private static native void nGLGetSamplerParameterfv(int sampler, int pname, float[] params, int offset);/*
                glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat *)(params + offset));
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat) *params )

     * */
    public void glGetSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer params) {

        if (params == null)
            throw new RuntimeException(BUFFER_NULL);

        // now, the offset...
        if (params.isDirect()) {
            int offset = BufferInfo.getOffset(params);
            GLES30Pipeline.nGLGetSamplerParameterfv(sampler, pname, params,offset);
        } else {
            throw new RuntimeException(BUFFER_ND);
        }
       
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat *) params );

     * */
    private static native void nGLGetSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer params, int offset);/*
    			glGetSamplerParameterfv ( (GLuint)  sampler, (GLenum) pname, (GLfloat *) (params + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glVertexAttribDivisor([int index, int divisor]);
     * 
     *  C function void glVertexAttribDivisor ( (GLuint)  index, (GLuint)  divisor )

     * */
    public void glVertexAttribDivisor(int index, int divisor) {
        GLES30Pipeline.nGLVertexAttribDivisor(index, divisor);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glVertexAttribDivisor([int index, int divisor]);
     * 
     *  C function void glVertexAttribDivisor ( (GLuint)  index, (GLuint)  divisor )

     * */
    private static native void nGLVertexAttribDivisor(int index, int divisor);/*
         glVertexAttribDivisor ( (GLuint)  index, (GLuint)  divisor )
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glBindTransformFeedback([int target, int id]);
     * 
     *  C function void glBindTransformFeedback ( (GLenum) target, (GLuint)  id )

     * */
    public void glBindTransformFeedback(int target, int id) {
        GLES30Pipeline.nGLBindTransformFeedback(target, id);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glBindTransformFeedback([int target, int id]);
     * 
     *  C function void glBindTransformFeedback ( (GLenum) target, (GLuint)  id )

     * */
    private static native void nGLBindTransformFeedback(int target, int id);/*
     				glBindTransformFeedback ( (GLenum) target, (GLuint)  id )
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteTransformFeedbacks ( (GLsizei) n, const (GLuint)  *ids )

     * */
    public void glDeleteTransformFeedbacks(int n, int[] ids, int offset) {
        GLES30Pipeline.nGLDeleteTransformFeedbacks(n, ids, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteTransformFeedbacks ( (GLsizei) n, const (GLuint)  *ids )

     * */
    private static native void nGLDeleteTransformFeedbacks(int n, int[] ids, int offset);/*
        
          	glDeleteTransformFeedbacks ( (GLsizei) n, (const GLuint *) &ids[offset] );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glDeleteTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteTransformFeedbacks ( (GLsizei) n, const (GLuint)  *ids )

     * */
    public void glDeleteTransformFeedbacks(int n, java.nio.IntBuffer ids) {
        GLES30Pipeline.nGLDeleteTransformFeedbacks(n, ids);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glDeleteTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteTransformFeedbacks ( (GLsizei) n, const (GLuint)  *ids )

     * */
    private static native void nGLDeleteTransformFeedbacks(int n, java.nio.IntBuffer ids, int offset);/*
    				glDeleteTransformFeedbacks ( (GLsizei) n, (const GLuint *) (ids + offset) )
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glGenTransformFeedbacks ( (GLsizei) n, (GLuint)  *ids )

     * */
    public void glGenTransformFeedbacks(int n, int[] ids, int offset) {
        GLES30Pipeline.nGLGenTransformFeedbacks(n, ids, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glGenTransformFeedbacks ( (GLsizei) n, (GLuint)  *ids )

     * */
    private static native void nGLGenTransformFeedbacks(int n, int[] ids, int offset);/*
    
    			glGenTransformFeedbacks ( (GLsizei) n, (GLuint *) &ids[offset] );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGenTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenTransformFeedbacks ( (GLsizei) n, (GLuint)  *ids )

     * */
    public void glGenTransformFeedbacks(int n, java.nio.IntBuffer ids) {
        GLES30Pipeline.nGLGenTransformFeedbacks(n, ids);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGenTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenTransformFeedbacks ( (GLsizei) n, (GLuint  *)ids )

     * */
    private static native void nGLGenTransformFeedbacks(int n, java.nio.IntBuffer ids, int offset);/*
    			glGenTransformFeedbacks ( (GLsizei) n, (GLuint *) (ids + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glIsTransformFeedback([int id]);
     * 
     *  C function (GLboolean) glIsTransformFeedback ( (GLuint)  id )

     * */
    public boolean glIsTransformFeedback(int id) {
       return GLES30Pipeline.nGLIsTransformFeedback(id);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glIsTransformFeedback([int id]);
     * 
     *  C function (GLboolean) glIsTransformFeedback ( (GLuint)  id )

     * */
    private static native boolean nGLIsTransformFeedback(int id);/*
    			return (jboolean) glIsTransformFeedback ( (GLuint)  id );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glPauseTransformFeedback();
     * 
     *  C function void glPauseTransformFeedback ( void )

     * */
    public void glPauseTransformFeedback() {
        GLES30Pipeline.nGLPauseTransformFeedback();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glPauseTransformFeedback();
     * 
     *  C function void glPauseTransformFeedback ( void )

     * */
    private static native void nGLPauseTransformFeedback();/*
       			glPauseTransformFeedback();
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glResumeTransformFeedback();
     * 
     *  C function void glResumeTransformFeedback ( void )

     * */
    public void glResumeTransformFeedback() {
        GLES30Pipeline.nGLResumeTransformFeedback();
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glResumeTransformFeedback();
     * 
     *  C function void glResumeTransformFeedback ( void )

     * */
    private static native void nGLResumeTransformFeedback();/*
               glResumeTransformFeedback(  );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetProgramBinary([int program, int bufSize, int[] length, int lengthOffset, int[] binaryFormat, int binaryFormatOffset, java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary ( (GLuint)  program, (GLsizei) bufSize, (GLsizei) *length, (GLenum) *binaryFormat, GLvoid *binary )

     * */
    public void glGetProgramBinary(int program, 
    								int bufSize, 
    								int[] length, int lengthOffset, 
    								int[] binaryFormat, int binaryFormatOffset, 
    								java.nio.Buffer binary) {
    	
        GLES30Pipeline.nGLGetProgramBinary(program, bufSize, length, lengthOffset, binaryFormat, binaryFormatOffset, binary);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetProgramBinary([int program, int bufSize, int[] length, int lengthOffset, int[] binaryFormat, int binaryFormatOffset, java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary ( (GLuint)  program, (GLsizei) bufSize, (GLsizei) *length, (GLenum) *binaryFormat, GLvoid *binary )

     * */
    private static native void nGLGetProgramBinary(int program, 
    												int bufSize, 
    												int[] length, int lengthOffset, 
    												int[] binaryFormat, int binaryFormatOffset, 
    												java.nio.Buffer binary, int binaryOffset);/*
    												
    												glGetProgramBinary( (GLuint)  program, 
    												                    (GLsizei) bufSize, 
    												                    (GLsizei *) &length[lengthOffset], 
    												                    (GLenum *)  &binaryFormat[binaryFormatOffset], 
    												                    (GLvoid *)  &binary[binaryOffset] );
    												
    	*/

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetProgramBinary([int program, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer binaryFormat, java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary ( (GLuint)  program, (GLsizei) bufSize, (GLsizei) *length, (GLenum) *binaryFormat, GLvoid *binary )

     * */
    public void glGetProgramBinary(int program, 
    								int bufSize, 
    								java.nio.IntBuffer length, 
    								java.nio.IntBuffer binaryFormat, 
    								java.nio.Buffer binary) {
    	
        GLES30Pipeline.nGLGetProgramBinary(program, bufSize, length, binaryFormat, binary);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetProgramBinary([int program, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer binaryFormat, java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary ( (GLuint)  program, (GLsizei) bufSize, (GLsizei) *length, (GLenum) *binaryFormat, GLvoid *binary )

     * */
    private static native void nGLGetProgramBinary(int program, 
    												int bufSize, 
    												java.nio.IntBuffer length, int lengthOffset,
    												java.nio.IntBuffer binaryFormat, int binaryFormatOffset,
    												java.nio.Buffer binary, int binaryOffset);/*
    												
    							glGetProgramBinary( (GLuint)  program, 
    												(GLsizei) bufSize, 
    												(GLsizei *) (length + lenghtOffset), 
    												(GLenum *) (binaryFormat + binaryFormatOffset ), 
    												(GLvoid *) (binary + binaryOffset));	
    												
    		*/

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glProgramBinary([int program, int binaryFormat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glProgramBinary ( (GLuint)  program, (GLenum) binaryFormat, const GLvoid *binary, (GLsizei) length )

     * */
    public void glProgramBinary(int program, int binaryFormat, java.nio.Buffer binary, int length) {
        GLES30Pipeline.nGLProgramBinary(program, binaryFormat, binary, length);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glProgramBinary([int program, int binaryFormat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glProgramBinary ( (GLuint)  program, (GLenum) binaryFormat, const GLvoid *binary, (GLsizei) length )

     * */
    private static native void nGLProgramBinary(int program, int binaryFormat, java.nio.Buffer binary, int offset, int length);/*
    
    								glProgramBinary((GLuint)  program, 
    												(GLenum) binaryFormat, 
    												(const GLvoid *) (binary + offset), 
    												(GLsizei) length );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glProgramParameteri([int program, int pname, int value]);
     * 
     *  C function void glProgramParameteri ( (GLuint)  program, (GLenum) pname, (GLint) value )

     * */
    public void glProgramParameteri(int program, int pname, int value) {
        GLES30Pipeline.nGLProgramParameteri(program, pname, value);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glProgramParameteri([int program, int pname, int value]);
     * 
     *  C function void glProgramParameteri ( (GLuint)  program, (GLenum) pname, (GLint) value )

     * */
    private static native void nGLProgramParameteri(int program, int pname, int value);/*
    
    					glProgramParameteri ( (GLuint)  program, (GLenum) pname, (GLint) value );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glInvalidateFramebuffer([int target, int numAttachments, int[] attachments, int offset]);
     * 
     *  C function void glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments )

     * */
    public void glInvalidateFramebuffer(int target, int numAttachments, int[] attachments, int offset) {
        GLES30Pipeline.nGLInvalidateFramebuffer(target, numAttachments, attachments, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glInvalidateFramebuffer([int target, int numAttachments, int[] attachments, int offset]);
     * 
     *  C function void glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments )

     * */
    private static native void nGLInvalidateFramebuffer(int target, int numAttachments, int[] attachments, int offset);/*
    				
    				glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, (const GLenum *) (attachments + offset));
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glInvalidateFramebuffer([int target, int numAttachments, java.nio.IntBuffer attachments]);
     * 
     *  C function void glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments )

     * */
    public void glInvalidateFramebuffer(int target, int numAttachments, java.nio.IntBuffer attachments) {
        

        if (attachments == null)
            throw new RuntimeException(INTBUFFER_NULL);

        // now, the offset...
        if (attachments.isDirect()) {
            int offset = BufferInfo.getOffset(attachments);
            GLES30Pipeline.nGLInvalidateFramebuffer(target, numAttachments, attachments, offset);
        } else {
            if(!attachments.hasArray()){
                throw new RuntimeException(INTBUFFER_ND);
            }
            int[] array = attachments.array();            
            int offset = attachments.arrayOffset(); 
            GLES30Pipeline.nGLInvalidateFramebuffer(target, numAttachments, array, offset);
    }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glInvalidateFramebuffer([int target, int numAttachments, java.nio.IntBuffer attachments]);
     * 
     *  C function void glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments )

     * */
    private static native void nGLInvalidateFramebuffer(int target, int numAttachments, java.nio.IntBuffer attachments, int offset);/*
    
    					glInvalidateFramebuffer ( (GLenum) target, (GLsizei) numAttachments, (const GLenum *) (attachments + offset) );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glInvalidateSubFramebuffer([int target, int numAttachments, int[] attachments, int offset, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glInvalidateSubFramebuffer(int target, 
    										int numAttachments, 
    										int[] attachments, int offset, 
    										int x, int y, 
    										int width, int height) {
    	
        GLES30Pipeline.nGLInvalidateSubFramebuffer(target, numAttachments, attachments, offset, x, y, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glInvalidateSubFramebuffer([int target, int numAttachments, int[] attachments, int offset, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLInvalidateSubFramebuffer(int target, 
    														int numAttachments, 
    														int[] attachments, int offset, 
    														int x, int y, 
    														int width, int height);/*
    										
    							glInvalidateSubFramebuffer( (GLenum) target, 
    														(GLsizei) numAttachments, 
    														(const GLenum *) &attachments[offset], 
    														(GLint) x, (GLint) y, 
    														(GLsizei) width, (GLsizei) height );
    														
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glInvalidateSubFramebuffer([int target, int numAttachments, java.nio.IntBuffer attachments, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    public void glInvalidateSubFramebuffer(int target, 
    										int numAttachments, 
    										java.nio.IntBuffer attachments, 
    										int x, int y, 
    										int width, int height) {
    	
        if (attachments == null)
            throw new RuntimeException(INTBUFFER_NULL);

        // now, the offset...
        if (attachments.isDirect()) {
            int offset = BufferInfo.getOffset(attachments);
            GLES30Pipeline.nGLInvalidateSubFramebuffer(target, 
                    numAttachments, 
                    attachments, offset, 
                    x, y, 
                    width, height);            
        } else {
            if(!attachments.hasArray()){
                throw new RuntimeException(INTBUFFER_ND);
            }
            int[] array = attachments.array();            
            int offset = attachments.arrayOffset();            
            GLES30Pipeline.nGLInvalidateSubFramebuffer(target, numAttachments, array, offset, x, y, width, height);            
        }
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glInvalidateSubFramebuffer([int target, int numAttachments, java.nio.IntBuffer attachments, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer ( (GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLInvalidateSubFramebuffer(int target, 
    														int numAttachments, 
    														java.nio.IntBuffer attachments, int offset,
    														int x, int y, 
    														int width, int height);/*
    														
    															
    							glInvalidateSubFramebuffer( (GLenum) target, 
    														(GLsizei) numAttachments, 
    														(const GLenum *) (attachments  + offset), 
    														(GLint) x, (GLint) y, 
    														(GLsizei) width, (GLsizei) height );						
    														
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexStorage2D([int target, int levels, int internalformat, int width, int height]);
     * 
     *  C function void glTexStorage2D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        GLES30Pipeline.nGLTexStorage2D(target, levels, internalformat, width, height);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexStorage2D([int target, int levels, int internalformat, int width, int height]);
     * 
     *  C function void glTexStorage2D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height )

     * */
    private static native void nGLTexStorage2D(int target, int levels, int internalformat, int width, int height);/*
    
    		glTexStorage2D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height );
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glTexStorage3D([int target, int levels, int internalformat, int width, int height, int depth]);
     * 
     *  C function void glTexStorage3D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth )

     * */
    public void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        GLES30Pipeline.nGLTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glTexStorage3D([int target, int levels, int internalformat, int width, int height, int depth]);
     * 
     *  C function void glTexStorage3D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth )

     * */
    private static native void nGLTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth);/*
     				glTexStorage3D ( (GLenum) target, (GLsizei) levels, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInternalformativ([int target, int internalformat, int pname, int bufSize, int[] params, int offset]);
     * 
     *  C function void glGetInternalformativ ( (GLenum) target, (GLenum) internalformat, (GLenum) pname, (GLsizei) bufSize, (GLint) *params )

     * */
    public void glGetInternalformativ(int target, 
    								  int internalformat, 
    								  int pname, 
    								  int bufSize, 
    								  int[] params, int offset) {
        GLES30Pipeline.nGLGetInternalformativ(target, internalformat, pname, bufSize, params, offset);
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInternalformativ([int target, int internalformat, int pname, int bufSize, int[] params, int offset]);
     * 
     *  C function void glGetInternalformativ ( (GLenum) target, (GLenum) internalformat, (GLenum) pname, (GLsizei) bufSize, (GLint) *params )

     * */
    private static native void nGLGetInternalformativ(int target, 
    												  int internalformat, 
    												  int pname, 
    												  int bufSize, 
    												  int[] params, int offset);/*
    
    
    			glGetInternalformativ(  (GLenum) target, 
    									(GLenum) internalformat, 
    									(GLenum) pname, 
    									(GLsizei) bufSize, 
    									(GLint *) &params[offset] );
    
    */

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Delegate Method generated from GLES30.glGetInternalformativ([int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params]);
     * 
     *  C function void glGetInternalformativ ( (GLenum) target, (GLenum) internalformat, (GLenum) pname, (GLsizei) bufSize, (GLint) *params )

     * */
    public void glGetInternalformativ(int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params) {
        if (params == null)
            throw new RuntimeException(INTBUFFER_NULL);

        // now, the offset...
        if (params.isDirect()) {
            int offset = BufferInfo.getOffset(params);
            GLES30Pipeline.nGLGetInternalformativ(target, internalformat, pname, bufSize, params, offset);            
        } else {
            throw new RuntimeException(INTBUFFER_NULL);
        }
        
    }

    /**
     * MACHINE GENERATED! Please, do not edit !
     * Native method generated from GLES30.glGetInternalformativ([int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params]);
     * 
     *  C function void glGetInternalformativ ( (GLenum) target, (GLenum) internalformat, (GLenum) pname, (GLsizei) bufSize, (GLint) *params )

     * */
    private static native void nGLGetInternalformativ(int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params, int offset);/*
    
         		glGetInternalformativ(  (GLenum) target, 
    									(GLenum) internalformat, 
    									(GLenum) pname, 
    									(GLsizei) bufSize, 
    									(GLint *) (params + offset));
    
    */
}
