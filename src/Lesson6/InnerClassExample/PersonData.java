package Lesson6.InnerClassExample;

import java.util.Arrays;
public class PersonData {
    public static void main(String[] args){
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };
        Arrays.sort(people, new NameComparator());
        System.out.println(Arrays.toString(people));
    }
}
