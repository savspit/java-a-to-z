package ru.shestakov.models;

import ru.shestakov.start.Trade;

public class ControlQuality {

    public int execute(Trade trade, Food food) {

        long expaireDate = food.getExpaireDate();
        long createDate = food.getCreateDate();
        long currentDate = System.nanoTime();

        long expaireTime = expaireDate - createDate;
        long expaireTimeGone = currentDate - createDate;

        int expaireTimeInPercents = (int) (long) (100 * expaireTimeGone / expaireTime);

        if(expaireTimeInPercents < 25) {
            Warehouse[] warehouses = trade.getWarehouses();
            for(int x=0; x < warehouses.length; x++) {
                warehouses[x].addFood(food);
            }
        } else if(expaireTimeInPercents >= 25 && expaireTimeInPercents <= 75) {
            Shop[] shops = trade.getShops();
            for(int x=0; x < shops.length; x++) {
                shops[x].addFood(food);
            }
        } else if (expaireTimeInPercents > 75 && expaireTimeInPercents < 100) {
            Shop[] shops = trade.getShops();
            for(int x=0; x < shops.length; x++) {
                food.setDiscount(20);
                shops[x].addFood(food);
            }
        } else {
            Trash[] trashes = trade.getTrashes();
            for(int x=0; x < trashes.length; x++) {
                trashes[x].addFood(food);
            }
        }

        return -1;
    }

}
