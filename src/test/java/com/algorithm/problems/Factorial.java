package com.algorithm.problems;

import java.util.Scanner;

public class Factorial {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            System.out.println("You entered " + number);
            System.out.println("com.algorithm.problems.Factorial of number " + number + " is " + findFact(number));
        }

    }
        public static int findFact (int number){
        if (number == 0 || number == 1)
            return 1;
        int factorial = number * findFact(number-1);
        return factorial;
        }
}
