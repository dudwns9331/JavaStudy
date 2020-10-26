package src.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInFileOut {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("integers.txt"));
        PrintWriter output = new PrintWriter("reversedIntegers.txt");

        int numbers[] = new int[10];

        for(int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        for(int i = 9; i >= 0; i--) {
            output.print(numbers[i] + " ");
        }

        input.close();
        output.close();
    }
}
