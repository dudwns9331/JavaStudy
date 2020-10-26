import java.util.Random;

public class Test {

    private Random random;

    // 생성자
    public Test() {
        random = new Random();
    }


    // 메소드
    public int[] generateNumbers() {
        int [] numar;

        numar = new int[6];

        for(int i = 0; i < numar.length; i++) {
            numar[i] = random.nextInt(50);
        }

        return numar;
    }
}