package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/Jsp");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체 수 : " + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println();

        System.out.println("총 객체수 : " + set.size());

        iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);

        }

        System.out.println();

        set.clear();
        if(set.isEmpty()) { System.out.println("비어 있음"); }
    }
}
