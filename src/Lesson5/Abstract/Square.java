package Lesson5.Abstract;

import Lesson5.Abstract.CloseCurve;

public class Square extends CloseCurve {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double computeArea() {
        return (side * side);
    }
}
