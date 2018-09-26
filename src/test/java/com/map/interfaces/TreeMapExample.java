package com.map.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]) {
        SortedMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(104, "Vijay");
        map.put(102, "Rahul");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
