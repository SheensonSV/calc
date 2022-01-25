package com.forfun.calc;

public class Memo {
    private static String memo;

    public static String getMemo() {
        return memo;
    }

    public static void memoPlus(){
        memo = NumberHolder.getNumberInString().toString();
    }

    public static String memoRepeat() {
        NumberHolder.setNumberInString(memo);
        if (!memo.equals(""))
        {
            memo = "";
            return NumberHolder.getNumberInString().toString();
        }
        else return "0";
    }
}
