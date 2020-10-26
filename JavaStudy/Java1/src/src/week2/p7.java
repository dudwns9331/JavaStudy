package src.week2;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("거듭제곱 표를 출력하는 프로그램입니다.");
        System.out.print("어떤 수의 거듭제곱 표를 출력하시겠습니까? 정수를 입력하세요 : ");

        int z = input.nextInt();

        System.out.print("몇 제곱까지 출력하시겠습니까? 자연수를 입력하세요 : ");

        int n = input.nextInt();

        int power = 1;

        for(int i = 1; i <= n; i++) {
            power = power * z;
            System.out.println(z + " ^ " + i + " = " + power);
        }


    }
}
