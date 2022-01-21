package com.forfun.calc;

public class StringToDoubleConverter {
    private String inputString;

    public StringToDoubleConverter(String inputString) {
        this.inputString = inputString;
    }

    public Double getConverted(){

        return Double.parseDouble(inputString);
    }

    public String getInputString() {
        return inputString;
    }
}
