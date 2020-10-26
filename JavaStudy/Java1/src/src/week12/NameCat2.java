package src.week12;

public class NameCat2 {
    private String name;
    private int age;

    public NameCat2() { }
    public NameCat2(String name) {
        this.name = name;
    }
    public NameCat2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("냠냠!");
    }

    public void yaong() {
        System.out.println("야옹");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "NameCat2{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public static void main(String[] args) {
        NameCat2 c1, c2, c3;

        c1 = new NameCat2();
        c2 = new NameCat2("갑순이");
        c3 = new NameCat2("갑돌이", 19);

        c1.setName("왕눈이");
        c1.setAge(20);

        c2.setAge(21);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
