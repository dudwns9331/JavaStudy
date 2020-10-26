package src.week4;

import java.util.Scanner;


public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();

		System.out.println(digits(x) + "");
		int y;
		int k;
		k = powersOfTen(digits(x)) / 10;

		for (y = digits(x); y >= 1; y--) {

			System.out.print(x / k + " ");
			x = x % k;
			k = k / 10;
		}

		input.close();
	}

	public static int powersOfTen(int n) {
		int count = 0;
		int i;
		for (i = 1; count < n; count++) {
			i = i * 10;
		}

		return i;
	}

	public static int digits(int n) {
		int j;
		for (j = 9; n / powersOfTen(j) == 0; j--);
		return (j + 1);
	}
}