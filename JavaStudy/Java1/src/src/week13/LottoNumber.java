package src.week13;

import java.util.Random;

public class LottoNumber {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 6; i++) {
            int r = random.nextInt(50);
            System.out.print(r + " ");
        }

        System.out.println();
    }
}
