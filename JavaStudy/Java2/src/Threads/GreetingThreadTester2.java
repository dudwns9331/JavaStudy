package Threads;

import java.util.Date;

/**
 * 인삿말을 반복해서 출력하는 Runnable 클래스.
 */
class GreetingRunnable implements Runnable {

    private static final int REPETITIONS = 30;
    private static final int DELAY = 1000;

    private String greeting;

    /**
     * 구성자.
     * @param aGreeting 인삿말.
     */
    public GreetingRunnable(String aGreeting) {
        greeting = aGreeting;
    }

    public void run() {
        try {
            for (int i = 1; i <= REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(now + " " + greeting);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException exception) {	}	// 무시함.
    }
}

/**
 * 두 개의 스레드를 병렬로 실행시킴.
 */
public class GreetingThreadTester2 {
    public static void main(String[] args) {
        GreetingRunnable r1 = new GreetingRunnable("안녕?");
        GreetingRunnable r2 = new GreetingRunnable("바이!");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}