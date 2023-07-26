package Comparator_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparator_demo {
    public static void main(String[] args) {

        Student emp1 = new Student("Ganest","101");
        Student emp2 = new Student("Ram", "104");
        Student emp3 = new Student("Shyam","105");
        Student emp4 = new Student("Harshal","102");

        List<Student> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before sorting "+list);
        Collections.sort(list, new sortById());
        System.out.println("After sorting:"+ list);
    }
}
