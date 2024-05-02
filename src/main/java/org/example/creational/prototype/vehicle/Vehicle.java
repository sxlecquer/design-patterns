package org.example.creational.prototype.vehicle;

import org.example.creational.prototype.component.Color;
import org.example.creational.prototype.component.GPSNavigator;
import org.example.creational.prototype.stuff.Prototype;

import java.util.Objects;

public abstract class Vehicle implements Prototype {
    private final String brand;
    private final Color color;
    private final GPSNavigator gpsNavigator;

    public Vehicle(String brand, Color color, GPSNavigator gpsNavigator) {
        this.brand = brand;
        this.color = color;
        this.gpsNavigator = gpsNavigator;
    }

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.color = vehicle.color;
        this.gpsNavigator = (GPSNavigator) vehicle.gpsNavigator.clone();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Vehicle that)) return false;
        return Objects.equals(brand, that.brand) && color == that.color && Objects.equals(gpsNavigator, that.gpsNavigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, gpsNavigator);
    }

    @Override
    public abstract Prototype clone();
}
