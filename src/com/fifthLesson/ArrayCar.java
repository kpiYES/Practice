package com.fifthLesson;

import java.util.Arrays;

public class ArrayCar {

    private static final int currentYear = 2018;

    public static Car[] getCarsByMark(Car[] cars, String mark) {
        return  Arrays.stream(cars).filter(car -> car.getMark().equals(mark)).toArray(Car[]::new);
    }

    public static Car[] getCarsByModelAndUsedYears(Car[] cars, String model, Integer usedYears) {
        return Arrays.stream(cars).filter(car -> car.getModel().equals(model) && usedYears > currentYear - car.getYear()).toArray(Car[]::new);
    }

    public static Car[] getCarsByYearsAndPrice(Car[] cars, Integer year, Integer price) {
        return Arrays.stream(cars).filter(car -> car.getYear().equals(year)&& car.getPrice() > price).toArray(Car[]::new);
    }
}


