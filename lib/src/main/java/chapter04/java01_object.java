package chapter04;

public class java01_object {
    public static void main(String[] args) {

        // todo 面向对象
        //所谓的面向对象，其实就是分析问题时，以问题涉及到的事或物为中心的分析方式
        //类和对象
        //类表示归纳和整理
        //对象表示具体的事物
        //TODO class（类）
        /*
           创建类基本语法结构：

           class 类名{
                特征（属性），
                功能（方法）
           }

            创建对象的语法：
            new 类名()；
        */
        //问题： 做一道菜，红烧排骨
        //类：菜    对象：红烧排骨

        //todo 1. 先声明类
        //todo 2. 创建对象
        //todo 3. 声明属性，所谓的属性其实就是类中的变量
        //todo 4. 声明方法
        //          void 方法名（参数）{功能代码 }
        //todo 5. 执行方法
        //            对象.方法名
        Cooking cooking = new Cooking();
        cooking.name = "红烧排骨";
        cooking.food = "排骨";

        cooking.execute();

    }
}
class  Cooking{
    //特征（属性）
    //名字
    String name;
    //菜的类型
    String type = "红烧";
    //食物
    String food;
    //佐料
    String relish = "大料";
    //todo 执行
    void execute(){
        System.out.println("准备食材:" + food);
        System.out.println("准备佐料:"+ relish);
        System.out.println("开始烹饪："+ type);
        System.out.println("烹饪完成:"+ name);
    }
}
