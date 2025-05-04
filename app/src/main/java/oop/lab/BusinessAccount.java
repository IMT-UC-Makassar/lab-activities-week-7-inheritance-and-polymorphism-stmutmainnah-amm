package oop.lab;

import oop.LoanService;

public class BusinessAccount extends BankAccount implements LoanService {
    private String loanStatus;
    private double balance;

    public BusinessAccount (String accountNumber, String accountHolder, double balance) {
        super (accountNumber, accountHolder, balance);
        this. loanStatus = " No loan";
    }
    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Loan Of $" + amount + "applied.";
    }
    @Override
    public String checkLoanStatus () {
        return loanStatus;

    }
}
