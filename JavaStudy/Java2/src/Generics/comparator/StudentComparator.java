package Generics.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        HumanComparator hc = new HumanComparator();

        int i = hc.compare(o1,o2);

        if(i == 0)
            i = o1.snumber - o2.snumber;

        return i;
    }
}
