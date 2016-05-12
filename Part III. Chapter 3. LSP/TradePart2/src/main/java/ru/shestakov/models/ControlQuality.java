package ru.shestakov.models;

import ru.shestakov.start.Trade;

public class ControlQuality {

    public Storage[] storages = new Storage[20];

    public void add(Food food) {

        for(int x=0; x< storages.length; x++) {
            if(storages[x].appropriate(food)) {
                storages[x].addFood(food);
                break;
            }
        }

    }

}
