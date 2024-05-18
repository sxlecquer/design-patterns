package org.example.behavioral.observer.store;

import org.example.behavioral.observer.event.EventType;
import org.example.behavioral.observer.publisher.NotificationService;

public class Store {
    private final NotificationService notificationService = new NotificationService();

    public void announceNewProduct() {
        notificationService.notify(EventType.NEW_PRODUCT);
    }

    public void announceSale() {
        notificationService.notify(EventType.SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    // other logic here...
}
