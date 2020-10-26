package src.week2;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("삼각형을 그리는 프로그램 입니다.");
        System.out.print("삼각형의 크기를 얼마로 할까요 ? 1 이상의 정수를 입력하세요. ");

        int n = input.nextInt();

        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
