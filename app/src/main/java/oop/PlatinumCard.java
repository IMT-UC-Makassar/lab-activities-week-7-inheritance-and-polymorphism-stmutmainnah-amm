package oop;

import oop.lab.CreditCard;

public class PlatinumCard extends CreditCard {
    public PlatinumCard(String cardNumber, String cardHolder) {
        super (cardNumber, cardHolder);
    }
    @Override
    public double getInterestRate() {
        return 0.05;

    }
}
