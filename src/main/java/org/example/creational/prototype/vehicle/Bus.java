package org.example.creational.prototype.vehicle;

import org.example.creational.prototype.component.Color;
import org.example.creational.prototype.component.GPSNavigator;
import org.example.creational.prototype.stuff.Prototype;

import java.util.Objects;

public class Bus extends Vehicle {
    private final int seats;

    public Bus(String brand, Color color, GPSNavigator gpsNavigator, int seats) {
        super(brand, color, gpsNavigator);
        this.seats = seats;
    }

    public Bus(Bus bus) {
        super(bus);
        this.seats = bus.seats;
    }

    @Override
    public Prototype clone() {
        return new Bus(this);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Bus that) || !super.equals(o)) return false;
        return seats == that.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }
}
