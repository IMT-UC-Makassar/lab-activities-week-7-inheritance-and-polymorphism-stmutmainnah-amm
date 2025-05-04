package oop.lab;

    public abstract class BankAccount {
        protected String accountNumber;
        protected String accountHolder;
        protected double balance;
    
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        
        }
        public abstract double calculateInterest();

        public double getBalance() {
            return balance;
        }
        public void deposit (double amount) {
            balance -= amount;
        }
    
    }

