package Lesson6.InnerClassExample;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataAnonymous {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };
        Comparator comparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
