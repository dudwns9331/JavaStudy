package src.week12;

public class Counter {

    private int count = 0;
    public final int MAX = 10;

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
}
