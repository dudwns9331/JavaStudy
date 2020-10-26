package Generics;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        list.add(new Integer(10));
        list.add(new Float(10.1));

        System.out.println(list);

    }
}
