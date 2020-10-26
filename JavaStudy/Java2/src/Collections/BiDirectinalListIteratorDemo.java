package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BiDirectinalListIteratorDemo {
    public static void main(String[] args) {

        List<String> namse = new LinkedList<>();
        namse.add("Rams");
        namse.add("Posa");
        namse.add("Chinni");

        ListIterator<String> listIterator = namse.listIterator();

        System.out.println("Foward Direction Iteration : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Direction Iteration: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
