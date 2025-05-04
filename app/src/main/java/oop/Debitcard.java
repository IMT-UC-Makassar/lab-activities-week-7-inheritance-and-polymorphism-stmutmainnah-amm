package oop;
public class Debitcard extends Card {
    public Debitcard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    @Override
    public double getInterestRate() {
        return 0.0;
    }
}
