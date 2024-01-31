package Lesson6.InnerClassExample;

public class AnonymousExample2 {
    public static void main(String[] args) {
        //Anonymous inner class that implements MyInterface
        MyInterface cl1 = new MyInterface(){
            @Override
            public void myAbstractMethod(){
                System.out.println("Implementation of the abstract method.");
            }
            @Override
            public void abstractMethod2() {
                System.out.println("Implementation of the abstract method2.");
            }
        };
        cl1.myAbstractMethod();
        //local inner class
        class MyImpl implements MyInterface{
            @Override
            public void myAbstractMethod() {
                System.out.println("Implementation of the abstract method.");
            }
            @Override
            public void abstractMethod2() {
                System.out.println("Implementation of the abstract method2.");
            }
        }
        MyImpl cl2 = new MyImpl();
        cl2.myAbstractMethod();
    }
}
