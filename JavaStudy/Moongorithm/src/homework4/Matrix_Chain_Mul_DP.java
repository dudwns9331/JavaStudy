package homework4;

import java.util.Random;
import java.util.Scanner;

public class Matrix_Chain_Mul_DP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("몇개의 행렬을 곱셈하시겠습니까? ");
        int n = input.nextInt();
        int d[] = new int[n+1];
        Random random = new Random();

        for(int i = 0; i < d.length; i++) {
            d[i] = random.nextInt(10) + 1;
        }

//        for(int i = 0; i < d.length-1; i++){
//            System.out.print(d[i]+"x"+ d[i+1] + " ");
//        }

        System.out.println();


        System.out.println(minmult(n, d));
    }

    public static int minmult(int n, int d[]) {
        int i, j, k, diagonal;
        int M[][] = new int[n+1][n+1];

        for(i = 0; i <= n; i++) {
            M[i][i] = 0;
        }


        for(diagonal = 1; diagonal <= n-1; diagonal++) {
            for(i = 1; i <= n - diagonal; i++) {
                j = i + diagonal;
                M[i][j] = Integer.MAX_VALUE;
                for(k = i; k <= j-1; k++){
                    M[i][j] = Math.min(M[i][j], M[i][k] + M[k+1][j] + d[i-1] * d[k] * d[j]);
                }
            }
        }

//        for(int c = 1; c < n+1; c++){
//            for(int x = 1; x < n+1; x++)
//                System.out.print(M[c][x] + "\t");
//            System.out.println();
//        }

        return M[1][n];
    }
}
