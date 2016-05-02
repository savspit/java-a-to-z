package ru.shestakov.models;

public abstract class Figure {

    public String name;
    public Cell cell;
    public Colour colour;


    public Figure(String name, Cell cell, Colour colour) {
        this.name = name;
        this.cell = cell;
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public Cell getCell() {
        return this.cell;
    }

    public void setCell(Cell cell) {

    }

    public void go(Cell cell) {

    }

}
