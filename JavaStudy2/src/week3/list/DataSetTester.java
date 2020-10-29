package week3.list;

import java.util.Random;


public class DataSetTester {
    public static void main(String[] args) {
        DataSetTester tester = new DataSetTester();
        tester.test();
    }

    private void test() {

        Random random = new Random();
        Rectangle rectangle;
        DataSet dataSet;

        dataSet = new DataSet();


        for(int i = 0; i < 100; i++) {

            double w = random.nextDouble() * 100.0;
            double h = random.nextDouble() * 100.0;

            rectangle = new Rectangle(w , h);
            dataSet.add(rectangle);

        }

        System.out.println("면적이 가장 큰 Rectangle : " + dataSet.getMaximum());
        System.out.printf("면적이 가장 큰 Rectangle의 면적 : %.1f\n" , dataSet.getMaximum().getMeasure());
        System.out.printf("면적의 평균 : %.1f", dataSet.getAverage());

        System.out.println();
        System.out.println();

        BankAccount bankAccount;

        dataSet = new DataSet();

        for(int i = 0; i < 100; i++) {
            bankAccount = new BankAccount(random.nextDouble() * 10000.0);
            dataSet.add(bankAccount);
        }

        System.out.println("가장 잔액이 많은 계좌 : " + dataSet.getMaximum());
        System.out.println("가장 잔액이 적은 계좌 : " + dataSet.getMinimum());
        System.out.printf("잔액의 평균 : %.1f", dataSet.getAverage());

    }

}
