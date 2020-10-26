package src.OS;

import java.util.Scanner;

public class thread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("얼마까지의 소수를 구하시겠습니까? : ");
        int n = input.nextInt();

        PrimeRunnable primeRunnable = new PrimeRunnable(n);
        Thread thread = new Thread(primeRunnable);
        thread.start();

    }
}
