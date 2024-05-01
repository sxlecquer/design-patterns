package org.example.prototype;

import org.example.prototype.component.Color;
import org.example.prototype.component.GPSNavigator;
import org.example.prototype.stuff.VehicleCache;
import org.example.prototype.vehicle.Car;
import org.example.prototype.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleCache vehicleCache = new VehicleCache();
        Car porsche = new Car("Porsche", Color.GRAY,
                new GPSNavigator("Glacier Street, Brussels, Belgium"), 331);
        vehicleCache.put("Porsche", porsche);

        Vehicle vehicle1 = vehicleCache.get("BMW");
        Vehicle vehicle2 = vehicleCache.get("Porsche");
        Vehicle vehicle3 = vehicleCache.get("Mercedes");
        Vehicle vehicle4 = vehicleCache.get("Mercedes");

        if(vehicle1 != vehicle2 && !vehicle1.equals(vehicle2)) {
            System.out.println("BMW and Porsche are two different objects");
        } else {
            System.out.println("BMW and Porsche are the same");
        }

        if(vehicle3 != vehicle4) {
            System.out.println("Mercedes buses are two different objects");
            if(vehicle3.equals(vehicle4)) {
                System.out.println("But they are identical");
            } else {
                System.out.println("And they are not identical");
            }
        } else {
            System.out.println("Mercedes buses are the same");
        }
    }
}
