package homework4;

public class Shortest_Path_DP {

    static int P[][];
    static int D[][];
    static final int INF = 999;

    public static void main(String[] args) {
        int W[][] = {
                {0, 1, INF, 1, 5},
                {9, 0, 3, 2, INF},
                {INF, INF, 0, 4, INF},
                {INF, INF, 2, 0, INF},
                {3, INF, INF, INF, 0}};

        P = new int[5][5];
        D = new int[5][5];

        floyd(5, W);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(D[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(D[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void floyd(int n, int W[][]) {
        int i, k, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                P[i][j] = 0;
            }
        }
        D = W;

        for(k = 0; k < n; k++) {
            for(i = 0; i < n; i++) {
                for(j = 0; j < n; j++) {
                    if((D[i][k] + D[k][j]) < D[i][j]) {
                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
    }

    public static void path(int q, int r) {
        if(P[q][r] != 0) {
            path(q, P[q][r]);
            System.out.println(P[q][r] + " v");
            path(P[q][r], r);
        }
    }
}
