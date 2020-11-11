package homework4;

import java.util.Random;
import java.util.Scanner;

public class Shortest_Path_DP {

    static final int INF = 9999;

    static int D[][];
    static int P[][];


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

//        int W[][] = {
//                {0, 1, INF, 1, 5},
//                {9, 0, 3, 2, INF},
//                {INF, INF, 0, 4, INF},
//                {INF, INF, 2, 0, 3},
//                {3, INF, INF, INF, 0}};


        System.out.print("몇 개의 노드를 생성 하시겠습니까? ");
        int n = input.nextInt();

        int R_W[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                R_W[i][j] = ((random.nextInt(10) + 1) < 3) ? INF : random.nextInt(10) + 1;
                if (i == j) {
                    R_W[i][j] = 0;
                }
            }
        }

//        print_m(n, R_W);

        D = new int[n][n];
        P = new int[n][n];

//        floyd(5, W);

        floyd(n, R_W);

//        print_m(5, D);

//        System.out.println();
//        System.out.println();

//        print_m(5, P);

//        System.out.print("path(5, 3)의 경로 : ");
//        path(4, 2);


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (P[i][j] < 0) {
//                    continue;
//                } else {
//                    System.out.print("path(" + (i + 1) + "," + (j + 1) + ") : ");
//                    System.out.print("v" + (i + 1) + "->");
//                    path(i, j);
//                    System.out.print("v" + (j + 1));
//                    System.out.print(" 필요한 비용 : " + D[i][j]);
//                    System.out.println();
//                }
//            }
//        }

//        print_m(n, R_W);
    }

    public static void floyd(int n, int W[][]) {
        int i, k, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                P[i][j] = -1;
            }
        }


        D = W;

//        for(i = 0; i < n; i++) {
//            for(j = 0; j < n; j++)
//                D[i][j] = W[i][j];
//        }

        for (k = 0; k < n; k++)
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    if ((D[i][k] + D[k][j]) < D[i][j]) {
                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }

    }

    public static void path(int q, int r) {
        if (P[q][r] != -1) {
            path(q, P[q][r]);
            System.out.print("v" + (P[q][r] + 1) + "->");
            path(P[q][r], r);
        }
    }


    public static void print_m(int n, int A[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == INF)
                    System.out.print("INF" + "\t");
                else
                    System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
