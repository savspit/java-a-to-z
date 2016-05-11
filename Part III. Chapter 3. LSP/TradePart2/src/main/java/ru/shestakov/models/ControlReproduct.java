package ru.shestakov.models;

public class ControlReproduct {

    public boolean canReproduct(AppleForReproduct appleForReproduct) {
        return appleForReproduct.getCanReproduct();
    }

    public boolean canReproduct(Apple apple) {
        return false;
    }

    public boolean canReproduct(Food food) {
        return false;
    }

}
