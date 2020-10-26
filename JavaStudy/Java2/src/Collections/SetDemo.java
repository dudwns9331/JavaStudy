package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> s = new TreeSet<>(); // HashSet은 Set의 일종이다. // TreeSet은 오름차순으로 리스트를 저장하게 된다.

        // 인터페이스를 이용해 객체를 구성할 수 없다.
        // Set<Integer> s = new Set<>();	// 에러!

        s.add(100);	// auto-boxing
        s.add(3);
        s.add(3);
        s.add(77);
        s.add(10);

        Iterator<Integer> iterator = s.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
