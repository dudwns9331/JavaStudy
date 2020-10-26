package Threads;

public class NumberPrinterRunner3 {

    public static void main(String[] args) {

        IPrinter r1 = new IPrinter(0);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}