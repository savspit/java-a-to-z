package ru.shestakov.start;

import ru.shestakov.models.*;

public class TradeWithReproduct extends Trade {

    public TrashForReproduct[] trashesForReproduct = new TrashForReproduct[10];
    public TrashForReproductWithLowTemperature[] trashesForReproductWithLowTemperature = new TrashForReproductWithLowTemperature[10];

    public TrashForReproduct[] getTrashesForReproduct() {
        return trashesForReproduct;
    }

    public TrashForReproductWithLowTemperature[] getTrashesForReproductWithLowTemperature() {
        return trashesForReproductWithLowTemperature;
    }


}
