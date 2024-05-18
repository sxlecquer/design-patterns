package org.example.behavioral.observer.listener;

import org.example.behavioral.observer.event.EventType;

@SuppressWarnings("unused")
public class MobileAppNotificationListener implements EventListener {
    private String username;

    public MobileAppNotificationListener(String username) {
        this.username = username;
    }

    @Override
    public void update(EventType eventType) {
        String body = switch(eventType) {
            case NEW_PRODUCT -> "We have a new product in our store! Hurry up before it's sold out ;)";
            case SALE -> "We have a big sale in our store! Looking forward to seeing you :)";
        };
        System.out.println("Push notification to " + username + ": " + body);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
