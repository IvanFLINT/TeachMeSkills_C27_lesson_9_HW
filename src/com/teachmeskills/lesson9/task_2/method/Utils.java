package com.teachmeskills.lesson9.task_2.method;

/**
 * this class contains a static method inference for output
 */
public class Utils {
    public static void inference(int[][] array) {
        for (int[] arr : array) {
            for (int s : arr) {
                System.out.printf("%3d", s);
            }
            System.out.println();
        }
        System.out.println();
    }
}
