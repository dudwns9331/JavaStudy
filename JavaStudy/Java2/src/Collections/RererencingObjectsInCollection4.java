package Collections;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RererencingObjectsInCollection4 {

    public static void main(String[] args) {

        Rectangle r1, r11;
        r1 = new Rectangle(4, 5);
        r11 = new Rectangle(4, 5);
        System.out.println(r1);
        System.out.println(r11);
        System.out.println(r1 == r11);      // r1과 r1이 같은 객체를 가리키나?
        System.out.println(r1.equals(r11));	// r1이 가리키는 객체와 r2가 가리키는 객체가 내용이 같은가? equls는 가리키는 객체의 내용이 같은지 조사함.
        System.out.println();

        List<Rectangle> list = new ArrayList<>();
        list.add(r1);
        list.add(r11);
        System.out.println(list);
        System.out.println();

        Set<Rectangle> set = new HashSet<>();
        set.add(r1);
        set.add(r11);		// r1.equals(r11)이므로 추가되지 않는다!      // set은 중복되는 정보를 추가하지 않음. 가리키는 내용이 같기 때문에
        System.out.println(set);
        System.out.println();


    }

}