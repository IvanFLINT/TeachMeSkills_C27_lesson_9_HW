package com.teachmeskills.lesson9.task_1.figure;

/**
 * This class describes the shape of an ellipse
 */
public non-sealed class Ellipse extends Figure {
    final double PI = 3.14;
    double a, b;
    public double p;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String areaCalculation() {
        return "Площадь элипса: " + PI * a * b;
    }

    @Override
    public String perimeterCalculation() {
        p = 4 * (((PI * a * b) + Math.pow(a - b, 2)) / (a + b));
        return "Периметр элипса: " + p;
    }
}
