package com.fifthLesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCar {

    public static List<Car> getCarsByMark(Car[] cars, String mark) {
        return Arrays.stream(cars).filter(car -> car.getMark()
                .equals(mark))
                .collect(Collectors.toList());

    }

    public static List<Car> getCarsByModelAndUsedYears(Car[] cars, String model, int usedYears) {
        return Arrays.stream(cars).filter(car -> car.getModel().equals(model))
                .filter(car -> usedYears > 2018 - car.getYear())
                .collect(Collectors.toList());
    }

    public static List<Car> getCarsByYearsAndPrice(Car[] cars, int year, int price) {

        return Arrays.stream(cars).filter(car -> car.getYear() == year)
                .filter(car -> car.getPrice() > price)
                .collect(Collectors.toList());
    }
}


