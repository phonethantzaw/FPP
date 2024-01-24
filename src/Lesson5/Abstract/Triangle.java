package Lesson5.Abstract;

import Lesson5.Abstract.CloseCurve;

public class Triangle extends CloseCurve {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double computeArea() {
        return (0.5 * base * height);
    }
}
