package org.example.behavioral.observer;

import org.example.behavioral.observer.event.EventType;
import org.example.behavioral.observer.listener.EmailNotificationListener;
import org.example.behavioral.observer.listener.EventListener;
import org.example.behavioral.observer.listener.MobileAppNotificationListener;
import org.example.behavioral.observer.publisher.NotificationService;
import org.example.behavioral.observer.store.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        NotificationService publisher = store.getNotificationService();

        EventListener toUnsubscribe1 = new EmailNotificationListener("groceries@mail.go");
        publisher.subscribe(EventType.NEW_PRODUCT, new EmailNotificationListener("jessie@gmail.com"));
        publisher.subscribe(EventType.SALE, new EmailNotificationListener("sheilly@yahoo.com"));
        publisher.subscribe(EventType.NEW_PRODUCT, toUnsubscribe1);
        publisher.subscribe(EventType.SALE, toUnsubscribe1);

        EventListener toUnsubscribe2 = new MobileAppNotificationListener("sunduk");
        publisher.subscribe(EventType.NEW_PRODUCT, new MobileAppNotificationListener("super_edgar"));
        publisher.subscribe(EventType.SALE, new MobileAppNotificationListener("doug123"));
        publisher.subscribe(EventType.NEW_PRODUCT, toUnsubscribe2);
        publisher.subscribe(EventType.SALE, toUnsubscribe2);

        store.announceNewProduct();
        System.out.println();
        store.announceSale();

        publisher.unsubscribe(EventType.NEW_PRODUCT, toUnsubscribe1);
        publisher.unsubscribe(EventType.SALE, toUnsubscribe2);
        System.out.println("\nAfter unsubscription:\n");

        store.announceNewProduct();
        System.out.println();
        store.announceSale();
    }
}
