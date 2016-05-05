package ru.shestakov.models;

public class Cell {

    public boolean inUse;

    public Cell() {

    }

    public Cell(boolean inUse) {
        this.inUse = inUse;
    }

    public boolean getinUse() {
        return this.inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

}
