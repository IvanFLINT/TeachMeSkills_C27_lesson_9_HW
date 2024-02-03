package com.teachmeskills.lesson9.task_1.figure;
/**
 * This class contains abstract methods for calculating area and perimeter
 */
public sealed abstract class Figure permits Circle, Ellipse, Rectangle,Trapeze,Triangle{

    public abstract String areaCalculation();

    public abstract String perimeterCalculation();

}
