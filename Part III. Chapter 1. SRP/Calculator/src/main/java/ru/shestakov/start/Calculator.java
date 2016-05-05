package ru.shestakov.start;

public class Calculator {

    private double result = 0;
    private static double MEMORY_CONST = 0;
    private static double TEMP_MEMORY_CONST = 0;

    public void setMemoryConst() {
        this.MEMORY_CONST = this.TEMP_MEMORY_CONST;
    }

    public void setTempMemoryConst() {
        this.TEMP_MEMORY_CONST = this.MEMORY_CONST;
    }

    public double getMemoryConst() {
        return this.MEMORY_CONST;
    }

    public void addTheNumber(double value) {
        this.TEMP_MEMORY_CONST = value;
    }

    public void addiction(double value) {
        this.result = this.TEMP_MEMORY_CONST + value;
        this.TEMP_MEMORY_CONST = this.result;
        System.out.println("Addiction: " + this.result);
    }

    public void substraction(double value) {
        this.result = this.TEMP_MEMORY_CONST - value;
        this.TEMP_MEMORY_CONST = this.result;
        System.out.println("Substraction: " + this.result);
    }

    public void multiplication(double value) {
        this.result = this.TEMP_MEMORY_CONST * value;
        this.TEMP_MEMORY_CONST = this.result;
        System.out.println("Multiplication: " + this.result);
    }

    public void division(double value) {
        this.result = this.TEMP_MEMORY_CONST / value;
        this.TEMP_MEMORY_CONST = this.result;
        System.out.println("Division: " + this.result);
    }

}
