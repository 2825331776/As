#include <jni.h>
#include <string>
#include "android/log.h"
#define LOG_TAG "===jpegext==="
#define LOGD(...) __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_as_1jin1_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Droyit";
    return env->NewStringUTF(hello.c_str());
}

extern "C"//下面的代码采用C 的编译方式
JNIEXPORT void JNICALL
Java_com_example_as_1jin1_Jin_changname(JNIEnv *env, jobject JinThis) {

    jclass Jniclls=env->FindClass("com/example/as_jin1/Jin");

    //jfieldID GetFieldID(jclass clazz, const char* name, const char* sig)
    jfieldID fieldID=env->GetFieldID(Jniclls,"name", "Ljava/lang/String;");

    //void SetObjectField(jobject obj, jfieldID fieldID, jobject value)
    jstring value =env->NewStringUTF("Beyond");
    env->SetObjectField(JinThis,fieldID,value);

}

extern "C"
JNIEXPORT void JNICALL
Java_com_example_as_1jin1_Jin_changage(JNIEnv *env, jclass clazz) {
//    jclass Jniclls=env->FindClass("com/example/as_jin1/Jin");
    jfieldID agefid=env->GetStaticFieldID(clazz, "age", "I");
    int age=env->GetStaticIntField(clazz,agefid);
    env->SetStaticIntField(clazz,agefid,age+10);

}

extern "C"
JNIEXPORT void JNICALL
Java_com_example_as_1jin1_Jin_changnumber(JNIEnv *env, jobject thiz) {


    jclass numcalss = env->FindClass("com/example/as_jin1/Jin");
    jfieldID numfielid = env->GetFieldID(numcalss,"number", "D");
    //void SetDoubleField(jobject obj, jfieldID fieldID, jdouble value);
    env->SetDoubleField(thiz,numfielid,20752.03);

    jfieldID numfielid2 = env->GetFieldID(numcalss,"number2", "D");
    env->SetDoubleField(thiz,numfielid2,99999.99);
    double result = env->GetDoubleField(thiz,numfielid2);

    LOGD("result:%lf\n",result);

}

extern "C"
JNIEXPORT void JNICALL
Java_com_example_as_1jin1_Jin_calladdmathod(JNIEnv *env, jobject thiz) {
    jclass addclass = env->GetObjectClass(thiz);

    jmethodID addmid= env->GetMethodID(addclass,"add", "(II)I");

    int result = env->CallIntMethod(thiz,addmid,100,2000);

    LOGD("result:%d\n",result);


}