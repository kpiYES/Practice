package com.fifthLesson;

import java.util.ArrayList;
import java.util.List;

public class ArrayCar {

    public static List<Car> getCarsForMark(Car[] cars, String mark) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMark().equals(mark)) {
                carList.add(car);
            }
        }
        return carList;
    }

    public static List<Car> getCarsForModelAndUsedYears(Car[] cars, String model, int usedYears) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && usedYears > 2018 - car.getYear()) {
                carList.add(car);
            }
        }
        return carList;
    }

    public static List<Car> getCarsForYearsAndPrice(Car[] cars, int year, int price) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                carList.add(car);
            }
        }
        return carList;
    }
    }


