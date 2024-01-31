package Lesson6.InnerClassExample;

public class AnonymousExample {
    public static void main(String[] args) {
        //Anonymous Inner class that extends from Parent Class.
        Parent ch1 = new Parent("Hi"){
            @Override
            public void methodA(){
                System.out.println("Child class version A");
            }
            @Override
            public void methodB() {
                System.out.println("Child class version B");
            }
        };
        //local inner class
        class Child extends Parent{
            Child(){
                super("Hi");
            }
            @Override
            public void methodA(){
                System.out.println("Child class version A");
            }
            @Override
            public void methodB() {
                System.out.println("Child class version B");
            }
        }
        Child ch = new Child();
    }
}
