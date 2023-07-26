package overloading;

public class explain_1 {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println("add() with 2 parameters");
        System.out.println(add(4, 6));

        System.out.println("add() with 3 parameters");
        System.out.println(add(4, 6, 7));

//        ********************** OverLoading --
}

}

//        Method Overriding:
//        Method Overriding is a Run time polymorphism. In method overriding, the derived class provides the specific implementation of the method that is already provided by the base class or parent class. In method overriding, the return type must be the same or co-variant (return type may vary in the same direction as the derived class).

//        Example of Method Overriding:
//
//        Java
//        import java.io.*;

class Animal {

    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

class Dog extends Animal {

    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}