package week3.list;

import java.util.*;

public class RectangleTester {

    public static void main(String[] args) {
        RectangleTester rectangleTester = new RectangleTester();
        rectangleTester.test();

    }
    int SIZE = 3;

    public void test() {

        Random random = new Random();

        Rectangle rectangle;

        Rectangle Rectangle_list[] = new Rectangle[SIZE];
        ArrayList<Rectangle> arrayList = new ArrayList<>();

        for(int i = 0; i < SIZE; i++) {

            double w = random.nextDouble() * 100.0;
            double h = random.nextDouble() * 100.0;

            rectangle = new Rectangle(w , h);
            Rectangle_list[i] = rectangle;
            arrayList.add(rectangle);
        }

        System.out.println("배열출력, for-each loop 이용");
        for(Rectangle list : Rectangle_list) {
            System.out.println(list.toString());
        }

        System.out.println();

        System.out.println("Array list 출력, for-each loop 이용");
        for(Rectangle list : arrayList) {
            System.out.println(list);
        }

        System.out.println();

        System.out.println("Array list 출력, Iterator 이용");

        Iterator<Rectangle> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("ArrayList의 첫 사각형 크기를 (1.0, 2.0)으로 변경");
        arrayList.get(0).setDimension(1.0, 2.0);
        System.out.println();

        System.out.println("배열출력, for-each loop 이용");
        for(Rectangle list : Rectangle_list) {
            System.out.println(list.toString());
        }

        System.out.println();

        System.out.println("Array list 출력, Iterator 이용");

        iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        arrayList.set(0, new Rectangle(5.0, 5.0));
        System.out.println();

        System.out.println("배열출력, for-each loop 이용");
        for(Rectangle list : Rectangle_list) {
            System.out.println(list.toString());
        }

        System.out.println();

        System.out.println("Array list 출력, Iterator 이용");

        iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("정렬 ---------");

        Arrays.sort(Rectangle_list);
        Collections.sort(arrayList);

        System.out.println(Arrays.toString(Rectangle_list));
        System.out.println(arrayList);

        System.out.println();

        System.out.println("ArrayList의 첫 사각형을 크기가 (0.1, 200.0)인 새 사각형으로 교체한다.");
        arrayList.set(0, new Rectangle(0.1, 200.0));

        System.out.println("면적을 기준으로 (natural ordering) 정렬 --------");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println();

        DiagonalCompartor compartor = new DiagonalCompartor();

        System.out.println("대각선 길이를 기준으로 정렬 -----------");
        Collections.sort(arrayList, compartor);

        System.out.println(arrayList);

    }
}
