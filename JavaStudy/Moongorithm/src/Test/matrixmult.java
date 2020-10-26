package Test;

import java.util.Random;

public class matrixmult {
    public static void main(String[] args) {

        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];

        Random random = new Random();

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                A[i][j] = random.nextInt(10);
                B[i][j] = random.nextInt(10);
            }
        }

        System.out.println("A 행렬");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("[" + A[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("B 행렬");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("[" + B[i][j] + "] ");
            }
            System.out.println();
        }


        matrixmulti(3, A, B, C);

        System.out.println("C 행렬");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print("[" + C[i][j] + "] ");
            System.out.println();
        }
    }


    public static void matrixmulti(int n, int A[][], int B[][], int C[][]) {

        int i, j, k;

        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++) {
                C[i][j] = 0;
                for (k = 0; k < n; k++)
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
    }
}
