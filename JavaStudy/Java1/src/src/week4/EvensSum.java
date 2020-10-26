package src.week4;

import java.util.Scanner;

/**
 * ����ڰ� �Է��� �ΰ��� ���� ���̿� �ִ� ¦������ �դ��� ���Ͽ� ����Ѵ�.
 * ����ڰ� �Է��� ������ ¦����� �� ���� �����ؼ� ���� ���Ѵ�.
 * ū ���� ���� �ԷµǴ� ��쿡�� �� �۵��Ѵ�.
 * @author �ȿ���
 *
 */
public class EvensSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ������ ¦������ ���� ���մϴ�.");

		boolean done = false;
		while (!done) {
			System.out.print("�ΰ��� ������ �Է��Ͻÿ�: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if (num1 == num2) {
				done = true;
			} else {

				int sum = getEvensSum(num1, num2);
				if (num1 < num2) {
					System.out.print(num1 + "����" + num2 + "������ ¦���� �� = " + sum);
					System.out.println();
					System.out.println();
				} else if (num1 > num2) {
					System.out.print(num2 + "����" + num1 + "������ ¦���� �� = " + sum);
					System.out.println();
					System.out.println();
				}
			}

		}

		System.out.print("�����մϴ�. ���α׷��� ��Ĩ�ϴ�.");
		input.close();
	}

	/**
	 * �־��� �� �� ������ ¦���� ���� ���Ѵ�. 
	 * �־��� ���� ¦���̸� �� ���� �տ� ���Խ�Ų��.
	 * @param from �־��� ��.
	 * @param to �־��� ��.
	 * @return ¦���� ��.
	 */
	public static int getEvensSum(int from, int to) {
		int sum = 0;
		if (from > to) {
			int temp = from;
			from = to;
			to = temp;
		}

		for (int i = from; i <= to; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
