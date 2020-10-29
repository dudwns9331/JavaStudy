package OS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LRU {

    static int size;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int change_count = 0;

        int old_count = 0;

        int [] string_reference =
                       {1, 2, 3, 4, 2,
                        1, 5, 6, 2, 1,
                        2, 3, 7, 6, 3,
                        2, 1, 2, 3, 6};

        System.out.println("페이지의 수를 입력하세요");

        size = input.nextInt();

        int [] page = new int[size];
        int [] old = new int[size];
        int min = 0;

        for(int i = 0; i < size; i++) {
            old[i] = 0;
        }

        for(int i = 0; i < string_reference.length ; i++) {

            if(i < size) {
                        page[i] = string_reference[i];

                old[i]++;
                for(int j = 0; j < i; j++)
                    old[j]++;
            }

            else{
                breakout:
                for(int k = 0; k < size; k++) {

                   min = is_oldest(old); // 가장 오래 있었던 값 찾기

                    for(int t = 0; t < size; t++)
                        if(page[t] == string_reference[i])
                        break breakout;

                    {
                        page[min] = string_reference[i];
                        change_count++;
                        old[min] = 0;
                        for(int q = 0; q < size; q++) {
                            old[q]++;
                        }
                        break;
                    }
                }

            }
        }
        System.out.println("페이징 횟수 : " + (change_count+size));
    }

    public void old_count_plus(int [] old) {
        for(int i = 0; i < size; i++) {
            old[i]++;
        }
    }

    public static int is_oldest(int []old) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < size; i++) {
            if(max < old[i]) {
                max = old[i];
                index = i;
            }
        }
        return index;
    }
}
