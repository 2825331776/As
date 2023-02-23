// TODO 07. Kotlin语言的声明与内置函数
fun main() {
    println("Hello Word")
    // var 可读可写 val 只读
    // kotlin 能够直接识别 数据类型
//    var name = "drry"
//    name = "lance"
//    println(name)
//    if (name == "drry" || name == "lance"){
//        println("验证成功")
//    }else{
//        println("验证失败")
//    }
    //创建函数
    val methodAction : () -> String = {
        val inputValue = 9999
        "$inputValue derry"
    }
    println(methodAction())
    method01("老六",20)
    show(85)
}
private fun method01(name: String,age : Int){
    println("你的名字是：$name,年龄是：$age")
}
private fun show(number: Int){
    when(number){
        -1 -> TODO("分数错误")
        in 0..59 -> println("分数等级D")
        in 60..70 -> println("分数等级C")
        in 71..89 -> println("分数等级B")
        in 90..100 -> println("分数等级A")
    }
}