package com.algorithm.problems;

public class LargestPalindrome {
    public static int largestPalindrome(int n) {
        String number = "";
        int biggest = 0;
        while (n > 0) {
            number = number + 9;
            n--;
        }
        int integerArray = Integer.parseInt(number);
        for (int i = integerArray; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                boolean pal = checkPalindrome(i * j, i, j);
                if (pal) {
                    if (biggest < i * j) {
                        biggest = i * j;
                    }
                }
            }
        }
        return biggest % 1337;
    }

    public static boolean checkPalindrome(int n, int ig, int js) {

        char[] array = Integer.toString(n).toCharArray();
        int last = array.length - 1;
        for (int i = 0; i < array.length - 1; i++, last--) {
            if ((array[i]) != array[last]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(largestPalindrome(4));
    }

}
