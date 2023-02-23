//TODO 58.Kotlin 语言的list集合学习
@Suppress("SuspiciousIndentation")
fun main() {
    //可变集合
    val list = mutableListOf("zxc","vbn","asd")
    list.add("qwe")
    list.remove("zxc")
    println(list)

    //不可变集合
    val list2 = listOf(123,456,789)
    //无法进行修改
//    list2.add
    println(list2)
    //进行转换为可变
    val list3 : MutableList<Int> = list2.toMutableList()
        list3.add(147)
        list3.remove(123)
    println(list3)

    //转化为不可变
    val list4 = list.toList()
    //无法进行修改
    //list4.add
    println(list4)
}