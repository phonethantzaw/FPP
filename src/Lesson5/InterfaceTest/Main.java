package Lesson5.InterfaceTest;


public class Main {
    public static void main(String[] args) {
        ClosedCurve[] objects = {new Triangle(3, 3), new Square(3), new Circle(3)};

        for (ClosedCurve c : objects) {
            System.out.println("Compute Area of " + c.getClass().getSimpleName() + " " + c.computeArea());
        }
    }
}
