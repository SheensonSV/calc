package com.forfun.calc;

public class Result {
    public static String getResult(){
        return null;
    }

    public static String act(ActionsWithNumbers actions){
        switch (actions){
            case PLUS -> {
                Summing summing = new Summing();
                return ActionsWithNumbers.PLUS.name();
            }
            case MINUS -> {
                return ActionsWithNumbers.MINUS.name();
            }
            case DIVISION -> {
                return ActionsWithNumbers.DIVISION.name();
            }
            case MULTIPLICATION -> {
                return ActionsWithNumbers.MULTIPLICATION.name();
            }
            default -> {}
        }
        return null;
    }

    private void makeSumm(Action action){

    }
}
