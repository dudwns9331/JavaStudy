package Generics;

/**
 * 특정 타입 객체만 저장할 수 있는 클래스
 * 올바른 타입이 사용되는지 컴팡일러가 감시해줌.
 * @param <T> 특정 타입;
 */
class Generic<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }
}

public class GenericDemo {

    public static void main(String[] args) {

        Generic<String> container = new Generic<>();
        Generic<Integer> container2 = new Generic<>();


        container.set("겨울");
        String str = container.get(); //형변환 불필요
        System.out.println(str);

//        container.set(3); 컴파일 에러!!

        container2.set(3);
        System.out.println(container2.get());

    }
}
