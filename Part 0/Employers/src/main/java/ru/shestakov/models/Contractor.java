package ru.shestakov.models;

public class Contractor extends Stuff {

    public Contractor(String firstName, String lastName, long payRate, String agencyName) {
        super(firstName, lastName, payRate, agencyName);
    }

    public Contractor() {
        super();
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
