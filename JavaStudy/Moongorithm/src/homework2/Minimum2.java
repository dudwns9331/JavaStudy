package homework2;

import java.util.*;

/**
 * n 개의 수로 구성된 리스트에서
 * m 개의 가장 작은 수를 찾는 알고리즘
 */

public class Minimum2 {

    static int[] temp;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("몇 개의 수로 리스트를 구성 하시겠습니까?");
        int n = input.nextInt();
        System.out.print("몇 개의 가장 작은 수를 찾으시겠습니까?");
        int m = input.nextInt();

        temp = new int[n];          // 정렬된 값을 넣을 전역변수
        int S[] = new int[n];  // 정렬시킬 배열

        System.out.println();

        Set<Integer> set = new HashSet<>();         // 중복 제거 set

        while (set.size() < n) {                            // 최대 사이즈가 될때까지 랜덤수를 추가한다.
            set.add(random.nextInt(100) + 1);       // set은 중복된 원소는 추가 안하므로 최대사이즈까지
        }                                                   // 리스트에 순서와 상관없이 추가한다.


        int index = 0;

        for(Integer i : set) {
            S[index++] = i;
        }

        mergesort(S, 0, S.length -1);

        System.out.println("정렬된 리스트 : " + Arrays.toString(S));

        System.out.println();

        System.out.println("가장 작은 " + m + "개의 수 : "); // 가장 작은 m개의 수 차례대로 출력
        for(int i = 0; i < m; i++) {
            System.out.print("[" + S[i] + "] ");
        }
    }

    public static void mergesort(int S[], int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergesort(S, low, mid);
            mergesort(S, mid + 1, high);
            merge(S, low, mid, high);
        }
    }

    public static void merge(int S[], int low, int mid, int high) {
        int i, k;
        i = k = low;

        int j = mid + 1;

        // 합병
        while(i <= mid && j <= high) {
            if(S[i] <= S[j])
                temp[k++] = S[i++];
            else
                temp[k++] = S[j++];
        }


        // 남은 값들 정렬된 배열 뒤에 한번에 복사
        if(i > mid) {
            for (int index = j; index <= high; index++)
                temp[k++] = S[index];
        } else {
            for(int index = i; index <= mid; index++)
                temp[k++] = S[index];
        }

        // 배열 S에 정렬된 값을 넣어준다.
        for(int index = low; index <= high; index++)
            S[index] = temp[index];
    }
}
