package chapter04;

public class java15_object {
    public static void main(String[] args) {
//        aaa AAA = new bbb();
//        test(AAA);
        bbb AAA = new bbb();
        test(AAA);
    }
    static void test(aaa AAA){
        System.out.println("AAA");
    }
    static void test(bbb BBB){
        System.out.println("BBB");
    }
}
class aaa{

}
class bbb extends aaa{

}