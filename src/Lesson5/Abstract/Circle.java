package Lesson5.Abstract;

public class Circle extends CloseCurve {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return (Math.PI * radius * radius);
    }
}
