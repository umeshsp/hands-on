package com.collection.interfaces.set;

import java.util.*;

public class LinkedHashSetExample {


    public static void main(String[] args) {
        LinkedHashSet<String> linkedList = new LinkedHashSet<String>();
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
