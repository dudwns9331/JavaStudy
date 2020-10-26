package src.week13;

public class BalanceTesterDemo {
    public static void main(String[] args) {
        String string ="((hello)(goodbye)";

        BalanceTester tester = new BalanceTester(string);

        if(tester.balanced())
            System.out.println(string + "는 괄호짝이 맞습니다.");
        else
            System.out.println(string + "는 괄호짝이 맞지 않습니다.");
    }
}
