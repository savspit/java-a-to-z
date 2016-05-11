package ru.shestakov.start;

import ru.shestakov.models.*;

import java.math.*;

public class Calculator {

    private double result = 0;
    private double memoryConst = MemoryConst.CONSTANT.constant();
    private double tempMemoryConst = TempMemoryConst.CONSTANT.constant();

    public void setMemoryConst() {
        this.memoryConst = this.tempMemoryConst;
    }

    public void setTempMemoryConst() {
        this.tempMemoryConst = this.memoryConst;
    }

    public double getMemoryConst() {
        return this.memoryConst;
    }

    public void addTheNumber(double value) {
        this.tempMemoryConst = value;
    }

    public void addiction(double value) {
        this.result = this.tempMemoryConst + value;
        this.tempMemoryConst = this.result;
        System.out.println("Addiction: " + this.result);
    }

    public void substraction(double value) {
        this.result = this.tempMemoryConst - value;
        this.tempMemoryConst = this.result;
        System.out.println("Substraction: " + this.result);
    }

    public void multiplication(double value) {
        this.result = this.tempMemoryConst * value;
        this.tempMemoryConst = this.result;
        System.out.println("Multiplication: " + this.result);
    }

    public void division(double value) {
        this.result = this.tempMemoryConst / value;
        this.tempMemoryConst = this.result;
        System.out.println("Division: " + this.result);
    }

    public void sinus(double value) {
        this.result = Math.sin(value);
        this.tempMemoryConst = this.result;
        System.out.println("Sinus: " + this.result);
    }

    public void cosinus(double value) {
        this.result = Math.cos(value);
        this.tempMemoryConst = this.result;
        System.out.println("Cosinus: " + this.result);
    }

    public void tangens(double value) {
        this.result = Math.tan(value);
        this.tempMemoryConst = this.result;
        System.out.println("Tangens: " + this.result);
    }

}
