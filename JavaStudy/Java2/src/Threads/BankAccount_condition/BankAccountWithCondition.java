package Threads.BankAccount_condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWithCondition {

    public static final double MAX_BALANCE = 100000;

    private double balance = 0.0;

    private Lock balanceLock =new ReentrantLock();
    private Condition condition = balanceLock.newCondition();

    public void deposit(double amount) {
        balanceLock.lock();
        try {
            balance += amount;
            System.out.println("입금 후 잔액: " + balance);
            condition.signalAll();
        } finally {
            balanceLock.unlock();
        }
    }

    public void withdraw(double amount) {
        balanceLock.lock();
        try {
            while(balance < amount) {
                try {
                    condition.await();
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