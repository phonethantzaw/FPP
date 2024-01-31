package Lesson6.InnerClassTest;

import Lesson6.InnerClassExample.Person;
import Lesson6.InnerClassExample.PersonDataLocalInner;

import java.util.Arrays;
import java.util.Comparator;

public class MemberInner {
    public static void main(String[] args) {
//        Person[] people = {
//                new Person("Joe"),
//                new Person("Bob"),
//                new Person("Ann")
//        };
//        MemberInner mi = new MemberInner();
//        Arrays.sort(people, mi.new NameComparator());
//
//        System.out.println(Arrays.toString(people));

        MemberInner m = new MemberInner();


        var mm = new MyInterface() {
            @Override
            public void myAbstract() {
                System.out.println("Hello Member!");
            }
        };

        mm.myAbstract();
    }

    class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public interface MyInterface {
        abstract void myAbstract();
    }
}
