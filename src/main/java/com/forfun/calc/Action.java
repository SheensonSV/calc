package com.forfun.calc;

public interface Action {
    String getFirstNumber();
    String getSecondNumber();
    default void toInterpret() {}
}
