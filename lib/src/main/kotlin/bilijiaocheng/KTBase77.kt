package bilijiaocheng// TODO Kotlin 语言的构造初始化顺序

//第一步： 生成 val _sex : Char
class KTBase77(_name : String , val _sex : Char){
    //第二步 生成 val mName
//    val mName = _name

    init {
        val nameValue = _name //第三步 ： 生成 nameValue细节
        println("init代码块打印nameValue : $nameValue")
    }
    //次构造 三个参数 必须调用主构造
    constructor(name : String , sex : Char , age : Int) : this(name , sex){
         //第四步 ： 生成次构造细节
        println("生成次构造细节  ， name ： $name, sex : $sex, age : $age")
    }
}


fun main() {
    //调用次构造
    KTBase77("asd",'男',30)
}