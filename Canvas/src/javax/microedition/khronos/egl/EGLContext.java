/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.microedition.khronos.egl;

import gles.internal.EGL10Impl;
import gles.internal.EGLContextImpl;
import gles.util.EGL14LogWrapper;

import javax.microedition.khronos.opengles.GL;

import android.opengl.GLDebugHelper;

public abstract class EGLContext
{
    public static boolean enableLog = false;
    protected static  EGL EGL_INSTANCE = new EGL10Impl();// EGLContextImpl.getEGL();
    
    public static EGL getEGL() {
        if(enableLog){
            int config = /*GLDebugHelper.CONFIG_CHECK_GL_ERROR | */ GLDebugHelper.CONFIG_LOG_ARGUMENT_NAMES; 
            java.io.Writer writer = new java.io.PrintWriter(System.out);
            return new android.opengl.EGLLogWrapper((EGL10)EGL_INSTANCE, 
                     config,
                     writer);
        }
        return EGL_INSTANCE;
    }

    public abstract GL getGL();
}
