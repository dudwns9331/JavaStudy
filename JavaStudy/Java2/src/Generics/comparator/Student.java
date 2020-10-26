package Generics.comparator;

public class Student extends Human{

     int snumber;

    public Student(String name, int age, int snumber) {
        super(name, age);
        this.snumber = snumber;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + snumber;
    }
}
