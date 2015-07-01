/*

**    Place holder for disclaimer.
*/

package gles.internal;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import gles.util.*;

/** OpenGL ES 3.0
 */
public class GLES30Pipeline 
   extends GLES20Pipeline
   implements Pipeline {
    
    

	/** Includes **/
	//@off
	/*JNI
	  #include <GLES3/gl3.h>
	  #include <stdio.h>
	  #include <stdlib.h>
	  #include <vector>
	  
	  using namespace std;
	  
	  ////////////////////////////////////////
	 */

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
    public static Pipeline getPipelineInstance() {
        if (instance == null) {
            instance = new GLES30Pipeline();
        }
        return instance;
    }

    /**
     * <pre>
     * Native method generated from GLES30._nativeClassInit();
     * 
     *  C function void glReadBuffer((GLenum) mode)

     **/
    private static native void nGLES30ClassInit();/*
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glReadBuffer([int mode]);
     * 
     *  C function void glReadBuffer((GLenum) mode)

     **/
    public void glReadBuffer(int mode) {
        GLES30Pipeline.nGLReadBuffer(mode);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glReadBuffer([int mode]);
     * 
     *  C function void glReadBuffer((GLenum) mode)

     **/
    private static native void nGLReadBuffer(int mode);/*    
    	   glReadBuffer( (GLenum) mode);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawRangeElements(
     * [int mode, int start, int end, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawRangeElements((GLenum) mode, 
     *                                      (GLuint)  start, 
     *                                      (GLuint)  end, 
     *                                      (GLsizei) count, 
     *                                      (GLenum) type, 
     *                                      const GLvoid *indices)
     **/
    public void glDrawRangeElements(int mode, 
                                    int start, int end, int count,
                                    int type, 
                                    java.nio.Buffer indices) {
                
        checkBuffer(indices, count, INDICES);   
        
        int offsetBytes = getOffset(indices);
        if (indices.isDirect()) {
            nGLDrawRangeElements(mode, start, end, count, type, indices, offsetBytes);
        } else {
            if(indices instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)indices;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLDrawRangeElements(mode, start, end, count, type, array, offset);
                return;
            }else if(indices instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)indices;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLDrawRangeElements(mode, start, end, count, type, array, offset);
                return;
            }else if(indices instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)indices;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLDrawRangeElements(mode, start, end, count, type, array, offset);
                return;
            }else 
            throw new RuntimeException(INVALID_BUFFER + indices);
        }

    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawRangeElements([int mode, int start, int end, int count, int type, java.nio.Buffer indices]);
     * 
     *  C function void glDrawRangeElements((GLenum) mode, 
     *                                      (GLuint)  start, 
     *                                      (GLuint)  end, 
     *                                      (GLsizei) count, (GLenum) type, const GLvoid *indices)

     **/
    private static native void nGLDrawRangeElements(int mode, 
        		    int start, int end, 
        		    int count, 
        		    int type, 
        	            java.nio.Buffer indices, int offset);/*    
          //char * indices0 = (char *) (indices + offset); 
          glDrawRangeElements((GLenum) mode, 
          		              (GLuint) start, 
          		              (GLuint)  end,
          		              (GLsizei) count, 
          			      (GLenum) type, 
          			      ( GLvoid *)( indices + offset));
    */
    
    private static native void nGLDrawRangeElements(int mode, 
                                                    int start, int end, 
                                                    int count, 
                                                    int type, 
                                                    byte[] indices, int offset);/*    
               //char * indices0 = (char *) (indices + offset); 
               glDrawRangeElements((GLenum) mode, 
                                   (GLuint) start, 
                                   (GLuint)  end,
                                   (GLsizei) count, 
                                   (GLenum) type, 
                                   ( GLvoid *)( indices + offset));
      */
    
    private static native void nGLDrawRangeElements(int mode, 
                                                    int start, int end, 
                                                    int count, 
                                                    int type, 
                                                    short[] indices, int offset);/* 
                              glDrawRangeElements((GLenum) mode, 
                                                  (GLuint) start, 
                                                  (GLuint)  end,
                                                  (GLsizei) count, 
                                                  (GLenum) type, 
                                                  ( GLvoid *)( indices + offset));
                        
                        
      */
    private static native void nGLDrawRangeElements(int mode, 
                                                    int start, int end, 
                                                    int count, 
                                                    int type, 
                                                    int[] indices, int offset);/*    
                              //char * indices0 = (char *) (indices + offset); 
                              glDrawRangeElements((GLenum) mode, 
                                                  (GLuint) start, 
                                                  (GLuint)  end,
                                                  (GLsizei) count, 
                                                  (GLenum) type, 
                                                  ( GLvoid *)( indices + offset));
                        
                        
      */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawRangeElements(
     * [int mode, int start, int end, int count, int type, int offset]);
     * 
     *  C function void glDrawRangeElements((GLenum) mode, 
     *                                      (GLuint)  start, (GLuint)  end, 
     *                                      (GLsizei) count, 
     *                                      (GLenum) type, 
     *                                      (GLsizei) offset);

     **/
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset) {        
        GLES30Pipeline.nGLDrawRangeElements(mode, start, end, count, type, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawRangeElements(
     * [int mode, int start, int end, int count, int type, int offset]);
     * 
     *  C function void glDrawRangeElements((GLenum) mode, 
     *                                      (GLuint)  start, (GLuint)  end, 
     *                                      (GLsizei) count, 
     *                                      (GLenum) type, 
     *                                      (GLsizei) offset)
     **/
    private static native void nGLDrawRangeElements(int mode, 
	    int start, 
	    int end, 
	    int count, 
	    int type, 
	    int offset);/*
                                    
             glDrawRangeElements( (GLenum) mode, 
             			  (GLuint)  start, 
             			  (GLuint)  end, 
             			  (GLsizei) count, 
             			  (GLenum) type, 
             			  reinterpret_cast<GLvoid *>(offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexImage3D(
     * [int target, int level, int internalformat, 
     * int width, int height, int depth, 
     * int border, 
     * int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage3D((GLenum) target, 
     *                               (GLint) level, 
     *                               (GLint) internalformat, 
     *                               (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                               (GLint) border, 
     *                               (GLenum) format, 
     *                               (GLenum) type, 
     *                               const GLvoid *pixels);
     **/
    public void glTexImage3D(int target, int level, 
                             int internalformat, 
                             int width, int height, int depth, 
                             int border,
                             int format, int type, 
                             java.nio.Buffer pixels) {

	checkBuffer(pixels, 1, PIXELS);

	if (pixels.isDirect()) {
	    int offsetBytes = getOffset(pixels);
	    nGLTexImage3D(target, level, internalformat, width, height, depth, border, format, type,
		    pixels, offsetBytes);
	} else {
	    
	    ArrayWrapper wrap = BufferInfo.getArrayWrapper(pixels);
	    int offset = wrap.offset;
	    Object array = wrap.array;
	    
	    switch(wrap.type){
	        case BYTE:
	            nGLTexImage3D(target, level, internalformat,  width, height, depth,
                            border, format, type, (byte[])array, offset);
	            break;
	        case SHORT:
	            nGLTexImage3D(target, level, internalformat, width, height, depth,
                            border, format, type, (short[])array, offset);
	            break;
	        case INT:
	            nGLTexImage3D(target, level, internalformat, width, height, depth,
                            border, format, type, (int[])array, offset);
                    break;
	        case FLOAT:
	            nGLTexImage3D(target, level, internalformat, width, height, depth,
                            border, format, type, (float[])array, offset);
                    break;
	        default:
	            throw new IllegalArgumentException(INVALID_BUFFER + pixels);
	           	             
	    }
	}
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexImage3D((GLenum) target, (GLint) level, (GLint) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLenum) format, (GLenum) type, const GLvoid *pixels)
     **/
    private static native void nGLTexImage3D(int target, 
        	     int level, 
        	     int internalformat,
        	     int width, int height, int depth,
        	     int border,
        	     int format,
        	     int type,
        	     java.nio.Buffer pixels, int offset);/*        	
            	
        glTexImage3D((GLenum) target, 
            (GLint) level, 
            (GLint) internalformat, 
            (GLsizei) width, (GLsizei) height, 
            (GLsizei) depth, 
            (GLint) border, 
            (GLenum) format, 
            (GLenum) type, 
        			    (GLvoid *) (pixels + offset));    		
    	*/
    
    private static native void nGLTexImage3D(int target, 
                                             int level, 
                                             int internalformat,
                                             int width, int height, int depth,
                                             int border,
                                             int format,
                                             int type,
                                             byte[] pixels, int offset);/*                     
                                                        
                                    glTexImage3D((GLenum) target, 
                                                    (GLint) level, 
                                                    (GLint) internalformat, 
                                                    (GLsizei) width, (GLsizei) height, 
                                                    (GLsizei) depth, 
                                                    (GLint) border, 
                                                    (GLenum) format, 
                                                    (GLenum) type, 
                                                    (GLvoid *) (pixels + offset));                      
                        */
    
    private static native void nGLTexImage3D(int target, 
                                             int level, 
                                             int internalformat,
                                             int width, int height, int depth,
                                             int border,
                                             int format,
                                             int type,
                                             short[] pixels, int offset);/*                     
                                                        
                                    glTexImage3D((GLenum) target, 
                                                    (GLint) level, 
                                                    (GLint) internalformat, 
                                                    (GLsizei) width, (GLsizei) height, 
                                                    (GLsizei) depth, 
                                                    (GLint) border, 
                                                    (GLenum) format, 
                                                    (GLenum) type, 
                                                    (GLvoid *) (pixels + offset));                      
                        */
    
    private static native void nGLTexImage3D(int target, 
                                             int level, 
                                             int internalformat,
                                             int width, int height, int depth,
                                             int border,
                                             int format,
                                             int type,
                                             int[] pixels, int offset);/*                     
                                                        
                                    glTexImage3D((GLenum) target, 
                                                    (GLint) level, 
                                                    (GLint) internalformat, 
                                                    (GLsizei) width, (GLsizei) height, 
                                                    (GLsizei) depth, 
                                                    (GLint) border, 
                                                    (GLenum) format, 
                                                    (GLenum) type, 
                                                    (GLvoid *) (pixels + offset));                      
                        */
    
    private static native void nGLTexImage3D(int target, 
                                             int level, 
                                             int internalformat,
                                             int width, int height, int depth,
                                             int border,
                                             int format,
                                             int type,
                                             float[] pixels, int offset);/*                     
                                                        
                                    glTexImage3D((GLenum) target, 
                                                    (GLint) level, 
                                                    (GLint) internalformat, 
                                                    (GLsizei) width, (GLsizei) height, 
                                                    (GLsizei) depth, 
                                                    (GLint) border, 
                                                    (GLenum) format, 
                                                    (GLenum) type, 
                                                    (GLvoid *) (pixels + offset));                      
                        */
    
    

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexImage3D([int target, int level, 
     * int internalformat, int width, int height, int depth,
     *  int border, int format, int type, int offset]);
     * 
     *  C function void glTexImage3D((GLenum) target, 
     *                               (GLint) level, 
     *                               (GLint) internalformat, 
     *                               (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                               (GLint) border, 
     *                               (GLenum) format, 
     *                               (GLenum) type, 
     *                               (GLsizei) offset);
     **/
    public void glTexImage3D(int target,
                             int level,
                             int internalformat,
                             int width, int height, int depth,
                             int border,
                             int format,
                             int type,
                             int offset) {
        GLES30Pipeline.nGLTexImage3D(target,
                level,
                internalformat,
                width, height,
                depth,
                border,
                format,
                type,
                offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset]);
     * 
     *  C function void glTexImage3D((GLenum) target, 
     *                               (GLint) level, 
     *                               (GLint) internalformat, 
     *                               (GLsizei) width, 
     *                               (GLsizei) height, 
     *                               (GLsizei) depth, 
     *                               (GLint) border, 
     *                               (GLenum) format, 
     *                               (GLenum) type, 
     *                               (GLsizei) offset);
     **/
    private static native void nGLTexImage3D(int target, 
    		int level, 
    		int internalformat, 
    		int width, int height, int depth, 
    		int border, 
    		int format, 
    		int type, 
    		int offset);/*
    		
      glTexImage3D((GLenum) target, 
          (GLint) level, 
          (GLint) internalformat, 
          (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
          (GLint) border, 
          (GLenum) format, 
          (GLenum) type, 
          reinterpret_cast<GLvoid *>(offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage3D((GLenum) target,
     *                                  (GLint) level, 
     *                                  (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *                                  (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                  (GLenum) format, 
     *                                  (GLenum) type, 
     *                                  const GLvoid *pixels);
     **/
    public void glTexSubImage3D(int target, 
    		int level, 
    		int xoffset, int yoffset, int zoffset, 
    		int width, int height, int depth, 
    		int format, 
    		int type, 
    		java.nio.Buffer pixels) {

		checkBuffer(pixels, 1, PIXELS);
		if (pixels.isDirect()) {
			int offsetBytes = getOffset(pixels);
			nGLTexSubImage3D(target, level, 
			                                xoffset, yoffset, zoffset, 
			                                width, height, depth, 
			                                format, 
			                                type, 
			                                pixels, offsetBytes);
		} else {
		    
		    ArrayWrapper wrap = BufferInfo.getArrayWrapper(pixels);
	            int offset = wrap.offset;
	            Object array = wrap.array;
	            
	            switch(wrap.type){
	                case BYTE:
	                    nGLTexSubImage3D(target, level,  xoffset, yoffset, zoffset, 
	                            width, height, depth,  format, type, 
	                            (byte[])array, offset); 
	                    break;
	                case SHORT:
	                    nGLTexSubImage3D(target, level,  xoffset, yoffset, zoffset, 
                                    width, height, depth,  format, type, 
                                    (short[])array, offset); 
	                   
	                    break;
	                case INT:
	                    nGLTexSubImage3D(target, level,  xoffset, yoffset, zoffset, 
                                    width, height, depth,  format, type, 
                                    (int[])array, offset); 
	                    
	                    break;
	                case FLOAT:
	                    nGLTexSubImage3D(target, level,  xoffset, yoffset, zoffset, 
                                    width, height, depth,  format, type, 
                                    (float[])array, offset); 
	                    
	                    break;
	                default:
	                    throw new IllegalArgumentException(INVALID_BUFFER + pixels);
	                                     
	            }
		  
	}
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.Buffer pixels]);
     * 
     *  C function void glTexSubImage3D((GLenum) target, (GLint) level, 
     *      (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *      (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *      (GLenum) format, 
     *                                  (GLenum) type, 
     *                                   const GLvoid *pixels);
     **/
    private static native void nGLTexSubImage3D(int target, 
    		int level, 
    		int xoffset, int yoffset, int zoffset, 
    		int width, int height, int depth, 
    		int format, 
    		int type, 
    		java.nio.Buffer pixels, int offset);/*  		
    		
    	glTexSubImage3D((GLenum) target, (GLint) level, 
        		(GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
        		(GLsizei) width, (GLsizei) height, (GLsizei) depth, 
        		(GLenum) format, 
        		(GLenum) type, 
        		(GLvoid *)(pixels + offset));    		
    */
    
    private static native void nGLTexSubImage3D(int target, 
                                                int level, 
                                                int xoffset, int yoffset, int zoffset, 
                                                int width, int height, int depth, 
                                                int format, 
                                                int type, 
                                                byte[] pixels, int offset);/*
        glTexSubImage3D((GLenum) target, (GLint) level, 
                        (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                        (GLenum) format, 
                        (GLenum) type, 
                        (GLvoid *)(pixels + offset));
    */
    
    private static native void nGLTexSubImage3D(int target, 
                                                int level, 
                                                int xoffset, int yoffset, int zoffset, 
                                                int width, int height, int depth, 
                                                int format, 
                                                int type, 
                                                short[] pixels, int offset);/*
        glTexSubImage3D((GLenum) target, (GLint) level, 
                        (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                        (GLenum) format, 
                        (GLenum) type, 
                        (GLvoid *)(pixels + offset));
    */
    
    private static native void nGLTexSubImage3D(int target, 
                                                int level, 
                                                int xoffset, int yoffset, int zoffset, 
                                                int width, int height, int depth, 
                                                int format, 
                                                int type, 
                                                int[] pixels, int offset);/*
        glTexSubImage3D((GLenum) target, (GLint) level, 
                        (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                        (GLenum) format, 
                        (GLenum) type, 
                        (GLvoid *)(pixels + offset));
    */
    
    private static native void nGLTexSubImage3D(int target, 
                                                int level, 
                                                int xoffset, int yoffset, int zoffset, 
                                                int width, int height, int depth, 
                                                int format, 
                                                int type, 
                                                float[] pixels, int offset);/*
        glTexSubImage3D((GLenum) target, (GLint) level, 
                        (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                        (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                        (GLenum) format, 
                        (GLenum) type, 
                        (GLvoid *)(pixels + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexSubImage3D([int target, int level, 
     *  int xoffset, int yoffset, int zoffset, 
     *  int width, int height, int depth, 
     *  int format, int type, int offset]);
     * 
     *  C function void glTexSubImage3D((GLenum) target, 
     *                                  (GLint) level, 
     *                                  (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *                                  (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                  (GLenum) format, (GLenum) type, (GLsizei) offset)

     **/
    public void glTexSubImage3D(int target, int level, 
        int xoffset, int yoffset, int zoffset, 
        int width, int height, int depth, 
        int format, 
        int type, 
        int offset) {
        GLES30Pipeline.nGLTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int offset]);
     * 
     *  C function void glTexSubImage3D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLenum) type, (GLsizei) offset)

     **/
    private static native void nGLTexSubImage3D(int target, int level,
                                                int xoffset, int yoffset, int zoffset,
                                                int width, int height, int depth,
                                                int format,
                                                int type,
                                                int offset);/*
    	 glTexSubImage3D((GLenum) target, (GLint) level, 
    	     		 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
    	 		 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
    	 		 (GLenum) format, (GLenum) type, 
    	 		 reinterpret_cast<GLvoid *>(offset) );
    	
    	*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCopyTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage3D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLint) x, (GLint) y, (GLsizei) width, (GLsizei) height)

     **/
    public void glCopyTexSubImage3D(int target, int level, 
                                    int xoffset, int yoffset, int zoffset,
                                    int x, int y, int width, int height) {    	
        GLES30Pipeline.nGLCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glCopyTexSubImage3D([int target, int level, 
     * int xoffset, int yoffset, int zoffset, int x, int y, int width, int height]);
     * 
     *  C function void glCopyTexSubImage3D((GLenum) target, 
     *                                      (GLint) level, 
     *                                      (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *                                      (GLint) x, (GLint) y, 
     *                                      (GLsizei) width, (GLsizei) height);

     **/
    private static native void nGLCopyTexSubImage3D(int target, int level, 
                                                    int xoffset, int yoffset, int zoffset,
                                                    int x, int y,
                                                    int width, int height);/*    
    	glCopyTexSubImage3D((GLenum) target, (GLint) level, 
    	                    (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
        		(GLint) x, (GLint) y, 
        		(GLsizei) width, (GLsizei) height);
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCompressedTexImage3D(
     * [int target, int level, int internalformat, int width, int height, int depth,
     *  int border, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage3D((GLenum) target, 
     *                                         (GLint) level, 
     *                                         (GLenum) internalformat, 
     *                                         (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                         (GLint) border, 
     *                                         (GLsizei) imageSize, 
     *                                         const GLvoid *data);
     **/
    public void glCompressedTexImage3D(int target, 
                                    int level, int internalformat, 
                                    int width, int height, int depth, 
                                    int border, int imageSize, 
                                    java.nio.Buffer data) {
        
        checkBuffer(data, 1, DATA);
        // now, the offset...
        if (data.isDirect()) {
            int offsetBytes = getOffset(data);
            nGLCompressedTexImage3D(target,
                    level,
                    internalformat,
                    width, height, depth,
                    border,
                    imageSize,
                    data,
                    offsetBytes);
        } else {
            if(data instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)data;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLCompressedTexImage3D(target,
                        level,
                        internalformat,
                        width, height, depth,
                        border,
                        imageSize,
                        array,
                        offset);
                return;
            }else{
                throw new IllegalArgumentException(INVALID_BUFFER + data);
            }
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glCompressedTexImage3D(
     * [int target, int level, int internalformat, 
     * int width, int height, int depth, 
     * int border, 
     * int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexImage3D((GLenum) target, 
     *                                         (GLint) level, 
     *                                         (GLenum) internalformat, 
     *                                         (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                         (GLint) border, 
     *                                         (GLsizei) imageSize, 
     *                                         const GLvoid *data);
     **/
    private static native void nGLCompressedTexImage3D(int target,
                                                       int level, int internalformat,
                                                       int width, int height, int depth,
                                                       int border, int imageSize,
                                                       java.nio.Buffer data, int offset);/*        	
    //char * data0 = (char *) (data + offset);        
        glCompressedTexImage3D((GLenum) target, 
                                (GLint) level, (GLenum) internalformat, 
                                (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                (GLint) border, 
                                (GLsizei) imageSize, 
                                ( GLvoid *)(data + offset));
    	*/
    private static native void nGLCompressedTexImage3D(int target, 
                                                       int level, int internalformat, 
                                                       int width, int height, int depth, 
                                                       int border, int imageSize, 
                                                       byte[] data, int offset);/*                        
                       //char * data0 = (char *) (data + offset);                              
                       glCompressedTexImage3D((GLenum) target, 
                                               (GLint) level, (GLenum) internalformat, 
                                               (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                               (GLint) border, 
                                               (GLsizei) imageSize, 
                                               ( GLvoid *)(data + offset));
           */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCompressedTexImage3D([int target, 
     *  int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexImage3D((GLenum) target, 
     *                                          (GLint) level, 
     *                                          (GLenum) internalformat, 
     *                                          (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                          (GLint) border, 
     *                                          (GLsizei) imageSize, (GLsizei) offset)

     **/
    public void glCompressedTexImage3D(int target,
                                       int level,
                                       int internalformat,
                                       int width, int height, int depth,
                                       int border,
                                       int imageSize,
                                       int offset) {
        GLES30Pipeline.nGLCompressedTexImage3D(target,
                level,
                internalformat,
                width, height, depth,
                border,
                imageSize,
                offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glCompressedTexImage3D([int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexImage3D((GLenum) target, (GLint) level, (GLenum) internalformat, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLint) border, (GLsizei) imageSize, (GLsizei) offset)

     **/
    private static native void nGLCompressedTexImage3D(int target, 
                                                       int level, 
                                                       int internalformat, 
                                                       int width, int height, int depth, 
                                                       int border, 
                                                       int imageSize, 
                                                       int offset);/*
         glCompressedTexImage3D((GLenum) target, 
                                 (GLint) level, (GLenum) internalformat, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLint) border, 
                                 (GLsizei) imageSize, 
                                 reinterpret_cast<GLvoid *>(offset));
         
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage3D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, const GLvoid *data)

     **/
    public void glCompressedTexSubImage3D(int target, 
            int level, 
            int xoffset, int yoffset, int zoffset, 
            int width, int height, int depth, 
            int format, int imageSize, 
            java.nio.Buffer data) {
        
        checkBuffer(data, 1, DATA);
        
        if (data.isDirect()) {
            int offsetBytes = getOffset(data);
            GLES30Pipeline.nGLCompressedTexSubImage3D(target, level,
                    xoffset,  yoffset,  zoffset,
                    width, height, depth,
                    format,
                    imageSize,
                    data, offsetBytes);
            
        } else if(data instanceof ByteBuffer){
            ByteBuffer bb = (ByteBuffer)data;
            int offset = getOffset(bb);
            byte[] array = bb.array();
            GLES30Pipeline.nGLCompressedTexSubImage3D(target, level,
                    xoffset,  yoffset,  zoffset,
                    width, height, depth,
                    format,
                    imageSize,
                    array, offset);
            return;
        }else{
            throw new IllegalArgumentException("Invalid buffer.");
        }

    }

    /**
     * <pre>
     * Native method generated from GLES30.glCompressedTexSubImage3D([int target, int level, 
     *                              int xoffset, int yoffset, int zoffset, 
     *                              int width, int height, int depth, 
     *                              int format, int imageSize, java.nio.Buffer data]);
     * 
     *  C function void glCompressedTexSubImage3D((GLenum) target, 
     *                                            (GLint) level, 
     *                                            (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
     *                                            (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
     *                                            (GLenum) format, 
     *                                            (GLsizei) imageSize, 
     *                                            const GLvoid *data)
     **/
    private static native void nGLCompressedTexSubImage3D(int target, 
                                                          int level, 
                                                          int xoffset, int yoffset, int zoffset, 
                                                          int width, int height, int depth, 
                                                          int format, int imageSize, 
                                                          java.nio.Buffer data, int offset);/*
    //char * data0 = (char *) (data + offset);
    glCompressedTexSubImage3D((GLenum) target, (GLint) level, 
                                 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLenum) format, (GLsizei) imageSize, 
                                 (GLvoid *)(data + offset));
    
    */
    
    private static native void nGLCompressedTexSubImage3D(int target, 
                                                          int level, 
                                                          int xoffset, int yoffset, int zoffset, 
                                                          int width, int height, int depth, 
                                                          int format, int imageSize, 
                                                          byte[] data, int offset);/*
    //char * data0 = (char *) (data + offset);
    glCompressedTexSubImage3D((GLenum) target, (GLint) level, 
                                 (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                 (GLenum) format, (GLsizei) imageSize, 
                                 (GLvoid *)(data + offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexSubImage3D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, (GLsizei) offset)

     **/
    public void glCompressedTexSubImage3D( int target, int level, 
                                           int xoffset, int yoffset, int zoffset, 
                                           int width, int height, int depth, 
                                           int format, 
                                           int imageSize, int offset) {
        GLES30Pipeline.nGLCompressedTexSubImage3D(target, level, 
                xoffset, yoffset, zoffset, 
                width, height, depth, format, imageSize, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glCompressedTexSubImage3D([int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset]);
     * 
     *  C function void glCompressedTexSubImage3D((GLenum) target, (GLint) level, (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, (GLsizei) width, (GLsizei) height, (GLsizei) depth, (GLenum) format, (GLsizei) imageSize, (GLsizei) offset)

     **/
    private static native void nGLCompressedTexSubImage3D( int target, 
                                                           int level, 
                                                           int xoffset, int yoffset, int zoffset, 
                                                           int width, int height, int depth, 
                                                           int format, 
                                                           int imageSize, int offset);/*
          glCompressedTexSubImage3D((GLenum) target, 
                                      (GLint) level, 
                                      (GLint) xoffset, (GLint) yoffset, (GLint) zoffset, 
                                      (GLsizei) width, (GLsizei) height, (GLsizei) depth, 
                                      (GLenum) format, (GLsizei) imageSize, 
                                       reinterpret_cast<GLvoid *>(offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glGenQueries((GLsizei) n, (GLuint *) ids)

     **/
    public void glGenQueries(int n, int[] ids, int offset) {
        checkArray(ids, offset, n, IDS);
        GLES30Pipeline.nGLGenQueries(n, ids, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glGenQueries((GLsizei) n, (GLuint *) ids)

     **/
    private static native void nGLGenQueries(int n, int[] ids, int offset);/*    
           glGenQueries((GLsizei) n, (GLuint *)(ids + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenQueries((GLsizei) n, (GLuint *) ids)

     **/
    public void glGenQueries(int n, java.nio.IntBuffer ids) {
        checkBuffer(ids, n, IDS);
        int offset = getOffset(ids);
        if (ids.isDirect()) {            
            GLES30Pipeline.nGLGenQueries(n, ids, offset);
        } else {
            int[] array = ids.array();
            GLES30Pipeline.nGLGenQueries(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenQueries((GLsizei) n, (GLuint *) ids)

     **/
    private static native void nGLGenQueries(int n, java.nio.IntBuffer ids, int offset);/*    
              glGenQueries((GLsizei) n, (GLuint  *)(ids + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteQueries((GLsizei) n, (const GLuint *) ids)

     **/
    public void glDeleteQueries(int n, int[] ids, int offset) {
        checkArray(ids, offset, n, IDS);
        GLES30Pipeline.nGLDeleteQueries(n, ids, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteQueries([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteQueries((GLsizei) n, (const GLuint *) ids)

     **/
    private static native void nGLDeleteQueries(int n, int[] ids, int offset);/*    
            glDeleteQueries((GLsizei) n, (GLuint  *) (ids + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteQueries((GLsizei) n, (const GLuint *) ids)

     **/
    public void glDeleteQueries(int n, java.nio.IntBuffer ids) {
        checkBuffer(ids, n, IDS);
        int offset = getOffset(ids);
        if (ids.isDirect()) {            
            GLES30Pipeline.nGLDeleteQueries(n, ids, offset);            
        } else {
            int[] array = ids.array();
            GLES30Pipeline.nGLDeleteQueries(n, array, offset);  
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteQueries([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteQueries((GLsizei) n, (const GLuint *) ids)
     **/
    private static native void nGLDeleteQueries(int n, java.nio.IntBuffer ids, int offset);/*    
          glDeleteQueries((GLsizei) n, ( GLuint  *) (ids + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glIsQuery([int id]);
     * 
     *  C function (GLboolean) glIsQuery((GLuint)  id)
     **/
    public boolean glIsQuery(int id) {
       return GLES30Pipeline.nGLIsQuery(id);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glIsQuery([int id]);
     * 
     *  C function (GLboolean) glIsQuery((GLuint)  id)
     **/
    private static native boolean nGLIsQuery(int id);/*    
       return (jboolean) glIsQuery((GLuint)  id);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBeginQuery([int target, int id]);
     * 
     *  C function void glBeginQuery((GLenum) target, (GLuint)  id)
     **/
    public void glBeginQuery(int target, int id) {
        GLES30Pipeline.nGLBeginQuery(target, id);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBeginQuery([int target, int id]);
     * 
     *  C function void glBeginQuery((GLenum) target, (GLuint)  id)
     **/
    private static native void nGLBeginQuery(int target, int id);/*
    	glBeginQuery((GLenum) target, (GLuint)  id);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glEndQuery([int target]);
     * 
     *  C function void glEndQuery((GLenum) target)

     **/
    public void glEndQuery(int target) {
        GLES30Pipeline.nGLEndQuery(target);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glEndQuery([int target]);
     * 
     *  C function void glEndQuery((GLenum) target)

     **/
    private static native void nGLEndQuery(int target);/*
                glEndQuery((GLenum) target);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetQueryiv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryiv((GLenum) target, (GLenum) pname, (GLint) *params)

     **/
    public void glGetQueryiv(int target, int pname, int[] params, int offset) {
        GLES30Pipeline.nGLGetQueryiv(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetQueryiv([int target, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryiv((GLenum) target, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetQueryiv(int target, int pname, int[] params, int offset);/*
                glGetQueryiv((GLenum) target, (GLenum) pname, (GLint *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetQueryiv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryiv((GLenum) target, (GLenum) pname, (GLint) *params)

     **/
    public void glGetQueryiv(int target, int pname, java.nio.IntBuffer params) {        
        checkBuffer(params,1,PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {        
            nGLGetQueryiv(target, pname, params, offset);
        } else {
            int[] array = params.array();
            nGLGetQueryiv(target, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetQueryiv([int target, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryiv((GLenum) target, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetQueryiv(int target, int pname, java.nio.IntBuffer params, int offset);/*    
            glGetQueryiv((GLenum) target, (GLenum) pname, (GLint *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetQueryObjectuiv([int id, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint *) params)

     **/
    public void glGetQueryObjectuiv(int id, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES30Pipeline.nGLGetQueryObjectuiv(id, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetQueryObjectuiv([int id, int pname, int[] params, int offset]);
     * 
     *  C function void glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint *) params)

     **/
    private static native void nGLGetQueryObjectuiv(int id, int pname, int[] params, int offset);/*    
         glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint  *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetQueryObjectuiv([int id, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint *) params)

     **/
    public void glGetQueryObjectuiv(int id, int pname, java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
       
        if (params.isDirect()) {        
            nGLGetQueryObjectuiv(id, pname, params, offset);
        } else {
            int[] array = params.array();
            nGLGetQueryObjectuiv(id, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetQueryObjectuiv([int id, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetQueryObjectuiv((GLuint)  id, (GLenum) pname, (GLuint *) params)
     **/
    private static native void nGLGetQueryObjectuiv(int id, int pname, java.nio.IntBuffer params, int offset);/*
            glGetQueryObjectuiv((GLuint)id,  (GLenum)pname, (GLuint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUnmapBuffer([int target]);
     * 
     *  C function (GLboolean) glUnmapBuffer((GLenum) target)
     **/
    public boolean glUnmapBuffer(int target) {
       return GLES30Pipeline.nGLUnmapBuffer(target);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUnmapBuffer([int target]);
     * 
     *  C function (GLboolean) glUnmapBuffer((GLenum) target)
     **/
    private static native boolean nGLUnmapBuffer(int target);/*    
          return (jboolean)glUnmapBuffer((GLenum) target);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetBufferPointerv([int target, int pname]);
     * 
     *  C function void glGetBufferPointerv((GLenum) target, (GLenum) pname, GLvoid** params)
     **/
    public java.nio.Buffer glGetBufferPointerv(int target, int pname) {
        return GLES30Pipeline.nGLGetBufferPointerv(target, pname);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetBufferPointerv([int target, int pname]);
     * 
     *  C function void glGetBufferPointerv((GLenum) target, (GLenum) pname, GLvoid** params)
     **/
    private static native java.nio.Buffer nGLGetBufferPointerv(int target, int pname);/*        
        // from android.googlesource.com
        GLint64 _mapLength = 0;
        GLvoid* _p; // &_p works like GLvoid** _p
        
        glGetBufferParameteri64v((GLenum)target, GL_BUFFER_MAP_LENGTH, &_mapLength);
        
        glGetBufferPointerv((GLenum)target, (GLenum)pname, &_p);
        return env->NewDirectByteBuffer(_p, _mapLength);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawBuffers([int n, int[] bufs, int offset]);
     * 
     *  C function void glDrawBuffers((GLsizei) n, const (GLenum) *bufs)
     **/
    public void glDrawBuffers(int n, int[] bufs, int offset) {
        checkArray(bufs, offset, n, BUFS);
        GLES30Pipeline.nGLDrawBuffers(n, bufs, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawBuffers([int n, int[] bufs, int offset]);
     * 
     *  C function void glDrawBuffers((GLsizei) n, const (GLenum) *bufs)
     **/
    private static native void nGLDrawBuffers(int n, int[] bufs, int offset);/*    
            glDrawBuffers((GLsizei) n, (GLenum *)(bufs + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawBuffers([int n, java.nio.IntBuffer bufs]);
     * 
     *  C function void glDrawBuffers((GLsizei) n, const (GLenum) *bufs)
     **/
    public void glDrawBuffers(int n, java.nio.IntBuffer bufs) {        
        checkBuffer(bufs,1,BUFS);
        int offset = getOffset(bufs);
        if (bufs.isDirect()) {           
            nGLDrawBuffers(n, bufs, offset);
        } else {
            int[] array = bufs.array();
            nGLDrawBuffers(n, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawBuffers([int n, java.nio.IntBuffer bufs]);
     * 
     *  C function void glDrawBuffers((GLsizei) n, const (GLenum) *bufs)

     **/
    private static native void nGLDrawBuffers(int n, java.nio.IntBuffer bufs, int offset);/*    
         glDrawBuffers((GLsizei) n, (GLenum *)(bufs + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix2x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix2x3fv(int location, int count, 
                                     boolean transpose, 
                                     float[] value, int offset) {
        checkArray(value, offset, 6*count , VALUES);
        GLES30Pipeline.nGLUniformMatrix2x3fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix2x3fv(
     * [int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x3fv((GLint) location, 
     *  (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)
     **/
    private static native void nGLUniformMatrix2x3fv(int location, int count, 
                                                     boolean transpose, 
                                                     float[] value, int offset);/*    
                glUniformMatrix2x3fv((GLint) location, 
                (GLsizei) count, (GLboolean) transpose, (GLfloat *)(value+offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix2x3fv(
     * [int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x3fv((GLint) location, 
     *  (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix2x3fv(int location,
                                     int count,
                                     boolean transpose,
                                     java.nio.FloatBuffer value) {
        checkBuffer(value, 6*count, VALUES);
        int offset = getOffset(value);
        // now, the offset...
        if (value.isDirect()) {
            nGLUniformMatrix2x3fv(location, count, transpose, value, offset);
        } else {
            float[] array = value.array();
            nGLUniformMatrix2x3fv(location, count, transpose, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix2x3fv(
     * [int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x3fv((GLint) location, 
     *  (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix2x3fv(int location, int count, 
                                                     boolean transpose, 
                                                     java.nio.FloatBuffer value, int offset);/*    
         glUniformMatrix2x3fv((GLint) location, 
         (GLsizei) count, 
         (GLboolean) transpose, 
         ( GLfloat *)(value+offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix3x2fv(
     * [int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x2fv((GLint) location, 
     *  (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix3x2fv(int location, int count,
                                     boolean transpose, 
                                     float[] value, int offset) {
        checkArray(value, offset, 6*count, PARAMS);
        GLES30Pipeline.nGLUniformMatrix3x2fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix3x2fv(int location, int count,
                                                     boolean transpose, 
                                                     float[] value, int offset);/*    
            glUniformMatrix3x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix3x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix3x2fv(int location, int count, 
                                     boolean transpose, 
                                     java.nio.FloatBuffer value) {
        checkBuffer(value,6*count,VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {           
            GLES30Pipeline.nGLUniformMatrix3x2fv(location, count, transpose, value, offset);
        } else {
            float[] array = value.array();
            nGLUniformMatrix3x2fv(location, count, transpose, array, offset);
        }       
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix3x2fv([
     * int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x2fv((GLint) location, 
     *  (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix3x2fv(int location, int count, 
                                                     boolean transpose, 
                                                     java.nio.FloatBuffer value, int offset);/*    
            glUniformMatrix3x2fv((GLint) location, 
            (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix2x4fv(int location, int count, boolean transpose, 
                                     float[] value, int offset) {
        checkArray(value, offset, 8*count, VALUES);
        GLES30Pipeline.nGLUniformMatrix2x4fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value, int offset);/*
    
         glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix2x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        
        checkBuffer(value,8*count,VALUES);
        int offset = getOffset(value);
        
        if (value.isDirect()) {           
            GLES30Pipeline.nGLUniformMatrix2x4fv(location, count, transpose, value, offset);
        } else {
            float[] array = value.array();
            GLES30Pipeline.nGLUniformMatrix2x4fv(location, count, transpose, array, offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix2x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)
     **/
    private static native void nGLUniformMatrix2x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*    
             glUniformMatrix2x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)
     **/
    public void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value, int offset) {
        checkArray(value, offset, 8*count, VALUES);
        GLES30Pipeline.nGLUniformMatrix4x2fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)
     **/
    private static native void nGLUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value, int offset);/*    
            glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix4x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {        
        checkBuffer(value,8*count,VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {           
            GLES30Pipeline.nGLUniformMatrix4x2fv(location, count, transpose, value, offset);
        } else {
            GLES30Pipeline.nGLUniformMatrix4x2fv(location, count, transpose, value.array(), offset);
            }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix4x2fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix4x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*    
             glUniformMatrix4x2fv((GLint) location, (GLsizei) count, (GLboolean) transpose, (const GLfloat *)(value + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value, int offset) {
        checkArray(value, offset, 12*count, VALUES);
        GLES30Pipeline.nGLUniformMatrix3x4fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix3x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value, int offset);/*    
        	glUniformMatrix3x4fv((GLint) location, 
            			(GLsizei) count, 
            			(GLboolean) transpose, 
            			( GLfloat *) &value[offset]);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix3x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        checkBuffer(value,12*count,VALUES);
        int offset = getOffset(value); 
        // now, the offset...
        if (value.isDirect()) {
            GLES30Pipeline.nGLUniformMatrix3x4fv(location, count, transpose, value, offset);
        } else {
            GLES30Pipeline.nGLUniformMatrix3x4fv(location, count, transpose, value.array(), offset);
        }     
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix3x4fv([int location, int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix3x4fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix3x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*    
        	glUniformMatrix3x4fv((GLint) location, 
            			(GLsizei) count, 
            			(GLboolean) transpose, 
            			(GLfloat *) (value + offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    public void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value, int offset) {
        checkArray(value, offset, 12*count, VALUES);
        GLES30Pipeline.nGLUniformMatrix4x3fv(location, count, transpose, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix4x3fv([int location, int count, boolean transpose, float[] value, int offset]);
     * 
     *  C function void glUniformMatrix4x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)

     **/
    private static native void nGLUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value, int offset);/*    
        		glUniformMatrix4x3fv((GLint) location, 
            			(GLsizei) count, 
            			(GLboolean) transpose, 
            			(GLfloat *) &value[offset]);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformMatrix4x3fv([int location, 
     * int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x3fv((GLint) location, 
     *                                        (GLsizei) count, 
     *                                        (GLboolean) transpose, 
     *                                        const (GLfloat) *value)
     **/
    public void glUniformMatrix4x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
        checkBuffer(value,12*count,VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {            
            GLES30Pipeline.nGLUniformMatrix4x3fv(location, count, transpose, value, offset);
        } else {
            GLES30Pipeline.nGLUniformMatrix4x3fv(location, count, transpose, value.array(), offset);
        }       
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformMatrix4x3fv([int location, 
     * int count, boolean transpose, java.nio.FloatBuffer value]);
     * 
     *  C function void glUniformMatrix4x3fv((GLint) location, (GLsizei) count, (GLboolean) transpose, const (GLfloat) *value)
     **/
    private static native void nGLUniformMatrix4x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value, int offset);/*    
        		glUniformMatrix4x3fv((GLint) location, 
            			(GLsizei) count, 
            			(GLboolean) transpose, 
            			(GLfloat *) (value + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBlitFramebuffer([int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter]);
     * 
     *  C function void glBlitFramebuffer((GLint) srcX0, (GLint) srcY0, (GLint) srcX1, (GLint) srcY1, (GLint) dstX0, (GLint) dstY0, (GLint) dstX1, (GLint) dstY1, GLbitfield mask, (GLenum) filter)

     **/
    public void glBlitFramebuffer(int srcX0, int srcY0, 
        			 int srcX1, int srcY1, 
        			 int dstX0, int dstY0, 
        			 int dstX1, int dstY1, 
        			 int mask, 
        			 int filter) {
    	
        GLES30Pipeline.nGLBlitFramebuffer(srcX0, srcY0, 
               srcX1, srcY1, 
               dstX0, dstY0, 
               dstX1, dstY1, 
               mask, filter);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBlitFramebuffer([int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter]);
     * 
     *  C function void glBlitFramebuffer((GLint) srcX0, (GLint) srcY0, (GLint) srcX1, (GLint) srcY1, (GLint) dstX0, (GLint) dstY0, (GLint) dstX1, (GLint) dstY1, GLbitfield mask, (GLenum) filter)

     **/
    private static native void nGLBlitFramebuffer(int srcX0, int srcY0, 
        		  int srcX1, int srcY1, 
        		  int dstX0, int dstY0, 
        		  int dstX1, int dstY1, 
        		  int mask, 
        		  int filter);/*
   
        glBlitFramebuffer((GLint) srcX0, (GLint) srcY0, 
            	(GLint) srcX1, (GLint) srcY1, 
            	(GLint) dstX0, (GLint) dstY0, 
            	(GLint) dstX1, (GLint) dstY1, 
            	(GLbitfield) mask, 
            	(GLenum) filter);
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glRenderbufferStorageMultisample([int target, int samples, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageMultisample((GLenum) target, (GLsizei) samples, (GLenum) internalformat, (GLsizei) width, (GLsizei) height)

     **/
    public void glRenderbufferStorageMultisample(int target, 
                                                 int samples, 
                                                 int internalformat, 
                                                 int width, int height) {
        GLES30Pipeline.nGLRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glRenderbufferStorageMultisample(
     * [int target, int samples, int internalformat, int width, int height]);
     * 
     *  C function void glRenderbufferStorageMultisample((GLenum) target, 
     *  (GLsizei) samples, (GLenum) internalformat, (GLsizei) width, (GLsizei) height)

     **/
    private static native void nGLRenderbufferStorageMultisample(int target,
                                                                 int samples,
                                                                 int internalformat,
                                                                 int width,  int height);/*    			
    			glRenderbufferStorageMultisample(   (GLenum) target, 
                (GLsizei) samples, 
                (GLenum) internalformat, 
                (GLsizei) width, 
                (GLsizei) height);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glFramebufferTextureLayer([int target, int attachment, int texture, int level, int layer]);
     * 
     *  C function void glFramebufferTextureLayer((GLenum) target, (GLenum) attachment, (GLuint)  texture, (GLint) level, (GLint) layer)

     **/
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GLES30Pipeline.nGLFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glFramebufferTextureLayer([int target, int attachment, int texture, int level, int layer]);
     * 
     *  C function void glFramebufferTextureLayer((GLenum) target, (GLenum) attachment, (GLuint)  texture, (GLint) level, (GLint) layer)

     **/
    private static native void nGLFramebufferTextureLayer(int target, 
                                                          int attachment,
                                                          int texture, int level, int layer);/*
        glFramebufferTextureLayer((GLenum) target, 
            			(GLenum) attachment, 
            			(GLuint)  texture, 
            			(GLint) level,
            			(GLint) layer);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glMapBufferRange([int target, int offset, int length, int access]);
     * 
     *  C function GLvoid * glMapBufferRange((GLenum) target, (GLintptr) offset, GLsizeiptr length, GLbitfield access)

     **/
    public java.nio.Buffer glMapBufferRange(int target, int offset, int length, int access) {
        return GLES30Pipeline.nGLMapBufferRange(target, offset, length, access);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glMapBufferRange([int target, int offset, int length, int access]);
     * 
     *  C function GLvoid * glMapBufferRange((GLenum) target, (GLintptr) offset, GLsizeiptr length, GLbitfield access)

     **/
    private static native java.nio.Buffer nGLMapBufferRange(int target, int offset, int length, int access);/*
    
            GLvoid * map = (GLvoid *) 0;            
            map = glMapBufferRange((GLenum) target, 
                                    (GLintptr) offset, 
                                    (GLsizeiptr) length, 
                                    (GLbitfield) access);
            
            
            //create buffer
            jobject buf = (jobject)0;
            if (map) {
             buf = env->NewDirectByteBuffer((void *)map, (jlong)length);
            }
            
           //done
           return buf;      
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glFlushMappedBufferRange([int target, int offset, int length]);
     * 
     *  C function void glFlushMappedBufferRange((GLenum) target, (GLintptr) offset, GLsizeiptr length)

     **/
    public void glFlushMappedBufferRange(int target, int offset, int length) {
        GLES30Pipeline.nGLFlushMappedBufferRange(target, offset, length);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glFlushMappedBufferRange([int target, int offset, int length]);
     * 
     *  C function void glFlushMappedBufferRange((GLenum) target, (GLintptr) offset, GLsizeiptr length)

     **/
    private static native void nGLFlushMappedBufferRange(int target, int offset, int length);/*
    	glFlushMappedBufferRange((GLenum) target, (GLintptr) offset, (GLsizeiptr) length);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBindVertexArray([int array]);
     * 
     *  C function void glBindVertexArray((GLuint)  array)

     **/
    public void glBindVertexArray(int array) {
        GLES30Pipeline.nGLBindVertexArray(array);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBindVertexArray([int array]);
     * 
     *  C function void glBindVertexArray((GLuint)  array)

     **/
    private static native void nGLBindVertexArray(int array);/*    
    	    glBindVertexArray((GLuint) array);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glDeleteVertexArrays((GLsizei) n, (const GLuint *) arrays)

     **/
    public void glDeleteVertexArrays(int n, int[] arrays, int offset) {
        checkArray(arrays, offset, n,"arrays");
        GLES30Pipeline.nGLDeleteVertexArrays(n, arrays, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glDeleteVertexArrays((GLsizei) n, (const GLuint *) arrays)

     **/
    private static native void nGLDeleteVertexArrays(int n, int[] arrays, int offset);/*    
    	    glDeleteVertexArrays((GLsizei) n, (const GLuint  *) &arrays[offset]);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glDeleteVertexArrays((GLsizei) n, (const GLuint *) arrays)

     **/
    public void glDeleteVertexArrays(int n, java.nio.IntBuffer arrays) {        
        checkBuffer(arrays, n, ARRAYS);
        int offset = getOffset(arrays);
        // now, the offset...
        if (arrays.isDirect()) {           
            GLES30Pipeline.nGLDeleteVertexArrays(n, arrays, offset);
        } else {
            GLES30Pipeline.nGLDeleteVertexArrays(n, arrays.array(), offset);
        }      
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glDeleteVertexArrays((GLsizei) n, (const GLuint *) arrays)

     **/
    private static native void nGLDeleteVertexArrays(int n, java.nio.IntBuffer arrays, int offset);/*
            glDeleteVertexArrays((GLsizei) n, (const GLuint *) (arrays + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glGenVertexArrays((GLsizei) n, (GLuint *) arrays)

     **/
    public void glGenVertexArrays(int n, int[] arrays, int offset) {
        checkArray(arrays, offset, n, ARRAYS);
        GLES30Pipeline.nGLGenVertexArrays(n, arrays, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenVertexArrays([int n, int[] arrays, int offset]);
     * 
     *  C function void glGenVertexArrays((GLsizei) n, (GLuint *) arrays)

     **/
    private static native void nGLGenVertexArrays(int n, int[] arrays, int offset);/*
            glGenVertexArrays( (GLsizei) n, (GLuint *) &arrays[offset]);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glGenVertexArrays((GLsizei) n, (GLuint *) arrays)

     **/
    public void glGenVertexArrays(int n, java.nio.IntBuffer arrays) {
        
        checkBuffer(arrays, n, ARRAYS); 
        int offset = getOffset(arrays);
       
        if (arrays.isDirect()) {           
            GLES30Pipeline.nGLGenVertexArrays(n, arrays, offset);
        } else {
            GLES30Pipeline.nGLGenVertexArrays(n, arrays.array(), offset);
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenVertexArrays([int n, java.nio.IntBuffer arrays]);
     * 
     *  C function void glGenVertexArrays((GLsizei) n, (GLuint *) arrays)

     **/
    private static native void nGLGenVertexArrays(int n, java.nio.IntBuffer arrays, int offset);/*
    	    glGenVertexArrays((GLsizei) n, (GLuint *) (arrays + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glIsVertexArray([int array]);
     * 
     *  C function (GLboolean) glIsVertexArray((GLuint)  array)

     **/
    public boolean glIsVertexArray(int array) {
       return GLES30Pipeline.nGLIsVertexArray(array);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glIsVertexArray([int array]);
     * 
     *  C function (GLboolean) glIsVertexArray((GLuint)  array)

     **/
    private static native boolean nGLIsVertexArray(int array);/*
          return (jboolean)  glIsVertexArray((GLuint)  array);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetIntegeri_v([int target, int index, int[] data, int offset]);
     * 
     *  C function void glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint) *data)

     **/
    public void glGetIntegeri_v(int target, int index, int[] data, int offset) {
        checkArray(data, offset, 1, DATA);
        GLES30Pipeline.nGLGetIntegeriv(target, index, data, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetIntegeri_v([int target, int index, int[] data, int offset]);
     * 
     *  C function void glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint) *data)
     **/
    private static native void nGLGetIntegeriv(int target, 
	        	 int index, 
	        	 int[] data, int offset);/*
         glGetIntegeri_v((GLenum) target, 
         		  (GLuint)  index, 
         		  (GLint *)(data + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetIntegeri_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint) *data)

     */
    public void glGetIntegeri_v(int target, int index, java.nio.IntBuffer data) {                
        checkBuffer(data, 1, DATA);
        int offset = getOffset(data); 
        // now, the offset...
        if (data.isDirect()) {           
            GLES30Pipeline.nGLGetIntegeriv0(target, index, data, offset);
        } else {
            GLES30Pipeline.nGLGetIntegeriv0(target, index, data.array(), offset);
            }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetIntegeri_v([int target, int index, java.nio.IntBuffer data]);
     * 
     *  C function void glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint) *data)

     **/
    private static native void nGLGetIntegeriv0(int target, 
	    int index, 
	    java.nio.IntBuffer data, int offset);/*    
            glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset));             
    */
    
    private static native void nGLGetIntegeriv0(int target, 
                                                int index, 
                                                int[] data, int offset);/*    
        glGetIntegeri_v((GLenum) target, (GLuint)  index, (GLint *)(data + offset));             
     */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBeginTransformFeedback([int primitiveMode]);
     * 
     *  C function void glBeginTransformFeedback((GLenum) primitiveMode)

     **/
    public void glBeginTransformFeedback(int primitiveMode) {
        GLES30Pipeline.nGLBeginTransformFeedback(primitiveMode);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBeginTransformFeedback([int primitiveMode]);
     * 
     *  C function void glBeginTransformFeedback((GLenum) primitiveMode)

     **/
    private static native void nGLBeginTransformFeedback(int primitiveMode);/*    
    		glBeginTransformFeedback((GLenum) primitiveMode);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glEndTransformFeedback();
     * 
     *  C function void glEndTransformFeedback(void)
     **/
    public void glEndTransformFeedback() {
        GLES30Pipeline.nGLEndTransformFeedback();
    }

    /**
     * <pre>
     * Native method generated from GLES30.glEndTransformFeedback();
     * 
     *  C function void glEndTransformFeedback(void)
     **/
    private static native void nGLEndTransformFeedback();/*
            glEndTransformFeedback();
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBindBufferRange(
     * [int target, int index, int buffer, int offset, int size]);
     * 
     *  C function void glBindBufferRange((GLenum) target, 
     *  (GLuint)  index, (GLuint)  buffer, (GLintptr) offset, GLsizeiptr size)
     **/
    public void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
        GLES30Pipeline.nGLBindBufferRange(target, index, buffer, offset, size);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBindBufferRange([int target, int index, int buffer, int offset, int size]);
     * 
     *  C function void glBindBufferRange((GLenum) target, 
     *  (GLuint)  index, (GLuint)  buffer, (GLintptr) offset, (GLsizeiptr) size)
     **/
    private static native void nGLBindBufferRange(int target, 
	    int index, 
	    int buffer, 
	    int offset, 
	    int size);/*
    	glBindBufferRange((GLenum) target, 
    	(GLuint)  index, 
    	(GLuint)  buffer, 
    	(GLintptr) offset, 
    	(GLsizeiptr) size);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBindBufferBase([int target, int index, int buffer]);
     * 
     *  C function void glBindBufferBase((GLenum) target, (GLuint)  index, (GLuint)  buffer)

     **/
    public void glBindBufferBase(int target, int index, int buffer) {
        GLES30Pipeline.nGLBindBufferBase(target, index, buffer);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBindBufferBase([int target, int index, int buffer]);
     * 
     *  C function void glBindBufferBase((GLenum) target, (GLuint)  index, (GLuint)  buffer)

     **/
    private static native void nGLBindBufferBase(int target, int index, int buffer);/*
          glBindBufferBase((GLenum) target, (GLuint)  index, (GLuint)  buffer);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTransformFeedbackVaryings([int program, String[] varyings, int bufferMode]);
     * 
     *  C function void glTransformFeedbackVaryings((GLuint)  program, (GLsizei) count, const GLchar *varyings, (GLenum) bufferMode)

     **/
    public void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode) {
        if(varyings==null){
            throw new IllegalArgumentException("varyings == null");
        }
        for (int i = 0; i < varyings.length; i++) {
            if(null == varyings[i]){
                throw new IllegalArgumentException("null varyings element [" + i+']');
            }            
        }
        GLES30Pipeline.nGLTransformFeedbackVaryings(program, varyings, varyings.length, bufferMode);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTransformFeedbackVaryings([int program, String[] varyings, int bufferMode]);
     * 
     *  C function void glTransformFeedbackVaryings((GLuint)  program, 
     *  (GLsizei) count, 
     *  const GLchar *varyings, 
     *  (GLenum) bufferMode)
     *  
     **/
    private static native void nGLTransformFeedbackVaryings(int program, 
	        		String[] varyings, 
	        		int count,
	        		int bufferMode);/*
      
       jint i=0;
       const char** arrayStr = NULL;
       //const char* tempStr = NULL;
       
       // get strings from array
       arrayStr = (const char**)calloc(count, sizeof(const char*));
       for (i = 0; i < count; i++) {
            jstring tempStr = (jstring)env->GetObjectArrayElement(varyings, i);        
            arrayStr[i] = env->GetStringUTFChars(tempStr, 0);
        }    
                
       glTransformFeedbackVaryings((GLuint)  program, 
                                   (GLsizei) count, 
                                    arrayStr, 
                                   (GLenum) bufferMode);                                
                                         
     // release strings                           
        for (i = count - 1; i >= 0; i--) {
             if (arrayStr[i]) {
                   jstring tempStr = (jstring)env->GetObjectArrayElement(varyings, i);
                       if (tempStr) {
                           env->ReleaseStringUTFChars(tempStr, arrayStr[i]);
                        }
               }
           }//for
        free(arrayStr);
             
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    public void glGetTransformFeedbackVarying(int program, 
                                              int index, 
                                              int bufsize, 
                                              int[] length,  int lengthOffset, 
                                              int[] size, int sizeOffset, 
                                              int[] type, int typeOffset, 
                                              byte[] name, int nameOffset) {
        checkArray(length, lengthOffset, 1, LENGTH);
        checkArray(size, sizeOffset, 1, "size");
        checkArray(type, typeOffset, 1, "type");
        checkArray(name, nameOffset, 1, "name");
        nGLGetTransformFeedbackVarying(program, 
                index, 
                bufsize, 
                length, lengthOffset, 
                size, sizeOffset, 
                type, typeOffset, 
                name, nameOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, int[] length, int lengthOffset, int[] size, int sizeOffset, int[] type, int typeOffset, byte[] name, int nameOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    private static native void nGLGetTransformFeedbackVarying(int program, 
	    int index, 
	    int bufSize, 
	    int[] length, int lengthOffset, 
	    int[] size, int sizeOffset, 
	    int[] type, int typeOffset, 
	    byte[] name, int nameOffset);/*
	    
	    glGetTransformFeedbackVarying((GLuint)  program, 
	    (GLuint)  index, 
	    (GLsizei) bufSize, 
	    (GLsizei *) (length + lengthOffset),
	    (GLint *)   (size + sizeOffset),
	    (GLenum *)  (type + typeOffset), 
	    (GLchar *)  (name + nameOffset));
	*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    @Deprecated
    public void glGetTransformFeedbackVarying(int program, 
                                              int index, 
                                              int bufsize, 
                                              java.nio.IntBuffer length, 
                                              java.nio.IntBuffer size, 
                                              java.nio.IntBuffer type, 
                                              byte name) {
        
        
       // GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, bufsize, length, size, type, name);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int bufsize, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, byte name]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, 
     *                                                 (GLuint)  index, 
     *                                                 (GLsizei) bufSize, 
     *                                                 (GLsizei) *length, 
     *                                                 (GLint) *size, 
     *                                                 (GLenum) *type, 
     *                                                 GLchar *name)
     * @deprecated use {@link #glGetTransformFeedbackVarying(int, int, java.nio.IntBuffer, java.nio.IntBuffer)} or
     * {@link #glGetTransformFeedbackVarying(int, int, int[], int, int[], int)}
     *                                                 
     * @param program
     * @param index
     * @param bufsize
     * @param length
     * @param lengthOffset
     * @param size
     * @param sizeOffset
     * @param type
     * @param typeOffset
     * @param name this parameter is useless, as is not enough to carry back a String
     */
//    @Deprecated
//    private static native String nGLGetTransformFeedbackVarying(int program, 
//	    int index, 
//	    int bufsize, 
//	    java.nio.IntBuffer length, int lengthOffset,
//	    java.nio.IntBuffer size,   int sizeOffset,
//	    java.nio.IntBuffer type,   int typeOffset,
//	    byte name);/*
//	    // DEPRECATED
//	*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    public String glGetTransformFeedbackVarying(int program, int index, 
                                                int[] size, int sizeOffset, 
                                                int[] type, int typeOffset) {
        checkArray(size, sizeOffset, 1, "size");
        checkArray(type, typeOffset, 1, "type");
        return nGLGetTransformFeedbackVarying(program, 
                index, 
                size, sizeOffset, type, typeOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, int[] size, int sizeOffset, int[] type, int typeOffset]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    private static native String nGLGetTransformFeedbackVarying(int program, 
	    int index, 
	    int[] size, int sizeOffset, 
	    int[] type, int typeOffset);/*	   
            //hold
             jstring result = (jstring) 0 ;
             GLint len = 0;
             GLint lenRet = 0;
             
             glGetProgramiv((GLuint)program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH, &len);
                if (!len) {
                        return env->NewStringUTF("");
                 }
               len = len +1;   
               
              char* buf = (char *) calloc(len, sizeof(char));  
                          
              glGetTransformFeedbackVarying(
                    (GLuint)program,
                    (GLuint)index,
                    (GLsizei)len,
                     &lenRet,
                    (GLint *)  (size + sizeOffset),
                    (GLenum *) (type + typeOffset),
                    (char *) buf );
               
              //TODO - check lenRet value against len
                       
              result = env->NewStringUTF(buf);
              
              if (buf) { 
                  free(buf); 
               }
               
                if (result == 0) {
                    result = env->NewStringUTF("");
                }
                
            return result;
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    public String glGetTransformFeedbackVarying(int program,
	    int index, 
	    java.nio.IntBuffer size, 
	    java.nio.IntBuffer type) {
        
        checkBuffer(type, 1, "type");
        checkBuffer(size, 1, "size");
        
        int sizeOffset = getOffset(size);
        int typeOffset = getOffset(type);
        
        // now, the offset...
        if (size.isDirect() && type.isDirect()) {            
            return GLES30Pipeline.nGLGetTransformFeedbackVarying(program, 
                    index, 
                    size, sizeOffset, 
                    type, typeOffset);
        } else {  
            if(size.hasArray() && type.hasArray()){
            return GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, 
                    size.array(), sizeOffset, 
                    type.array(), typeOffset);
            }else{
                throw new IllegalArgumentException(INVALID_BUFFER 
                        + ". size: " + size + ", type: " + type);
            }
         }      
      
       //GLES30Pipeline.nGLGetTransformFeedbackVarying(program, index, size, sizeOffset, type, typeOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetTransformFeedbackVarying([int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type]);
     * 
     *  C function void glGetTransformFeedbackVarying((GLuint)  program, (GLuint)  index, (GLsizei) bufSize, (GLsizei) *length, (GLint) *size, (GLenum) *type, GLchar *name)

     **/
    private static native String nGLGetTransformFeedbackVarying(int program, 
	    int index, 
	    java.nio.IntBuffer size, int sizeOffset,
	    java.nio.IntBuffer type, int typeOffset);/*
	    // name is useless
            //hold
             jstring result = 0;
             GLint len = 0;
             GLint lenRet = 0;
             
             glGetProgramiv((GLuint)program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH, &len);
                if (!len) {
                        return env->NewStringUTF("");
                 }
               len = len +1;   
              char* buf = (char*) calloc(len, sizeof(char));              
              glGetTransformFeedbackVarying(
                    (GLuint)program,
                    (GLuint)index,
                    (GLsizei)len,
                     &lenRet,
                     (GLint *)  (size + sizeOffset),
                     (GLenum *) (type + typeOffset),
                     (char *) buf );
               
              //TODO - check lenRet value against len                       
              result = env->NewStringUTF(buf);              
              if (buf) free(buf); 
               
               if (result == 0) {
                    result = env->NewStringUTF("");
                }
                
            return result;	    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribIPointerBounds([int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexAttribIPointer((GLuint)  index, (GLint) size, (GLenum) type, (GLsizei) stride, const GLvoid *pointer)

     **/
    public void glVertexAttribIPointerBounds(int index, 
	    int size, 
	    int type, 
	    int stride, 
	    java.nio.Buffer pointer, int remaining) {	
        checkBuffer(pointer,1,"pointer");
        
        // now, the offset...
        if (pointer.isDirect()) { 
            int offset = getOffset(pointer);
            nGLVertexAttribIPointerBounds(index, size, type, stride, pointer, offset);
        } else {
            if(pointer instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)pointer;
                int offset = getOffset(bb);
                byte[] array = bb.array();
                nGLVertexAttribIPointerBounds(index, size, type, stride, array, offset);                
            }else if(pointer instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)pointer;
                int offset = getOffset(bb);
                short[] array = bb.array();
                nGLVertexAttribIPointerBounds(index, size, type, stride, array, offset);               
            }else if(pointer instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)pointer;
                int offset = getOffset(bb);
                int[] array = bb.array();
                nGLVertexAttribIPointerBounds(index, size, type, stride, array, offset);               
            }else if(pointer instanceof FloatBuffer){
                FloatBuffer bb = (FloatBuffer)pointer;
                int offset = getOffset(bb);
                float[] array = bb.array();
                nGLVertexAttribIPointerBounds(index, size, type, stride, array, offset);
                
            }else 
            throw new RuntimeException(INVALID_BUFFER + pointer);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribIPointerBounds(
     * [int index, int size, int type, int stride, java.nio.Buffer pointer, int remaining]);
     * 
     *  C function void glVertexAttribIPointer((GLuint)  index,
     *   (GLint) size, (GLenum) type, (GLsizei) stride, const GLvoid *pointer)
     **/
    private static native void nGLVertexAttribIPointerBounds(int index, 
	    int size, 
	    int type, 
	    int stride, 
	    java.nio.Buffer pointer, int offset);/*	    
	    glVertexAttribIPointer((GLuint)  index, 
	    (GLint) size, 
	    (GLenum) type, 
	    (GLsizei) stride, 
	    (const GLvoid *)(pointer + offset));	    
*/
    
    private static native void nGLVertexAttribIPointerBounds(int index, 
                                                             int size, 
                                                             int type, 
                                                             int stride, 
                                                             byte[] pointer, int offset);/*   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        
*/
    private static native void nGLVertexAttribIPointerBounds(int index, 
                                                             int size, 
                                                             int type, 
                                                             int stride, 
                                                             short[] pointer, int offset);/*   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        
*/
    
    private static native void nGLVertexAttribIPointerBounds(int index, 
                                                             int size, 
                                                             int type, 
                                                             int stride, 
                                                             int[] pointer, int offset);/*   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        
*/

    private static native void nGLVertexAttribIPointerBounds(int index, 
                                                             int size, 
                                                             int type, 
                                                             int stride, 
                                                             float[] pointer, int offset);/*   
            glVertexAttribIPointer((GLuint)  index, 
                                   (GLint) size, 
                                   (GLenum) type, 
                                   (GLsizei) stride, 
                                   (const GLvoid *)(pointer + offset));        
*/
    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribIPointer(
     * [int index, int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexAttribIPointer((GLuint)  index, 
     *  (GLint) size, (GLenum) type, (GLsizei) stride, (GLsizei) offset)
     **/
    public void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
        GLES30Pipeline.nGLVertexAttribIPointer(index, size, type, stride, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribIPointer(
     * [int index, int size, int type, int stride, int offset]);
     * 
     *  C function void glVertexAttribIPointer((GLuint)  index, 
     *  (GLint) size, (GLenum) type, (GLsizei) stride, (GLsizei) offset)
     **/
    private static native void nGLVertexAttribIPointer(int index, 
	    int size, 
	    int type, 
	    int stride, 
	    int offset);/*	    
	    glVertexAttribIPointer((GLuint)  index, 
	    			    (GLint) size, 
	    			    (GLenum) type, 
	    			    (GLsizei) stride, 
	    			     reinterpret_cast<GLvoid *>(offset) //(GLsizei) offset
	    			     );
	    
     */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetVertexAttribIiv(
     * [int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint) *params)
     **/
    public void glGetVertexAttribIiv(int index, int pname, int[] params, int offset) {
        int needed = pname == android.opengl.GLES30.GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        GLES30Pipeline.nGLGetVertexAttribIiv(index, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetVertexAttribIiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetVertexAttribIiv(int index, int pname, int[] params, int offset);/*
    		 glGetVertexAttribIiv((GLuint)  index, 
    		 		              (GLenum) pname, 
    		                      (GLint *)(params+offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetVertexAttribIiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint) *params)

     **/
    public void glGetVertexAttribIiv(int index, int pname, java.nio.IntBuffer params) {
        int needed = pname == android.opengl.GLES30.GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {            
            GLES30Pipeline.nGLGetVertexAttribIiv(index, pname, params, offset);
        } else {
            int[] array = params.array();            
            GLES30Pipeline.nGLGetVertexAttribIiv(index, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetVertexAttribIiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetVertexAttribIiv(int index,
                                                     int pname,
                                                     java.nio.IntBuffer params,
                                                     int offset);/*	    
	    glGetVertexAttribIiv((GLuint)  index, (GLenum) pname, (GLint *)(params + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *) params)

     **/
    public void glGetVertexAttribIuiv(int index, int pname, int[] params, int offset) {
        int needed = pname == android.opengl.GLES30.GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;
        checkArray(params, offset, needed, PARAMS);
        nGLGetVertexAttribIuiv(index, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, int[] params, int offset]);
     * 
     *  C function void glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *) params)

     **/
    private static native void nGLGetVertexAttribIuiv(int index, int pname, int[] params, int offset);/*
          glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint  *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *) params)

     **/
    public void glGetVertexAttribIuiv(int index,
                                      int pname,
                                      java.nio.IntBuffer params) {
        int needed = pname == android.opengl.GLES30.GL_CURRENT_VERTEX_ATTRIB ? 4 : 1;
        checkBuffer(params, needed, PARAMS);
        int offset = getOffset(params);
        // now, the offset...
        if (params.isDirect()) {            
            GLES30Pipeline.nGLGetVertexAttribIuiv(index, pname, params, offset);
        } else {
            int[] array = params.array();            
            GLES30Pipeline.nGLGetVertexAttribIuiv(index, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetVertexAttribIuiv([int index, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *) params)

     **/
    private static native void
            nGLGetVertexAttribIuiv(int index,
                                   int pname,
                                   java.nio.IntBuffer params,
                                   int offset);/*
	   glGetVertexAttribIuiv((GLuint)  index, (GLenum) pname, (GLuint *)(params + offset)); 
      */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4i([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4i((GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w)

     **/
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GLES30Pipeline.nGLVertexAttribI4i(index, x, y, z, w);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4i([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4i((GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w)

     **/
    private static native void nGLVertexAttribI4i(int index, int x, int y, int z, int w);/*
       glVertexAttribI4i((GLuint)  index, (GLint) x, (GLint) y, (GLint) z, (GLint) w);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4ui([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4ui((GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w)

     **/
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GLES30Pipeline.nGLVertexAttribI4ui(index, x, y, z, w);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4ui([int index, int x, int y, int z, int w]);
     * 
     *  C function void glVertexAttribI4ui((GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w)

     **/
    private static native void nGLVertexAttribI4ui(int index, int x, int y, int z, int w);/*
       glVertexAttribI4ui((GLuint)  index, (GLuint)  x, (GLuint)  y, (GLuint)  z, (GLuint)  w);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4iv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4iv((GLuint)  index, const (GLint) *v)

     **/
    public void glVertexAttribI4iv(int index, int[] v, int offset) {
        checkArray(v, offset, 4, VALUES);
        GLES30Pipeline.nGLVertexAttribI4iv(index, v, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4iv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4iv((GLuint)  index, const (GLint) *v)

     **/
    private static native void nGLVertexAttribI4iv(int index, int[] v, int offset);/*
     glVertexAttribI4iv((GLuint)  index, (const GLint *)(v + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4iv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4iv((GLuint)  index, const (GLint) *v)
     **/
    public void glVertexAttribI4iv(int index, java.nio.IntBuffer values) {
        checkBuffer(values, 4, VALUES);
        int offset = getOffset(values);
        // now, the offset...
        if (values.isDirect()) {
            GLES30Pipeline.nGLVertexAttribI4iv(index, values, offset);
        } else {
            int[] array = values.array();
            GLES30Pipeline.nGLVertexAttribI4iv(index, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4iv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4iv((GLuint)  index, const (GLint) *v)
     **/
    private static native void nGLVertexAttribI4iv(int index, java.nio.IntBuffer v, int offset);/*
          glVertexAttribI4iv((GLuint)  index, (const GLint *)(v + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4uiv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4uiv((GLuint)  index, (const GLuint *) v)
     **/
    public void glVertexAttribI4uiv(int index, int[] v, int offset) {
        checkArray(v, offset, 4, VALUES);
        GLES30Pipeline.nGLVertexAttribI4uiv(index, v, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4uiv([int index, int[] v, int offset]);
     * 
     *  C function void glVertexAttribI4uiv((GLuint)  index, (const GLuint *) v)
     **/
    private static native void nGLVertexAttribI4uiv(int index, int[] v, int offset);/*
    		glVertexAttribI4uiv((GLuint)  index, (const GLuint *)(v + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribI4uiv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4uiv((GLuint)  index, (const GLuint *) v)
     **/
    public void glVertexAttribI4uiv(int index, java.nio.IntBuffer values) {
        checkBuffer(values, 4, VALUES);
        int offset = getOffset(values);
        // now, the offset...
        if (values.isDirect()) {
            GLES30Pipeline.nGLVertexAttribI4uiv(index, values, offset);
        } else {
            int[] array = values.array();
            GLES30Pipeline.nGLVertexAttribI4uiv(index, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribI4uiv([int index, java.nio.IntBuffer v]);
     * 
     *  C function void glVertexAttribI4uiv((GLuint)  index, (const GLuint *) v)
     **/
    private static native void nGLVertexAttribI4uiv(int index, java.nio.IntBuffer v, int offset);/*
    		glVertexAttribI4uiv((GLuint)  index, (const GLuint *) (v + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetUniformuiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformuiv((GLuint)  program, (GLint) location, (GLuint *) params)
     **/
    public void glGetUniformuiv(int program, int location, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES30Pipeline.nGLGetUniformuiv(program, location, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetUniformuiv([int program, int location, int[] params, int offset]);
     * 
     *  C function void glGetUniformuiv((GLuint)  program, (GLint) location, (GLuint *) params)
     **/
    private static native void nGLGetUniformuiv(int program, int location, int[] params, int offset);/*
    		glGetUniformuiv((GLuint)  program, 
    		                (GLint) location,
    		                (GLuint *)(params + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetUniformuiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformuiv((GLuint)  program, (GLint) location, (GLuint *) params)
     **/
    public void glGetUniformuiv(int program,
                                int location,
                                java.nio.IntBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
       
        if (params.isDirect()) {
            GLES30Pipeline.nGLGetUniformuiv(program, location, params, offset);
        } else {
            int[] array = params.array();
            GLES30Pipeline.nGLGetUniformuiv(program, location, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetUniformuiv([int program, int location, java.nio.IntBuffer params]);
     * 
     *  C function void glGetUniformuiv((GLuint)  program, (GLint) location, (GLuint *) params)
     **/
    private static native void nGLGetUniformuiv(int program, 
	        	int location, 
	        	java.nio.IntBuffer params, int offset);/*	    	
	    	glGetUniformuiv((GLuint)  program, 
                (GLint) location, 
                (GLuint *)(params + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetFragDataLocation([int program, String name]);
     * 
     *  C function (GLint) glGetFragDataLocation((GLuint)  program, const GLchar *name)
     **/
    public int glGetFragDataLocation(int program, String name) {
        if(null==name){
            throw new IllegalArgumentException("name == null");
        }
       return GLES30Pipeline.nGLGetFragDataLocation(program, name);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetFragDataLocation([int program, String name]);
     * 
     *  C function (GLint) glGetFragDataLocation((GLuint)  program, const GLchar *name)
     **/
    private static native int nGLGetFragDataLocation(int program, String name);/*
    	return (jint) glGetFragDataLocation((GLuint)  program, (const GLchar *)name);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform1ui([int location, int v0]);
     * 
     *  C function void glUniform1ui((GLint) location, (GLuint)  v0)
     **/
    public void glUniform1ui(int location, int v0) {
        GLES30Pipeline.nGLUniform1ui(location, v0);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform1ui([int location, int v0]);
     * 
     *  C function void glUniform1ui((GLint) location, (GLuint)  v0)
     **/
    private static native void nGLUniform1ui(int location, int v0);/*
    	   glUniform1ui((GLint) location, (GLuint)  v0);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform2ui([int location, int v0, int v1]);
     * 
     *  C function void glUniform2ui((GLint) location, (GLuint)  v0, (GLuint)  v1)
     **/
    public void glUniform2ui(int location, int v0, int v1) {
        GLES30Pipeline.nGLUniform2ui(location, v0, v1);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform2ui([int location, int v0, int v1]);
     * 
     *  C function void glUniform2ui((GLint) location, (GLuint)  v0, (GLuint)  v1)
     **/
    private static native void nGLUniform2ui(int location, int v0, int v1);/*
    		glUniform2ui((GLint) location, (GLuint)  v0, (GLuint)  v1);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform3ui([int location, int v0, int v1, int v2]);
     * 
     *  C function void glUniform3ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2)
     **/
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GLES30Pipeline.nGLUniform3ui(location, v0, v1, v2);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform3ui([int location, int v0, int v1, int v2]);
     * 
     *  C function void glUniform3ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2)
     **/
    private static native void nGLUniform3ui(int location, int v0, int v1, int v2);/*
        glUniform3ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform4ui([int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glUniform4ui((GLint) location, 
     *                               (GLuint)  v0, 
     *                               (GLuint)  v1, 
     *                               (GLuint)  v2, 
     *                               (GLuint)  v3)
     **/
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GLES30Pipeline.nGLUniform4ui(location, v0, v1, v2, v3);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform4ui([int location, int v0, int v1, int v2, int v3]);
     * 
     *  C function void glUniform4ui((GLint) location, 
     *                               (GLuint)  v0, 
     *                               (GLuint)  v1, 
     *                               (GLuint)  v2, 
     *                               (GLuint)  v3);
     **/
    private static native void nGLUniform4ui(int location, int v0, int v1, int v2, int v3);/*
    	glUniform4ui((GLint) location, (GLuint)  v0, (GLuint)  v1, (GLuint)  v2, (GLuint)  v3);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform1uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform1uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    public void glUniform1uiv(int location, int count, int[] value, int offset) {
        checkArray(value, offset, count, VALUES);
        GLES30Pipeline.nGLUniform1uiv(location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform1uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform1uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform1uiv(int location, 
	              int count, 
	              int[] value, int offset);/*
    		glUniform1uiv((GLint) location, 
    			          (GLsizei) count, 
    			          (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform1uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform1uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    public void glUniform1uiv(int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, count, VALUES);
        int offset = getOffset(value);       
        if (value.isDirect()) {
            GLES30Pipeline.nGLUniform1uiv(location, count, value, offset);
        } else {
            int[] array = value.array();
            GLES30Pipeline.nGLUniform1uiv(location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform1uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform1uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform1uiv(int location, 
	              int count, 
	              java.nio.IntBuffer value, int offset);/*
        glUniform1uiv((GLint) location, 
        	      (GLsizei) count, 
        	      ( GLuint *) (value+offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform2uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform2uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    public void glUniform2uiv(int location, int count, int[] value, int offset) {
        checkArray(value, offset, 2*count, VALUES);
        GLES30Pipeline.nGLUniform2uiv(location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform2uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform2uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform2uiv(int location, int count, int[] value, int offset);/*
    		glUniform2uiv((GLint) location, 
    			          (GLsizei) count, 
    			          (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform2uiv(
     * [int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform2uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    public void  glUniform2uiv(int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, 2*count, VALUES);
        int offset = getOffset(value);       
        if (value.isDirect()) {
            GLES30Pipeline.nGLUniform2uiv(location, count, value, offset);
        } else {
            int[] array = value.array();
            GLES30Pipeline.nGLUniform2uiv(location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform2uiv(
     * [int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform2uiv((GLint) location, 
     *                                (GLsizei) count, 
     *                                (const GLuint *) value);
     **/
    private static native void nGLUniform2uiv(int location, 
                                              int count, 
                                              java.nio.IntBuffer value, int offset);/*
    		glUniform2uiv((GLint) location, 
    			      (GLsizei) count, 
    			      (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform3uiv(
     * [int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform3uiv((GLint) location, 
     *                                (GLsizei) count, 
     *                                (const GLuint *) value);
     **/
    public void glUniform3uiv(int location, int count, int[] value, int offset) {
        checkArray(value, offset, 3*count, VALUES);
        nGLUniform3uiv(location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform3uiv(
     * [int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform3uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform3uiv(int location, int count, int[] value, int offset);/*
    		glUniform3uiv((GLint) location, 
    		              (GLsizei) count, 
    		              (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform3uiv(
     * [int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform3uiv((GLint) location,
     *                                (GLsizei) count, 
     *                                (const GLuint *) value)
     **/
    public void glUniform3uiv(int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, 3*count, VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {
            nGLUniform3uiv(location, count, value, offset);
        } else {
            int[] array = value.array();
            nGLUniform3uiv(location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform3uiv(
     * [int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform3uiv((GLint) location, 
     *                                (GLsizei) count, 
     *                                (const GLuint *) value)
     **/
    private static native void nGLUniform3uiv(int location, int count, java.nio.IntBuffer value, int offset);/*
	   glUniform3uiv((GLint) location, 
	              (GLsizei) count,
	              (GLuint *) (value + offset));
  */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform4uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform4uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    public void glUniform4uiv(int location, int count, int[] value, int offset) {
        checkArray(value, offset, 4*count, VALUES);
        nGLUniform4uiv(location, count, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform4uiv([int location, int count, int[] value, int offset]);
     * 
     *  C function void glUniform4uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform4uiv(int location, int count, int[] value, int offset);/*
    	glUniform4uiv((GLint) location, (GLsizei) count, (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniform4uiv([int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform4uiv((GLint) location, (GLsizei) count, (const GLuint *) value)

     **/
    public void glUniform4uiv(int location, int count, java.nio.IntBuffer value) {
        checkBuffer(value, 4*count, VALUES);
        int offset = getOffset(value);
        
        if (value.isDirect()) {
            GLES30Pipeline.nGLUniform4uiv(location, count, value, offset);
        } else {
            int[] array = value.array();
            GLES30Pipeline.nGLUniform4uiv(location, count, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniform4uiv(
     * [int location, int count, java.nio.IntBuffer value]);
     * 
     *  C function void glUniform4uiv((GLint) location, (GLsizei) count, (const GLuint *) value)
     **/
    private static native void nGLUniform4uiv(int location, 
	        int count, 
	        java.nio.IntBuffer value, int offset);/*
    		glUniform4uiv((GLint) location, 
    		              (GLsizei) count, 
    		              (GLuint *) (value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferiv(
     * [int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferiv((GLenum) buffer, (GLint) drawbuffer, const (GLint) *value)
     **/
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value, int offset) {
        checkArray(value, offset, 4, VALUES);
        GLES30Pipeline.nGLClearBufferiv(buffer, drawbuffer, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferiv(
     * [int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferiv((GLenum) buffer, (GLint) drawbuffer, const (GLint) *value)
     **/
    private static native void nGLClearBufferiv(int buffer, int drawbuffer, int[] value, int offset);/*
    		glClearBufferiv((GLenum) buffer, 
                (GLint) drawbuffer, 
                (GLint *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferiv(
     * [int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferiv((GLenum) buffer, (GLint) drawbuffer, const (GLint) *value)
     **/
    public void glClearBufferiv(int buffer, int drawbuffer, java.nio.IntBuffer value) {
        int needed = buffer == android.opengl.GLES30.GL_COLOR ? 4 : 1;
        checkBuffer(value, needed, VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {
            GLES30Pipeline.nGLClearBufferiv(buffer, drawbuffer, value, offset);
        } else {
            int[] array = value.array();
            GLES30Pipeline.nGLClearBufferiv(buffer, drawbuffer, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferiv((GLenum) buffer, (GLint) drawbuffer, const (GLint) *value)
     **/
    private static native void nGLClearBufferiv(int buffer, int drawbuffer, java.nio.IntBuffer value, int offset);/*
    	glClearBufferiv((GLenum) buffer, 
                        (GLint) drawbuffer, 
                        (GLint *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferuiv((GLenum) buffer, (GLint) drawbuffer, (const GLuint *) value)
     **/
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value, int offset) {
        int needed = buffer == android.opengl.GLES30.GL_COLOR ? 4 : 1;
        checkArray(value, offset, needed, VALUES);
        GLES30Pipeline.nGLClearBufferuiv(buffer, drawbuffer, value, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, int[] value, int offset]);
     * 
     *  C function void glClearBufferuiv((GLenum) buffer, (GLint) drawbuffer, (const GLuint *) value)
     **/
    private static native void nGLClearBufferuiv(int buffer, int drawbuffer, int[] value, int offset);/*
    	glClearBufferuiv((GLenum) buffer,
    	                 (GLint) drawbuffer,
    	                 (GLuint  *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferuiv((GLenum) buffer, (GLint) drawbuffer, (const GLuint *) value)
     **/
    public void glClearBufferuiv(int buffer,
                                 int drawbuffer,
                                 java.nio.IntBuffer value) {
        int needed = buffer == android.opengl.GLES30.GL_COLOR ? 4 : 1;
        checkBuffer(value, needed, VALUES);
        int offset = getOffset(value);

        if (value.isDirect()) {
            GLES30Pipeline.nGLClearBufferuiv(buffer, drawbuffer, value, offset);
        } else {
            int[] array = value.array();
            GLES30Pipeline.nGLClearBufferuiv(buffer, drawbuffer, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferuiv([int buffer, int drawbuffer, java.nio.IntBuffer value]);
     * 
     *  C function void glClearBufferuiv((GLenum) buffer, (GLint) drawbuffer, (const GLuint *) value)
     **/
    private static native void nGLClearBufferuiv(int buffer, int drawbuffer, java.nio.IntBuffer value, int offset);/*
    		glClearBufferuiv((GLenum) buffer, 
    		         (GLint) drawbuffer,
    		         (GLuint  *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, float[] value, int offset]);
     * 
     *  C function void glClearBufferfv((GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value)
     **/
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value, int offset) { 
        int needed = buffer == android.opengl.GLES30.GL_COLOR ? 4 : 1;
        checkArray(value, offset, needed, VALUES);
        GLES30Pipeline.nGLClearBufferfv(buffer, drawbuffer, value, offset);
    }
    
   

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, float[] value, int offset]);
     * 
     *  C function void glClearBufferfv((GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value)
     **/
    private static native void nGLClearBufferfv(int buffer, int drawbuffer, float[] value, int offset);/*
    			glClearBufferfv((GLenum) buffer, 
        	        (GLint) drawbuffer, 
        	        (GLfloat *)(value + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, java.nio.FloatBuffer value]);
     * 
     *  C function void glClearBufferfv((GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value)
     **/
    public void glClearBufferfv(int buffer, int drawbuffer, java.nio.FloatBuffer value) {
        int needed = buffer == android.opengl.GLES30.GL_COLOR ? 4 : 1;
        checkBuffer(value, needed,VALUES);
        int offset = getOffset(value);
        if (value.isDirect()) {           
            GLES30Pipeline.nGLClearBufferfv(buffer, drawbuffer, value, offset);
        } else {
            float[] array = value.array();
            GLES30Pipeline.nGLClearBufferfv(buffer, drawbuffer, array, offset);
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferfv([int buffer, int drawbuffer, java.nio.FloatBuffer value]);
     * 
     *  C function void glClearBufferfv((GLenum) buffer, (GLint) drawbuffer, const (GLfloat) *value)
     **/
    private static native void nGLClearBufferfv(int buffer, int drawbuffer, java.nio.FloatBuffer value, int offset);/*
    	glClearBufferfv((GLenum) buffer, 
        	        (GLint) drawbuffer, 
        	        (GLfloat *)(value+offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClearBufferfi(
     * [int buffer, int drawbuffer, float depth, int stencil]);
     * 
     *  C function void glClearBufferfi((GLenum) buffer,
     *                                  (GLint) drawbuffer, 
     *                                  (GLfloat) depth, 
     *                                  (GLint) stencil)
     **/
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GLES30Pipeline.nGLClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClearBufferfi(
     * [int buffer, int drawbuffer, float depth, int stencil]);
     * 
     *  C function void glClearBufferfi((GLenum) buffer, 
     *                                  (GLint) drawbuffer, 
     *                                  (GLfloat) depth, 
     *                                  (GLint) stencil)
     **/
    private static native void nGLClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);/*    
    		glClearBufferfi((GLenum) buffer, 
    		                (GLint) drawbuffer,
    		                (GLfloat) depth,
    		                (GLint) stencil);
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetStringi([int name, int index]);
     * 
     *  C function const GLubyte * glGetStringi((GLenum) name, (GLuint)  index)
     **/
    public String glGetStringi(int name, int index) {
       return GLES30Pipeline.nGLGetStringi(name, index);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetStringi([int name, int index]);
     * 
     *  C function const GLubyte * glGetStringi((GLenum) name, (GLuint)  index)

     **/
    private static native String nGLGetStringi(int name, int index);/*    
        const char * res = (const char *)glGetStringi((GLenum) name, (GLuint)  index);               
        // support null jstring
        return (res == NULL ? ((jstring) 0) :(env->NewStringUTF(res)));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glCopyBufferSubData([int readTarget, int writeTarget, int readOffset, int writeOffset, int size]);
     * 
     *  C function void glCopyBufferSubData((GLenum) readTarget, 
     *                                      (GLenum) writeTarget, 
     *                                      (GLintptr) readOffset, 
     *                                      (GLintptr) writeOffset, 
     *                                      GLsizeiptr size);
     **/
    public void glCopyBufferSubData(int readTarget, int writeTarget, 
                                    int readOffset, int writeOffset, 
                                    int size) {
        nGLCopyBufferSubData(readTarget, writeTarget, 
                             readOffset, writeOffset, size);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glCopyBufferSubData([int readTarget, 
     * int writeTarget, int readOffset, int writeOffset, int size]);
     * 
     *  C function void glCopyBufferSubData((GLenum) readTarget, 
     *                                      (GLenum) writeTarget, 
     *                                      (GLintptr) readOffset, 
     *                                      (GLintptr) writeOffset, 
     *                                      GLsizeiptr size)     **/
    private static native void nGLCopyBufferSubData(int readTarget, 
	        	    int writeTarget, 
	        	    int readOffset, 
	        	    int writeOffset, 
	        	    int size);/*	        	    
	   glCopyBufferSubData((GLenum) readTarget, 
	   			(GLenum) writeTarget, 
	   			(GLintptr) readOffset, 
	   			(GLintptr) writeOffset, 
	   			(GLsizeiptr) size);
   */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetUniformIndices([int program, 
     *                                                            String[] uniformNames, 
     *                                                            int[] uniformIndices, 
     *                                                            int uniformIndicesOffset]);
     * 
     *  C function void glGetUniformIndices((GLuint)  program, 
     *                                      (GLsizei) uniformCount, 
     *                                      const GLchar *const *uniformNames, 
     *                                      (GLuint *) uniformIndices)

     **/
    public void glGetUniformIndices(int program, 
                                    String[] uniformNames, 
                                    int[] uniformIndices, 
                                    int uniformIndicesOffset) {
        
        
        if(null == uniformNames){
            throw new IllegalArgumentException("uniformNames == null");
        }
        for (int i = 0; i < uniformNames.length; i++) {
            if(null == uniformNames[i]){
                throw new IllegalArgumentException("null uniformNames element ["+i+"]");
            }
        }   
        int uniformCount = uniformNames.length;
        checkArray(uniformIndices, uniformIndicesOffset, 
                   uniformCount, UNIFORM_INDICES);
        
        nGLGetUniformIndices(program, 
                             uniformCount,
                             uniformNames, 
                             uniformIndices, 
                             uniformIndicesOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetUniformIndices([int program, 
     * String[] uniformNames, int[] uniformIndices, int uniformIndicesOffset]);
     * 
     *  C function void glGetUniformIndices((GLuint)  program, 
     *                                      (GLsizei) uniformCount, 
     *                                      const GLchar *const *uniformNames, 
     *                                      (GLuint *) uniformIndices)

     **/
    private static native void nGLGetUniformIndices(int program,
                                                    int uniformCount,
                                                    String[] uniformNames,
                                                    int[] uniformIndices,
                                                    int uniformIndicesOffset);/*
	    	jint count = uniformCount;
	    	jint i = 0;
	    	const char** names = (const char**) calloc(count, sizeof(const char*));
    		// get names 
    		for (i = 0; i < count; i++) {
        		jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);        
	    		names[i] = env->GetStringUTFChars(name, 0);
	    	}  
	    	//GL call		  
    		glGetUniformIndices(program, count, names, 
    		  		    (GLuint*)(uniformIndices + uniformIndicesOffset));
    		  
    		//release uniformNames strings
    		for (i = count - 1; i >= 0; i--) {
    		   if(names[i]) {
    		      jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);
    		      if (name) {
    		           env->ReleaseStringUTFChars(name, names[i]);
    		       }
    		     }
    		  }
    		  free(names);    
	 */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetUniformIndices(
     * [int program, String[] uniformNames, java.nio.IntBuffer uniformIndices]);
     * 
     *  C function void glGetUniformIndices((GLuint)  program, 
     *                                      (GLsizei) uniformCount, 
     *                                      const GLchar *const *uniformNames, 
     *                                      (GLuint *) uniformIndices)
     **/
    public void glGetUniformIndices(int program, 
                                    String[] uniformNames, 
                                    java.nio.IntBuffer uniformIndices) {
               
        if(null == uniformNames){
            throw new IllegalArgumentException("uniformNames == null");
        }
        for (int i = 0; i < uniformNames.length; i++) {
            if(null == uniformNames[i]){
                throw new IllegalArgumentException("null uniformNames element["+i+"]");
            }
        }  
        
        int uniformCount = uniformNames.length;
        checkBuffer(uniformIndices, uniformCount, UNIFORM_INDICES); 
        
        int offset = getOffset(uniformIndices);
        if (uniformIndices.isDirect()) {            
            nGLGetUniformIndices(program,uniformCount, uniformNames, uniformIndices, offset);
        } else {           
            int[] array = uniformIndices.array();           
            nGLGetUniformIndices(program, uniformCount, uniformNames, array, offset);
        }
      }

    /**
     * <pre>
     * Native method generated from GLES30.glGetUniformIndices([int program, String[] uniformNames, java.nio.IntBuffer uniformIndices]);
     * 
     *  C function void glGetUniformIndices((GLuint)  program, (GLsizei) uniformCount, const GLchar *const *uniformNames, (GLuint *) uniformIndices)

     **/
    private static native void nGLGetUniformIndices(int program, 
                                                    int uniformCount,
                                                    String[] uniformNames, 
                                                    java.nio.IntBuffer uniformIndices, 
                                                    int uniformIndicesOffset);/*
    jint count = uniformCount;
    jint i = 0;
    const char** names = (const char**) calloc(count, sizeof(const char*));
    // get names 
    for (i = 0; i < count; i++) {
            jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);        
            names[i] = env->GetStringUTFChars(name, 0);
    }  
    //GL call                 
    glGetUniformIndices(program, count, names, 
                        (GLuint*)(uniformIndices + uniformIndicesOffset));
      
    //release uniformNames strings
    for (i = count - 1; i >= 0; i--) {
       if(names[i]) {
          jstring name = (jstring)env->GetObjectArrayElement(uniformNames, i);
          if (name) {
               env->ReleaseStringUTFChars(name, names[i]);
           }
         }
      }
      free(names);    
*/


    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformsiv(
     * [int program, int uniformCount, int[] uniformIndices, 
     * int uniformIndicesOffset, int pname, int[] params, int paramsOffset]);
     * 
     *  C function void glGetActiveUniformsiv((GLuint)  program, 
     *                                        (GLsizei) uniformCount, 
     *                                        (const GLuint *) uniformIndices, 
     *                                        (GLenum) pname, 
     *                                        (GLint) *params);
     **/
    public void glGetActiveUniformsiv(int program, 
                                      int uniformCount, 
                                      int[] uniformIndices, int uniformIndicesOffset, 
                                      int pname, 
                                      int[] params, int paramsOffset) {
        
        checkArray(uniformIndices, uniformIndicesOffset, uniformCount, UNIFORM_INDICES);
        checkArray(params, paramsOffset,uniformCount, PARAMS);
        
        nGLGetActiveUniformsiv(program,
                uniformCount,
                uniformIndices,  uniformIndicesOffset,
                pname,
                params, paramsOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformsiv(
     * [int program, int uniformCount, 
     * int[] uniformIndices, int uniformIndicesOffset, 
     * int pname, int[] params, int paramsOffset]);
     * 
     *  C function void glGetActiveUniformsiv((GLuint)  program, 
     *                                        (GLsizei) uniformCount, 
     *                                        (const GLuint *) uniformIndices, 
     *                                        (GLenum) pname, (GLint) *params);
     **/
    private static native void nGLGetActiveUniformsiv(int program, 
                                                      int uniformCount, 
                                                      int[] uniformIndices,  int uniformIndicesOffset, 
                                                      int pname, 
                                                      int[] params, int paramsOffset);/*        
         glGetActiveUniformsiv((GLuint)  program, 
                                (GLsizei) uniformCount, 
                                (GLuint *) (uniformIndices + uniformIndicesOffset), 
                                (GLenum) pname, 
                                (GLint *) (params + paramsOffset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformsiv([int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformsiv((GLuint)  program, (GLsizei) uniformCount, (const GLuint *) uniformIndices, (GLenum) pname, (GLint) *params)

     **/
    public void glGetActiveUniformsiv(int program, 
                                      int uniformCount, 
                                      java.nio.IntBuffer uniformIndices, 
                                      int pname, 
                                      java.nio.IntBuffer params) {
        
        checkBuffer(uniformIndices, uniformCount, UNIFORM_INDICES);
        checkBuffer(params, uniformCount, PARAMS);
        
        int uniformIndicesOffset = getOffset(uniformIndices);
        int paramsOffset = getOffset(params);

        // now, the offset...
        if (uniformIndices.isDirect() && params.isDirect()) {            
            GLES30Pipeline.nGLGetActiveUniformsiv(program, 
                    uniformCount, 
                    uniformIndices, uniformIndicesOffset, 
                    pname, 
                    params, paramsOffset);
            
        } else { 
            if(uniformIndices.hasArray() && params.hasArray()){
                int[] uniformArray = uniformIndices.array();
                int[] paramArray = uniformIndices.array();
                
                GLES30Pipeline.nGLGetActiveUniformsiv(program, 
                        uniformCount, 
                        uniformArray, uniformIndicesOffset, 
                        pname, 
                        paramArray, paramsOffset); 
            }else{
                throw new IllegalArgumentException(INVALID_BUFFER 
                        + ", " + UNIFORM_INDICES + ": " + uniformIndices 
                        + ", " + PARAMS + ": " + params);                        
            }                      
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformsiv(
     * [int program, int uniformCount, 
     * java.nio.IntBuffer uniformIndices, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformsiv((GLuint)  program, 
     *                                        (GLsizei) uniformCount, 
     *                                        (const GLuint *) uniformIndices, 
     *                                        (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetActiveUniformsiv(int program, 
                                                      int uniformCount, 
                                                      java.nio.IntBuffer uniformIndices, 
                                                      int uniformIndicesOffset,
                                                      int pname, 
                                                      java.nio.IntBuffer params, int paramsOffset);/*
     glGetActiveUniformsiv((GLuint)  program, 
                           (GLsizei) uniformCount, 
                           (GLuint *) (uniformIndices + uniformIndicesOffset), 
                           (GLenum) pname, 
                           (GLint *) (params + paramsOffset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetUniformBlockIndex([int program, String uniformBlockName]);
     * 
     *  C function (GLuint)  glGetUniformBlockIndex((GLuint)  program, const GLchar *uniformBlockName)

     **/
    public int glGetUniformBlockIndex(int program, String uniformBlockName) {
        return nGLGetUniformBlockIndex(program, uniformBlockName);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetUniformBlockIndex([int program, String uniformBlockName]);
     * 
     *  C function (GLuint)  glGetUniformBlockIndex((GLuint)  program, const GLchar *uniformBlockName)

     **/
    private static native int nGLGetUniformBlockIndex(int program, String uniformBlockName);/*    		
    	return (jint)	glGetUniformBlockIndex((GLuint)  program, (GLchar *) uniformBlockName);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformBlockiv(
     * [int program, int uniformBlockIndex, int pname, int[] params, int offset]);
     * 
     *  C function void glGetActiveUniformBlockiv((GLuint)  program,
     *   (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params)
     **/
    public void glGetActiveUniformBlockiv(int program, 
                                          int uniformBlockIndex, 
                                          int pname, 
                                          int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES30Pipeline.nGLGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformBlockiv(
     * [int program, int uniformBlockIndex, int pname, int[] params, int offset]);
     * 
     *  C function void glGetActiveUniformBlockiv((GLuint)  program,
     *   (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params)
     **/
    private static native void nGLGetActiveUniformBlockiv(int program, 
                                                          int uniformBlockIndex, 
                                                          int pname, 
                                                          int[] params, int offset);/*
                                                          
           glGetActiveUniformBlockiv((GLuint)  program, 
                                     (GLuint)  uniformBlockIndex, 
                                     (GLenum) pname, 
                                     (GLint *)(params + offset));                                                          
   */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformBlockiv([int program, 
     * int uniformBlockIndex, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformBlockiv((GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params)

     **/
    public void glGetActiveUniformBlockiv(int program, 
                                          int uniformBlockIndex, 
                                          int pname, 
                                          java.nio.IntBuffer params) {
        checkBuffer(params,1,PARAMS);
        int offset = getOffset(params);
        // now, the offset...
        if (params.isDirect()) {           
            nGLGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, offset);
        } else {
            int[] array = params.array();
            nGLGetActiveUniformBlockiv(program, uniformBlockIndex, pname, array, offset);
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformBlockiv([int program, 
     * int uniformBlockIndex, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetActiveUniformBlockiv((GLuint)  program, (GLuint)  uniformBlockIndex, (GLenum) pname, (GLint) *params)
     **/
    private static native void nGLGetActiveUniformBlockiv(int program, 
                                                          int uniformBlockIndex, 
                                                          int pname, 
                                                          java.nio.IntBuffer params, int offset);/*
           glGetActiveUniformBlockiv((GLuint)  program, 
                                     (GLuint)  uniformBlockIndex, 
                                     (GLenum) pname, 
                                     (GLint *)(params + offset)); 
      */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, 
     * int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName)

     **/
    public void glGetActiveUniformBlockName(int program, 
                                            int uniformBlockIndex, 
                                            int bufSize, 
                                            int[] length, int lengthOffset, 
                                            byte[] uniformBlockName, int uniformBlockNameOffset) {
        checkArray(length, lengthOffset, 1, LENGTH);
        checkArray(uniformBlockName, uniformBlockNameOffset, 1, "uniformBlockName");
        nGLGetActiveUniformBlockName(program, 
                uniformBlockIndex, 
                bufSize, 
                length, lengthOffset, 
                uniformBlockName, uniformBlockNameOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, int bufSize, int[] length, int lengthOffset, byte[] uniformBlockName, int uniformBlockNameOffset]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName)

     **/
    private static native void nGLGetActiveUniformBlockName(int program, 
                                                            int uniformBlockIndex, 
                                                            int bufSize, 
                                                            int[] length, int lengthOffset, 
                                                            byte[] uniformBlockName, int uniformBlockNameOffset);/*
          glGetActiveUniformBlockName((GLuint)  program, 
                                      (GLuint)  uniformBlockIndex, 
                                      (GLsizei) bufSize, 
                                      (GLsizei *)(length + lengthOffset), 
                                      (GLchar *) (uniformBlockName + uniformBlockNameOffset)) ;                                                 
                                                            
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, java.nio.Buffer length, java.nio.Buffer uniformBlockName]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, 
     *                                              (GLuint)  uniformBlockIndex, 
     *                                              (GLsizei) bufSize, 
     *                                              (GLsizei) *length, 
     *                                              GLchar *uniformBlockName)

     **/
    public void glGetActiveUniformBlockName(int program, 
                                            int uniformBlockIndex, 
                                            java.nio.Buffer length, 
                                            java.nio.Buffer uniformBlockName) {
        checkBuffer(length, 1, LENGTH);
        checkBuffer(uniformBlockName, 2, "uniformBlockName");
        
        int lenOffset = getOffset(length);
        int uniOffset = getOffset(uniformBlockName);
        int bufSize = uniformBlockName.remaining();
        
        // now, the offset...
        if (length.isDirect() && uniformBlockName.isDirect()) {
            nGLGetActiveUniformBlockName(program, 
                    uniformBlockIndex,
                    bufSize,
                    length, lenOffset,
                    uniformBlockName, uniOffset);            
        } else {           
            nGLGetActiveUniformBlockName(program, 
                    uniformBlockIndex,
                    bufSize,
                    (int[])length.array(), lenOffset,
                    (byte[])uniformBlockName.array(), uniOffset);         
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex, java.nio.Buffer length, java.nio.Buffer uniformBlockName]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, 
     *                                              (GLuint)  uniformBlockIndex, 
     *                                              (GLsizei) bufSize, 
     *                                              (GLsizei *) length, 
     *                                              (GLchar *) uniformBlockName)

     **/
    private static native void nGLGetActiveUniformBlockName(int program, 
        			    int uniformBlockIndex,
        			    int bufSize,
        			    java.nio.Buffer length, int lenOffset,
        			    java.nio.Buffer uniformBlockName, int uniOffset);/*
          // assume length is int*           	
          glGetActiveUniformBlockName ((GLuint)  program, 
        	(GLuint)  uniformBlockIndex,
        	(GLsizei) bufSize, // get the size of buffer from Buffer
        	(GLsizei *) (length + uniOffset),  // get the pointer
        	(GLchar *)  (uniformBlockName + uniOffset) );  
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, 
     *                                              (GLuint)  uniformBlockIndex, 
     *                                              (GLsizei) bufSize, 
     *                                              (GLsizei) *length, 
     *                                              (GLchar *) uniformBlockName)
     **/
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return nGLGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetActiveUniformBlockName([int program, int uniformBlockIndex]);
     * 
     *  C function void glGetActiveUniformBlockName((GLuint)  program, (GLuint)  uniformBlockIndex, (GLsizei) bufSize, (GLsizei) *length, GLchar *uniformBlockName)

     **/
    private static native String nGLGetActiveUniformBlockName(int program, int uniformBlockIndex);/*    
        // get string length
        GLint maxLength = 0;      
        glGetProgramiv((GLuint)program, GL_ACTIVE_UNIFORM_MAX_LENGTH, &maxLength); 
        
        std::vector<GLchar> uniformBlockName(maxLength + 1);
    
        glGetActiveUniformBlockName((GLuint)  program,
                                    (GLuint)  uniformBlockIndex, 
                                    (GLsizei) maxLength + 1,
                                    &maxLength,
                                    &uniformBlockName[0]);
         
        return (jstring) ( &uniformBlockName[0] == 0 ? 
                             (jstring)0 : 
                             env->NewStringUTF((char *) &uniformBlockName[0]));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glUniformBlockBinding([int program, int uniformBlockIndex, int uniformBlockBinding]);
     * 
     *  C function void glUniformBlockBinding((GLuint)  program,  
     *                                        (GLuint)  uniformBlockIndex, 
     *                                        (GLuint)  uniformBlockBinding)
     **/
    public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        GLES30Pipeline.nGLUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glUniformBlockBinding([int program, int uniformBlockIndex, int uniformBlockBinding]);
     * 
     *  C function void glUniformBlockBinding((GLuint)  program, 
     *                                        (GLuint)  uniformBlockIndex, 
     *                                        (GLuint)  uniformBlockBinding)
     **/
    private static native void nGLUniformBlockBinding(int program, 
                                                      int uniformBlockIndex, 
                                                      int uniformBlockBinding);/*
            glUniformBlockBinding((GLuint)  program, 
                                  (GLuint)  uniformBlockIndex, 
                                  (GLuint)  uniformBlockBinding);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawArraysInstanced(
     * [int mode, int first, int count, int instanceCount]);
     * 
     *  C function void glDrawArraysInstanced((GLenum) mode, 
     *                                        (GLint) first, 
     *                                        (GLsizei) count, 
     *                                        (GLsizei) instanceCount);
     **/
    public void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
        GLES30Pipeline.nGLDrawArraysInstanced(mode, first, count, instanceCount);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawArraysInstanced(
     * [int mode, int first, int count, int instanceCount]);
     * 
     *  C function void glDrawArraysInstanced((GLenum) mode, 
     *                                        (GLint) first, 
     *                                        (GLsizei) count, 
     *                                        (GLsizei) instanceCount);
     **/
    private static native void nGLDrawArraysInstanced(int mode,
                                                      int first,
                                                      int count,
                                                      int instanceCount);/*
    glDrawArraysInstanced((GLenum) mode,
                          (GLint) first,
                          (GLsizei) count,
                          (GLsizei) instanceCount);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, java.nio.Buffer indices, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount)

     **/
    public void glDrawElementsInstanced(int mode,
                                        int count,
                                        int type,
                                        java.nio.Buffer indices, int instanceCount) {
              
        checkBuffer(indices, count , INDICES);
              
        if (indices.isDirect()) { 
            int offset = getOffset(indices);  
            nGLDrawElementsInstanced(mode, count, type, indices, offset, instanceCount);
        } else {
            int offset = 0;
            if(indices instanceof ByteBuffer){
                ByteBuffer bb = (ByteBuffer)indices;
                offset = getOffset(bb);
                byte[] array = bb.array();
                nGLDrawElementsInstanced(mode, count, type, array, offset, instanceCount);
            }else if(indices instanceof ShortBuffer){
                ShortBuffer bb = (ShortBuffer)indices;
                offset = getOffset(bb);
                short[] array = bb.array();
                nGLDrawElementsInstanced(mode, count, type, array, offset, instanceCount);
            } if(indices instanceof IntBuffer){
                IntBuffer bb = (IntBuffer)indices;
                offset = getOffset(bb);
                int[] array = bb.array();
                nGLDrawElementsInstanced(mode, count, type, array, offset, instanceCount);
            } else{
                throw new IllegalArgumentException(INVALID_BUFFER + indices);
            }
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, java.nio.Buffer indices, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount)

     **/
    private static native void nGLDrawElementsInstanced(int mode,
                                     int count,
                                     int type,
                                     java.nio.Buffer indices,
                                     int offset,
                                     int instanceCount);/*
     glDrawElementsInstanced(
        (GLenum)mode,
        (GLsizei)count,
        (GLenum)type,
        (GLvoid *) (indices + offset),
        (GLsizei)instanceCount);
    */
    
    private static native void nGLDrawElementsInstanced(int mode,
                                                        int count,
                                                        int type,
                                                        byte[] indices,
                                                        int offset,
                                                        int instanceCount);/*
             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
 */

    private static native void nGLDrawElementsInstanced(int mode,
                                                        int count,
                                                        int type,
                                                        short[] indices,
                                                        int offset,
                                                        int instanceCount);/*
             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
    */
    
    private static native void nGLDrawElementsInstanced(int mode,
                                                        int count,
                                                        int type,
                                                        int[] indices,
                                                        int offset,
                                                        int instanceCount);/*
             glDrawElementsInstanced(
                           (GLenum)mode,
                           (GLsizei)count,
                           (GLenum)type,
                           (GLvoid *) (indices + offset),
                           (GLsizei)instanceCount);
 */

    
    /**
     * <pre>
     * Delegate Method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, int indicesOffset, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount)

     **/
    public void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount) {
        GLES30Pipeline.nGLDrawElementsInstanced(mode, count, type, indicesOffset, instanceCount);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDrawElementsInstanced([int mode, int count, int type, int indicesOffset, int instanceCount]);
     * 
     *  C function void glDrawElementsInstanced((GLenum) mode, (GLsizei) count, (GLenum) type, const GLvoid *indices, (GLsizei) instanceCount)

     **/
    private static native void nGLDrawElementsInstanced(int mode, 
                                                        int count, 
                                                        int type, 
                                                        int indicesOffset, 
                                                        int instanceCount);/*
       glDrawElementsInstanced((GLenum) mode, 
           (GLsizei) count, 
           (GLenum) type, 
           (GLvoid *)static_cast<uintptr_t>(indicesOffset),
           (GLsizei) instanceCount);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glFenceSync([int condition, int flags]);
     * 
     *  C function GLsync glFenceSync((GLenum) condition, GLbitfield flags)

     **/
    public long glFenceSync(int condition, int flags) {
       return GLES30Pipeline.nGLFenceSync(condition, flags);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glFenceSync([int condition, int flags]);
     * 
     *  C function GLsync glFenceSync((GLenum) condition, GLbitfield flags)

     **/
    private static native long nGLFenceSync(int condition, int flags);/*
          return (jlong)  glFenceSync((GLenum) condition, (GLbitfield) flags);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glIsSync([long sync]);
     * 
     *  C function (GLboolean) glIsSync(GLsync sync)

     **/
    public boolean glIsSync(long sync) {
        return GLES30Pipeline.nGLIsSync(sync);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glIsSync([long sync]);
     * 
     *  C function (GLboolean) glIsSync(GLsync sync)

     **/
    private static native boolean nGLIsSync(long sync);/*
    	  return (jboolean) glIsSync( (GLsync) sync);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteSync([long sync]);
     * 
     *  C function void glDeleteSync(GLsync sync)

     **/
    public void glDeleteSync(long sync) {
        GLES30Pipeline.nGLDeleteSync(sync);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteSync([long sync]);
     * 
     *  C function void glDeleteSync(GLsync sync)

     **/
    private static native void nGLDeleteSync(long sync);/*
     		glDeleteSync((GLsync) sync);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glClientWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function (GLenum) glClientWaitSync(GLsync sync, GLbitfield flags, (GLuint) 64 timeout)

     **/
    public int glClientWaitSync(long sync, int flags, long timeout) {
       return GLES30Pipeline.nGLClientWaitSync(sync, flags, timeout);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glClientWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function (GLenum) glClientWaitSync(GLsync sync, GLbitfield flags, (GLuint64) timeout)

     **/
    private static native int nGLClientWaitSync(long sync, int flags, long timeout);/*
    		return	(jint) glClientWaitSync((GLsync) sync, (GLbitfield) flags, (GLuint64) timeout);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function void glWaitSync(GLsync sync, GLbitfield flags, (GLuint) 64 timeout)

     **/
    public void glWaitSync(long sync, int flags, long timeout) {
        GLES30Pipeline.nGLWaitSync(sync, flags, timeout);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glWaitSync([long sync, int flags, long timeout]);
     * 
     *  C function void glWaitSync(GLsync sync, GLbitfield flags, (GLuint) 64 timeout)

     **/
    private static native void nGLWaitSync(long sync, int flags, long timeout);/*
    		glWaitSync((GLsync) sync, (GLbitfield) flags, (GLuint64) timeout);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInteger64v([int pname, long[] params, int offset]);
     * 
     *  C function void glGetInteger64v((GLenum) pname, GLint64 *params)

     **/
    public void glGetInteger64v(int pname, long[] params, int offset) {
        GLES30Pipeline.nGLGetInteger64v(pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInteger64v([int pname, long[] params, int offset]);
     * 
     *  C function void glGetInteger64v((GLenum) pname, GLint64 *params)

     **/
    private static native void nGLGetInteger64v(int pname, long[] params, int offset);/*
                glGetInteger64v((GLenum) pname, (GLint64 *)(params+offset) );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInteger64v([int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetInteger64v((GLenum) pname, GLint64 *params)

     **/
    public void glGetInteger64v(int pname, java.nio.LongBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
       
        if (params.isDirect()) {            
            GLES30Pipeline.nGLGetInteger64v(pname, params, offset);
        } else {          
            long[] array = params.array();           
            GLES30Pipeline.nGLGetInteger64v(pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInteger64v([int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetInteger64v((GLenum) pname, GLint64 *params)

     **/
    private static native void nGLGetInteger64v(int pname, java.nio.LongBuffer params, int offset);/*
    	     glGetInteger64v((GLenum) pname, (GLint64 *)(params+offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset]);
     * 
     *  C function void glGetSynciv(GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values)

     **/
    public void glGetSynciv(long sync, 
	    		   int pname, 
	    		   int bufSize, 
	    		   int[] length, int lengthOffset, 
	    		   int[] values, int valuesOffset) {
        checkArray(length, lengthOffset, 1, LENGTH );
        checkArray(values, valuesOffset, 1, VALUES);
        GLES30Pipeline.nGLGetSynciv(sync, 
        			    pname, 
        			    bufSize, 
        			    length, lengthOffset, 
        			    values, valuesOffset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, int[] length, int lengthOffset, int[] values, int valuesOffset]);
     * 
     *  C function void glGetSynciv(GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values)

     **/
    private static native void nGLGetSynciv(long sync, 
	            int pname, 
	            int bufSize, 
	            int[] length, int lengthOffset, 
	            int[] values, int valuesOffset);/*            
     glGetSynciv((GLsync) sync, 
                  (GLenum) pname, 
     		  (GLsizei) bufSize, 
     		  (GLsizei *)(length + lengthOffset), 
     		  (GLint *)(values + valuesOffset));  
	            
*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values]);
     * 
     *  C function void glGetSynciv(GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values)

     **/
    public void glGetSynciv(long sync,
                            int pname,
                            int bufSize,
                            java.nio.IntBuffer length,
                            java.nio.IntBuffer values) {
	
        checkBuffer(length, 1, LENGTH);
        checkBuffer(values, 1, VALUES);
        
        int offsetValues = getOffset(values);
        int offsetLen = getOffset(length);

        // now, the offset...
        if (values.isDirect() && length.isDirect()) {
            nGLGetSynciv(sync,
                    pname,
                    bufSize,
                    length, offsetLen,
                    values, offsetValues);
        } else {            
            int[] valuesArray = values.array();
            int[] lenArray = length.array();            
            nGLGetSynciv(sync,
                    pname,
                    bufSize,
                    lenArray, offsetLen,
                    valuesArray, offsetValues);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSynciv([long sync, int pname, int bufSize, java.nio.IntBuffer length, java.nio.IntBuffer values]);
     * 
     *  C function void glGetSynciv(GLsync sync, (GLenum) pname, (GLsizei) bufSize, (GLsizei) *length, (GLint) *values)

     **/
    private static native void nGLGetSynciv(long sync, 
	    int pname, 
	    int bufSize, 
	    java.nio.IntBuffer length, int lengthOffset, 
	    java.nio.IntBuffer values, int valuesOffset);/*  
	              
    glGetSynciv((GLsync) sync, 
    	        (GLenum) pname, 
	            (GLsizei) bufSize, 
	            (GLsizei *)(length + lengthOffset), 
	            (GLint *)(values + valuesOffset));
        
*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInteger64i_v([int target, int index, long[] data, int offset]);
     * 
     *  C function void glGetInteger64i_v((GLenum) target, (GLuint)  index, GLint64 *data)

     **/
    public void glGetInteger64i_v(int target, int index, long[] data, int offset) {
        checkArray(data, offset, 1, DATA);
        GLES30Pipeline.nGLGetInteger64iv(target, index, data, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInteger64i_v([int target, int index, long[] data, int offset]);
     * 
     *  C function void glGetInteger64i_v((GLenum) target, (GLuint)  index, GLint64 *data)

     **/
    private static native void nGLGetInteger64iv(int target, int index, long[] data, int offset);/*
    		glGetInteger64i_v((GLenum) target, 
          (GLuint)  index, 
          (GLint64 *)(data+offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInteger64i_v([int target, int index, java.nio.LongBuffer data]);
     * 
     *  C function void glGetInteger64i_v((GLenum) target, (GLuint)  index, GLint64 *data)

     **/
    public void glGetInteger64i_v(int target, int index, java.nio.LongBuffer data) {	      
        checkBuffer(data,1,DATA);
        int offset = getOffset(data);
        if (data.isDirect()) {           
            GLES30Pipeline.nGLGetInteger64iv(target, index, data, offset);            
        } else {          
            long[] array = data.array();
            nGLGetInteger64iv(target, index, array, offset); 
         }       
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInteger64i_v([int target, int index, java.nio.LongBuffer data]);
     * 
     *  C function void glGetInteger64i_v((GLenum) target, (GLuint)  index, GLint64 *data)

     **/
    private static native void nGLGetInteger64iv(int target, 
	    int index, 
	    java.nio.LongBuffer data, int offset);/*
	    
	glGetInteger64i_v((GLenum) target, 
	  (GLuint)  index, 
	  (GLint64 *)(data+offset));
*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetBufferParameteri64v([int target, int pname, long[] params, int offset]);
     * 
     *  C function void glGetBufferParameteri64v((GLenum) target, (GLenum) pname, GLint64 *params)

     **/
    public void glGetBufferParameteri64v(int target, int pname, long[] params, int offset) {
        GLES30Pipeline.nGLGetBufferParameteri64v(target, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetBufferParameteri64v([int target, int pname, long[] params, int offset]);
     * 
     *  C function void glGetBufferParameteri64v((GLenum) target, (GLenum) pname, GLint64 *params)

     **/
    private static native void nGLGetBufferParameteri64v(int target,
                                                         int pname,
                                                         long[] params,
                                                         int offset);/*
    			glGetBufferParameteri64v((GLenum) target, 
        	                 (GLenum) pname, 
        		             (GLint64 *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetBufferParameteri64v([int target, int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetBufferParameteri64v((GLenum) target, (GLenum) pname, GLint64 *params)

     **/
    public void glGetBufferParameteri64v(int target,
                                         int pname,
                                         java.nio.LongBuffer params) {
        checkBuffer(params, 1, PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {
            nGLGetBufferParameteri64v(target, pname, params, offset);
        } else {
            long[] array = params.array();
            nGLGetBufferParameteri64v(target, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetBufferParameteri64v([int target, int pname, java.nio.LongBuffer params]);
     * 
     *  C function void glGetBufferParameteri64v((GLenum) target, (GLenum) pname, GLint64 *params)

     **/
    private static native void nGLGetBufferParameteri64v(int target,
                                      int pname,
                                      java.nio.LongBuffer params,
                                      int offset);/*
	  glGetBufferParameteri64v((GLenum) target, 
	                         (GLenum) pname, 
	                         (GLint64 *)(params + offset));
*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glGenSamplers((GLsizei) count, (GLuint *) samplers)

     **/
    public void glGenSamplers(int count, int[] samplers, int offset) {
        checkArray(samplers, offset, 1, "samplers");
        GLES30Pipeline.nGLGenSamplers(count, samplers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glGenSamplers((GLsizei) count, (GLuint *) samplers)

     **/
    private static native void nGLGenSamplers(int count, int[] samplers, int offset);/*
        glGenSamplers((GLsizei) count, (GLuint *)(samplers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glGenSamplers((GLsizei) count, (GLuint *) samplers)

     **/
    public void glGenSamplers(int count, java.nio.IntBuffer samplers) {
        checkBuffer(samplers, 1, "samplers");
        int offset = getOffset(samplers);
        // now, the offset...
        if (samplers.isDirect()) {
            nGLGenSamplers(count, samplers, offset);
        } else {
            int[] array = samplers.array();
            GLES30Pipeline.nGLGenSamplers(count, array, offset);
        }

    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glGenSamplers((GLsizei) count, (GLuint *) samplers)

     **/
    private static native void nGLGenSamplers(int count, java.nio.IntBuffer samplers, int offset);/*
	glGenSamplers((GLsizei) count, (GLuint *)(samplers + offset));
*/


    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glDeleteSamplers((GLsizei) count, (const GLuint *) samplers)

     **/
    public void glDeleteSamplers(int count, int[] samplers, int offset) {
        GLES30Pipeline.nGLDeleteSamplers(count, samplers, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteSamplers([int count, int[] samplers, int offset]);
     * 
     *  C function void glDeleteSamplers((GLsizei) count, (const GLuint *) samplers)

     **/
    private static native void nGLDeleteSamplers(int count, int[] samplers, int offset);/*
    		glDeleteSamplers((GLsizei) count, (const GLuint  *)(samplers + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glDeleteSamplers((GLsizei) count, (const GLuint *) samplers)

     **/
    public void glDeleteSamplers(int count, java.nio.IntBuffer samplers) {
	
        checkBuffer(samplers, 1, "samplers");
        int offset = getOffset(samplers);
        // now, the offset...
        if (samplers.isDirect()) {           
            GLES30Pipeline.nGLDeleteSamplers(count, samplers, offset);
        } else {           
            int[] array = samplers.array();
            GLES30Pipeline.nGLDeleteSamplers(count, array, offset);
         }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteSamplers([int count, java.nio.IntBuffer samplers]);
     * 
     *  C function void glDeleteSamplers((GLsizei) count, (const GLuint *) samplers)

     **/
    private static native void nGLDeleteSamplers(int count, java.nio.IntBuffer samplers, int offset);/*
    		glDeleteSamplers((GLsizei) count, (const GLuint  *)(samplers + offset));
    */

  

    /**
     * <pre>
     * Delegate Method generated from GLES30.glIsSampler([int sampler]);
     * 
     *  C function (GLboolean) glIsSampler((GLuint)  sampler)

     **/
    public boolean glIsSampler(int sampler) {
        return GLES30Pipeline.nGLIsSampler(sampler);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glIsSampler([int sampler]);
     * 
     *  C function (GLboolean) glIsSampler((GLuint)  sampler)

     **/
    private static native boolean nGLIsSampler(int sampler);/*
    	return (jboolean) glIsSampler((GLuint) sampler);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBindSampler([int unit, int sampler]);
     * 
     *  C function void glBindSampler((GLuint)  unit, (GLuint)  sampler)

     **/
    public void glBindSampler(int unit, int sampler) {
        GLES30Pipeline.nGLBindSampler(unit, sampler);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBindSampler([int unit, int sampler]);
     * 
     *  C function void glBindSampler((GLuint)  unit, (GLuint)  sampler)

     **/
    private static native void nGLBindSampler(int unit, int sampler);/*
    	 glBindSampler((GLuint)  unit, (GLuint)  sampler);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameteri([int sampler, int pname, int param]);
     * 
     *  C function void glSamplerParameteri((GLuint)  sampler, (GLenum) pname, (GLint) param)

     **/
    public void glSamplerParameteri(int sampler, int pname, int param) {
        GLES30Pipeline.nGLSamplerParameteri(sampler, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameteri([int sampler, int pname, int param]);
     * 
     *  C function void glSamplerParameteri((GLuint)  sampler, (GLenum) pname, (GLint) param)
     **/
    private static native void nGLSamplerParameteri(int sampler, int pname, int param);/*    
    			glSamplerParameteri((GLuint)  sampler, (GLenum) pname, (GLint) param);
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameteriv([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, const (GLint) *param)
     **/
    public void glSamplerParameteriv(int sampler, int pname, int[] param, int offset) {
        GLES30Pipeline.nGLSamplerParameteriv(sampler, pname, param, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameteriv([int sampler, int pname, int[] param, int offset]);
     * 
     *  C function void glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, const (GLint) *param)
     **/
    private static native void nGLSamplerParameteriv(int sampler, int pname, int[] param, int offset);/*    
    	glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (const GLint *) (param + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, const (GLint) *param)

     **/
    public void glSamplerParameteriv(int sampler,
                                     int pname,
                                     java.nio.IntBuffer param) {
        checkBuffer(param, 1, PARAMS);
        int offset = getOffset(param);
        // now, the offset...
        if (param.isDirect()) {
            GLES30Pipeline.nGLSamplerParameteriv(sampler, pname, param, offset);
        } else {
            int[] array = param.array();
            GLES30Pipeline.nGLSamplerParameteriv(sampler, pname, array, offset);
        }

    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer param]);
     * 
     *  C function void glSamplerParameteriv((GLuint)  sampler, (GLenum) pname, const (GLint) *param)

     **/
    private static native void nGLSamplerParameteriv(int sampler, 
	        	     int pname, 
	        	     java.nio.IntBuffer param, int offset);/*    
    		glSamplerParameteriv((GLuint)  sampler, 
    		                     (GLenum) pname, 
                     (GLint *)(param + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameterf([int sampler, int pname, float param]);
     * 
     *  C function void glSamplerParameterf((GLuint)  sampler, (GLenum) pname, (GLfloat) param)

     **/
    public void glSamplerParameterf(int sampler, int pname, float param) {
        GLES30Pipeline.nGLSamplerParameterf(sampler, pname, param);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameterf([int sampler, int pname, float param]);
     * 
     *  C function void glSamplerParameterf((GLuint)  sampler, (GLenum) pname, (GLfloat) param)

     **/
    private static native void nGLSamplerParameterf(int sampler, int pname, float param);/*    
    	       glSamplerParameterf((GLuint)  sampler, (GLenum) pname, (GLfloat) param);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameterfv([int sampler, int pname, float[] param, int offset]);
     * 
     *  C function void glSamplerParameterfv((GLuint)  sampler, (GLenum) pname, const (GLfloat) *param)

     **/
    public void glSamplerParameterfv(int sampler, int pname, float[] param, int offset) {
        checkArray(param, offset, 1, PARAMS);
        GLES30Pipeline.nGLSamplerParameterfv(sampler, pname, param, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameterfv([int sampler, int pname, float[] param, int offset]);
     * 
     *  C function void glSamplerParameterfv((GLuint)  sampler, (GLenum) pname, const (GLfloat) *param)

     **/
    private static native void nGLSamplerParameterfv(int sampler, int pname, float[] param, int offset);/*
    		glSamplerParameterfv((GLuint)  sampler, 
             (GLenum) pname, 
             (const GLfloat *)(param + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer param]);
     * 
     *  C function void glSamplerParameterfv((GLuint)  sampler, (GLenum) pname, const (GLfloat) *param)

     **/
    public void glSamplerParameterfv(int sampler,
                                     int pname,
                                     java.nio.FloatBuffer param) {
        checkBuffer(param, 1, PARAMS);
        int offset = getOffset(param);
        // now, the offset...
        if (param.isDirect()) {
            GLES30Pipeline.nGLSamplerParameterfv(sampler, pname, param, offset);
        } else {
            float[] array = param.array();
            GLES30Pipeline.nGLSamplerParameterfv(sampler, pname, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer param]);
     * 
     *  C function void glSamplerParameterfv((GLuint)  sampler, (GLenum) pname, const (GLfloat) *param)

     **/
    private static native void nGLSamplerParameterfv(int sampler, 
	        	     int pname, 
	        	     java.nio.FloatBuffer param, int offset);/*
	       glSamplerParameterfv((GLuint)  sampler, 
                                (GLenum) pname, 
                                ( GLfloat *)(param + offset));	     
	        	     
	    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (GLint) *params)

     **/
    public void glGetSamplerParameteriv(int sampler, int pname, int[] params, int offset) {
        checkArray(params, offset, 1, PARAMS);
        GLES30Pipeline.nGLGetSamplerParameteriv(sampler, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, int[] params, int offset]);
     * 
     *  C function void glGetSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetSamplerParameteriv(int sampler, int pname, int[] params, int offset);/*
          glGetSamplerParameteriv((GLuint)  sampler, 
          			  (GLenum)  pname, 
          			  (GLint *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (GLint) *params)

     **/
    public void glGetSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer params) {
        checkBuffer(params,1,PARAMS);
        int offset = getOffset(params);
        // now, the offset...
        if (params.isDirect()) {           
            GLES30Pipeline.nGLGetSamplerParameteriv(sampler, pname, params, offset);
        } else {           
            int[] array = params.array();
            GLES30Pipeline.nGLGetSamplerParameteriv(sampler, pname, array, offset);
         }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSamplerParameteriv([int sampler, int pname, java.nio.IntBuffer params]);
     * 
     *  C function void glGetSamplerParameteriv((GLuint)  sampler, (GLenum) pname, (GLint) *params)

     **/
    private static native void nGLGetSamplerParameteriv(int sampler, 
	        		int pname, 
	        		java.nio.IntBuffer params, int offset);/*
    		glGetSamplerParameteriv((GLuint)  sampler, 
        	(GLenum) pname, 
        	(GLint *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, float[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat) *params)

     **/
    public void glGetSamplerParameterfv(int sampler, int pname, float[] params, int offset) {
        GLES30Pipeline.nGLGetSamplerParameterfv(sampler, pname, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, float[] params, int offset]);
     * 
     *  C function void glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat) *params)

     **/
    private static native void nGLGetSamplerParameterfv(int sampler, int pname, float[] params, int offset);/*
                glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat *)(params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat) *params)

     **/
    public void glGetSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer params) {

        checkBuffer(params ,1,PARAMS);

        // now, the offset...
        if (params.isDirect()) {
            int offset = getOffset(params);
            GLES30Pipeline.nGLGetSamplerParameterfv(sampler, pname, params,offset);
        } else {
            float[] array = params.array();            
            int offset =  getOffset(params);
            GLES30Pipeline.nGLGetSamplerParameterfv(sampler, pname, array,offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetSamplerParameterfv([int sampler, int pname, java.nio.FloatBuffer params]);
     * 
     *  C function void glGetSamplerParameterfv((GLuint)  sampler, (GLenum) pname, (GLfloat *) params);

     **/
    private static native void nGLGetSamplerParameterfv(int sampler, 
	        		int pname, 
	        		java.nio.FloatBuffer params, int offset);/*
    			glGetSamplerParameterfv((GLuint)  sampler, 
        		(GLenum) pname, 
        		(GLfloat *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glVertexAttribDivisor([int index, int divisor]);
     * 
     *  C function void glVertexAttribDivisor((GLuint)  index, (GLuint)  divisor)

     **/
    public void glVertexAttribDivisor(int index, int divisor) {
        GLES30Pipeline.nGLVertexAttribDivisor(index, divisor);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glVertexAttribDivisor([int index, int divisor]);
     * 
     *  C function void glVertexAttribDivisor((GLuint)  index, (GLuint)  divisor)

     **/
    private static native void nGLVertexAttribDivisor(int index, int divisor);/*
         glVertexAttribDivisor((GLuint)  index, (GLuint)  divisor);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glBindTransformFeedback([int target, int id]);
     * 
     *  C function void glBindTransformFeedback((GLenum) target, (GLuint)  id)

     **/
    public void glBindTransformFeedback(int target, int id) {
        GLES30Pipeline.nGLBindTransformFeedback(target, id);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glBindTransformFeedback([int target, int id]);
     * 
     *  C function void glBindTransformFeedback((GLenum) target, (GLuint)  id)

     **/
    private static native void nGLBindTransformFeedback(int target, int id);/*
     		glBindTransformFeedback((GLenum) target, (GLuint)  id);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) ids)

     **/
    public void glDeleteTransformFeedbacks(int n, int[] ids, int offset) {
        GLES30Pipeline.nGLDeleteTransformFeedbacks(n, ids, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) ids)

     **/
    private static native void nGLDeleteTransformFeedbacks(int n, int[] ids, int offset);/*        
          	glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) &ids[offset]);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glDeleteTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) ids)
     **/
    public void glDeleteTransformFeedbacks(int n, java.nio.IntBuffer ids) {
        checkBuffer(ids, n, IDS);
        int offset = getOffset(ids);
        if (ids.isDirect()) {            
            GLES30Pipeline.nGLDeleteTransformFeedbacks(n, ids, offset);            
        } else {           
            int[] array = ids.array();
            GLES30Pipeline.nGLDeleteTransformFeedbacks(n, array, offset);
         }      
    }

    /**
     * <pre>
     * Native method generated from GLES30.glDeleteTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glDeleteTransformFeedbacks((GLsizei) n, (const GLuint *) ids)

     **/
    private static native void nGLDeleteTransformFeedbacks(int n, java.nio.IntBuffer ids, int offset);/*
    	glDeleteTransformFeedbacks( (GLsizei) n, (const GLuint *) (ids + offset));    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glGenTransformFeedbacks((GLsizei) n, (GLuint *) ids)
     **/
    public void glGenTransformFeedbacks(int n, int[] ids, int offset) {
        checkArray(ids, offset, n, IDS);
        GLES30Pipeline.nGLGenTransformFeedbacks(n, ids, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenTransformFeedbacks([int n, int[] ids, int offset]);
     * 
     *  C function void glGenTransformFeedbacks((GLsizei) n, (GLuint *) ids)
     **/
    private static native void nGLGenTransformFeedbacks(int n, int[] ids, int offset);/*    
    		glGenTransformFeedbacks((GLsizei) n, (GLuint *) &ids[offset]);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGenTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenTransformFeedbacks((GLsizei) n, (GLuint *) ids)
     **/
    public void glGenTransformFeedbacks(int n, java.nio.IntBuffer ids) {
	checkBuffer(ids, n, IDS);
        int offset = getOffset(ids);
        
        if (ids.isDirect()) {            
            nGLGenTransformFeedbacks(n, ids, offset);            
        } else {            
            int[] array = ids.array();
            GLES30Pipeline.nGLGenTransformFeedbacks(n, array, offset);
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGenTransformFeedbacks([int n, java.nio.IntBuffer ids]);
     * 
     *  C function void glGenTransformFeedbacks((GLsizei) n, (GLuint  *)ids)

     **/
    private static native void nGLGenTransformFeedbacks(int n, java.nio.IntBuffer ids, int offset);/*
    	glGenTransformFeedbacks((GLsizei) n, (GLuint *) (ids + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glIsTransformFeedback([int id]);
     * 
     *  C function (GLboolean) glIsTransformFeedback((GLuint)  id)

     **/
    public boolean glIsTransformFeedback(int id) {
       return GLES30Pipeline.nGLIsTransformFeedback(id);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glIsTransformFeedback([int id]);
     * 
     *  C function (GLboolean) glIsTransformFeedback((GLuint)  id)

     **/
    private static native boolean nGLIsTransformFeedback(int id);/*
    		return (jboolean) glIsTransformFeedback((GLuint)  id);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glPauseTransformFeedback();
     * 
     *  C function void glPauseTransformFeedback(void)

     **/
    public void glPauseTransformFeedback() {
        GLES30Pipeline.nGLPauseTransformFeedback();
    }

    /**
     * <pre>
     * Native method generated from GLES30.glPauseTransformFeedback();
     * 
     *  C function void glPauseTransformFeedback(void)

     **/
    private static native void nGLPauseTransformFeedback();/*
      glPauseTransformFeedback();
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glResumeTransformFeedback();
     * 
     *  C function void glResumeTransformFeedback(void)

     **/
    public void glResumeTransformFeedback() {
        GLES30Pipeline.nGLResumeTransformFeedback();
    }

    /**
     * <pre>
     * Native method generated from GLES30.glResumeTransformFeedback();
     * 
     *  C function void glResumeTransformFeedback(void)

     **/
    private static native void nGLResumeTransformFeedback();/*
               glResumeTransformFeedback( );
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetProgramBinary(
     * [int program, int bufSize, 
     * int[] length, int lengthOffset, 
     * int[] binaryFormat, int binaryFormatOffset, 
     * java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary((GLuint)  program, 
     *                                     (GLsizei) bufSize, 
     *                                     (GLsizei) *length, 
     *                                     (GLenum) *binaryFormat, 
     *                                     GLvoid *binary)

     **/
    public void glGetProgramBinary(int program, 
           int bufSize, 
           int[] length, int lengthOffset, 
           int[] binaryFormat, int binaryFormatOffset, 
           java.nio.Buffer binary) {
        
	checkArray(length, lengthOffset, 1, LENGTH);
        checkArray(binaryFormat, binaryFormatOffset, 1, "binaryFormatOffset");
        checkBuffer(binary, bufSize, BINARY);
        
        int binaryOffset = getOffset(binary);
        if (binary.isDirect()) {
            nGLGetProgramBinary(program,
                    bufSize,
                    length, lengthOffset,
                    binaryFormat, binaryFormatOffset,
                    binary, binaryOffset);
        } else {   
            if (binary instanceof ByteBuffer) {
            nGLGetProgramBinary(program,
                    bufSize,
                    length, lengthOffset,
                    binaryFormat, binaryFormatOffset,
                        (byte[]) binary.array(), binaryOffset);
            } else {
                throw new IllegalArgumentException("Invalid buffer type: " + binary);
                }
            }
        }

    /**
     * <pre>
     * Native method generated from GLES30.glGetProgramBinary([int program, int bufSize, int[] length, int lengthOffset, int[] binaryFormat, int binaryFormatOffset, java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary((GLuint)  program, (GLsizei) bufSize, (GLsizei) *length, (GLenum) *binaryFormat, GLvoid *binary)

     **/
    private static native void nGLGetProgramBinary(int program, 
        	           int bufSize, 
        		   int[] length, int lengthOffset, 
        		   int[] binaryFormat, int binaryFormatOffset, 
        		   java.nio.Buffer binary, int binaryOffset);/*
                
    	glGetProgramBinary( (GLuint)  program, 
    	                    (GLsizei) bufSize,
    	                    (GLsizei *) &length[lengthOffset], 
                            (GLenum *)  &binaryFormat[binaryFormatOffset], 
        	            (GLvoid *)  &binary[binaryOffset]);
                
    	*/
    
    private static native void nGLGetProgramBinary(int program, 
                                                   int bufSize, 
                                                   int[] length, int lengthOffset, 
                                                   int[] binaryFormat, int binaryFormatOffset, 
                                                   byte[] binary, int binaryOffset);/*
                                                                                                
                        glGetProgramBinary( (GLuint)  program, 
                                            (GLsizei) bufSize,
                                            (GLsizei *) &length[lengthOffset], 
                                            (GLenum *)  &binaryFormat[binaryFormatOffset], 
                                            (GLvoid *)  &binary[binaryOffset]);
                                                                                                
        */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetProgramBinary(
     * [int program, int bufSize, 
     *  java.nio.IntBuffer length, 
     *  java.nio.IntBuffer binaryFormat, 
     *  java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary((GLuint)  program, 
     *                                     (GLsizei) bufSize, 
     *                                     (GLsizei *) length, 
     *                                     (GLenum *) binaryFormat, 
     *                                     (GLvoid *) binary);
     * TODO - improve code to support wider variation of Buffers
     **/
    public void glGetProgramBinary(int program, 
           int bufSize,
           java.nio.IntBuffer length,
           java.nio.IntBuffer binaryFormat,
           java.nio.Buffer binary) {
        
        checkBuffer(length, 1, LENGTH);
        checkBuffer(binaryFormat, 1, "binaryFormat");
        checkBuffer(binary, bufSize, BINARY);
        
        int binaryOffset = getOffset(binary); 
       
        if (binary.isDirect() && length.isDirect() && binaryFormat.isDirect()) {
        
        int lengthOffset  = getOffset(length);
        int binaryFormatOffset = getOffset(binaryFormat);
            
         nGLGetProgramBinary(program,
        	        bufSize,
        	        length, lengthOffset,
        	        binaryFormat, binaryFormatOffset,
        	        binary, binaryOffset);
            
        } else {
            if(binary instanceof ByteBuffer){
            // move all data to arrays
            byte[] binArray = (byte[])binary.array();
            // remember to copy back data from following arrays :
            int[] lenArray = copyToArray(length, 1);
            int[] binFormatArr = copyToArray(binaryFormat, 1);     
            
            //call GL using arrays
            nGLGetProgramBinary(program, 
                    bufSize,
                    lenArray, 0,
                    binFormatArr, 0,
                    binArray, binaryOffset);
            
            copyFromArray(lenArray, length);
            copyFromArray(binFormatArr, binaryFormat );               
           }else{
               throw new IllegalArgumentException("Invalid buffer type:" + binary);
               }
         }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetProgramBinary(
     * [int program, int bufSize, 
     * java.nio.IntBuffer length, 
     * java.nio.IntBuffer binaryFormat, 
     * java.nio.Buffer binary]);
     * 
     *  C function void glGetProgramBinary((GLuint)  program, 
     *                                     (GLsizei) bufSize, 
     *                                     (GLsizei *) length, 
     *                                     (GLenum *) binaryFormat, 
     *                                     (GLvoid *) binary)

     **/
    private static native void nGLGetProgramBinary(int program, 
        		   int bufSize, 
        		   java.nio.IntBuffer length, int lengthOffset,
        		   java.nio.IntBuffer binaryFormat, int binaryFormatOffset,
        		   java.nio.Buffer binary, int binaryOffset);/*
                
    			glGetProgramBinary( (GLuint)  program, 
    		                            (GLsizei) bufSize, 
        	    (GLsizei *) (length + lengthOffset), 
        	    (GLenum *) (binaryFormat + binaryFormatOffset), 
        	    (GLvoid *) (binary + binaryOffset));	
                
    		*/

    /**
     * <pre>
     * Delegate Method generated from GLES30.glProgramBinary(
     * [int program, int binaryFormat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glProgramBinary((GLuint)  program, 
     *      (GLenum) binaryFormat, 
     *      (GLvoid *) binary, 
     *      (GLsizei) length);
     **/
    public void glProgramBinary(int program, int binaryFormat, java.nio.Buffer binary, int length) {
        checkBuffer(binary, length, BINARY);
        int offset = getOffset(binary);

        if (binary.isDirect()) {
            nGLProgramBinary(program, binaryFormat, binary, offset, length);
        } else {
            if (binary instanceof ByteBuffer) {
                byte[] array = (byte[]) binary.array();
                nGLProgramBinary(program, binaryFormat, array, offset, length);
            } else 
                throw new IllegalArgumentException("Invalid buffer type: " + binary);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glProgramBinary(
     * [int program, int binaryFormat, java.nio.Buffer binary, int length]);
     * 
     *  C function void glProgramBinary((GLuint)  program,
     *                                  (GLenum) binaryFormat, 
     *                                  const GLvoid *binary, 
     *                                  (GLsizei) length)

     **/
    private static native void nGLProgramBinary(int program, 
                                                int binaryFormat, 
                                                java.nio.Buffer binary, int offset, int length);/*    
    
        	glProgramBinary((GLuint)  program, 
        			(GLenum) binaryFormat, 
        			(GLvoid *) (binary + offset), 
        			(GLsizei) length);    
    */
    
    private static native void nGLProgramBinary(int program, 
                                                int binaryFormat, 
                                                byte[] binary, int offset, int length);/*    
    
                                        glProgramBinary((GLuint)  program, 
                                                        (GLenum) binaryFormat, 
                                                        (GLvoid *) (binary + offset), 
                                                        (GLsizei) length);    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glProgramParameteri([int program, int pname, int value]);
     * 
     *  C function void glProgramParameteri((GLuint)  program, (GLenum) pname, (GLint) value)

     **/
    public void glProgramParameteri(int program, int pname, int value) {
        GLES30Pipeline.nGLProgramParameteri(program, pname, value);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glProgramParameteri([int program, int pname, int value]);
     * 
     *  C function void glProgramParameteri((GLuint)  program, (GLenum) pname, (GLint) value)

     **/
    private static native void nGLProgramParameteri(int program, int pname, int value);/*    
           glProgramParameteri((GLuint)  program, (GLenum) pname, (GLint) value);
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glInvalidateFramebuffer([int target, int numAttachments, int[] attachments, int offset]);
     * 
     *  C function void glInvalidateFramebuffer((GLenum) target, (GLsizei) numAttachments, const (GLenum) *attachments)

     **/
    public void glInvalidateFramebuffer(int target, int numAttachments, int[] attachments, int offset) {
        checkArray(attachments, offset, numAttachments, ATTACHMENTS);
        GLES30Pipeline.nGLInvalidateFramebuffer(target, numAttachments, attachments, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glInvalidateFramebuffer(
     * [int target, int numAttachments, int[] attachments, int offset]);
     * 
     *  C function void glInvalidateFramebuffer((GLenum) target, 
     *                                          (GLsizei) numAttachments, 
     *                                          (GLenum) *attachments)
     **/
    private static native void nGLInvalidateFramebuffer(int target, 
                                                        int numAttachments, 
                                                        int[] attachments, int offset);/*
        glInvalidateFramebuffer((GLenum) target, 
                                (GLsizei) numAttachments, 
                                (GLenum *) (attachments + offset));
    
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glInvalidateFramebuffer(
     * [int target, int numAttachments, java.nio.IntBuffer attachments]);
     * 
     *  C function void glInvalidateFramebuffer((GLenum) target, 
     *                                          (GLsizei) numAttachments, 
     *                                          const (GLenum) *attachments)

     **/
    public void glInvalidateFramebuffer(int target, 
                                        int numAttachments, 
                                        java.nio.IntBuffer attachments) {
        checkBuffer(attachments, numAttachments, ATTACHMENTS);
        int offset = getOffset(attachments);
        if (attachments.isDirect()) {
            nGLInvalidateFramebuffer(target, numAttachments, attachments, offset);
        } else {
            int[] array = attachments.array();
            nGLInvalidateFramebuffer(target, numAttachments, array, offset);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glInvalidateFramebuffer(
     * [int target, int numAttachments, java.nio.IntBuffer attachments]);
     * 
     *  C function void glInvalidateFramebuffer((GLenum) target, 
     *                                          (GLsizei) numAttachments, 
     *                                          const (GLenum) *attachments)
     **/
    private static native void nGLInvalidateFramebuffer(int target, 
                                                        int numAttachments, 
                                                        java.nio.IntBuffer attachments, int offset);/*    
            glInvalidateFramebuffer((GLenum) target, 
                                    (GLsizei) numAttachments, 
                                    (GLenum *) (attachments + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glInvalidateSubFramebuffer(
     * [int target, int numAttachments, int[] attachments, int offset, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer((GLenum) target, 
     *                                             (GLsizei) numAttachments, 
     *                                             const (GLenum) *attachments, 
     *                                             (GLint) x, (GLint) y, 
     *                                             (GLsizei) width, (GLsizei) height)

     **/
    public void glInvalidateSubFramebuffer(int target,
                                           int numAttachments,
                                           int[] attachments, int offset,
                                           int x, int y,
                                           int width, int height) {
       checkArray(attachments, offset, numAttachments, ATTACHMENTS); 
        nGLInvalidateSubFramebuffer(target, numAttachments, attachments, offset, x, y, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glInvalidateSubFramebuffer(
     * [int target, int numAttachments, int[] attachments, int offset, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer((GLenum) target, 
     *                                             (GLsizei) numAttachments, 
     *                                             const (GLenum) *attachments, 
     *                                             (GLint) x, (GLint) y, 
     *                                             (GLsizei) width, (GLsizei) height)

     **/
    private static native void nGLInvalidateSubFramebuffer(int target,
                                                           int numAttachments,
                                                           int[] attachments, int offset,
                                                           int x, int y,
                                                           int width, int height);/*
        glInvalidateSubFramebuffer( (GLenum) target, 
                                    (GLsizei) numAttachments, 
                		(GLenum *) (attachments + offset), 
                                    (GLint) x, (GLint) y, 
                                    (GLsizei) width, (GLsizei) height);
   */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glInvalidateSubFramebuffer(
     * [int target, int numAttachments, java.nio.IntBuffer attachments, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer((GLenum) target, 
     *                                             (GLsizei) numAttachments, 
     *                                             const (GLenum) *attachments, 
     *                                             (GLint) x, (GLint) y, 
     *                                             (GLsizei) width, (GLsizei) height)

     **/
    public void glInvalidateSubFramebuffer(int target,
                                           int numAttachments,
                                           java.nio.IntBuffer attachments,
                                           int x, int y,
                                           int width, int height) {

        checkBuffer(attachments, numAttachments, ATTACHMENTS);
        int offset = getOffset(attachments);
        if (attachments.isDirect()) {
            nGLInvalidateSubFramebuffer(target,
                    numAttachments,
                    attachments, offset,
                    x, y,
                    width, height);
        } else {
            int[] array = attachments.array();
            nGLInvalidateSubFramebuffer(target, 
                    numAttachments, 
                    array, offset, 
                    x, y, 
                    width, height);
        }
    }

    /**
     * <pre>
     * Native method generated from GLES30.glInvalidateSubFramebuffer(
     * [int target, int numAttachments, java.nio.IntBuffer attachments, int x, int y, int width, int height]);
     * 
     *  C function void glInvalidateSubFramebuffer((GLenum) target, 
     *                                             (GLsizei) numAttachments, 
     *                                             const (GLenum) *attachments, 
     *                                             (GLint) x, (GLint) y, 
     *                                             (GLsizei) width, (GLsizei) height)
     **/
    private static native void nGLInvalidateSubFramebuffer(int target,
                                                           int numAttachments,
                                                           java.nio.IntBuffer attachments, int offset,
                                                           int x, int y,
                                                           int width, int height);/*
        			glInvalidateSubFramebuffer( (GLenum) target,
            (GLsizei) numAttachments,
                		(GLenum *) (attachments  + offset), 
            (GLint) x, (GLint) y,
            (GLsizei) width, (GLsizei) height);	
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexStorage2D(
     * [int target, int levels, int internalformat, int width, int height]);
     * 
     *  C function void glTexStorage2D((GLenum) target, 
     *                                 (GLsizei) levels, 
     *                                 (GLenum) internalformat, 
     *                                 (GLsizei) width, (GLsizei) height)
     **/
    public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        GLES30Pipeline.nGLTexStorage2D(target, levels, internalformat, width, height);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexStorage2D([int target, int levels, int internalformat, int width, int height]);
     * 
     *  C function void glTexStorage2D((GLenum) target, 
     *                                 (GLsizei) levels, 
     *                                 (GLenum) internalformat,
     *                                 (GLsizei) width, (GLsizei) height);
     **/
    private static native void nGLTexStorage2D(int target, 
                                               int levels, 
                                               int internalformat, 
                                               int width, int height);/*    
    		glTexStorage2D((GLenum) target, 
    		(GLsizei) levels, 
    		(GLenum) internalformat, 
    	             (GLsizei) width, (GLsizei) height);
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glTexStorage3D([int target, int levels, int internalformat, int width, int height, int depth]);
     * 
     *  C function void glTexStorage3D((GLenum) target, 
     *                                 (GLsizei) levels,
     *                                  (GLenum) internalformat,
     *                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth);
     **/
    public void glTexStorage3D(int target, 
                               int levels, 
                               int internalformat, 
                               int width, int height, int depth) {
        GLES30Pipeline.nGLTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glTexStorage3D([int target, int levels, int internalformat, int width, int height, int depth]);
     * 
     *  C function void glTexStorage3D((GLenum) target, 
     *                                 (GLsizei) levels, 
     *                                 (GLenum) internalformat, 
     *                                 (GLsizei) width, (GLsizei) height, (GLsizei) depth);

     **/
    private static native void nGLTexStorage3D(int target, 
                                               int levels, 
                                               int internalformat, 
                                               int width, int height, int depth);/*
     	glTexStorage3D((GLenum) target, 
     	                (GLsizei) levels, 
     	                (GLenum) internalformat, 
     	                (GLsizei) width, (GLsizei) height, (GLsizei) depth);      
     */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInternalformativ(
     * [int target, int internalformat, int pname, int bufSize, int[] params, int offset]);
     * 
     *  C function void glGetInternalformativ((GLenum) target, 
     *                                        (GLenum) internalformat, 
     *                                        (GLenum) pname, 
     *                                        (GLsizei) bufSize, 
     *                                        (GLint) *params)

     **/
    public void glGetInternalformativ(int target, 
        	int internalformat, 
        	int pname, 
        	int bufSize,
        	int[] params, int offset) {
        checkArray(params, offset, bufSize, PARAMS);
        GLES30Pipeline.nGLGetInternalformativ(target, internalformat, pname, bufSize, params, offset);
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInternalformativ(
     * [int target, int internalformat, int pname, int bufSize, int[] params, int offset]);
     * 
     *  C function void glGetInternalformativ((GLenum) target, 
     *                                        (GLenum) internalformat, 
     *                                        (GLenum) pname, 
     *                                        (GLsizei) bufSize, 
     *                                        (GLint) *params);

     **/
    private static native void nGLGetInternalformativ(int target, 
	        	      int internalformat, 
	        	      int pname, 
	        	      int bufSize, 
        		     int[] params, int offset);/*    
    	glGetInternalformativ((GLenum) target,
    	        	      (GLenum) internalformat,
    	        	      (GLenum) pname,
    	        	      (GLsizei) bufSize,
    	        	      (GLint *) (params + offset));
    */

    /**
     * <pre>
     * Delegate Method generated from GLES30.glGetInternalformativ(
     * [int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params]);
     * 
     *  C function void glGetInternalformativ((GLenum) target, 
     *                                        (GLenum) internalformat, 
     *                                        (GLenum) pname, 
     *                                        (GLsizei) bufSize, 
     *                                        (GLint) *params)

     **/
    public void glGetInternalformativ(int target, 
                                      int internalformat, 
                                      int pname, int bufSize, 
                                      java.nio.IntBuffer params) {
        checkBuffer(params, bufSize, PARAMS);
        int offset = getOffset(params);
        if (params.isDirect()) {            
            nGLGetInternalformativ(target, internalformat, pname, bufSize, params, offset);            
        } else {
            int[] array = params.array();
            nGLGetInternalformativ(target, internalformat, pname, bufSize, array, offset); 
        }        
    }

    /**
     * <pre>
     * Native method generated from GLES30.glGetInternalformativ(
     * [int target, int internalformat, int pname, int bufSize, java.nio.IntBuffer params]);
     * 
     *  C function void glGetInternalformativ((GLenum) target, 
     *                                        (GLenum) internalformat, 
     *                                        (GLenum) pname, 
     *                                        (GLsizei) bufSize, 
     *                                        (GLint) *params)

     **/
    private static native void
            nGLGetInternalformativ(int target,
                                   int internalformat,
                                   int pname,
                                   int bufSize,
                                   java.nio.IntBuffer params, int offset);/*    
         		glGetInternalformativ(  (GLenum) target, 
        	        (GLenum) internalformat, 
        		(GLenum) pname, 
        		(GLsizei) bufSize, 
        		(GLint *) (params + offset));    
    */
    
    
    protected static String IDS = "ids";   
    protected static String ATTACHMENTS = "attachments";
    protected static String UNIFORM_INDICES = "uniformIndices";
    protected static String BINARY = "binary";
    protected static String BUFS = "bufs";
    protected static String ARRAYS = "arrays";
    
    
}
