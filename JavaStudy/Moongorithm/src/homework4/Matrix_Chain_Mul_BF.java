package homework4;

public class Matrix_Chain_Mul_BF {
    public static void main(String[] args) {

        int d[] = new int[6 + 1];

        d[0] = 5;
        d[1] = 2;
        d[2] = 3;
        d[3] = 4;
        d[4] = 6;
        d[5] = 7;
        d[6] = 8;

        Matrix_Chain_Mul_BF bf = new Matrix_Chain_Mul_BF();
        System.out.println("연쇄 행렬 곱셈의 최소 값 : " + bf.BruteForce(d, 1, 6));
    }

    public int BruteForce(int d[], int i, int j) {

        if (i == j) return 0;
        int result = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            result = Math.min(result, BruteForce(d, i, k)
                    + BruteForce(d, k + 1, j)
                    + d[i - 1] * d[k] * d[j]);
        }
        return result;
    }
}

