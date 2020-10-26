//package src.week7;
//
//import edu.princeton.cs.introcs.In;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//
//public class RectangleTester {
//
//	private void test() {
//
//		Random r = new Random(); 						// ������ü �ϳ��� ���� ���� ����.
//		Rectangle[] rectArray = new Rectangle[3]; 		// ��ü 3�� ���� ���� ����.
//		List<Rectangle> rectList = new ArrayList<>(); 	//Rectangle Ÿ���� ���� List�� ��ü�� ������ �ش�.
//
//		// Rectangle 이라는 객체를 넣겠다.
//		// rectlist에 rectangle 을 넣겠다.
//
//
//		List<Integer> list = new ArrayList<>(); // integer 리스트
//		list.add(10);
//		// integer 리스트에 넣었다 10을
//
//
//		// �հ� ���� ��ü�� �� �ٸ����� ����!
//
//		for (int i = 0; i < 3; i++) {
//			double w = r.nextDouble() * 100.0;
//			double h = r.nextDouble() * 100.0;
//
//			Rectangle rect = new Rectangle(w, h); 	// Rectangle�� ��ü�� �����Ͽ� ���� ��ü�� �̿��� �ϳ��ϳ� �߰��Ͽ� �迭�� �����Ѵ�.
//			rectArray[i] = rect; 			//rectArray�� RectangleŬ������ �����ϱ� ���� Ŭ���� �迭.
//			rectList.add(rect); 			// rectList�� ArrayList�� Ȱ���Ͽ� ������ ��ü. add�� ���� List�� �߰��Ѵ�.
//		}
//
//		// 리스트  -> for each, iterator => for each
//
//		for(Rectangle 변수 : rectList) {
//			System.out.println(변수);
//		}
//
//		System.out.println("�迭 ���, for-each loop �̿�");
//		for (Rectangle rect : rectArray)
//			System.out.println(rect);
//		System.out.println();
//
//		System.out.println("ArrayList ���, for-each loop �̿�");
//		for (Rectangle rect : rectList)
//			System.out.println(rect);
//		System.out.println();
//
//		System.out.println("ArrayList ���, Iterator �̿�");
//		Iterator<Rectangle> iterator = rectList.iterator(); //Iterator�� ������ ���� ���� ���ϹǷ� ����!
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		// Iterator ���� ������.
//
//		System.out.println();
//
//		System.out.println("ArrayList�� ù �簢�� ũ�⸦ (1.0, 2.0)���� ����");
//		rectList.get(0).setDimension(1.0, 2.0);			//rectList�� �� get(0)�� ������?
//		System.out.println();
//
//		System.out.println("�迭 ���, for-each loop �̿�");
//		for (Rectangle rect : rectArray)
//			System.out.println(rect);
//		System.out.println();
//
//		System.out.println("ArrayList ���, Iterator �̿�");
//		iterator = rectList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		// 1.2 jpg �׸��׸��� ����.
//
//		System.out.println();
//
//		System.out.println("ArrayList�� ù �簢���� ũ�� (5.0, 5.0)�� �� �簢������ ��ü");
//		rectList.set(0, new Rectangle(5.0, 5.0)); 		// 0��° �迭�� ���Ҹ� new ���ο� Rectangle�� ��ü�� �����Ͽ� ��ü�Ѵ�.
//		System.out.println();
//
//		System.out.println("�迭 ���, for-each loop �̿�");
//		for (Rectangle rect : rectArray)
//			System.out.println(rect);
//		System.out.println();
//
//		System.out.println("ArrayList ���, Iterator �̿�");
//		iterator = rectList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		// 1.3 jpg �׸��׸��� ����.
//
//		System.out.println();
//
//		// Rectangle a = new Rectangle(1.0, 2.0);
//
//		// Rectangle b = new Rectangle(2.0, 3.0);
//
//		// System.out.println(a.compareTo(b));
//
//		System.out.println("���� ------------");
//
//		Arrays.sort(rectArray);
//		System.out.println(Arrays.toString(rectArray));
//
//
//		Collections.sort(rectList);
//		System.out.println(rectList);
//
//		System.out.println();
//
//		System.out.println("ArrayList�� ù �簢���� ũ�Ⱑ (0.1, 200.0)�� �� �簢������ ��ü�Ѵ�.");
//		rectList.set(0, new Rectangle(0.1, 200.0));
//		System.out.println(rectList);
//
//		System.out.println();
//
//		System.out.println("������ �������� (natural ordering) ���� -------");
//		Collections.sort(rectList);
//		System.out.println(rectList);
//
//		System.out.println();
//
//		System.out.println("�밢���� �������� ���� --------------");
//		Collections.sort(rectList, new DiagonalComparator());
//		System.out.println(rectList);
//	}
//
//	public interface Measurable {
//		double getMeasure();
//	}
//
//	public static void main(String[] args) {
//		RectangleTester tester = new RectangleTester();
//		tester.test();
//	}
//}
