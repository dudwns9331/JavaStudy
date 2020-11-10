package homework4;

public class Dijkstra_path {
    public static void main(String[] args) {

        int W[][] = {
                {0, 1, 3, 999, 999},
                {1, 0, 3, 6, 999},
                {3, 3, 0, 4, 2},
                {999, 6, 4, 0, 5},
                {999, 999, 2, 5, 0}
        };

        dijkstra(5, W);
    }

    public static void dijkstra(int n, int W[][]) {
        int i, vnear;
        int min;
        int edge;

        int touch[] = new int[n];
        int length[] = new int[n];

        touch[0] = 0;
        length[0] = 0;
        vnear = 0;

        for (i = 1; i < n; i++) {
            touch[i] = 1;
            length[i] = W[1][i];
        }

        for (int k = 0; k < n; k++) {
            min = Integer.MAX_VALUE;
            for (i = 1; i < n; i++) {
                if (length[i] >= 0 && length[i] < min) {
                    min = length[i];
                    vnear = i;
                }
            }

            edge = touch[vnear];
            System.out.println(edge);

            for (i = 1; i < n; i++) {
                if (length[vnear] + W[vnear][i] < length[i]) {
                    length[i] = length[vnear] + W[vnear][i];
                    touch[i] = vnear;
                }
                length[vnear] = -1;
            }
        }
    }
}
