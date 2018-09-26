package com.algorithm.problems;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string");
            String string = scanner.nextLine();
            char[] charArray = string.toCharArray();
            //char[] tempCharArray = new char[10];
            // String tempstring = null;
            int length = charArray.length - 1;
            System.out.println("Char length " + length);
            int index = 0;
            for (int i = length; i >= 0; i--) {
                System.out.print(charArray[i]);
            }

           /* if (tempstring.equalsIgnoreCase(string)) {
                System.out.println("com.algorithm.problems.PalindromeStringBuilder");
            } else {
                System.out.println("Not a com.algorithm.problems.PalindromeStringBuilder");
            }*/
        }
    }
}
