package src.week1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average;

        System.out.println("정수 몇 개를 더하시겠습니까?");

        int n = input.nextInt();

        System.out.print("3개의 정수를 차례로 입력하시오 : ");

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += input.nextInt();
        }

        average = (double)sum/(double)n;

        System.out.println("정수의 합 = " + sum);
        System.out.printf("평균 : %.2f", average);

    }
}
