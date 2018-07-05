package com.fourthLesson;

import java.util.Arrays;

public class ArrayHandler {

public static String parsing(int[] arr){


    StringBuilder sb = new StringBuilder();
    sb.append("Array values = ").append(Arrays.toString(arr)).append("\n");
    sb.append("Sum of values = ").append(sum(arr)).append("\n");
    sb.append("Average value = ").append(avr(arr)).append("\n");
    sb.append("Min value = ").append(min(arr)).append("\n");
    sb.append("Max value = ").append(max(arr));
    return sb.toString();
}

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int avr(int[] arr) {
        return sum(arr) / arr.length;
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

}
