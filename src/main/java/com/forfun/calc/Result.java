package com.forfun.calc;

public class Result {
    private static Summing summing = new Summing();
    private static Minusing minusing = new Minusing();
    private static Multiply multiply = new Multiply();
    private static Division division = new Division();

    public static String getResult(){
        return null;
    }

    private static String makeResult(Action action){
        action.getFirstNumber();

        return "0";
    }

    public static String act(ActionsWithNumbers actions){
        switch (actions){
            case PLUS -> {
                summing.setFirstNumber(NumberHolder.getNumberInString().toString());
                makeResult(summing);
                return "0";
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
