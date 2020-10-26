package Collections;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        int value = c1.name.compareTo(c2.name);
        if(value == 0)
            return 0;
        else
            return value;
    }
}
