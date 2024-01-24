package Lesson5.Abstract;

public class Main {
    public static void main(String[] args) {
        CloseCurve[] objects = {new Triangle(3, 3), new Square(3), new Circle(3)};

        for (CloseCurve c : objects) {
            System.out.println("Compute Area of " + c.getClass().getSimpleName() + " :: " + c.computeArea());
        }
    }
}
