package ru.shestakov.models;

public abstract class Storage {

    public void addFood(Food food) { }

    public boolean appropriate(Food food) { return false; }

    public boolean appropriate(FoodForReproduct food) { return false; }
}
