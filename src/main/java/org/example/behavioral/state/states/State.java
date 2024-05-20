package org.example.behavioral.state.states;

import org.example.behavioral.state.context.Phone;

public abstract class State {
    protected Phone phone;

    protected State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onPower();

    public abstract String onHome();
}
