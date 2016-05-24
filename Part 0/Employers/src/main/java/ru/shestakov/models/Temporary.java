package ru.shestakov.models;

public class Temporary extends Stuff {

    public Temporary(String firstName, String lastName, long payRate, String agencyName) {
        super(firstName, lastName, payRate, agencyName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
        this.agencyName = agencyName;
    }

    @Override
    public String get_name() {
        return super.get_name();
    }

    @Override
    public long get_pay_rate() {
        return super.get_pay_rate();
    }

    @Override
    public int get_yearly_vacation() {
        return super.get_yearly_vacation();
    }

    @Override
    public String get_agency() {
        return super.get_agency();
    }
}
