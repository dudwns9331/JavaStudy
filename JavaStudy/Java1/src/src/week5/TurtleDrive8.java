package src.week5;

// sample client for testing

import java.util.Scanner;

public class TurtleDrive8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double STEP = 0.2;    // 다각형의 변의 길이

        // 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
        // (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
        // 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
        // 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.
        Turtle turtle = new Turtle(0.5, 0.5, 0);    // (x, y, theta)


        System.out.print("몇 각형을 그릴 것인가?");
        int N = input.nextInt();

        System.out.print("몇 개를 그릴 것인가?");
        double HOW_MANY = input.nextDouble();

        for (int i = 0; i < HOW_MANY; i++) {
            drawNgon(turtle, N, STEP);
            turtle.turnLeft(360.0 / HOW_MANY);
        }
        turtle.pause(1000);
    }

    public static void drawNgon(Turtle t, int n, double size) {

        final int PAUSE = 10;
        final int ANGLE = 180 - (180 * (n - 2)) / n;

        for (int i = 0; i < n; i++) {
            t.pause(PAUSE);
            t.goForward(size);
            t.turnLeft(ANGLE);
        }
    }

}