package Threads;


import java.util.Date;

class GreetingThread extends Thread {
    private static final int REPETITION  = 30;
    private static final int DELAY = 1000;

    private String greeting;

    public GreetingThread(String aGreeting) {
        greeting = aGreeting;
    }

    @Override
    public void run() {
        Date date = new Date();

        for(int i = 0; i < REPETITION; i++) {
            System.out.println(date + " " + greeting);
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class GreetingThreadTester1 {
    public static void main(String[] args) {
        GreetingThread greetingThread1 = new GreetingThread("안녕?");
        GreetingThread greetingThread2 = new GreetingThread("바이!");
        greetingThread1.start();
        greetingThread2.start();
    }
}
