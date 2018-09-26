package com.test;

import org.junit.Test;

import java.util.HashMap;

public class hacker {
    // Complete the firstRepeatedWord function below.
    static String firstRepeatedWord(String s) {
        System.out.println("Input string is "+ s);
        String delimiter = null;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                delimiter = "\\s";
                break;
            } else if (chars[i] == ';') {
                delimiter = ";";
                break;
            } else if (chars[i] == '\t') {
                delimiter = "\\t";
                break;
            } else if (chars[i] == ',') {
                delimiter = ",";
                break;
            } else if (chars[i] == ':') {
                delimiter = ":";
                break;
            } else if (chars[i] == '-') {
                delimiter = "-";
                break;
            } else if (chars[i] == '.') {
                delimiter = ".";
                break;
            }
        }
        System.out.println("delim " + delimiter);
        String[] splittedSentence = s.split(delimiter);
        HashMap<String, String> map = new HashMap<String, String>();
        for (String splittedWords : splittedSentence) {
            System.out.println("Split words:" + splittedWords);
            if (map.containsKey(splittedWords)) {
                return splittedWords;
            } else {
                if(splittedWords != " ")
                map.put(splittedWords, "null");
            }
        }
        return "0";
    }
}
