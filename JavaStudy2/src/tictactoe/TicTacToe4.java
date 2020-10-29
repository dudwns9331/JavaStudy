package tictactoe;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicTacToe4 {
    static char[][] board;
    public static void main(String[] args) throws InterruptedException {
        board = new char[3][3];    // 바둑판
        int x, y;                            // 돌을 놓을 위치

        Scanner scan = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe 게임입니다.");
        System.out.println("사람이 X, 컴퓨터가 O입니다.");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        printBoard(board);

        boolean end = false;
        String winner = null;

        while (!end) {
            x = scan.nextInt();
            y = scan.nextInt();
            if (isInputValid(board, x, y))
                board[x][y] = 'X';

            printBoard(board);

            if (winOrLose(board, "사람")) {
                end = true;
                winner = "Human";
                continue;
            }
            if (boardFull(board)) {
                end = true;
                winner = "Nobody";    // 사람이 이기지 못했는데 보드가 꽉 찼다면 비긴 것이다.
                continue;
            }

            TimeUnit.SECONDS.sleep(1);  // 프로그램 실행을 1초 동안 멈춘다. InterruptedException을 던지는 수가 있다.

            computerPlay(board);
            printBoard(board);

            if (winOrLose(board, "컴퓨터")) {
                end = true;
                winner = "Computer";
                continue;
            }
            if (boardFull(board)) {
                end = true;
                winner = "Nobody";    // 컴퓨터가 이기지 못했는데 보드가 꽉 찼다면 비긴 것이다.
            }
        }

        if (winner.equals("Human"))
            System.out.println("당신이 이겼습니다. 축하합니다.");
        else if (winner.equals("Computer"))
            System.out.println("당신이 졌습니다. 다시 도전하세요.");
        else if (winner.equals("Nobody"))
            System.out.println("비겼습니다. 막상막하군요.");

        scan.close();
    }

    public static boolean isInputValid(char[][] board, int x, int y) {

        boolean isinput = true;

        if (board[x][y] != ' ') {
            System.out.println("잘못된 곳에 두었습니다.");
            isinput = false;
        }
        return isinput;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
            if (i != 2)
                System.out.println("---|---|---");
        }
        System.out.println();
    }

    public static boolean winOrLose(char[][] board, String s) {
        boolean win = false;

        char c;

        if(s == "사람") c = 'X';
        else  c = 'O';

        int countX = 0;
        int countY = 0;
        int countZ = 0;
        int countK = 0;

        breakOut:
        for (int i = 0; i < 3; i++) {
            if(countX == 3 || countY == 3)
                break breakOut;
            countX = 0;
            countY = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == c) {
                    if (countX == 3) break breakOut;
                    countX++;
                }
                if (board[j][i] == c) {
                    if (countY == 3) break breakOut;
                    countY++;
                }
            }
            if (board[i][i] == c) {
                if (countZ == 3) break breakOut;
                countZ++;
            }
            if (board[i][2 - i] == c) {
                if (countK == 3) break breakOut;
                countK++;
            }
        }
        if (countX == 3 || countY == 3 || countZ == 3 || countK == 3)
            win = true;
        return win;
    }

    public static boolean boardFull(char[][] board) {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    full = false;
        }
        return full;
    }

    public static void computerPlay(char[][] board) {
        int i = 0, j = 0;
        breakOut:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    break breakOut;
        }
        if (i < 3 && j < 3)
            board[i][j] = 'O';
    }

}