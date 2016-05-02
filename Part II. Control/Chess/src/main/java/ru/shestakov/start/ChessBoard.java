package ru.shestakov.start;

import ru.shestakov.models.*;

public class ChessBoard {

    private Cell[] cells = new Cell[64];
    private Figure[] figures = new Figure[32];
    String[] elementsX = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
    int[] elementsY = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    private int positionCells = 0;
    private int positionFigures = 0;

    public void fill() {

        addCells();
        addFigures();

    }

    public Figure findByCell(Cell cell) {

        Figure result = null;
        for(Figure figure : figures) {
            if(figure.getCell().getX().equals(cell.getX()) && figure.getCell().getY() == cell.getY()) {
                result = figure;
                break;
            }
        }
        return result;
    }

    public void addCells() {

        for (int x = 0; x < 8; x++) {

            for (int y = 0; y < 8; y++) {

                Cell cell = new Cell(elementsX[x], elementsY[y], false);
                this.cells[positionCells++] = cell;

            }

        }

    }

    public void addFigures() {

        Colour black = new Colour("black");
        Colour white = new Colour("white");

        for (int z = 0; z <= cells.length-1; z++) {

            if ((cells[z].getX().equals("a") || cells[z].getX().equals("h")) && (cells[z].getY() == 1 || cells[z].getY() == 8)) {
                // ладья
                cells[z].setInUse(true);
                Rook rook = new Rook("Ладья", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = rook;
            }

            if ((cells[z].getX().equals("b") || cells[z].getX().equals("g")) && (cells[z].getY() == 1 || cells[z].getY() == 8)) {
                // конь
                cells[z].setInUse(true);
                Knight knight = new Knight("Конь", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = knight;
            }

            if ((cells[z].getX().equals("c") || cells[z].getX().equals("f")) && (cells[z].getY() == 1 || cells[z].getY() == 8)) {
                // слон
                cells[z].setInUse(true);
                Bishop bishop = new Bishop("Слон", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = bishop;
            }

            if (cells[z].getX().equals("d") && (cells[z].getY() == 1 || cells[z].getY() == 8)) {
                // ферзь
                cells[z].setInUse(true);
                Queen queen = new Queen("Ферзь", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = queen;
            }

            if (cells[z].getX().equals("e") && (cells[z].getY() == 1 || cells[z].getY() == 8)) {
                // король
                cells[z].setInUse(true);
                King king = new King("Король", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = king;
            }

            if (cells[z].getY() == 2 || cells[z].getY() == 7) {
                // пешка
                cells[z].setInUse(true);
                Pawn pawn = new Pawn("Пешка", cells[z], cells[z].getY()<=2 ? white : black);
                this.figures[positionFigures++] = pawn;
            }

        }

     }

    public void print() {
        for (Cell cell : cells) {
            if (cell.getinUse()) {
                for (Figure figure : figures) {
                    if(figure.getCell().getX().equals(cell.getX()) && figure.getCell().getY() == cell.getY()) {
                        System.out.println("x: " + cell.getX() + ", y: " + cell.getY() + ", inUse: " + figure.getName());
                    }
                }
            } else {
                System.out.println("x: " + cell.getX() + ", y: " + cell.getY() + ", NotinUse");
            }

        }
    }


}
