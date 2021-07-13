package ro.btrl.miswsclient.mobileacademy.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Employee extends Thread{
    int no;
    private static Lock lock = new ReentrantLock();
    private static int deposit = 0;

    public Employee(int no) {
        this.no = no;
    }

    public void addMoney(int amount) {
        lock.lock();
        deposit += amount;
        lock.unlock();
    }

    @Override
    public void run() {
        System.out.println("before" + deposit);
        addMoney(10);
        System.out.println("after" + deposit);
//        System.out.println("Employee " + this.no + " arrived at work" + " ");
    }
}
