package Threads;

public class IPrinter implements Runnable {

    private static final int REPETITIONS = 100;
    private static final int DELAY = 1000;

    private int number;

    /**
     * 구성자.
     * @param n number의 초기값.
     */
    public IPrinter(int n) {
        number = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= REPETITIONS; i++) {
                Thread t = Thread.currentThread();
                String name = t.getName();
                System.out.println(name + ": " + i);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException exception) {
            System.out.println("인터럽트가 걸려 반복문을 빠져 나왔습니다.");
        }
    }

}