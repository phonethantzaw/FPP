package Lesson6.PTest;

import Lesson6.Exec.Person;

import java.util.Arrays;
import java.util.Comparator;

public class NestedTest {

    class nameComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }


    public static void main(String[] args) {
        Person[] people = {new Person("Joe"), new Person("Bob"), new Person("Ann")};

        NestedTest nt = new NestedTest();

        Arrays.sort(people, nt.new nameComparator());
//        System.out.println(Arrays.toString(p));

//        result(people);

    }

    private static void result(Person[] p) {


//        var comp = new Comparator<Person>() {
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
        Comparator<Person> pp = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Arrays.sort(p, pp);
        System.out.println(Arrays.toString(p));
    }


}
