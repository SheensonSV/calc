package com.forfun.calc;

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

    public static String makeNegativeOrPositiveNumber(){
        if (!numberInString.isEmpty()){
            if (isMinus){
                isMinus = false;
                if (numberInString.toString().charAt(0) == '-')
                {
                    numberInString.deleteCharAt(0);
                }
            }
            else {
                isMinus = true;
                numberInString.insert(0, "-");
            }
        }
        return numberInString.toString();
    }

    public static String getNumberInString() {
        if (numberInString.isEmpty())
        {
            return "0";
        }
        return numberInString.toString();
    }

    public static String clear() {
        numberInString = null;
        numberInString = new StringBuilder("");
        return numberInString.toString();
    }

    public static String backSpace() {
        if (!numberInString.isEmpty() && !numberInString.toString().equals("0"))
        {
            int lengthOfNumberString = numberInString.toString().length();
            numberInString.deleteCharAt(lengthOfNumberString - 1);
        }
        if (numberInString.isEmpty() || ( numberInString.toString().length() == 1 && numberInString.charAt(0) == '-')) {
            numberInString = null;
            numberInString = new StringBuilder("");
        }
        return numberInString.toString();
    }
}
