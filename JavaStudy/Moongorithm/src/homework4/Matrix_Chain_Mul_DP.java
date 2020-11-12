package homework4;

public class Matrix_Chain_Mul_DP {
    public static void main(String[] args) {

        int d[] = new int[6 + 1];
        d[0] = 5;
        d[1] = 2;
        d[2] = 3;
        d[3] = 4;
        d[4] = 6;
        d[5] = 7;
        d[6] = 8;

        Matrix_Chain_Mul_DP dp = new Matrix_Chain_Mul_DP();

        System.out.println(("최소값 : " + dp.dynamic(6, d)));
    }

    public int dynamic(int n, int d[]) {
        int i, j, k, diagonal;
        int M[][] = new int[n + 1][n + 1];

        for (i = 0; i <= n; i++) {
            M[i][i] = 0;
        }


        for (diagonal = 1; diagonal <= n - 1; diagonal++) {
            for (i = 1; i <= n - diagonal; i++) {
                j = i + diagonal;
                M[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j - 1; k++) {
                    M[i][j] = Math.min(M[i][j], M[i][k] + M[k + 1][j] + d[i - 1] * d[k] * d[j]);
                }
            }
        }

//        for (int c = 1; c < n + 1; c++) {
//            for (int x = 1; x < n + 1; x++)
//                System.out.print(M[c][x] + "\t");
//            System.out.println();
//        }

//        System.out.println();

        return M[1][n];
    }
}
