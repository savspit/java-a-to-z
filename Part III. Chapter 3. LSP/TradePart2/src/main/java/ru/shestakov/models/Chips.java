package ru.shestakov.models;

public class Chips extends Food {

    public boolean canReproduct;

    public Chips(String name, long expaireDate) {
        super(name, expaireDate);
    }

    public boolean canReproduct() {
        return this.canReproduct;
    }

}
