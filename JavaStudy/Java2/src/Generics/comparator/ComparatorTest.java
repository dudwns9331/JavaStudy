package Generics.comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        System.out.println(new Human("홍길동", 18));
        System.out.println(new Student("홍길동", 18, 201813210));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("문재인", 60, 2018001));
        studentList.add(new Student("문재인", 30, 2018004));
        studentList.add(new Student("문재인", 30, 2018002));
        studentList.add(new Student("김정은", 35, 2018003));
        System.out.println(studentList);

        // HumanComparator를 이용하여 studentList를 정렬한다.
        studentList.sort(new HumanComparator());
        System.out.println("HumanComparator 사용 : " + studentList);

        // StudentComparator를 이용하여 studentList를 정렬한다.
        studentList.sort(new StudentComparator());
        System.out.println("StudentComparator 사용 : " + studentList);
        
    }
}
