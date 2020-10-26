package homework3;

import java.util.Scanner;

public class Compare_Matrix_Tester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("어떤 크기의 행렬을 만드시겠습니까? (n x n, 정방행렬): ");
        int n = input.nextInt();

        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        int C[][] = new int[n][n];

        Matrix_Function f = new Matrix_Function();
        Strassen strassen = new Strassen();

        f.init_Matrix(n, A);
        f.init_Matrix(n, B);

        long start, end;

        start = System.currentTimeMillis();

        f.MatrixMul(n, A, B, C);

        end = System.currentTimeMillis() - start;

        System.out.println("정상적 방법 곱셈 횟수 : " + f.count);

        System.out.println("정상적 방법 곱셈 수행시간 : " + end/1000.0);

        start = System.currentTimeMillis();
        strassen.strassen(n, A, B, C);
        end = System.currentTimeMillis() - start;

        System.out.println("쉬트라쎈 이용 곱셈 횟수 : " + strassen.count);
        System.out.println("쉬트라쎈 수행시간 : " + end/1000.0);
    }
}
