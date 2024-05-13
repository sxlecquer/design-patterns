package org.example.behavioral.command;

import org.example.behavioral.command.commands.SwitchLightCommand;
import org.example.behavioral.command.commands.ToggleCurtainsCommand;
import org.example.behavioral.command.receiver.Curtains;
import org.example.behavioral.command.receiver.Light;
import org.example.behavioral.command.room.Bathroom;
import org.example.behavioral.command.room.Kitchen;
import org.example.behavioral.command.room.LivingRoom;
import org.example.behavioral.command.room.Room;

public class Main {
    public static void main(String[] args) {
        Room bathroom = new Bathroom();
        bathroom.setCommands(new SwitchLightCommand(new Light()));
        bathroom.executeCommands();
        bathroom.executeCommands();

        System.out.println();

        Room kitchen = new Kitchen();
        kitchen.setCommands(new ToggleCurtainsCommand(new Curtains(), true));
        kitchen.executeCommands();

        System.out.println();

        Room livingRoom = new LivingRoom();
        livingRoom.setCommands(new SwitchLightCommand(new Light()),
                new ToggleCurtainsCommand(new Curtains(), false));
        livingRoom.executeCommands();
    }
}
