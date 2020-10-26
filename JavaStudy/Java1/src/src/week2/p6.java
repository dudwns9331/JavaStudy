package src.week2;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double TAX_RATE_LOW = 10.0/100.0;
        final double TAX_RATE_MID = 18.0/100.0;
        final double TAX_RATE_HIGH = 30.0/100.0;

        double TAX = 0.0;

        System.out.println("소득은 ?");

        double n = input.nextDouble();


        if(n <= 0)
            TAX = 0.0;
        else if(30000000 >= n) {
            TAX = n * TAX_RATE_LOW;
        }
        else if(70000000 >= n) {
            TAX = 30000000 * TAX_RATE_LOW + (n - 30000000) * TAX_RATE_MID;
        }
        else if(70000000 <= n){
            TAX = 30000000 * TAX_RATE_LOW + (70000000 - 30000000) * TAX_RATE_MID + (n - 70000000) * TAX_RATE_HIGH;
        }

        System.out.println("소득세 : " + TAX);

    }
}
