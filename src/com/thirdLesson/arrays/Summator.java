package com.thirdLesson.arrays;

public class Summator {
    public static Matrix sum(Matrix a, Matrix b) throws RuntimeException {

        Matrix newMatrix;

        if(a.getHorizontalSize() != b.getHorizontalSize() || a.getVerticalSize() != b.getVerticalSize())
            throw new RuntimeException();
        else {
            newMatrix = new Matrix(a.getVerticalSize(), a.getHorizontalSize());
            for (int i = 0; i < a.getVerticalSize(); i++) {
                for (int j = 0; j < a.getHorizontalSize(); j++) {
                    newMatrix.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
                }
            }
        }
        return newMatrix;
    }
}
