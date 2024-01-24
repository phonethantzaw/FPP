package Lesson5.Section3;

public class Parent {

    int x = parentStaticMethod2();
    static int y = parentStaticMethod1();

    Parent(int x) {
        this.x = x;
        System.out.println("Parent Constructor");
    }

    {
        System.out.println("Parent Instance Block A");
    }

    static {
        System.out.println("Parent static Block A");
    }

    static {
        System.out.println("Parent static Block B");
    }

    {
        System.out.println("Parent Instance Block B");
    }

    static int parentStaticMethod1() {
        return 100;
    }

    static int parentStaticMethod2() {
        return 200;
    }

    void parentInstanceMethod() {
        System.out.println("Parent Instance Method 1");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Parent.y = y;
    }
}
