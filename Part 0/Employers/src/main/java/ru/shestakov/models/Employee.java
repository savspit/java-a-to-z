package ru.shestakov.models;

public class Employee extends Stuff {

    public Employee(String firstName, String lastName, long payRate, int yearlyVacation) {
        super(firstName, lastName, payRate, yearlyVacation);
    }

    public Employee() {
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
}
