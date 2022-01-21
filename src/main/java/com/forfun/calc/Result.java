package com.forfun.calc;

public class Result {
    private static NumbersDAO numbersDAO = new NumbersDAO();
    private static ActionsWithNumbers currentAction;

    public static Double getResult(){
        numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
        return makeResult(currentAction);
    }

    private static Double makeResult(ActionsWithNumbers actions){
        Double result;
        switch (actions){
            case PLUS -> {
//                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) + Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(result.toString());
                return result;
            }
            case MINUS -> {
//                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) - Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(result.toString());
                return result;
            }
            case DIVISION -> {
//                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) / Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(result.toString());
                return result;
            }
            case MULTIPLICATION -> {
//                numbersDAO.setNextNumber(NumberHolder.getNumberInString().toString());
                result = Double.parseDouble(numbersDAO.getFirstNumber()) * Double.parseDouble(numbersDAO.getNextNumber());
                NumberHolder.setNumberInString(result.toString());
                return result;
            }
            default -> {}
        }
        return 0.;
    }

    public static String act(ActionsWithNumbers actions){
        switch (actions){
            case PLUS -> {
                numbersDAO.setFirstNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                currentAction = ActionsWithNumbers.PLUS;
                return numbersDAO.getFirstNumber();
            }
            case MINUS -> {
                numbersDAO.setFirstNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                currentAction = ActionsWithNumbers.MINUS;
                return numbersDAO.getFirstNumber();
            }
            case DIVISION -> {
                numbersDAO.setFirstNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                currentAction = ActionsWithNumbers.DIVISION;
                return numbersDAO.getFirstNumber();
            }
            case MULTIPLICATION -> {
                numbersDAO.setFirstNumber(NumberHolder.getNumberInString().toString());
                NumberHolder.setNumberInString("0");
                currentAction = ActionsWithNumbers.MULTIPLICATION;
                return numbersDAO.getFirstNumber();
            }
            default -> {}
        }
        return null;
    }

}
