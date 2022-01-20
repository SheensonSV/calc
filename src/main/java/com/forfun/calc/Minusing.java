package com.forfun.calc;

public class Minusing implements Action {
    private String firstNumber;
    private String nextNumber;

    public Minusing(String firstNumber, String nextNumber) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
    }

    public Minusing() {
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
