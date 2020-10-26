package src.week1;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("양의 정수를 하나 입력하시오 : ");

        int n = input.nextInt();

        System.out.println("첫번째 방법");

        for(int i = n; i >= 0; i--) {
            System.out.print(i + "\t\t");
            if((n%10) + 1 == i % 10)
                System.out.println();
        }

        int count = 0;

        System.out.println();

        System.out.println("두번째 방법");
        for(int i = n; i >= 0; i--) {
            System.out.print(i + "\t\t");
            count++;
            if(count == 10) {
                System.out.println();
                count = 0;
            }
        }

    }
}
