package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 1부터 10까지의 합을 리턴하는 작업을 Callable 객체로 생성,
 * 스레드풀의 스레드가 처리하도록 요청.
 */
public class ResultByCallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        ); // 실행시간 동안 수행 가능한 프로세스들의 개수를 최대 스레드풀의 개수로 지정?


        System.out.println("[작업 처리 요청]");
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 1; i <= 10; i++)
                    sum += i;

                return sum;
            }
        };

        Future<Integer> future = executorService.submit(task);

        try {
            int sum = future.get();
            System.out.println("[ 처리 결과 ] " + sum);
            System.out.println("[ 작업 처리 완료 ]");
        } catch (Exception e) {
            System.out.println("[ 실행 예외 발생함 ] " + e.getMessage());
        }

        executorService.shutdown();
    }
}