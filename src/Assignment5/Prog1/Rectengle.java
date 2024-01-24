package Assignment5.Prog1;

public class Rectengle extends Shape {
    protected double width;
    protected double height;


    Rectengle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double calcualteArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }
}
