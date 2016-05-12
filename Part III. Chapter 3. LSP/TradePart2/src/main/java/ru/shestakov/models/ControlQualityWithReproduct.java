package ru.shestakov.models;

public class ControlQualityWithReproduct {

    public Storage[] storages = new Storage[20];

    public void add(FoodForReproduct food) {

        for(int x=0; x< storages.length; x++) {
            if(storages[x].appropriate(food)) {
                storages[x].addFood(food);
                break;
            }
        }

    }

}
