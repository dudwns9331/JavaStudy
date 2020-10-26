package src.week13;

public class VotingMachine {
    private int dukVotes;
    private int sunVotes;

    public void voteForDuk() {
        dukVotes++;
    }

    public void voteForSun() {
        sunVotes++;
    }

    public void clear() {
        dukVotes = sunVotes = 0;
    }

    public int getDukVotes() {
        return dukVotes;
    }

    public int getSunVotes() {
        return sunVotes;
    }
}
