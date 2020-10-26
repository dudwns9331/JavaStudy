package src.week2;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("역삼각형을 그리는 프로그램입니다.");
        System.out.print("역삼각형의 크기를 얼마로 할까요 ? 1 이상의 정수를 입력하세요. ");

        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
