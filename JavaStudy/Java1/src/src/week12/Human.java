package src.week12;

public class Human {
    private String name;
    private int age;

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
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setName("썸녀");
        human1.setAge(19);

        human2.setName("썸남");
        human2.setAge(20);

        System.out.println(human1);
        System.out.println(human2);
    }

}
