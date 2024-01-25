package Lesson6.AnonymousInnserClass;

public class AnonymusExample {

    //Anonymous class that implements MyInterface
    public static void main(String[] args) {
        double b = 5.0;
        long a = (long) b;
        int aa = (int) b;

        Parent ch1 = new Parent("Hola") {
            @Override
            public void methodA() {
                System.out.println("Child class version A");
            }

            @Override
            public void methodB() {
                System.out.println("Child class version B");
            }
        };
        //local inner class
        class Child extends Parent {
            Child() {
                super("Hi");
            }

            @Override
            public void methodA() {
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
