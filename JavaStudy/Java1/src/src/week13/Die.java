package src.week13;

import java.util.Random;

public class Die {
    public final int MAX = 6;
    Random random;

    public Die() {
        random = new Random();
    }

    public int roll() {
        return random.nextInt(MAX) + 1; // 그럼 한줄이지ㅋ
    }
}

