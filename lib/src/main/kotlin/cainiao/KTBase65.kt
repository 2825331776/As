package cainiao

fun vars(vararg v : Int){
    for (vt in v){
        println(vt)
    }
}
fun paresInt (str : String) : Int?{
    return str.toIntOrNull()
}
fun printProduct(arg1 : String , arg2 : String){
    val x = paresInt(arg1)
    val y = paresInt(arg2)

    //直接使用‘x’ * ‘y’ 会导致错误， 因为它们可能为null
    if (x !== null && y !== null){
        //在进行过null 值检查之后， x和y 的类型会自动转换为非 null 变量
        println(x * y)
    }else{
        println("$arg1 or $arg2 is not a number")
    }
}
fun getStringLength(obj: Any): Int?
{
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }
    return null
}
fun getStringLength1(obj: Any): Int? {
    if (obj !is String)
        return null
    // 在这个分支中, `obj` 的类型会被自动转换为 `String`
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
    if (obj is String && obj.length > 0)
        return obj.length
    return null
}

class Person {

    var lastName: String = "zhang"
        get() = field.toUpperCase()   // 将变量赋值后转换为大写
        set

    var no: Int = 100
        get() = field                // 后端变量
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }

    var heiht: Float = 145.4f
        private set
}
fun main() {
    var person: Person = Person()

    person.lastName = "wang"
 
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

//    val a: Int = 10000
//    println(a === a) // true，值相等，对象地址相等
//
//    //经过了装箱，创建了两个不同的对象
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//
//    //虽然经过了装箱，但是值是相等的，都是10000
//    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
//    println(boxedA == anotherBoxedA) // true，值相等

//    print("循环输出：")
//    for (i in 1..4) print(i) // 输出“1234”
//    println("\n----------------")
//    print("设置步长：")
//    for (i in 1..4 step 2) print(i) // 输出“13”
//    println("\n----------------")
//    print("使用 downTo：")
//    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
//    println("\n----------------")
//    print("使用 until：")
//    // 使用 until 函数排除结束元素
//    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
//        print(i)
//    }
//    println("\n----------------")

//    println(getStringLength("asd"))
//    println(getStringLength1("zxc"))
//    println(getStringLength2("qwe"))

//    printProduct("6","7")
//    printProduct("a", "7")
//    printProduct("99", "b")
//vars(1,2,3,4,5)
//    val sumLambda : (Int,Int) -> Int = {x,y ->x+y}
//    val sumLambda = {x : Int,y : Int ->x+y}
//    println(sumLambda(4, 5))

//类型后面加?表示可为空
//    var age: String? = null
//抛出空指针异常
////    val ages = age!!.toInt()
////不做处理返回 null
//    val ages1 = age?.toInt()
////age为空返回-1
//    val ages2 = age?.toInt() ?: -1
//    println(age)
////    println(ages)
//    println(ages1)
//    println(ages2)

}