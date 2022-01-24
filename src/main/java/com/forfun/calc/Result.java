package com.forfun.calc;

public class Result {
    private static NumbersDAO numbersDAO = new NumbersDAO();
    public static ActionsWithNumbers currentAction;
    public static boolean isPressedEquals = false;

    public static void clearNumber(){
        numbersDAO = new NumbersDAO();
    }

    public static StringBuilder getResult() {
        isPressedEquals = true;
        return makeResult(currentAction);
    }

    private static StringBuilder makeResult(ActionsWithNumbers actions) {
        double result;
        switch (actions) {
            case PLUS -> {
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) + Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(clearPointWithZero(result));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString();
            }
            case MINUS -> {
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) - Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(clearPointWithZero(result));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString();
            }
            case DIVISION -> {
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                double firstNum = Double.parseDouble(numbersDAO.getFirstNumber());
                if (firstNum != 0.) {
                    numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                    result = Double.parseDouble(numbersDAO.getFirstNumber()) / Double.parseDouble(numbersDAO.getNextNumber());
                    NumberHolder.setNumberInString(clearPointWithZero(result));
                    System.out.println(numbersDAO.toString());
                    return NumberHolder.getNumberInString();
                }
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                System.out.println(numbersDAO.toString());
                return new StringBuilder("0");
            }
            case MULTIPLICATION -> {
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) * Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(clearPointWithZero(result));
                System.out.println(numbersDAO.toString());
                return NumberHolder.getNumberInString();
            }
            default -> {}
        }
        return new StringBuilder("0");
    }

    private static String clearPointWithZero(double numberBeforeCleaned) {
        String number = String.valueOf(numberBeforeCleaned);
        if (number.contains(".0") && number.length() - number.indexOf('.') == 2) {
            return number.substring(0, number.indexOf('.'));
        }
        return null;
    }

    public static String act(ActionsWithNumbers actions) {
        switch (actions) {
            case PLUS -> {
                currentAction = ActionsWithNumbers.PLUS;
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                System.out.println(numbersDAO.toString());
                return numbersDAO.getNextNumber();
            }
            case MINUS -> {
                currentAction = ActionsWithNumbers.MINUS;
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                System.out.println(numbersDAO.toString());
                return numbersDAO.getNextNumber();
            }
            case DIVISION -> {
                currentAction = ActionsWithNumbers.DIVISION;
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                System.out.println(numbersDAO.toString());
                return numbersDAO.getNextNumber();
            }
            case MULTIPLICATION -> {
                currentAction = ActionsWithNumbers.MULTIPLICATION;
                numbersDAO.setFirstNumber(numbersDAO.getNextNumber());
                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                System.out.println(numbersDAO.toString());
                return numbersDAO.getNextNumber();
            }
            default -> {}
        }
        return null;
    }
}