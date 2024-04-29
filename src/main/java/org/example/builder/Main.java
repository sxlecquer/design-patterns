package org.example.builder;

import org.example.builder.director.Director;
import org.example.builder.entity.Car;
import org.example.builder.entity.CarManual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car.CarBuilder carBuilder = Car.builder();
        director.buildBMW(carBuilder);
        Car bmw = carBuilder.build();
        System.out.println(bmw.getBrand());

        System.out.println();

        CarManual.CarManualBuilder carManualBuilder = CarManual.builder();
        director.buildBMW(carManualBuilder);
        CarManual bmwManual = carManualBuilder.build();
        bmwManual.print();
    }
}
