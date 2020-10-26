package Generics.comparator;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {

        int i = o1.name.compareTo(o2.name);

        if(i == 0)
            i = o1.age - o2.age;

        return i;
    }
}
