package src.week4;

import java.util.Scanner;

/**
 * Ű����κ��� ���� �ƴ� ������ �Է� �޴´�.
 * �Է� ���� ������ �۰ų� ���� �ִ� ������������ ã�� ����Ѵ�.
 * ������ �Էµ� ������ �� �۾��� �ݺ��Ѵ�.
 * ������ �ԷµǸ� ���α׷��� ������.
 * @author �ȿ���
 *
 */
public class MaxSquareTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("� ������ �۰ų� ���� �ִ� \"������ ������\"�� ã�����? ");
		System.out.println("���� �ƴ� ������ �Է��Ͻÿ�.");
		System.out.println("������ �Է��ϸ� ���α׷��� ����˴ϴ�.");

		while (true) {
			System.out.print("�Է� : ");
			int x = input.nextInt();
			if (x < 0) {
				System.out.println("���α׷��� �������ϴ�.");
				break;
			} else
				System.out.println(x + "���� �۰ų� ���� �ִ� \"������ ������\"�� " + maxSquare(x) + "�Դϴ�.");
			System.out.println();
		}

		input.close();
	}
	/**
	 * �־��� ���� �ƴ� ��������
	 * �۰ų� ���� "������ ������"�� �� �ִ밪�� ���Ѵ�.
	 * @param bound �־��� ����. (���� �ƴ� �����̾�� �Ѵ�.)
	 * @return �ִ� "������ ������"
	 */
	public static int maxSquare(int bound) {
		int max = 0;
		int i;
		for (i = 0; (i * i) <= bound; i++)
			max = i * i;
		return max;
	}

}
