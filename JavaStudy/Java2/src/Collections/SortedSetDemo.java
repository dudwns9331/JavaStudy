package Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<>(); // TreeSet은 Set의 일종이다.

        s.add(100);	// auto-boxing
        s.add(3);
        s.add(77);
        s.add(10);

        Iterator<Integer> iterator = s.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();

        Integer smallest = s.first();
        s.remove(smallest);
        iterator = s.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
