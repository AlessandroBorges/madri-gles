#ifndef __MAIN_H__
#define __MAIN_H__


#define WIN32_LEAN_AND_MEAN

#include <windows.h>
#include <stdio.h>

/*  To use this exported function of dll, include this header
 *  in your project.
 */

#ifndef BUILD_DLL
 #define BUILD_DLL

#ifdef BUILD_DLL
    #define DLL_EXPORT __declspec(dllexport)
#else
    #define DLL_EXPORT __declspec(dllimport)
#endif


#ifdef __cplusplus
extern "C"
{
#endif

void DLL_EXPORT SomeFunction(const LPCSTR sometext);

#ifdef __cplusplus
}
#endif

#endif
#endif // __MAIN_H__
