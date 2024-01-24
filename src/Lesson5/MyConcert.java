package Lesson5;

public class MyConcert extends MyAbstract {

    MyConcert(int value) {
        super(value);
    }


    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    public static void main(String[] args) {
        MyConcert.staticMethod();
        ;

        MyConcert c = new MyConcert(12);
        c.instanceMethod();
    }
}
