package com.thirdLesson.arrays;

public class Runner {
    public static void main(String[] args) {

        Matrix matrixA = MatrixFactory.createMatrix(5, 4);

        Matrix matrixB = MatrixFactory.createMatrix(6, 4);
        try {
            System.out.println(matrixA);
            System.out.println(matrixB);

            Matrix matrix = Summator.sum(matrixA, matrixB);
            System.out.println(matrix.toString());
            System.out.println(matrix.getVerticalSize());
            System.out.println(matrix.getHorizontalSize());

        } catch (RuntimeException e) {
            System.out.println("different arraySizes");
        }
    }
}
