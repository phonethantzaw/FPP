package Lesson6.InnerClassExample;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataMember {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };
        PersonDataMember pd = new PersonDataMember();

        Arrays.sort(people, pd.new NameComparator());
        System.out.println(Arrays.toString(people));


    }

    class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }


}
