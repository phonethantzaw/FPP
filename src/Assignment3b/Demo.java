package Assignment3b;

public class Demo {
    private String str;
    private boolean result;
    private static int count;

    public Demo() {
        System.out.println("First Constructor initialization");
    }

    public Demo(String str, boolean result) {
        this.str = str;
        this.result = result;
        System.out.println("Second Constructor initialization");
    }


    public void instanceMthOne() {
        System.out.println("First instance initialization");
    }

    public void instanceMthTwo() {
        System.out.println("Second instance initialization");
    }

    public static void staticMthOne() {
        System.out.println("First static initialization");
    }

    public static void staticMthTwo() {
        System.out.println("Second static initialization");
    }

    {
        System.out.println("First initialization Block");
    }

    {
        System.out.println("Second initialization Block");
    }

    static {
        System.out.println("First static initialization Block");
    }

    static {
        System.out.println("Second static initialization Block");
    }

    public static void main(String[] args) {
        Demo dm1 = new Demo();
        Demo dm2 = new Demo("Hello", true);

        dm1.instanceMthOne();
        dm2.instanceMthTwo();

        staticMthOne();
        staticMthTwo();
    }
}
