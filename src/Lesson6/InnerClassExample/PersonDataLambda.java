package Lesson6.InnerClassExample;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataLambda {
    public static void main(String[] args){
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };
        Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        //Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
