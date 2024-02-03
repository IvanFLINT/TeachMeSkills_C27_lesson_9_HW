package com.teachmeskills.lesson9.task_1.figure;

/**
 * This class describes the shape of a trapezoid
 */
public non-sealed class Trapeze extends Figure {
    double a , b , h;
    public double p;
    public Trapeze(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    @Override
    public String  areaCalculation() {
        return "Площадь тропеции: " + (a + b) * h / 2;
    }

    @Override
    public String perimeterCalculation() {
        p = a + a + b + b;
        return "Периметр тропеции: " + p;
    }
}
