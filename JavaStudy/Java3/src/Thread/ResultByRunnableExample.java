package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("[ 작업 처리 요청 ] ");
        class Task implements Runnable {
            Result result;
            Task(Result result) {
                this.result = result;
            }
            @Override
            public void run() {
                int sum = 0;
                for(int i = 1; i <= 10; i++) {
                    sum += i;
                }
                result.addValue(sum);                                   // 두 개의 작업이 합쳐지도록 덧셈.
            }
        }

        Result result = new Result();                                   // 두 가지의 작업을 Result라는 외부 클래스에 따로 저장함.
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);
        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result); // 두 개의 작업이 하나의 Result에 저장되도록 수행

        try {
            result = future1.get();
            result = future2.get();
            System.out.println("[ 처리 결과 ] " + result.accumValue);
            System.out.println("[ 작업 처리 완료 ]");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[ 실행 예외 발생함 ] " + e.getMessage());
        }

        executorService.shutdown();
    }
}

/**
 * 작업을 합치고 더하도록 addValue메소드를 작성함.
 */
class Result {
    int accumValue; // 작업의 결과를 합하는 변수
    synchronized void addValue(int value) {
        accumValue += value; // value에 각각의 작업이 들어오면 더해준다.
    }
}