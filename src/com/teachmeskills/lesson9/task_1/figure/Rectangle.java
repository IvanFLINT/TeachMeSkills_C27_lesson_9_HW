package com.teachmeskills.lesson9.task_1.figure;
/**
 * This class describes the shape of a rectangle
 */
public non-sealed class Rectangle extends Figure {

    double a, b;
    public double p;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String areaCalculation() {
        return "Площадь прямоугольника: " + a * b;
    }

    @Override
    public String perimeterCalculation() {
        p = a + a + b + b;
        return "Периметр прямоугольника: " + p;
    }
}