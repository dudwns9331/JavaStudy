package src.week13;

public class LottoGeneratorTest {
    public static void main(String[] args) {
        int[] numbers; // size 6 배열 LottoGenerator 6개 랜덤 숫자 배열

        LottoGenerator generator = new LottoGenerator();
        // 6개의 랜덤숫자를 가진 배열
         generator.generateNumber(// 6개의 로또번호를 생성
                 ); //배열이 리턴
        int x = 10;
        // 끝

        for (int n = 0; n < 10; n++) { // 열번 해
            numbers = generator.generateNumber(); //로또 번호 여섯개 만들도록 지시함. 10번 만든거야
            for (int i = 0; i < numbers.length; i++)
                System.out.print(numbers[i] + " ");
            System.out.println();
        }
    }
}
