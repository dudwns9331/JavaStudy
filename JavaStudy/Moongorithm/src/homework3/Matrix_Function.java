package homework3;

import java.util.Random;

public class Matrix_Function {

    int count;

    public void init_Matrix(int n, int matrix[][]) {

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5);
            }
        }
    }

    public  void SubMatrix(int matrix[][], int matrix11[][], int matrix12[][], int matrix21[][], int matrix22[][]) {
        int subSize = matrix11.length;

        for (int i = 0; i < subSize; i++) {
            for (int j = 0; j < subSize; j++) {
                matrix11[i][j] = matrix[i][j];
                matrix12[i][j] = matrix[i][j + subSize];
                matrix21[i][j] = matrix[i + subSize][j];
                matrix22[i][j] = matrix[i + subSize][j + subSize];
            }
        }
    }

    public  void MergeMatrix(int matrix[][], int matrix11[][], int matrix12[][], int matrix21[][], int matrix22[][]) {
        int mergeSize = matrix11.length;

        for (int i = 0; i < mergeSize; i++) {
            for (int j = 0; j < mergeSize; j++) {
                matrix[i][j] = matrix11[i][j];
                matrix[i][j + mergeSize] = matrix12[i][j];
                matrix[i + mergeSize][j] = matrix21[i][j];
                matrix[i + mergeSize][j + mergeSize] = matrix22[i][j];
            }
        }
    }

    public  void MatrixSum(int A[][], int B[][], int C[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public  void MatrixSub(int A[][], int B[][], int C[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    public  int[][] MatrixMul(int n, int A[][], int B[][], int result[][]) {
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                result[i][j] = 0;
                for (k = 0; k < n; k++) {
                    result[i][j] = result[i][j] + A[i][k] * B[k][j];
                    count++;
                }
            }
        }
        return result;
    }
}
