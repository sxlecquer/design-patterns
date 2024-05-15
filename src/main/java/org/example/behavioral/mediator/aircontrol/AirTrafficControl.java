package org.example.behavioral.mediator.aircontrol;

import org.example.behavioral.mediator.airplane.Airplane;

// mediator interface
public interface AirTrafficControl {
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
