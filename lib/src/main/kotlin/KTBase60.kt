//TODO 58.Kotlin 语言的list集合学习 -- 遍历

fun main() {
   val list = listOf(1,2,3,4,5,6,7,8,9)
    println(list)

    //for 遍历
    for (i in list) {
        print("元素 :$i  ")
    }
    println()
    //forEach遍历
    list.forEach { print("元素 :$it  ") }
    println()
    //forEachIndexed遍历
    list.forEachIndexed{ index , item ->
        print("下标 :$index , 元素 :$item  ")
    }
}