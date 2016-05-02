package chess.models;

public class Cell {

    public String x;
    public int y;
    public boolean inUse;

    public Cell(String x, int y, boolean inUse) {
        this.x = x;
        this.y = y;
        this.inUse = inUse;
    }

    public String getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean getinUse() {
        return this.inUse;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

}
