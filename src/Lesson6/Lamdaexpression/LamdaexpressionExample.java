package Lesson6.Lamdaexpression;

import Lesson6.Exec.Person;

import java.util.Comparator;

public class LamdaexpressionExample {
    public static void main(String[] args) {

        Comparator<Person> cp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
        MyFunctionalInterface f1 = new MyFunctionalInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Hello");

            }
        };
        f1.abstractMethod();

        MyFunctionalInterface f2 = () -> System.out.println("Hola");
        f2.abstractMethod();
    }
}

// Lambda Expression

//1. Parameter        2.Arrow         3.Method body
//        ()          ->              S.o.p("Hi")
//        x                           100
//        (a,b)                       { int a=100; s.o.p(a)};
//        (a,b,c)                     {int a =100; return a*a};