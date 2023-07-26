package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {


        Employee emp1 = new Employee("Ganesh", "101");
        Employee emp2 = new Employee("Ram", "104");
        Employee emp3 = new Employee("Shyam", "105");
        Employee emp4 = new Employee("Harshal", "102");

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before Sorting: "+ list);
        Collections.sort(list,new sortById());
        System.out.println("After Sort: "+list);
    }
}
