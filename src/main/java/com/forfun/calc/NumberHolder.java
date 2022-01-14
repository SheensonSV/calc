package com.forfun.calc;

import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class NumberHolder {
    private static StringBuilder numberInString = new StringBuilder();
    private static long numberLong;
    private static double numberDouble;
    private static Boolean isMinus = false;
    private static boolean isComa;
    private static final short totalDigits = 8;
    private static ButtonController buttonController = new ButtonController();

    public static StringBuilder addNumber(String n)
    {
        numberInString.append(n);
        return numberInString;
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
