package chapter04;

public class java14_object {
    public static void main(String[] args) {

        // todo 面向对象 --方法重载
        test t = new test("asd");
        t.test1(1234567890);
        t.test1("wusosdawd");
        t.test1("laoli","123456");
    }
}
class test{
    test(String naem){
        System.out.println("test ..." + naem);
    }
    test(){
        System.out.println("test ...");
    }
    void test1(String zhanghao,String mima){
        System.out.println("账号，密码");
    }
    void test1(int tel){
        System.out.println("手机号");
    }
    void test1(String wx){
        System.out.println("微信，支付宝");
    }
}