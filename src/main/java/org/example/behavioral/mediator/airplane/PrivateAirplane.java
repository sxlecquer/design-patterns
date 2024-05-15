package org.example.behavioral.mediator.airplane;

import org.example.behavioral.mediator.aircontrol.AirTrafficControl;

public class PrivateAirplane extends Airplane {
    public PrivateAirplane(AirTrafficControl airTrafficControl) {
        super(airTrafficControl);
    }

    @Override
    public void takeOff() {
        System.out.println("The private plane is ready for takeoff!");
        airTrafficControl.requestTakeOff(this);
    }

    @Override
    public void land() {
        System.out.println("The private plane is ready for landing!");
        airTrafficControl.requestLanding(this);
    }

    @Override
    public void notifyOtherAirplanes(String message) {
        System.out.println("Private airplane: " + message);
    }
}
