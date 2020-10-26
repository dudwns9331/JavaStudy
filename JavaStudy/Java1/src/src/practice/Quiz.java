package src.practice;

public class Quiz {
    public static void main(String[] args) {
        MyExp num1 = new MyExp();
        num1.base = 2;
        num1.exp = 4;

        System.out.printf("2의 3승 = %d", num1.getValue());
    }
}
