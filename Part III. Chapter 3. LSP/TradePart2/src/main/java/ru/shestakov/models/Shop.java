package ru.shestakov.models;

public class Shop extends Storage {

    public int temperature;

    public Food[] storage = new Food[100];

    public int getTemperature() {
        return this.temperature;
    }

}
