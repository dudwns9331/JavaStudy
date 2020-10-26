package src.OS;

public class PrimeRunnable implements Runnable {

    private int input;

    public PrimeRunnable(int n) {
        input = n;
    }

    @Override
    public void run() {

        System.out.print("소수 : ");

        for (int i = 1; i <= input; i++)
            if (is_prime(i))
                System.out.print(i + " ");
    }

    public boolean is_prime(int n) {
        boolean prime = true;

        if (n == 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                prime = false;

        return prime;
    }
}
