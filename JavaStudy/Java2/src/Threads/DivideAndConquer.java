package Threads;
import java.util.Random;
/**
 * 작업을 쪼개어 여러 스레드가 나누어 실행함으로써 신속히 작업을 마칠 수 있음을 보인다.
 * 난수들을 배열에 넣고 배열에 있는 수들의 합을 두 가지 방법으로 구한다.
 * (1) 하나의 스레드로 구한다.
 * (2) 코어 갯수만큼의 스레드를 구성하고, 배열을 코어 갯수만큼으로 쪼갠 후,
 * 각 스레드가 쪼개진 각 배열의 합을 구하게 하고, 최종적으로 각 합을 더하여 최종 합을 구한다.
 */
public class DivideAndConquer extends Thread {

    // 이 프로그램을 실행하는 컴퓨터가 몇 개의 코어를 갖고 있는지 알아낸다.
    static int cores = Runtime.getRuntime().availableProcessors();

    // 전체 배열
    final static int NUM_OF_VALUES =  cores * 55000000;
    static int[] values = new int[NUM_OF_VALUES];

    // 코어 갯수만큼 쪼갠 배열 (portion)
    static int portionSize = values.length / cores;	// 쪼개진 각 배열(portion)의 크기
    static int[] portionResults = new int[cores];	// 쪼개진 각 배열의 합
    private int portionNumber;						// 쪼개진 배열들의 일련 번호

    public DivideAndConquer(int portionNumber) {
        this.portionNumber = portionNumber;
    }

    public void run() {
        // 쪼개진 배열(portion)의 합을 구한다.
        int sum =0;
        int baseIndex = portionNumber * portionSize;
        for( int i=baseIndex; i<baseIndex + portionSize; i++) {
            sum += values[i];
        }
        portionResults[portionNumber] = sum;
    }

    public static void generateInts() {
        Random randomGenerator = new Random();
        for( int i=0; i<values.length; i++ ) {
            int randomInt = randomGenerator.nextInt(10);
            values[i] = randomInt;
        }
    }

    public static void main(String args[]) {

        generateInts();

        System.out.println("cores = " + cores);

        /***********************************
         (1) 하나의 스레드로 계산한다.
         ************************************/
        {
            System.out.println("한 개의 스레드로 계산.");
            int total = 0;
            long startTime = System.currentTimeMillis();

            for( int i=0; i<values.length; i++ ) {
                total += values[i];
            }

            long elapsedTime = System.currentTimeMillis() - startTime;

            System.out.println("합: " + total);
            System.out.println("계산 소요 시간: " + elapsedTime + " ms\n");
        }

        /***********************************
         (2) 여러 개의 스레드로 계산한다.
         ************************************/
        {
            System.out.println("여러 개의 스레드로 계산.");
            int total = 0;
            long startTime = System.currentTimeMillis();

            Thread[] thread = new Thread[cores];

            for( int i=0; i<cores; i++ ) {
                // 쪼개진 각 배열의 부분합을 계산하는 쓰레드를 구성하고 start시킨다.
                //
                //
            }

            // 모든 스레드가 끝날 때까지 기다린다.
            // 스레드가 모두 끝난 후에 다음 문장으로 넘어간다.
            for( int i=0; i<cores; i++ ) {
                try {
                    thread[i].join();	// thread[i]가 끝날 때까지 기다린다.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 쪼개진 각 배열의 합을 모두 더하여 총합을 구한다.
            //
            //
            //

            long elapsedTime = System.currentTimeMillis() - startTime;

            System.out.println("합: " + total);
            System.out.println("계산 소요 시간: " + elapsedTime + " ms\n");
        }
    }
}