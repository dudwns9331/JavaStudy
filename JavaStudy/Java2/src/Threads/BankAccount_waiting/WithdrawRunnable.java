package Threads.BankAccount_waiting;

/**
 * 반복적으로 BankAccount에서 출금을 하는 Runnable 클래스.
 */
public class WithdrawRunnable implements Runnable {

    private static final int DELAY = 1;
    private BankAccountWaiting account;
    private double amount;
    private int count;

    public WithdrawRunnable(BankAccountWaiting anAccount, double anAmount, int c) {
        account = anAccount;
        amount = anAmount;
        this.count = c;
    }

    public void run() {
        try {
            for (int i = 1; i <= count; i++) {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException exception) {
        }
    }
}