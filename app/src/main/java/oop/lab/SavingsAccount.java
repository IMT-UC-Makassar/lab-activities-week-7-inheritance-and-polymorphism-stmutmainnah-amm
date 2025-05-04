package oop.lab;

import oop.OnlineService;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public double calculateInterest() {
        return balance * 0.03;
    }
    public void transferfunds() {
        System.out.println("Transferring funds from savings Account...");

    }

    @Override
    public void payBills(double amount) {
        System.out.println("payling bills off amount: " + amount + "from savings Account...");
    }
   
}
