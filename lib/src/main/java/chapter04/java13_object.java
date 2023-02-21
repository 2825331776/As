package chapter04;

public class java13_object {
    public static void main(String[] args) {

        // todo 面向对象 --多态
        ren r = new ren();
        r.test();

        ren b = new boy();
        b.test();

        ren g = new gir();
        g.test();
//        g.testgir();
        gir g1= new gir();
        g1.testgir();

    }
}
class ren{
    void test(){
        System.out.println("test ...");
    }
}
class boy extends ren{
    void testboy(){
        System.out.println("boy ...");
    }
}
class gir extends ren{
    void testgir(){
        System.out.println("gir ....");
    }

}