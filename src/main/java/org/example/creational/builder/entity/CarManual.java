package org.example.creational.builder.entity;

import org.example.creational.builder.enums.CarColor;
import org.example.creational.builder.enums.CarType;

public class CarManual {
    private final CarType carType;
    private final String brand;
    private final String model;
    private final int seats;
    private final CarColor carColor;
    private final double fuel;
    private final double weight;

    private CarManual(CarType carType, String brand, String model, int seats, CarColor carColor, double fuel, double weight) {
        this.carType = carType;
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.carColor = carColor;
        this.fuel = fuel;
        this.weight = weight;
    }

    public void print() {
        System.out.println("Car type: " + carType);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of seats: " + seats);
        System.out.println("Car color: " + carColor);
        System.out.println("Fuel: " + fuel + "l");
        System.out.println("Weight: " + weight + "tn");
    }

    public static CarManualBuilder builder() {
        return new CarManualBuilder();
    }

    public static class CarManualBuilder implements Builder {
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

        public CarManual build() {
            return new CarManual(carType, brand, model, seats, carColor, fuel, weight);
        }
    }
}
