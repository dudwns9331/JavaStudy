package src.week3;

public class p3 {
    public static void main(String[] args) {

        double C = -40;

        for(int i = (int)C; i <= 100; i++) {
            System.out.println("C ="+ i +" --> " + convert(i));
        }
    }

    public static double convert(double c) {
        double f = c * 9.0 / 5.0 + 32.0;
        return f;
    }
}