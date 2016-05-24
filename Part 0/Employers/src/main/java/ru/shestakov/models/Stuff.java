package ru.shestakov.models;

public abstract class Stuff {

    String firstName;
    String lastName;
    long payRate;
    int yearlyVacation;
    String agencyName;

    public Stuff(String firstName, String lastName, long payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
    }

    public Stuff(String firstName, String lastName, long payRate, int yearlyVacation) {
        this(firstName, lastName, payRate);
        this.yearlyVacation = yearlyVacation;
    }

    public Stuff(String firstName, String lastName, long payRate, String agencyName) {
        this(firstName, lastName, payRate);
        this.agencyName = agencyName;
    }

    public String get_name() {
        return this.lastName + ", " + this.firstName;
    }

    public long get_pay_rate() {
        return this.payRate;
    }

    public int get_yearly_vacation() {
        return this.yearlyVacation;
    }

    public String get_agency() {
        return this.agencyName;
    }

}
