package src.practice;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe6 {

    // 게임 상태를 나타내는 상수.
    static final int PLAYING = 0;      // 게임 중.
    static final int DRAQ = 1;         // 비김.
    static final int CROSS_WON = 2;      // X 선수 승.
    static final int NOUGHT_WON = 3;   // O 선수 승.

    static final int SIZE = 3;         // 바둑판의 크기.
    static char[][] board = new char[SIZE][SIZE];
    static Scanner scan = new Scanner(System.in);

    static char currentMark;   // 이번에 돌을 놓은 선수 ('X' or 'O').
    static int x, y;         // 이번에 놓은 돌의 위치.
    static int state;         // 게임의 현재 상태.

    public static void main(String[] args) throws InterruptedException {

        initGame();
        printBoard();

        boolean end = false;   // 게임 끝?

        while (!end) { // true
            play();
            printBoard();
            checkGame();
            if (state != PLAYING)
                end = true;     // 끝나는 경우

            currentMark = (currentMark == 'X') ? 'O' : 'X';
        }
        printResult();
    }

    /**
     * 바둑판을 초기화한다.
     */
    static void initGame() {
        // 바둑판을 초기화한다.
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = ' ';
    }

    /**
     * 바둑판을 화면에 그린다.
     */
    static void printBoard() {
        // 바둑판을 화면에 그린다.
        for (int i = 0; i < SIZE; i++) {
            System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2] );
            if (i != (SIZE-1))
                System.out.println("---|---|---");
        }
    }

    /**
     * 사람으로부터 입력을 받아 입력에 따라 돌을 놓는다.
     */
    static void play() {

        // 사람의 입력을 받는다.
        System.out.print("좌표(0-2 범위 정수 두개)를 입력하세요: ");
        x = scan.nextInt();
        y = scan.nextInt();
        while (!isInputValid(board, x, y)){
            System.out.print("그 곳에는 놓을 수 없습니다. 좌표를 다시 입력하세요: ");
            x = scan.nextInt();
            y = scan.nextInt();
        }

        board[x][y] = 'X';

        checkGame();

        // 무작위로 위치를 결정하는 알고리즘(무작위로 찍음).
        Random r = new Random();

        do {
            x = r.nextInt(SIZE);
            y = r.nextInt(SIZE);
        } while (!isInputValid(board, x, y));   // (x, y)가 빈 곳이 아니면 다시 찍는다.
        board[x][y] = 'O';
    }

    /**
     * 현재 바둑판 상태에서 (x, y)가 돌을 놓을 수 있는 점인가?
     * @param board 현재 바둑판 상태.
     * @param x 돌을 놓을 점의 x 좌표.
     * @param y 돌을 놓을 점의 y 좌표.
     * @return
     * @return 가능한 점이면 true, 그렇지 않으면 false.
     */
    static boolean isInputValid(char[][] board, int x, int y) {
        boolean valid = true;
        if (x < 0 || x > (SIZE-1) || y < 0 || y > (SIZE-1))
            valid = false;      // (x, y)가 범위를 벗어남.
        else if (board[x][y] != ' ')   // (x, y)가 범위 내에 있긴 하지만 그 곳에 이미 둘이 놓여 있다면
            valid = false;            // 그 곳에 돌을 놓을 수 없다.
        return valid;
    }

    static void checkGame() {

        if (currentMark == 'X') {
            // 돌을 놓은 '행'이 모두 'X'인지 검사한다.
            boolean allX = true;
            for (int j = 0; j < SIZE; j++)
                if(board[x][j] != 'X')
                    allX = false;
            if (allX)
                state = CROSS_WON;

            // 돌을 놓은 '열'이 모두 'X'인지 검사한다.
            allX = true;
            for (int i = 0; i < SIZE; i++)
                if (board[i][y] != 'X')
                    allX = false;
            if (allX)
                state = CROSS_WON;

            // 대각선에 돌을 놓았다면, 대각선이 모두 'X'인지 검사한다.
            if (x == y) {
                allX = true;
                for (int i = 0; i < SIZE; i++)
                    if (board[i][i] != 'X')
                        allX = false;
                if (allX)
                    state = CROSS_WON;
            }

            // 엇대각선에 돌을 놓았다면, 엇대각선이 모두 'X'인지 검사한다.
            if ( x == 2 - y) {
                allX = true;
                for (int i = 0; i < SIZE; i++)
                    if (board[i][2 - i] != 'X')
                        allX = false;
                if (allX)
                    state = CROSS_WON;
            }

            boolean boardfull = true;
            if(state != CROSS_WON) {
                for (int i = 0; i < SIZE; i++)            // 바둑판이 꽉 찼는가?
                    for (int j = 0; j < SIZE; j++)
                        if (board[i][j] == ' ')
                            boardfull = false;
                if(boardfull)
                    state = DRAQ;
            }
        }

        else if (currentMark == 'O') {
            // 돌을 놓은 '행'이 모두 'O'인지 검사한다.
            boolean allO = true;
            for (int j = 0; j < SIZE; j++)
                if(board[x][j] != 'O')
                    allO = false;
            if (allO)
                state = NOUGHT_WON;

            // 돌을 놓은 '열'이 모두 'O'인지 검사한다.
            allO = true;
            for (int i = 0; i < SIZE; i++)
                if (board[i][y] != 'O')
                    allO = false;
            if (allO)
                state = NOUGHT_WON;

            // 대각선에 돌을 놓았다면, 대각선이 모두 'O'인지 검사한다.
            if (x == y) {
                allO = true;
                for (int i = 0; i < SIZE; i++)
                    if (board[i][i] != 'O')
                        allO = false;
                if (allO)
                    state = NOUGHT_WON;
            }

            // 엇대각선에 돌을 놓았다면, 엇대각선이 모두 'O'인지 검사한다.
            if ( x == 2 - y) {
                allO = true;
                for (int i = 0; i < SIZE; i++)
                    if (board[i][2 - i] != 'O')
                        allO = false;
                if (allO)
                    state = NOUGHT_WON;
            }

            boolean boardfull = true;
            if(state != 3) {
                for (int i = 0; i < SIZE; i++)            // 바둑판이 꽉 찼는가?
                    for (int j = 0; j < SIZE; j++)
                        if (board[i][j] == ' ')
                            boardfull = false;
                if (boardfull)
                    state = DRAQ;
            }
        }
    }


    static void printResult() {
        if (state == CROSS_WON)
            System.out.println("당신이 이겼습니다. 축하합니다.");
        else if (state == NOUGHT_WON)
            System.out.println("당신이 졌습니다. 다시 도전하세요.");
        else if (state == DRAQ)
            System.out.println("비겼습니다. 막상막하군요.");

    }

}