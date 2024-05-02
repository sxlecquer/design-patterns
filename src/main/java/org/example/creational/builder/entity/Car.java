package org.example.creational.builder.entity;

import org.example.creational.builder.enums.CarColor;
import org.example.creational.builder.enums.CarType;

public class Car {
    private final CarType carType;
    private final String brand;
    private final String model;
    private final int seats;
    private final CarColor carColor;
    private final double fuel;
    private final double weight;

    private Car(CarType carType, String brand, String model, int seats, CarColor carColor, double fuel, double weight) {
        this.carType = carType;
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.carColor = carColor;
        this.fuel = fuel;
        this.weight = weight;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public double getFuel() {
        return fuel;
    }

    public double getWeight() {
        return weight;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder implements Builder {
        private CarType carType;
        private String brand;
        private String model;
        private int seats;
        private CarColor carColor;
        private double fuel;
        private double weight;

        public Builder carType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder carColor(CarColor carColor) {
            this.carColor = carColor;
            return this;
        }

        public Builder fuel(double fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Car build() {
            return new Car(carType, brand, model, seats, carColor, fuel, weight);
        }
    }
}
