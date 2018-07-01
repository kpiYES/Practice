package com.fourthLesson;

public class Main {
    public static void main(String[] args) {

        System.out.println(CountOfDigits.count(2333431,3));

        int[] arr = {6,3,7,9,2,1,7,6,5,4};
        System.out.println(ArrayHandler.parsing(arr));

        System.out.println(Bank.getYearsWithWhile(1000,5,1051));
        System.out.println(Bank.getYearsWithFor(1000,5,1051));
        System.out.println(Bank.getYearsWirhDoWhile(1000, 5, 1051));
        System.out.println();

        NumbersAsTable.printTriangleLeft(0, 4);
        NumbersAsTable.printTriangleRight(1, 5);
    }
}
