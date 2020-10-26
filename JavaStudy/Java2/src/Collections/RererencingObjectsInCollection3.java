package Collections;


import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class RererencingObjectsInCollection3 {

    public static void main(String[] args) {

        Rectangle r1;
        r1 = new Rectangle(4, 5);
        List<Rectangle> list = new ArrayList<>();
        list.add(r1);
        list.add(r1);
        System.out.println(list);
        System.out.println();

        list.remove(0);
        System.out.println(list);
        System.out.println();

        list.remove(0);
        System.out.println(list);
        System.out.println();
    }

}