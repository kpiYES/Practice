package com.thirdLesson.arrays;

public class Matrix {

    private int arr[][];

    public Matrix(int row, int column) {
        arr = new int[row][column];
    }

    public int getElement(int i, int j) {
        return arr[i][j];
    }

    public void setElement(int i, int j, int n) {
        arr[i][j] = n;
    }

    public int getHorizontalSize() {
        return arr[0].length;
    }

    public int getVerticalSize() {
        return arr.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.getVerticalSize(); i++) {
            for (int j = 0; j < this.getHorizontalSize(); j++) {
                sb.append(this.getElement(i, j));
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
