package charpter09;

public class java04_Thread {
    public static void main(String[] args) throws Exception {
        // todo 线程 --运行
//        MyThread3 t3 = new MyThread3();
//
//        t3.start();
//
//        Thread.sleep(3000);


        // todo 构建线程对象时，可以只把逻辑传递给这个对象
        //      传递逻辑时，需要遵守规则：（） ->{逻辑代码}
//        Thread t6 = new Thread(()->{
//            System.out.println("t6 线程执行");
//        });
//
//        t6.start();
        // todo 构建线程对象时，可以传递实现了Ru'nnable接口的类的对象，一般使用匿名类
        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t8线程执行");
            }
        });
        t8.start();
        System.out.println("main 线程执行");
    }
}
// todo 自定义线程
// 1. 继承线程类（夫类）
// 2. 重写run方法
class MyThread3 extends Thread{

    @Override
    public void run() {

        System.out.println("t3 线程执行 ");
    }
}
class MyThread4 extends Thread{
        private String threadname;
        public MyThread4(String name){
            threadname = name;
        }
    @Override
    public void run() {
        System.out.println(threadname + "线程执行 ");
    }
}

