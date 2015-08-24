
#include <stdio.h>

#if defined(_WIN32) || defined(__VC32__) && !defined(__CYGWIN__) && !defined(__SCITECH_SNAP__) /* Win32 and WinCE */
#define WIN32_OS 1
#endif

#if WIN32_OS
 #include <windows.h>
#endif

#include "dll.h"

#if WIN32_OS
//extern "C" BOOL WINAPI DllMain(HINSTANCE hinstDLL, DWORD Reason, LPVOID LPV) {
//This one was only necessary if you were using a C++ compiler

BOOL WINAPI DllMain(HINSTANCE hinstDLL, DWORD fdwReason, LPVOID lpvReserved) {

    switch (fdwReason)
    {
        case DLL_PROCESS_ATTACH:
            // Code to run when the DLL is loaded
        printf ("Load working...\n");
            break;

        case DLL_PROCESS_DETACH:
            // Code to run when the DLL is freed
        printf ("Unload working...\n");
            break;

        case DLL_THREAD_ATTACH:
            // Code to run when a thread is created during the DLL's lifetime
        printf ("ThreadLoad working...\n");
            break;

        case DLL_THREAD_DETACH:
            // Code to run when a thread ends normally.
        printf ("ThreadUnload working...\n");
            break;
    }

    return TRUE;
} 


#endif

#if defined ( __GNUC__ ) || defined(__GNUG__)
static void __attribute__((constructor))
your_lib_init(void)
{
    fprintf(stderr, "GCC library init\n");
}

static void __attribute__((destructor))
your_lib_destroy(void)
{
    fprintf(stderr, "GCC library destroy\n");
}

#endif

