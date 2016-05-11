package ru.shestakov.models;

public class AppleForReproduct extends Food {

    public boolean canReproduct;

    public AppleForReproduct(String name, long expaireDate) {
        super(name, expaireDate);
    }

    public boolean getCanReproduct() {
        return this.canReproduct;
    }

    public void setCanReproduct(boolean canReproduct) {
        this.canReproduct = canReproduct;
    }
}
