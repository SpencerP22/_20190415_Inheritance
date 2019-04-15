package edu.missouriwestern.spalmeter.csc254.people;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private LocalDate entry;

    public Person(String firstName, String lastName, LocalDate entry) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.entry = entry;
    }
    public Person() {
        setFirstName("");
        setLastName("");
        setEntry(LocalDate.of(1900,1,1));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getEntry() {
        return entry;
    }

    public void setEntry(LocalDate entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entry=" + entry +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = this.lastName.compareToIgnoreCase(o.lastName);
        if (result == 0)
            return this.firstName.compareToIgnoreCase(o.firstName);
        return result;
    }
}
