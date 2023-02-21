package charpter09;

public class java02_Thread {
    public static void main(String[] args) throws Exception {
        // todo 线程 --执行方式（串行，并发）
        //串行执行：多个线程连接成串，然后按照顺序执行
        //并发执行：多个线程独立运行，谁抢到CPU的执行权，谁就执行
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
        //将线程连接成串
        t1.join();
        t2.join();

        System.out.println("main 主线程运行完毕");
    }
}
// todo 第一个线程类
class MyThread1 extends Thread{
    //重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread -1 : "+Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread{
    //重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread -2 : "+Thread.currentThread().getName());
    }
}