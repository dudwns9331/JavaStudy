package Generics;

import java.util.Arrays;

class ArrayReverser {

    public static void reverser(Number[] array) {

        Number[] copyarray = new Number[5];

        int j = array.length - 1;

        for(int i = 0; i < array.length; i++) {
            copyarray[i] = array[j--];
        }

        for(int i = 0; i < array.length; i++) {
            array[i] = copyarray[i];
        }

    }
}

public class ArrayReverserTest {
    public static void main(String[] args) {

        Number[] a = new Number[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = -1;
        a[4] = 3;
        System.out.println(Arrays.toString(a));

        ArrayReverser.reverser(a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        // ArrayReverser.reverse 메소드를 이용하여
        // Double[]의 원소 순서를 바꿀 수 있나?
        // 가능하다. Double[]은 Number[]의 서브 클래스이다.

    }
}
