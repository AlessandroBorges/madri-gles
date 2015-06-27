//Hi,
// For native drawing on awt Canvas, it's necessary to get JAWT's drawingSurface and lock it, as shown below:

    JNIEXPORT void JNICALL
    Java_MyCanvas_paint(JNIEnv* env, jobject canvas, jobject graphics)
     {
         JAWT awt;
         JAWT_DrawingSurface* ds;
         JAWT_DrawingSurfaceInfo* dsi;
         JAWT_Win32DrawingSurfaceInfo* dsi_win;
         jboolean result;
         jint lock;
    
         // Get the AWT
         awt.version = JAWT_VERSION_1_3;
         result = JAWT_GetAWT(env, &awt);
         assert(result != JNI_FALSE);
         // Get the drawing surface
         ds = awt.GetDrawingSurface(env, canvas);
         assert(ds != NULL);
    
         // Lock the drawing surface
         lock = ds->Lock(ds);
         assert((lock & JAWT_LOCK_ERROR) == 0);
    
         // Get the drawing surface info
         dsi = ds->GetDrawingSurfaceInfo(ds);
    
         // Get the platform-specific drawing info
         dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
    
         //////////////////////////////
         // !!! DO PAINTING HERE !!! //
         //////////////////////////////
    
         // Free the drawing surface info
         ds->FreeDrawingSurfaceInfo(dsi);
    
         // Unlock the drawing surface
         ds->Unlock(ds);
    
         // Free the drawing surface
         awt.FreeDrawingSurface(ds);
    }

But, since jdk 1.4 there is another Lock()/Unlock() pair, but for JAWT:

    /*
     * JAWT
     * Structure for containing native AWT functions.
     */
    typedef struct jawt { 
     (...)
    /*
     * Since 1.4
     * Locks the entire AWT for synchronization purposes
     */
    void (JNICALL *Lock)(JNIEnv* env);
    /*
     * Since 1.4
     * Unlocks the entire AWT for synchronization purposes
     */
    void (JNICALL *Unlock)(JNIEnv* env);
    (...)
    } JAWT;