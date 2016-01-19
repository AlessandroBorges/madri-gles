/*
 * Class NativeUtils is published under the The MIT License:
 * 
 * Copyright (c) 2012 Adam Heinrich <adam@adamh.cz>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
// package cz.adamh.utils;

package gles.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.util.Log;

/**
 * 
 * 
 * <p>
 * A simple library class which helps with loading dynamic libraries stored in the
 * JAR archive. These libraries usualy contain implementation of some methods in
 * native code (using JNI - Java Native Interface).
 * </p>
 * 
 * <h3>See:</h3> 
 * <a href="http://adamheinrich.com/blog/2012/how-to-load-native-jni-library-from-jar">adamheinrich.com/blog</a><br>
 * <a href="https://github.com/adamheinrich/native-utils">GitHub.com/adamheinrich/native-utils</a>
 *
 */
public class NativeUtils {
    
    private static final String TAG = "NativeUtils";

    /**
     * Private constructor - this class will never be instanced
     */
    private NativeUtils() {
    }

    /**
     * <p>
     * Loads library from current JAR archive
     * </p><p>
     * The file from JAR is copied into system temporary directory and then loaded. The
     * temporary file is deleted after exiting.
     * Method uses String as filename because the pathname is "abstract", not
     * system-dependent.
     * </p>
     * @param filename The filename inside JAR as absolute path (beginning with '/'), e.g.
     *        /package/File.ext
     *        
     * @throws IOException If temporary file creation or read/write operation fails
     * @throws IllegalArgumentException If source file (param path) does not exist
     * @throws IllegalArgumentException If the path is not absolute or if the filename is
     *         shorter than three characters (restriction of { @see
     *         java.io.File#createTempFile(java.lang.String, java.lang.String)}).
     *         
     *    @see java.io.File#createTempFile(java.lang.String, java.lang.String)
     */
    public static void loadLibraryFromJar(String path) throws IOException {

        if (!path.startsWith("/")) { throw new IllegalArgumentException("The path has to be absolute (start with '/')."); }

        // Obtain filename from path
        String[] parts = path.split("/");
        String filename = (parts.length > 1) ? parts[parts.length - 1] : null;

        // Split filename to prexif and suffix (extension)
        String prefix = "";
        String suffix = null;
        if (filename != null) {
            parts = filename.split("\\.", 2);
            prefix = parts[0];
            suffix = (parts.length > 1) ? "." + parts[parts.length - 1] : null; // Thanks,
                                                                                // davs!
                                                                                // :-)
        }

        // Check if the filename is okay
        if (filename == null || prefix.length() < 3) { throw new IllegalArgumentException(
                "The filename has to be at least 3 characters long."); }

        // Prepare temporary file
        File temp = File.createTempFile(prefix, suffix);
        temp.deleteOnExit();

        if (!temp.exists()) { throw new FileNotFoundException("File " + temp.getAbsolutePath() + " does not exist."); }

        // Prepare buffer for data copying
        byte[] buffer = new byte[1024];
        int readBytes;

        // Open and check input stream
        InputStream is = NativeUtils.class.getResourceAsStream(path);
        if (is == null) { throw new FileNotFoundException("File " + path + " was not found inside JAR."); }

        // Open output stream and copy data between source file in JAR and the temporary
        // file
        OutputStream os = new FileOutputStream(temp);
        try {
            while ((readBytes = is.read(buffer)) != -1) {
                os.write(buffer, 0, readBytes);
            }
        } finally {
            // If read/write fails, close streams safely before throwing an exception
            os.close();
            is.close();
        }

        // Finally, load the library
        System.load(temp.getAbsolutePath());
    }

    /**
     * <P>
     * Load native libs from within this running jar file, with options to:</P> 
     * <li>Load native libs from current path, if available; 
     * <li>Load native libs from full local  path, as running from Eclipse; 
     * <li>Load libs from current runtime jar file, with internal path to native libs;
     * <p>Example:</p> 
     * <pre>  
     * //     
     * load("CanvasLib",          // name of my native lib
     *      "/native/",           // path within jar file 
     *      "C:/Projects/test/"); // absolute path on development environment     
     * </pre>
     * 
     * 
     * 
     * @param libName - Native lib name, as &quot;CanvasLib&quot;, w/o &quot;.dll&quot; or &quot;.so&quot;
     * @param folderPathInJar - The path within jar file. <b> Use slashes !</b>
     * @param devFullPath - Optional path in local development environment.
     */
    public static void load(String libName, String folderPathInJar, String devFullPath) {
        Log.i(TAG, String.format("load( \"%s\", \"%s\",\"%s\" ",libName, folderPathInJar, devFullPath ));        
        try {
            // Look at full devFullPath
            String dllName =  System.mapLibraryName(libName);
            System.load(devFullPath + dllName);
        } catch (UnsatisfiedLinkError exc) {
            System.err.println("load(1) fail on devFullPath. -> " + exc.getMessage());
            try {
                // used for tests. This library is in classpath only
                System.loadLibrary(libName);
            } catch (UnsatisfiedLinkError e) {
                System.err.println("load(2) fail on classpath. -> " + e.getMessage());
                try {
                    // during runtime. .DLL within .JAR
                    NativeUtils.loadLibraryFromJar(folderPathInJar + System.mapLibraryName(libName));
                } catch (IOException e1) {
                    System.err.println("load(3) fail on jar. -> " + e1.getMessage());
                    throw new RuntimeException(e1);
                }
            }
        }
    }
   
    /**
     * <p>
     * Same as {@link #load(String, String, String)}, but for loading several native files at once.</p>
     * 
     * <b>Tip:</b><br>
     * Put the files in reverse order of loading: 
     * <li> First - load all dependencies libs required by your external native libs;
     * <li> Second - load the native lib(s) used by your JNI DLL.
     * <li> at last your JNI DLL. 
     *  
     * @param libName
     * @param folderPathInJar
     * @param devFullPath
     */
    public static void load(String[] libName, String[] folderPathInJar, String[] devFullPath) {
        for (int i = 0; i < libName.length; i++) {
            String _libName = libName[i];
            String _folderPathInJar = folderPathInJar[i];
            String _devFullPath = devFullPath[i];
            
            load(_libName, _folderPathInJar, _devFullPath);
        }
    }    

}
