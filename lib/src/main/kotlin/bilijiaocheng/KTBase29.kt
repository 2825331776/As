// TODO 29. Kotlin语言的 在函数定义参数是函数的函数
fun main() {
   //
    loginAPI("THERYS","1234566"){ msg : String, code: Int ->
        println("最终登录情况如下 ： msg : $msg , code : $code")
    }
}
// 模拟数据库 ： SQLServer
const val USER_NAME_SAVE_DB = "THERYS"
const val USER_PWD_SAVE_DB = "123456"

//登录API 模仿 前端
inline fun loginAPI(username : String, userpwd : String ,reponseResult : (String ,Int) -> Unit){
    if (username == null || userpwd == null){
        TODO("用户名或密码为空")
    }
    if (username.length > 3 && userpwd.length > 3 ){
        if (wbeServiceLoginAPI(username,userpwd)){
            reponseResult("登录成功",210515)
        }else{
            reponseResult("登录失败 ，用户名或密码错误",5555)
        }
    }else{
        TODO("用户名和密码不规范")
    }
}
 fun wbeServiceLoginAPI (name : String,pwd : String) : Boolean{
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
}