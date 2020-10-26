package Generics;

import java.util.LinkedList;
import java.util.List;

class ListReverser {
    public static void reverse(List<Number> list) {


        List<Number> l = new LinkedList<>();

        for(int i = list.size() - 1; i >= 0; i--)
            l.add(list.get(i));

        for(int i = 0; i < list.size(); i++) {
            list.set(i ,l.get(i));
        }
    }
}

public class ListReverserTest {
    public static void main(String[] args) {

        List<Number> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-1);
        list.add(3);
        System.out.println(list);

        ListReverser.reverse(list);
        System.out.println(list);
        System.out.println();


        List<Double> listd = new LinkedList<>();
        listd.add(1.1);
        listd.add(2.2);
        listd.add(3.3);
        listd.add(-1.1);
        listd.add(3.3);
        System.out.println(listd);

//        ListReverser.reverse(listd);
        System.out.println(listd);
        System.out.println();

    }

    // ListReverser.reverse 메소드를 이용하여
    // List<Double>의 원소 순서를 바꿀 수 있나?
    // Answer : 바꿀 수 없다.
}
