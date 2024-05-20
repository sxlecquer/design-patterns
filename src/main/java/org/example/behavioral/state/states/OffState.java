package org.example.behavioral.state.states;

import org.example.behavioral.state.context.Phone;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
