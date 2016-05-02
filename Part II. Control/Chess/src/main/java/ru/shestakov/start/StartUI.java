package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {

    public static void main(String[] args) {

        ChessBoard chessboard = new ChessBoard();

        chessboard.fill();

        Cell cell1 = new Cell("d", 2, true);
        Figure figure = chessboard.findByCell(cell1);

        Cell cell2 = new Cell("d", 3, true);

        cell1.setInUse(false);
        figure.setCell(cell2);

    }

}
