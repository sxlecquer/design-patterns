package org.example.behavioral.mediator.airplane;

import org.example.behavioral.mediator.aircontrol.AirTrafficControl;

public abstract class Airplane {
    protected final AirTrafficControl airTrafficControl;

    public Airplane(AirTrafficControl airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
    }

    public abstract void takeOff();
    public abstract void land();
    public abstract void notifyOtherAirplanes(String message);
}
