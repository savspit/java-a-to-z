package ru.shestakov.models;

public abstract class Storage {

    public String name;
    public Food storage[];

    public void addFood(Food food) {
        for (int x = 0; x < this.storage.length; x++) {
            if(storage[x] != null) {
                storage[x] = food;
                break;
            }
        }
    }

    public abstract int getTemperature();

}
