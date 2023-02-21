package chapter01;

public class Java01_HelloWrod {
    public static void main(String[] args) {
        // TODO    流程控制
        // java种的流程控制主要分三种
//        // 1.顺序控制
//        int i =10;
//        int j =10;
//        System.out.println(i+j);//20
//        // 1.分支控制
//            //1.1单分支
//            if (i==10){
//                System.out.println(i++);//10
//            }
//                System.out.println(i);//11
//            //1.2多分支
//            if (i == 20){
//                System.out.println(i++);
//            }else if (i == 30){
//                System.out.println(i--);
//            }
//                System.out.println(i);//11
//        int z = 20;
//            //1.3特殊分支
//            switch (z){
//                case 10 :
//                    System.out.println(z++);//11
//                case 20 :
//                    System.out.println(z--);//10
//                case 30 :
//                    System.out.println(z+10);//20
//                default:
//                    System.out.println("其他数");
//            }
//        System.out.println(z);//11
        // 3.重复控制
            //3.1   while : 有条件循环
//        int i = 10;
//            while (i < 20){
//                System.out.println("循环代码");
//                i++;
//            }
//            //3.1   do  while
//            do {
//                System.out.println("循环代码");
//                i++;
//            } while (i <20);
            //3.3   for
            for (int i1 = 0;i1 < 10;i1++){
                System.out.println("循环代码");
            }
    }
}
