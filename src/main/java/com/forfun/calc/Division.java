package com.forfun.calc;

public class Division implements Action {
    private String firstNumber;
    private String nextNumber;

    public Division(String firstNumber, String nextNumber) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
    }

    public Division() {
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
