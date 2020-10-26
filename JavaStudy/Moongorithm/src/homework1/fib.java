package homework1;

public class fib {
    public static void main(String[] args) {
        run_fibo(10);
        run_fibo(20);
        run_fibo(50);
        run_fibo(100);
    }

    public static long fib_recursive(int n) {
        if (n <= 1) return n;
        else return (fib_recursive(n - 1) + fib_recursive(n - 2));
    }

    public static void run_fibo(int n) {
        long start, end;

        start = System.currentTimeMillis();
        System.out.println("fib(" + n + ") 실행결과 : " + fib_recursive(n));
        end = System.currentTimeMillis();
        System.out.println("fib(" + n + ") 실행시간 : " + (end - start) / 1000.0);
    }
}
