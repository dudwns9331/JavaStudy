package Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<String, Integer> m = new TreeMap<>(); // TreeMap은 Map의 일종이다. // 오름차순으로 정렬하게 된다.

        m.put("강감찬", 1);
        m.put("을지문덕", 4);
        m.put("이순신", 1);
        m.put("장보고", 3);
        m.put("양만춘", 3);
        m.put("계백", 3);

        Set<String> keys = m.keySet();

        Iterator<String> iterator = keys.iterator();

        while(iterator.hasNext()) {
            String k = iterator.next();
            System.out.println(k + " " + m.get(k)); // key, value 쌍 출력
        }
        System.out.println();

        String lastKey = m.lastKey();
        m.remove(lastKey);

        keys = m.keySet();
        iterator = keys.iterator();
        while(iterator.hasNext()) {
            String k = iterator.next();
            System.out.println(k + " " + m.get(k)); // key, value 쌍 출력
        }
    }
}

