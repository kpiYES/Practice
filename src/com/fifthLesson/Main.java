package com.fifthLesson;

public class Main {
    public static void main(String[] args) {
Car[] cars = new Car[]{
                new Car.Builder("BMW","M3",2012).price(35000).build(),
        new Car.Builder("BMW","X5", 2011).price(31000).build(),
        new Car.Builder("BMW","X5",2008).price(28000).build(),
        new Car.Builder("BMW","M3", 2013).price(37000).build(),
        new Car.Builder("AUDI","TT", 2008).price(15000).build(),
        new Car.Builder("AUDI","A3",2005).price(8000).build(),
        new Car.Builder("AUDI", "A3", 2007).price(9000).build(),
        new Car.Builder("SUBARU","IMPREZA", 2012).price(15000).build(),
        new Car.Builder("SUBARU", "FORESTER", 2015).price(25000).build(),
        new Car.Builder("SUBARU","IMPREZA", 2015).price(21000).build(),
        };
        System.out.println(cars.length);
        System.out.println(ArrayCar.getCarsForMark(cars,"BMW"));
        System.out.println(ArrayCar.getCarsForModelAndUsedYears(cars,"IMPREZA",6));
        System.out.println(ArrayCar.getCarsForYearsAndPrice(cars,2008,20000));
    }

}
