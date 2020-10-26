package src.week13;

import java.util.Scanner;

public class VotingSimulation2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s;

        System.out.println("투표 시작!");

        VotingMachine2 votingMachine2 = new VotingMachine2();

        while((s = input.nextLine()) != "투표 끝") {
            switch (s) {
                case "순대":
                    votingMachine2.vote("순대"); break;
                case"떡볶이":
                    votingMachine2.vote("떡볶이"); break;
                case "재투표" :
                    votingMachine2.clear(); break;
                case "순대 표" :
                    votingMachine2.getVotes("순대"); break;
                case "떡볶이 표" :
                    votingMachine2.getVotes("떡볶이");
                    default:
                    votingMachine2.vote("?");
            }
        }
        System.out.println("투표가 끝났습니다.");
        System.out.println("결과 : 순대 -> " + votingMachine2.getVotes("순대") + " 떡볶이 -> " + votingMachine2.getVotes("떡복이"));
    }
}
