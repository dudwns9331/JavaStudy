package src.week13;

public class BalanceTesterDemo2 {
    public static void main(String[] args) {
        String[] strings = {"((hello)(goodbye))",
                            "((a)(b)(())", "(a))b("};

        for(int i = 0; i < strings.length; i++) {
            BalanceTester tester = new BalanceTester(strings[i]);

            if(tester.balanced())
                System.out.println(strings[i] + "는 괄호짝이 맞습니다.");
            else
                System.out.println(strings[i] + "는 괄호짝이 맞지 않습니다.");
        }

    }
}
