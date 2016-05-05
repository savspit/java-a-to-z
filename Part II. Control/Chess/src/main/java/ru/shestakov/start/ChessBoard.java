package ru.shestakov.start;

import ru.shestakov.models.*;

public class ChessBoard {

    private Cell[] cells = new Cell[64];
    private Figure[] figures = new Figure[32];

    public void fill() {

        addCells();
        addFigures();

    }

    public void addCells() {

        for (int x = 0; x < cells.length; x++) {

            cells[x] = new Cell();

        }

    }

    public void addFigures() {

        for (int x = 0; x < figures.length; x++) {

            figures[x] = new Figure();

        }

    }

    public void update(Cell cell) {

        for (int x = 0; x < cells.length; x++) {

            if (cells[x].equals(cell)) {

                cells[x].setInUse(true);

            }

        }

    }



}
