package Generics;

/**
 * 무엇이든 지정할 수 있는 편리한 클래스
 * 그러나, 그래서 불안하고 에러 나기 쉬운 클래스
 */
class Old {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }
}


public class OldDemo {

    public static void main(String[] args) {

        Old container = new Old();

        container.set("겨울");
        String str = (String) container.get(); // 형변환 필요!
        System.out.println(str);

        container.set(3);
        Integer i = (Integer) container.get(); // 형변환 필요!
        System.out.println(i);
    }
}
