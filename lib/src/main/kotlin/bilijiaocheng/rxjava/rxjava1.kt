package bilijiaocheng.rxjava

//手写RXJava ， 全部使用Kotlin
fun main() {
    // create 输入源：没有任何参数给你   输出源：你是输出就行 （所有类型 ， 万能类型）

    create{
        "asdfg"
        123
        true
    }

}
// 中转站，保存记录
class   RXJavaCoreClassObject() //主构造，接收你传递过来的信息， 此信息就是create最后一行的返回
{

}
inline fun <OUTPUT> create(action:() ->OUTPUT) : RXJavaCoreClassObject{

}