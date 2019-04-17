package edu.missouriwestern.spalmeter.csc254.people;

import java.time.LocalDate;

public class Employee extends Person implements Supervised{
    private double payRate;
    private String phone = null;

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
    public void setPhone(String phone) { this.phone = phone;}

    @Override
    public String toString() {
        String result = super.toString() + ", payRate=" + payRate;
        if(result != null)
            result += ", phone: " + phone;
        return result;
    }
    public String getContact(){
        return phone;
    }

    @Override
    public Person getSupervisor() {
        return new Employee("The", "Boss", LocalDate.of(1970,1,1), 0.0);
    }
}
