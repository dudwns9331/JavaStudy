package src.practice;

import java.util.Scanner;

public class Maxpower {
    public static void main(String[] args) {

        System.out.print("자연수 하나를 입력하시오: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int power=1;
        while (power<=(n/2)) {
            power*=2;
        }
        System.out.println(n+"보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수 = "+power);
        in.close();
    }
}