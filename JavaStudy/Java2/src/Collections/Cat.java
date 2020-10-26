package Collections;

import java.util.*;

public class Cat implements Comparable<Cat> {

    int age;
    String name;

    public Cat(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat other) {

        if(age < other.age)
            return -1;
        else if (age > other.age)
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Set<Cat> s = new HashSet<>();
        s.add(new Cat(1, "나비"));
        s.add(new Cat(2,"왕눈"));
        s.add(new Cat(1, "나비"));
        s.add(new Cat(5, "나비"));
        s.add(new Cat(4, "야옹"));
        s.add(new Cat(4, "실눈"));
        System.out.println(s);

        SortedSet<Cat> ss = new TreeSet<>(new CatComparator());

        ss.addAll(s);
        System.out.println(ss);

        ss = new TreeSet<Cat>(s);
        System.out.println(ss);

    }
}
