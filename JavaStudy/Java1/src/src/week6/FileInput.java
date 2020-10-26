package src.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("integers.txt"));
        int [] numbers;
        numbers = new int[10];

        for(int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("배열을 역순으로 출력 : ");

        for(int i = 9; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
