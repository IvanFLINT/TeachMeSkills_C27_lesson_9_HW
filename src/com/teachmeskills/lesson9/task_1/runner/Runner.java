package com.teachmeskills.lesson9.task_1.runner;
import com.teachmeskills.lesson9.task_1.figure.*;
/**
 * This program execution class
 */

public class Runner {
    public static void main(String[] args) {
        Circle cir = new Circle(4);
        Rectangle rec = new Rectangle(6, 5);
        Triangle tri = new Triangle(4, 3, 5, 4);
        Trapeze tra = new Trapeze(4, 6, 5);
        Ellipse el = new Ellipse(8, 5);

        String[] arrSquare = new String[]{cir.areaCalculation(), rec.areaCalculation(),
                tri.areaCalculation(), tra.areaCalculation(), el.areaCalculation(),
                cir.perimeterCalculation(), rec.perimeterCalculation(),
                tri.perimeterCalculation(), tra.perimeterCalculation(), el.perimeterCalculation()};

        for (String s : arrSquare) {
            System.out.println(s);
        }
        System.out.print("Сумма всех периметров = " + (el.p + tra.p + tri.p + rec.p + cir.p));
    }
}

