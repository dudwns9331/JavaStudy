package src.week13;

import java.util.Scanner;

public class ReverserTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        String s = input.nextLine();

        Reverser reverser = new Reverser();
        String reversedString = null;
        reversedString = reverser.reverse(s);

        System.out.print("뒤집힌 문자열 : ");
        System.out.println(reversedString);

        String reversdWords = null;
        reversdWords = reverser.reverseWords(s);

        System.out.print("단어 단위로 뒤집힌 문자열 : ");
        System.out.println(reversdWords);
    }
}
