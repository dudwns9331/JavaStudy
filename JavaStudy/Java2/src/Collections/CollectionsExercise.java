package Collections;

import java.util.*;

public class CollectionsExercise {
    public static void main(String[] args) {

        final int N = 10;
        final int MAX = 10;

        Random random = new Random();

        System.out.println("N(난수 발생 갯수)=" + N);
        System.out.println("MAX(난수 최대값 + 1)=" + MAX);

        // 0이상, MAX 미만 정수 난수를 N개 발생시켜 리스트에 저장한다.

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < N; i++) {
            list.add(random.nextInt(MAX));
        }

        System.out.println("list");
        System.out.println(list);

        Collections.sort(list); // 오름차순으로 정렬

        System.out.println("오름차순 정렬 : " + list);

        System.out.println("이터레이터 이용 출력");

        Iterator<Integer> it = list.iterator();

        for(Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        Set<Integer> set = new HashSet<>(list); // set으로 중복 제거하기
        it = set.iterator();
        System.out.println("set으로 중복 제거한 데이터 출력");
        while(it.hasNext())  {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(Integer i : set) {
            it = list.iterator();
            while(it.hasNext()) {
                if(it.next().equals(i)) {
                    count++;
                }
            }
            map.put(i,count);
            count = 0;
        }

        System.out.println("Map 이용 값 : 중복도");

        int arrayCount = 0;

        Set<Integer> keySet = map.keySet();
        it = keySet.iterator();
        Integer key;
        while(it.hasNext()) {
            key = it.next();
            arrayCount++;
            System.out.println(key + ":" + map.get(key));
        }

        int array[] = new int[arrayCount];
        int value;
        int max = 0;

        it = keySet.iterator();
        while(it.hasNext()) {
            key = it.next();
            value = map.get(key);
            array[value]++;
            if(max < value) {
                max = value;
            }
        }

        for(int i = 1; i <= max; i++) {
            System.out.println(i + "중복: " + array[i] + "개");
        }
    }
}
