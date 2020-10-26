package src.week13;

import java.util.Scanner;

public class Counter {
    private int value;

    public Counter() {
        value = 0;
    }
    public Counter(int value) {
        this.value = value;
    }

    public void countUp() {
        value++;
    }

    public void countDonw() {
        value--;
    }

    public void reset() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        Counter counter = new Counter();

        while((n = input.nextInt()) != 0) {
            if(n > 0)
                counter.countUp();
            else
                counter.countDonw();
        }

        System.out.println(counter.getValue());
    }
}
