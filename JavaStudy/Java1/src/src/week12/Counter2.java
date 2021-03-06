package src.week12;

public class Counter2 {

    private int count = 0;
    public int MAX = 10;

    public void setMAX(int max) {
        this.MAX = max;
    }

    public void tick() {
        count++;
        if(count > MAX)
            count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int number) {
        if(isInputValid(number))
            count = number;
    }

    public boolean isInputValid(int number) {
        if (number < 0)
            return false;
        if (number > MAX)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Counter2 c12 = new Counter2();
        Counter2 c60 = new Counter2();

        c12.setMAX(12);
        c60.setMAX(60);

        c12.setCount(11);

        c12.tick();
        System.out.println(c12.getCount());
        c12.tick();
        System.out.println(c12.getCount());
        c12.tick();
        System.out.println(c12.getCount());
        c12.tick();
        System.out.println(c12.getCount());
        System.out.println();

        c60.setCount(59);

        c60.tick();
        System.out.println(c60.getCount());
        c60.tick();
        System.out.println(c60.getCount());
        c60.tick();
        System.out.println(c60.getCount());
        c60.tick();
        System.out.println(c60.getCount());
    }
}
