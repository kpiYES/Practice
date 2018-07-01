package com.fourthLesson;

import java.util.Arrays;

public class ArrayHandler {

public static String parsing(int[] arr){
   // one static other private, StringBuilder or "+" or concat

    StringBuilder sb = new StringBuilder();
    ArrayHandler ah = new ArrayHandler();
    sb.append("Array values = ").append(Arrays.toString(arr)).append("\n");
    sb.append("Sum of values = ").append(ah.sum(arr)).append("\n");
    sb.append("Average value = ").append(ah.avr(arr)).append("\n");
    sb.append("Min value = ").append(ah.min(arr)).append("\n");
    sb.append("Max value = ").append(ah.max(arr));
    return sb.toString();
}

    private int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private int avr(int[] arr) {
        return sum(arr) / arr.length;
    }

    private int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

}
