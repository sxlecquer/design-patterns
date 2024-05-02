package org.example.creational.builder.entity;

import org.example.creational.builder.enums.CarColor;
import org.example.creational.builder.enums.CarType;

public interface Builder {
    Builder carType(CarType carType);

    Builder brand(String brand);

    Builder model(String model);

    Builder seats(int seats);

    Builder carColor(CarColor carColor);

    Builder fuel(double fuel);

    Builder weight(double weight);
}
