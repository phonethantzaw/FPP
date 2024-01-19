package Lesson3;

class Demo14 {
    public String str;
    public static int count;
    public final boolean result = true;
}

public class Demo15 {
    public static void main(String[] args) {
        Demo14 d1 = new Demo14();
        d1.str = "Hi";
        d1.count = 15;
        Demo14 d2 = new Demo14();
        d2.str = "Hello";
        d2.count = 20;
        System.out.println(d1.str);
        System.out.println(d2.str);
        System.out.println(d1.count);
        System.out.println(d2.count);
        System.out.println(d1.result);
        System.out.println(d2.result);
    }


}
