package org.example.behavioral.strategy.strategies;

@SuppressWarnings("all")
public class PaymentByPayPal implements PaymentStrategy {
    private final String email;
    private final String password;

    public PaymentByPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validation of the provided PayPal account details... Valid!");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + "$ using PayPal... Done!");
    }
}
