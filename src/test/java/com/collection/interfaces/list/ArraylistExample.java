package com.collection.interfaces.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {


    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        integers.add(11);
        integers.add(22);
        integers.add(2);
        integers.add(33);
        integers.add(33);
        integers.toArray();

        Iterator it = integers.iterator();
        while(it.hasNext()){
            System.out.println("Integer " + it.next());
        }
        integers.remove(Integer.valueOf(2));
        it = integers.iterator();
        while(it.hasNext()){
            System.out.println("Integer " + it.next());
        }
        System.out.println("Array length " + arraylist.size());
        arraylist.add("umesh");
        System.out.println("Array length " + arraylist.size());
        arraylist.add("is");
        System.out.println("Array length " + arraylist.size());
        arraylist.remove("is");
        arraylist.remove(0);
        System.out.println("Array length " + arraylist.size());
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        Iterator its = arraylist.iterator();

        while (its.hasNext()){
            System.out.println(its.next());
        }
      //  System.out.println(arraylist);
    }
}
