package Lambda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };

        // 함수형 람다식 선언 fi는 인터페이스지만 하나의 추상메소드만 가지고 있으므로
        // 함수형 람다식이다. 따라서 괄호안에는 추상메소드의 인자값을 가지고 있고
        // 뒤의 몸체는 그 인자를 가지고 추상메소드가 실행하는 코드이다.

        System.out.println(fi.method(2, 5));

        fi = (x, y) -> { return x + y; }; //
        System.out.println(fi.method(2,5));

        fi = (x, y) -> x + y;
        System.out.println(fi.method(2,5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2,5));

    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
