package src.week13;

import java.util.Random;

public class VotingSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        VotingMachine votingMachine = new VotingMachine();

        for(int i = 0; i < 1000; i++) {

            if(random.nextBoolean())
                votingMachine.voteForDuk();
            else
                votingMachine.voteForSun();
        }

        System.out.println("순대 특표수 : " + votingMachine.getSunVotes());
        System.out.println("떡볶이 특표수 : " + votingMachine.getDukVotes());
    }
}
