package provaThread;

import EsBancaLast.Bank;
import EsBancaLast.BankAccount;

public class BankAccountCondiviso{
    private float balance;

    public BankAccountCondiviso(){
        this.balance = 0.0f;
    }

    public /*synchronized*/ void withdraw(float amount){
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " prelievo di " + amount);
            for (int i = 0; i<10;i++){
                System.out.println(Thread.currentThread().getName() + " CIAOOOO: " + i);
            }
            balance = balance - amount;
        }
    }

    public synchronized void deposit(float amount){
        System.out.println(Thread.currentThread().getName() + " deposito di " + amount);
        balance = balance + amount;
    }
}

class threadDeposito extends Thread{
    BankAccountCondiviso a;
    float amt;
    public threadDeposito(BankAccountCondiviso t, float amount){
        this.a = t;
        this.amt = amount;

    }
    public void run(){
        a.deposit(amt);
    }

}

class threadPrelievo extends Thread{
    BankAccountCondiviso a;
    float amt;
    public threadPrelievo(BankAccountCondiviso t, float amount){
        this.a = t;
        this.amt = amount;

    }
    public void run(){
        a.withdraw(amt);
    }

}

class Synchronization_Example1{
    public static void main(String args[]){
        BankAccountCondiviso obj = new BankAccountCondiviso();//only one object
        threadDeposito t1 = new threadDeposito(obj,100);
        threadPrelievo t2 = new threadPrelievo(obj,50);
        threadDeposito t3 = new threadDeposito(obj,100);
        threadDeposito t4 = new threadDeposito(obj,100);
        threadDeposito t5 = new threadDeposito(obj,100);
        threadDeposito t6 = new threadDeposito(obj,100);
        threadDeposito t7 = new threadDeposito(obj,100);
        threadDeposito t8 = new threadDeposito(obj,100);
        threadDeposito t9 = new threadDeposito(obj,100);
        threadDeposito t10 = new threadDeposito(obj,100);
        threadDeposito t11 = new threadDeposito(obj,100);
        threadDeposito t12 = new threadDeposito(obj,100);
        threadDeposito t13 = new threadDeposito(obj,100);
        threadDeposito t14 = new threadDeposito(obj,100);
        threadDeposito t15 = new threadDeposito(obj,100);
        threadDeposito t16 = new threadDeposito(obj,100);
        threadDeposito t17 = new threadDeposito(obj,100);
        threadPrelievo t18 = new threadPrelievo(obj,50);
        threadPrelievo t19 = new threadPrelievo(obj,50);
        threadPrelievo t20 = new threadPrelievo(obj,50);
        threadPrelievo t21 = new threadPrelievo(obj,50);
        threadPrelievo t22 = new threadPrelievo(obj,50);
        threadPrelievo t23 = new threadPrelievo(obj,50);
        threadPrelievo t24 = new threadPrelievo(obj,50);



        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t20.start();
        t21.start();
        t22.start();
        t23.start();
        t24.start();
    }
}

