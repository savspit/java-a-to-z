package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {

    public static void main(String[] args) {

        ChessBoard chessboard = new ChessBoard();

        new StartUI().init(chessboard);

    }

    public void init(ChessBoard chessboard) {

        chessboard.fill();

        Cell cell = new Cell();

        chessboard.update(cell);

    }

}
