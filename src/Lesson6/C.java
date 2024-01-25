package Lesson6;

public class C {
    public static void main(String[] args) {
//      1.
        A a = new A();
        A.B b = a.new B();
//      2.
        A.B b2 = new A().new B();
    }
}
