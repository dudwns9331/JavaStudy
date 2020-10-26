package src.week12;

public class Remocon {
    private int volume = 0;
    private int channel = 0;
    public final static int MAX_VOLUME = 3;
    public final static int MAX_CHANEL = 3;

    public void volumeUp() {
        if(this.volume != MAX_VOLUME)
            this.volume++;
        display();
    }

    public void volumeDown() {
        if(this.volume != 0)
            this.volume--;
        display();
    }

    public void channelUp() {

        this.channel++;

        if(this.channel > MAX_CHANEL)
            this.channel = 0;

        display();
    }

    public void channleDown(){

        this.channel--;

        if(this.channel < 0)
            this.channel = 3;
        display();
    }

    public void display() {
        System.out.println("Volume = " + volume);
        System.out.println("Chanel = " + channel);
    }
}
