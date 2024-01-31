package Lesson6.InnerClassTest;

import Lesson6.InnerClassExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class LocalInner {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };

        localInner(people);

    }

    private static void localInner(Person[] people) {
        class NameComparator implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        Arrays.sort(people, new NameComparator());

        System.out.println(Arrays.toString(people));
    }
}
