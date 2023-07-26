package Comparator_;

import java.util.Comparator;

public class sortByname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().compareTo(o1.getName());
    }
}
