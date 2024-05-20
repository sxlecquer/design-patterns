package org.example.behavioral.state.states;

import org.example.behavioral.state.context.Phone;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }
}
