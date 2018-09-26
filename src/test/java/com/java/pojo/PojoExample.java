package com.java.pojo;

public class PojoExample {

    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo(1);
        student.setName("22");

        Student student2 = new Student();
        student2.setRollNo(1);
        student2.setName("22");

        System.out.println(student2.equals(student));
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student==student2);
    }


}
