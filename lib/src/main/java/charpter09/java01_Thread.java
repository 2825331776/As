package charpter09;

import java.nio.channels.NonReadableChannelException;

public class java01_Thread {
    public static void main(String[] args) {
        // todo 线程
        //Thread是线程类
        //currentThread 方法用于获取当前正在运行的线程
        System.out.println(Thread.currentThread().getName());

        //todo 创建线程
//        Thread t = new Thread();
        MyThread t = new MyThread();
        //todo 启动线程
        t.start();
    }
}
// todo 自定义线程类
class MyThread extends Thread{
    //重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread : "+Thread.currentThread().getName());
    }
}