package src.week4;

/**
 * ������ �� ���� ���̿� �������� ���� ���ϴ� ���α׷�
 * 
 * @author �ȿ���
 *
 */
public class Summation2 
{

	public static void main(String[] args) 
	{
		int count = 1;
		int from, to;
		while (count <= 2) 
		{
			from = count;
			to = count + 2;
			System.out.println("Summation from" + from + " to " + to + " = " + sum(from, to));
			count++;
		}
	}

	/**
	 * �־��� ������ �ڿ����� ���� ���Ѵ�.
	 * @param from ������ ���� ��.
	 * @param to �������� �� ��.
	 * @return �־��� ������ �ڿ����� ��.
	 */
	public static int sum(int from, int to) 
	{
		int sumResult = 0;
		int i;
		for (i = from; i <= to; i++) 
		{	
			sumResult += i;
		}
		return sumResult;
	}
}
