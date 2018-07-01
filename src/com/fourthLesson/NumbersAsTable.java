package com.fourthLesson;

public class NumbersAsTable {

    public static void printTriangleLeft(int min, int max) {

        for (int i = min; i <= max; i++) {
            for (int j = i; j >= min; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangleRight(int min, int max) {

        for (int i = min; i <= max; i++) {
            for (int s = max - i; s > 0; s--) {
                System.out.print("  ");
            }
            for (int j = i; j >= min; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
