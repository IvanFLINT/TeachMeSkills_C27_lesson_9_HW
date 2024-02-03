package com.teachmeskills.lesson9.task_2.runner;

public class Runner {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1,0,0,0},
                {0,1,0,0},
                {0,0,0,0}
        };
        int[][] arr2 = new int[][]{
                {1,2,3},
                {1,1,1},
                {0,0,0},
                {2,1,0}
        };
        for (int[] r: arr1){
            for (int s: r){
                System.out.print(" " + s);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] r: arr2){
            for (int s: r){
                System.out.print(" " + s);
            }
            System.out.println();
        }
    }
}
