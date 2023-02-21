package chapter04;

import java.sql.SQLOutput;

import javax.xml.transform.sax.SAXTransformerFactory;

public class java04_object_extends {
    public static void main(String[] args) {
        //todo 面向对象 继承
      zi z =  new zi();
        System.out.println(z.name);
        z.test();
        z.test1();
    }
}
class fu{
    String name = "lisi";
    void test(){
        System.out.println("夫类");
    }
}
class zi extends fu{
String name = "zhangsan";
void test1(){
    System.out.println(this.name);
    System.out.println(super.name);
}
}