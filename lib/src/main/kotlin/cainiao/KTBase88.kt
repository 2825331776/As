
class KTBase88 constructor(name: String) {  // 类名为 KTBase88
    // 大括号内是类体构成
    var url: String = "http://www.baidu.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: ${name}")
    }

    // 次构造函数
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }
}
//---------------------------------------------------------------
class Outer {
    private val bar: Int = 1
    var v = "成员属性"
    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }

}
//---------------------------------------------------------------
class  Test{
    var v = "成员属性"

    fun  setInterFace(test:TestInterFace){
        test.test()
    }
}

interface  TestInterFace{
    fun  test()
}

//--------------------------------------------------------------
/**用户基类**/
open class Person1(name:String){
    /**次级构造函数**/
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**子类继承 Person 类**/
class Student:Person1{

    /**次级构造函数**/
    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}


fun main(args: Array<String>) {


    val runoob =  KTBase88("百度搜索" , 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()

    println("------------------------------------------")

    val demo = Outer().Inner().foo()
    println(demo) //   1
    val demo2 = Outer().Inner().innerTest()
    println(demo2)   // 内部类可以引用外部类的成员，例如：成员属性

    println("------------------------------------------")

    var  test = Test()
    /*
    采用对象表达式来创建接口对象，即匿名内部类的实例
     */
    test.setInterFace(object : TestInterFace{
        override fun test(){
            println("对象表达式创建匿名内部类的实例")
        }
    })

    println("------------------------------------------")

    var s =  Student("Runoob", 18, "S12345", 89)
}