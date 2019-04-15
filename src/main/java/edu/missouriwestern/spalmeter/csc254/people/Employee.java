package edu.missouriwestern.spalmeter.csc254.people;

import java.time.LocalDate;

public class Employee extends Person{
    private double payRate;
    public Employee (String firstName, String lastName, LocalDate entry, double payRate) {
        super(firstName,lastName,entry);
        setPayRate(payRate);

    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getPayRate() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", payRate=" + payRate;
    }
}
