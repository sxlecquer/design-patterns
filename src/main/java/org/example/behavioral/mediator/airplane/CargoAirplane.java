package org.example.behavioral.mediator.airplane;

import org.example.behavioral.mediator.aircontrol.AirTrafficControl;

public class CargoAirplane extends Airplane {
    public CargoAirplane(AirTrafficControl airTrafficControl) {
        super(airTrafficControl);
    }

    @Override
    public void takeOff() {
        System.out.println("The cargo plane is loaded and ready for takeoff!");
        airTrafficControl.requestTakeOff(this);
    }

    @Override
    public void land() {
        System.out.println("The cargo plane is ready for landing!");
        airTrafficControl.requestLanding(this);
        System.out.println("The cargo plane can be unloaded!");
    }

    @Override
    public void notifyOtherAirplanes(String message) {
        System.out.println("Cargo airplane: " + message);
    }
}
