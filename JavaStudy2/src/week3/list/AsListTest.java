package week3.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class AbsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if(Math.abs(i1) > Math.abs(i2))
            return 1;
        else if (Math.abs(i1) < Math.abs(i2))
            return -1;
        else
            return 0;
    }
}

public class AsListTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(-3);
        arrayList.add(-7);
        arrayList.add(5);

        System.out.println("리스트");
        System.out.println(arrayList);

        System.out.println();

        System.out.println("Natural ordering에 따라 정렬된 리스트");
        Collections.sort(arrayList);

        System.out.println(arrayList);

        System.out.println();

        System.out.println("절대값을 기준으로 정렬된 리스트");

        AbsComparator absComparator = new AbsComparator();
        Collections.sort(arrayList, absComparator);
        System.out.println(arrayList);

    }
}
