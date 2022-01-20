package com.forfun.calc;

public class Multiply implements Action {
    private String firstNumber;
    private String nextNumber;

    public Multiply(String firstNumber, String nextNumber) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
    }

    public Multiply() {
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(String nextNumber) {
        this.nextNumber = nextNumber;
    }
}
