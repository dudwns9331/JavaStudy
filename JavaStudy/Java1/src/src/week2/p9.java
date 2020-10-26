package src.week2;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double init = 5000;
        double charge = init;
        while(true) {

            System.out.println("ATM프로그램입니다. 번호를 입력하세요.");
            System.out.println("잔액 확인 :\t\t1");
            System.out.println("현금 인출 :\t\t2");
            System.out.println("입금 :\t\t\t3");
            System.out.println("종료 :\t\t\t4");
            System.out.print("번호 선택 : ");

            int n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("잔액은 " + charge + "원입니다.");
                    break;

                case 2:
                    System.out.print("금액은 ? ");
                    double out = input.nextDouble();
                    charge = charge - out;
                    if (charge > out) {
                        System.out.println("돈을 받으세요.");
                        System.out.println("잔액은 " + charge + "원입니다.");
                    } else
                        System.out.println("돈이 모자랍니다.");
                    break;

                case 3:
                    System.out.print("금액은 ? ");
                    double in = input.nextDouble();
                    charge = charge + in;
                    System.out.println("잔액이 " + charge + "원이 되었습니다.");
                    break;

                case 4:
                    System.out.println("감사합니다.");
                    System.exit(1);
                    break;

                default:
                    System.out.println("올바르지 않은 번호입니다.");
            }
        }
    }
}
