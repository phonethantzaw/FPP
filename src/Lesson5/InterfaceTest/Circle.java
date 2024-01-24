package Lesson5.InterfaceTest;

public class Circle implements ClosedCurve {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return (Math.PI * radius * radius);
    }

}
