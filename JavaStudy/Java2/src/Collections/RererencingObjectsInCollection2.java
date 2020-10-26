package Collections;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class RererencingObjectsInCollection2 {

    public static void main(String[] args) {

        List<Rectangle> list = new ArrayList<>();       //Rectangle 리스트 (ArrayList)

        list.add(new Rectangle(4, 5));
        list.add(new Rectangle(40, 50));
        System.out.println("리스트: " + list);
        System.out.println();

        System.out.println("0번 사각형 삭제");
        Rectangle r1 = list.remove(0);      // 지우는 값 반환하기 때문에 r1에 객체를 저장함
        System.out.println("삭제된 사각형: " + r1);
        System.out.println("리스트: " + list);     // 리스트는 업데이트 되어 지워진 값은 표현되지 않음
        System.out.println();

        list.remove(0);                 // 0번에 있는 리스트 지우기 앞서 0번이 지워졌으므로 나머지 하나가 지워지게 된다.
        System.out.println("리스트: " + list);
        System.out.println();
    }

}