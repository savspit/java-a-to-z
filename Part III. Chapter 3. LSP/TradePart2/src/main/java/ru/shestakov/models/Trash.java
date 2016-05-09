package ru.shestakov.models;

public class Trash extends Storage {

    public int temperature;

    public Food[] storage = new Food[100];

    public int getTemperature() {
        return this.temperature;
    }

}
