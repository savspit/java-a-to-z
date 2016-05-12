package ru.shestakov.models;

public class WarehouseForReproduct extends Storage {

    public FoodForReproduct[] storage = new FoodForReproduct[100];
    int temperature = 0;

    @Override
    public boolean appropriate(FoodForReproduct food) {
        return food.getCanReproduct() && this.temperature < 0;
    }
}
