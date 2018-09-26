package com.collection.interfaces.set;

import java.util.*;

public class TreeSetExample {


    public static void main(String[] args) {
        TreeSet<String> linkedList = new TreeSet<String>();
        linkedList.add("umesh");
        linkedList.add("is");
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
