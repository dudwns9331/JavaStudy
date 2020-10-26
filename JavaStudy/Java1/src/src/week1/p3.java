package src.week1;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("어떤 수의 배수들을 출력할까요? ");

        int n = input.nextInt();

        System.out.println("1이상 100 이하 수 중" + n + "의 배수들");

        for(int i = 1; i <= 100; i++) {
            if(i % n == 0)
                System.out.print(i + " ");
        }

    }
}
