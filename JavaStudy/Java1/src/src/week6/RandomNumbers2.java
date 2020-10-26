package src.week6;

public class RandomNumbers2 {
    public static void main(String[] args) {

        System.out.println("100보다 작은 정수 난수");

        int array[] = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            array[i] = (int)(100* Math.random());
        }

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < 10; i++) {
            sum = sum + array[i];
            System.out.println(array[i]);

            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i])
                min = array[i];

        }
        System.out.println();

        System.out.println("원소들 중 최소값 : " + min);
        System.out.println("원소들 중 최대값 : " + max);
        System.out.println("원소들의 평균값 : " + sum/10.0);

    }
}
