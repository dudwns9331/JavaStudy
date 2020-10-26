package src.week12;

public class Human2 {
    private String name;
    private int age;

    public Human2() { }

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int i) {
        this.age = i;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public static void main(String[] args) {
        Human2 human1 = new Human2();
        Human2 human2 = new Human2();

        human1.setName("썸녀");
        human1.setAge(19);

        human2.setName("썸남");
        human2.setAge(20);

        System.out.println(human1);
        System.out.println(human2);
    }

}
