package com.teachmeskills.lesson9.task_1.figure;

/**
 * This class describes the shape of a circle
 */
public non-sealed class Circle extends Figure {
    double r;
    public double p;
    final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String areaCalculation() {
        return "Площадь окружности: " + PI * r * r;
    }

    @Override
    public String perimeterCalculation() {
        p = 2 * PI * r;
        return "Периметр окружности: " + p;
    }
}
