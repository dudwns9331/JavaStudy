package Threads.BankAccount_waiting;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWaiting {

    public static final double MAX_BALANCE = 100000;

    private double balance = 0.0;

    private Lock balanceLock =new ReentrantLock();

    public void deposit(double amount) {
            balance += amount;
            System.out.println("입금 후 잔액: " + balance);
    }

    public void withdraw(double amount) {
        balanceLock.lock();
        try {
            while(balance < amount) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {}
            }
            balance -= amount;
            System.out.println("출금 후 잔액: " + balance);
        } finally {
            balanceLock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }

}