package com.algorithm.problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String args []){
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("You entered "+ number);
        boolean isPrime = true;
        if (number == 0 || number ==1){
            System.out.println("Number is not prime");
            break;
        }
        for(int i = 2; i< Math.sqrt(number); i++){
            if ((number % i) == 0){
                System.out.println("Number is not prime");
                isPrime = false;
            break;
            }
        }
        if(isPrime)
            System.out.println("Number is prime");
    }}
}
