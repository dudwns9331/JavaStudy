package homework3;

import java.util.Scanner;

public class HanoiTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("몇 개의 디스크 사용하시겠습니까? : ");
        int n = input.nextInt();                // 디스크의 개수
        hanoi('A', 'B', 'C', n); // 말뚝 A, B, C 디스크의 개수 n
    }
    public static void hanoi(char from, char to, char spare, int ndisk) {
        if (ndisk == 1) {
            System.out.println(from + " --> " + to);
        }
        else {
            hanoi(from, spare, to, ndisk - 1);      // 분할
            System.out.println(from + " --> " + to);
            hanoi(spare, to, from, ndisk - 1);      // 정복
        }
    }
}
