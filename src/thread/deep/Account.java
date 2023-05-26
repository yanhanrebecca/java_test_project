package thread.deep;

import com.sun.source.tree.SynchronizedTree;

public class Account {
    private double balance;
    public Account(){};
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public synchronized void draw(double drawAmount){//如果取钱数大于余额，则取钱方法阻塞
        while (drawAmount > balance){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //执行取钱
        System.out.println(Thread.currentThread().getName() + " 取钱： " + drawAmount);
        balance -= drawAmount;
        System.out.println("账户余额为： " + balance);
    }
    public synchronized void deposite(double depositAmount){
        System.out.println(Thread.currentThread().getName() + " 存款： " + depositAmount);
        balance += depositAmount;
        System.out.println("账户余额为： " + balance);
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        notifyAll();
    }
}
