package Lesson6.LocalInnerClass;

public class G {

    int a;



    public void method1(final int x) {
        //local variable x & z must be final or effectively final
        //cannot change the values of LOCAL variables that are used in local inner class
        int z = 10; //effectively final
        int y = 40;
        y = 50;

        //local inner class
        class H {
            H() {
                System.out.println(a);
                a = 10;
                System.out.println(x);
                System.out.println(z);
            }
        }
    }
}
