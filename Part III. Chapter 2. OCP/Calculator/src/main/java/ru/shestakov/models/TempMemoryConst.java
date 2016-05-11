package ru.shestakov.models;

public enum TempMemoryConst {
    CONSTANT (0);
    private final double constant;

    TempMemoryConst(double constant) {
        this.constant = constant;
    }

    public double constant() {
        return constant;
    }
}

