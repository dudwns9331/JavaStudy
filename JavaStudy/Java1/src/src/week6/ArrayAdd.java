package src.week6;

public class ArrayAdd {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = (int)(10*Math.random());
        }

        for(int i = 0; i < 10; i++){
            b[i] = (int)(10*Math.random());
        }

        for(int i = 0; i < 10; i++){
            c[i] = a[i] + b[i];
        }

        printArray(a);
        printArray(b);
        printArray(c);
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
