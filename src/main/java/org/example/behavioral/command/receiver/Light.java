package org.example.behavioral.command.receiver;

// receiver class
public class Light {
    private boolean switchedOn;

    public void switchLight() {
        switchedOn = !switchedOn;
        System.out.println("The light switched " + (switchedOn ? "on!" : "off!"));
    }
}
