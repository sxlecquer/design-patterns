package org.example.behavioral.observer.listener;

import org.example.behavioral.observer.event.EventType;

public interface EventListener {
    void update(EventType eventType);
}
