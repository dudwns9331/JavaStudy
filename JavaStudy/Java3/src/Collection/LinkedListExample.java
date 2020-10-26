package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList는 ArrayList와 같은 기능을 하지만
 * 내부의 구조는 다르다. 인접 참조를 통해서 다음의 객체의 정보를 담고 있기 떄문에
 * 삽입과 삭제에는 ArrayList보다 LinkedList가 더 효율이 좋다.
 */

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");


        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns");
    }
}
