package ru.shestakov.models;

public class Apple extends Food {

    public boolean canReproduct;

    public Apple(String name, long expaireDate) {
        super(name, expaireDate);
    }

    public boolean canReproduct() {
        return this.canReproduct;
    }
}
