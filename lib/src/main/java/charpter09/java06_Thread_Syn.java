package charpter09;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java06_Thread_Syn {
    public static void main(String[] args) throws Exception {
        // todo 线程 --同步
        // 同步关键字 synchronized
        //多线程访问同步方法时，只能一个一个访问，同步操作
        //new HashMap<>();
        //synchronized还可以修饰代码块，称为同步代码块
        /*
        synchronized（用于同步的对象）{
                处理逻辑
        }
         */
        Num num = new Num();

        User user = new User(num);
        user.start();

        Bank bank = new Bank(num);
        bank.start();
    }
}
class Num{

}
class Bank extends Thread{
    private Num num;
    public Bank(Num num){
        this.num=num;
    }
    public void run(){

        synchronized (num){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("9:00 ,开门，开始叫号");
            num.notifyAll();
        }
    }
}
class User extends Thread{
//    public synchronized void test(){
//
//    }
    private Num num;
    public User(Num num){
        this.num=num;
    }
    public void run(){
        synchronized (num){
            System.out.println("我的号码是1，银行还没有开门，我还要等一会");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("叫到我的号了，该我办理业务");
        }
    }
}

