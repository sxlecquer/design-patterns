package org.example.builder;

import org.example.builder.director.Director;
import org.example.builder.entity.Car;
import org.example.builder.entity.CarManual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car.CarBuilder bmwBuilder = Car.builder();
        director.buildBMW(bmwBuilder);
        Car bmw = bmwBuilder.build();
        System.out.println(bmw.getBrand());

        System.out.println();

        CarManual.CarManualBuilder bmwManualBuilder = CarManual.builder();
        director.buildBMW(bmwManualBuilder);
        CarManual bmwManual = bmwManualBuilder.build();
        bmwManual.print();

        System.out.println("\n");

        Car.CarBuilder bugattiBuilder = Car.builder();
        director.buildBugatti(bugattiBuilder);
        Car bugatti = bugattiBuilder.build();
        System.out.println(bugatti.getBrand());

        System.out.println();

        CarManual.CarManualBuilder bugattiManualBuilder = CarManual.builder();
        director.buildBugatti(bugattiManualBuilder);
        CarManual bugattiManual = bugattiManualBuilder.build();
        bugattiManual.print();

        System.out.println("\n");

        Car.CarBuilder toyotaBuilder = Car.builder();
        director.buildToyota(toyotaBuilder);
        Car toyota = toyotaBuilder.build();
        System.out.println(toyota.getBrand());

        System.out.println();

        CarManual.CarManualBuilder toyotaManualBuilder = CarManual.builder();
        director.buildToyota(toyotaManualBuilder);
        CarManual toyotaManual = toyotaManualBuilder.build();
        toyotaManual.print();
    }
}
