package edu.missouriwestern.spalmeter.csc254.people;

import java.time.LocalDate;

public class Customer extends Person{
    private double currentBalance;
    public Customer (String firstName, String lastName, double currentBalance) {
        super(firstName,lastName, LocalDate.now());
        setCurrentBalance(currentBalance);
    }
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    public double getCurrentBalance() { return currentBalance;}

    @Override
    public String toString() {
        String result = super.toString() + " Current Balance: " + currentBalance;
        return result;
    }

    @Override
    public String getContact() {
        return null;
    }
}
