package src.week13;

public class DiceCasting2 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int fre[] = new int[12];

        fre[0] = 0;

        for(int i = 0; i < 1000; i++) {
            fre[dice.roll() - 1]++; // 2~12 - 1 1~11
        }

        // dice.roll() 2~12      12 -> 인덱스 x 크기가 12여서 0~11
        // 배열의 크기 12 -> index 0~11

        // 11 = 12인경우
        // 1 = 2인경우
        // 0 = 1인경우

        // fre[0] = 0
        // fre[1] = ?
        // ... fre[11] = ? 12인경우 1 ~ 12 빈도수 0번방~11번방



        // fre[랜덤한 숫자] fre[2~12]++
        // fre[2]++;         2 가 나온경우 +1
        // fre[5]++;         5 가 나온경우 +1

        // 1000번 -> 1000번동안에 2~12의 빈도수가 랜덤하게 지정되서 +1 된다.

        for(int i = 0; i < 12; i++) {
            System.out.println(i + 1 + ":\t\t" + fre[i]);
        }
    }
}
