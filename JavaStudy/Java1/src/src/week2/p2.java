package src.week2;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("사칙 연산을 하는 프로그램 입니다.");
        System.out.print("두 수를 차례로 입력하시오 : ");

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        System.out.println("두 수에 어떤 연산을 하시겠습니까?");
        System.out.print("+ - * / 중 하나를 입력하시오 : ");

        String operator = input.next();

        double result = 0.0;

        switch (operator) {

            case "+":
                result = n1 + n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;

            case "-":
                result = n1 - n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;

            case "*":
                result = n1 * n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;

            case "/":
                result = n1 / n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;

            default:
                System.out.println("지원하지 않는 연산입니다.");
                System.exit(-1);
        }
    }
}
