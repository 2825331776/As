package bilijiaocheng

// 1. 类 isMap map takeIf map是什么类型
class  KTBase105<T> (val isMap :Boolean = false, val inputType : T){
        //模仿Rxjava T是要变化的输入类型   R是变换后的输出类型
        //要去map返回的类型是 R? == 有可能是R 也有可能是null
        inline fun <R> map(mapAction :(T) -> R) = mapAction(inputType).takeIf { isMap }

}
//TODO 105 Kotlin语言泛型转换


fun main() {
    //  2.map int -> str 最终接收的是那种类型
    val p1 = KTBase105(isMap = false /*true*/, inputType = 520)
    val r = p1.map {
        it
        it.toString()
        "最后输出的it是 ： $it "
    }
    println(r is String)
    println(r is String?)
    println(r)
}