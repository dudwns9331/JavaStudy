package src.week1;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("양의 정수를 하나 입력하시오 : ");

        int n = input.nextInt();

        int count = 0;

        System.out.println("첫번째 방법");

        for(int i = 0; i <= n; i++) {
            System.out.print(i + "\t\t");
            count++;
            if(count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
        System.out.println("두번째 방법");

        for(int i = 0; i <= n; i++) {
            System.out.print(i + "\t\t");
            if(i % 10 == 9) {
                System.out.println();
            }
        }

    }
}
