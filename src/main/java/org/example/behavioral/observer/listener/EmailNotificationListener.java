package org.example.behavioral.observer.listener;

import org.example.behavioral.observer.event.EventType;

@SuppressWarnings("unused")
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType) {
        String body = switch(eventType) {
            case NEW_PRODUCT -> "We have a new product in our store! Hurry up before it's sold out ;)";
            case SALE -> "We have a big sale in our store! Looking forward to seeing you :)";
        };
        System.out.println("Email to " + email + ": " + body);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
