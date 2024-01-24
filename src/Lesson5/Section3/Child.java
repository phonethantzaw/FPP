package Lesson5.Section3;

public class Child extends Parent {

    int a;
    static int b;


    Child(int x, int a, int b) {
        super(x);
        this.a = a;
        this.b = b;
        System.out.println("Child Constructor");
    }

    {
        System.out.println("Child Instance Block A");
    }

    static {
        System.out.println("Child static Block A");
    }

    static {
        System.out.println("Child static Block B");
    }

    {
        System.out.println("Child Instance Block B");
    }

    void childStaticMethod() {
        System.out.println("Child Static Method 1");
    }

    void childInstanceMethod() {
        System.out.println("Child Instance Method 1");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Child.b = b;
    }
}
