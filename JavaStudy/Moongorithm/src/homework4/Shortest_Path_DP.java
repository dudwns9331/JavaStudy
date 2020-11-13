package homework4;

public class Shortest_Path_DP {

    static final int INF = 9999;

    static int D[][];
    static int P[][];


    public static void main(String[] args) {

        Shortest_Path_DP dp = new Shortest_Path_DP();

        int W[][] = {
                {0, 1, INF, 1, 5},
                {9, 0, 3, 2, INF},
                {INF, INF, 0, 4, INF},
                {INF, INF, 2, 0, 3},
                {3, INF, INF, INF, 0}};


        D = new int[5][5];
//        P = new int[5][5];

        System.out.println("W[i][j]");
        dp.print_m(5, W);

        System.out.println();

        dp.floyd(5, W);

        System.out.println("D[i][j]");
        dp.print_m(5, D);

        System.out.println();

        System.out.println("각 노드에 가는데 필요한 비용");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (P[i][j] < 0) {
                    continue;
                } else {
                    System.out.print("path(" + (i + 1) + "," + (j + 1) + ") : ");
                    System.out.print("v" + (i + 1) + "->");
                    dp.path(i, j);
                    System.out.print("v" + (j + 1));
                    System.out.print(" 필요한 비용 : " + D[i][j]);
                    System.out.println();
                }
            }
        }
    }

    public void floyd(int n, int W[][]) {
        int i, k, j;
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n; j++) {
//                P[i][j] = -1;
//            }
//        }

        D = W;

        for (k = 0; k < n; k++)
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    if ((D[i][k] + D[k][j]) < D[i][j]) {
//                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }
    }

    public void path(int q, int r) {
        if (P[q][r] != -1) {
            path(q, P[q][r]);
            System.out.print("v" + (P[q][r] + 1) + "->");
            path(P[q][r], r);
        }
    }

    public void print_m(int n, int A[][]) {
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
