package chapter04;

public class java_dengchashuli {
    public static void main(String[] args) {

       int result= computeFunmt(5);
        System.out.println(result);

    }
    public static int computeFunmt( int num ){
        if (num <= 1){
            return 1;
        }else {
            return num * computeFunmt(num -1);
        }
    }
    public static int computeAp( int num ){
        num = num % 2 == 0 ? num - 1 : num ;
        if (num == 1){
            return 1;
        }else {
            return num + computeAp(num -2);
        }
    }
}
