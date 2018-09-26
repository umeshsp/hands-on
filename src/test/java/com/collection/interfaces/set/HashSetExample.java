package com.collection.interfaces.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {


    public static void main(String[] args) {
        HashSet<String> linkedList = new HashSet<String>();
        linkedList.add("umesh");
        linkedList.add("is");

        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String str:linkedList
                ) {
            System.out.println(str);

        }
        System.out.println(linkedList);
    }
}
