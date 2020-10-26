package src.week6;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int array[] = new int[10];

        System.out.println("정수 10개를 차례로 입력하시오 : ");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("배열을 역순으로 출력 : ");

        for(int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
