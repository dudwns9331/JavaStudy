package homework4;

import java.util.Random;

public class Shortest_Path_Test {

    static final int INF = 9999;
    static int W_DP[][];
    static int W_Dijkstra[][];

    static Random random;

    public static void main(String[] args) {
        Shortest_Path_Test test = new Shortest_Path_Test();
        int node = 1000;
        for (int i = 0; i < 10; i++) {
            node = node + 100;
            System.out.println("노드의 수 : " + node);
            test.test(node);
            System.out.println();
        }
    }


    public static void Create_W_DP(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                W_DP[i][j] = ((random.nextInt(10) + 1) < 4)
                        ? INF : random.nextInt(10) + 1;
                if (i == j)
                    W_DP[i][j] = 0;
            }
        }
    }

    public static void Create_W_Dijkstra(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    W_Dijkstra[i][j] = 0;
                else if (W_Dijkstra[i][j] == W_Dijkstra[j][i]) {
                    W_Dijkstra[i][j] = (random.nextInt(10) + 1 < 4 ? INF : random.nextInt(10) + 1);
                    W_Dijkstra[j][i] = W_Dijkstra[i][j];
                }
            }
        }
    }


    public void test(int n) {
        double start, end;
        double seconds;

        random = new Random();

        W_DP = new int[n][n];
        W_Dijkstra = new int[n][n];


        Create_W_DP(n);
        Create_W_Dijkstra(n);

        Shortest_Path_DP dp = new Shortest_Path_DP();
        start = System.nanoTime();
        dp.floyd(n, W_DP);
        end = System.nanoTime();
        seconds = (end - start) / 1000000000.0;

        System.out.println("DP floyd : " + String.format("%.4f", seconds) + "초");

        Dijkstra_path dijkstra_path = new Dijkstra_path();

        start = System.nanoTime();
        dijkstra_path.dijkstra(n, W_Dijkstra);
        end = System.nanoTime();
        seconds = (end - start) / 1000000000.0;
        System.out.println("Dijkstra : " + String.format("%.4f", seconds) + "초");

    }
}
