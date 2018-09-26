package com.collection.interfaces.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("umesh");
        linkedList.add("is");
        linkedList.addFirst("first");
        linkedList.remove();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

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
