package com.forfun.calc;

public class Result {
    private static NumbersDAO numbersDAO = new NumbersDAO();

    public static void clearNumber(){
        numbersDAO = new NumbersDAO();
    }

    public static String getResult() {
        return makeResult(numbersDAO.getActions());
    }

    private static String makeResult(ActionsWithNumbers actions) {
        numbersDAO.setFirstNumber(numbersDAO.getSecondNumber());
        numbersDAO.setSecondNumber(NumberHolder.getNumberInString().toString());
        switch (actions) {
            case PLUS -> {
                numbersDAO.setEquals(
                            deletePointAndNul(
                                    String.valueOf(Double.parseDouble(numbersDAO.getFirstNumber()) + Double.parseDouble(numbersDAO.getSecondNumber()))));
                NumberHolder.setNumberInString((numbersDAO.getEquals()));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString().toString();
            }
            case MINUS -> {
                numbersDAO.setEquals(
                        deletePointAndNul(
                                String.valueOf(Double.parseDouble(numbersDAO.getFirstNumber()) - Double.parseDouble(numbersDAO.getSecondNumber()))));
                NumberHolder.setNumberInString((numbersDAO.getEquals()));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString().toString();
            }
            case DIVISION -> {
                double firstNum = Double.parseDouble(numbersDAO.getFirstNumber());
                if (firstNum != 0.) {
                    numbersDAO.setEquals(
                            deletePointAndNul(
                                    String.valueOf(Double.parseDouble(numbersDAO.getFirstNumber()) / Double.parseDouble(numbersDAO.getSecondNumber()))));
                    NumberHolder.setNumberInString((numbersDAO.getEquals()));
                    System.out.println(numbersDAO.toString());
                    return NumberHolder.getNumberInString().toString();
                }
                numbersDAO.setEquals("0");
                NumberHolder.setNumberInString((numbersDAO.getEquals()));
                System.out.println(numbersDAO.toString());
                return "0";
            }
            case MULTIPLICATION -> {
                numbersDAO.setEquals(
                        deletePointAndNul(
                                String.valueOf(Double.parseDouble(numbersDAO.getFirstNumber()) * Double.parseDouble(numbersDAO.getSecondNumber()))));
                NumberHolder.setNumberInString((numbersDAO.getEquals()));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString().toString();
            }
        }
        return "0";
    }

    private static String deletePointAndNul(String numberBeforeCleaned) {
        if (numberBeforeCleaned.contains(".0") && numberBeforeCleaned.length() - numberBeforeCleaned.indexOf('.') == 2) {
            return numberBeforeCleaned.substring(0, numberBeforeCleaned.indexOf('.'));
        }
        return null;
    }

    public static String doWhenActionButtonPressed(ActionsWithNumbers actions) {
        switch (actions) {
            case PLUS, MINUS, DIVISION, MULTIPLICATION -> {
                numbersDAO.setActions(actions);
                numbersDAO.setFirstNumber(numbersDAO.getSecondNumber());
                numbersDAO.setSecondNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                System.out.println(numbersDAO.toString());
                return numbersDAO.getSecondNumber();
            }
        }
        return "0";
    }
}