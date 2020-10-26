package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 위인들에 대한 인기투표 결과 각 위인이 얻은 득표 수.
 *
 */
public class MapDemo {

    public static void main(String[] args) {

        // (이름, 득표수)를 (key, value) 쌍으로 저장
        Map<String, Integer> m = new HashMap<>(); // HashMap은 Map의 일종이다.

        // 인터페이스를 이용해 객체를 구성할 수 없다.
        // Map<String, Integer> m = new Map<>();	// 에러!

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
    }
}
