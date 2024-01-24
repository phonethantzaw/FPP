package Assignment5.Prog1;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Rectengle(3, 2, "red"),
                new Circle("White", 2), new Shape("Green"),
                new Square(2, 3, "Red")};

        printTotal(shapes);

    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape s : shapes) {
            totalArea += s.calcualteArea();
            totalPerimeter += s.calculatePerimeter();
        }

        System.out.println("Total Area of Shapes " + totalArea);
        System.out.println("Total Perimeter of Shapes " + totalPerimeter);
    }

}
