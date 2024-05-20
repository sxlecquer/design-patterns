package org.example.behavioral.state.states;

import org.example.behavioral.state.context.Phone;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

    @Override
    public String onHome() {
        return phone.home();
    }
}
