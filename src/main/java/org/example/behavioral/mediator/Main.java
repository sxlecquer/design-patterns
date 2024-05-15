package org.example.behavioral.mediator;

import org.example.behavioral.mediator.aircontrol.AirTrafficControl;
import org.example.behavioral.mediator.aircontrol.AirportControlTower;
import org.example.behavioral.mediator.airplane.CargoAirplane;
import org.example.behavioral.mediator.airplane.PrivateAirplane;

public class Main {
    public static void main(String[] args) {
        AirTrafficControl controlTower = new AirportControlTower();
        PrivateAirplane privateAirplane = new PrivateAirplane(controlTower);
        CargoAirplane cargoAirplane = new CargoAirplane(controlTower);

        privateAirplane.takeOff();
        System.out.println();
        cargoAirplane.takeOff();

        System.out.println();

        cargoAirplane.land();
        System.out.println();
        privateAirplane.land();
    }
}
