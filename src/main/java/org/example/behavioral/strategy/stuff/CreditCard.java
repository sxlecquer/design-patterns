package org.example.behavioral.strategy.stuff;

@SuppressWarnings("all")
public class CreditCard {
    private int amount;
    private final String number;
    private final String date;
    private final String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.amount = 400;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
