package src.week3;

public class p5 {
    public static void main(String[] args) {
        int upto = 100;
        for(int i = 1; i <= 20; i++) {
            System.out.println("Summation from " + i + " to " + upto +" = " + sum(i, upto));
            upto++;

        }
    }

    public static int sum(int from, int upto) {
        int sum = 0;
        for(int i = from; i <= upto; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
