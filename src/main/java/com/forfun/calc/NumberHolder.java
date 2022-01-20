package com.forfun.calc;

public class NumberHolder {
    private static StringBuilder numberInString = new StringBuilder("0");
    private static boolean isMinus = false;
    private static final short totalDigits = 8;
    private static final short totalDigitsWithMinus = 9;
    private static final short totalSymbolsWithMinusAndComa = 10;

    public static StringBuilder getNumberInString()
    {
        return numberInString;
    }

    public static boolean isComaPresentInSequence()
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
        }
        return false;
    }

    private static boolean isZeroAfterMinus(){
        if (!numberInString.isEmpty()){
            return isMinus && numberInString.charAt(1) == '0';
        }
        return false;
    }

    private static void makeZero(){
        numberInString = new StringBuilder("0");
    }

    public static StringBuilder addNumber(String n)
    {
        int lengthOfNumber = numberInString.length();
        if (
                (lengthOfNumber <= totalSymbolsWithMinusAndComa && isMinus && isComaPresentInSequence()) ||
                (lengthOfNumber <= totalDigitsWithMinus && isMinus && !isComaPresentInSequence()) ||
                (lengthOfNumber <= totalDigitsWithMinus && !isMinus && isComaPresentInSequence()) ||
                (lengthOfNumber <= totalDigits && !isMinus && !isComaPresentInSequence())
        ) {
            switch (n) {
                case (",") -> {
                    if (!isComaPresentInSequence()) {
                        numberInString.append(n);
                    }
                }
                case ("0") -> {
                    if (!isZeroAtFirstPlace() || !isZeroAfterMinus()) {
                        numberInString.append(n);
                    }
                }
                default -> {
                    numberInString.append(n);
                }
            }
            if (isZeroAtFirstPlace() && !isComaPresentInSequence() && !isMinus) {
                numberInString.deleteCharAt(0);
            }

            if (isZeroAfterMinus() && !isComaPresentInSequence()) {
                numberInString.deleteCharAt(1);
            }
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
        makeZero();
        isMinus = false;
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
        if (numberInString.length() >= 2)
        {
            int indexOfDeletingSymbol = numberInString.toString().length() - 1;
            numberInString.deleteCharAt(indexOfDeletingSymbol);
        }
        return numberInString.toString();
    }
}
