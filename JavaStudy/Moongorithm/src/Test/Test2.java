package Test;

import static java.lang.Math.min;

public class Test2 {

    static int location;
    static int a[];
    static int k;
    static int P[][] = {{0 , 1, 1, 1, 1, 1},
            {0, 0, 2, 3, 4, 5},
            {0, 0, 0, 3, 4, 5},
            {0, 0, 0, 0, 4, 5},
            {0, 0, 0, 0, 0, 5}
    };

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 100; i <= 201; i++) {
            sum = sum + i/2;
        }

        System.out.println(sum);

        int []s = new int[10];
        for(int i = 0; i < s.length; i++) {
            s[i] = i;
        }

        seq(s, s.length, 11);

        System.out.println(location);

        int n = 10;
        a = new int[n];
        for(int i = 0; i < 10; i++)
            a[i] = i;

        System.out.println(sum(0, 9));

        System.out.println(bin(6, 3));

        order(1, 6);
    }

    public static int sum(int i, int j) {
        int m = (i + j) / 2;
        if(i == j) return a[i];
        else return (sum(i, m) + sum(m + 1, j));
    }


    public static void seq(int s[], int n, int x) {
        for(location = 0; location < n; location++) {
            if(s[location] == x)
                break;
        } if (location == n)
            location = 0;
    }

    public static int bin(int n, int k) {
        int i, j;
        int B[][] = new int[n+1][k+1];
        for(i = 0; i <=n; i++) {
            for(j = 0; j <= min(i, k); j++) {
                if(j == 0 || j == i) B[i][j] = 1;
                else B[i][j] = B[i - 1][j - 1] + B[i - 1][j];
            }
        }
        return B[n][k];
    }

    public static void order(int i, int j) {
        if (i == j) System.out.print("A" + i);
        else {
            k = P[i - 1][j - 1];
            System.out.print(" (");
            order(i,k);
            order(k+1,j);
            System.out.print(") ");
        }
    }
}
