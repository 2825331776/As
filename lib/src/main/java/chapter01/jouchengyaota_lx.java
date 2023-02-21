package chapter01;

public class jouchengyaota_lx {
    public static void main(String[] args) {
        int y = 9;
        for (int i = 0; i < y ; i++ ){
            for (int x = 0; x < (y-1) - i  ;x++){
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1 ;j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
