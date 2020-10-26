package src.week6;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("10보다 작은 정수 난수");
        for(int i = 0; i < 10; i++){
            System.out.println((int)(10*Math.random()));
        }
    }
}
