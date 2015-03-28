#include <examples.Adder.h>
JNIEXPORT void JNICALL Java_examples_Adder_add(JNIEnv* env, jclass clazz, jfloatArray obj_values, jint offset, jint numElements, jfloat v) {
	float* values = (float*)env->GetPrimitiveArrayCritical(obj_values, 0);


//@line:24

	     for(int i=offset; i < numElements; i++){
	       values[i] += v;
	     }	         
	
	env->ReleasePrimitiveArrayCritical(obj_values, values, 0);

}

JNIEXPORT void JNICALL Java_examples_Adder_print(JNIEnv* env, jclass clazz, jstring obj_str) {
	char* str = (char*)env->GetStringUTFChars(obj_str, 0);


//@line:30

	   
	   printf(str);
	 
	
	env->ReleaseStringUTFChars(obj_str, str);

}

