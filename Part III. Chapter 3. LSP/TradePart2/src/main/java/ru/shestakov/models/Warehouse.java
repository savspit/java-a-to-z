package ru.shestakov.models;

public class Warehouse extends Storage {

    public Food[] storage = new Food[100];

    @Override
    public boolean appropriate(Food food) {
        return food.getExpaireTimeInPercents() < 25;
    }
}
