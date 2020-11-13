package homework4;

public class Dijkstra_path {

    static final int INF = 9999;

    public static void main(String[] args) {

        Dijkstra_path dijkstra_path = new Dijkstra_path();
        Shortest_Path_DP function = new Shortest_Path_DP();

        int W[][] = {
                {0, 1, 3, INF, INF},
                {1, 0, 3, 6, INF},
                {3, 3, 0, 4, 2},
                {INF, 6, 4, 0, 5},
                {INF, INF, 2, 5, 0}
        };

        System.out.println("W[i][j]");
        function.print_m(5, W);

        System.out.println();

        int weight[];

        weight = dijkstra_path.dijkstra(5, W);

        for (int i = 0; i < W.length - 1; i++) {
            System.out.println("V1에서" + "V" + (i + 2) + "까지의 최단 경로 비용 : " + weight[i]);
        }
    }

    public int[] dijkstra(int n, int W[][]) {
        int i, vnear;
        int min;
        int cost;

        int touch[] = new int[n];
        int length[] = new int[n];

        int F[] = new int[n - 1];

        touch[0] = 0;
        length[0] = -1;
        vnear = 0;


        for (i = 1; i < n; i++) {
            touch[i] = 0;
            length[i] = W[0][i];
        }

        for (int k = 0; k < n - 1; k++) {
            min = INF;
            for (i = 1; i < n; i++) {
                if (length[i] >= 0 && length[i] < min) {
                    min = length[i];
                    vnear = i;
                }
            }

            cost = length[vnear];
            F[vnear - 1] = cost;

            for (i = 1; i < n; i++)
                if (length[vnear] + W[vnear][i] < length[i]) {
                    length[i] = length[vnear] + W[vnear][i];
                    touch[i] = vnear;
                }
            length[vnear] = -1;
        }
        return F;
    }
}
