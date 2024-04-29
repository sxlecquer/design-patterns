package org.example.builder.director;

import org.example.builder.entity.Builder;
import org.example.builder.enums.CarColor;
import org.example.builder.enums.CarType;

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
        builder.carType(CarType.COUPE)
                .brand("Toyota")
                .model("Matrix")
                .seats(4)
                .carColor(CarColor.WHITE)
                .fuel(45.0)
                .weight(2.3);
    }
}
