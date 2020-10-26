package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceAllDemo {
    public static void main(String[] args) {

        List<Integer> ilist = Arrays.asList(1, 2, 3, -1 , 3);
        System.out.println("List<Integer> : " + ilist);
        System.out.println("모든 3을 30으로 교체");
        Collections.replaceAll(ilist, 3, 30);
        System.out.println(ilist);
        System.out.println();

        List<Float> flist = Arrays.asList(1.0f, 2.0f, 3.0f, -1.0f, 3.0f);
        System.out.println("List<Float> : " + flist);
        System.out.println("모든 3.0을 30.0으로 교체");
        Collections.replaceAll(flist, 3.0f, 30.0f);
        System.out.println(flist);
        System.out.println();

        List<String> slist = Arrays.asList("봄", "여름", "가을", "겨울", "봄", "봄");
        System.out.println("List<String> : " + slist);
        System.out.println("모든 \"봄\"을 \"여름\" 으로 교체");
        Collections.replaceAll(slist,"봄", "여름");
        System.out.println(slist);
        System.out.println();
    }
}
