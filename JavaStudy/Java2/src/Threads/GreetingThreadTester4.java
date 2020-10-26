package Threads;

import javax.swing.*;

public class GreetingThreadTester4 {

    Thread t1;
    Thread t2;

    void startThreads() {

        GreetingRunnable r1 = new GreetingRunnable("안녕?");
        GreetingRunnable r2 = new GreetingRunnable("바이!");

        t1 = new Thread(r1);
        t2 = new Thread(r2);
        t1.start();
        t2.start();

    }

    void interruptThread() {
        String input = JOptionPane.showInputDialog(
                "어떤 인삿말을 하는 스레드를 끝낼까요?"
        );
        if(input.equals("안녕?"))
            t1.interrupt();
        else if (input.equals("바이!"))
            t2.interrupt();
    }


    public static void main(String[] args) {

        GreetingThreadTester4 tester4 = new GreetingThreadTester4();
        tester4.startThreads();
        tester4.interruptThread();
        tester4.interruptThread();
    }
}
