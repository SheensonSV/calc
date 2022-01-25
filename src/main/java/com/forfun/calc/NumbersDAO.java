package com.forfun.calc;

public class NumbersDAO implements Action {
    private String firstNumber;
    private String secondNumber;
    private String equals;
    private ActionsWithNumbers actions;

    public NumbersDAO(String firstNumber, String secondNumber, String equals, ActionsWithNumbers actions) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
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

    public NumbersDAO(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "NumbersDAO{" +
                "firstNumber= '" + firstNumber + '\'' + " " +
                actions +
                ", nextNumber= '" + secondNumber + '\'' +
                '}';
    }
}
