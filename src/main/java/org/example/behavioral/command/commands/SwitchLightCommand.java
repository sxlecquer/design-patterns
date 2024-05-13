package org.example.behavioral.command.commands;

import org.example.behavioral.command.receiver.Light;

public class SwitchLightCommand implements Command {
    private final Light light;

    // pass request details such as an object (receiver of the request)
    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
