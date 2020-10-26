package homework1;

import java.util.*;

public class search {

    static final int SIZE = 150;

    public static void main(String[] args) {

        Random random = new Random();       // 랜덤 수 생성 객체
        Set<Integer> set = new HashSet<>(); // 중복 제거 set

        int array[] = new int[SIZE];        // 랜덤 수가 들어갈 리스트

        while (set.size() < SIZE) {                     // 최대 사이즈가 될때까지 랜덤수를 추가한다.
            set.add(random.nextInt(300) + 1);   // set은 중복된 원소는 추가 안하므로 최대사이즈까지
        }                                              // 리스트에 순서와 상관없이 추가한다.

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);                         // 리스트 정렬

        System.out.println("정렬된 리스트 : " + list);
        System.out.println();

        // 배열에 원소를 다 넣는다.
        int i = 0;
        for (int number : list) {
            array[i] = number;
            i++;
        }

        // 이진 탐색 시작 1 ~ 300 사이의 수 x
        int x = random.nextInt(300) + 1;
        System.out.println("탐색 x : " + x);

        int result = binsearch(SIZE, array, x);      // 탐색 결과값 0 -> 탐색 실패 return : 찾는값의 인덱스
        if (result == 0) {  // 탐색 실패
            System.out.println("탐색 실패 : 배열 안에 탐색하는 숫자가 존재하지 않습니다.");
        } else System.out.println("탐색 성공 : " + result + "번째, " + array[result]); // 탐색 성공
    }

    /**
     * 이진 탐색
     *
     * @param n 탐색하려는 리스트의 크기
     * @param S 탐색하려는 리스트
     * @param x 탐색하는 값
     * @return 탐색하는 값의 인덱스
     */
    public static int binsearch(int n, final int S[], int x) {
        int low, high, mid, location, count;
        low = 1;
        high = n;
        location = 0;
        count = 0;              // 비교 횟수를 출력하기 위함

        System.out.println("binsearch() 호출, 탐색 시작");

        while (low <= high && location == 0) {
            count++;
            mid = (low + high) / 2;
            if (x == S[mid]) location = mid;
            else if (x < S[mid]) high = mid - 1;
            else low = mid + 1;
        }

        System.out.println("비교 횟수 : " + count);

        return location;
    }
}
