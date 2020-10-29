package week3.list;

public class BankAccount implements Measurable{

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("BankAccount[balance = %.1f]", balance);
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
