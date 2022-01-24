package com.forfun.calc;

public class Memo {
    private static String memo;

    public static String getMemo() {
        return memo;
    }

    public static void memoPlus(){
        memo = NumberHolder.getNumberInString().toString();
    }

}
