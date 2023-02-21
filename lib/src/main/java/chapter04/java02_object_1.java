package chapter04;

public class java02_object_1 {
    public static void main(String[] args) {

        // todo 面向对象
        Teacher t = new Teacher();
        t.name = "张三";
        t.tech();

        Student s = new Student();
        s.name = "lisi";
        s.study();
    }
}
class Teacher{
    String name;

    void tech(){
        System.out.println( name + "老师在讲课" );
    }

}
class Student{
    String name;

    void study(){
        System.out.println("同学" + name + "在讲课" );
    }

}

