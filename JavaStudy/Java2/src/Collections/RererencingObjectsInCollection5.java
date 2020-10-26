package Collections;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RererencingObjectsInCollection5 {

    public static void main(String[] args) {

        // Color.RED는 Color 클래스의 static 필드로서
        // 미리 만들어져 있는 객체.
        Color red1 = Color.RED;
        Color red2 = Color.RED;
        Color blue = Color.BLUE;
        System.out.println(red1);       // RED
        System.out.println(red1 == red2);       // True
        System.out.println(red1.equals(red2));  // True
        System.out.println();

        Map<String, Color> map = new HashMap<>();
        map.put("홍길동", red1);
        map.put("손오공", blue);
        map.put("장길산", blue);

        Set<String> keys = map.keySet();

        for (String key : keys)
            System.out.println(key + " " + map.get(key));   // key값이 가리키는것을 가져온다.
        System.out.println();

        Color blue2 = new Color(0, 0, 255);	// blue 칼라 객체를 새로 구성함.
        System.out.println(blue == blue2);  // False
        System.out.println(blue.equals(blue2)); // True
        System.out.println();

        map.put("장길산", blue2);	//blue가 blue2로 교체된다.
        keys = map.keySet();
        for (String key : keys)
            System.out.println(key + " " + map.get(key));
        System.out.println();

    }

}