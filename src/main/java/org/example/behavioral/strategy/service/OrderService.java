package org.example.behavioral.strategy.service;

import org.example.behavioral.strategy.strategies.PaymentStrategy;

public class OrderService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy paymentStrategy;

    public OrderService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if(paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(getTotalCost());
        }
    }

    private int getTotalCost() {
        return includeDelivery ? cost + 10 : cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
