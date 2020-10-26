package src.week5;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 : ");

        String s = input.next();

        System.out.println(s.length() + " 개의 글자로 이루어진 문자열입니다.");

        for(int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
