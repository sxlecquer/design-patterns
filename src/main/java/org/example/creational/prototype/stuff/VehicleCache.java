package org.example.creational.prototype.stuff;

import org.example.creational.prototype.vehicle.Bus;
import org.example.creational.prototype.component.Color;
import org.example.creational.prototype.component.GPSNavigator;
import org.example.creational.prototype.vehicle.Car;
import org.example.creational.prototype.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

// prototype registry (or factory)
public class VehicleCache {
    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car bmw = new Car("BMW", Color.BLUE,
                new GPSNavigator("Carrot Street, California, USA"), 340);
        Bus mercedes = new Bus("Mercedes", Color.YELLOW,
                new GPSNavigator("Fine Street, Canberra, Australia"), 34);

        cache.put("BMW", bmw);
        cache.put("Mercedes", mercedes);
    }

    public void put(String key, Vehicle vehicle) {
        cache.put(key, vehicle);
    }

    public Vehicle get(String key) {
        return (Vehicle) cache.get(key).clone();
    }
}
