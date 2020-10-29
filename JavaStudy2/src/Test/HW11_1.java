package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Stud{
    int id;
    String name;
    String addr;
}
class SortST{
    public void selectionSort(Stud[] a) {
        int i, j, min;
        for(i=0; i<a.length-1; i++) {
            min = i;
            for(j=i+1; j<a.length; j++) {
                if(a[j].id < a[min].id)
                    min = j;
            }
            swap(a, min, i);
            System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
            for(j=0; j<a.length-1; j++)
                System.out.printf("%3d", a[j].id);
        }
    }

    public void swap(Stud a[], int i, int j) {
        int temp = a[i].id;
        a[i].id= a[j].id;
        a[j].id = temp;
    }
    //Ex11_3
    int i = 0;
    public int partition(Stud a[], int begin, int end) {
        int pivot, temp, L, R, t;

        L = begin;
        R = end;
        pivot = (begin + end)/2;
        System.out.printf("\n [퀵정렬 %d 단계 : pivot=%d ]\n", ++i, a[pivot]);
        while(L<R) {
            while((a[L].id<a[pivot].id) && (L<R)) L++;
            while((a[R].id>=a[pivot].id) && (L<R)) R--;
            if(L<R) {
                temp = a[L].id;
                a[L].id = a[R].id;
                a[R].id = temp;
            }
        }
        temp = a[pivot].id;
        a[pivot].id = a[R].id;
        a[R].id = temp;
        for(t=0; t<a.length; t++)
            System.out.printf("%3d", a[t]);
        System.out.println();
        return L;
    }

    public void quickSort(Stud a[], int begin, int end) {
        if(begin < end) {
            int p;
            p = partition(a, begin, end);
            quickSort(a, begin, p-1);
            quickSort(a, p+1, end);
        }
    }
    //Ex11_4
    public void insertionSort(Stud a[], int size) {
        int i, j, t, temp;
        for(i=1; i<size; i++) {
            temp = a[i].id;
            j = i;
            while((j>0) && (a[j-1].id>temp)) {
                a[j].id = a[j-1].id;
                j--;
            }
            a[j].id = temp;
            System.out.printf("\n삽입정렬 %d 단계 : ", i);
            for(t=0; t<size; t++)
                System.out.printf("%3d ", a[t].id);
        }
        System.out.println();
    }
    // Ex11_5
    private int sorted[] = new int[30];
    public void merge(Stud a[], int m, int middle, int n) {
        int size = a.length;
        int i, j, k, t;
        i = m;
        j = middle+1;
        k=m;
        while(i<=middle && j<=n) {
            if(a[i].id <=a[j].id) sorted[k] = a[i++].id;
            else sorted[k] = a[j++].id;
            k++;
        }
        if(i>middle) {
            for(t=j; t<=n; t++, k++)
                sorted[k] = a[t].id;
        }
        else {
            for(t=i; t<=middle; t++, k++)
                sorted[k] = a[t].id;
        }

        for(t=m; t<=n; t++)
            a[t].id = sorted[t];
        System.out.printf("\n 병합 정렬 >> ");
        for(t=0; t<size; t++)
            System.out.printf("%3d", a[t].id);
    }

    public void mergeSort(Stud a[], int m, int n) {
        int middle;
        if(m<n) {
            middle = (m+n)/2;
            mergeSort(a, m, middle);
            mergeSort(a, middle+1, n);
            merge(a, m, middle, n);
        }
    }
}
public class HW11_1 {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(new File("Student.txt"));
        Stud[] st = new Stud[10];
        int i = 0;
        while(input.hasNextLine()) {
            st[i].id = input.nextInt();
            st[i].name = input.next();
            st[i].addr = input.next();
            i++;
        }
        SortST S = new SortST();

        System.out.printf("\n정렬할 원소 : ");
        for(int p=0; p<st.length; p++)
            System.out.printf(" %d", st[p].id);
        System.out.println();
        S.selectionSort(st);

        System.out .printf("\n정렬할 원소 : ");
        for(int q=0; q<st.length; q++)
            System.out.printf(" %d", st[q].id);
        System.out.println();
        S.quickSort(st,  0,  7);

        int size = st.length;
        System.out.printf("\n정렬할 원소 : ");
        for(int r =0; r<st.length; r++)
            System.out.printf(" %d", st[r]);
        System.out.println();
        S.insertionSort(st, size);
    }
}