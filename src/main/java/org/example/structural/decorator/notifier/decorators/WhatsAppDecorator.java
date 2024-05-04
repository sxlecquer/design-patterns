package org.example.structural.decorator.notifier.decorators;

import org.example.structural.decorator.notifier.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phone = userRepository.getPhoneNumberByUsername(getUsername());
        System.out.println("The message '" + message + "' was sent to " + phone + " on WhatsApp!");
    }
}
