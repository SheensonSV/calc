package com.forfun.calc;

public interface Action {
    String getFirstNumber();
    String getNextNumber();
    default void toInterpret() {}
}
