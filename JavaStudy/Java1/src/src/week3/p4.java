package src.week3;

public class p4 {
    public static void main(String[] args) {
        for(int i = 100; i <= 120; i++) {
            System.out.println("Summation of natural numbers upto " + i + " = " + sum(i));
        }
    }

    public static int sum(int upto) {
        int sum = 0;
        for(int i = 1; i <= upto; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
