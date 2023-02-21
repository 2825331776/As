package chapter04;

public class java08_object_static {
    public static void main(String[] args) {

        // TODO 面向对象
        //把与对象无关，只和类相关的称之为静态
        //和类相关的属性称之为静态属性
        //和类相关的方法称之为静态方法
        //先有类，再有对象
        //成员方法，可以访问静态属性，和静态方法（反之不行）
        Test t = new Test();
        t.name = "xiaolan";
        t.sex = "女";
        t.test();
        t.test1();
        Test.test1();
    }

}
class Test{
    String name;
    static String sex;

    void test(){
        test1();
        System.out.println(name);
    }
    static void test1(){
        System.out.println("test1..."+ sex);
    }
}
