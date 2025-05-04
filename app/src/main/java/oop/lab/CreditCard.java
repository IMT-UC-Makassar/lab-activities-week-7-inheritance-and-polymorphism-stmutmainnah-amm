package oop.lab;

import oop.Card;

public class CreditCard extends Card  {
    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    @Override
    public double getInterestRate() {
        return 0.10;
    }
}