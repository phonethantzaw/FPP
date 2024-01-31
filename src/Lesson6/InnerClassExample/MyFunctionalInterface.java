package Lesson6.InnerClassExample;

@FunctionalInterface
public interface MyFunctionalInterface {
    void abstractMethod();
    String toString();
    int hashCode();
    boolean equals(Object obj);
    static void print1(){
        System.out.println("1");
    }
    default void print2(){
        System.out.println("2");
    }
}
