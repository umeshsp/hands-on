package com.algorithm.problems;

import java.util.HashMap;
import java.util.Map;

/*Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B*/
public class BuddyStrings {

    private boolean buddyStrings(String A, String B) {

        char[] arrayA = A.toCharArray();
        char[] arrayB = B.toCharArray();
        int mismatchCount = 0;
        if (arrayA.length != arrayB.length)
            return false;

        Map<String, Integer> mapA = new HashMap<String, Integer>();
        Map<String, Integer> mapB = new HashMap<String, Integer>();
        boolean sameString = true;
        for (int i = 0; i < arrayA.length; i++) {
            if (mapA.containsKey(Character.toString(arrayA[i]))) {
                mapA.put(Character.toString(arrayA[i]), mapA.get(Character.toString(arrayA[i])) + 1);
            } else {
                mapA.put(Character.toString(arrayA[i]), 1);
            }

            if (mapB.containsKey(Character.toString(arrayB[i]))) {
                mapB.put(Character.toString(arrayB[i]), mapB.get(Character.toString(arrayB[i])) + 1);
            } else {
                mapB.put(Character.toString(arrayB[i]), 1);
            }
            if (arrayA[i] != arrayB[i]) {
                mismatchCount++;
                sameString = false;
            }
        }

        for (Map.Entry m : mapA.entrySet()) {
            if (mapB.get(m.getKey()) != m.getValue()) {
                return false;
            }
        }

        if (mismatchCount > 2 || arrayA.length == 1 || arrayB.length == 1)
            return false;
        else if (sameString && (mapB.size() == 1 && mapA.size() == 1))
            return false;
        else return true;
    }

    public static void main(String[] args) {

        BuddyStrings n = new BuddyStrings();
        boolean s = n.buddyStrings("ab", "ba");
        System.out.println(s);
    }
}
