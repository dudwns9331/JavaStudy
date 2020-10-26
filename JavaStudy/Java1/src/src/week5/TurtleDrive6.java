package src.week5;

// sample client for testing

public class TurtleDrive6 {

    public static void main(String[] args) {

        final double STEP = 0.2;    // 이동 거리

        // 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
        // (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
        // 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
        // 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.
        Turtle turtle = new Turtle(0.5, 0.5, 0);    // (x, y, theta)

        for (int i = 0; i < 3; i++) {
            drawNgon(turtle, 4, STEP);
            turtle.turnLeft(120);
        }
        turtle.pause(1000);

    }

    public static void drawSqure(Turtle t) {

        final double STEP = 0.2;
        final int ANGLE = 90;
        final int PAUSE = 100;

        for (int i = 0; i < 4; i++) {
            t.pause(PAUSE);
            t.goForward(STEP);
            t.turnLeft(ANGLE);
        }
    }

    public static void drawNgon(Turtle t, int n, double size) {

        final int PAUSE = 500;
        final int ANGLE = 180 - (180 * (n - 2)) / n;

        for (int i = 0; i < n; i++) {
            t.pause(PAUSE);
            t.goForward(size);
            t.turnLeft(ANGLE);
        }
    }

}