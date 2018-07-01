package com.thirdLesson.arrays;

public class MatrixFactory {
private static final int upperBound = 100;
    public static Matrix createMatrix(int row, int column) {
        Matrix newMatrix = new Matrix(row, column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix.setElement(i, j, (int) (Math.random() * upperBound));
            }
        }
        return newMatrix;
    }
}
