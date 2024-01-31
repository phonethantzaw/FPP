package Lesson6.InnerStaticClass;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    private String s = "hello";

    public static void main(String[] args) {

        new MyClass();
    }

    MyClass() {
        MyStaticNestedClass.myStaticMethod();
        MyStaticNestedClass c1 = new MyStaticNestedClass();
        c1.myOtherMethod();
        //as with inner classes, private instance variables are accessible
        int y = c1.x;
    }

    static class MyStaticNestedClass {
        private int x = 0;

        static void myStaticMethod() {
            //compiler error -- no access
//            String t = s;
        }

        private void myOtherMethod() {

        }
    }

//    class AnotherClass {
//        public static void main(String[] args) {
//            MyClass.MyStaticNestedClass rl = new MyClass.MyStaticNestedClass();
//            MyClass n = new MyClass();
//
////            the following is illegal -- compiler error
////            MyClass.MyStaticNestedClass cL2 = n.new MyStaticNestedClass();
//        }
//    }
}


