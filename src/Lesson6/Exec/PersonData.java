package Lesson6.Exec;

import java.util.Arrays;

public class PersonData {

    public static void main(String[] args) {
        Person[] people = {new Person("Joe"), new Person("Bob"), new Person("Ann")};

        Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
//        Arrays.sort(people, new NameComparator());
        System.out.println(Arrays.toString(people));
    }
}
