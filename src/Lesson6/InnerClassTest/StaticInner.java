package Lesson6.InnerClassTest;

import Lesson6.InnerClassExample.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class StaticInner {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann")
        };

        String n = "Robert";
        System.out.println(lengthString(n));

        System.out.println(factorial(5));

        System.out.println(n.substring(0, 1));
//        MemberInner mi = new MemberInner();
        Arrays.sort(people, new NameComparator());

        System.out.println(Arrays.toString(people));

        var a = new MyInterface() {
            @Override
            public void myAbstract() {

            }
        };
    }

    private static void reverseString(String s) {
        if (s == null || s.equals("")) {
            return;
        } else {
            reverseString(s.substring(1));
            System.out.println(s.charAt(0));
        }
    }

    private static int lengthString(String s) {
        if (s == null || s.equals("")) {
            return 0;
        } else {
            return 1 + lengthString(s.substring(1));
        }
    }

    //    5*4*3*2*1
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static interface MyInterface {
        abstract void myAbstract();
    }
}
