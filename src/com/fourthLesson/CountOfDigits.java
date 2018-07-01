package com.fourthLesson;

public class CountOfDigits {

    public static int count(int number, int digit) {
        int i = 0;
        int divider = 1;
        while (number / divider > 1) {
            if (number/divider % 10 == digit){
                i++;}
            divider *= 10;
        }
        return i;
    }
}
