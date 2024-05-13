package org.example.behavioral.command.commands;

import org.example.behavioral.command.receiver.Curtains;

public class ToggleCurtainsCommand implements Command {
    private final Curtains curtains;
    private final boolean opened;

    // pass request details such as an object (receiver of the request) and its method arguments
    public ToggleCurtainsCommand(Curtains curtains, boolean opened) {
        this.curtains = curtains;
        this.opened = opened;
    }

    @Override
    public void execute() {
        curtains.toggleCurtains(opened);
    }
}
