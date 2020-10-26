package src.week13;

public class VotingMachine2 {
    private int dukVotes;
    private int sunVotes;

    public void voteForDuk() {
        dukVotes++;
    }

    public void voteForSun() {
        sunVotes++;
    }

    public void vote(String pick) {
        if(pick == "떡볶이") {
            voteForDuk();
        }
        else if(pick == "순대") {
            voteForSun();
        }
        else;
    }

    public int getVotes(String pick) {
        if(pick == "떡볶이")
            return getDukVotes();
        else if(pick == "순대")
            return getSunVotes();
        else
            return 0;

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
