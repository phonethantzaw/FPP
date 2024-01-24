package Lesson5.InterfaceTest;


public class Square implements ClosedCurve {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return (side * side);
    }


}
