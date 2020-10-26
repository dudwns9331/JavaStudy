package src.week13;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount(1000.0);

        System.out.println("첫 계좌 잔액 예상액 = 400.0");
        bankAccount1.deposit(500.0);
        bankAccount1.withdraw(100.0);
        System.out.println("첫 계좌 잔액 = " + bankAccount1.getBalance());

        System.out.println("두번째 계좌 잔액 예상액 = 1400.0");
        bankAccount2.deposit(500.0);
        bankAccount2.withdraw(100.0);
        System.out.println("두번째 계좌 잔액 = " + bankAccount2.getBalance());
    }
}
