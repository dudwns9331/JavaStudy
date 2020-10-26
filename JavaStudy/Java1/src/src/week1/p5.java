package src.week1;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("양의 정수를 하나 입력하시오: ");

        int n = input.nextInt();

        for(int i = n; i >= 0; i--)
        System.out.print(i + " ");

    }
}
