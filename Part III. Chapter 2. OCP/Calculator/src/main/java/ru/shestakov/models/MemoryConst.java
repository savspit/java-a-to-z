package ru.shestakov.models;

public enum MemoryConst {
    CONSTANT (0);
    private final double constant;

    MemoryConst(double constant) {
        this.constant = constant;
    }

    public double constant() {
        return constant;
    }
}

