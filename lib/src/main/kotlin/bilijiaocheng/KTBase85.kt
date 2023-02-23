import java.io.File

// TODO Kotlin

open class Person2(private val name : String){
         fun showName() = "父类 的名字是 ： $name"
        open fun myPrintln() =  println(showName())
}
class  Student2 (private val  subName : String) : Person2(subName){
     fun showName2() = "子类 的名字是 ： $subName"
    override fun myPrintln() =  println(showName2())
}
fun main() {
        val p : Person2 = Student2("asd")
        p.myPrintln()

    println(p is Person2)
    println(p is Student2)
    println(p is File)

    //is + as
    if (p is Student2){
        (p as Student2).myPrintln()
    }
    if (p is Person2){
        println((p as Person2).showName())
    }

}