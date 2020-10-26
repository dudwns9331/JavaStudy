package Threads.bankaccount_sync;

import Threads.BankAccount.BankAccount;

public class SynchronizedBankAccount extends BankAccount {

    public static final double MAX_BALANCE = 100000;

    private double balance = 0.0;

    public synchronized void deposit(double amount) {

        System.out.println(amount + "입금");
        balance += amount;
        System.out.println(" --> 잔액 : " + balance);
    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
        System.out.println("출금 후 잔액: " + balance);
    }

    public double getBalance() {
        return balance;
    }

}