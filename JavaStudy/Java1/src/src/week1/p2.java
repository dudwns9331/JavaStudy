package src.week1;

public class p2 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("i 를 1 씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0)
                sum = sum + i;
        }

        System.out.println("1 이상 100 이하 3의 배수들의 합 = " + sum);

        System.out.println("i 를 3씩 증가시키면서 i를 더하는 방식으로 계산");

        System.out.println();

        sum = 0;

        for(int i = 0; i < 100; i = i + 3)
            sum = sum + i;

        System.out.println("1 이상 100 이하 3의 배수들의 합 = " + sum);

    }
}
