package ru.shestakov.models;

public class Shop extends Storage {

    public Food[] storage = new Food[100];

    @Override
    public boolean appropriate(Food food) {

        int expaireTimeInPercents = food.getExpaireTimeInPercents();

        if (expaireTimeInPercents >= 25 && expaireTimeInPercents <= 75) {
            return true;
        } else if (expaireTimeInPercents > 75){
            food.setDiscount(20);
            return true;
        } else {
            return false;
        }
    }
}