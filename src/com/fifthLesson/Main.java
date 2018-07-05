package com.fifthLesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car.Builder("BMW", "M3", 2012).addPrice(35000).build(),
                new Car.Builder("BMW", "X5", 2011).addPrice(31000).build(),
                new Car.Builder("BMW", "X5", 2008).addPrice(28000).build(),
                new Car.Builder("BMW", "M3", 2013).addPrice(37000).build(),
                new Car.Builder("AUDI", "TT", 2008).addPrice(15000).build(),
                new Car.Builder("AUDI", "A3", 2005).addPrice(8000).build(),
                new Car.Builder("AUDI", "A3", 2007).addPrice(9000).build(),
                new Car.Builder("SUBARU", "IMPREZA", 2012).addPrice(15000).build(),
                new Car.Builder("SUBARU", "FORESTER", 2015).addPrice(25000).build(),
                new Car.Builder("SUBARU", "IMPREZA", 2015).addPrice(21000).build(),
        };
        System.out.println(cars.length);
        System.out.println(Arrays.toString(ArrayCar.getCarsByMark(cars, "BMW")));
        System.out.println(Arrays.toString(ArrayCar.getCarsByModelAndUsedYears(cars, "IMPREZA", 6)));
        System.out.println(Arrays.toString(ArrayCar.getCarsByYearsAndPrice(cars, 2008, 20000)));
    }
}
