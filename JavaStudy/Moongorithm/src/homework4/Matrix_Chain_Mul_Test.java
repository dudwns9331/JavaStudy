package homework4;

import java.util.Random;

public class Matrix_Chain_Mul_Test {

    static int d[];
    static Random random;

    public static void main(String[] args) {
        Matrix_Chain_Mul_Test test_time = new Matrix_Chain_Mul_Test();

        /**
         * 행렬의 개수 18개부터 랜덤한 차원의 행렬
         */
        for (int i = 18; i <= 22; i++) {
            test_time.test(i);
        }
    }

    /**
     * 랜덤 차원 생성
     */
    public static void Create_dimension() {
        random = new Random();
        for (int i = 0; i < d.length; i++) {
            d[i] = random.nextInt(10) + 1;
        }
    }

    public void test(int n) {
        double start, end;
        double seconds;

        d = new int[n + 1];
        Create_dimension();

        Matrix_Chain_Mul_BF BF = new Matrix_Chain_Mul_BF();
        Matrix_Chain_Mul_DP DP = new Matrix_Chain_Mul_DP();

        System.out.println("행렬의 개수 : " + n);

        start = System.nanoTime();
        int BF_result = BF.BruteForce(d, 1, n);
        System.out.println("Matrix Chain Mul brute force result : " + BF_result);
        end = System.nanoTime();
        seconds = (end - start) / 1000000000.0;

        System.out.println("수행시간 : " + String.format("%.5f", seconds) + "초");

        start = System.nanoTime();
        int DP_result = DP.dynamic(n, d);
        System.out.println("Matrix Chain Mul Dynamic result : " + DP_result);
        end = System.nanoTime();
        seconds = (end - start) / 1000000000.0;

        System.out.println("수행시간 : " + String.format("%.5f", seconds) + "초");
        System.out.println();

    }
}
