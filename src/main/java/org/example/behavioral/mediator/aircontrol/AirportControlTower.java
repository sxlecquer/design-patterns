package org.example.behavioral.mediator.aircontrol;

import org.example.behavioral.mediator.airplane.Airplane;

// concrete mediator class
public class AirportControlTower implements AirTrafficControl {
    @Override
    public void requestTakeOff(Airplane airplane) {
        airplane.notifyOtherAirplanes("Taking off...");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyOtherAirplanes("Landing...");
    }
}
