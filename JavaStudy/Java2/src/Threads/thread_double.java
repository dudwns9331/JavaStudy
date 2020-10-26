package Threads;

import java.util.Date;

public class thread_double {

    private static String time = "현재시각 출력 : ";

    public static class Thread1 extends Thread {
        public void run() {
            Date data = new Date();
            System.out.println(time + data);
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            System.out.println("두번째 쓰레드");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
