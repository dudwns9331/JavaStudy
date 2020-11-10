package homework4;

public class Shortest_Path_DP {

    static final int INF = 9999;

    static int D[][];
    static int P[][];

    public static void main(String[] args) {
        int W[][] = {
                {0, 1, INF, 1, 5},
                {9, 0, 3, 2, INF},
                {INF, INF, 0, 4, INF},
                {INF, INF, 2, 0, 3},
                {3, INF, INF, INF, 0}};

        D = new int[5][5];
        P = new int[5][5];

        floyd(5, W);

        print_m(5, D);

        System.out.println();
        System.out.println();

        print_m(5, P);

        System.out.print("path(5, 3)의 경로 : ");
        path(4, 2);
    }

    public static void floyd(int n, int W[][]) {
        int i, k, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                P[i][j] = -1;
            }
        }

        D = W;

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
            System.out.print("v" + (P[q][r] + 1) + "\t");
            path(P[q][r], r);
        }
    }


    public static void print_m(int n, int A[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
