import java.sql.SQLOutput

// TODO 45. Kotlin语言的replace完成加密解密操作

fun main() {
        val sourcePwd = "ASDFGHJKL"
    //原始密码
    println(sourcePwd)
    //加密
 val newPwd = sourcePwd.replace(Regex("[ADGK]")){
//     it.value
     when (it.value){
         "A" -> "2"
         "D" -> "1"
         "G" -> "5"
         "K" -> "6"
         else -> it.value
     }
 }
    println("加密后的密码：$newPwd")
    //解密
    val sourcePwdNew = newPwd.replace(Regex("[2156]")){
        when(it.value){
            "2" -> "A"
            "1" -> "D"
            "5" -> "G"
            "6" -> "K"
            else -> it.value
        }
    }
    println("解密后的密码：$sourcePwdNew")
}
