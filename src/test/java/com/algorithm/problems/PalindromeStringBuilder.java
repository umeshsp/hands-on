package com.algorithm.problems;

import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String args[]) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string");
            StringBuilder string = new StringBuilder(scanner.nextLine());
            String tempstring = string.toString();
            // StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
            System.out.println("Reversed String is " + string.reverse());
            // System.out.println(stringBuffer.reverse());
            if (tempstring.equalsIgnoreCase(string.toString())) {
                System.out.println("com.algorithm.problems.PalindromeStringBuilder");
            } else {
                System.out.println("Not a com.algorithm.problems.PalindromeStringBuilder");
            }
        }
    }
}
