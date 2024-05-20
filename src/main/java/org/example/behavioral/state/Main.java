package org.example.behavioral.state;

import org.example.behavioral.state.context.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.pressPower();
        phone.pressPower();
        phone.pressHome();
        phone.pressHome();
        phone.pressHome();
        phone.pressHome();
        phone.pressPower();
    }
}
