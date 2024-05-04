package org.example.structural.decorator;

import org.example.structural.decorator.notifier.INotifier;
import org.example.structural.decorator.notifier.Notifier;
import org.example.structural.decorator.notifier.decorators.FacebookDecorator;
import org.example.structural.decorator.notifier.decorators.WhatsAppDecorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(new WhatsAppDecorator(new Notifier("sxlecquer")));
        notifier.send("Life is either a daring adventure or nothing");
    }
}
