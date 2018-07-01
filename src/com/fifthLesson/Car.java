package com.fifthLesson;

public class Car {

    private Long id;
    private String mark;
    private String model;
    private Integer year;
    private String color;
    private Integer price;
    private String regNumber;

    private Car(Builder builder) {
        id = builder.id;
        mark = builder.mark;
        model = builder.model;
        year = builder.year;
        color = builder.color;
        price = builder.price;
        regNumber = builder.regNumber;
    }

    public Long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public static class Builder {

        private static Long countId = 0L;
        private Long id;
        private String mark;
        private String model;
        private Integer year;
        private Integer price;
        private String color;
        private String regNumber;

        public Builder(String mark, String model, Integer year) {
            this.id = ++countId;
            this.mark = mark;
            this.model = model;
            this.year = year;
            this.price = 0;
            this.color = "undefined";
            this.regNumber = "undefined";
        }

        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder regNumber(String regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
