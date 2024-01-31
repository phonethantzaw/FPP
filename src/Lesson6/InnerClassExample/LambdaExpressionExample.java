package Lesson6.InnerClassExample;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        //Anonymous inner class
        MyFunctionalInterface f1 = new MyFunctionalInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Hello");
            }
        };
        f1.abstractMethod();

        //Lambda expression ONLY USED FOR FUNCTIONAL INTERFACES
        MyFunctionalInterface f2 = () -> System.out.println("Hello");
        f2.abstractMethod();

        //abstract method has no parameter
        //1. body of the method is just one line of code
        //() -> System.out.println("Hello");
        //2. body of the method is multiple lines of code
        //() -> {
        //  int a = 10;
        //  System.out.println(a);
        // }
        //3. abstract method returns a value
        //3.1 method body is 1 line
        //() -> 10;
        //3.2 method body has multiple lines of code
        //() -> {
        //    int a = 10;
        //    return a;
        // }

        //abstract method has 1 parameter
        //    x -> System.out.println(x);
        //    x -> {
        //          int sqrtValue = Math.sqrt(x);
        //          return sqrtValue;
        //    }

        //abstract method takes multiple parameters
        //(a, b) -> System.out.println(a + " " + b);
        //(a, b) -> {
        //      int res = a + b;
        //       return res;
        // }

    }
}
