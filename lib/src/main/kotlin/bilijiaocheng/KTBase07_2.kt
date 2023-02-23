// TODO 07. Kotlin语言的声明与内置函数
fun main() {
   // 创建函数
    //第一步函数的输入和输出的声明        第二步： 对声明的函数进行实现
    val methodAction : ( Int , Int , Int ) -> String ={ number1 ,number2 , number3 ->
        val  inputValue = 99999
        "$inputValue Derry 参数一： $number1, 参数二 ： $number2 , 参数三 ： $number3"
    }
    //第三步：函数调用
    println(methodAction(21, 5, 15))
}
