package src.week13;

import java.util.Random;

public class LottoGenerator {
    private Random random;

    public LottoGenerator() {
        random = new Random();
    }

    public int[] generateNumber() {
        int[] numbers;

        numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(50);
        }

        return numbers;
    }
}
