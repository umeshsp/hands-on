package com.staticexample;

import org.junit.Test;

public class StaticVariable {
    public static int staticCount = 0;
    public int nonStaticCount = 0;

    public void check() {
        staticCount++;
        nonStaticCount++;
        System.out.println("staticCount " + staticCount);
        System.out.println("nonStaticCount " + nonStaticCount);
        StaticVariable StaticVariable = new StaticVariable();
        StaticVariable.testt();
        StaticVariable.nonStaticCount++;
    }

    @Test (expected = NullPointerException.class)
    public void testt(){

        throw new NullPointerException();
    }
}
