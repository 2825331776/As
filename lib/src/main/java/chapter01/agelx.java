package chapter01;

public class agelx {
    public static void main(String[] args) {
        int age = 30;
        //请按照年龄判断，属于那个阶段
        //儿童（0~6），少年（7~17），青年（18~40），中年（41~65），老年（66以上）
//        if (age<7){
//            System.out.println("儿童");
//        } else if (age >= 7 && age <= 17) {
//            System.out.println("少年");
//        } else if (age >= 18 && age <= 40) {
//            System.out.println("青年");
//        } else if (age >= 41 && age <= 65) {
//            System.out.println("中年");
//        } else if (age >= 66) {
//            System.out.println("老年");
//        }
        if (age<7){
            System.out.println("儿童");
        } else if ( age < 18) {
            System.out.println("少年");
        } else if ( age < 41) {
            System.out.println("青年");
        } else if ( age < 66) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
}
