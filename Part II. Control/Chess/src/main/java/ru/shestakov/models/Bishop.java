package ru.shestakov.models;

// слон
public class Bishop extends Figure {

    public Bishop (String name, Cell cell, Colour colour) {

        super(name, cell, colour);

    }

    public Cell getCell() {
        return this.cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

}
