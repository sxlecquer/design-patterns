package org.example.behavioral.strategy.strategies;

public interface PaymentStrategy {
    boolean validatePaymentDetails();
    void pay(int amount);
}
