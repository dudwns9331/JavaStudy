package Generics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsReverserTest {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-1);
        list.add(3);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        System.out.println();

        List<Double> listd = new LinkedList<>();
        listd.add(1.1);
        listd.add(2.2);
        listd.add(3.3);
        listd.add(-1.1);
        listd.add(3.3);
        System.out.println(listd);

        Collections.reverse(listd);
        System.out.println(listd);
        System.out.println();
    }
}