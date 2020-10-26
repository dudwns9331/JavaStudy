package homework1;

import java.math.BigInteger;

public class fib2 {
    public static void main(String[] args) {
        run_fibo(10);
        run_fibo(20);
        run_fibo(50);
        run_fibo(100);
    }

    public static BigInteger fib_iterative(int n) {
        BigInteger f0;
        BigInteger f1;
        BigInteger fi;

        f0 = BigInteger.valueOf(0L);
        f1 = BigInteger.valueOf(1L);
        fi = BigInteger.valueOf(0L);

        // 초기값 설정
        if(n == 0) return BigInteger.valueOf(0);
        else if (n == 1) return BigInteger.valueOf(1);
        else {
            for (int i = 2; i <= n; i++) {
                fi = f0.add(f1);
                f0 = f1;
                f1 = fi;
            }
        }

        return fi;
    }

    public static void run_fibo(int n) {
        long start, end;

        start = System.currentTimeMillis();
        System.out.println("fib(" + n + ") 실행결과 : " + fib_iterative(n));
        end = System.currentTimeMillis();
        System.out.println("fib(" + n + ") 실행시간 : " + (end - start) / 1000.0);
    }

}
