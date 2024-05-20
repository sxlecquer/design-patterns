package org.example.behavioral.state.context;

import org.example.behavioral.state.states.OffState;
import org.example.behavioral.state.states.State;

// context class (original object)
public class Phone {
    private State state;

    // initial state - phone is turned off
    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPower() {
        System.out.println(state.onPower());
    }

    public void pressHome() {
        System.out.println(state.onHome());
    }

    public String lock() {
        return "Lock the phone and turn off the screen";
    }

    public String turnOn() {
        return "Turn on the screen, device is still locked";
    }

    public String unlock() {
        return "Unlock the phone to home screen";
    }

    public String home() {
        return "Go to home screen";
    }
}
