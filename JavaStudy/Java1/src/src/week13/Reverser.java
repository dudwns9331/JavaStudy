package src.week13;

public class Reverser {

    private String s;
    public Reverser() { }
    public Reverser(String s) {
        this.s = s;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] a = s.split("\\s+");
        for(int i = a.length - 1; i >=0; i--) {
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
