package Lesson6.InnerClassTest;

import Lesson6.InnerClassExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaInner {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };
        Comparator<Person> cp = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Arrays.sort(people, cp);

        System.out.println(Arrays.toString(people));
    }
}
