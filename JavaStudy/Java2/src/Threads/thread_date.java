package Threads;

import java.util.Date;

public class thread_date {

    private static final int REPETITIONS = 10;
    private static final int DELAY = 1000;

    public static void main(String[] args) throws InterruptedException {

        try {


            String greeting = "안녕!";

            for (int i = 1; i <= REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(now + "" + greeting);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException exception) {
            System.out.println("인터럽트에 의해 작업 중단!");
        }
    }
}