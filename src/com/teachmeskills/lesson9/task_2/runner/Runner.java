package com.teachmeskills.lesson9.task_2.runner;

import com.teachmeskills.lesson9.task_2.method.Utils;
/**
 * This program execution class
 */
public class Runner {
    public static void main(String[] args) {
        int[][] firstMatrix = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] secondMatrix = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("First Matrix: ");
        Utils.inference(firstMatrix);
        System.out.println("Second Matrix: ");
        Utils.inference(secondMatrix);
        System.out.println("Multiplication result: ");
        Utils.inference(result);
    }
}
