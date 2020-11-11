package homework4;

import java.util.Random;
import java.util.Scanner;

public class Dijkstra_path {

    static final int INF = 999;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int W[][] = {
                {0, 1, 3, 999, 999},
                {1, 0, 3, 6, 999},
                {3, 3, 0, 4, 2},
                {999, 6, 4, 0, 5},
                {999, 999, 2, 5, 0}
        };

        System.out.print("몇 개의 노드를 생성 하시겠습니까? ");
        int n = input.nextInt();

        int R_W[][] = new int [n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j)
                    R_W[i][j] = 0;
                else if(R_W[i][j] == R_W[j][i]) {
                    R_W[i][j] = (random.nextInt(10) +1 < 4 ? INF : random.nextInt(10) + 1);
                    R_W[j][i] = R_W[i][j];
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(R_W[i][j] + "\t");
            System.out.println();
        }

        int weight[];

        weight = dijkstra(5, R_W);

        for(int i = 0; i < W.length -1; i++) {
            System.out.println("V1에서" + "V" + (i+2) + "까지의 최단 경로 비용 : " + weight[i]);
        }
    }

    public static int [] dijkstra(int n, int W[][]) {
        int i, vnear;
        int min;
        int cost;

        int touch[] = new int[n];
        int length[] = new int[n];

        int F[] = new int[n-1];

        touch[0] = 0;
        length[0] = -1;
        vnear = 0;


        for (i = 1; i < n; i++) {
            touch[i] = 0;
            length[i] = W[0][i];
        }

        for (int k = 0; k < n-1; k++) {
            min = 999;
            for (i = 1; i < n; i++) {
                if (length[i] >= 0 && length[i] < min) {
                    min = length[i];
                    vnear = i;
                }
            }

            cost = length[vnear];
            F[vnear -1] = cost;

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
