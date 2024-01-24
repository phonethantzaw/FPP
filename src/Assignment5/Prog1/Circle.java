package Assignment5.Prog1;

public class Circle extends Shape {
    protected double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcualteArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
