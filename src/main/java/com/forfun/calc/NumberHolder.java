package com.forfun.calc;

public class NumberHolder {
    private static StringBuilder numberInString = new StringBuilder("0");
    private static long numberLong;
    private static double numberDouble;
    private static boolean isMinus = false;
    private static boolean isComa = false;
    private static final short totalDigits = 8;
    private static final short totalDigitsWithMinus = 9;
    private static final short totalSymbolsWithMinusAndComa = 10;

    private static boolean isComaPresentInSequence()
    {
        if (!numberInString.isEmpty())
        {
            for (int i = 0; i < numberInString.length(); i++)
            {
                if (numberInString.charAt(i) == ',')
                {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isZeroAtFirstPlace()
    {
        if (!numberInString.isEmpty())
        {
            if (numberInString.charAt(0) == '0') {
                return true;
            }
            return isMinus && numberInString.charAt(1) == '0';
        }
        return false;
    }

    private static void makeZero(){
        numberInString = new StringBuilder("0");
    }

    public static StringBuilder addNumber(String n)
    {
        switch (n){
            case(",") -> {
                if (!isComaPresentInSequence()){
                    numberInString.append(n);
                }
            }
            case("0") -> {
                if (!isZeroAtFirstPlace()){
                    numberInString.append(n);
                }
            }
            default -> {
                numberInString.append(n);
            }
        }
        if (isZeroAtFirstPlace() && !isComaPresentInSequence() && !isMinus)
        {
            numberInString.deleteCharAt(0);
        }
        if (isZeroAtFirstPlace() && !isComaPresentInSequence() && isMinus)
        {
            numberInString.deleteCharAt(1);
        }
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

    public static String clear() {
        numberInString = null;
        makeZero();
        isComa = false;
        return numberInString.toString();
    }

    public static String backSpace() {
        if (numberInString.length() == 1)
        {
            makeZero();
            isMinus = false;
        }
        if (numberInString.length() == 2 && isMinus)
        {
            makeZero();
            isMinus = false;
        }
        if (numberInString.length() == 2 && isComaPresentInSequence())
        {
            makeZero();
            isMinus = false;
        }

        if (numberInString.length() > 2)
        {
            int indexOfDeletingSymbol = numberInString.toString().length() - 1;
            numberInString.deleteCharAt(indexOfDeletingSymbol);
        }

//        if (numberInString.isEmpty() || ( numberInString.toString().length() == 1 && numberInString.charAt(0) == '-')) {
//            numberInString = null;
//            numberInString = new StringBuilder("");
//            isMinus = false;
//        }
        return numberInString.toString();
    }
}
