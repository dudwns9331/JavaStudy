package Generic;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // String str = Utill.compare("a", "b");

        // compare는 첫번째 값이 작으면 -1, 같으면 0, 더 크면 -1을 리턴한다.

        int result1 = Util.compare(10, 20); // -1 리턴 int type을 Integer 타입으로 리턴
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3); // 1 리턴 4.5 double -> Double로 리턴
        System.out.println(result2);
    }
}
