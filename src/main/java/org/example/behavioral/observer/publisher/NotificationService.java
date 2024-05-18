package org.example.behavioral.observer.publisher;

import org.example.behavioral.observer.event.EventType;
import org.example.behavioral.observer.listener.EventListener;

import java.util.*;

public class NotificationService {
    private final Map<EventType, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(EventType.values())
                .forEach(eventType -> customers.put(eventType, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, EventListener eventListener) {
        customers.get(eventType).add(eventListener);
    }

    public void unsubscribe(EventType eventType, EventListener eventListener) {
        customers.get(eventType).remove(eventListener);
    }

    public void notify(EventType eventType) {
        customers.get(eventType)
                .forEach(customer -> customer.update(eventType));
    }
}
