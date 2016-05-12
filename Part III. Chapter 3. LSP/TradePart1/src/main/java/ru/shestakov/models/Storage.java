package ru.shestakov.models;

public abstract class Storage {

    public String name;
    public Food storage[];

    public void addFood(Food food) { }

    public boolean appropriate(Food food) { return false; }
}
