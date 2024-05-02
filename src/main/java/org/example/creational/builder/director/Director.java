package org.example.creational.builder.director;

import org.example.creational.builder.entity.Builder;
import org.example.creational.builder.enums.CarColor;
import org.example.creational.builder.enums.CarType;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.carType(CarType.CABRIOLET)
                .brand("Bugatti")
                .model("Veyron")
                .seats(2)
                .carColor(CarColor.BLACK)
                .fuel(32.5)
                .weight(1.3);
    }

    public void buildBMW(Builder builder) {
        builder.carType(CarType.COUPE)
                .brand("BMW")
                .model("M8 F92")
                .seats(2)
                .carColor(CarColor.BLUE)
                .fuel(55.3)
                .weight(1.9);
    }

    public void buildToyota(Builder builder) {
        builder.carType(CarType.SEDAN)
                .brand("Toyota")
                .model("Matrix")
                .seats(4)
                .carColor(CarColor.WHITE)
                .weight(2.3)
                .fuel(45.0);
    }
}
