package org.example.behavioral.command.receiver;

// receiver class
public class Curtains {
    public void toggleCurtains(boolean opened) {
        System.out.println("The curtains are " + (opened ? "opened!" : "closed!"));
    }
}
