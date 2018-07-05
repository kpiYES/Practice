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

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
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
                '}' + '\n';
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

        public Builder addMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder addModel(String model) {
            this.model = model;
            return this;
        }

        public Builder addYear(Integer year) {
            this.year = year;
            return this;
        }

        public Builder addPrice(Integer price) {
            this.price = price;
            return this;
        }

        public Builder addColor(String color) {
            this.color = color;
            return this;
        }

        public Builder addRegNumber(String regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
