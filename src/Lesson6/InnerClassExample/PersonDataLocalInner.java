package Lesson6.InnerClassExample;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataLocalInner {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };

        PersonDataLocalInner pd = new PersonDataLocalInner();

        pd.sort(people);
        System.out.println(Arrays.toString(people));
    }

    public void sort(Person[] people) {
        class NameComparator implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        }
        Arrays.sort(people, new NameComparator());
    }



}
