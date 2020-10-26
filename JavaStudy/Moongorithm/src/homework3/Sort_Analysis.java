package homework3;

import java.util.*;

public class Sort_Analysis {

    public static int[] temp;                   // 합병정렬에서 사용할 여분의 배열
    public static List<Integer> quick_list;     // 퀵정렬에서 사용할 리스트
    public static int pivotpoint;               // 퀵정렬에서 사용할 피봇 변수

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("리스트의 사이즈 입력 : ");
        int SIZE = input.nextInt();

        List<Integer> list = init_list(SIZE);

//        System.out.println("정렬 전 리스트 : " + list);
        System.out.println("버블정렬 수행, 걸린 시간 : " + bubble(list.size(), list));          // 버블 정렬 수행
//        System.out.println(list);

        list = init_list(SIZE);                 // 버블 정렬 이후 리스트 초기화
        int S[] = new int[list.size()];         // 합병 정렬에 사용할 배열 : 결과값이 된다.
        int index = 0;
        temp = new int[list.size()];

        for (Integer i : list) {                 // 리스트에 들어간 값들 배열로 복사
            S[index++] = i;
        }
//        System.out.println("정렬 전 리스트 : " + list);
        System.out.println("합병정렬 수행, 걸린 시간 : " + mergesort(S, 0, S.length - 1));    // 합병 정렬 수행
//        System.out.print("정렬 된 리스트 출력 : ");
//        for(int i = 0; i < S.length; i++) {
//            System.out.print(" [" + S[i] + "] ");
//        }

        quick_list = init_list(SIZE);       // 퀵 정렬을 위해 리스트 초기화

//        System.out.println("정렬 전 리스트 : " + quick_list);
        System.out.println("퀵 정렬 수행, 걸린 시간 : " + quicksort(0, quick_list.size() - 1));       // 퀵 정렬 수행
//        System.out.println("정렬 된 리스트 출력 : " + quick_list);
    }

    /**
     * 리스트를 랜덤한 숫자로 채워 초기화 하는 메소드
     *
     * @param SIZE 초기화 할 리스트의 크기
     * @return 랜덤한 숫자로 SIZE 만큼 채워진 리스트
     */
    public static List<Integer> init_list(int SIZE) {

        Random random = new Random();       // 랜덤 수 생성 객체
        Set<Integer> set = new HashSet<>(); // 중복 제거 set

        while (set.size() < SIZE) {                             // 최대 사이즈가 될때까지 랜덤수를 추가한다.
            set.add(random.nextInt(10000000) + 1);       // set은 중복된 원소는 추가 안하므로 최대사이즈까지
        }                                                       // 리스트에 순서와 상관없이 추가한다. 최대 숫자 1000000
        List<Integer> list = new ArrayList<>(set);

        return list;
    }

    /**
     * 버블 정렬
     *
     * @param n    리스트의 크기
     * @param list 정렬할 리스트
     * @return 수행 시간
     */
    public static double bubble(int n, List<Integer> list) {
        long start, end;
        start = System.currentTimeMillis();

        for (int i = n - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1))
                    Collections.swap(list, j + 1, j);           // j+1과 j의 값을 바꾼다.
            }

        end = System.currentTimeMillis();

        return (end - start) / 1000.0;
    }

    /**
     * 합병 정렬 divide
     *
     * @param S    divide 할 배열
     * @param low  배열의 첫 인덱스 값
     * @param high 배열의 마지막 인덱스 값
     * @return 수행시간
     */
    public static double mergesort(int S[], int low, int high) {
        long start, end;
        start = System.currentTimeMillis();

        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(S, low, mid);
            mergesort(S, mid + 1, high);
            merge(S, low, mid, high);
        }

        end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }

    /**
     * 합병 정렬 merge
     *
     * @param S    merge 할 배열
     * @param low  합칠 인덱스의 첫 값
     * @param mid  합칠 인덱스의 중간 값
     * @param high 합칠 인덱스의 마지막 값
     */
    public static void merge(int S[], int low, int mid, int high) {
        int i, k;
        i = k = low;
        int j = mid + 1;

        // 합병, 비교해서 작은수를 먼저 넣는다.
        while (i <= mid && j <= high) {
            if (S[i] <= S[j])
                temp[k++] = S[i++];
            else
                temp[k++] = S[j++];
        }

        // 남은 값들 정렬된 배열 뒤에 한번에 복사
        if (i > mid) {
            for (int index = j; index <= high; index++)
                temp[k++] = S[index];
        } else {
            for (int index = i; index <= mid; index++)
                temp[k++] = S[index];
        }

        // 배열 S에 정렬된 값을 넣어준다.
        for (int index = low; index <= high; index++)
            S[index] = temp[index];
    }

    /**
     * 퀵 정렬
     *
     * @param low  인덱스의 첫 값
     * @param high 인덱스의 마지막 값
     * @return 수행시간
     */
    public static double quicksort(int low, int high) {
        long start, end;
        start = System.currentTimeMillis();

        if (high > low) {
            partition(low, high);
            quicksort(low, pivotpoint - 1);
            quicksort(pivotpoint + 1, high);
        }

        end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }

    /**
     * 퀵 정렬 partition
     *
     * @param low  인덱스의 첫값
     * @param high 인덱스의 마지막 값
     */
    public static void partition(int low, int high) {
        int i, j;
        int pivotitem;
        pivotitem = quick_list.get(low);                // 피봇의 값을 가져온다.
        j = low;
        for (i = low + 1; i <= high; i++) {
            if (quick_list.get(i) < pivotitem) {
                j++;
                Collections.swap(quick_list, i, j);     // i와 j의 값을 변경한다.
            }
        }
        pivotpoint = j;     // 피봇의 값 설정
        Collections.swap(quick_list, low, pivotpoint);  // 마지막으로 피봇과 low 의 값을 변경한다.
    }
}
