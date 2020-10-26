package homework3;

public class Strassen {

    int count;

    public int[][] strassen(int n, int A[][], int B[][], int C[][]) {
        Matrix_Function f = new Matrix_Function();

        count++;
        if (n < 2) {
            return f.MatrixMul(n, A, B, C);
        }

        else {
            int size = n / 2;
            int A11[][] = new int[size][size];
            int A12[][] = new int[size][size];
            int A21[][] = new int[size][size];
            int A22[][] = new int[size][size];
            int B11[][] = new int[size][size];
            int B12[][] = new int[size][size];
            int B21[][] = new int[size][size];
            int B22[][] = new int[size][size];

            int Cal_A[][] = new int[size][size];
            int Cal_B[][] = new int[size][size];

            int M1[][] = new int[size][size];
            int M2[][] = new int[size][size];
            int M3[][] = new int[size][size];
            int M4[][] = new int[size][size];
            int M5[][] = new int[size][size];
            int M6[][] = new int[size][size];
            int M7[][] = new int[size][size];

            int C11[][] = new int[size][size];
            int C12[][] = new int[size][size];
            int C21[][] = new int[size][size];
            int C22[][] = new int[size][size];

            f.SubMatrix(A, A11, A12, A21, A22); // A11 A12 A21 A22 4개로 나눈다.
            f.SubMatrix(B, B11, B12, B21, B22); // B11 B12 B21 B22 4개로 나눈다.

            f.MatrixSum(A11, A22, Cal_A); // Cal_A = A11 + A22
            f.MatrixSum(B11, B22, Cal_B); // Cal_B = B11 + B22

            strassen(size, Cal_A, Cal_B, M1);   // M1 = Cal_A * Cal_B

            f.MatrixSum(A21, A22, Cal_A); // Cal_A = A21 + A22
            strassen(size, Cal_A, B11, M2); // M2 = Cal_A * B11

            f.MatrixSub(B12, B22, Cal_B); // Cal_B = B12 - B22
            strassen(size, A11, Cal_B, M3); // M3 = A11 * Cal_B

            f.MatrixSub(B21, B11, Cal_B); // Cal_B = B21 - B11
            strassen(size, A22, Cal_B, M4); // M4 = A22 * Cal_B

            f.MatrixSum(A11, A12, Cal_A); // Cal_A = A11 + A12
            strassen(size, Cal_A, B22, M5); // M5 = Cal_A * B22

            f.MatrixSub(A21, A11, Cal_A); // Cal_A = A21 - A11
            f.MatrixSum(B11, B12, Cal_B); // Cal_B = B11 - B12
            strassen(size, Cal_A, Cal_B, M6); // M6 = Cal_A * Cal_B

            f.MatrixSub(A12, A22, Cal_A); // Cal_A = A12 - A22
            f.MatrixSum(B21, B22, Cal_B); // Cal_B = B21 - B22
            strassen(size, Cal_A, Cal_B, M7); // M7 = Cal_A * Cal_B


            f.MatrixSum(M1, M4, Cal_A); // Cal_A = M1 + M4
            f.MatrixSum(Cal_A, M7, Cal_B); // Cal_B = Cal_A + M7
            f.MatrixSub(Cal_B, M5, C11); // C11 = M5 + Cal_B

            f.MatrixSum(M3, M5, C12); // C12 = M3 + M5

            f.MatrixSum(M2, M4, C21); // C21 = M2 + M4

            f.MatrixSum(M1, M3, Cal_A); // Cal_A = M1 + M3
            f.MatrixSum(Cal_A, M6, Cal_B); // Cal_B = Cal_A + M6
            f.MatrixSub(Cal_B, M2, C22); // C22 = Cal_B + M2

            f.MergeMatrix(C, C11, C12, C21, C22);  // C =  C11, C12, C21, C22
            return C;
        }
    }
}
