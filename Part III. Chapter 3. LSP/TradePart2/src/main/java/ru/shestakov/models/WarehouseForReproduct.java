package ru.shestakov.models;

public class WarehouseForReproduct extends Storage {

    int temperature = 0;

    @Override
    public boolean appropriate(FoodForReproduct food) {
        return food.getCanReproduct() && this.temperature < 0;
    }
}
