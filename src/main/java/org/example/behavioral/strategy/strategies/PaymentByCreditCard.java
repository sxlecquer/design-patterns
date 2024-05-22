package org.example.behavioral.strategy.strategies;

import org.example.behavioral.strategy.stuff.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {
    private final CreditCard creditCard;

    public PaymentByCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validation of the provided credit card details... Valid!");
        return true;
    }

    @Override
    public void pay(int amount) {
        creditCard.setAmount(creditCard.getAmount() - amount);
        System.out.println("Paying " + amount + "$ using credit card... Done!");
    }
}
