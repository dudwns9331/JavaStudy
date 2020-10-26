package src.week2;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("양수들의 평균을 구하는 프로그램 입니다.");
        System.out.println("입력을 마치려면 0 이하의 수를 입력하시오.");

        System.out.println();
        System.out.println();

        double n;
        double sum = 0;
        int count = 0;

        System.out.print("숫자를 입력하시오 : ");

        while((n = input.nextDouble()) > 0) {
            System.out.print("숫자를 입력하시오 : ");
            sum = sum + n;
            count++;
        }

        if(count == 0) {
            System.out.println("양수가 하나도 입력되지 않았습니다.");
        } else {
            System.out.printf("평균 : %.2f", sum / count);
        }
    }
}
