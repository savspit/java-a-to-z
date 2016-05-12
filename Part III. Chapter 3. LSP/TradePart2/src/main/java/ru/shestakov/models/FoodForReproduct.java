package ru.shestakov.models;

public class FoodForReproduct extends Food{

    public boolean canReproduct;

    public FoodForReproduct(String name, long expaireDate) {
        super(name, expaireDate);
    }

    public boolean getCanReproduct() {
        return this.canReproduct;
    }
}
