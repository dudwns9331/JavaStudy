package Thread;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * callback을 이용한 작업처리
 */
public class CallbackExample {
    private ExecutorService executorService;

    public CallbackExample() {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed() 실행 : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.out.println("failed() 실행 " + exc.toString());
        }
    };

    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);

                    int result = intX + intY;
                    callback.completed(result, null);           // 정상 처리했을 경우 호출
                } catch (NumberFormatException e) {
                    callback.failed(e, null);                   // 예외가 발생했을 경우 호출
                }
            }
        };
        executorService.submit(task);       // 스레드풀에게 작업 처리 요청
    }

    public void finish() {
        executorService.shutdown(); // 스레드 풀 종료
    }

    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        example.doWork("3", "3");
        example.doWork("3", "삼");
        example.finish();
    }
}
