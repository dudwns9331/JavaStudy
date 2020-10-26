package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuickSortTest {

    private static int S[];
    private static int pivotpoint;

    static ArrayList<Integer> list;


    public static void main(String[] args) {
        S = new int[10];
        list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }

        System.out.println(list);

        quicksort(0 , list.size()-1);

        System.out.println(list);



    }

    public static void quicksort(int low, int high) {

        if (high > low) {
            partition(low, high);
            quicksort(low, pivotpoint - 1);
            quicksort(pivotpoint + 1, high);
        }
    }

    public static void partition(int low, int high) {
        int i, j, temp;
        int pivotitem;
        pivotitem = list.get(low);
        j = low;
        for(i = low + 1; i <= high; i++) {
            if(list.get(i) < pivotitem) {
                j++;
                Collections.swap(list, i, j);
            }
        }

        pivotpoint = j;
        Collections.swap(list, low, pivotpoint);
    }
}
