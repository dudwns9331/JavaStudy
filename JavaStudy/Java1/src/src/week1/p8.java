package src.week1;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("평균을 구하는 프로그램");
        System.out.println("양의 정수를 여러 개 입력하시오. ");
        System.out.println("입력을 마치려면 0 이하 정수를 입력하시오.");

        int count = 0;
        int n, sum = 0;
        double avg;

        while((n = input.nextInt()) > 0) {
            count++;
            sum = sum + n;
        }

        avg = (double) sum / (double) count;

        if(count == 0) {
            System.out.println("양의 정수 갯수 = " + count);
        }
        else {
            System.out.println("양의 정수 갯수 = " + count);
            System.out.println("정수의 합 = " + sum);
            System.out.printf("평균 = %.2f", avg);
        }
    }
}
