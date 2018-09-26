package com.test;

import com.staticexample.StaticVariable;

public class StaticMain {
    public static void main(String[] args) {
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        StaticVariable staticVariable3 = new StaticVariable();
        staticVariable1.check();
        staticVariable2.check();
        staticVariable3.check();
    }
}