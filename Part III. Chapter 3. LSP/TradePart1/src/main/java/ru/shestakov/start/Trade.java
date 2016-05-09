package ru.shestakov.start;

import ru.shestakov.models.Shop;
import ru.shestakov.models.Trash;
import ru.shestakov.models.Warehouse;

public class Trade {

    public Warehouse[] warehouses = new Warehouse[10];
    public Shop[] shops = new Shop[10];
    public Trash[] trashes = new Trash[10];

    public Warehouse[] getWarehouses() {
        return warehouses;
    }

    public Shop[] getShops() {
        return shops;
    }

    public Trash[] getTrashes() {
        return trashes;
    }


}
