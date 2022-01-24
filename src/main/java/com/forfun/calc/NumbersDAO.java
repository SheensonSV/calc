package com.forfun.calc;

public class NumbersDAO implements Action {
    private String firstNumber;
    private String nextNumber;

    public NumbersDAO() {
    }

    public NumbersDAO(String firstNumber, String nextNumber) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
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

    @Override
    public String toString() {
        return "NumbersDAO{" +
                "firstNumber='" + firstNumber + '\'' +
                Result.currentAction +
                ", nextNumber='" + nextNumber + '\'' +
                '}';
    }
}
