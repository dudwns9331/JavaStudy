package src.week13;

public class NumberedBankAccountTest {
    public static void main(String[] args) {
        NumberdBankAccount numberdBankAccount1 = new NumberdBankAccount(1000.0);
        NumberdBankAccount numberdBankAccount2 = new NumberdBankAccount();

        System.out.println("account1 : " + numberdBankAccount1.toString());
        System.out.println("account2 : " + numberdBankAccount2.toString());

        System.out.println("300원 계좌이체 : account1 --> account2");

        numberdBankAccount1.transfer(300, numberdBankAccount2);

        System.out.println("account1 : " + numberdBankAccount1.toString());
        System.out.println("account2 : " + numberdBankAccount2.toString());

    }
}
