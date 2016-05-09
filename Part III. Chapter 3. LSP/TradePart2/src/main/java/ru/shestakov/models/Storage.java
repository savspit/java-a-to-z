package ru.shestakov.models;

public abstract class Storage {

    public String name;
    public Food storage[];
    public int temperature;

    public int getTemperature() {
        return this.temperature;
    }

    public void addFood(Food food) {
        for (int x = 0; x < this.storage.length; x++) {
            if(storage[x] != null) {
                storage[x] = food;
                break;
            }
        }
    }
}
