package com.fourthLesson;

public class Bank {

    public static int getYearsWithWhile(int sum, int percent, int desiredSum) {
        int years = 0;
        while (sum < desiredSum) {
            sum += sum * percent / 100;
            years++;
        }
        return years;
    }

    public static int getYearsWithFor(int sum, int percent, int desiredSum) {

        int years;
        for (years = 0; sum < desiredSum; years++) {
            sum += sum * percent / 100;
        }
        return years;
    }

    public static int getYearsWirhDoWhile(int sum, int percent, int desiredSum) {
        int years = 0;
//        toReturn :
//        {
        do {
            if (sum >= desiredSum)
                break;

//            if (sum >= desiredSum)
//                return years;

//                if (sum >= desiredSum)
//                    break toReturn;

            sum += sum * percent / 100;
            years++;
        } while (sum < desiredSum);
//        }
        return years;
    }
}

