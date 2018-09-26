package com.arrays;

public class CharacterArrays {
    public static void main(String args[]) {
        char[] arr1 = new char[6];
        System.out.println("arr1.length " + arr1.length);
        char[] arr2 = null;// this will throw error
        char[] arr3 = {'v', 'w', 'x'};

        System.out.println("arr3.length " + arr3.length);
        for (int i = 0; i < 6; i++) {

            arr1[i] = 'u';
            // arr2[i] = 89;
        }
        for (int i = 0; i < 3; i++) {

            System.out.println("arr1[i] " + arr1[i]);
            //System.out.println("arr2[i] " + arr2[i]);
            System.out.println("arr3[i] " + arr3[i]);
        }
    }
}
