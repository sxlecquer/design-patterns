package org.example.behavioral.command.room;

import org.example.behavioral.command.commands.Command;

import java.util.Arrays;
import java.util.List;

// invoker (sender) class
public abstract class Room {
    private List<Command> commands;

    public void setCommands(Command... commands) {
        this.commands = Arrays.asList(commands);
    }

    public void executeCommands() {
        if(commands == null || commands.isEmpty())
            throw new IllegalStateException("No commands available to execute.");
        commands.forEach(Command::execute);
    }
}
