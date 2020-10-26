package src.week4;

import java.util.Scanner;

/**
 * �־��� ������ �� �ڸ� ������ �˾Ƴ��� ���α׷�. 
 * ������ �Է¹޴´�. 
 * �� �ڸ� �� ���� ����Ѵ�.0
 * @author �ȿ���
 *
 */
public class DigitsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �ڸ� ���� �˷��ݴϴ�.");
		System.out.println("������ �Է��Ͻÿ�,");
		System.out.println("int Ÿ�� ���̾�� �ϰ� 0�� �ƴϾ�� �մϴ�.");
		int x = input.nextInt();

		System.out.println(digits(x) + "�ڸ� �� �Դϴ�.");

		input.close();
	}

	/**
	 * 10�� �ŵ����� ���� ������ش�.
	 * 10�� 0�ŵ������� 1�̴�.
	 * @param n ��ŵ������� �� ������ �����Ѵ�. n�� 0�̻� �����̾�� �Ѵ�.
	 * @return 10�� n�ŵ�������.
	 */
	public static int powersOfTen(int n) {
		int count = 0;
		int i;
		for (i = 1; count < n; count++) {
			i = i * 10;
		}

		return i;
	}

	/**
	 * �־��� ������ ���ڸ� ������ �˾Ƴ���.
	 * @param n �־��� ����, 0�� �ƴϾ�� �Ѵ�.
	 * @return n�� �� �ڸ� ������.
	 */
	public static int digits(int n) {
		int j;
		for (j = 9; n / powersOfTen(j) == 0; j--);
		return (j + 1);
	}
}