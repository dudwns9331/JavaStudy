package Threads.bankaccount_sync;

import Threads.BankAccount.DepositRunnable;
import Threads.BankAccount.WithdrawRunnable;

/**
 * 반복적으로 BankAccount에 입금을 하는 스레드 여러 개와
 * 반복적으로 BankAccount에서 출금을 하는 스레드 여러 개를
 * 실행시키는 프로그램.
 */
public class BankAccountThreadRunner {

    public static void main(String[] args) {

        SynchronizedBankAccount account = new SynchronizedBankAccount();

        final double AMOUNT = 100;	// 거래 금액.
        final int REPETITIONS = 10;	// 입금 혹은 출금 반복 횟수.

        final int DEPOSIT_THREADS = 10;	// 입금 스레드 갯수.
        final int WITHDRAW_THREADS = 2;	// 출금 스레드 갯수.

        for (int i = 0; i < DEPOSIT_THREADS; i++) {
            DepositRunnable d = new DepositRunnable(account, AMOUNT,
                    REPETITIONS);
            Thread t = new Thread(d);
            t.start();
        }

        // 입금 스레드 갯수가 출금 스레드 갯수보다 5배 많으면
        // 각 출금 스레드가 출금을 반복하는 횟수를 5배 많게 하여
        // 전체 입금액과 출금액이 서로 같게 해 준다.
        for (int i = 0; i < WITHDRAW_THREADS; i++) {
            WithdrawRunnable d = new WithdrawRunnable(account, AMOUNT,
                    REPETITIONS * DEPOSIT_THREADS / WITHDRAW_THREADS);
            Thread t = new Thread(d);
            t.start();
        }
    }
}