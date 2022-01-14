package com.forfun.calc;

public class NumberHolder {
    private static StringBuilder numberInString;
    private static long numberLong;
    private static double numberDouble;
    private static Boolean isMinus = false;
    private static boolean isComa;
    private static final short totalDigits = 8;

    public static void addNumber(String n)
    {

    }

    void isWasPressedMinus(){
        if (!numberInString.isEmpty()){
            if (isMinus){
                isMinus = false;
            }
            else isMinus = true;
            changeSignOfNumber(isMinus);
        }
    }

    void changeSignOfNumber(Boolean isMinus){
        StringBuilder minusInNumber = new StringBuilder("-");
        minusInNumber.append(numberInString);
        numberInString = minusInNumber;
    }


    public static String getNumberInString() {
        if (numberInString.isEmpty())
        {
            return "0";
        }
        return numberInString.toString();
    }

}
