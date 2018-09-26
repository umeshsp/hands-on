package com.java.pojo;

import java.util.Objects;

public class Student extends Object{
    private int rollNo;
    private String name;


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                name == student.name;
    }

   /* @Override
    public int hashCode() {

        return rollNo * Integer.parseInt(name);
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void doSomething() {
        int roll = getRollNo();
        String name = getName();
    }
}
