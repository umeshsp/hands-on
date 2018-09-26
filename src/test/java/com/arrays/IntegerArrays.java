package com.arrays;

public class IntegerArrays {
    public static void main(String args[]) {
        int[] arr1 = new int[6];
        System.out.println("arr1.length " + arr1.length);
        int[] arr2 = null;// this will throw error
        int[] arr3 = {1, 2, 3};
        System.out.println("arr3.length " + arr3.length);
        for (int i = 0; i < 6; i++) {

            arr1[i] = 99;
            // arr2[i] = 89;
        }
        for (int i = 0; i < 3; i++) {

            System.out.println("arr1[i] " + arr1[i]);
            //System.out.println("arr2[i] " + arr2[i]);
            System.out.println("arr3[i] " + arr3[i]);
        }
        //arr3[1]= arr3.;
        for (int i = 0; i < 3; i++) {

            System.out.println("arr1[i] " + arr1[i]);
            //System.out.println("arr2[i] " + arr2[i]);
            System.out.println("arr3[i] " + arr3[i]);
        }
    }
}
