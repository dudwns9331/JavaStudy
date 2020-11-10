package homework4;

public class Matrix_Chain_Mul_B {
    public static void main(String[] args) {
        int d[] = new int[4];
        Brute_force(d, 0, d.length);
    }

    // A[] 곱셈의 항 0 ~ n - 1까지
    public static void Brute_force(int d[], int left, int right) {

        System.out.println(d);

        for(int k = 1; k < d.length; k++) {
            Brute_force(d, 0, k);
            Brute_force(d, d.length-k, d.length);
        }
    }
}
