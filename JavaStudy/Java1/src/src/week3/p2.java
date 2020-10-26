package src.week3;

public class p2 {
    public static void main(String[] args) {

        double C = -40;
        double f;

        for(int i = (int)C; i <= 100; i++) {
            System.out.print("C ="+ i +" --> ");
            convertAndPrint(i);
        }
    }

    public static void convertAndPrint(double c) {
        double f = c * 9.0 / 5.0 + 32.0;
        System.out.println(f);
    }
}