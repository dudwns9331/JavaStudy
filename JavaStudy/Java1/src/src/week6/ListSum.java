package src.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListSum {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("integers.txt"));

        int numbers[] = new int[10];

        for(int i = 0; i < 10; i++){
            numbers[i] = input.nextInt();
        }

        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < i; j++){
                sum = sum + numbers[j];
            }
            System.out.println("배열의 첫 " + i + " 개 원소의 합 : " + sum);
            sum = 0;
        }

    }
}
