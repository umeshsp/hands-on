package com.collection.interfaces.list;

import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {


    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("umesh");
        vector.add("is");
        vector.add("is");
        vector.add("is");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        System.out.println(vector);
    }
}
