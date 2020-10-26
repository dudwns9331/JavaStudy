package src.week6;

import java.util.Scanner;

public class ReverseQ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("정수를 차례로 입력하시오 : ");
        System.out.println("입력을 마치려면 \'q\' 혹은 \'Q\'를 입력하시오 : ");

        int index = 0;
        int array[] = new int[100];
        String s;

        while(true) {
            s = input.next();
            if(s.equalsIgnoreCase("q")) {
                break;
            }
            else {
                array[index] = Integer.parseInt(s);
                index++;
            }
        }

        System.out.println("배열을 역순으로 출력 : ");
        for(int i =index - 1 ; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
    }
}
