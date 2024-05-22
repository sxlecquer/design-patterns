package org.example.behavioral.strategy;

import org.example.behavioral.strategy.service.OrderService;
import org.example.behavioral.strategy.strategies.PaymentByCreditCard;
import org.example.behavioral.strategy.strategies.PaymentByPayPal;
import org.example.behavioral.strategy.strategies.PaymentStrategy;
import org.example.behavioral.strategy.stuff.CreditCard;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new PaymentByCreditCard(new CreditCard("1234 5678 9012 3456", "05/22/2024", "999"));
        OrderService orderService = new OrderService(paymentStrategy);
        orderService.setCost(30);
        orderService.setIncludeDelivery(false);
        orderService.processOrder();

        System.out.println();

        paymentStrategy = new PaymentByPayPal("bringarado@yahoo.com", "CuteKitten648");
        orderService.setPaymentStrategy(paymentStrategy);
        orderService.setCost(111);
        orderService.setIncludeDelivery(true);
        orderService.processOrder();
    }
}
