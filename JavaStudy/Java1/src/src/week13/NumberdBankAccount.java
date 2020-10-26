package src.week13;

public class NumberdBankAccount {
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 1000;

    public NumberdBankAccount() {
        balance = 0.0;
        accountNumber = nextAccountNumber++;
    }

    public NumberdBankAccount(double initialBalance) {
        balance = initialBalance;
        accountNumber = nextAccountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, NumberdBankAccount other) {
        balance = balance - amount;
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "NumberdBankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

}
