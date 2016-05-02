package chess.models;

// ладья
public class Rook extends Figure {

    public Rook (String name, Cell cell, Colour colour) {

        super(name, cell, colour);

    }

    public Cell getCell() {
        return this.cell;
    }

    public void go(Cell cell) {

        this.cell.setInUse(false);

        this.cell = cell;

    }
}
