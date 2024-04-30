package org.example.prototype.vehicle;

import org.example.prototype.component.Color;
import org.example.prototype.component.GPSNavigator;
import org.example.prototype.stuff.Prototype;

import java.util.Objects;

public class Car extends Vehicle {
    private final int maxSpeed;

    public Car(String brand, Color color, GPSNavigator gpsNavigator, int maxSpeed) {
        super(brand, color, gpsNavigator);
        this.maxSpeed = maxSpeed;
    }

    public Car(Car car) {
        super(car);
        this.maxSpeed = car.maxSpeed;
    }

    @Override
    public Prototype clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Car that) || !super.equals(o)) return false;
        return maxSpeed == that.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }
}
