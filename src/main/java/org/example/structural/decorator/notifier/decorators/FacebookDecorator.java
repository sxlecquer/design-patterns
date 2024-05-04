package org.example.structural.decorator.notifier.decorators;

import org.example.structural.decorator.notifier.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String facebook = userRepository.getFacebookByUsername(getUsername());
        System.out.println("The message '" + message + "' was sent to " + facebook + " on Facebook!");
    }
}
