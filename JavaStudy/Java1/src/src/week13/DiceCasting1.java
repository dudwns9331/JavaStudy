package src.week13;

public class DiceCasting1 {
    public static void main(String[] args) {
        Dice dice = new Dice();

        for (int i = 0; i < 20; i++)
            System.out.println(dice.roll());

    }
}
