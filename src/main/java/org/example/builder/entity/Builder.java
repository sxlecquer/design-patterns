package org.example.builder.entity;

import org.example.builder.enums.CarColor;
import org.example.builder.enums.CarType;

public interface Builder {
    Builder carType(CarType carType);

    Builder brand(String brand);

    Builder model(String model);

    Builder seats(int seats);

    Builder carColor(CarColor carColor);

    Builder fuel(double fuel);

    Builder weight(double weight);
}
