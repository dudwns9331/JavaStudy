package src.week3;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
            System.out.print("두 개의 정수를 입력하시오 : ");

            int n1 = input.nextInt();
            int n2 = input.nextInt();

            System.out.println(getEvenSum(n1, n2));
        }
    }

    public static int getEvenSum(int from, int to) {

        if(from == 0 && to == 0) {
            System.out.println("감사합니다. 프로그램을 마칩니다.");
            System.exit(1);
        }

        int sum = 0;
        int temp;

        if(from > to) {
            temp = from;
            from = to;
            to = temp;
        }

        for(int i = from; i <= to; i++) {
            if(i % 2 == 0)
                sum = sum + i;
        }

        System.out.print(from + "부터 " + to + "까지의 짝수의 합 = ");
        return sum;
    }
}
