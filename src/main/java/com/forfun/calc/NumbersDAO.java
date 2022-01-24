package com.forfun.calc;

public class NumbersDAO implements Action {
    private String firstNumber;
    private String nextNumber;
    private String equals;
    private ActionsWithNumbers actions;


    public NumbersDAO(String firstNumber, String nextNumber, String equals, ActionsWithNumbers actions) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
        this.equals = equals;
        this.actions = actions;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public ActionsWithNumbers getActions() {
        return actions;
    }

    public void setActions(ActionsWithNumbers actions) {
        this.actions = actions;
    }

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
                "firstNumber= '" + firstNumber + '\'' + " " +
                actions +
                ", nextNumber= '" + nextNumber + '\'' +
                '}';
    }
}
