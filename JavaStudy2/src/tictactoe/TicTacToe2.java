package tictactoe;

import java.util.Scanner;

/**
 * 교재에 나오는 코드 (176쪽)
 */

public class TicTacToe2 {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        int x, y;

        Scanner scan = new Scanner(System.in);

        // 바둑판을 초기화한다.
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        do {
            // 바둑판을 화면에 그린다.
            for (int i = 0; i < 3; i++) {
                System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
                if (i != 2)
                    System.out.println("---|---|---");
            }

            // 사람의 입력을 받는다.
            System.out.print("다음 수의 좌표를 입력하시오: ");
            x = scan.nextInt();
            y = scan.nextInt();

            if (board[x][y] != ' ') {
                System.out.println("잘못된 위치입니다. ");
                continue;
            } else
                board[x][y] = 'X';

            // 컴퓨터가 돌을 놓는다.

            int i = 0, j = 0;
            breakOut :
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++)
                    if (board[i][j] == ' ')
                        break breakOut;
            }
            if (i < 3 && j < 3)
                board[i][j] = 'O';

        } while (true);

    }
}