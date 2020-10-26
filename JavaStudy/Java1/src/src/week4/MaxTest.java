package src.week4;

import java.util.Scanner;

/**
 * �� ���� ������ �� ���� ū ���� ã�´�.
 * @author �ȿ���
 *
 */
public class MaxTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� �� ���� ū ���� ã���ݴϴ�.");
		System.out.println("�� ���� ������ �Է��Ͻÿ� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		System.out.println("�� ���� �� ���� ū ���� " + max(num1, num2, num3) + "�Դϴ�.");

		input.close();
	}
	/**
	 * �־��� �� ���� ������ �� ���� ū ���� ã���ش�.
	 * @param i ù ����.
	 * @param j �� ��° ����.
	 * @param k �� ��° ����.
	 * @return i, j, k �� ���� ū ��.
	 */
	public static int max(int i, int j, int k) {

		int temp;
		if (i > j) {
			temp = i;
			i = j;
			j = temp;
		}

		if (i > k) {
			temp = i;
			i = k;
			k = temp;
		}

		if (j > k) {
			temp = j;
			j = k;
			k = temp;
		}
		return k;
	}

}
